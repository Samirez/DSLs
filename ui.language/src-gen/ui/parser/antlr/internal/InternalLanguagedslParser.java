package ui.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ui.services.LanguagedslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguagedslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'form'", "'('", "','", "')'", "'{'", "'}'", "':'", "'row'", "'column'", "'button'", "'*'", "'input'", "'<='", "'=='", "'!='", "'>='", "'>'", "'<'", "'&&'", "'label'", "'&'", "'#'", "'string'", "'boolean'", "'number'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
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


        public InternalLanguagedslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLanguagedslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLanguagedslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLanguagedsl.g"; }



     	private LanguagedslGrammarAccess grammarAccess;

        public InternalLanguagedslParser(TokenStream input, LanguagedslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Title";
       	}

       	@Override
       	protected LanguagedslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTitle"
    // InternalLanguagedsl.g:64:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalLanguagedsl.g:64:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalLanguagedsl.g:65:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalLanguagedsl.g:71:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_form_2_0= ruleForm ) )* ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_form_2_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:77:2: ( (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_form_2_0= ruleForm ) )* ) )
            // InternalLanguagedsl.g:78:2: (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_form_2_0= ruleForm ) )* )
            {
            // InternalLanguagedsl.g:78:2: (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_form_2_0= ruleForm ) )* )
            // InternalLanguagedsl.g:79:3: otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_form_2_0= ruleForm ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
            		
            // InternalLanguagedsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLanguagedsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLanguagedsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalLanguagedsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTitleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLanguagedsl.g:101:3: ( (lv_form_2_0= ruleForm ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLanguagedsl.g:102:4: (lv_form_2_0= ruleForm )
            	    {
            	    // InternalLanguagedsl.g:102:4: (lv_form_2_0= ruleForm )
            	    // InternalLanguagedsl.g:103:5: lv_form_2_0= ruleForm
            	    {

            	    					newCompositeNode(grammarAccess.getTitleAccess().getFormFormParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_form_2_0=ruleForm();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTitleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"form",
            	    						lv_form_2_0,
            	    						"ui.Languagedsl.Form");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleForm"
    // InternalLanguagedsl.g:124:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalLanguagedsl.g:124:45: (iv_ruleForm= ruleForm EOF )
            // InternalLanguagedsl.g:125:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalLanguagedsl.g:131:1: ruleForm returns [EObject current=null] : (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_param_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_param2_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_param_3_0 = null;

        EObject lv_param2_5_0 = null;

        EObject lv_layout_8_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:137:2: ( (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_param_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_param2_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' ) )
            // InternalLanguagedsl.g:138:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_param_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_param2_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' )
            {
            // InternalLanguagedsl.g:138:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_param_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_param2_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' )
            // InternalLanguagedsl.g:139:3: otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_param_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_param2_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
            		
            // InternalLanguagedsl.g:143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLanguagedsl.g:144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLanguagedsl.g:144:4: (lv_name_1_0= RULE_ID )
            // InternalLanguagedsl.g:145:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLanguagedsl.g:161:3: (otherlv_2= '(' ( ( (lv_param_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_param2_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLanguagedsl.g:162:4: otherlv_2= '(' ( ( (lv_param_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_param2_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getFormAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalLanguagedsl.g:166:4: ( ( (lv_param_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_param2_5_0= ruleParameter ) ) )* )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_ID) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalLanguagedsl.g:167:5: ( (lv_param_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_param2_5_0= ruleParameter ) ) )*
                            {
                            // InternalLanguagedsl.g:167:5: ( (lv_param_3_0= ruleParameter ) )
                            // InternalLanguagedsl.g:168:6: (lv_param_3_0= ruleParameter )
                            {
                            // InternalLanguagedsl.g:168:6: (lv_param_3_0= ruleParameter )
                            // InternalLanguagedsl.g:169:7: lv_param_3_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getFormAccess().getParamParameterParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_param_3_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFormRule());
                            							}
                            							add(
                            								current,
                            								"param",
                            								lv_param_3_0,
                            								"ui.Languagedsl.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalLanguagedsl.g:186:5: (otherlv_4= ',' ( (lv_param2_5_0= ruleParameter ) ) )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( (LA2_0==14) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // InternalLanguagedsl.g:187:6: otherlv_4= ',' ( (lv_param2_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getFormAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalLanguagedsl.g:191:6: ( (lv_param2_5_0= ruleParameter ) )
                            	    // InternalLanguagedsl.g:192:7: (lv_param2_5_0= ruleParameter )
                            	    {
                            	    // InternalLanguagedsl.g:192:7: (lv_param2_5_0= ruleParameter )
                            	    // InternalLanguagedsl.g:193:8: lv_param2_5_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getFormAccess().getParam2ParameterParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_7);
                            	    lv_param2_5_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getFormRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"param2",
                            	    									lv_param2_5_0,
                            	    									"ui.Languagedsl.Parameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getFormAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLanguagedsl.g:221:3: ( (lv_layout_8_0= ruleLayout ) )
            // InternalLanguagedsl.g:222:4: (lv_layout_8_0= ruleLayout )
            {
            // InternalLanguagedsl.g:222:4: (lv_layout_8_0= ruleLayout )
            // InternalLanguagedsl.g:223:5: lv_layout_8_0= ruleLayout
            {

            					newCompositeNode(grammarAccess.getFormAccess().getLayoutLayoutParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_layout_8_0=ruleLayout();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormRule());
            					}
            					add(
            						current,
            						"layout",
            						lv_layout_8_0,
            						"ui.Languagedsl.Layout");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleParameter"
    // InternalLanguagedsl.g:248:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalLanguagedsl.g:248:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalLanguagedsl.g:249:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalLanguagedsl.g:255:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:261:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalLanguagedsl.g:262:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalLanguagedsl.g:262:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalLanguagedsl.g:263:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalLanguagedsl.g:263:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLanguagedsl.g:264:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLanguagedsl.g:264:4: (lv_name_0_0= RULE_ID )
            // InternalLanguagedsl.g:265:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalLanguagedsl.g:285:3: ( (lv_type_2_0= ruleType ) )
            // InternalLanguagedsl.g:286:4: (lv_type_2_0= ruleType )
            {
            // InternalLanguagedsl.g:286:4: (lv_type_2_0= ruleType )
            // InternalLanguagedsl.g:287:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"ui.Languagedsl.Type");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleFormUse"
    // InternalLanguagedsl.g:308:1: entryRuleFormUse returns [EObject current=null] : iv_ruleFormUse= ruleFormUse EOF ;
    public final EObject entryRuleFormUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormUse = null;


        try {
            // InternalLanguagedsl.g:308:48: (iv_ruleFormUse= ruleFormUse EOF )
            // InternalLanguagedsl.g:309:2: iv_ruleFormUse= ruleFormUse EOF
            {
             newCompositeNode(grammarAccess.getFormUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormUse=ruleFormUse();

            state._fsp--;

             current =iv_ruleFormUse; 
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
    // $ANTLR end "entryRuleFormUse"


    // $ANTLR start "ruleFormUse"
    // InternalLanguagedsl.g:315:1: ruleFormUse returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )? )? otherlv_5= ')' ) ;
    public final EObject ruleFormUse() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_2_0 = null;

        EObject lv_exp2_4_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:321:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )? )? otherlv_5= ')' ) )
            // InternalLanguagedsl.g:322:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )? )? otherlv_5= ')' )
            {
            // InternalLanguagedsl.g:322:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )? )? otherlv_5= ')' )
            // InternalLanguagedsl.g:323:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )? )? otherlv_5= ')'
            {
            // InternalLanguagedsl.g:323:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLanguagedsl.g:324:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLanguagedsl.g:324:4: (lv_name_0_0= RULE_ID )
            // InternalLanguagedsl.g:325:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFormUseAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormUseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFormUseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLanguagedsl.g:345:3: ( ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_INT)||(LA6_0>=33 && LA6_0<=36)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLanguagedsl.g:346:4: ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )?
                    {
                    // InternalLanguagedsl.g:346:4: ( (lv_exp_2_0= ruleExp ) )
                    // InternalLanguagedsl.g:347:5: (lv_exp_2_0= ruleExp )
                    {
                    // InternalLanguagedsl.g:347:5: (lv_exp_2_0= ruleExp )
                    // InternalLanguagedsl.g:348:6: lv_exp_2_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getFormUseAccess().getExpExpParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_exp_2_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormUseRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_2_0,
                    							"ui.Languagedsl.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLanguagedsl.g:365:4: (otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==14) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalLanguagedsl.g:366:5: otherlv_3= ',' ( (lv_exp2_4_0= ruleExp ) )
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_15); 

                            					newLeafNode(otherlv_3, grammarAccess.getFormUseAccess().getCommaKeyword_2_1_0());
                            				
                            // InternalLanguagedsl.g:370:5: ( (lv_exp2_4_0= ruleExp ) )
                            // InternalLanguagedsl.g:371:6: (lv_exp2_4_0= ruleExp )
                            {
                            // InternalLanguagedsl.g:371:6: (lv_exp2_4_0= ruleExp )
                            // InternalLanguagedsl.g:372:7: lv_exp2_4_0= ruleExp
                            {

                            							newCompositeNode(grammarAccess.getFormUseAccess().getExp2ExpParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_exp2_4_0=ruleExp();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFormUseRule());
                            							}
                            							set(
                            								current,
                            								"exp2",
                            								lv_exp2_4_0,
                            								"ui.Languagedsl.Exp");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFormUseAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFormUse"


    // $ANTLR start "entryRuleLayout"
    // InternalLanguagedsl.g:399:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalLanguagedsl.g:399:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalLanguagedsl.g:400:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalLanguagedsl.g:406:1: ruleLayout returns [EObject current=null] : ( () (otherlv_1= 'row' | otherlv_2= 'column' ) otherlv_3= '{' ( (lv_component_4_0= ruleComponent ) )* otherlv_5= '}' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_component_4_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:412:2: ( ( () (otherlv_1= 'row' | otherlv_2= 'column' ) otherlv_3= '{' ( (lv_component_4_0= ruleComponent ) )* otherlv_5= '}' ) )
            // InternalLanguagedsl.g:413:2: ( () (otherlv_1= 'row' | otherlv_2= 'column' ) otherlv_3= '{' ( (lv_component_4_0= ruleComponent ) )* otherlv_5= '}' )
            {
            // InternalLanguagedsl.g:413:2: ( () (otherlv_1= 'row' | otherlv_2= 'column' ) otherlv_3= '{' ( (lv_component_4_0= ruleComponent ) )* otherlv_5= '}' )
            // InternalLanguagedsl.g:414:3: () (otherlv_1= 'row' | otherlv_2= 'column' ) otherlv_3= '{' ( (lv_component_4_0= ruleComponent ) )* otherlv_5= '}'
            {
            // InternalLanguagedsl.g:414:3: ()
            // InternalLanguagedsl.g:415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLayoutAccess().getLayoutAction_0(),
            					current);
            			

            }

            // InternalLanguagedsl.g:421:3: (otherlv_1= 'row' | otherlv_2= 'column' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLanguagedsl.g:422:4: otherlv_1= 'row'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getRowKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLanguagedsl.g:427:4: otherlv_2= 'column'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getColumnKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLanguagedsl.g:436:3: ( (lv_component_4_0= ruleComponent ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=19 && LA8_0<=21)||LA8_0==23||LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLanguagedsl.g:437:4: (lv_component_4_0= ruleComponent )
            	    {
            	    // InternalLanguagedsl.g:437:4: (lv_component_4_0= ruleComponent )
            	    // InternalLanguagedsl.g:438:5: lv_component_4_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getLayoutAccess().getComponentComponentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_component_4_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayoutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"component",
            	    						lv_component_4_0,
            	    						"ui.Languagedsl.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleComponent"
    // InternalLanguagedsl.g:463:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalLanguagedsl.g:463:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalLanguagedsl.g:464:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalLanguagedsl.g:470:1: ruleComponent returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayout ) ) | ( () ( (lv_element_2_0= ruleElement ) ) ) | ( (lv_formuse_3_0= ruleFormUse ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject lv_layout_0_0 = null;

        EObject lv_element_2_0 = null;

        EObject lv_formuse_3_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:476:2: ( ( ( (lv_layout_0_0= ruleLayout ) ) | ( () ( (lv_element_2_0= ruleElement ) ) ) | ( (lv_formuse_3_0= ruleFormUse ) ) ) )
            // InternalLanguagedsl.g:477:2: ( ( (lv_layout_0_0= ruleLayout ) ) | ( () ( (lv_element_2_0= ruleElement ) ) ) | ( (lv_formuse_3_0= ruleFormUse ) ) )
            {
            // InternalLanguagedsl.g:477:2: ( ( (lv_layout_0_0= ruleLayout ) ) | ( () ( (lv_element_2_0= ruleElement ) ) ) | ( (lv_formuse_3_0= ruleFormUse ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
            case 23:
            case 31:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalLanguagedsl.g:478:3: ( (lv_layout_0_0= ruleLayout ) )
                    {
                    // InternalLanguagedsl.g:478:3: ( (lv_layout_0_0= ruleLayout ) )
                    // InternalLanguagedsl.g:479:4: (lv_layout_0_0= ruleLayout )
                    {
                    // InternalLanguagedsl.g:479:4: (lv_layout_0_0= ruleLayout )
                    // InternalLanguagedsl.g:480:5: lv_layout_0_0= ruleLayout
                    {

                    					newCompositeNode(grammarAccess.getComponentAccess().getLayoutLayoutParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_layout_0_0=ruleLayout();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentRule());
                    					}
                    					add(
                    						current,
                    						"layout",
                    						lv_layout_0_0,
                    						"ui.Languagedsl.Layout");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLanguagedsl.g:498:3: ( () ( (lv_element_2_0= ruleElement ) ) )
                    {
                    // InternalLanguagedsl.g:498:3: ( () ( (lv_element_2_0= ruleElement ) ) )
                    // InternalLanguagedsl.g:499:4: () ( (lv_element_2_0= ruleElement ) )
                    {
                    // InternalLanguagedsl.g:499:4: ()
                    // InternalLanguagedsl.g:500:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComponentAccess().getComponentAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLanguagedsl.g:506:4: ( (lv_element_2_0= ruleElement ) )
                    // InternalLanguagedsl.g:507:5: (lv_element_2_0= ruleElement )
                    {
                    // InternalLanguagedsl.g:507:5: (lv_element_2_0= ruleElement )
                    // InternalLanguagedsl.g:508:6: lv_element_2_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getElementElementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_element_2_0=ruleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"element",
                    							lv_element_2_0,
                    							"ui.Languagedsl.Element");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLanguagedsl.g:527:3: ( (lv_formuse_3_0= ruleFormUse ) )
                    {
                    // InternalLanguagedsl.g:527:3: ( (lv_formuse_3_0= ruleFormUse ) )
                    // InternalLanguagedsl.g:528:4: (lv_formuse_3_0= ruleFormUse )
                    {
                    // InternalLanguagedsl.g:528:4: (lv_formuse_3_0= ruleFormUse )
                    // InternalLanguagedsl.g:529:5: lv_formuse_3_0= ruleFormUse
                    {

                    					newCompositeNode(grammarAccess.getComponentAccess().getFormuseFormUseParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_formuse_3_0=ruleFormUse();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentRule());
                    					}
                    					add(
                    						current,
                    						"formuse",
                    						lv_formuse_3_0,
                    						"ui.Languagedsl.FormUse");
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleElement"
    // InternalLanguagedsl.g:550:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalLanguagedsl.g:550:48: (iv_ruleElement= ruleElement EOF )
            // InternalLanguagedsl.g:551:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalLanguagedsl.g:557:1: ruleElement returns [EObject current=null] : ( ( (lv_label_0_0= ruleLabel ) ) | ( (lv_input_1_0= ruleInput ) ) | ( (lv_button_2_0= ruleButton ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject lv_label_0_0 = null;

        EObject lv_input_1_0 = null;

        EObject lv_button_2_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:563:2: ( ( ( (lv_label_0_0= ruleLabel ) ) | ( (lv_input_1_0= ruleInput ) ) | ( (lv_button_2_0= ruleButton ) ) ) )
            // InternalLanguagedsl.g:564:2: ( ( (lv_label_0_0= ruleLabel ) ) | ( (lv_input_1_0= ruleInput ) ) | ( (lv_button_2_0= ruleButton ) ) )
            {
            // InternalLanguagedsl.g:564:2: ( ( (lv_label_0_0= ruleLabel ) ) | ( (lv_input_1_0= ruleInput ) ) | ( (lv_button_2_0= ruleButton ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLanguagedsl.g:565:3: ( (lv_label_0_0= ruleLabel ) )
                    {
                    // InternalLanguagedsl.g:565:3: ( (lv_label_0_0= ruleLabel ) )
                    // InternalLanguagedsl.g:566:4: (lv_label_0_0= ruleLabel )
                    {
                    // InternalLanguagedsl.g:566:4: (lv_label_0_0= ruleLabel )
                    // InternalLanguagedsl.g:567:5: lv_label_0_0= ruleLabel
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getLabelLabelParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_label_0_0=ruleLabel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					add(
                    						current,
                    						"label",
                    						lv_label_0_0,
                    						"ui.Languagedsl.Label");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLanguagedsl.g:585:3: ( (lv_input_1_0= ruleInput ) )
                    {
                    // InternalLanguagedsl.g:585:3: ( (lv_input_1_0= ruleInput ) )
                    // InternalLanguagedsl.g:586:4: (lv_input_1_0= ruleInput )
                    {
                    // InternalLanguagedsl.g:586:4: (lv_input_1_0= ruleInput )
                    // InternalLanguagedsl.g:587:5: lv_input_1_0= ruleInput
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getInputInputParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_input_1_0=ruleInput();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					add(
                    						current,
                    						"input",
                    						lv_input_1_0,
                    						"ui.Languagedsl.Input");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLanguagedsl.g:605:3: ( (lv_button_2_0= ruleButton ) )
                    {
                    // InternalLanguagedsl.g:605:3: ( (lv_button_2_0= ruleButton ) )
                    // InternalLanguagedsl.g:606:4: (lv_button_2_0= ruleButton )
                    {
                    // InternalLanguagedsl.g:606:4: (lv_button_2_0= ruleButton )
                    // InternalLanguagedsl.g:607:5: lv_button_2_0= ruleButton
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getButtonButtonParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_button_2_0=ruleButton();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					add(
                    						current,
                    						"button",
                    						lv_button_2_0,
                    						"ui.Languagedsl.Button");
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleButton"
    // InternalLanguagedsl.g:628:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalLanguagedsl.g:628:47: (iv_ruleButton= ruleButton EOF )
            // InternalLanguagedsl.g:629:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalLanguagedsl.g:635:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_save_1_0= ruleSave ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_save_1_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:641:2: ( (otherlv_0= 'button' ( (lv_save_1_0= ruleSave ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) ) )
            // InternalLanguagedsl.g:642:2: (otherlv_0= 'button' ( (lv_save_1_0= ruleSave ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) )
            {
            // InternalLanguagedsl.g:642:2: (otherlv_0= 'button' ( (lv_save_1_0= ruleSave ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) )
            // InternalLanguagedsl.g:643:3: otherlv_0= 'button' ( (lv_save_1_0= ruleSave ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalLanguagedsl.g:647:3: ( (lv_save_1_0= ruleSave ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLanguagedsl.g:648:4: (lv_save_1_0= ruleSave )
                    {
                    // InternalLanguagedsl.g:648:4: (lv_save_1_0= ruleSave )
                    // InternalLanguagedsl.g:649:5: lv_save_1_0= ruleSave
                    {

                    					newCompositeNode(grammarAccess.getButtonAccess().getSaveSaveParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_save_1_0=ruleSave();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getButtonRule());
                    					}
                    					set(
                    						current,
                    						"save",
                    						lv_save_1_0,
                    						"ui.Languagedsl.Save");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLanguagedsl.g:666:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLanguagedsl.g:667:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLanguagedsl.g:667:4: (lv_name_2_0= RULE_ID )
            // InternalLanguagedsl.g:668:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getColonKeyword_3());
            		
            // InternalLanguagedsl.g:688:3: ( (lv_exp_4_0= ruleExp ) )
            // InternalLanguagedsl.g:689:4: (lv_exp_4_0= ruleExp )
            {
            // InternalLanguagedsl.g:689:4: (lv_exp_4_0= ruleExp )
            // InternalLanguagedsl.g:690:5: lv_exp_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getExpExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_4_0,
            						"ui.Languagedsl.Exp");
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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleSave"
    // InternalLanguagedsl.g:711:1: entryRuleSave returns [String current=null] : iv_ruleSave= ruleSave EOF ;
    public final String entryRuleSave() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSave = null;


        try {
            // InternalLanguagedsl.g:711:44: (iv_ruleSave= ruleSave EOF )
            // InternalLanguagedsl.g:712:2: iv_ruleSave= ruleSave EOF
            {
             newCompositeNode(grammarAccess.getSaveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSave=ruleSave();

            state._fsp--;

             current =iv_ruleSave.getText(); 
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
    // $ANTLR end "entryRuleSave"


    // $ANTLR start "ruleSave"
    // InternalLanguagedsl.g:718:1: ruleSave returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleSave() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLanguagedsl.g:724:2: (kw= '*' )
            // InternalLanguagedsl.g:725:2: kw= '*'
            {
            kw=(Token)match(input,22,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSaveAccess().getAsteriskKeyword());
            	

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
    // $ANTLR end "ruleSave"


    // $ANTLR start "entryRuleInput"
    // InternalLanguagedsl.g:733:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalLanguagedsl.g:733:46: (iv_ruleInput= ruleInput EOF )
            // InternalLanguagedsl.g:734:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalLanguagedsl.g:740:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( (lv_exp_3_0= ruleExp ) ) ( (lv_condition_4_0= ruleCondition ) )? ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '<=' | otherlv_7= '==' | otherlv_8= '!=' | otherlv_9= '>=' ) ( (lv_exp_10_0= ruleExp ) ) ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_exp_3_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_exp_10_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:746:2: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( (lv_exp_3_0= ruleExp ) ) ( (lv_condition_4_0= ruleCondition ) )? ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '<=' | otherlv_7= '==' | otherlv_8= '!=' | otherlv_9= '>=' ) ( (lv_exp_10_0= ruleExp ) ) ) ) ) )
            // InternalLanguagedsl.g:747:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( (lv_exp_3_0= ruleExp ) ) ( (lv_condition_4_0= ruleCondition ) )? ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '<=' | otherlv_7= '==' | otherlv_8= '!=' | otherlv_9= '>=' ) ( (lv_exp_10_0= ruleExp ) ) ) ) )
            {
            // InternalLanguagedsl.g:747:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( (lv_exp_3_0= ruleExp ) ) ( (lv_condition_4_0= ruleCondition ) )? ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '<=' | otherlv_7= '==' | otherlv_8= '!=' | otherlv_9= '>=' ) ( (lv_exp_10_0= ruleExp ) ) ) ) )
            // InternalLanguagedsl.g:748:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( (lv_exp_3_0= ruleExp ) ) ( (lv_condition_4_0= ruleCondition ) )? ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '<=' | otherlv_7= '==' | otherlv_8= '!=' | otherlv_9= '>=' ) ( (lv_exp_10_0= ruleExp ) ) ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalLanguagedsl.g:752:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLanguagedsl.g:753:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLanguagedsl.g:753:4: (lv_name_1_0= RULE_ID )
            // InternalLanguagedsl.g:754:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getColonKeyword_2());
            		
            // InternalLanguagedsl.g:774:3: ( ( ( (lv_exp_3_0= ruleExp ) ) ( (lv_condition_4_0= ruleCondition ) )? ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '<=' | otherlv_7= '==' | otherlv_8= '!=' | otherlv_9= '>=' ) ( (lv_exp_10_0= ruleExp ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_INT)||(LA14_0>=33 && LA14_0<=36)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalLanguagedsl.g:775:4: ( ( (lv_exp_3_0= ruleExp ) ) ( (lv_condition_4_0= ruleCondition ) )? )
                    {
                    // InternalLanguagedsl.g:775:4: ( ( (lv_exp_3_0= ruleExp ) ) ( (lv_condition_4_0= ruleCondition ) )? )
                    // InternalLanguagedsl.g:776:5: ( (lv_exp_3_0= ruleExp ) ) ( (lv_condition_4_0= ruleCondition ) )?
                    {
                    // InternalLanguagedsl.g:776:5: ( (lv_exp_3_0= ruleExp ) )
                    // InternalLanguagedsl.g:777:6: (lv_exp_3_0= ruleExp )
                    {
                    // InternalLanguagedsl.g:777:6: (lv_exp_3_0= ruleExp )
                    // InternalLanguagedsl.g:778:7: lv_exp_3_0= ruleExp
                    {

                    							newCompositeNode(grammarAccess.getInputAccess().getExpExpParserRuleCall_3_0_0_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_exp_3_0=ruleExp();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInputRule());
                    							}
                    							set(
                    								current,
                    								"exp",
                    								lv_exp_3_0,
                    								"ui.Languagedsl.Exp");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalLanguagedsl.g:795:5: ( (lv_condition_4_0= ruleCondition ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=24 && LA12_0<=29)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalLanguagedsl.g:796:6: (lv_condition_4_0= ruleCondition )
                            {
                            // InternalLanguagedsl.g:796:6: (lv_condition_4_0= ruleCondition )
                            // InternalLanguagedsl.g:797:7: lv_condition_4_0= ruleCondition
                            {

                            							newCompositeNode(grammarAccess.getInputAccess().getConditionConditionParserRuleCall_3_0_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_condition_4_0=ruleCondition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInputRule());
                            							}
                            							set(
                            								current,
                            								"condition",
                            								lv_condition_4_0,
                            								"ui.Languagedsl.Condition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLanguagedsl.g:816:4: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '<=' | otherlv_7= '==' | otherlv_8= '!=' | otherlv_9= '>=' ) ( (lv_exp_10_0= ruleExp ) ) )
                    {
                    // InternalLanguagedsl.g:816:4: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '<=' | otherlv_7= '==' | otherlv_8= '!=' | otherlv_9= '>=' ) ( (lv_exp_10_0= ruleExp ) ) )
                    // InternalLanguagedsl.g:817:5: ( (otherlv_5= RULE_ID ) ) (otherlv_6= '<=' | otherlv_7= '==' | otherlv_8= '!=' | otherlv_9= '>=' ) ( (lv_exp_10_0= ruleExp ) )
                    {
                    // InternalLanguagedsl.g:817:5: ( (otherlv_5= RULE_ID ) )
                    // InternalLanguagedsl.g:818:6: (otherlv_5= RULE_ID )
                    {
                    // InternalLanguagedsl.g:818:6: (otherlv_5= RULE_ID )
                    // InternalLanguagedsl.g:819:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInputRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

                    							newLeafNode(otherlv_5, grammarAccess.getInputAccess().getRefReferenceCrossReference_3_1_0_0());
                    						

                    }


                    }

                    // InternalLanguagedsl.g:830:5: (otherlv_6= '<=' | otherlv_7= '==' | otherlv_8= '!=' | otherlv_9= '>=' )
                    int alt13=4;
                    switch ( input.LA(1) ) {
                    case 24:
                        {
                        alt13=1;
                        }
                        break;
                    case 25:
                        {
                        alt13=2;
                        }
                        break;
                    case 26:
                        {
                        alt13=3;
                        }
                        break;
                    case 27:
                        {
                        alt13=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // InternalLanguagedsl.g:831:6: otherlv_6= '<='
                            {
                            otherlv_6=(Token)match(input,24,FOLLOW_15); 

                            						newLeafNode(otherlv_6, grammarAccess.getInputAccess().getLessThanSignEqualsSignKeyword_3_1_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalLanguagedsl.g:836:6: otherlv_7= '=='
                            {
                            otherlv_7=(Token)match(input,25,FOLLOW_15); 

                            						newLeafNode(otherlv_7, grammarAccess.getInputAccess().getEqualsSignEqualsSignKeyword_3_1_1_1());
                            					

                            }
                            break;
                        case 3 :
                            // InternalLanguagedsl.g:841:6: otherlv_8= '!='
                            {
                            otherlv_8=(Token)match(input,26,FOLLOW_15); 

                            						newLeafNode(otherlv_8, grammarAccess.getInputAccess().getExclamationMarkEqualsSignKeyword_3_1_1_2());
                            					

                            }
                            break;
                        case 4 :
                            // InternalLanguagedsl.g:846:6: otherlv_9= '>='
                            {
                            otherlv_9=(Token)match(input,27,FOLLOW_15); 

                            						newLeafNode(otherlv_9, grammarAccess.getInputAccess().getGreaterThanSignEqualsSignKeyword_3_1_1_3());
                            					

                            }
                            break;

                    }

                    // InternalLanguagedsl.g:851:5: ( (lv_exp_10_0= ruleExp ) )
                    // InternalLanguagedsl.g:852:6: (lv_exp_10_0= ruleExp )
                    {
                    // InternalLanguagedsl.g:852:6: (lv_exp_10_0= ruleExp )
                    // InternalLanguagedsl.g:853:7: lv_exp_10_0= ruleExp
                    {

                    							newCompositeNode(grammarAccess.getInputAccess().getExpExpParserRuleCall_3_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_exp_10_0=ruleExp();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInputRule());
                    							}
                    							set(
                    								current,
                    								"exp",
                    								lv_exp_10_0,
                    								"ui.Languagedsl.Exp");
                    							afterParserOrEnumRuleCall();
                    						

                    }


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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleCondition"
    // InternalLanguagedsl.g:876:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalLanguagedsl.g:876:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalLanguagedsl.g:877:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalLanguagedsl.g:883:1: ruleCondition returns [EObject current=null] : ( ( ( (lv_op_0_1= '>' | lv_op_0_2= '<' | lv_op_0_3= '<=' | lv_op_0_4= '>=' | lv_op_0_5= '==' | lv_op_0_6= '!=' ) ) ) ( ( (lv_exp_1_0= ruleExp ) ) | ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '&&' ( (lv_type_4_0= ruleType ) ) ( ( (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' ) ) ) ( (lv_exp2_6_0= ruleExp ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;
        Token lv_op_0_5=null;
        Token lv_op_0_6=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_op2_5_1=null;
        Token lv_op2_5_2=null;
        Token lv_op2_5_3=null;
        Token lv_op2_5_4=null;
        Token lv_op2_5_5=null;
        Token lv_op2_5_6=null;
        EObject lv_exp_1_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;

        EObject lv_exp2_6_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:889:2: ( ( ( ( (lv_op_0_1= '>' | lv_op_0_2= '<' | lv_op_0_3= '<=' | lv_op_0_4= '>=' | lv_op_0_5= '==' | lv_op_0_6= '!=' ) ) ) ( ( (lv_exp_1_0= ruleExp ) ) | ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '&&' ( (lv_type_4_0= ruleType ) ) ( ( (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' ) ) ) ( (lv_exp2_6_0= ruleExp ) ) )? ) )
            // InternalLanguagedsl.g:890:2: ( ( ( (lv_op_0_1= '>' | lv_op_0_2= '<' | lv_op_0_3= '<=' | lv_op_0_4= '>=' | lv_op_0_5= '==' | lv_op_0_6= '!=' ) ) ) ( ( (lv_exp_1_0= ruleExp ) ) | ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '&&' ( (lv_type_4_0= ruleType ) ) ( ( (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' ) ) ) ( (lv_exp2_6_0= ruleExp ) ) )? )
            {
            // InternalLanguagedsl.g:890:2: ( ( ( (lv_op_0_1= '>' | lv_op_0_2= '<' | lv_op_0_3= '<=' | lv_op_0_4= '>=' | lv_op_0_5= '==' | lv_op_0_6= '!=' ) ) ) ( ( (lv_exp_1_0= ruleExp ) ) | ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '&&' ( (lv_type_4_0= ruleType ) ) ( ( (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' ) ) ) ( (lv_exp2_6_0= ruleExp ) ) )? )
            // InternalLanguagedsl.g:891:3: ( ( (lv_op_0_1= '>' | lv_op_0_2= '<' | lv_op_0_3= '<=' | lv_op_0_4= '>=' | lv_op_0_5= '==' | lv_op_0_6= '!=' ) ) ) ( ( (lv_exp_1_0= ruleExp ) ) | ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '&&' ( (lv_type_4_0= ruleType ) ) ( ( (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' ) ) ) ( (lv_exp2_6_0= ruleExp ) ) )?
            {
            // InternalLanguagedsl.g:891:3: ( ( (lv_op_0_1= '>' | lv_op_0_2= '<' | lv_op_0_3= '<=' | lv_op_0_4= '>=' | lv_op_0_5= '==' | lv_op_0_6= '!=' ) ) )
            // InternalLanguagedsl.g:892:4: ( (lv_op_0_1= '>' | lv_op_0_2= '<' | lv_op_0_3= '<=' | lv_op_0_4= '>=' | lv_op_0_5= '==' | lv_op_0_6= '!=' ) )
            {
            // InternalLanguagedsl.g:892:4: ( (lv_op_0_1= '>' | lv_op_0_2= '<' | lv_op_0_3= '<=' | lv_op_0_4= '>=' | lv_op_0_5= '==' | lv_op_0_6= '!=' ) )
            // InternalLanguagedsl.g:893:5: (lv_op_0_1= '>' | lv_op_0_2= '<' | lv_op_0_3= '<=' | lv_op_0_4= '>=' | lv_op_0_5= '==' | lv_op_0_6= '!=' )
            {
            // InternalLanguagedsl.g:893:5: (lv_op_0_1= '>' | lv_op_0_2= '<' | lv_op_0_3= '<=' | lv_op_0_4= '>=' | lv_op_0_5= '==' | lv_op_0_6= '!=' )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 24:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                alt15=4;
                }
                break;
            case 25:
                {
                alt15=5;
                }
                break;
            case 26:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalLanguagedsl.g:894:6: lv_op_0_1= '>'
                    {
                    lv_op_0_1=(Token)match(input,28,FOLLOW_19); 

                    						newLeafNode(lv_op_0_1, grammarAccess.getConditionAccess().getOpGreaterThanSignKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLanguagedsl.g:905:6: lv_op_0_2= '<'
                    {
                    lv_op_0_2=(Token)match(input,29,FOLLOW_19); 

                    						newLeafNode(lv_op_0_2, grammarAccess.getConditionAccess().getOpLessThanSignKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalLanguagedsl.g:916:6: lv_op_0_3= '<='
                    {
                    lv_op_0_3=(Token)match(input,24,FOLLOW_19); 

                    						newLeafNode(lv_op_0_3, grammarAccess.getConditionAccess().getOpLessThanSignEqualsSignKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalLanguagedsl.g:927:6: lv_op_0_4= '>='
                    {
                    lv_op_0_4=(Token)match(input,27,FOLLOW_19); 

                    						newLeafNode(lv_op_0_4, grammarAccess.getConditionAccess().getOpGreaterThanSignEqualsSignKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalLanguagedsl.g:938:6: lv_op_0_5= '=='
                    {
                    lv_op_0_5=(Token)match(input,25,FOLLOW_19); 

                    						newLeafNode(lv_op_0_5, grammarAccess.getConditionAccess().getOpEqualsSignEqualsSignKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalLanguagedsl.g:949:6: lv_op_0_6= '!='
                    {
                    lv_op_0_6=(Token)match(input,26,FOLLOW_19); 

                    						newLeafNode(lv_op_0_6, grammarAccess.getConditionAccess().getOpExclamationMarkEqualsSignKeyword_0_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_0_6, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalLanguagedsl.g:962:3: ( ( (lv_exp_1_0= ruleExp ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_INT)||(LA16_0>=33 && LA16_0<=36)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalLanguagedsl.g:963:4: ( (lv_exp_1_0= ruleExp ) )
                    {
                    // InternalLanguagedsl.g:963:4: ( (lv_exp_1_0= ruleExp ) )
                    // InternalLanguagedsl.g:964:5: (lv_exp_1_0= ruleExp )
                    {
                    // InternalLanguagedsl.g:964:5: (lv_exp_1_0= ruleExp )
                    // InternalLanguagedsl.g:965:6: lv_exp_1_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getExpExpParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_exp_1_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_1_0,
                    							"ui.Languagedsl.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLanguagedsl.g:983:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalLanguagedsl.g:983:4: ( (otherlv_2= RULE_ID ) )
                    // InternalLanguagedsl.g:984:5: (otherlv_2= RULE_ID )
                    {
                    // InternalLanguagedsl.g:984:5: (otherlv_2= RULE_ID )
                    // InternalLanguagedsl.g:985:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getRefReferenceCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLanguagedsl.g:997:3: (otherlv_3= '&&' ( (lv_type_4_0= ruleType ) ) ( ( (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' ) ) ) ( (lv_exp2_6_0= ruleExp ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLanguagedsl.g:998:4: otherlv_3= '&&' ( (lv_type_4_0= ruleType ) ) ( ( (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' ) ) ) ( (lv_exp2_6_0= ruleExp ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getAmpersandAmpersandKeyword_2_0());
                    			
                    // InternalLanguagedsl.g:1002:4: ( (lv_type_4_0= ruleType ) )
                    // InternalLanguagedsl.g:1003:5: (lv_type_4_0= ruleType )
                    {
                    // InternalLanguagedsl.g:1003:5: (lv_type_4_0= ruleType )
                    // InternalLanguagedsl.g:1004:6: lv_type_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getTypeTypeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_type_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"ui.Languagedsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLanguagedsl.g:1021:4: ( ( (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' ) ) )
                    // InternalLanguagedsl.g:1022:5: ( (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' ) )
                    {
                    // InternalLanguagedsl.g:1022:5: ( (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' ) )
                    // InternalLanguagedsl.g:1023:6: (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' )
                    {
                    // InternalLanguagedsl.g:1023:6: (lv_op2_5_1= '>' | lv_op2_5_2= '<' | lv_op2_5_3= '<=' | lv_op2_5_4= '>=' | lv_op2_5_5= '==' | lv_op2_5_6= '!=' )
                    int alt17=6;
                    switch ( input.LA(1) ) {
                    case 28:
                        {
                        alt17=1;
                        }
                        break;
                    case 29:
                        {
                        alt17=2;
                        }
                        break;
                    case 24:
                        {
                        alt17=3;
                        }
                        break;
                    case 27:
                        {
                        alt17=4;
                        }
                        break;
                    case 25:
                        {
                        alt17=5;
                        }
                        break;
                    case 26:
                        {
                        alt17=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }

                    switch (alt17) {
                        case 1 :
                            // InternalLanguagedsl.g:1024:7: lv_op2_5_1= '>'
                            {
                            lv_op2_5_1=(Token)match(input,28,FOLLOW_15); 

                            							newLeafNode(lv_op2_5_1, grammarAccess.getConditionAccess().getOp2GreaterThanSignKeyword_2_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "op2", lv_op2_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalLanguagedsl.g:1035:7: lv_op2_5_2= '<'
                            {
                            lv_op2_5_2=(Token)match(input,29,FOLLOW_15); 

                            							newLeafNode(lv_op2_5_2, grammarAccess.getConditionAccess().getOp2LessThanSignKeyword_2_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "op2", lv_op2_5_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalLanguagedsl.g:1046:7: lv_op2_5_3= '<='
                            {
                            lv_op2_5_3=(Token)match(input,24,FOLLOW_15); 

                            							newLeafNode(lv_op2_5_3, grammarAccess.getConditionAccess().getOp2LessThanSignEqualsSignKeyword_2_2_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "op2", lv_op2_5_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalLanguagedsl.g:1057:7: lv_op2_5_4= '>='
                            {
                            lv_op2_5_4=(Token)match(input,27,FOLLOW_15); 

                            							newLeafNode(lv_op2_5_4, grammarAccess.getConditionAccess().getOp2GreaterThanSignEqualsSignKeyword_2_2_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "op2", lv_op2_5_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalLanguagedsl.g:1068:7: lv_op2_5_5= '=='
                            {
                            lv_op2_5_5=(Token)match(input,25,FOLLOW_15); 

                            							newLeafNode(lv_op2_5_5, grammarAccess.getConditionAccess().getOp2EqualsSignEqualsSignKeyword_2_2_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "op2", lv_op2_5_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalLanguagedsl.g:1079:7: lv_op2_5_6= '!='
                            {
                            lv_op2_5_6=(Token)match(input,26,FOLLOW_15); 

                            							newLeafNode(lv_op2_5_6, grammarAccess.getConditionAccess().getOp2ExclamationMarkEqualsSignKeyword_2_2_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "op2", lv_op2_5_6, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalLanguagedsl.g:1092:4: ( (lv_exp2_6_0= ruleExp ) )
                    // InternalLanguagedsl.g:1093:5: (lv_exp2_6_0= ruleExp )
                    {
                    // InternalLanguagedsl.g:1093:5: (lv_exp2_6_0= ruleExp )
                    // InternalLanguagedsl.g:1094:6: lv_exp2_6_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getExp2ExpParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp2_6_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"exp2",
                    							lv_exp2_6_0,
                    							"ui.Languagedsl.Exp");
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleLabel"
    // InternalLanguagedsl.g:1116:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalLanguagedsl.g:1116:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalLanguagedsl.g:1117:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalLanguagedsl.g:1123:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= '&' ( (lv_field_4_0= ruleField ) ) otherlv_5= '&' )? ( (lv_exp2_6_0= ruleExp ) )? ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_2_0 = null;

        EObject lv_field_4_0 = null;

        EObject lv_exp2_6_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:1129:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= '&' ( (lv_field_4_0= ruleField ) ) otherlv_5= '&' )? ( (lv_exp2_6_0= ruleExp ) )? ) )
            // InternalLanguagedsl.g:1130:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= '&' ( (lv_field_4_0= ruleField ) ) otherlv_5= '&' )? ( (lv_exp2_6_0= ruleExp ) )? )
            {
            // InternalLanguagedsl.g:1130:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= '&' ( (lv_field_4_0= ruleField ) ) otherlv_5= '&' )? ( (lv_exp2_6_0= ruleExp ) )? )
            // InternalLanguagedsl.g:1131:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) (otherlv_3= '&' ( (lv_field_4_0= ruleField ) ) otherlv_5= '&' )? ( (lv_exp2_6_0= ruleExp ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
            		
            // InternalLanguagedsl.g:1139:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalLanguagedsl.g:1140:4: (lv_exp_2_0= ruleExp )
            {
            // InternalLanguagedsl.g:1140:4: (lv_exp_2_0= ruleExp )
            // InternalLanguagedsl.g:1141:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"ui.Languagedsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLanguagedsl.g:1158:3: (otherlv_3= '&' ( (lv_field_4_0= ruleField ) ) otherlv_5= '&' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLanguagedsl.g:1159:4: otherlv_3= '&' ( (lv_field_4_0= ruleField ) ) otherlv_5= '&'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getAmpersandKeyword_3_0());
                    			
                    // InternalLanguagedsl.g:1163:4: ( (lv_field_4_0= ruleField ) )
                    // InternalLanguagedsl.g:1164:5: (lv_field_4_0= ruleField )
                    {
                    // InternalLanguagedsl.g:1164:5: (lv_field_4_0= ruleField )
                    // InternalLanguagedsl.g:1165:6: lv_field_4_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getLabelAccess().getFieldFieldParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_field_4_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabelRule());
                    						}
                    						add(
                    							current,
                    							"field",
                    							lv_field_4_0,
                    							"ui.Languagedsl.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getLabelAccess().getAmpersandKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalLanguagedsl.g:1187:3: ( (lv_exp2_6_0= ruleExp ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_INT)||(LA20_0>=33 && LA20_0<=36)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLanguagedsl.g:1188:4: (lv_exp2_6_0= ruleExp )
                    {
                    // InternalLanguagedsl.g:1188:4: (lv_exp2_6_0= ruleExp )
                    // InternalLanguagedsl.g:1189:5: lv_exp2_6_0= ruleExp
                    {

                    					newCompositeNode(grammarAccess.getLabelAccess().getExp2ExpParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exp2_6_0=ruleExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLabelRule());
                    					}
                    					set(
                    						current,
                    						"exp2",
                    						lv_exp2_6_0,
                    						"ui.Languagedsl.Exp");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleField"
    // InternalLanguagedsl.g:1210:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalLanguagedsl.g:1210:46: (iv_ruleField= ruleField EOF )
            // InternalLanguagedsl.g:1211:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalLanguagedsl.g:1217:1: ruleField returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLanguagedsl.g:1223:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLanguagedsl.g:1224:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLanguagedsl.g:1224:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLanguagedsl.g:1225:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLanguagedsl.g:1225:3: (lv_name_0_0= RULE_ID )
            // InternalLanguagedsl.g:1226:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFieldRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleExp"
    // InternalLanguagedsl.g:1245:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalLanguagedsl.g:1245:44: (iv_ruleExp= ruleExp EOF )
            // InternalLanguagedsl.g:1246:2: iv_ruleExp= ruleExp EOF
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
    // InternalLanguagedsl.g:1252:1: ruleExp returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_type_1_0= ruleType ) ) | ( (lv_number_2_0= RULE_INT ) ) | this_TextExp_3= ruleTextExp ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_number_2_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject this_TextExp_3 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:1258:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_type_1_0= ruleType ) ) | ( (lv_number_2_0= RULE_INT ) ) | this_TextExp_3= ruleTextExp ) )
            // InternalLanguagedsl.g:1259:2: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_type_1_0= ruleType ) ) | ( (lv_number_2_0= RULE_INT ) ) | this_TextExp_3= ruleTextExp )
            {
            // InternalLanguagedsl.g:1259:2: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_type_1_0= ruleType ) ) | ( (lv_number_2_0= RULE_INT ) ) | this_TextExp_3= ruleTextExp )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt21=1;
                }
                break;
            case 34:
            case 35:
            case 36:
                {
                alt21=2;
                }
                break;
            case RULE_INT:
                {
                alt21=3;
                }
                break;
            case 33:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalLanguagedsl.g:1260:3: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // InternalLanguagedsl.g:1260:3: ( (lv_value_0_0= RULE_STRING ) )
                    // InternalLanguagedsl.g:1261:4: (lv_value_0_0= RULE_STRING )
                    {
                    // InternalLanguagedsl.g:1261:4: (lv_value_0_0= RULE_STRING )
                    // InternalLanguagedsl.g:1262:5: lv_value_0_0= RULE_STRING
                    {
                    lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getExpAccess().getValueSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLanguagedsl.g:1279:3: ( (lv_type_1_0= ruleType ) )
                    {
                    // InternalLanguagedsl.g:1279:3: ( (lv_type_1_0= ruleType ) )
                    // InternalLanguagedsl.g:1280:4: (lv_type_1_0= ruleType )
                    {
                    // InternalLanguagedsl.g:1280:4: (lv_type_1_0= ruleType )
                    // InternalLanguagedsl.g:1281:5: lv_type_1_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getExpAccess().getTypeTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_1_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"ui.Languagedsl.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLanguagedsl.g:1299:3: ( (lv_number_2_0= RULE_INT ) )
                    {
                    // InternalLanguagedsl.g:1299:3: ( (lv_number_2_0= RULE_INT ) )
                    // InternalLanguagedsl.g:1300:4: (lv_number_2_0= RULE_INT )
                    {
                    // InternalLanguagedsl.g:1300:4: (lv_number_2_0= RULE_INT )
                    // InternalLanguagedsl.g:1301:5: lv_number_2_0= RULE_INT
                    {
                    lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_number_2_0, grammarAccess.getExpAccess().getNumberINTTerminalRuleCall_2_0());
                    				

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
                case 4 :
                    // InternalLanguagedsl.g:1318:3: this_TextExp_3= ruleTextExp
                    {

                    			newCompositeNode(grammarAccess.getExpAccess().getTextExpParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextExp_3=ruleTextExp();

                    state._fsp--;


                    			current = this_TextExp_3;
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


    // $ANTLR start "entryRuleTextExp"
    // InternalLanguagedsl.g:1330:1: entryRuleTextExp returns [EObject current=null] : iv_ruleTextExp= ruleTextExp EOF ;
    public final EObject entryRuleTextExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExp = null;


        try {
            // InternalLanguagedsl.g:1330:48: (iv_ruleTextExp= ruleTextExp EOF )
            // InternalLanguagedsl.g:1331:2: iv_ruleTextExp= ruleTextExp EOF
            {
             newCompositeNode(grammarAccess.getTextExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextExp=ruleTextExp();

            state._fsp--;

             current =iv_ruleTextExp; 
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
    // $ANTLR end "entryRuleTextExp"


    // $ANTLR start "ruleTextExp"
    // InternalLanguagedsl.g:1337:1: ruleTextExp returns [EObject current=null] : (otherlv_0= '#' ( (lv_exp_1_0= ruleExp ) ) ) ;
    public final EObject ruleTextExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalLanguagedsl.g:1343:2: ( (otherlv_0= '#' ( (lv_exp_1_0= ruleExp ) ) ) )
            // InternalLanguagedsl.g:1344:2: (otherlv_0= '#' ( (lv_exp_1_0= ruleExp ) ) )
            {
            // InternalLanguagedsl.g:1344:2: (otherlv_0= '#' ( (lv_exp_1_0= ruleExp ) ) )
            // InternalLanguagedsl.g:1345:3: otherlv_0= '#' ( (lv_exp_1_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getTextExpAccess().getNumberSignKeyword_0());
            		
            // InternalLanguagedsl.g:1349:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalLanguagedsl.g:1350:4: (lv_exp_1_0= ruleExp )
            {
            // InternalLanguagedsl.g:1350:4: (lv_exp_1_0= ruleExp )
            // InternalLanguagedsl.g:1351:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getTextExpAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"ui.Languagedsl.Exp");
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
    // $ANTLR end "ruleTextExp"


    // $ANTLR start "entryRuleType"
    // InternalLanguagedsl.g:1372:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalLanguagedsl.g:1372:44: (iv_ruleType= ruleType EOF )
            // InternalLanguagedsl.g:1373:2: iv_ruleType= ruleType EOF
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
    // InternalLanguagedsl.g:1379:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'boolean' | kw= 'number' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLanguagedsl.g:1385:2: ( (kw= 'string' | kw= 'boolean' | kw= 'number' ) )
            // InternalLanguagedsl.g:1386:2: (kw= 'string' | kw= 'boolean' | kw= 'number' )
            {
            // InternalLanguagedsl.g:1386:2: (kw= 'string' | kw= 'boolean' | kw= 'number' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt22=1;
                }
                break;
            case 35:
                {
                alt22=2;
                }
                break;
            case 36:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalLanguagedsl.g:1387:3: kw= 'string'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLanguagedsl.g:1393:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLanguagedsl.g:1399:3: kw= 'number'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getNumberKeyword_2());
                    		

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001E00008060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001E00000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080BA0010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001E00000070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000003F000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001F00000062L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001E00000062L});

}