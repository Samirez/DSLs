package interactive.generator

import interactive.fictiondsl.Announce
import interactive.fictiondsl.End
import interactive.fictiondsl.Ending
import interactive.fictiondsl.Expression
import interactive.fictiondsl.External
import interactive.fictiondsl.Question
import interactive.fictiondsl.Scenario
import interactive.fictiondsl.Statement
import interactive.fictiondsl.Story
import interactive.fictiondsl.Target
import interactive.fictiondsl.VarDef
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class FictiondslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val story = resource.allContents.filter(Story).next
		fsa.generateFile('''interactive_fiction/«story.name»/Game.java''', generate(story, resource, fsa));
	}
	def static String generate(Story story, Resource resource, IFileSystemAccess2 fsa){
		var scenarios = resource.allContents.filter(Scenario).toList
		var start = scenarios.isEmpty() ? null : scenarios.head
		'''
			package interactive_fiction.«story.name»;
			import java.io.IOException;
			import interactive_fiction.common.*;
			public class Game {
				public Scenario start;
				
				public Game(){
					this.start = new Scenario«start.name»();
				}
				
				public void play() throws IOException {
					start.interact();
				}
			}
			«FOR scene: scenarios»
				«fsa.generateFile('''interactive_fiction/«story.name»/«scene.name».java''', generate(scene, resource))»
			«ENDFOR»
			«val external = resource.allContents.filter(External).toList.isEmpty ? null : 0»
			«IF external !==null»
			«val extern = new ArrayList<External>(resource.allContents.filter(External).toList)»
				«fsa.generateFile('''interactive_fiction/«story.name»/External.java''', generate(extern, story))»
			«ENDIF»
		'''
	
	}
	
	def static String generate(ArrayList<External> external, Story story){
		'''
			package interactive_fiction.«story.name»;
			public interface External {
			«FOR ext : external»
				«IF ext.type === 'boolean'»
					«IF ext.result === 'number'»
						public boolean «ext.name»(int param«external.indexOf(ext)»);
					«ELSEIF ext.result === 'text'»
						public boolean «ext.name»(String param«external.indexOf(ext)»);
					«ENDIF»
				«ELSEIF ext.type === 'number'»
					«IF ext.result === 'text'»
						public int «ext.name»(String param«external.indexOf(ext)»)
					«ENDIF»
				«ENDIF»
			«ENDFOR»
			}
		'''
	}
	def static String generate(Scenario scenario, Resource resource){
		var story = resource.allContents.filter(Story).head
		// var ann = resource.allContents.filter(Announce).head not valid since it can not be null
		var end = resource.allContents.filter(End).next
		var statement = resource.allContents.filter(Statement).head
		var statements = resource.allContents.filter(Statement).toList
		'''
			package interactive_fiction.«story.name»;
			
			import java.io.IOException;
			import interactive_fiction.common.*;
			class Scenario«scenario.name» extends Scenario {
				«FOR stat : statements»
					«FOR quest : stat.question»
						«IF quest.type =='number'»

							int __«quest.name»;
						«ENDIF»
						«IF quest.type == 'text'»
							String __«quest.name»;
						«ENDIF»
						«IF quest.type.toString.empty»
							String __«quest.name»;
						«ENDIF»
					«ENDFOR»
				«ENDFOR»
				«val external = resource.allContents.filter(Question).toList.isEmpty ? null : 0»
				«IF external !==null»
					«var questions = resource.allContents.filter(Question).toList»
					«FOR ext : questions»
						«IF ext.exref!==null»
							«IF ext.exref.type === 'boolean'»
								bool «ext.exref.name»;
							«ELSEIF ext.exref.type === 'number'»
								int «ext.exref.name»;
							«ELSEIF ext.exref.type === 'text'»
								String «ext.exref.name»;
							«ENDIF»
						«ENDIF»
					«ENDFOR»
				«ENDIF»
				External external;	
				Scenario«scenario.name»(External external) {
						this.external = external;
				}
				
				public ScenarioExternalHelp() {
						// TODO Auto-generated constructor stub
				}
				public String interact() throws IOException {
						nextInteraction = "«IF statement.announce.empty»«end.name»«ELSE»«statement.announce.head.name»«ENDIF»";
						«var String currentname»
					while(true){
						switch(nextInteraction){
							«FOR stat : statements»
								«FOR anno : stat.announce»
									case "«anno.name»":
										nextInteraction = "«anno.show»";
									«IF anno.ref!==null»
										System.out.println("«anno.expression.show»"+__«currentname»+"«anno.exp.show»");		
									«ELSEIF anno.exp!==null»
										System.out.println("«anno.expression.show»«currentname»«anno.exp.show»");
									«ELSE»
										System.out.println("«anno.expression.show»");
									«ENDIF»
										break;
								«ENDFOR»
								«FOR question : stat.question»
									case "«question.name»":
										System.out.println("«question.expression.show»");
									«IF question.type == 'text'»
										__«question.name» = br.readLine();
										//«currentname=question.name»
										«question.show(resource)»
									«ENDIF»
									«IF question.type =='number'»
									try {
											__«question.name» = Integer.parseInt(br.readLine());
											«question.show(resource)»
										}
											catch (Exception ex) 
										{
											break;
										}
									«ENDIF»
									«IF question.type.blank»
										__«question.name» = br.readLine();
										«question.show(resource)»
									«ENDIF»					
								«ENDFOR»
								«FOR en : stat.end»
									case "«en.name»":
									«IF en.exp!==null»
										System.out.println("«en.expression.show»"+__«currentname»+"«en.exp.show»");
									«ELSE»
										System.out.println("«en.expression.show»");
									«ENDIF»
										return "«en.name»";
								«ENDFOR»	
							«ENDFOR»
							
						}
					}
				}
			}
		'''
	}

	def static dispatch String show(Expression exp){
	
	}
	def static dispatch String show(Ending ending){
		ending.value
	}
	
	def static dispatch String show(End end){
		end.name
	}
	def static dispatch String show(Announce announce){
		announce.target.show
	}
	def static String show(Question question, Resource resource){
		var vardef = resource.allContents.filter(VarDef).toList
		'''
			«IF question.target.length>1»
			«FOR targ : question.target»
				«IF question.type == 'number' && vardef.contains(targ.vardef)==true && targ.condition!==null»
				if (__«question.name» «targ.condition.op» «targ.vardef.type.number»){
					nextInteraction = "«targ.show»";
				«ELSEIF question.type =='number' && vardef.contains(targ.vardef)==false && targ.condition!==null »
				if (__«question.name» «targ.condition.op» «targ.condition.number»){
					nextInteraction = "«targ.show»";
				«ELSEIF question.type =='text' && vardef.contains(targ.vardef)==false»						
				if (__«question.name».equals("«targ.show»")){
					nextInteraction = "«targ.show»";
				«ELSEIF question.type  =='number' && targ.condition===null && vardef.contains(targ.vardef)==false»
				if (__«question.name» < 0){
					nextInteraction = "«targ.show»";
				«ELSEIF question.type =='text' && question.exref!==null»
					«IF targ.vardef.type=='text'»
					String «targ.vardef.name» = __«question.name»;
					«ELSEIF targ.vardef.type=='number'»
					int «targ.vardef.name» = __«question.name»;
					«ENDIF»
				if(!«question.exref.name».«targ.vardef.name»(__«question.name»)){
					break;
					}
				if((«question.exref.name».textLength(«targ.vardef.name») «targ.condition.op» «targ.condition.number»)){
					nextInteraction = "«targ.show»";
					
				«ENDIF»
					break;
				}					
			«ENDFOR»
			«ELSE»
				nextInteraction = "«question.target.head.show»";
				break;
			«ENDIF»
		'''
	}
	def static dispatch String show(Target target){
		target.ref.name
	}
	def static dispatch String show(VarDef vardef){
		vardef.name
	}
	
}