/*
 * generated by Xtext 2.30.0
 */
package com.mdsd.assignment3.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MathdslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment3.Mathdsl.MathExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProgramKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cExternalAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExternalExternalParserRuleCall_2_0 = (RuleCall)cExternalAssignment_2.eContents().get(0);
		private final Assignment cVariablesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVariablesVarBindingParserRuleCall_3_0 = (RuleCall)cVariablesAssignment_3.eContents().get(0);
		
		//MathExp:
		//    'program' name=ID
		//    external+=External*
		//    variables += VarBinding*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'program' name=ID
		//external+=External*
		//variables += VarBinding*
		public Group getGroup() { return cGroup; }
		
		//'program'
		public Keyword getProgramKeyword_0() { return cProgramKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//external+=External*
		public Assignment getExternalAssignment_2() { return cExternalAssignment_2; }
		
		//External
		public RuleCall getExternalExternalParserRuleCall_2_0() { return cExternalExternalParserRuleCall_2_0; }
		
		//variables += VarBinding*
		public Assignment getVariablesAssignment_3() { return cVariablesAssignment_3; }
		
		//VarBinding
		public RuleCall getVariablesVarBindingParserRuleCall_3_0() { return cVariablesVarBindingParserRuleCall_3_0; }
	}
	public class VarBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment3.Mathdsl.VarBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionExpParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//VarBinding:
		//    'var' name=ID '=' expression=Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID '=' expression=Exp
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//expression=Exp
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }
		
		//Exp
		public RuleCall getExpressionExpParserRuleCall_3_0() { return cExpressionExpParserRuleCall_3_0; }
	}
	public class ExternalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment3.Mathdsl.External");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExternalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisRightParenthesisKeyword_2_0 = (Keyword)cAlternatives_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cArgumentsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cArgumentsExternalArgumentParserRuleCall_2_1_1_0 = (RuleCall)cArgumentsAssignment_2_1_1.eContents().get(0);
		private final Group cGroup_2_1_2 = (Group)cGroup_2_1.eContents().get(2);
		private final Keyword cCommaKeyword_2_1_2_0 = (Keyword)cGroup_2_1_2.eContents().get(0);
		private final Assignment cArgumentsAssignment_2_1_2_1 = (Assignment)cGroup_2_1_2.eContents().get(1);
		private final RuleCall cArgumentsExternalArgumentParserRuleCall_2_1_2_1_0 = (RuleCall)cArgumentsAssignment_2_1_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_1_3 = (Keyword)cGroup_2_1.eContents().get(3);
		
		//External:
		//    'external' name=ID ('()' | '(' arguments+=ExternalArgument (',' arguments+=ExternalArgument)* ')')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'external' name=ID ('()' | '(' arguments+=ExternalArgument (',' arguments+=ExternalArgument)* ')')
		public Group getGroup() { return cGroup; }
		
		//'external'
		public Keyword getExternalKeyword_0() { return cExternalKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('()' | '(' arguments+=ExternalArgument (',' arguments+=ExternalArgument)* ')')
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//'()'
		public Keyword getLeftParenthesisRightParenthesisKeyword_2_0() { return cLeftParenthesisRightParenthesisKeyword_2_0; }
		
		//'(' arguments+=ExternalArgument (',' arguments+=ExternalArgument)* ')'
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_1_0() { return cLeftParenthesisKeyword_2_1_0; }
		
		//arguments+=ExternalArgument
		public Assignment getArgumentsAssignment_2_1_1() { return cArgumentsAssignment_2_1_1; }
		
		//ExternalArgument
		public RuleCall getArgumentsExternalArgumentParserRuleCall_2_1_1_0() { return cArgumentsExternalArgumentParserRuleCall_2_1_1_0; }
		
		//(',' arguments+=ExternalArgument)*
		public Group getGroup_2_1_2() { return cGroup_2_1_2; }
		
		//','
		public Keyword getCommaKeyword_2_1_2_0() { return cCommaKeyword_2_1_2_0; }
		
		//arguments+=ExternalArgument
		public Assignment getArgumentsAssignment_2_1_2_1() { return cArgumentsAssignment_2_1_2_1; }
		
		//ExternalArgument
		public RuleCall getArgumentsExternalArgumentParserRuleCall_2_1_2_1_0() { return cArgumentsExternalArgumentParserRuleCall_2_1_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_1_3() { return cRightParenthesisKeyword_2_1_3; }
	}
	public class ExternalArgumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment3.Mathdsl.ExternalArgument");
		private final Keyword cIntKeyword = (Keyword)rule.eContents().get(1);
		
		//ExternalArgument:
		//    'int'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'int'
		public Keyword getIntKeyword() { return cIntKeyword; }
	}
	public class ExternalUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment3.Mathdsl.ExternalUse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cRefAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cRefExternalCrossReference_0_0 = (CrossReference)cRefAssignment_0.eContents().get(0);
		private final RuleCall cRefExternalIDTerminalRuleCall_0_0_1 = (RuleCall)cRefExternalCrossReference_0_0.eContents().get(1);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisRightParenthesisKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cArgumentsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cArgumentsExpParserRuleCall_1_1_1_0 = (RuleCall)cArgumentsAssignment_1_1_1.eContents().get(0);
		private final Group cGroup_1_1_2 = (Group)cGroup_1_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_1_2_0 = (Keyword)cGroup_1_1_2.eContents().get(0);
		private final Assignment cArgumentsAssignment_1_1_2_1 = (Assignment)cGroup_1_1_2.eContents().get(1);
		private final RuleCall cArgumentsExpParserRuleCall_1_1_2_1_0 = (RuleCall)cArgumentsAssignment_1_1_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_1_3 = (Keyword)cGroup_1_1.eContents().get(3);
		
		//ExternalUse:
		//ref=[External] ('()' | '(' arguments+=Exp (',' arguments+=Exp)* ')' )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref=[External] ('()' | '(' arguments+=Exp (',' arguments+=Exp)* ')' )
		public Group getGroup() { return cGroup; }
		
		//ref=[External]
		public Assignment getRefAssignment_0() { return cRefAssignment_0; }
		
		//[External]
		public CrossReference getRefExternalCrossReference_0_0() { return cRefExternalCrossReference_0_0; }
		
		//ID
		public RuleCall getRefExternalIDTerminalRuleCall_0_0_1() { return cRefExternalIDTerminalRuleCall_0_0_1; }
		
		//('()' | '(' arguments+=Exp (',' arguments+=Exp)* ')' )
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'()'
		public Keyword getLeftParenthesisRightParenthesisKeyword_1_0() { return cLeftParenthesisRightParenthesisKeyword_1_0; }
		
		//'(' arguments+=Exp (',' arguments+=Exp)* ')'
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_1_0() { return cLeftParenthesisKeyword_1_1_0; }
		
		//arguments+=Exp
		public Assignment getArgumentsAssignment_1_1_1() { return cArgumentsAssignment_1_1_1; }
		
		//Exp
		public RuleCall getArgumentsExpParserRuleCall_1_1_1_0() { return cArgumentsExpParserRuleCall_1_1_1_0; }
		
		//(',' arguments+=Exp)*
		public Group getGroup_1_1_2() { return cGroup_1_1_2; }
		
		//','
		public Keyword getCommaKeyword_1_1_2_0() { return cCommaKeyword_1_1_2_0; }
		
		//arguments+=Exp
		public Assignment getArgumentsAssignment_1_1_2_1() { return cArgumentsAssignment_1_1_2_1; }
		
		//Exp
		public RuleCall getArgumentsExpParserRuleCall_1_1_2_1_0() { return cArgumentsExpParserRuleCall_1_1_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_1_3() { return cRightParenthesisKeyword_1_1_3; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment3.Mathdsl.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFactorParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cMinusLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightFactorParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Exp returns Expression:
		//    Factor (( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Factor (( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
		public Group getGroup() { return cGroup; }
		
		//Factor
		public RuleCall getFactorParserRuleCall_0() { return cFactorParserRuleCall_0; }
		
		//(( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
		public Group getGroup_1() { return cGroup_1; }
		
		//( {Plus.left=current} '+' | {Minus.left=current}  '-' )
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Plus.left=current} '+'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0_0() { return cPlusLeftAction_1_0_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0_1() { return cPlusSignKeyword_1_0_0_1; }
		
		//{Minus.left=current}  '-'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_0_1_0() { return cMinusLeftAction_1_0_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1_1() { return cHyphenMinusKeyword_1_0_1_1; }
		
		//right=Factor
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Factor
		public RuleCall getRightFactorParserRuleCall_1_1_0() { return cRightFactorParserRuleCall_1_1_0; }
	}
	public class FactorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment3.Mathdsl.Factor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cMultLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cDivLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPrimaryParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Factor returns Expression:
		//    Primary (({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary (({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//(({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//({Mult.left=current} '*' | {Div.left=current}  '/'  )
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Mult.left=current} '*'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Mult.left=current}
		public Action getMultLeftAction_1_0_0_0() { return cMultLeftAction_1_0_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_0_1() { return cAsteriskKeyword_1_0_0_1; }
		
		//{Div.left=current}  '/'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Div.left=current}
		public Action getDivLeftAction_1_0_1_0() { return cDivLeftAction_1_0_1_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_0_1_1() { return cSolidusKeyword_1_0_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_1_0() { return cRightPrimaryParserRuleCall_1_1_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment3.Mathdsl.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cMathNumberAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cParenthesisAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cExpressionAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cExpressionExpParserRuleCall_1_2_0 = (RuleCall)cExpressionAssignment_1_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final RuleCall cVariableUseParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLetBindingParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cExternalUseParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//Primary returns Expression:
		//    {MathNumber} value=INT  | {Parenthesis} '(' expression=Exp ')'  |  VariableUse | LetBinding | ExternalUse
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{MathNumber} value=INT  | {Parenthesis} '(' expression=Exp ')'  |  VariableUse | LetBinding | ExternalUse
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{MathNumber} value=INT
		public Group getGroup_0() { return cGroup_0; }
		
		//{MathNumber}
		public Action getMathNumberAction_0_0() { return cMathNumberAction_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_1_0() { return cValueINTTerminalRuleCall_0_1_0; }
		
		//{Parenthesis} '(' expression=Exp ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//{Parenthesis}
		public Action getParenthesisAction_1_0() { return cParenthesisAction_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }
		
		//expression=Exp
		public Assignment getExpressionAssignment_1_2() { return cExpressionAssignment_1_2; }
		
		//Exp
		public RuleCall getExpressionExpParserRuleCall_1_2_0() { return cExpressionExpParserRuleCall_1_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
		
		//VariableUse
		public RuleCall getVariableUseParserRuleCall_2() { return cVariableUseParserRuleCall_2; }
		
		//LetBinding
		public RuleCall getLetBindingParserRuleCall_3() { return cLetBindingParserRuleCall_3; }
		
		//ExternalUse
		public RuleCall getExternalUseParserRuleCall_4() { return cExternalUseParserRuleCall_4; }
	}
	public class LetBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment3.Mathdsl.LetBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBindingAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBindingExpParserRuleCall_3_0 = (RuleCall)cBindingAssignment_3.eContents().get(0);
		private final Keyword cInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBodyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBodyExpParserRuleCall_5_0 = (RuleCall)cBodyAssignment_5.eContents().get(0);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//LetBinding:
		//    'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//binding=Exp
		public Assignment getBindingAssignment_3() { return cBindingAssignment_3; }
		
		//Exp
		public RuleCall getBindingExpParserRuleCall_3_0() { return cBindingExpParserRuleCall_3_0; }
		
		//'in'
		public Keyword getInKeyword_4() { return cInKeyword_4; }
		
		//body=Exp
		public Assignment getBodyAssignment_5() { return cBodyAssignment_5; }
		
		//Exp
		public RuleCall getBodyExpParserRuleCall_5_0() { return cBodyExpParserRuleCall_5_0; }
		
		//'end'
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
	}
	public class BindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment3.Mathdsl.Binding");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVarBindingParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLetBindingParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Binding:
		//    VarBinding | LetBinding
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//VarBinding | LetBinding
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//VarBinding
		public RuleCall getVarBindingParserRuleCall_0() { return cVarBindingParserRuleCall_0; }
		
		//LetBinding
		public RuleCall getLetBindingParserRuleCall_1() { return cLetBindingParserRuleCall_1; }
	}
	public class VariableUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment3.Mathdsl.VariableUse");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefBindingCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefBindingIDTerminalRuleCall_0_1 = (RuleCall)cRefBindingCrossReference_0.eContents().get(1);
		
		//VariableUse:
		//    ref = [Binding]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref = [Binding]
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[Binding]
		public CrossReference getRefBindingCrossReference_0() { return cRefBindingCrossReference_0; }
		
		//ID
		public RuleCall getRefBindingIDTerminalRuleCall_0_1() { return cRefBindingIDTerminalRuleCall_0_1; }
	}
	
	
	private final MathExpElements pMathExp;
	private final VarBindingElements pVarBinding;
	private final ExternalElements pExternal;
	private final ExternalArgumentElements pExternalArgument;
	private final ExternalUseElements pExternalUse;
	private final ExpElements pExp;
	private final FactorElements pFactor;
	private final PrimaryElements pPrimary;
	private final LetBindingElements pLetBinding;
	private final BindingElements pBinding;
	private final VariableUseElements pVariableUse;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathdslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMathExp = new MathExpElements();
		this.pVarBinding = new VarBindingElements();
		this.pExternal = new ExternalElements();
		this.pExternalArgument = new ExternalArgumentElements();
		this.pExternalUse = new ExternalUseElements();
		this.pExp = new ExpElements();
		this.pFactor = new FactorElements();
		this.pPrimary = new PrimaryElements();
		this.pLetBinding = new LetBindingElements();
		this.pBinding = new BindingElements();
		this.pVariableUse = new VariableUseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.mdsd.assignment3.Mathdsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MathExp:
	//    'program' name=ID
	//    external+=External*
	//    variables += VarBinding*
	//;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//VarBinding:
	//    'var' name=ID '=' expression=Exp
	//;
	public VarBindingElements getVarBindingAccess() {
		return pVarBinding;
	}
	
	public ParserRule getVarBindingRule() {
		return getVarBindingAccess().getRule();
	}
	
	//External:
	//    'external' name=ID ('()' | '(' arguments+=ExternalArgument (',' arguments+=ExternalArgument)* ')')
	//;
	public ExternalElements getExternalAccess() {
		return pExternal;
	}
	
	public ParserRule getExternalRule() {
		return getExternalAccess().getRule();
	}
	
	//ExternalArgument:
	//    'int'
	//;
	public ExternalArgumentElements getExternalArgumentAccess() {
		return pExternalArgument;
	}
	
	public ParserRule getExternalArgumentRule() {
		return getExternalArgumentAccess().getRule();
	}
	
	//ExternalUse:
	//ref=[External] ('()' | '(' arguments+=Exp (',' arguments+=Exp)* ')' )
	//;
	public ExternalUseElements getExternalUseAccess() {
		return pExternalUse;
	}
	
	public ParserRule getExternalUseRule() {
		return getExternalUseAccess().getRule();
	}
	
	//Exp returns Expression:
	//    Factor (( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
	//;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//Factor returns Expression:
	//    Primary (({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
	//;
	public FactorElements getFactorAccess() {
		return pFactor;
	}
	
	public ParserRule getFactorRule() {
		return getFactorAccess().getRule();
	}
	
	//Primary returns Expression:
	//    {MathNumber} value=INT  | {Parenthesis} '(' expression=Exp ')'  |  VariableUse | LetBinding | ExternalUse
	//;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//LetBinding:
	//    'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
	//;
	public LetBindingElements getLetBindingAccess() {
		return pLetBinding;
	}
	
	public ParserRule getLetBindingRule() {
		return getLetBindingAccess().getRule();
	}
	
	//Binding:
	//    VarBinding | LetBinding
	//;
	public BindingElements getBindingAccess() {
		return pBinding;
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
	}
	
	//VariableUse:
	//    ref = [Binding]
	//;
	public VariableUseElements getVariableUseAccess() {
		return pVariableUse;
	}
	
	public ParserRule getVariableUseRule() {
		return getVariableUseAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}