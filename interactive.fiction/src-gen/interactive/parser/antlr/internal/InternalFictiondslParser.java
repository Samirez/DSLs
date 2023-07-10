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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFictiondslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'story'", "'function'", "'('", "')'", "':'", "'scenario'", "'{'", "'}'", "'var'", "'question'", "'as'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'in'", "'announce'", "'&'", "'to'", "'if'", "'this'", "'end'", "'+'", "'-'", "'text'", "'number'", "'boolean'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFictiondslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFictiondslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFictiondslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFictiondsl.g"; }



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




    // $ANTLR start "entryRuleStory"
    // InternalFictiondsl.g:64:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // InternalFictiondsl.g:64:46: (iv_ruleStory= ruleStory EOF )
            // InternalFictiondsl.g:65:2: iv_ruleStory= ruleStory EOF
            {
             newCompositeNode(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStory=ruleStory();

            state._fsp--;

             current =iv_ruleStory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalFictiondsl.g:71:1: ruleStory returns [EObject current=null] : (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_external_2_0= ruleExternal ) )* ( (lv_scenario_3_0= ruleScenario ) )* ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_external_2_0 = null;

        EObject lv_scenario_3_0 = null;



        	enterRule();

        try {
            // InternalFictiondsl.g:77:2: ( (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_external_2_0= ruleExternal ) )* ( (lv_scenario_3_0= ruleScenario ) )* ) )
            // InternalFictiondsl.g:78:2: (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_external_2_0= ruleExternal ) )* ( (lv_scenario_3_0= ruleScenario ) )* )
            {
            // InternalFictiondsl.g:78:2: (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_external_2_0= ruleExternal ) )* ( (lv_scenario_3_0= ruleScenario ) )* )
            // InternalFictiondsl.g:79:3: otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_external_2_0= ruleExternal ) )* ( (lv_scenario_3_0= ruleScenario ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStoryAccess().getStoryKeyword_0());
            		
            // InternalFictiondsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFictiondsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFictiondsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalFictiondsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFictiondsl.g:101:3: ( (lv_external_2_0= ruleExternal ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFictiondsl.g:102:4: (lv_external_2_0= ruleExternal )
            	    {
            	    // InternalFictiondsl.g:102:4: (lv_external_2_0= ruleExternal )
            	    // InternalFictiondsl.g:103:5: lv_external_2_0= ruleExternal
            	    {

            	    					newCompositeNode(grammarAccess.getStoryAccess().getExternalExternalParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_external_2_0=ruleExternal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"external",
            	    						lv_external_2_0,
            	    						"interactive.Fictiondsl.External");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFictiondsl.g:120:3: ( (lv_scenario_3_0= ruleScenario ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFictiondsl.g:121:4: (lv_scenario_3_0= ruleScenario )
            	    {
            	    // InternalFictiondsl.g:121:4: (lv_scenario_3_0= ruleScenario )
            	    // InternalFictiondsl.g:122:5: lv_scenario_3_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getStoryAccess().getScenarioScenarioParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_scenario_3_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenario",
            	    						lv_scenario_3_0,
            	    						"interactive.Fictiondsl.Scenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleExternal"
    // InternalFictiondsl.g:143:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalFictiondsl.g:143:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalFictiondsl.g:144:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalFictiondsl.g:150:1: ruleExternal returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_result_6_0= ruleType ) ) ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_result_6_0 = null;



        	enterRule();

        try {
            // InternalFictiondsl.g:156:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_result_6_0= ruleType ) ) ) )
            // InternalFictiondsl.g:157:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_result_6_0= ruleType ) ) )
            {
            // InternalFictiondsl.g:157:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_result_6_0= ruleType ) ) )
            // InternalFictiondsl.g:158:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_result_6_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getFunctionKeyword_0());
            		
            // InternalFictiondsl.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFictiondsl.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFictiondsl.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalFictiondsl.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFictiondsl.g:184:3: ( (lv_type_3_0= ruleType ) )
            // InternalFictiondsl.g:185:4: (lv_type_3_0= ruleType )
            {
            // InternalFictiondsl.g:185:4: (lv_type_3_0= ruleType )
            // InternalFictiondsl.g:186:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getExternalAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"interactive.Fictiondsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getExternalAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalAccess().getColonKeyword_5());
            		
            // InternalFictiondsl.g:211:3: ( (lv_result_6_0= ruleType ) )
            // InternalFictiondsl.g:212:4: (lv_result_6_0= ruleType )
            {
            // InternalFictiondsl.g:212:4: (lv_result_6_0= ruleType )
            // InternalFictiondsl.g:213:5: lv_result_6_0= ruleType
            {

            					newCompositeNode(grammarAccess.getExternalAccess().getResultTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_result_6_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_6_0,
            						"interactive.Fictiondsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleScenario"
    // InternalFictiondsl.g:234:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalFictiondsl.g:234:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalFictiondsl.g:235:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalFictiondsl.g:241:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_var_3_0= ruleVarDef ) )* ( (lv_statement_4_0= ruleStatement ) )* otherlv_5= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_var_3_0 = null;

        EObject lv_statement_4_0 = null;



        	enterRule();

        try {
            // InternalFictiondsl.g:247:2: ( (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_var_3_0= ruleVarDef ) )* ( (lv_statement_4_0= ruleStatement ) )* otherlv_5= '}' ) )
            // InternalFictiondsl.g:248:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_var_3_0= ruleVarDef ) )* ( (lv_statement_4_0= ruleStatement ) )* otherlv_5= '}' )
            {
            // InternalFictiondsl.g:248:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_var_3_0= ruleVarDef ) )* ( (lv_statement_4_0= ruleStatement ) )* otherlv_5= '}' )
            // InternalFictiondsl.g:249:3: otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_var_3_0= ruleVarDef ) )* ( (lv_statement_4_0= ruleStatement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalFictiondsl.g:253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFictiondsl.g:254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFictiondsl.g:254:4: (lv_name_1_0= RULE_ID )
            // InternalFictiondsl.g:255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFictiondsl.g:275:3: ( (lv_var_3_0= ruleVarDef ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFictiondsl.g:276:4: (lv_var_3_0= ruleVarDef )
            	    {
            	    // InternalFictiondsl.g:276:4: (lv_var_3_0= ruleVarDef )
            	    // InternalFictiondsl.g:277:5: lv_var_3_0= ruleVarDef
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getVarVarDefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_var_3_0=ruleVarDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"var",
            	    						lv_var_3_0,
            	    						"interactive.Fictiondsl.VarDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalFictiondsl.g:294:3: ( (lv_statement_4_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20||LA4_0==29||LA4_0==34) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFictiondsl.g:295:4: (lv_statement_4_0= ruleStatement )
            	    {
            	    // InternalFictiondsl.g:295:4: (lv_statement_4_0= ruleStatement )
            	    // InternalFictiondsl.g:296:5: lv_statement_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStatementStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_statement_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statement",
            	    						lv_statement_4_0,
            	    						"interactive.Fictiondsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleVarDef"
    // InternalFictiondsl.g:321:1: entryRuleVarDef returns [EObject current=null] : iv_ruleVarDef= ruleVarDef EOF ;
    public final EObject entryRuleVarDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDef = null;


        try {
            // InternalFictiondsl.g:321:47: (iv_ruleVarDef= ruleVarDef EOF )
            // InternalFictiondsl.g:322:2: iv_ruleVarDef= ruleVarDef EOF
            {
             newCompositeNode(grammarAccess.getVarDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDef=ruleVarDef();

            state._fsp--;

             current =iv_ruleVarDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDef"


    // $ANTLR start "ruleVarDef"
    // InternalFictiondsl.g:328:1: ruleVarDef returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleExp ) ) ) ;
    public final EObject ruleVarDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalFictiondsl.g:334:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleExp ) ) ) )
            // InternalFictiondsl.g:335:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleExp ) ) )
            {
            // InternalFictiondsl.g:335:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleExp ) ) )
            // InternalFictiondsl.g:336:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarDefAccess().getVarKeyword_0());
            		
            // InternalFictiondsl.g:340:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFictiondsl.g:341:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFictiondsl.g:341:4: (lv_name_1_0= RULE_ID )
            // InternalFictiondsl.g:342:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getVarDefAccess().getColonKeyword_2());
            		
            // InternalFictiondsl.g:362:3: ( (lv_type_3_0= ruleExp ) )
            // InternalFictiondsl.g:363:4: (lv_type_3_0= ruleExp )
            {
            // InternalFictiondsl.g:363:4: (lv_type_3_0= ruleExp )
            // InternalFictiondsl.g:364:5: lv_type_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarDefAccess().getTypeExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"interactive.Fictiondsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDef"


    // $ANTLR start "entryRuleStatement"
    // InternalFictiondsl.g:385:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalFictiondsl.g:385:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalFictiondsl.g:386:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalFictiondsl.g:392:1: ruleStatement returns [EObject current=null] : ( ( (lv_announce_0_0= ruleAnnounce ) ) | ( (lv_end_1_0= ruleEnd ) ) | ( (lv_question_2_0= ruleQuestion ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_announce_0_0 = null;

        EObject lv_end_1_0 = null;

        EObject lv_question_2_0 = null;



        	enterRule();

        try {
            // InternalFictiondsl.g:398:2: ( ( ( (lv_announce_0_0= ruleAnnounce ) ) | ( (lv_end_1_0= ruleEnd ) ) | ( (lv_question_2_0= ruleQuestion ) ) ) )
            // InternalFictiondsl.g:399:2: ( ( (lv_announce_0_0= ruleAnnounce ) ) | ( (lv_end_1_0= ruleEnd ) ) | ( (lv_question_2_0= ruleQuestion ) ) )
            {
            // InternalFictiondsl.g:399:2: ( ( (lv_announce_0_0= ruleAnnounce ) ) | ( (lv_end_1_0= ruleEnd ) ) | ( (lv_question_2_0= ruleQuestion ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 34:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFictiondsl.g:400:3: ( (lv_announce_0_0= ruleAnnounce ) )
                    {
                    // InternalFictiondsl.g:400:3: ( (lv_announce_0_0= ruleAnnounce ) )
                    // InternalFictiondsl.g:401:4: (lv_announce_0_0= ruleAnnounce )
                    {
                    // InternalFictiondsl.g:401:4: (lv_announce_0_0= ruleAnnounce )
                    // InternalFictiondsl.g:402:5: lv_announce_0_0= ruleAnnounce
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getAnnounceAnnounceParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_announce_0_0=ruleAnnounce();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					add(
                    						current,
                    						"announce",
                    						lv_announce_0_0,
                    						"interactive.Fictiondsl.Announce");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:420:3: ( (lv_end_1_0= ruleEnd ) )
                    {
                    // InternalFictiondsl.g:420:3: ( (lv_end_1_0= ruleEnd ) )
                    // InternalFictiondsl.g:421:4: (lv_end_1_0= ruleEnd )
                    {
                    // InternalFictiondsl.g:421:4: (lv_end_1_0= ruleEnd )
                    // InternalFictiondsl.g:422:5: lv_end_1_0= ruleEnd
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getEndEndParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_end_1_0=ruleEnd();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					add(
                    						current,
                    						"end",
                    						lv_end_1_0,
                    						"interactive.Fictiondsl.End");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFictiondsl.g:440:3: ( (lv_question_2_0= ruleQuestion ) )
                    {
                    // InternalFictiondsl.g:440:3: ( (lv_question_2_0= ruleQuestion ) )
                    // InternalFictiondsl.g:441:4: (lv_question_2_0= ruleQuestion )
                    {
                    // InternalFictiondsl.g:441:4: (lv_question_2_0= ruleQuestion )
                    // InternalFictiondsl.g:442:5: lv_question_2_0= ruleQuestion
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getQuestionQuestionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_question_2_0=ruleQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					add(
                    						current,
                    						"question",
                    						lv_question_2_0,
                    						"interactive.Fictiondsl.Question");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleQuestion"
    // InternalFictiondsl.g:463:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalFictiondsl.g:463:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalFictiondsl.g:464:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalFictiondsl.g:470:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= 'as' ( ( (lv_type_4_0= ruleType ) ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_type_7_0= ruleType ) ) otherlv_8= ')' ) ) )? ( ( ( (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' ) ) ) ( (lv_condition_10_0= ruleExp ) ) )? (otherlv_11= 'in' ( (otherlv_12= RULE_ID ) ) )? ( (lv_target_13_0= ruleTarget ) )+ ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_op_9_1=null;
        Token lv_op_9_2=null;
        Token lv_op_9_3=null;
        Token lv_op_9_4=null;
        Token lv_op_9_5=null;
        Token lv_op_9_6=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_expression_2_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;

        EObject lv_condition_10_0 = null;

        EObject lv_target_13_0 = null;



        	enterRule();

        try {
            // InternalFictiondsl.g:476:2: ( (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= 'as' ( ( (lv_type_4_0= ruleType ) ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_type_7_0= ruleType ) ) otherlv_8= ')' ) ) )? ( ( ( (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' ) ) ) ( (lv_condition_10_0= ruleExp ) ) )? (otherlv_11= 'in' ( (otherlv_12= RULE_ID ) ) )? ( (lv_target_13_0= ruleTarget ) )+ ) )
            // InternalFictiondsl.g:477:2: (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= 'as' ( ( (lv_type_4_0= ruleType ) ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_type_7_0= ruleType ) ) otherlv_8= ')' ) ) )? ( ( ( (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' ) ) ) ( (lv_condition_10_0= ruleExp ) ) )? (otherlv_11= 'in' ( (otherlv_12= RULE_ID ) ) )? ( (lv_target_13_0= ruleTarget ) )+ )
            {
            // InternalFictiondsl.g:477:2: (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= 'as' ( ( (lv_type_4_0= ruleType ) ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_type_7_0= ruleType ) ) otherlv_8= ')' ) ) )? ( ( ( (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' ) ) ) ( (lv_condition_10_0= ruleExp ) ) )? (otherlv_11= 'in' ( (otherlv_12= RULE_ID ) ) )? ( (lv_target_13_0= ruleTarget ) )+ )
            // InternalFictiondsl.g:478:3: otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= 'as' ( ( (lv_type_4_0= ruleType ) ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_type_7_0= ruleType ) ) otherlv_8= ')' ) ) )? ( ( ( (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' ) ) ) ( (lv_condition_10_0= ruleExp ) ) )? (otherlv_11= 'in' ( (otherlv_12= RULE_ID ) ) )? ( (lv_target_13_0= ruleTarget ) )+
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
            		
            // InternalFictiondsl.g:482:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFictiondsl.g:483:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFictiondsl.g:483:4: (lv_name_1_0= RULE_ID )
            // InternalFictiondsl.g:484:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFictiondsl.g:500:3: ( (lv_expression_2_0= ruleExp ) )
            // InternalFictiondsl.g:501:4: (lv_expression_2_0= ruleExp )
            {
            // InternalFictiondsl.g:501:4: (lv_expression_2_0= ruleExp )
            // InternalFictiondsl.g:502:5: lv_expression_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getExpressionExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_expression_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"interactive.Fictiondsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFictiondsl.g:519:3: (otherlv_3= 'as' ( ( (lv_type_4_0= ruleType ) ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_type_7_0= ruleType ) ) otherlv_8= ')' ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFictiondsl.g:520:4: otherlv_3= 'as' ( ( (lv_type_4_0= ruleType ) ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_type_7_0= ruleType ) ) otherlv_8= ')' ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getAsKeyword_3_0());
                    			
                    // InternalFictiondsl.g:524:4: ( ( (lv_type_4_0= ruleType ) ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_type_7_0= ruleType ) ) otherlv_8= ')' ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=37 && LA6_0<=39)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_ID) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalFictiondsl.g:525:5: ( (lv_type_4_0= ruleType ) )
                            {
                            // InternalFictiondsl.g:525:5: ( (lv_type_4_0= ruleType ) )
                            // InternalFictiondsl.g:526:6: (lv_type_4_0= ruleType )
                            {
                            // InternalFictiondsl.g:526:6: (lv_type_4_0= ruleType )
                            // InternalFictiondsl.g:527:7: lv_type_4_0= ruleType
                            {

                            							newCompositeNode(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_type_4_0=ruleType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getQuestionRule());
                            							}
                            							set(
                            								current,
                            								"type",
                            								lv_type_4_0,
                            								"interactive.Fictiondsl.Type");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFictiondsl.g:545:5: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_type_7_0= ruleType ) ) otherlv_8= ')' )
                            {
                            // InternalFictiondsl.g:545:5: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_type_7_0= ruleType ) ) otherlv_8= ')' )
                            // InternalFictiondsl.g:546:6: ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_type_7_0= ruleType ) ) otherlv_8= ')'
                            {
                            // InternalFictiondsl.g:546:6: ( (otherlv_5= RULE_ID ) )
                            // InternalFictiondsl.g:547:7: (otherlv_5= RULE_ID )
                            {
                            // InternalFictiondsl.g:547:7: (otherlv_5= RULE_ID )
                            // InternalFictiondsl.g:548:8: otherlv_5= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getQuestionRule());
                            								}
                            							
                            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

                            								newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getExrefExternalCrossReference_3_1_1_0_0());
                            							

                            }


                            }

                            otherlv_6=(Token)match(input,13,FOLLOW_7); 

                            						newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_3_1_1_1());
                            					
                            // InternalFictiondsl.g:563:6: ( (lv_type_7_0= ruleType ) )
                            // InternalFictiondsl.g:564:7: (lv_type_7_0= ruleType )
                            {
                            // InternalFictiondsl.g:564:7: (lv_type_7_0= ruleType )
                            // InternalFictiondsl.g:565:8: lv_type_7_0= ruleType
                            {

                            								newCompositeNode(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_3_1_1_2_0());
                            							
                            pushFollow(FOLLOW_8);
                            lv_type_7_0=ruleType();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getQuestionRule());
                            								}
                            								set(
                            									current,
                            									"type",
                            									lv_type_7_0,
                            									"interactive.Fictiondsl.Type");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_8=(Token)match(input,14,FOLLOW_14); 

                            						newLeafNode(otherlv_8, grammarAccess.getQuestionAccess().getRightParenthesisKeyword_3_1_1_3());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalFictiondsl.g:589:3: ( ( ( (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' ) ) ) ( (lv_condition_10_0= ruleExp ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=22 && LA9_0<=27)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFictiondsl.g:590:4: ( ( (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' ) ) ) ( (lv_condition_10_0= ruleExp ) )
                    {
                    // InternalFictiondsl.g:590:4: ( ( (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' ) ) )
                    // InternalFictiondsl.g:591:5: ( (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' ) )
                    {
                    // InternalFictiondsl.g:591:5: ( (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' ) )
                    // InternalFictiondsl.g:592:6: (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' )
                    {
                    // InternalFictiondsl.g:592:6: (lv_op_9_1= '<' | lv_op_9_2= '<=' | lv_op_9_3= '>' | lv_op_9_4= '>=' | lv_op_9_5= '==' | lv_op_9_6= '!=' )
                    int alt8=6;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt8=1;
                        }
                        break;
                    case 23:
                        {
                        alt8=2;
                        }
                        break;
                    case 24:
                        {
                        alt8=3;
                        }
                        break;
                    case 25:
                        {
                        alt8=4;
                        }
                        break;
                    case 26:
                        {
                        alt8=5;
                        }
                        break;
                    case 27:
                        {
                        alt8=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // InternalFictiondsl.g:593:7: lv_op_9_1= '<'
                            {
                            lv_op_9_1=(Token)match(input,22,FOLLOW_13); 

                            							newLeafNode(lv_op_9_1, grammarAccess.getQuestionAccess().getOpLessThanSignKeyword_4_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQuestionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalFictiondsl.g:604:7: lv_op_9_2= '<='
                            {
                            lv_op_9_2=(Token)match(input,23,FOLLOW_13); 

                            							newLeafNode(lv_op_9_2, grammarAccess.getQuestionAccess().getOpLessThanSignEqualsSignKeyword_4_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQuestionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalFictiondsl.g:615:7: lv_op_9_3= '>'
                            {
                            lv_op_9_3=(Token)match(input,24,FOLLOW_13); 

                            							newLeafNode(lv_op_9_3, grammarAccess.getQuestionAccess().getOpGreaterThanSignKeyword_4_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQuestionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalFictiondsl.g:626:7: lv_op_9_4= '>='
                            {
                            lv_op_9_4=(Token)match(input,25,FOLLOW_13); 

                            							newLeafNode(lv_op_9_4, grammarAccess.getQuestionAccess().getOpGreaterThanSignEqualsSignKeyword_4_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQuestionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalFictiondsl.g:637:7: lv_op_9_5= '=='
                            {
                            lv_op_9_5=(Token)match(input,26,FOLLOW_13); 

                            							newLeafNode(lv_op_9_5, grammarAccess.getQuestionAccess().getOpEqualsSignEqualsSignKeyword_4_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQuestionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_9_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalFictiondsl.g:648:7: lv_op_9_6= '!='
                            {
                            lv_op_9_6=(Token)match(input,27,FOLLOW_13); 

                            							newLeafNode(lv_op_9_6, grammarAccess.getQuestionAccess().getOpExclamationMarkEqualsSignKeyword_4_0_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQuestionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_9_6, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalFictiondsl.g:661:4: ( (lv_condition_10_0= ruleExp ) )
                    // InternalFictiondsl.g:662:5: (lv_condition_10_0= ruleExp )
                    {
                    // InternalFictiondsl.g:662:5: (lv_condition_10_0= ruleExp )
                    // InternalFictiondsl.g:663:6: lv_condition_10_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getConditionExpParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_condition_10_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_10_0,
                    							"interactive.Fictiondsl.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFictiondsl.g:681:3: (otherlv_11= 'in' ( (otherlv_12= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFictiondsl.g:682:4: otherlv_11= 'in' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getQuestionAccess().getInKeyword_5_0());
                    			
                    // InternalFictiondsl.g:686:4: ( (otherlv_12= RULE_ID ) )
                    // InternalFictiondsl.g:687:5: (otherlv_12= RULE_ID )
                    {
                    // InternalFictiondsl.g:687:5: (otherlv_12= RULE_ID )
                    // InternalFictiondsl.g:688:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_12, grammarAccess.getQuestionAccess().getRefVarDefCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFictiondsl.g:700:3: ( (lv_target_13_0= ruleTarget ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFictiondsl.g:701:4: (lv_target_13_0= ruleTarget )
            	    {
            	    // InternalFictiondsl.g:701:4: (lv_target_13_0= ruleTarget )
            	    // InternalFictiondsl.g:702:5: lv_target_13_0= ruleTarget
            	    {

            	    					newCompositeNode(grammarAccess.getQuestionAccess().getTargetTargetParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_target_13_0=ruleTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"target",
            	    						lv_target_13_0,
            	    						"interactive.Fictiondsl.Target");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleAnnounce"
    // InternalFictiondsl.g:723:1: entryRuleAnnounce returns [EObject current=null] : iv_ruleAnnounce= ruleAnnounce EOF ;
    public final EObject entryRuleAnnounce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnounce = null;


        try {
            // InternalFictiondsl.g:723:49: (iv_ruleAnnounce= ruleAnnounce EOF )
            // InternalFictiondsl.g:724:2: iv_ruleAnnounce= ruleAnnounce EOF
            {
             newCompositeNode(grammarAccess.getAnnounceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnounce=ruleAnnounce();

            state._fsp--;

             current =iv_ruleAnnounce; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnounce"


    // $ANTLR start "ruleAnnounce"
    // InternalFictiondsl.g:730:1: ruleAnnounce returns [EObject current=null] : (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )? ( (lv_target_7_0= ruleTarget ) ) ) ;
    public final EObject ruleAnnounce() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_exp_6_0 = null;

        EObject lv_target_7_0 = null;



        	enterRule();

        try {
            // InternalFictiondsl.g:736:2: ( (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )? ( (lv_target_7_0= ruleTarget ) ) ) )
            // InternalFictiondsl.g:737:2: (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )? ( (lv_target_7_0= ruleTarget ) ) )
            {
            // InternalFictiondsl.g:737:2: (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )? ( (lv_target_7_0= ruleTarget ) ) )
            // InternalFictiondsl.g:738:3: otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )? ( (lv_target_7_0= ruleTarget ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnounceAccess().getAnnounceKeyword_0());
            		
            // InternalFictiondsl.g:742:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFictiondsl.g:743:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFictiondsl.g:743:4: (lv_name_1_0= RULE_ID )
            // InternalFictiondsl.g:744:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnnounceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnounceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFictiondsl.g:760:3: ( (lv_expression_2_0= ruleExp ) )
            // InternalFictiondsl.g:761:4: (lv_expression_2_0= ruleExp )
            {
            // InternalFictiondsl.g:761:4: (lv_expression_2_0= ruleExp )
            // InternalFictiondsl.g:762:5: lv_expression_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getAnnounceAccess().getExpressionExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_expression_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnounceRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"interactive.Fictiondsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFictiondsl.g:779:3: (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFictiondsl.g:780:4: otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAnnounceAccess().getAmpersandKeyword_3_0());
                    			
                    // InternalFictiondsl.g:784:4: ( (otherlv_4= RULE_ID ) )
                    // InternalFictiondsl.g:785:5: (otherlv_4= RULE_ID )
                    {
                    // InternalFictiondsl.g:785:5: (otherlv_4= RULE_ID )
                    // InternalFictiondsl.g:786:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnnounceRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_4, grammarAccess.getAnnounceAccess().getRefVarDefCrossReference_3_1_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getAnnounceAccess().getAmpersandKeyword_3_2());
                    			
                    // InternalFictiondsl.g:801:4: ( (lv_exp_6_0= ruleExp ) )
                    // InternalFictiondsl.g:802:5: (lv_exp_6_0= ruleExp )
                    {
                    // InternalFictiondsl.g:802:5: (lv_exp_6_0= ruleExp )
                    // InternalFictiondsl.g:803:6: lv_exp_6_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getAnnounceAccess().getExpExpParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_exp_6_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnnounceRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_6_0,
                    							"interactive.Fictiondsl.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFictiondsl.g:821:3: ( (lv_target_7_0= ruleTarget ) )
            // InternalFictiondsl.g:822:4: (lv_target_7_0= ruleTarget )
            {
            // InternalFictiondsl.g:822:4: (lv_target_7_0= ruleTarget )
            // InternalFictiondsl.g:823:5: lv_target_7_0= ruleTarget
            {

            					newCompositeNode(grammarAccess.getAnnounceAccess().getTargetTargetParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_7_0=ruleTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnounceRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_7_0,
            						"interactive.Fictiondsl.Target");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnounce"


    // $ANTLR start "entryRuleTarget"
    // InternalFictiondsl.g:844:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalFictiondsl.g:844:47: (iv_ruleTarget= ruleTarget EOF )
            // InternalFictiondsl.g:845:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalFictiondsl.g:851:1: ruleTarget returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )? ) | (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' ( (lv_res_12_0= ruleExp ) )? ) | ( (lv_condition_13_0= ruleExp ) ) | ( ( (otherlv_14= RULE_ID ) ) ( (lv_condition_15_0= ruleExp ) ) ) ) )? ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_condition_8_0 = null;

        EObject lv_res_12_0 = null;

        EObject lv_condition_13_0 = null;

        EObject lv_condition_15_0 = null;



        	enterRule();

        try {
            // InternalFictiondsl.g:857:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )? ) | (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' ( (lv_res_12_0= ruleExp ) )? ) | ( (lv_condition_13_0= ruleExp ) ) | ( ( (otherlv_14= RULE_ID ) ) ( (lv_condition_15_0= ruleExp ) ) ) ) )? ) )
            // InternalFictiondsl.g:858:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )? ) | (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' ( (lv_res_12_0= ruleExp ) )? ) | ( (lv_condition_13_0= ruleExp ) ) | ( ( (otherlv_14= RULE_ID ) ) ( (lv_condition_15_0= ruleExp ) ) ) ) )? )
            {
            // InternalFictiondsl.g:858:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )? ) | (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' ( (lv_res_12_0= ruleExp ) )? ) | ( (lv_condition_13_0= ruleExp ) ) | ( ( (otherlv_14= RULE_ID ) ) ( (lv_condition_15_0= ruleExp ) ) ) ) )? )
            // InternalFictiondsl.g:859:3: otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )? ) | (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' ( (lv_res_12_0= ruleExp ) )? ) | ( (lv_condition_13_0= ruleExp ) ) | ( ( (otherlv_14= RULE_ID ) ) ( (lv_condition_15_0= ruleExp ) ) ) ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetAccess().getToKeyword_0());
            		
            // InternalFictiondsl.g:863:3: ( (otherlv_1= RULE_ID ) )
            // InternalFictiondsl.g:864:4: (otherlv_1= RULE_ID )
            {
            // InternalFictiondsl.g:864:4: (otherlv_1= RULE_ID )
            // InternalFictiondsl.g:865:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getTargetAccess().getRefSomeRefCrossReference_1_0());
            				

            }


            }

            // InternalFictiondsl.g:876:3: (otherlv_2= 'if' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )? ) | (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' ( (lv_res_12_0= ruleExp ) )? ) | ( (lv_condition_13_0= ruleExp ) ) | ( ( (otherlv_14= RULE_ID ) ) ( (lv_condition_15_0= ruleExp ) ) ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFictiondsl.g:877:4: otherlv_2= 'if' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )? ) | (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' ( (lv_res_12_0= ruleExp ) )? ) | ( (lv_condition_13_0= ruleExp ) ) | ( ( (otherlv_14= RULE_ID ) ) ( (lv_condition_15_0= ruleExp ) ) ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getTargetAccess().getIfKeyword_2_0());
                    			
                    // InternalFictiondsl.g:881:4: ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )? ) | (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' ( (lv_res_12_0= ruleExp ) )? ) | ( (lv_condition_13_0= ruleExp ) ) | ( ( (otherlv_14= RULE_ID ) ) ( (lv_condition_15_0= ruleExp ) ) ) )
                    int alt17=4;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1==EOF||LA17_1==13||LA17_1==18||LA17_1==20||LA17_1==29||LA17_1==31||LA17_1==34) ) {
                            alt17=1;
                        }
                        else if ( ((LA17_1>=RULE_STRING && LA17_1<=RULE_INT)||(LA17_1>=22 && LA17_1<=27)||LA17_1==33||(LA17_1>=35 && LA17_1<=39)) ) {
                            alt17=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 13:
                        {
                        alt17=2;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_INT:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 33:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                        {
                        alt17=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }

                    switch (alt17) {
                        case 1 :
                            // InternalFictiondsl.g:882:5: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )? )
                            {
                            // InternalFictiondsl.g:882:5: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )? )
                            // InternalFictiondsl.g:883:6: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )?
                            {
                            // InternalFictiondsl.g:883:6: ( (otherlv_3= RULE_ID ) )
                            // InternalFictiondsl.g:884:7: (otherlv_3= RULE_ID )
                            {
                            // InternalFictiondsl.g:884:7: (otherlv_3= RULE_ID )
                            // InternalFictiondsl.g:885:8: otherlv_3= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getTargetRule());
                            								}
                            							
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); 

                            								newLeafNode(otherlv_3, grammarAccess.getTargetAccess().getExrefExternalCrossReference_2_1_0_0_0());
                            							

                            }


                            }

                            // InternalFictiondsl.g:896:6: (otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )? )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==13) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // InternalFictiondsl.g:897:7: otherlv_4= '(' (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ( (lv_condition_8_0= ruleExp ) )?
                                    {
                                    otherlv_4=(Token)match(input,13,FOLLOW_22); 

                                    							newLeafNode(otherlv_4, grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_1_0_1_0());
                                    						
                                    // InternalFictiondsl.g:901:7: (otherlv_5= 'this' | ( (otherlv_6= RULE_ID ) ) )
                                    int alt13=2;
                                    int LA13_0 = input.LA(1);

                                    if ( (LA13_0==33) ) {
                                        alt13=1;
                                    }
                                    else if ( (LA13_0==RULE_ID) ) {
                                        alt13=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 13, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt13) {
                                        case 1 :
                                            // InternalFictiondsl.g:902:8: otherlv_5= 'this'
                                            {
                                            otherlv_5=(Token)match(input,33,FOLLOW_8); 

                                            								newLeafNode(otherlv_5, grammarAccess.getTargetAccess().getThisKeyword_2_1_0_1_1_0());
                                            							

                                            }
                                            break;
                                        case 2 :
                                            // InternalFictiondsl.g:907:8: ( (otherlv_6= RULE_ID ) )
                                            {
                                            // InternalFictiondsl.g:907:8: ( (otherlv_6= RULE_ID ) )
                                            // InternalFictiondsl.g:908:9: (otherlv_6= RULE_ID )
                                            {
                                            // InternalFictiondsl.g:908:9: (otherlv_6= RULE_ID )
                                            // InternalFictiondsl.g:909:10: otherlv_6= RULE_ID
                                            {

                                            										if (current==null) {
                                            											current = createModelElement(grammarAccess.getTargetRule());
                                            										}
                                            									
                                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                                            										newLeafNode(otherlv_6, grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_0_1_1_1_0());
                                            									

                                            }


                                            }


                                            }
                                            break;

                                    }

                                    otherlv_7=(Token)match(input,14,FOLLOW_23); 

                                    							newLeafNode(otherlv_7, grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_1_0_1_2());
                                    						
                                    // InternalFictiondsl.g:925:7: ( (lv_condition_8_0= ruleExp ) )?
                                    int alt14=2;
                                    int LA14_0 = input.LA(1);

                                    if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_INT)||(LA14_0>=22 && LA14_0<=27)||LA14_0==33||(LA14_0>=35 && LA14_0<=39)) ) {
                                        alt14=1;
                                    }
                                    switch (alt14) {
                                        case 1 :
                                            // InternalFictiondsl.g:926:8: (lv_condition_8_0= ruleExp )
                                            {
                                            // InternalFictiondsl.g:926:8: (lv_condition_8_0= ruleExp )
                                            // InternalFictiondsl.g:927:9: lv_condition_8_0= ruleExp
                                            {

                                            									newCompositeNode(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_0_1_3_0());
                                            								
                                            pushFollow(FOLLOW_2);
                                            lv_condition_8_0=ruleExp();

                                            state._fsp--;


                                            									if (current==null) {
                                            										current = createModelElementForParent(grammarAccess.getTargetRule());
                                            									}
                                            									set(
                                            										current,
                                            										"condition",
                                            										lv_condition_8_0,
                                            										"interactive.Fictiondsl.Exp");
                                            									afterParserOrEnumRuleCall();
                                            								

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFictiondsl.g:947:5: (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' ( (lv_res_12_0= ruleExp ) )? )
                            {
                            // InternalFictiondsl.g:947:5: (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' ( (lv_res_12_0= ruleExp ) )? )
                            // InternalFictiondsl.g:948:6: otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' ( (lv_res_12_0= ruleExp ) )?
                            {
                            otherlv_9=(Token)match(input,13,FOLLOW_3); 

                            						newLeafNode(otherlv_9, grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_1_1_0());
                            					
                            // InternalFictiondsl.g:952:6: ( (otherlv_10= RULE_ID ) )
                            // InternalFictiondsl.g:953:7: (otherlv_10= RULE_ID )
                            {
                            // InternalFictiondsl.g:953:7: (otherlv_10= RULE_ID )
                            // InternalFictiondsl.g:954:8: otherlv_10= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getTargetRule());
                            								}
                            							
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_8); 

                            								newLeafNode(otherlv_10, grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_1_1_0());
                            							

                            }


                            }

                            otherlv_11=(Token)match(input,14,FOLLOW_23); 

                            						newLeafNode(otherlv_11, grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_1_1_2());
                            					
                            // InternalFictiondsl.g:969:6: ( (lv_res_12_0= ruleExp ) )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_INT)||(LA16_0>=22 && LA16_0<=27)||LA16_0==33||(LA16_0>=35 && LA16_0<=39)) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // InternalFictiondsl.g:970:7: (lv_res_12_0= ruleExp )
                                    {
                                    // InternalFictiondsl.g:970:7: (lv_res_12_0= ruleExp )
                                    // InternalFictiondsl.g:971:8: lv_res_12_0= ruleExp
                                    {

                                    								newCompositeNode(grammarAccess.getTargetAccess().getResExpParserRuleCall_2_1_1_3_0());
                                    							
                                    pushFollow(FOLLOW_2);
                                    lv_res_12_0=ruleExp();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getTargetRule());
                                    								}
                                    								set(
                                    									current,
                                    									"res",
                                    									lv_res_12_0,
                                    									"interactive.Fictiondsl.Exp");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalFictiondsl.g:990:5: ( (lv_condition_13_0= ruleExp ) )
                            {
                            // InternalFictiondsl.g:990:5: ( (lv_condition_13_0= ruleExp ) )
                            // InternalFictiondsl.g:991:6: (lv_condition_13_0= ruleExp )
                            {
                            // InternalFictiondsl.g:991:6: (lv_condition_13_0= ruleExp )
                            // InternalFictiondsl.g:992:7: lv_condition_13_0= ruleExp
                            {

                            							newCompositeNode(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_2_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_condition_13_0=ruleExp();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTargetRule());
                            							}
                            							set(
                            								current,
                            								"condition",
                            								lv_condition_13_0,
                            								"interactive.Fictiondsl.Exp");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalFictiondsl.g:1010:5: ( ( (otherlv_14= RULE_ID ) ) ( (lv_condition_15_0= ruleExp ) ) )
                            {
                            // InternalFictiondsl.g:1010:5: ( ( (otherlv_14= RULE_ID ) ) ( (lv_condition_15_0= ruleExp ) ) )
                            // InternalFictiondsl.g:1011:6: ( (otherlv_14= RULE_ID ) ) ( (lv_condition_15_0= ruleExp ) )
                            {
                            // InternalFictiondsl.g:1011:6: ( (otherlv_14= RULE_ID ) )
                            // InternalFictiondsl.g:1012:7: (otherlv_14= RULE_ID )
                            {
                            // InternalFictiondsl.g:1012:7: (otherlv_14= RULE_ID )
                            // InternalFictiondsl.g:1013:8: otherlv_14= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getTargetRule());
                            								}
                            							
                            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_13); 

                            								newLeafNode(otherlv_14, grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_3_0_0());
                            							

                            }


                            }

                            // InternalFictiondsl.g:1024:6: ( (lv_condition_15_0= ruleExp ) )
                            // InternalFictiondsl.g:1025:7: (lv_condition_15_0= ruleExp )
                            {
                            // InternalFictiondsl.g:1025:7: (lv_condition_15_0= ruleExp )
                            // InternalFictiondsl.g:1026:8: lv_condition_15_0= ruleExp
                            {

                            								newCompositeNode(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_3_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_condition_15_0=ruleExp();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTargetRule());
                            								}
                            								set(
                            									current,
                            									"condition",
                            									lv_condition_15_0,
                            									"interactive.Fictiondsl.Exp");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleEnd"
    // InternalFictiondsl.g:1050:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalFictiondsl.g:1050:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalFictiondsl.g:1051:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalFictiondsl.g:1057:1: ruleEnd returns [EObject current=null] : (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )? ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_exp_6_0 = null;



        	enterRule();

        try {
            // InternalFictiondsl.g:1063:2: ( (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )? ) )
            // InternalFictiondsl.g:1064:2: (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )? )
            {
            // InternalFictiondsl.g:1064:2: (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )? )
            // InternalFictiondsl.g:1065:3: otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEndAccess().getEndKeyword_0());
            		
            // InternalFictiondsl.g:1069:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFictiondsl.g:1070:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFictiondsl.g:1070:4: (lv_name_1_0= RULE_ID )
            // InternalFictiondsl.g:1071:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEndAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFictiondsl.g:1087:3: ( (lv_expression_2_0= ruleExp ) )
            // InternalFictiondsl.g:1088:4: (lv_expression_2_0= ruleExp )
            {
            // InternalFictiondsl.g:1088:4: (lv_expression_2_0= ruleExp )
            // InternalFictiondsl.g:1089:5: lv_expression_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getEndAccess().getExpressionExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_expression_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"interactive.Fictiondsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFictiondsl.g:1106:3: (otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFictiondsl.g:1107:4: otherlv_3= '&' ( (otherlv_4= RULE_ID ) ) otherlv_5= '&' ( (lv_exp_6_0= ruleExp ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEndAccess().getAmpersandKeyword_3_0());
                    			
                    // InternalFictiondsl.g:1111:4: ( (otherlv_4= RULE_ID ) )
                    // InternalFictiondsl.g:1112:5: (otherlv_4= RULE_ID )
                    {
                    // InternalFictiondsl.g:1112:5: (otherlv_4= RULE_ID )
                    // InternalFictiondsl.g:1113:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_4, grammarAccess.getEndAccess().getRefVarDefCrossReference_3_1_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getEndAccess().getAmpersandKeyword_3_2());
                    			
                    // InternalFictiondsl.g:1128:4: ( (lv_exp_6_0= ruleExp ) )
                    // InternalFictiondsl.g:1129:5: (lv_exp_6_0= ruleExp )
                    {
                    // InternalFictiondsl.g:1129:5: (lv_exp_6_0= ruleExp )
                    // InternalFictiondsl.g:1130:6: lv_exp_6_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getEndAccess().getExpExpParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_6_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEndRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_6_0,
                    							"interactive.Fictiondsl.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleExp"
    // InternalFictiondsl.g:1152:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalFictiondsl.g:1152:44: (iv_ruleExp= ruleExp EOF )
            // InternalFictiondsl.g:1153:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalFictiondsl.g:1159:1: ruleExp returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( (lv_number_2_0= RULE_INT ) ) | ( (lv_type_3_0= ruleType ) ) | (otherlv_4= 'this' this_Evaluate_5= ruleEvaluate ) | this_Evaluate_6= ruleEvaluate ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_number_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject this_Evaluate_5 = null;

        EObject this_Evaluate_6 = null;



        	enterRule();

        try {
            // InternalFictiondsl.g:1165:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( (lv_number_2_0= RULE_INT ) ) | ( (lv_type_3_0= ruleType ) ) | (otherlv_4= 'this' this_Evaluate_5= ruleEvaluate ) | this_Evaluate_6= ruleEvaluate ) )
            // InternalFictiondsl.g:1166:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( (lv_number_2_0= RULE_INT ) ) | ( (lv_type_3_0= ruleType ) ) | (otherlv_4= 'this' this_Evaluate_5= ruleEvaluate ) | this_Evaluate_6= ruleEvaluate )
            {
            // InternalFictiondsl.g:1166:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( (lv_number_2_0= RULE_INT ) ) | ( (lv_type_3_0= ruleType ) ) | (otherlv_4= 'this' this_Evaluate_5= ruleEvaluate ) | this_Evaluate_6= ruleEvaluate )
            int alt20=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt20=1;
                }
                break;
            case RULE_INT:
                {
                alt20=2;
                }
                break;
            case 37:
            case 38:
            case 39:
                {
                alt20=3;
                }
                break;
            case 33:
                {
                alt20=4;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 35:
            case 36:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalFictiondsl.g:1167:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalFictiondsl.g:1167:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalFictiondsl.g:1168:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalFictiondsl.g:1168:4: ()
                    // InternalFictiondsl.g:1169:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpAccess().getEndingAction_0_0(),
                    						current);
                    				

                    }

                    // InternalFictiondsl.g:1175:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalFictiondsl.g:1176:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalFictiondsl.g:1176:5: (lv_value_1_0= RULE_STRING )
                    // InternalFictiondsl.g:1177:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getExpAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:1195:3: ( (lv_number_2_0= RULE_INT ) )
                    {
                    // InternalFictiondsl.g:1195:3: ( (lv_number_2_0= RULE_INT ) )
                    // InternalFictiondsl.g:1196:4: (lv_number_2_0= RULE_INT )
                    {
                    // InternalFictiondsl.g:1196:4: (lv_number_2_0= RULE_INT )
                    // InternalFictiondsl.g:1197:5: lv_number_2_0= RULE_INT
                    {
                    lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_number_2_0, grammarAccess.getExpAccess().getNumberINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_2_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFictiondsl.g:1214:3: ( (lv_type_3_0= ruleType ) )
                    {
                    // InternalFictiondsl.g:1214:3: ( (lv_type_3_0= ruleType ) )
                    // InternalFictiondsl.g:1215:4: (lv_type_3_0= ruleType )
                    {
                    // InternalFictiondsl.g:1215:4: (lv_type_3_0= ruleType )
                    // InternalFictiondsl.g:1216:5: lv_type_3_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getExpAccess().getTypeTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_3_0,
                    						"interactive.Fictiondsl.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFictiondsl.g:1234:3: (otherlv_4= 'this' this_Evaluate_5= ruleEvaluate )
                    {
                    // InternalFictiondsl.g:1234:3: (otherlv_4= 'this' this_Evaluate_5= ruleEvaluate )
                    // InternalFictiondsl.g:1235:4: otherlv_4= 'this' this_Evaluate_5= ruleEvaluate
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpAccess().getThisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getExpAccess().getEvaluateParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Evaluate_5=ruleEvaluate();

                    state._fsp--;


                    				current = this_Evaluate_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalFictiondsl.g:1249:3: this_Evaluate_6= ruleEvaluate
                    {

                    			newCompositeNode(grammarAccess.getExpAccess().getEvaluateParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Evaluate_6=ruleEvaluate();

                    state._fsp--;


                    			current = this_Evaluate_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleEvaluate"
    // InternalFictiondsl.g:1261:1: entryRuleEvaluate returns [EObject current=null] : iv_ruleEvaluate= ruleEvaluate EOF ;
    public final EObject entryRuleEvaluate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluate = null;


        try {
            // InternalFictiondsl.g:1261:49: (iv_ruleEvaluate= ruleEvaluate EOF )
            // InternalFictiondsl.g:1262:2: iv_ruleEvaluate= ruleEvaluate EOF
            {
             newCompositeNode(grammarAccess.getEvaluateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluate=ruleEvaluate();

            state._fsp--;

             current =iv_ruleEvaluate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluate"


    // $ANTLR start "ruleEvaluate"
    // InternalFictiondsl.g:1268:1: ruleEvaluate returns [EObject current=null] : ( ( ( ( (lv_add_0_1= '+' | lv_add_0_2= '-' ) ) ) ( (otherlv_1= RULE_ID ) ) )? ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' | lv_op_2_6= '!=' ) ) ) ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleEvaluate() throws RecognitionException {
        EObject current = null;

        Token lv_add_0_1=null;
        Token lv_add_0_2=null;
        Token otherlv_1=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalFictiondsl.g:1274:2: ( ( ( ( ( (lv_add_0_1= '+' | lv_add_0_2= '-' ) ) ) ( (otherlv_1= RULE_ID ) ) )? ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' | lv_op_2_6= '!=' ) ) ) ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalFictiondsl.g:1275:2: ( ( ( ( (lv_add_0_1= '+' | lv_add_0_2= '-' ) ) ) ( (otherlv_1= RULE_ID ) ) )? ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' | lv_op_2_6= '!=' ) ) ) ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalFictiondsl.g:1275:2: ( ( ( ( (lv_add_0_1= '+' | lv_add_0_2= '-' ) ) ) ( (otherlv_1= RULE_ID ) ) )? ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' | lv_op_2_6= '!=' ) ) ) ( (lv_exp_3_0= ruleExp ) ) )
            // InternalFictiondsl.g:1276:3: ( ( ( (lv_add_0_1= '+' | lv_add_0_2= '-' ) ) ) ( (otherlv_1= RULE_ID ) ) )? ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' | lv_op_2_6= '!=' ) ) ) ( (lv_exp_3_0= ruleExp ) )
            {
            // InternalFictiondsl.g:1276:3: ( ( ( (lv_add_0_1= '+' | lv_add_0_2= '-' ) ) ) ( (otherlv_1= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=35 && LA22_0<=36)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFictiondsl.g:1277:4: ( ( (lv_add_0_1= '+' | lv_add_0_2= '-' ) ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalFictiondsl.g:1277:4: ( ( (lv_add_0_1= '+' | lv_add_0_2= '-' ) ) )
                    // InternalFictiondsl.g:1278:5: ( (lv_add_0_1= '+' | lv_add_0_2= '-' ) )
                    {
                    // InternalFictiondsl.g:1278:5: ( (lv_add_0_1= '+' | lv_add_0_2= '-' ) )
                    // InternalFictiondsl.g:1279:6: (lv_add_0_1= '+' | lv_add_0_2= '-' )
                    {
                    // InternalFictiondsl.g:1279:6: (lv_add_0_1= '+' | lv_add_0_2= '-' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==35) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==36) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalFictiondsl.g:1280:7: lv_add_0_1= '+'
                            {
                            lv_add_0_1=(Token)match(input,35,FOLLOW_3); 

                            							newLeafNode(lv_add_0_1, grammarAccess.getEvaluateAccess().getAddPlusSignKeyword_0_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEvaluateRule());
                            							}
                            							setWithLastConsumed(current, "add", lv_add_0_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalFictiondsl.g:1291:7: lv_add_0_2= '-'
                            {
                            lv_add_0_2=(Token)match(input,36,FOLLOW_3); 

                            							newLeafNode(lv_add_0_2, grammarAccess.getEvaluateAccess().getAddHyphenMinusKeyword_0_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEvaluateRule());
                            							}
                            							setWithLastConsumed(current, "add", lv_add_0_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalFictiondsl.g:1304:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFictiondsl.g:1305:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFictiondsl.g:1305:5: (otherlv_1= RULE_ID )
                    // InternalFictiondsl.g:1306:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluateRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_1, grammarAccess.getEvaluateAccess().getRefVarDefCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFictiondsl.g:1318:3: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' | lv_op_2_6= '!=' ) ) )
            // InternalFictiondsl.g:1319:4: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' | lv_op_2_6= '!=' ) )
            {
            // InternalFictiondsl.g:1319:4: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' | lv_op_2_6= '!=' ) )
            // InternalFictiondsl.g:1320:5: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' | lv_op_2_6= '!=' )
            {
            // InternalFictiondsl.g:1320:5: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' | lv_op_2_5= '==' | lv_op_2_6= '!=' )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt23=1;
                }
                break;
            case 23:
                {
                alt23=2;
                }
                break;
            case 24:
                {
                alt23=3;
                }
                break;
            case 25:
                {
                alt23=4;
                }
                break;
            case 26:
                {
                alt23=5;
                }
                break;
            case 27:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalFictiondsl.g:1321:6: lv_op_2_1= '<'
                    {
                    lv_op_2_1=(Token)match(input,22,FOLLOW_13); 

                    						newLeafNode(lv_op_2_1, grammarAccess.getEvaluateAccess().getOpLessThanSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:1332:6: lv_op_2_2= '<='
                    {
                    lv_op_2_2=(Token)match(input,23,FOLLOW_13); 

                    						newLeafNode(lv_op_2_2, grammarAccess.getEvaluateAccess().getOpLessThanSignEqualsSignKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalFictiondsl.g:1343:6: lv_op_2_3= '>'
                    {
                    lv_op_2_3=(Token)match(input,24,FOLLOW_13); 

                    						newLeafNode(lv_op_2_3, grammarAccess.getEvaluateAccess().getOpGreaterThanSignKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalFictiondsl.g:1354:6: lv_op_2_4= '>='
                    {
                    lv_op_2_4=(Token)match(input,25,FOLLOW_13); 

                    						newLeafNode(lv_op_2_4, grammarAccess.getEvaluateAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_2_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalFictiondsl.g:1365:6: lv_op_2_5= '=='
                    {
                    lv_op_2_5=(Token)match(input,26,FOLLOW_13); 

                    						newLeafNode(lv_op_2_5, grammarAccess.getEvaluateAccess().getOpEqualsSignEqualsSignKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_2_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalFictiondsl.g:1376:6: lv_op_2_6= '!='
                    {
                    lv_op_2_6=(Token)match(input,27,FOLLOW_13); 

                    						newLeafNode(lv_op_2_6, grammarAccess.getEvaluateAccess().getOpExclamationMarkEqualsSignKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvaluateRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_2_6, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalFictiondsl.g:1389:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalFictiondsl.g:1390:4: (lv_exp_3_0= ruleExp )
            {
            // InternalFictiondsl.g:1390:4: (lv_exp_3_0= ruleExp )
            // InternalFictiondsl.g:1391:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getEvaluateAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvaluateRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"interactive.Fictiondsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluate"


    // $ANTLR start "entryRuleType"
    // InternalFictiondsl.g:1412:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalFictiondsl.g:1412:44: (iv_ruleType= ruleType EOF )
            // InternalFictiondsl.g:1413:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalFictiondsl.g:1419:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'text' | kw= 'number' | kw= 'boolean' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFictiondsl.g:1425:2: ( (kw= 'text' | kw= 'number' | kw= 'boolean' ) )
            // InternalFictiondsl.g:1426:2: (kw= 'text' | kw= 'number' | kw= 'boolean' )
            {
            // InternalFictiondsl.g:1426:2: (kw= 'text' | kw= 'number' | kw= 'boolean' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            case 39:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalFictiondsl.g:1427:3: kw= 'text'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getTextKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:1433:3: kw= 'number'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getNumberKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalFictiondsl.g:1439:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000004201C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000420140000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000FA0FC00060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000009FE00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000E000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000009FE00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000DFE00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000FA0FC02070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000FA0FC00062L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000FC00000L});

}