/*
 * generated by Xtext 2.30.0
 */
grammar InternalFictiondsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package interactive.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package interactive.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import interactive.services.FictiondslGrammarAccess;

}

@parser::members {

 	private FictiondslGrammarAccess grammarAccess;

    public InternalFictiondslParser(TokenStream input, FictiondslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Story";
   	}

   	@Override
   	protected FictiondslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleStory
entryRuleStory returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStoryRule()); }
	iv_ruleStory=ruleStory
	{ $current=$iv_ruleStory.current; }
	EOF;

// Rule Story
ruleStory returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='story'
		{
			newLeafNode(otherlv_0, grammarAccess.getStoryAccess().getStoryKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStoryRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStoryAccess().getExternalExternalParserRuleCall_2_0());
				}
				lv_external_2_0=ruleExternal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStoryRule());
					}
					add(
						$current,
						"external",
						lv_external_2_0,
						"interactive.Fictiondsl.External");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getStoryAccess().getScenarioScenarioParserRuleCall_3_0());
				}
				lv_scenario_3_0=ruleScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStoryRule());
					}
					add(
						$current,
						"scenario",
						lv_scenario_3_0,
						"interactive.Fictiondsl.Scenario");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleExternal
entryRuleExternal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalRule()); }
	iv_ruleExternal=ruleExternal
	{ $current=$iv_ruleExternal.current; }
	EOF;

// Rule External
ruleExternal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='function'
		{
			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getFunctionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExternalAccess().getTypeTypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExternalRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"interactive.Fictiondsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getExternalAccess().getRightParenthesisKeyword_4());
		}
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getExternalAccess().getColonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExternalAccess().getResultTypeParserRuleCall_6_0());
				}
				lv_result_6_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExternalRule());
					}
					set(
						$current,
						"result",
						lv_result_6_0,
						"interactive.Fictiondsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	iv_ruleScenario=ruleScenario
	{ $current=$iv_ruleScenario.current; }
	EOF;

// Rule Scenario
ruleScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='scenario'
		{
			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScenarioRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getVarVarDefParserRuleCall_3_0());
				}
				lv_var_3_0=ruleVarDef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"var",
						lv_var_3_0,
						"interactive.Fictiondsl.VarDef");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getStatementStatementParserRuleCall_4_0());
				}
				lv_statement_4_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"statement",
						lv_statement_4_0,
						"interactive.Fictiondsl.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleVarDef
entryRuleVarDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarDefRule()); }
	iv_ruleVarDef=ruleVarDef
	{ $current=$iv_ruleVarDef.current; }
	EOF;

// Rule VarDef
ruleVarDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='var'
		{
			newLeafNode(otherlv_0, grammarAccess.getVarDefAccess().getVarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarDefRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getVarDefAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVarDefAccess().getTypeExpParserRuleCall_3_0());
				}
				lv_type_3_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVarDefRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"interactive.Fictiondsl.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getAnnounceAnnounceParserRuleCall_0_0());
				}
				lv_announce_0_0=ruleAnnounce
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					add(
						$current,
						"announce",
						lv_announce_0_0,
						"interactive.Fictiondsl.Announce");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getEndEndParserRuleCall_1_0());
				}
				lv_end_1_0=ruleEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					add(
						$current,
						"end",
						lv_end_1_0,
						"interactive.Fictiondsl.End");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getQuestionQuestionParserRuleCall_2_0());
				}
				lv_question_2_0=ruleQuestion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					add(
						$current,
						"question",
						lv_question_2_0,
						"interactive.Fictiondsl.Question");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	iv_ruleQuestion=ruleQuestion
	{ $current=$iv_ruleQuestion.current; }
	EOF;

