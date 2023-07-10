/*
 * generated by Xtext 2.30.0
 */
package ui.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ui.languagedsl.Button
import ui.languagedsl.Exp
import ui.languagedsl.Form
import ui.languagedsl.FormUse
import ui.languagedsl.Input
import ui.languagedsl.Label
import ui.languagedsl.Title

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LanguagedslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	val title = resource.allContents.filter(Title).next
	fsa.generateFile('''user_interface/«title.name»/UserInterface.java''', generateInterface(title, resource));
	var form = resource.allContents.filter(FormUse).toList.empty
	if (form==true){
			fsa.generateFile('''user_interface/«title.name»/«title.name»Form.java''', generateForm(title, resource));
		} else {
			var forms = resource.allContents.filter(Form).toList;
			for (list : forms){
				fsa.generateFile('''user_interface/«title.name»/«list.name».java''', generateForm(list, title))
			}
		 }
	}

	def static String generateInterface(Title title, Resource resource) {
		'''
			package user_interface.«title.name»;
			import javax.swing.*;
			
			public class UserInterface{
				public JFrame frame;
				
				public void open(){
					frame = new JFrame("«title.name»");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					«IF title.form.toList.length>1»
					«title.form.head.name» form = new «title.form.head.name»(this);
					«ELSE»
					«title.name»Form form = new «title.name»Form(this);
					«ENDIF»
					frame.add(form.createPanel());
					frame.pack();
					frame.setVisible(true);
					
				}
			}
		'''
	}
	
	def static String generateForm(Form form, Title title){
		var layouts = form.layout.toList
		'''
			package user_interface.«title.name»;
			import javax.swing.*;
			import java.awt.event.*;
			import user_interface.common.*;
			
			public class «form.name» extends Form{
				UserInterface parent;
			
			public «form.name» () {
				
			}
			
			public «form.name»(UserInterface userInterface){
										
			}
			«FOR param : form.param»
				«FOR param2 : form.param2»
					«IF param2!==null && param2.type=='number' && param.type=='number'»

			public «form.name»(UserInterface user, int i, int j){
					
			}		«ELSEIF param2!==null && param2.type=='string' && param.type=='string'»

			public «form.name»(UserInterface user, String string1, String string2){
			
			}	
					«ELSEIF param2!==null && param2.type=='string' && param.type=='number'»

			public «form.name»(UserInterface user, String string, int i){
				
			}		
					«ELSEIF param2!==null && param2.type=='number' && param.type=='string'»

			public «form.name»(UserInterface user, int i, String string){
				
			}			
					«ELSEIF param2===null && param.type=='string'»

			public «form.name»(UserInterface user, String string){
				
			}		«ELSEIF param2===null && param.type=='number'»

			public «form.name»(UserInterface user, int i){
				
			}		«ENDIF»
				«ENDFOR»
			«ENDFOR»
			
			«FOR layout : layouts»
				«FOR component : layout.component»
					«FOR element : component.element»
						«FOR input : element.input»

				public JTextField «input.name»Component;
						«ENDFOR»
						«FOR button : element.button»

				public JButton «button.name»Component;
						«ENDFOR»
						
					«ENDFOR»
				«ENDFOR»
			«ENDFOR»
			«FOR layout : layouts»
				«FOR component : layout.component»
					«FOR formuse : component.formuse»
						«IF formuse.exp2!==null && !formuse.exp2.number.toString.blank && !formuse.exp.number.toString.blank»
						public «form.name»(UserInterface parent«component.formuse.indexOf(formuse)», int x, int y){

						}		
						«ELSEIF formuse.exp2===null && formuse.exp!==null && !formuse.exp.show.blank»
						public «form.name»(UserInterface parent«component.formuse.indexOf(formuse)», String string){
						
						}
						«ENDIF»						
					«ENDFOR»
				«ENDFOR»
			«ENDFOR»	
				
			
				public void «form.name»Form(UserInterface parent){
					this.parent = parent;
					«FOR layout : layouts»
						«FOR component : layout.component»
							«FOR element : component.element»
								«FOR input : element.input»

						«input.name»Component = new JTextFIeld();
								«ENDFOR»
								«FOR button : element.button»

						«button.name»Component = new JButton("«button.exp.show»");
								«ENDFOR»
							«ENDFOR»
						«ENDFOR»
					«ENDFOR»
				}
				public JPanel createPanel(){
					return createPanel0();
				}
				
				
				«FOR layout : layouts»
				public JPanel createPanel«layouts.indexOf(layout)»() {
					JPanel panel = new JPanel();
					panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
					«FOR component : layout.component»
						«FOR formuse : component.formuse»
							«formuse.show»
						«ENDFOR»
						«FOR elem : component.element»
							«FOR label : elem.label»
								«label.show»
							«ENDFOR»
							«FOR input : elem.input»
								«input.show»
							«ENDFOR»
							«FOR button : elem.button»
								«button.show»
							«ENDFOR»
						«ENDFOR»
					«ENDFOR»
				«ENDFOR»
					return panel;
				}
				public boolean checkValidity(){
					
					return true;	
				}					
			}
			
		'''
	}
	
	def static String generateForm(Title title, Resource resource) {
		var inputs = resource.allContents.filter(Input).toList.isEmpty 
		var buttons = resource.allContents.filter(Button).toList.isEmpty
		'''
			package user_interface.«title.name»;
			import javax.swing.*;
			import java.awt.event.*;
			import user_interface.common.*;
			
			public class «title.name»Form extends Form{
				
				UserInterface parent;
				«IF inputs===false»
					«FOR input : resource.allContents.filter(Input).toList»

				public JTextField «input.name»Component;
					«ENDFOR»
				«ENDIF»
				«IF buttons===false»
					«FOR button : resource.allContents.filter(Button).toList»

				public JButton «button.name»Component;
					«ENDFOR»
				«ENDIF»
				
				«title.name»Form(UserInterface parent){
					this.parent = parent;
					«IF buttons===false»
						«FOR button : resource.allContents.filter(Button).toList»
					«button.name»Component = new JButton("«button.exp.show»");
						«ENDFOR»
					«ENDIF»
					«IF inputs===false»
						«FOR input : resource.allContents.filter(Input).toList»
						«input.name»Component = new JTextField();
						«ENDFOR»
					«ENDIF»
				}
				
				public JPanel createPanel(){
					return createPanel0();
				}
				«FOR form : title.form»
				public JPanel createPanel«title.form.indexOf(form)»() {
					JPanel panel = new JPanel();
					panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
					«FOR layout : form.layout»
						«FOR component : layout.component»
							«IF component.layout.empty»
								«FOR element : component.element»
									«FOR label :element.label»
										«label.show»
									«ENDFOR»
									«FOR input : element.input»
										«input.show»
									«ENDFOR»
									«FOR button : element.button»
										«button.show»
									«ENDFOR»
								«ENDFOR»
							«ELSE»
								«FOR lay : component.layout»

					panel.add(createPanel«layout.component.indexOf(component)+1»());
								«ENDFOR»
								«FOR element : component.element»
									«FOR label :element.label»
										«label.show»
									«ENDFOR»
								«ENDFOR»
							«ENDIF»		
						«ENDFOR»
					«ENDFOR»
				«ENDFOR»
				return panel;
			}
				«FOR form : title.form»
					«FOR layout : form.layout»
						«FOR component : layout.component»
							«FOR lay : component.layout»
								«IF !component.layout.empty»

				public JPanel createPanel«layout.component.indexOf(component)+1»() {
					JPanel panel = new JPanel();
					panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
									«FOR layer : lay.component»
										«FOR elem : layer.element»
											«FOR label : elem.label»
												«label.show»
											«ENDFOR»
											«FOR input : elem.input»
												«input.show»
											«ENDFOR»
											«FOR button : elem.button»
												«button.show»
											«ENDFOR»
										«ENDFOR»
									«ENDFOR»
					return panel;
				}				«ENDIF»
							«ENDFOR»
						«ENDFOR»
					«ENDFOR»
				«ENDFOR»
				public boolean checkValidity(){
				«IF inputs===false»
					«FOR input : resource.allContents.filter(Input).toList»
						«IF input.exp.type=='#string'»
						String	«input.name» = this.«input.name»Component.getText();
							«IF input.condition!==null»
							if(!(«input.name».length() «input.condition.op» «input.condition.exp»)){
								return false;
							}
							«ENDIF»
							«IF input.ref!==null»
							if (!(«input.ref.name»).equals(«input.name»)){
								return false;	
							}
							«ENDIF»
						«ELSEIF input.exp.type=='string'»
						String	«input.name» = this.«input.name»Component.getText();
							«IF input.condition!==null»
							if(!(«input.name».length() «input.condition.op» «input.condition.type»)){
								return false;
							}
							«ENDIF»
						
				 		«ELSEIF input.exp.type=='number'»
						int «input.name» = 0;
						try { 
							 «input.name» = Integer.parseInt(this.«input.name»Component.getText());
							 «IF input.condition!==null && input.condition.op2!==null»
							 if(!((«input.name» «input.condition.op» «input.condition.exp.number») && («input.name» «input.condition.op2» «input.condition.exp2.number»))){
							 	return false;
							 }
							 «ENDIF»
							 «IF input.condition!==null && input.condition.op2===null»
							 if(!((«input.name» «input.condition.op» «input.condition.exp.number»))){
							 	return false;	
							 }
							 «ENDIF»
						} catch (Exception ex){
							return false;
						}	
				 		«ELSEIF input.exp.type=='boolean'»
						boolean «input.name» = this.«input.name»Component.getText();
						«ELSE»
						String «input.name» = this.«input.name»Component.getText();
							«IF input.ref!==null»
							if (!(«input.ref.name»).equals(«input.name»)){
								return false;	
							}
							«ENDIF»
				 		«ENDIF»
					«ENDFOR»
					
					«FOR input : resource.allContents.filter(Input).toList»
						«IF input.ref!==null»
						if (!(«input.ref.name»).equals(«input.name»)){
								return false;	
							}
						«ENDIF»
					«ENDFOR»
				«ENDIF»
					return true;
				}		
			}
		'''
	}
	
	def static dispatch String show(Exp exp){
		exp.value
	}
	
	
	def static dispatch String show(Label label){
		var fields = label.field.toList
		'''
			«FOR field : fields»
			«IF label.exp2!==null && !label.exp2.show.blank»
			String «field.name» = "";
			panel.add(new JLabel((("«label.exp.show»"+ «field.name»)+"«label.exp2.show»")));
			«ELSE»
			panel.add(new JLabel("«label.exp.show»"));
			«ENDIF»
			«ENDFOR»
			
		'''
		
	}
	def static dispatch String show(Input input){
		'''
			panel.add(«input.name»Component);
		'''
	}
	def static dispatch String show(Button button){
		'''
			panel.add(«button.name»Component);
			«IF button.save!==null»
			«button.name»Component.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(checkValidity()){
						JOptionPane.showMessageDialog(
							parent.frame,
							"Data has been «button.name»");
					}
					else {
						JOptionPane.showMessageDialog(
							parent.frame,
							"Validation error",
							"Error",
							JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			«ENDIF»
		'''
	}
	def static dispatch String show(FormUse formuse){
		'''
			«IF formuse.exp2===null && formuse.exp!==null && !formuse.exp.value.empty»
			«formuse.name» «formuse.name» = new «formuse.name»(parent, "«formuse.exp.value»");
			«ELSEIF formuse.exp2!==null && !formuse.exp.number.toString.blank && !formuse.exp2.number.toString.blank»
			«formuse.name» «formuse.name» = new «formuse.name»(parent, «formuse.exp.number», «formuse.exp2.number»);
			«ELSE»
			«formuse.name» «formuse.name» = new «formuse.name»();
			«ENDIF»
			panel.add(«formuse.name».createPanel());
		'''
	}
}
