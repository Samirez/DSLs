package com.mdsd.assignment3.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.mdsd.assignment3.services.MathdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'var'", "'='", "'external'", "'()'", "'('", "','", "')'", "'int'", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathdslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathdsl.g"; }



     	private MathdslGrammarAccess grammarAccess;

        public InternalMathdslParser(TokenStream input, MathdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMathdsl.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMathdsl.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMathdsl.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathdsl.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_external_2_0= ruleExternal ) )* ( (lv_variables_3_0= ruleVarBinding ) )* ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_external_2_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_external_2_0= ruleExternal ) )* ( (lv_variables_3_0= ruleVarBinding ) )* ) )
            // InternalMathdsl.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_external_2_0= ruleExternal ) )* ( (lv_variables_3_0= ruleVarBinding ) )* )
            {
            // InternalMathdsl.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_external_2_0= ruleExternal ) )* ( (lv_variables_3_0= ruleVarBinding ) )* )
            // InternalMathdsl.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_external_2_0= ruleExternal ) )* ( (lv_variables_3_0= ruleVarBinding ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getProgramKeyword_0());
            		
            // InternalMathdsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMathdsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMathdsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMathdsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMathdsl.g:101:3: ( (lv_external_2_0= ruleExternal ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathdsl.g:102:4: (lv_external_2_0= ruleExternal )
            	    {
            	    // InternalMathdsl.g:102:4: (lv_external_2_0= ruleExternal )
            	    // InternalMathdsl.g:103:5: lv_external_2_0= ruleExternal
            	    {

            	    					newCompositeNode(grammarAccess.getMathExpAccess().getExternalExternalParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_external_2_0=ruleExternal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"external",
            	    						lv_external_2_0,
            	    						"com.mdsd.assignment3.Mathdsl.External");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMathdsl.g:120:3: ( (lv_variables_3_0= ruleVarBinding ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMathdsl.g:121:4: (lv_variables_3_0= ruleVarBinding )
            	    {
            	    // InternalMathdsl.g:121:4: (lv_variables_3_0= ruleVarBinding )
            	    // InternalMathdsl.g:122:5: lv_variables_3_0= ruleVarBinding
            	    {

            	    					newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVarBindingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_variables_3_0=ruleVarBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_3_0,
            	    						"com.mdsd.assignment3.Mathdsl.VarBinding");
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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleVarBinding"
    // InternalMathdsl.g:143:1: entryRuleVarBinding returns [EObject current=null] : iv_ruleVarBinding= ruleVarBinding EOF ;
    public final EObject entryRuleVarBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinding = null;


        try {
            // InternalMathdsl.g:143:51: (iv_ruleVarBinding= ruleVarBinding EOF )
            // InternalMathdsl.g:144:2: iv_ruleVarBinding= ruleVarBinding EOF
            {
             newCompositeNode(grammarAccess.getVarBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarBinding=ruleVarBinding();

            state._fsp--;

             current =iv_ruleVarBinding; 
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
    // $ANTLR end "entryRuleVarBinding"


    // $ANTLR start "ruleVarBinding"
    // InternalMathdsl.g:150:1: ruleVarBinding returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) ;
    public final EObject ruleVarBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:156:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) )
            // InternalMathdsl.g:157:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            {
            // InternalMathdsl.g:157:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            // InternalMathdsl.g:158:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBindingAccess().getVarKeyword_0());
            		
            // InternalMathdsl.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMathdsl.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMathdsl.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalMathdsl.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getVarBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMathdsl.g:184:3: ( (lv_expression_3_0= ruleExp ) )
            // InternalMathdsl.g:185:4: (lv_expression_3_0= ruleExp )
            {
            // InternalMathdsl.g:185:4: (lv_expression_3_0= ruleExp )
            // InternalMathdsl.g:186:5: lv_expression_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarBindingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"com.mdsd.assignment3.Mathdsl.Exp");
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
    // $ANTLR end "ruleVarBinding"


    // $ANTLR start "entryRuleExternal"
    // InternalMathdsl.g:207:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalMathdsl.g:207:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalMathdsl.g:208:2: iv_ruleExternal= ruleExternal EOF
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
    // InternalMathdsl.g:214:1: ruleExternal returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '()' | (otherlv_3= '(' ( (lv_arguments_4_0= ruleExternalArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExternalArgument ) ) )* otherlv_7= ')' ) ) ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_arguments_4_0 = null;

        AntlrDatatypeRuleToken lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:220:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '()' | (otherlv_3= '(' ( (lv_arguments_4_0= ruleExternalArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExternalArgument ) ) )* otherlv_7= ')' ) ) ) )
            // InternalMathdsl.g:221:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '()' | (otherlv_3= '(' ( (lv_arguments_4_0= ruleExternalArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExternalArgument ) ) )* otherlv_7= ')' ) ) )
            {
            // InternalMathdsl.g:221:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '()' | (otherlv_3= '(' ( (lv_arguments_4_0= ruleExternalArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExternalArgument ) ) )* otherlv_7= ')' ) ) )
            // InternalMathdsl.g:222:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '()' | (otherlv_3= '(' ( (lv_arguments_4_0= ruleExternalArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExternalArgument ) ) )* otherlv_7= ')' ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getExternalKeyword_0());
            		
            // InternalMathdsl.g:226:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMathdsl.g:227:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMathdsl.g:227:4: (lv_name_1_0= RULE_ID )
            // InternalMathdsl.g:228:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalMathdsl.g:244:3: (otherlv_2= '()' | (otherlv_3= '(' ( (lv_arguments_4_0= ruleExternalArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExternalArgument ) ) )* otherlv_7= ')' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMathdsl.g:245:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisRightParenthesisKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMathdsl.g:250:4: (otherlv_3= '(' ( (lv_arguments_4_0= ruleExternalArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExternalArgument ) ) )* otherlv_7= ')' )
                    {
                    // InternalMathdsl.g:250:4: (otherlv_3= '(' ( (lv_arguments_4_0= ruleExternalArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExternalArgument ) ) )* otherlv_7= ')' )
                    // InternalMathdsl.g:251:5: otherlv_3= '(' ( (lv_arguments_4_0= ruleExternalArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExternalArgument ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(otherlv_3, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2_1_0());
                    				
                    // InternalMathdsl.g:255:5: ( (lv_arguments_4_0= ruleExternalArgument ) )
                    // InternalMathdsl.g:256:6: (lv_arguments_4_0= ruleExternalArgument )
                    {
                    // InternalMathdsl.g:256:6: (lv_arguments_4_0= ruleExternalArgument )
                    // InternalMathdsl.g:257:7: lv_arguments_4_0= ruleExternalArgument
                    {

                    							newCompositeNode(grammarAccess.getExternalAccess().getArgumentsExternalArgumentParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_arguments_4_0=ruleExternalArgument();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getExternalRule());
                    							}
                    							add(
                    								current,
                    								"arguments",
                    								lv_arguments_4_0,
                    								"com.mdsd.assignment3.Mathdsl.ExternalArgument");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMathdsl.g:274:5: (otherlv_5= ',' ( (lv_arguments_6_0= ruleExternalArgument ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMathdsl.g:275:6: otherlv_5= ',' ( (lv_arguments_6_0= ruleExternalArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_9); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getExternalAccess().getCommaKeyword_2_1_2_0());
                    	    					
                    	    // InternalMathdsl.g:279:6: ( (lv_arguments_6_0= ruleExternalArgument ) )
                    	    // InternalMathdsl.g:280:7: (lv_arguments_6_0= ruleExternalArgument )
                    	    {
                    	    // InternalMathdsl.g:280:7: (lv_arguments_6_0= ruleExternalArgument )
                    	    // InternalMathdsl.g:281:8: lv_arguments_6_0= ruleExternalArgument
                    	    {

                    	    								newCompositeNode(grammarAccess.getExternalAccess().getArgumentsExternalArgumentParserRuleCall_2_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_10);
                    	    lv_arguments_6_0=ruleExternalArgument();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getExternalRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"arguments",
                    	    									lv_arguments_6_0,
                    	    									"com.mdsd.assignment3.Mathdsl.ExternalArgument");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getExternalAccess().getRightParenthesisKeyword_2_1_3());
                    				

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
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleExternalArgument"
    // InternalMathdsl.g:309:1: entryRuleExternalArgument returns [String current=null] : iv_ruleExternalArgument= ruleExternalArgument EOF ;
    public final String entryRuleExternalArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExternalArgument = null;


        try {
            // InternalMathdsl.g:309:56: (iv_ruleExternalArgument= ruleExternalArgument EOF )
            // InternalMathdsl.g:310:2: iv_ruleExternalArgument= ruleExternalArgument EOF
            {
             newCompositeNode(grammarAccess.getExternalArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalArgument=ruleExternalArgument();

            state._fsp--;

             current =iv_ruleExternalArgument.getText(); 
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
    // $ANTLR end "entryRuleExternalArgument"


    // $ANTLR start "ruleExternalArgument"
    // InternalMathdsl.g:316:1: ruleExternalArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'int' ;
    public final AntlrDatatypeRuleToken ruleExternalArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMathdsl.g:322:2: (kw= 'int' )
            // InternalMathdsl.g:323:2: kw= 'int'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getExternalArgumentAccess().getIntKeyword());
            	

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
    // $ANTLR end "ruleExternalArgument"


    // $ANTLR start "entryRuleExternalUse"
    // InternalMathdsl.g:331:1: entryRuleExternalUse returns [EObject current=null] : iv_ruleExternalUse= ruleExternalUse EOF ;
    public final EObject entryRuleExternalUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalUse = null;


        try {
            // InternalMathdsl.g:331:52: (iv_ruleExternalUse= ruleExternalUse EOF )
            // InternalMathdsl.g:332:2: iv_ruleExternalUse= ruleExternalUse EOF
            {
             newCompositeNode(grammarAccess.getExternalUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalUse=ruleExternalUse();

            state._fsp--;

             current =iv_ruleExternalUse; 
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
    // $ANTLR end "entryRuleExternalUse"


    // $ANTLR start "ruleExternalUse"
    // InternalMathdsl.g:338:1: ruleExternalUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '()' | (otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' ) ) ) ;
    public final EObject ruleExternalUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:344:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '()' | (otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' ) ) ) )
            // InternalMathdsl.g:345:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '()' | (otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' ) ) )
            {
            // InternalMathdsl.g:345:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '()' | (otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' ) ) )
            // InternalMathdsl.g:346:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '()' | (otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' ) )
            {
            // InternalMathdsl.g:346:3: ( (otherlv_0= RULE_ID ) )
            // InternalMathdsl.g:347:4: (otherlv_0= RULE_ID )
            {
            // InternalMathdsl.g:347:4: (otherlv_0= RULE_ID )
            // InternalMathdsl.g:348:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalUseAccess().getRefExternalCrossReference_0_0());
            				

            }


            }

            // InternalMathdsl.g:359:3: (otherlv_1= '()' | (otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMathdsl.g:360:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExternalUseAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMathdsl.g:365:4: (otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' )
                    {
                    // InternalMathdsl.g:365:4: (otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' )
                    // InternalMathdsl.g:366:5: otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    					newLeafNode(otherlv_2, grammarAccess.getExternalUseAccess().getLeftParenthesisKeyword_1_1_0());
                    				
                    // InternalMathdsl.g:370:5: ( (lv_arguments_3_0= ruleExp ) )
                    // InternalMathdsl.g:371:6: (lv_arguments_3_0= ruleExp )
                    {
                    // InternalMathdsl.g:371:6: (lv_arguments_3_0= ruleExp )
                    // InternalMathdsl.g:372:7: lv_arguments_3_0= ruleExp
                    {

                    							newCompositeNode(grammarAccess.getExternalUseAccess().getArgumentsExpParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_arguments_3_0=ruleExp();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getExternalUseRule());
                    							}
                    							add(
                    								current,
                    								"arguments",
                    								lv_arguments_3_0,
                    								"com.mdsd.assignment3.Mathdsl.Exp");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMathdsl.g:389:5: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMathdsl.g:390:6: otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_7); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getExternalUseAccess().getCommaKeyword_1_1_2_0());
                    	    					
                    	    // InternalMathdsl.g:394:6: ( (lv_arguments_5_0= ruleExp ) )
                    	    // InternalMathdsl.g:395:7: (lv_arguments_5_0= ruleExp )
                    	    {
                    	    // InternalMathdsl.g:395:7: (lv_arguments_5_0= ruleExp )
                    	    // InternalMathdsl.g:396:8: lv_arguments_5_0= ruleExp
                    	    {

                    	    								newCompositeNode(grammarAccess.getExternalUseAccess().getArgumentsExpParserRuleCall_1_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_10);
                    	    lv_arguments_5_0=ruleExp();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getExternalUseRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"arguments",
                    	    									lv_arguments_5_0,
                    	    									"com.mdsd.assignment3.Mathdsl.Exp");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getExternalUseAccess().getRightParenthesisKeyword_1_1_3());
                    				

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
    // $ANTLR end "ruleExternalUse"


    // $ANTLR start "entryRuleExp"
    // InternalMathdsl.g:424:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMathdsl.g:424:44: (iv_ruleExp= ruleExp EOF )
            // InternalMathdsl.g:425:2: iv_ruleExp= ruleExp EOF
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
    // InternalMathdsl.g:431:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:437:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMathdsl.g:438:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMathdsl.g:438:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMathdsl.g:439:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathdsl.g:447:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMathdsl.g:448:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMathdsl.g:448:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==20) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==21) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMathdsl.g:449:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMathdsl.g:449:5: ( () otherlv_2= '+' )
            	            // InternalMathdsl.g:450:6: () otherlv_2= '+'
            	            {
            	            // InternalMathdsl.g:450:6: ()
            	            // InternalMathdsl.g:451:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,20,FOLLOW_7); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathdsl.g:463:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMathdsl.g:463:5: ( () otherlv_4= '-' )
            	            // InternalMathdsl.g:464:6: () otherlv_4= '-'
            	            {
            	            // InternalMathdsl.g:464:6: ()
            	            // InternalMathdsl.g:465:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,21,FOLLOW_7); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathdsl.g:477:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMathdsl.g:478:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMathdsl.g:478:5: (lv_right_5_0= ruleFactor )
            	    // InternalMathdsl.g:479:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.mdsd.assignment3.Mathdsl.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMathdsl.g:501:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMathdsl.g:501:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMathdsl.g:502:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMathdsl.g:508:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:514:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMathdsl.g:515:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMathdsl.g:515:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMathdsl.g:516:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathdsl.g:524:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=22 && LA10_0<=23)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMathdsl.g:525:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMathdsl.g:525:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==22) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==23) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMathdsl.g:526:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMathdsl.g:526:5: ( () otherlv_2= '*' )
            	            // InternalMathdsl.g:527:6: () otherlv_2= '*'
            	            {
            	            // InternalMathdsl.g:527:6: ()
            	            // InternalMathdsl.g:528:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathdsl.g:540:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMathdsl.g:540:5: ( () otherlv_4= '/' )
            	            // InternalMathdsl.g:541:6: () otherlv_4= '/'
            	            {
            	            // InternalMathdsl.g:541:6: ()
            	            // InternalMathdsl.g:542:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,23,FOLLOW_7); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathdsl.g:554:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMathdsl.g:555:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMathdsl.g:555:5: (lv_right_5_0= rulePrimary )
            	    // InternalMathdsl.g:556:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.mdsd.assignment3.Mathdsl.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMathdsl.g:578:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathdsl.g:578:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathdsl.g:579:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathdsl.g:585:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalUse_8= ruleExternalUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;

        EObject this_VariableUse_6 = null;

        EObject this_LetBinding_7 = null;

        EObject this_ExternalUse_8 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:591:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalUse_8= ruleExternalUse ) )
            // InternalMathdsl.g:592:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalUse_8= ruleExternalUse )
            {
            // InternalMathdsl.g:592:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleExp ) ) otherlv_5= ')' ) | this_VariableUse_6= ruleVariableUse | this_LetBinding_7= ruleLetBinding | this_ExternalUse_8= ruleExternalUse )
            int alt11=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case 16:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==EOF||LA11_3==12||(LA11_3>=17 && LA11_3<=18)||(LA11_3>=20 && LA11_3<=23)||(LA11_3>=25 && LA11_3<=26)) ) {
                    alt11=3;
                }
                else if ( ((LA11_3>=15 && LA11_3<=16)) ) {
                    alt11=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMathdsl.g:593:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMathdsl.g:593:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMathdsl.g:594:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMathdsl.g:594:4: ()
                    // InternalMathdsl.g:595:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMathdsl.g:601:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMathdsl.g:602:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMathdsl.g:602:5: (lv_value_1_0= RULE_INT )
                    // InternalMathdsl.g:603:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMathdsl.g:621:3: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleExp ) ) otherlv_5= ')' )
                    {
                    // InternalMathdsl.g:621:3: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleExp ) ) otherlv_5= ')' )
                    // InternalMathdsl.g:622:4: () otherlv_3= '(' ( (lv_expression_4_0= ruleExp ) ) otherlv_5= ')'
                    {
                    // InternalMathdsl.g:622:4: ()
                    // InternalMathdsl.g:623:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getParenthesisAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMathdsl.g:633:4: ( (lv_expression_4_0= ruleExp ) )
                    // InternalMathdsl.g:634:5: (lv_expression_4_0= ruleExp )
                    {
                    // InternalMathdsl.g:634:5: (lv_expression_4_0= ruleExp )
                    // InternalMathdsl.g:635:6: lv_expression_4_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_expression_4_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_4_0,
                    							"com.mdsd.assignment3.Mathdsl.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMathdsl.g:658:3: this_VariableUse_6= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_6=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMathdsl.g:667:3: this_LetBinding_7= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_7=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMathdsl.g:676:3: this_ExternalUse_8= ruleExternalUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalUseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalUse_8=ruleExternalUse();

                    state._fsp--;


                    			current = this_ExternalUse_8;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleLetBinding"
    // InternalMathdsl.g:688:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalMathdsl.g:688:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalMathdsl.g:689:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalMathdsl.g:695:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:701:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMathdsl.g:702:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMathdsl.g:702:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMathdsl.g:703:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalMathdsl.g:707:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMathdsl.g:708:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMathdsl.g:708:4: (lv_name_1_0= RULE_ID )
            // InternalMathdsl.g:709:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMathdsl.g:729:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalMathdsl.g:730:4: (lv_binding_3_0= ruleExp )
            {
            // InternalMathdsl.g:730:4: (lv_binding_3_0= ruleExp )
            // InternalMathdsl.g:731:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"com.mdsd.assignment3.Mathdsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalMathdsl.g:752:3: ( (lv_body_5_0= ruleExp ) )
            // InternalMathdsl.g:753:4: (lv_body_5_0= ruleExp )
            {
            // InternalMathdsl.g:753:4: (lv_body_5_0= ruleExp )
            // InternalMathdsl.g:754:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"com.mdsd.assignment3.Mathdsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMathdsl.g:779:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMathdsl.g:779:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMathdsl.g:780:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMathdsl.g:786:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMathdsl.g:792:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMathdsl.g:793:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMathdsl.g:793:2: ( (otherlv_0= RULE_ID ) )
            // InternalMathdsl.g:794:3: (otherlv_0= RULE_ID )
            {
            // InternalMathdsl.g:794:3: (otherlv_0= RULE_ID )
            // InternalMathdsl.g:795:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001010030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});

}