// Rule Question
ruleQuestion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='question'
		{
			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQuestionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getQuestionAccess().getExpressionExpParserRuleCall_2_0());
				}
				lv_expression_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuestionRule());
					}
					set(
						$current,
						"expression",
						lv_expression_2_0,
						"interactive.Fictiondsl.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='as'
			{
				newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getAsKeyword_3_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_3_1_0_0());
						}
						lv_type_4_0=ruleType
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getQuestionRule());
							}
							set(
								$current,
								"type",
								lv_type_4_0,
								"interactive.Fictiondsl.Type");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getQuestionRule());
								}
							}
							otherlv_5=RULE_ID
							{
								newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getExrefExternalCrossReference_3_1_1_0_0());
							}
						)
					)
					otherlv_6='('
					{
						newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_3_1_1_1());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_3_1_1_2_0());
							}
							lv_type_7_0=ruleType
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getQuestionRule());
								}
								set(
									$current,
									"type",
									lv_type_7_0,
									"interactive.Fictiondsl.Type");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_8=')'
					{
						newLeafNode(otherlv_8, grammarAccess.getQuestionAccess().getRightParenthesisKeyword_3_1_1_3());
					}
				)
			)
		)?
		(
			(
				(
					(
						lv_op_9_1='<'
						{
							newLeafNode(lv_op_9_1, grammarAccess.getQuestionAccess().getOpLessThanSignKeyword_4_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getQuestionRule());
							}
							setWithLastConsumed($current, "op", lv_op_9_1, null);
						}
						    |
						lv_op_9_2='<='
						{
							newLeafNode(lv_op_9_2, grammarAccess.getQuestionAccess().getOpLessThanSignEqualsSignKeyword_4_0_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getQuestionRule());
							}
							setWithLastConsumed($current, "op", lv_op_9_2, null);
						}
						    |
						lv_op_9_3='>'
						{
							newLeafNode(lv_op_9_3, grammarAccess.getQuestionAccess().getOpGreaterThanSignKeyword_4_0_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getQuestionRule());
							}
							setWithLastConsumed($current, "op", lv_op_9_3, null);
						}
						    |
						lv_op_9_4='>='
						{
							newLeafNode(lv_op_9_4, grammarAccess.getQuestionAccess().getOpGreaterThanSignEqualsSignKeyword_4_0_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getQuestionRule());
							}
							setWithLastConsumed($current, "op", lv_op_9_4, null);
						}
						    |
						lv_op_9_5='=='
						{
							newLeafNode(lv_op_9_5, grammarAccess.getQuestionAccess().getOpEqualsSignEqualsSignKeyword_4_0_0_4());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getQuestionRule());
							}
							setWithLastConsumed($current, "op", lv_op_9_5, null);
						}
						    |
						lv_op_9_6='!='
						{
							newLeafNode(lv_op_9_6, grammarAccess.getQuestionAccess().getOpExclamationMarkEqualsSignKeyword_4_0_0_5());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getQuestionRule());
							}
							setWithLastConsumed($current, "op", lv_op_9_6, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getQuestionAccess().getConditionExpParserRuleCall_4_1_0());
					}
					lv_condition_10_0=ruleExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getQuestionRule());
						}
						set(
							$current,
							"condition",
							lv_condition_10_0,
							"interactive.Fictiondsl.Exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_11='in'
			{
				newLeafNode(otherlv_11, grammarAccess.getQuestionAccess().getInKeyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getQuestionRule());
						}
					}
					otherlv_12=RULE_ID
					{
						newLeafNode(otherlv_12, grammarAccess.getQuestionAccess().getRefVarDefCrossReference_5_1_0());
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getQuestionAccess().getTargetTargetParserRuleCall_6_0());
				}
				lv_target_13_0=ruleTarget
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuestionRule());
					}
					add(
						$current,
						"target",
						lv_target_13_0,
						"interactive.Fictiondsl.Target");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleAnnounce
entryRuleAnnounce returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnounceRule()); }
	iv_ruleAnnounce=ruleAnnounce
	{ $current=$iv_ruleAnnounce.current; }
	EOF;

// Rule Announce
ruleAnnounce returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='announce'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnnounceAccess().getAnnounceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAnnounceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnounceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnounceAccess().getExpressionExpParserRuleCall_2_0());
				}
				lv_expression_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnounceRule());
					}
					set(
						$current,
						"expression",
						lv_expression_2_0,
						"interactive.Fictiondsl.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='&'
			{
				newLeafNode(otherlv_3, grammarAccess.getAnnounceAccess().getAmpersandKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAnnounceRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getAnnounceAccess().getRefVarDefCrossReference_3_1_0());
					}
				)
			)
			otherlv_5='&'
			{
				newLeafNode(otherlv_5, grammarAccess.getAnnounceAccess().getAmpersandKeyword_3_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAnnounceAccess().getExpExpParserRuleCall_3_3_0());
					}
					lv_exp_6_0=ruleExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAnnounceRule());
						}
						set(
							$current,
							"exp",
							lv_exp_6_0,
							"interactive.Fictiondsl.Exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnounceAccess().getTargetTargetParserRuleCall_4_0());
				}
				lv_target_7_0=ruleTarget
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnounceRule());
					}
					set(
						$current,
						"target",
						lv_target_7_0,
						"interactive.Fictiondsl.Target");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTarget
