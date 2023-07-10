package interactive.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import interactive.fictiondsl.Announce;
import interactive.fictiondsl.End;
import interactive.fictiondsl.Ending;
import interactive.fictiondsl.Expression;
import interactive.fictiondsl.External;
import interactive.fictiondsl.Question;
import interactive.fictiondsl.Scenario;
import interactive.fictiondsl.Statement;
import interactive.fictiondsl.Story;
import interactive.fictiondsl.Target;
import interactive.fictiondsl.VarDef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class FictiondslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Story story = Iterators.<Story>filter(resource.getAllContents(), Story.class).next();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("interactive_fiction/");
    String _name = story.getName();
    _builder.append(_name);
    _builder.append("/Game.java");
    fsa.generateFile(_builder.toString(), FictiondslGenerator.generate(story, resource, fsa));
  }

  public static String generate(final Story story, final Resource resource, final IFileSystemAccess2 fsa) {
    String _xblockexpression = null;
    {
      List<Scenario> scenarios = IteratorExtensions.<Scenario>toList(Iterators.<Scenario>filter(resource.getAllContents(), Scenario.class));
      Scenario _xifexpression = null;
      boolean _isEmpty = scenarios.isEmpty();
      if (_isEmpty) {
        _xifexpression = null;
      } else {
        _xifexpression = IterableExtensions.<Scenario>head(scenarios);
      }
      Scenario start = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package interactive_fiction.");
      String _name = story.getName();
      _builder.append(_name);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("import java.io.IOException;");
      _builder.newLine();
      _builder.append("import interactive_fiction.common.*;");
      _builder.newLine();
      _builder.append("public class Game {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public Scenario start;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public Game(){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.start = new Scenario");
      String _name_1 = start.getName();
      _builder.append(_name_1, "\t\t");
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void play() throws IOException {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("start.interact();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      {
        for(final Scenario scene : scenarios) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("interactive_fiction/");
          String _name_2 = story.getName();
          _builder_1.append(_name_2);
          _builder_1.append("/");
          String _name_3 = scene.getName();
          _builder_1.append(_name_3);
          _builder_1.append(".java");
          fsa.generateFile(_builder_1.toString(), FictiondslGenerator.generate(scene, resource));
          _builder.newLineIfNotEmpty();
        }
      }
      Integer _xifexpression_1 = null;
      boolean _isEmpty_1 = IteratorExtensions.<External>toList(Iterators.<External>filter(resource.getAllContents(), External.class)).isEmpty();
      if (_isEmpty_1) {
        _xifexpression_1 = null;
      } else {
        _xifexpression_1 = Integer.valueOf(0);
      }
      final Integer external = _xifexpression_1;
      _builder.newLineIfNotEmpty();
      {
        if ((external != null)) {
          List<External> _list = IteratorExtensions.<External>toList(Iterators.<External>filter(resource.getAllContents(), External.class));
          final ArrayList<External> extern = new ArrayList<External>(_list);
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("interactive_fiction/");
          String _name_4 = story.getName();
          _builder_2.append(_name_4);
          _builder_2.append("/External.java");
          fsa.generateFile(_builder_2.toString(), FictiondslGenerator.generate(extern, story));
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  public static String generate(final ArrayList<External> external, final Story story) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package interactive_fiction.");
    String _name = story.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("public interface External {");
    _builder.newLine();
    {
      for(final External ext : external) {
        {
          String _type = ext.getType();
          boolean _tripleEquals = (_type == "boolean");
          if (_tripleEquals) {
            {
              String _result = ext.getResult();
              boolean _tripleEquals_1 = (_result == "number");
              if (_tripleEquals_1) {
                _builder.append("public boolean ");
                String _name_1 = ext.getName();
                _builder.append(_name_1);
                _builder.append("(int param");
                int _indexOf = external.indexOf(ext);
                _builder.append(_indexOf);
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              } else {
                String _result_1 = ext.getResult();
                boolean _tripleEquals_2 = (_result_1 == "text");
                if (_tripleEquals_2) {
                  _builder.append("public boolean ");
                  String _name_2 = ext.getName();
                  _builder.append(_name_2);
                  _builder.append("(String param");
                  int _indexOf_1 = external.indexOf(ext);
                  _builder.append(_indexOf_1);
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          } else {
            String _type_1 = ext.getType();
            boolean _tripleEquals_3 = (_type_1 == "number");
            if (_tripleEquals_3) {
              {
                String _result_2 = ext.getResult();
                boolean _tripleEquals_4 = (_result_2 == "text");
                if (_tripleEquals_4) {
                  _builder.append("public int ");
                  String _name_3 = ext.getName();
                  _builder.append(_name_3);
                  _builder.append("(String param");
                  int _indexOf_2 = external.indexOf(ext);
                  _builder.append(_indexOf_2);
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public static String generate(final Scenario scenario, final Resource resource) {
    String _xblockexpression = null;
    {
      Story story = IteratorExtensions.<Story>head(Iterators.<Story>filter(resource.getAllContents(), Story.class));
      End end = Iterators.<End>filter(resource.getAllContents(), End.class).next();
      Statement statement = IteratorExtensions.<Statement>head(Iterators.<Statement>filter(resource.getAllContents(), Statement.class));
      List<Statement> statements = IteratorExtensions.<Statement>toList(Iterators.<Statement>filter(resource.getAllContents(), Statement.class));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package interactive_fiction.");
      String _name = story.getName();
      _builder.append(_name);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import java.io.IOException;");
      _builder.newLine();
      _builder.append("import interactive_fiction.common.*;");
      _builder.newLine();
      _builder.append("class Scenario");
      String _name_1 = scenario.getName();
      _builder.append(_name_1);
      _builder.append(" extends Scenario {");
      _builder.newLineIfNotEmpty();
      {
        for(final Statement stat : statements) {
          {
            EList<Question> _question = stat.getQuestion();
            for(final Question quest : _question) {
              {
                String _type = quest.getType();
                boolean _equals = Objects.equal(_type, "number");
                if (_equals) {
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("int __");
                  String _name_2 = quest.getName();
                  _builder.append(_name_2, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                String _type_1 = quest.getType();
                boolean _equals_1 = Objects.equal(_type_1, "text");
                if (_equals_1) {
                  _builder.append("\t");
                  _builder.append("String __");
                  String _name_3 = quest.getName();
                  _builder.append(_name_3, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                boolean _isEmpty = quest.getType().toString().isEmpty();
                if (_isEmpty) {
                  _builder.append("\t");
                  _builder.append("String __");
                  String _name_4 = quest.getName();
                  _builder.append(_name_4, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _builder.append("\t");
      Integer _xifexpression = null;
      boolean _isEmpty_1 = IteratorExtensions.<Question>toList(Iterators.<Question>filter(resource.getAllContents(), Question.class)).isEmpty();
      if (_isEmpty_1) {
        _xifexpression = null;
      } else {
        _xifexpression = Integer.valueOf(0);
      }
      final Integer external = _xifexpression;
      _builder.newLineIfNotEmpty();
      {
        if ((external != null)) {
          _builder.append("\t");
          List<Question> questions = IteratorExtensions.<Question>toList(Iterators.<Question>filter(resource.getAllContents(), Question.class));
          _builder.newLineIfNotEmpty();
          {
            for(final Question ext : questions) {
              {
                External _exref = ext.getExref();
                boolean _tripleNotEquals = (_exref != null);
                if (_tripleNotEquals) {
                  {
                    String _type_2 = ext.getExref().getType();
                    boolean _tripleEquals = (_type_2 == "boolean");
                    if (_tripleEquals) {
                      _builder.append("\t");
                      _builder.append("bool ");
                      String _name_5 = ext.getExref().getName();
                      _builder.append(_name_5, "\t");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                    } else {
                      String _type_3 = ext.getExref().getType();
                      boolean _tripleEquals_1 = (_type_3 == "number");
                      if (_tripleEquals_1) {
                        _builder.append("\t");
                        _builder.append("int ");
                        String _name_6 = ext.getExref().getName();
                        _builder.append(_name_6, "\t");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                      } else {
                        String _type_4 = ext.getExref().getType();
                        boolean _tripleEquals_2 = (_type_4 == "text");
                        if (_tripleEquals_2) {
                          _builder.append("\t");
                          _builder.append("String ");
                          String _name_7 = ext.getExref().getName();
                          _builder.append(_name_7, "\t");
                          _builder.append(";");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      _builder.append("\t");
      _builder.append("External external;\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Scenario");
      String _name_8 = scenario.getName();
      _builder.append(_name_8, "\t");
      _builder.append("(External external) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("this.external = external;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public ScenarioExternalHelp() {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("// TODO Auto-generated constructor stub");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public String interact() throws IOException {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("nextInteraction = \"");
      {
        boolean _isEmpty_2 = statement.getAnnounce().isEmpty();
        if (_isEmpty_2) {
          String _name_9 = end.getName();
          _builder.append(_name_9, "\t\t\t");
        } else {
          String _name_10 = IterableExtensions.<Announce>head(statement.getAnnounce()).getName();
          _builder.append(_name_10, "\t\t\t");
        }
      }
      _builder.append("\";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      String currentname = null;
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("while(true){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("switch(nextInteraction){");
      _builder.newLine();
      {
        for(final Statement stat_1 : statements) {
          {
            EList<Announce> _announce = stat_1.getAnnounce();
            for(final Announce anno : _announce) {
              _builder.append("\t\t\t\t");
              _builder.append("case \"");
              String _name_11 = anno.getName();
              _builder.append(_name_11, "\t\t\t\t");
              _builder.append("\":");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t\t");
              _builder.append("\t");
              _builder.append("nextInteraction = \"");
              String _show = FictiondslGenerator.show(anno);
              _builder.append(_show, "\t\t\t\t\t");
              _builder.append("\";");
              _builder.newLineIfNotEmpty();
              {
                VarDef _ref = anno.getRef();
                boolean _tripleNotEquals_1 = (_ref != null);
                if (_tripleNotEquals_1) {
                  _builder.append("\t\t\t\t");
                  _builder.append("System.out.println(\"");
                  String _show_1 = FictiondslGenerator.show(anno.getExpression());
                  _builder.append(_show_1, "\t\t\t\t");
                  _builder.append("\"+__");
                  _builder.append(currentname, "\t\t\t\t");
                  _builder.append("+\"");
                  String _show_2 = FictiondslGenerator.show(anno.getExp());
                  _builder.append(_show_2, "\t\t\t\t");
                  _builder.append("\");\t\t");
                  _builder.newLineIfNotEmpty();
                } else {
                  Expression _exp = anno.getExp();
                  boolean _tripleNotEquals_2 = (_exp != null);
                  if (_tripleNotEquals_2) {
                    _builder.append("\t\t\t\t");
                    _builder.append("System.out.println(\"");
                    String _show_3 = FictiondslGenerator.show(anno.getExpression());
                    _builder.append(_show_3, "\t\t\t\t");
                    _builder.append(currentname, "\t\t\t\t");
                    String _show_4 = FictiondslGenerator.show(anno.getExp());
                    _builder.append(_show_4, "\t\t\t\t");
                    _builder.append("\");");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t\t\t\t");
                    _builder.append("System.out.println(\"");
                    String _show_5 = FictiondslGenerator.show(anno.getExpression());
                    _builder.append(_show_5, "\t\t\t\t");
                    _builder.append("\");");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
              _builder.append("\t\t\t\t");
              _builder.append("\t");
              _builder.append("break;");
              _builder.newLine();
            }
          }
          {
            EList<Question> _question_1 = stat_1.getQuestion();
            for(final Question question : _question_1) {
              _builder.append("\t\t\t\t");
              _builder.append("case \"");
              String _name_12 = question.getName();
              _builder.append(_name_12, "\t\t\t\t");
              _builder.append("\":");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t\t");
              _builder.append("\t");
              _builder.append("System.out.println(\"");
              String _show_6 = FictiondslGenerator.show(question.getExpression());
              _builder.append(_show_6, "\t\t\t\t\t");
              _builder.append("\");");
              _builder.newLineIfNotEmpty();
              {
                String _type_5 = question.getType();
                boolean _equals_2 = Objects.equal(_type_5, "text");
                if (_equals_2) {
                  _builder.append("\t\t\t\t");
                  _builder.append("__");
                  String _name_13 = question.getName();
                  _builder.append(_name_13, "\t\t\t\t");
                  _builder.append(" = br.readLine();");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t\t");
                  _builder.append("//");
                  _builder.append(currentname = question.getName(), "\t\t\t\t");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t\t");
                  String _show_7 = FictiondslGenerator.show(question, resource);
                  _builder.append(_show_7, "\t\t\t\t");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                String _type_6 = question.getType();
                boolean _equals_3 = Objects.equal(_type_6, "number");
                if (_equals_3) {
                  _builder.append("\t\t\t\t");
                  _builder.append("try {");
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("\t\t");
                  _builder.append("__");
                  String _name_14 = question.getName();
                  _builder.append(_name_14, "\t\t\t\t\t\t");
                  _builder.append(" = Integer.parseInt(br.readLine());");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t\t");
                  _builder.append("\t\t");
                  String _show_8 = FictiondslGenerator.show(question, resource);
                  _builder.append(_show_8, "\t\t\t\t\t\t");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t\t");
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("\t\t");
                  _builder.append("catch (Exception ex) ");
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("\t");
                  _builder.append("{");
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("\t\t");
                  _builder.append("break;");
                  _builder.newLine();
                  _builder.append("\t\t\t\t");
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLine();
                }
              }
              {
                boolean _isBlank = question.getType().isBlank();
                if (_isBlank) {
                  _builder.append("\t\t\t\t");
                  _builder.append("__");
                  String _name_15 = question.getName();
                  _builder.append(_name_15, "\t\t\t\t");
                  _builder.append(" = br.readLine();");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t\t");
                  String _show_9 = FictiondslGenerator.show(question, resource);
                  _builder.append(_show_9, "\t\t\t\t");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EList<End> _end = stat_1.getEnd();
            for(final End en : _end) {
              _builder.append("\t\t\t\t");
              _builder.append("case \"");
              String _name_16 = en.getName();
              _builder.append(_name_16, "\t\t\t\t");
              _builder.append("\":");
              _builder.newLineIfNotEmpty();
              {
                Expression _exp_1 = en.getExp();
                boolean _tripleNotEquals_3 = (_exp_1 != null);
                if (_tripleNotEquals_3) {
                  _builder.append("\t\t\t\t");
                  _builder.append("System.out.println(\"");
                  String _show_10 = FictiondslGenerator.show(en.getExpression());
                  _builder.append(_show_10, "\t\t\t\t");
                  _builder.append("\"+__");
                  _builder.append(currentname, "\t\t\t\t");
                  _builder.append("+\"");
                  String _show_11 = FictiondslGenerator.show(en.getExp());
                  _builder.append(_show_11, "\t\t\t\t");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("\t\t\t\t");
                  _builder.append("System.out.println(\"");
                  String _show_12 = FictiondslGenerator.show(en.getExpression());
                  _builder.append(_show_12, "\t\t\t\t");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t\t\t\t");
              _builder.append("\t");
              _builder.append("return \"");
              String _name_17 = en.getName();
              _builder.append(_name_17, "\t\t\t\t\t");
              _builder.append("\";");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected static String _show(final Expression exp) {
    return null;
  }

  protected static String _show(final Ending ending) {
    return ending.getValue();
  }

  protected static String _show(final End end) {
    return end.getName();
  }

  protected static String _show(final Announce announce) {
    return FictiondslGenerator.show(announce.getTarget());
  }

  public static String show(final Question question, final Resource resource) {
    String _xblockexpression = null;
    {
      List<VarDef> vardef = IteratorExtensions.<VarDef>toList(Iterators.<VarDef>filter(resource.getAllContents(), VarDef.class));
      StringConcatenation _builder = new StringConcatenation();
      {
        int _length = ((Object[])Conversions.unwrapArray(question.getTarget(), Object.class)).length;
        boolean _greaterThan = (_length > 1);
        if (_greaterThan) {
          {
            EList<Target> _target = question.getTarget();
            for(final Target targ : _target) {
              {
                if (((Objects.equal(question.getType(), "number") && (vardef.contains(targ.getVardef()) == true)) && (targ.getCondition() != null))) {
                  _builder.append("if (__");
                  String _name = question.getName();
                  _builder.append(_name);
                  _builder.append(" ");
                  String _op = targ.getCondition().getOp();
                  _builder.append(_op);
                  _builder.append(" ");
                  int _number = targ.getVardef().getType().getNumber();
                  _builder.append(_number);
                  _builder.append("){");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("nextInteraction = \"");
                  String _show = FictiondslGenerator.show(targ);
                  _builder.append(_show, "\t");
                  _builder.append("\";");
                  _builder.newLineIfNotEmpty();
                } else {
                  if (((Objects.equal(question.getType(), "number") && (vardef.contains(targ.getVardef()) == false)) && (targ.getCondition() != null))) {
                    _builder.append("if (__");
                    String _name_1 = question.getName();
                    _builder.append(_name_1);
                    _builder.append(" ");
                    String _op_1 = targ.getCondition().getOp();
                    _builder.append(_op_1);
                    _builder.append(" ");
                    int _number_1 = targ.getCondition().getNumber();
                    _builder.append(_number_1);
                    _builder.append("){");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("nextInteraction = \"");
                    String _show_1 = FictiondslGenerator.show(targ);
                    _builder.append(_show_1, "\t");
                    _builder.append("\";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    if ((Objects.equal(question.getType(), "text") && (vardef.contains(targ.getVardef()) == false))) {
                      _builder.append("if (__");
                      String _name_2 = question.getName();
                      _builder.append(_name_2);
                      _builder.append(".equals(\"");
                      String _show_2 = FictiondslGenerator.show(targ);
                      _builder.append(_show_2);
                      _builder.append("\")){");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("nextInteraction = \"");
                      String _show_3 = FictiondslGenerator.show(targ);
                      _builder.append(_show_3, "\t");
                      _builder.append("\";");
                      _builder.newLineIfNotEmpty();
                    } else {
                      if (((Objects.equal(question.getType(), "number") && (targ.getCondition() == null)) && (vardef.contains(targ.getVardef()) == false))) {
                        _builder.append("if (__");
                        String _name_3 = question.getName();
                        _builder.append(_name_3);
                        _builder.append(" < 0){");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("nextInteraction = \"");
                        String _show_4 = FictiondslGenerator.show(targ);
                        _builder.append(_show_4, "\t");
                        _builder.append("\";");
                        _builder.newLineIfNotEmpty();
                      } else {
                        if ((Objects.equal(question.getType(), "text") && (question.getExref() != null))) {
                          {
                            Expression _type = targ.getVardef().getType();
                            boolean _equals = Objects.equal(_type, "text");
                            if (_equals) {
                              _builder.append("\t");
                              _builder.append("String ");
                              String _name_4 = targ.getVardef().getName();
                              _builder.append(_name_4, "\t");
                              _builder.append(" = __");
                              String _name_5 = question.getName();
                              _builder.append(_name_5, "\t");
                              _builder.append(";");
                              _builder.newLineIfNotEmpty();
                            } else {
                              Expression _type_1 = targ.getVardef().getType();
                              boolean _equals_1 = Objects.equal(_type_1, "number");
                              if (_equals_1) {
                                _builder.append("\t");
                                _builder.append("int ");
                                String _name_6 = targ.getVardef().getName();
                                _builder.append(_name_6, "\t");
                                _builder.append(" = __");
                                String _name_7 = question.getName();
                                _builder.append(_name_7, "\t");
                                _builder.append(";");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                          _builder.append("if(!");
                          String _name_8 = question.getExref().getName();
                          _builder.append(_name_8);
                          _builder.append(".");
                          String _name_9 = targ.getVardef().getName();
                          _builder.append(_name_9);
                          _builder.append("(__");
                          String _name_10 = question.getName();
                          _builder.append(_name_10);
                          _builder.append(")){");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("break;");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("if((");
                          String _name_11 = question.getExref().getName();
                          _builder.append(_name_11);
                          _builder.append(".textLength(");
                          String _name_12 = targ.getVardef().getName();
                          _builder.append(_name_12);
                          _builder.append(") ");
                          String _op_2 = targ.getCondition().getOp();
                          _builder.append(_op_2);
                          _builder.append(" ");
                          int _number_2 = targ.getCondition().getNumber();
                          _builder.append(_number_2);
                          _builder.append(")){");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("nextInteraction = \"");
                          String _show_5 = FictiondslGenerator.show(targ);
                          _builder.append(_show_5, "\t");
                          _builder.append("\";");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.newLine();
                        }
                      }
                    }
                  }
                }
              }
              _builder.append("\t");
              _builder.append("break;");
              _builder.newLine();
              _builder.append("}\t\t\t\t\t");
              _builder.newLine();
            }
          }
        } else {
          _builder.append("nextInteraction = \"");
          String _show_6 = FictiondslGenerator.show(IterableExtensions.<Target>head(question.getTarget()));
          _builder.append(_show_6);
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append("break;");
          _builder.newLine();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  protected static String _show(final Target target) {
    return target.getRef().getName();
  }

  protected static String _show(final VarDef vardef) {
    return vardef.getName();
  }

  public static String show(final EObject announce) {
    if (announce instanceof Announce) {
      return _show((Announce)announce);
    } else if (announce instanceof End) {
      return _show((End)announce);
    } else if (announce instanceof Ending) {
      return _show((Ending)announce);
    } else if (announce instanceof Expression) {
      return _show((Expression)announce);
    } else if (announce instanceof Target) {
      return _show((Target)announce);
    } else if (announce instanceof VarDef) {
      return _show((VarDef)announce);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(announce).toString());
    }
  }
}
