package com.mdsd.assignment2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.mdsd.assignment2.services.MathdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'", "'('", "')'"
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalMathdsl.g:71:1: ruleMathExp returns [EObject current=null] : ( (lv_variables_0_0= ruleVarBinding ) )* ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:77:2: ( ( (lv_variables_0_0= ruleVarBinding ) )* )
            // InternalMathdsl.g:78:2: ( (lv_variables_0_0= ruleVarBinding ) )*
            {
            // InternalMathdsl.g:78:2: ( (lv_variables_0_0= ruleVarBinding ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathdsl.g:79:3: (lv_variables_0_0= ruleVarBinding )
            	    {
            	    // InternalMathdsl.g:79:3: (lv_variables_0_0= ruleVarBinding )
            	    // InternalMathdsl.g:80:4: lv_variables_0_0= ruleVarBinding
            	    {

            	    				newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVarBindingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_variables_0_0=ruleVarBinding();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    				}
            	    				add(
            	    					current,
            	    					"variables",
            	    					lv_variables_0_0,
            	    					"com.mdsd.assignment2.Mathdsl.VarBinding");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // InternalMathdsl.g:100:1: entryRuleVarBinding returns [EObject current=null] : iv_ruleVarBinding= ruleVarBinding EOF ;
    public final EObject entryRuleVarBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinding = null;


        try {
            // InternalMathdsl.g:100:51: (iv_ruleVarBinding= ruleVarBinding EOF )
            // InternalMathdsl.g:101:2: iv_ruleVarBinding= ruleVarBinding EOF
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
    // InternalMathdsl.g:107:1: ruleVarBinding returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleVarBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:113:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalMathdsl.g:114:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalMathdsl.g:114:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalMathdsl.g:115:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBindingAccess().getVarKeyword_0());
            		
            // InternalMathdsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMathdsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMathdsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMathdsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVarBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMathdsl.g:141:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalMathdsl.g:142:4: (lv_exp_3_0= ruleExp )
            {
            // InternalMathdsl.g:142:4: (lv_exp_3_0= ruleExp )
            // InternalMathdsl.g:143:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarBindingAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarBindingRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"com.mdsd.assignment2.Mathdsl.Exp");
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


    // $ANTLR start "entryRuleExp"
    // InternalMathdsl.g:164:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMathdsl.g:164:44: (iv_ruleExp= ruleExp EOF )
            // InternalMathdsl.g:165:2: iv_ruleExp= ruleExp EOF
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
    // InternalMathdsl.g:171:1: ruleExp returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Term_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:177:2: ( (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) )
            // InternalMathdsl.g:178:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            {
            // InternalMathdsl.g:178:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            // InternalMathdsl.g:179:3: this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathdsl.g:187:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMathdsl.g:188:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) )
            	    {
            	    // InternalMathdsl.g:188:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==14) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalMathdsl.g:189:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMathdsl.g:189:5: ( () otherlv_2= '+' )
            	            // InternalMathdsl.g:190:6: () otherlv_2= '+'
            	            {
            	            // InternalMathdsl.g:190:6: ()
            	            // InternalMathdsl.g:191:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathdsl.g:203:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMathdsl.g:203:5: ( () otherlv_4= '-' )
            	            // InternalMathdsl.g:204:6: () otherlv_4= '-'
            	            {
            	            // InternalMathdsl.g:204:6: ()
            	            // InternalMathdsl.g:205:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathdsl.g:217:4: ( (lv_right_5_0= ruleTerm ) )
            	    // InternalMathdsl.g:218:5: (lv_right_5_0= ruleTerm )
            	    {
            	    // InternalMathdsl.g:218:5: (lv_right_5_0= ruleTerm )
            	    // InternalMathdsl.g:219:6: lv_right_5_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_5_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.mdsd.assignment2.Mathdsl.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleTerm"
    // InternalMathdsl.g:241:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMathdsl.g:241:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMathdsl.g:242:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMathdsl.g:248:1: ruleTerm returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:254:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMathdsl.g:255:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMathdsl.g:255:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMathdsl.g:256:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathdsl.g:264:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMathdsl.g:265:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMathdsl.g:265:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
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
            	            // InternalMathdsl.g:266:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMathdsl.g:266:5: ( () otherlv_2= '*' )
            	            // InternalMathdsl.g:267:6: () otherlv_2= '*'
            	            {
            	            // InternalMathdsl.g:267:6: ()
            	            // InternalMathdsl.g:268:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getTermAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	            						newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathdsl.g:280:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMathdsl.g:280:5: ( () otherlv_4= '/' )
            	            // InternalMathdsl.g:281:6: () otherlv_4= '/'
            	            {
            	            // InternalMathdsl.g:281:6: ()
            	            // InternalMathdsl.g:282:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getTermAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            	            						newLeafNode(otherlv_4, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathdsl.g:294:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMathdsl.g:295:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMathdsl.g:295:5: (lv_right_5_0= rulePrimary )
            	    // InternalMathdsl.g:296:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.mdsd.assignment2.Mathdsl.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePrimary"
    // InternalMathdsl.g:318:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathdsl.g:318:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathdsl.g:319:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMathdsl.g:325:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_LetBinding_3= ruleLetBinding ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableUse_2 = null;

        EObject this_LetBinding_3 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:331:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_LetBinding_3= ruleLetBinding ) )
            // InternalMathdsl.g:332:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_LetBinding_3= ruleLetBinding )
            {
            // InternalMathdsl.g:332:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_LetBinding_3= ruleLetBinding )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMathdsl.g:333:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathdsl.g:342:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMathdsl.g:351:3: this_VariableUse_2= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_2=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMathdsl.g:360:3: this_LetBinding_3= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_3=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_3;
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
    // InternalMathdsl.g:372:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalMathdsl.g:372:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalMathdsl.g:373:2: iv_ruleLetBinding= ruleLetBinding EOF
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
    // InternalMathdsl.g:379:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
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
            // InternalMathdsl.g:385:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMathdsl.g:386:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMathdsl.g:386:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMathdsl.g:387:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalMathdsl.g:391:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMathdsl.g:392:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMathdsl.g:392:4: (lv_name_1_0= RULE_ID )
            // InternalMathdsl.g:393:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMathdsl.g:413:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalMathdsl.g:414:4: (lv_binding_3_0= ruleExp )
            {
            // InternalMathdsl.g:414:4: (lv_binding_3_0= ruleExp )
            // InternalMathdsl.g:415:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"com.mdsd.assignment2.Mathdsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalMathdsl.g:436:3: ( (lv_body_5_0= ruleExp ) )
            // InternalMathdsl.g:437:4: (lv_body_5_0= ruleExp )
            {
            // InternalMathdsl.g:437:4: (lv_body_5_0= ruleExp )
            // InternalMathdsl.g:438:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"com.mdsd.assignment2.Mathdsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParenthesis"
    // InternalMathdsl.g:463:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMathdsl.g:463:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMathdsl.g:464:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMathdsl.g:470:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalMathdsl.g:476:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalMathdsl.g:477:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalMathdsl.g:477:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalMathdsl.g:478:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_11);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMathdsl.g:498:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMathdsl.g:498:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMathdsl.g:499:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathdsl.g:505:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMathdsl.g:511:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMathdsl.g:512:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMathdsl.g:512:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMathdsl.g:513:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMathdsl.g:513:3: ()
            // InternalMathdsl.g:514:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalMathdsl.g:520:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMathdsl.g:521:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMathdsl.g:521:4: (lv_value_1_0= RULE_INT )
            // InternalMathdsl.g:522:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMathdsl.g:542:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMathdsl.g:542:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMathdsl.g:543:2: iv_ruleVariableUse= ruleVariableUse EOF
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
    // InternalMathdsl.g:549:1: ruleVariableUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMathdsl.g:555:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMathdsl.g:556:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMathdsl.g:556:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalMathdsl.g:557:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalMathdsl.g:557:3: ()
            // InternalMathdsl.g:558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVarUseAction_0(),
            					current);
            			

            }

            // InternalMathdsl.g:564:3: ( (otherlv_1= RULE_ID ) )
            // InternalMathdsl.g:565:4: (otherlv_1= RULE_ID )
            {
            // InternalMathdsl.g:565:4: (otherlv_1= RULE_ID )
            // InternalMathdsl.g:566:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_1_0());
            				

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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});

}