entryRuleTarget returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetRule()); }
	iv_ruleTarget=ruleTarget
	{ $current=$iv_ruleTarget.current; }
	EOF;

// Rule Target
ruleTarget returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='to'
		{
			newLeafNode(otherlv_0, grammarAccess.getTargetAccess().getToKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTargetRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getTargetAccess().getRefSomeRefCrossReference_1_0());
				}
			)
		)
		(
			otherlv_2='if'
			{
				newLeafNode(otherlv_2, grammarAccess.getTargetAccess().getIfKeyword_2_0());
			}
			(
				(
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getTargetRule());
								}
							}
							otherlv_3=RULE_ID
							{
								newLeafNode(otherlv_3, grammarAccess.getTargetAccess().getExrefExternalCrossReference_2_1_0_0_0());
							}
						)
					)
					(
						otherlv_4='('
						{
							newLeafNode(otherlv_4, grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_1_0_1_0());
						}
						(
							otherlv_5='this'
							{
								newLeafNode(otherlv_5, grammarAccess.getTargetAccess().getThisKeyword_2_1_0_1_1_0());
							}
							    |
							(
								(
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getTargetRule());
										}
									}
									otherlv_6=RULE_ID
									{
										newLeafNode(otherlv_6, grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_0_1_1_1_0());
									}
								)
							)
						)
						otherlv_7=')'
						{
							newLeafNode(otherlv_7, grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_1_0_1_2());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_0_1_3_0());
								}
								lv_condition_8_0=ruleExp
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getTargetRule());
									}
									set(
										$current,
										"condition",
										lv_condition_8_0,
										"interactive.Fictiondsl.Exp");
									afterParserOrEnumRuleCall();
								}
							)
						)?
					)?
				)
				    |
				(
					otherlv_9='('
					{
						newLeafNode(otherlv_9, grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_1_1_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getTargetRule());
								}
							}
							otherlv_10=RULE_ID
							{
								newLeafNode(otherlv_10, grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_1_1_0());
							}
						)
					)
					otherlv_11=')'
					{
						newLeafNode(otherlv_11, grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_1_1_2());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getTargetAccess().getResExpParserRuleCall_2_1_1_3_0());
							}
							lv_res_12_0=ruleExp
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getTargetRule());
								}
								set(
									$current,
									"res",
									lv_res_12_0,
									"interactive.Fictiondsl.Exp");
								afterParserOrEnumRuleCall();
							}
						)
					)?
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_2_0());
						}
						lv_condition_13_0=ruleExp
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTargetRule());
							}
							set(
								$current,
								"condition",
								lv_condition_13_0,
								"interactive.Fictiondsl.Exp");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getTargetRule());
								}
							}
							otherlv_14=RULE_ID
							{
								newLeafNode(otherlv_14, grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_3_0_0());
							}
						)
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_3_1_0());
							}
							lv_condition_15_0=ruleExp
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getTargetRule());
								}
								set(
									$current,
									"condition",
									lv_condition_15_0,
									"interactive.Fictiondsl.Exp");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
		)?
	)
;

// Entry rule entryRuleEnd
entryRuleEnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEndRule()); }
	iv_ruleEnd=ruleEnd
	{ $current=$iv_ruleEnd.current; }
	EOF;

