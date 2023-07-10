/*
 * generated by Xtext 2.30.0
 */
package com.mdsd.assignment2.services;

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment2.Mathdsl.MathExp");
		private final Assignment cVariablesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cVariablesVarBindingParserRuleCall_0 = (RuleCall)cVariablesAssignment.eContents().get(0);
		
		//MathExp:
		//    //'var' name=ID '=' exp=Exp
		//    variables+=VarBinding*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////'var' name=ID '=' exp=Exp
		//variables+=VarBinding*
		public Assignment getVariablesAssignment() { return cVariablesAssignment; }
		
		//VarBinding
		public RuleCall getVariablesVarBindingParserRuleCall_0() { return cVariablesVarBindingParserRuleCall_0; }
	}
	public class VarBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment2.Mathdsl.VarBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpExpParserRuleCall_3_0 = (RuleCall)cExpAssignment_3.eContents().get(0);
		
		//VarBinding:
		//    'var' name=ID '=' exp=Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID '=' exp=Exp
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//exp=Exp
		public Assignment getExpAssignment_3() { return cExpAssignment_3; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_3_0() { return cExpExpParserRuleCall_3_0; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment2.Mathdsl.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTermParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cMinusLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightTermParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Exp returns Expression:
		//     Term (({Plus.left=current} '+' | {Minus.left=current} '-' ) right=Term)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Term (({Plus.left=current} '+' | {Minus.left=current} '-' ) right=Term)*
		public Group getGroup() { return cGroup; }
		
		//Term
		public RuleCall getTermParserRuleCall_0() { return cTermParserRuleCall_0; }
		
		//(({Plus.left=current} '+' | {Minus.left=current} '-' ) right=Term)*
		public Group getGroup_1() { return cGroup_1; }
		
		//({Plus.left=current} '+' | {Minus.left=current} '-' )
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Plus.left=current} '+'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0_0() { return cPlusLeftAction_1_0_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0_1() { return cPlusSignKeyword_1_0_0_1; }
		
		//{Minus.left=current} '-'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_0_1_0() { return cMinusLeftAction_1_0_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1_1() { return cHyphenMinusKeyword_1_0_1_1; }
		
		//right=Term
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Term
		public RuleCall getRightTermParserRuleCall_1_1_0() { return cRightTermParserRuleCall_1_1_0; }
	}
	public class TermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment2.Mathdsl.Term");
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
		
		//Term returns Expression:
		//    Primary (({Mult.left=current} '*' | {Div.left=current} '/') right=Primary)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary (({Mult.left=current} '*' | {Div.left=current} '/') right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//(({Mult.left=current} '*' | {Div.left=current} '/') right=Primary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//({Mult.left=current} '*' | {Div.left=current} '/')
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Mult.left=current} '*'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Mult.left=current}
		public Action getMultLeftAction_1_0_0_0() { return cMultLeftAction_1_0_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_0_1() { return cAsteriskKeyword_1_0_0_1; }
		
		//{Div.left=current} '/'
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment2.Mathdsl.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumberParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParenthesisParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cVariableUseParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLetBindingParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Primary returns Expression:
		//    Number | Parenthesis | VariableUse | LetBinding
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Number | Parenthesis | VariableUse | LetBinding
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Number
		public RuleCall getNumberParserRuleCall_0() { return cNumberParserRuleCall_0; }
		
		//Parenthesis
		public RuleCall getParenthesisParserRuleCall_1() { return cParenthesisParserRuleCall_1; }
		
		//VariableUse
		public RuleCall getVariableUseParserRuleCall_2() { return cVariableUseParserRuleCall_2; }
		
		//LetBinding
		public RuleCall getLetBindingParserRuleCall_3() { return cLetBindingParserRuleCall_3; }
	}
	public class BindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment2.Mathdsl.Binding");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLetBindingParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cVarBindingParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Binding:
		//    LetBinding | VarBinding
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//LetBinding | VarBinding
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LetBinding
		public RuleCall getLetBindingParserRuleCall_0() { return cLetBindingParserRuleCall_0; }
		
		//VarBinding
		public RuleCall getVarBindingParserRuleCall_1() { return cVarBindingParserRuleCall_1; }
	}
	public class LetBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment2.Mathdsl.LetBinding");
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
		
		///*VariableBinding returns Expression:
		//    {Let} 'let' var=ID '=' binding=Exp 'in' body=Exp 'end'
		//;*/
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
	public class ParenthesisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment2.Mathdsl.Parenthesis");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cExpParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Parenthesis returns Expression:
		//    '(' Exp ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Exp ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Exp
		public RuleCall getExpParserRuleCall_1() { return cExpParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment2.Mathdsl.Number");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNumAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Number returns Expression:
		//    {Num} value=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Num} value=INT
		public Group getGroup() { return cGroup; }
		
		//{Num}
		public Action getNumAction_0() { return cNumAction_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}
	public class VariableUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mdsd.assignment2.Mathdsl.VariableUse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVarUseAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefBindingCrossReference_1_0 = (CrossReference)cRefAssignment_1.eContents().get(0);
		private final RuleCall cRefBindingIDTerminalRuleCall_1_0_1 = (RuleCall)cRefBindingCrossReference_1_0.eContents().get(1);
		
		//VariableUse returns Expression:
		//    {VarUse} ref = [Binding]
		//    //{Var} ref=[MathExp] '.' id=ID
		//    //{Var} id=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{VarUse} ref = [Binding]
		public Group getGroup() { return cGroup; }
		
		//{VarUse}
		public Action getVarUseAction_0() { return cVarUseAction_0; }
		
		//ref = [Binding]
		public Assignment getRefAssignment_1() { return cRefAssignment_1; }
		
		//[Binding]
		public CrossReference getRefBindingCrossReference_1_0() { return cRefBindingCrossReference_1_0; }
		
		//ID
		public RuleCall getRefBindingIDTerminalRuleCall_1_0_1() { return cRefBindingIDTerminalRuleCall_1_0_1; }
	}
	
	
	private final MathExpElements pMathExp;
	private final VarBindingElements pVarBinding;
	private final ExpElements pExp;
	private final TermElements pTerm;
	private final PrimaryElements pPrimary;
	private final BindingElements pBinding;
	private final LetBindingElements pLetBinding;
	private final ParenthesisElements pParenthesis;
	private final NumberElements pNumber;
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
		this.pExp = new ExpElements();
		this.pTerm = new TermElements();
		this.pPrimary = new PrimaryElements();
		this.pBinding = new BindingElements();
		this.pLetBinding = new LetBindingElements();
		this.pParenthesis = new ParenthesisElements();
		this.pNumber = new NumberElements();
		this.pVariableUse = new VariableUseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.mdsd.assignment2.Mathdsl".equals(grammar.getName())) {
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
	//    //'var' name=ID '=' exp=Exp
	//    variables+=VarBinding*
	//;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//VarBinding:
	//    'var' name=ID '=' exp=Exp
	//;
	public VarBindingElements getVarBindingAccess() {
		return pVarBinding;
	}
	
	public ParserRule getVarBindingRule() {
		return getVarBindingAccess().getRule();
	}
	
	//Exp returns Expression:
	//     Term (({Plus.left=current} '+' | {Minus.left=current} '-' ) right=Term)*
	//;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//Term returns Expression:
	//    Primary (({Mult.left=current} '*' | {Div.left=current} '/') right=Primary)*
	//;
	public TermElements getTermAccess() {
		return pTerm;
	}
	
	public ParserRule getTermRule() {
		return getTermAccess().getRule();
	}
	
	//Primary returns Expression:
	//    Number | Parenthesis | VariableUse | LetBinding
	//;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Binding:
	//    LetBinding | VarBinding
	//;
	public BindingElements getBindingAccess() {
		return pBinding;
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
	}
	
	///*VariableBinding returns Expression:
	//    {Let} 'let' var=ID '=' binding=Exp 'in' body=Exp 'end'
	//;*/
	//LetBinding:
	//    'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
	//;
	public LetBindingElements getLetBindingAccess() {
		return pLetBinding;
	}
	
	public ParserRule getLetBindingRule() {
		return getLetBindingAccess().getRule();
	}
	
	//Parenthesis returns Expression:
	//    '(' Exp ')'
	//;
	public ParenthesisElements getParenthesisAccess() {
		return pParenthesis;
	}
	
	public ParserRule getParenthesisRule() {
		return getParenthesisAccess().getRule();
	}
	
	//Number returns Expression:
	//    {Num} value=INT
	//;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//VariableUse returns Expression:
	//    {VarUse} ref = [Binding]
	//    //{Var} ref=[MathExp] '.' id=ID
	//    //{Var} id=ID
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