// Rule End
ruleEnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='end'
		{
			newLeafNode(otherlv_0, grammarAccess.getEndAccess().getEndKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEndAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEndRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEndAccess().getExpressionExpParserRuleCall_2_0());
				}
				lv_expression_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEndRule());
					}
					set(
						$current,
						"expression",
						lv_expression_2_0,
						"interactive.Fictiondsl.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='&'
			{
				newLeafNode(otherlv_3, grammarAccess.getEndAccess().getAmpersandKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEndRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getEndAccess().getRefVarDefCrossReference_3_1_0());
					}
				)
			)
			otherlv_5='&'
			{
				newLeafNode(otherlv_5, grammarAccess.getEndAccess().getAmpersandKeyword_3_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEndAccess().getExpExpParserRuleCall_3_3_0());
					}
					lv_exp_6_0=ruleExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEndRule());
						}
						set(
							$current,
							"exp",
							lv_exp_6_0,
							"interactive.Fictiondsl.Exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getExpAccess().getEndingAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0=RULE_STRING
					{
						newLeafNode(lv_value_1_0, grammarAccess.getExpAccess().getValueSTRINGTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExpRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				lv_number_2_0=RULE_INT
				{
					newLeafNode(lv_number_2_0, grammarAccess.getExpAccess().getNumberINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExpRule());
					}
					setWithLastConsumed(
						$current,
						"number",
						lv_number_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExpAccess().getTypeTypeParserRuleCall_2_0());
				}
				lv_type_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"interactive.Fictiondsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			otherlv_4='this'
			{
				newLeafNode(otherlv_4, grammarAccess.getExpAccess().getThisKeyword_3_0());
			}
			{
				newCompositeNode(grammarAccess.getExpAccess().getEvaluateParserRuleCall_3_1());
			}
			this_Evaluate_5=ruleEvaluate
			{
				$current = $this_Evaluate_5.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getExpAccess().getEvaluateParserRuleCall_4());
		}
		this_Evaluate_6=ruleEvaluate
		{
			$current = $this_Evaluate_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEvaluate
entryRuleEvaluate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvaluateRule()); }
	iv_ruleEvaluate=ruleEvaluate
	{ $current=$iv_ruleEvaluate.current; }
	EOF;

// Rule Evaluate
ruleEvaluate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					(
						lv_add_0_1='+'
						{
							newLeafNode(lv_add_0_1, grammarAccess.getEvaluateAccess().getAddPlusSignKeyword_0_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEvaluateRule());
							}
							setWithLastConsumed($current, "add", lv_add_0_1, null);
						}
						    |
						lv_add_0_2='-'
						{
							newLeafNode(lv_add_0_2, grammarAccess.getEvaluateAccess().getAddHyphenMinusKeyword_0_0_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEvaluateRule());
							}
							setWithLastConsumed($current, "add", lv_add_0_2, null);
						}
					)
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluateRule());
						}
					}
					otherlv_1=RULE_ID
					{
						newLeafNode(otherlv_1, grammarAccess.getEvaluateAccess().getRefVarDefCrossReference_0_1_0());
					}
				)
			)
		)?
		(
			(
				(
					lv_op_2_1='<'
					{
						newLeafNode(lv_op_2_1, grammarAccess.getEvaluateAccess().getOpLessThanSignKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluateRule());
						}
						setWithLastConsumed($current, "op", lv_op_2_1, null);
					}
					    |
					lv_op_2_2='<='
					{
						newLeafNode(lv_op_2_2, grammarAccess.getEvaluateAccess().getOpLessThanSignEqualsSignKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluateRule());
						}
						setWithLastConsumed($current, "op", lv_op_2_2, null);
					}
					    |
					lv_op_2_3='>'
					{
						newLeafNode(lv_op_2_3, grammarAccess.getEvaluateAccess().getOpGreaterThanSignKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluateRule());
						}
						setWithLastConsumed($current, "op", lv_op_2_3, null);
					}
					    |
					lv_op_2_4='>='
					{
						newLeafNode(lv_op_2_4, grammarAccess.getEvaluateAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluateRule());
						}
						setWithLastConsumed($current, "op", lv_op_2_4, null);
					}
					    |
					lv_op_2_5='=='
					{
						newLeafNode(lv_op_2_5, grammarAccess.getEvaluateAccess().getOpEqualsSignEqualsSignKeyword_1_0_4());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluateRule());
						}
						setWithLastConsumed($current, "op", lv_op_2_5, null);
					}
					    |
					lv_op_2_6='!='
					{
						newLeafNode(lv_op_2_6, grammarAccess.getEvaluateAccess().getOpExclamationMarkEqualsSignKeyword_1_0_5());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEvaluateRule());
						}
						setWithLastConsumed($current, "op", lv_op_2_6, null);
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEvaluateAccess().getExpExpParserRuleCall_2_0());
				}
				lv_exp_3_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEvaluateRule());
					}
					set(
						$current,
						"exp",
						lv_exp_3_0,
						"interactive.Fictiondsl.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleType
entryRuleType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current.getText(); }
	EOF;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='text'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getTextKeyword_0());
		}
		    |
		kw='number'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getNumberKeyword_1());
		}
		    |
		kw='boolean'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_2());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
