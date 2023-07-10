package interactive.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import interactive.services.FictiondslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFictiondslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'this'", "'+'", "'-'", "'text'", "'number'", "'boolean'", "'story'", "'function'", "'('", "')'", "':'", "'scenario'", "'{'", "'}'", "'var'", "'question'", "'as'", "'in'", "'announce'", "'&'", "'to'", "'if'", "'end'"
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

    	public void setGrammarAccess(FictiondslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleStory"
    // InternalFictiondsl.g:53:1: entryRuleStory : ruleStory EOF ;
    public final void entryRuleStory() throws RecognitionException {
        try {
            // InternalFictiondsl.g:54:1: ( ruleStory EOF )
            // InternalFictiondsl.g:55:1: ruleStory EOF
            {
             before(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getStoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalFictiondsl.g:62:1: ruleStory : ( ( rule__Story__Group__0 ) ) ;
    public final void ruleStory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:66:2: ( ( ( rule__Story__Group__0 ) ) )
            // InternalFictiondsl.g:67:2: ( ( rule__Story__Group__0 ) )
            {
            // InternalFictiondsl.g:67:2: ( ( rule__Story__Group__0 ) )
            // InternalFictiondsl.g:68:3: ( rule__Story__Group__0 )
            {
             before(grammarAccess.getStoryAccess().getGroup()); 
            // InternalFictiondsl.g:69:3: ( rule__Story__Group__0 )
            // InternalFictiondsl.g:69:4: rule__Story__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleExternal"
    // InternalFictiondsl.g:78:1: entryRuleExternal : ruleExternal EOF ;
    public final void entryRuleExternal() throws RecognitionException {
        try {
            // InternalFictiondsl.g:79:1: ( ruleExternal EOF )
            // InternalFictiondsl.g:80:1: ruleExternal EOF
            {
             before(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            ruleExternal();

            state._fsp--;

             after(grammarAccess.getExternalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalFictiondsl.g:87:1: ruleExternal : ( ( rule__External__Group__0 ) ) ;
    public final void ruleExternal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:91:2: ( ( ( rule__External__Group__0 ) ) )
            // InternalFictiondsl.g:92:2: ( ( rule__External__Group__0 ) )
            {
            // InternalFictiondsl.g:92:2: ( ( rule__External__Group__0 ) )
            // InternalFictiondsl.g:93:3: ( rule__External__Group__0 )
            {
             before(grammarAccess.getExternalAccess().getGroup()); 
            // InternalFictiondsl.g:94:3: ( rule__External__Group__0 )
            // InternalFictiondsl.g:94:4: rule__External__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleScenario"
    // InternalFictiondsl.g:103:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalFictiondsl.g:104:1: ( ruleScenario EOF )
            // InternalFictiondsl.g:105:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalFictiondsl.g:112:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:116:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalFictiondsl.g:117:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalFictiondsl.g:117:2: ( ( rule__Scenario__Group__0 ) )
            // InternalFictiondsl.g:118:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalFictiondsl.g:119:3: ( rule__Scenario__Group__0 )
            // InternalFictiondsl.g:119:4: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleVarDef"
    // InternalFictiondsl.g:128:1: entryRuleVarDef : ruleVarDef EOF ;
    public final void entryRuleVarDef() throws RecognitionException {
        try {
            // InternalFictiondsl.g:129:1: ( ruleVarDef EOF )
            // InternalFictiondsl.g:130:1: ruleVarDef EOF
            {
             before(grammarAccess.getVarDefRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDef();

            state._fsp--;

             after(grammarAccess.getVarDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarDef"


    // $ANTLR start "ruleVarDef"
    // InternalFictiondsl.g:137:1: ruleVarDef : ( ( rule__VarDef__Group__0 ) ) ;
    public final void ruleVarDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:141:2: ( ( ( rule__VarDef__Group__0 ) ) )
            // InternalFictiondsl.g:142:2: ( ( rule__VarDef__Group__0 ) )
            {
            // InternalFictiondsl.g:142:2: ( ( rule__VarDef__Group__0 ) )
            // InternalFictiondsl.g:143:3: ( rule__VarDef__Group__0 )
            {
             before(grammarAccess.getVarDefAccess().getGroup()); 
            // InternalFictiondsl.g:144:3: ( rule__VarDef__Group__0 )
            // InternalFictiondsl.g:144:4: rule__VarDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDef"


    // $ANTLR start "entryRuleStatement"
    // InternalFictiondsl.g:153:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalFictiondsl.g:154:1: ( ruleStatement EOF )
            // InternalFictiondsl.g:155:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalFictiondsl.g:162:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:166:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalFictiondsl.g:167:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalFictiondsl.g:167:2: ( ( rule__Statement__Alternatives ) )
            // InternalFictiondsl.g:168:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalFictiondsl.g:169:3: ( rule__Statement__Alternatives )
            // InternalFictiondsl.g:169:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleQuestion"
    // InternalFictiondsl.g:178:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalFictiondsl.g:179:1: ( ruleQuestion EOF )
            // InternalFictiondsl.g:180:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalFictiondsl.g:187:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:191:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalFictiondsl.g:192:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalFictiondsl.g:192:2: ( ( rule__Question__Group__0 ) )
            // InternalFictiondsl.g:193:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalFictiondsl.g:194:3: ( rule__Question__Group__0 )
            // InternalFictiondsl.g:194:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleAnnounce"
    // InternalFictiondsl.g:203:1: entryRuleAnnounce : ruleAnnounce EOF ;
    public final void entryRuleAnnounce() throws RecognitionException {
        try {
            // InternalFictiondsl.g:204:1: ( ruleAnnounce EOF )
            // InternalFictiondsl.g:205:1: ruleAnnounce EOF
            {
             before(grammarAccess.getAnnounceRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnounce();

            state._fsp--;

             after(grammarAccess.getAnnounceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnounce"


    // $ANTLR start "ruleAnnounce"
    // InternalFictiondsl.g:212:1: ruleAnnounce : ( ( rule__Announce__Group__0 ) ) ;
    public final void ruleAnnounce() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:216:2: ( ( ( rule__Announce__Group__0 ) ) )
            // InternalFictiondsl.g:217:2: ( ( rule__Announce__Group__0 ) )
            {
            // InternalFictiondsl.g:217:2: ( ( rule__Announce__Group__0 ) )
            // InternalFictiondsl.g:218:3: ( rule__Announce__Group__0 )
            {
             before(grammarAccess.getAnnounceAccess().getGroup()); 
            // InternalFictiondsl.g:219:3: ( rule__Announce__Group__0 )
            // InternalFictiondsl.g:219:4: rule__Announce__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Announce__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnounceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnounce"


    // $ANTLR start "entryRuleTarget"
    // InternalFictiondsl.g:228:1: entryRuleTarget : ruleTarget EOF ;
    public final void entryRuleTarget() throws RecognitionException {
        try {
            // InternalFictiondsl.g:229:1: ( ruleTarget EOF )
            // InternalFictiondsl.g:230:1: ruleTarget EOF
            {
             before(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getTargetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalFictiondsl.g:237:1: ruleTarget : ( ( rule__Target__Group__0 ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:241:2: ( ( ( rule__Target__Group__0 ) ) )
            // InternalFictiondsl.g:242:2: ( ( rule__Target__Group__0 ) )
            {
            // InternalFictiondsl.g:242:2: ( ( rule__Target__Group__0 ) )
            // InternalFictiondsl.g:243:3: ( rule__Target__Group__0 )
            {
             before(grammarAccess.getTargetAccess().getGroup()); 
            // InternalFictiondsl.g:244:3: ( rule__Target__Group__0 )
            // InternalFictiondsl.g:244:4: rule__Target__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleEnd"
    // InternalFictiondsl.g:253:1: entryRuleEnd : ruleEnd EOF ;
    public final void entryRuleEnd() throws RecognitionException {
        try {
            // InternalFictiondsl.g:254:1: ( ruleEnd EOF )
            // InternalFictiondsl.g:255:1: ruleEnd EOF
            {
             before(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalFictiondsl.g:262:1: ruleEnd : ( ( rule__End__Group__0 ) ) ;
    public final void ruleEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:266:2: ( ( ( rule__End__Group__0 ) ) )
            // InternalFictiondsl.g:267:2: ( ( rule__End__Group__0 ) )
            {
            // InternalFictiondsl.g:267:2: ( ( rule__End__Group__0 ) )
            // InternalFictiondsl.g:268:3: ( rule__End__Group__0 )
            {
             before(grammarAccess.getEndAccess().getGroup()); 
            // InternalFictiondsl.g:269:3: ( rule__End__Group__0 )
            // InternalFictiondsl.g:269:4: rule__End__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__End__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleExp"
    // InternalFictiondsl.g:278:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalFictiondsl.g:279:1: ( ruleExp EOF )
            // InternalFictiondsl.g:280:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalFictiondsl.g:287:1: ruleExp : ( ( rule__Exp__Alternatives ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:291:2: ( ( ( rule__Exp__Alternatives ) ) )
            // InternalFictiondsl.g:292:2: ( ( rule__Exp__Alternatives ) )
            {
            // InternalFictiondsl.g:292:2: ( ( rule__Exp__Alternatives ) )
            // InternalFictiondsl.g:293:3: ( rule__Exp__Alternatives )
            {
             before(grammarAccess.getExpAccess().getAlternatives()); 
            // InternalFictiondsl.g:294:3: ( rule__Exp__Alternatives )
            // InternalFictiondsl.g:294:4: rule__Exp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleEvaluate"
    // InternalFictiondsl.g:303:1: entryRuleEvaluate : ruleEvaluate EOF ;
    public final void entryRuleEvaluate() throws RecognitionException {
        try {
            // InternalFictiondsl.g:304:1: ( ruleEvaluate EOF )
            // InternalFictiondsl.g:305:1: ruleEvaluate EOF
            {
             before(grammarAccess.getEvaluateRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluate();

            state._fsp--;

             after(grammarAccess.getEvaluateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvaluate"


    // $ANTLR start "ruleEvaluate"
    // InternalFictiondsl.g:312:1: ruleEvaluate : ( ( rule__Evaluate__Group__0 ) ) ;
    public final void ruleEvaluate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:316:2: ( ( ( rule__Evaluate__Group__0 ) ) )
            // InternalFictiondsl.g:317:2: ( ( rule__Evaluate__Group__0 ) )
            {
            // InternalFictiondsl.g:317:2: ( ( rule__Evaluate__Group__0 ) )
            // InternalFictiondsl.g:318:3: ( rule__Evaluate__Group__0 )
            {
             before(grammarAccess.getEvaluateAccess().getGroup()); 
            // InternalFictiondsl.g:319:3: ( rule__Evaluate__Group__0 )
            // InternalFictiondsl.g:319:4: rule__Evaluate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluate"


    // $ANTLR start "entryRuleType"
    // InternalFictiondsl.g:328:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFictiondsl.g:329:1: ( ruleType EOF )
            // InternalFictiondsl.g:330:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalFictiondsl.g:337:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:341:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalFictiondsl.g:342:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalFictiondsl.g:342:2: ( ( rule__Type__Alternatives ) )
            // InternalFictiondsl.g:343:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalFictiondsl.g:344:3: ( rule__Type__Alternatives )
            // InternalFictiondsl.g:344:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalFictiondsl.g:352:1: rule__Statement__Alternatives : ( ( ( rule__Statement__AnnounceAssignment_0 ) ) | ( ( rule__Statement__EndAssignment_1 ) ) | ( ( rule__Statement__QuestionAssignment_2 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:356:1: ( ( ( rule__Statement__AnnounceAssignment_0 ) ) | ( ( rule__Statement__EndAssignment_1 ) ) | ( ( rule__Statement__QuestionAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt1=1;
                }
                break;
            case 39:
                {
                alt1=2;
                }
                break;
            case 32:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalFictiondsl.g:357:2: ( ( rule__Statement__AnnounceAssignment_0 ) )
                    {
                    // InternalFictiondsl.g:357:2: ( ( rule__Statement__AnnounceAssignment_0 ) )
                    // InternalFictiondsl.g:358:3: ( rule__Statement__AnnounceAssignment_0 )
                    {
                     before(grammarAccess.getStatementAccess().getAnnounceAssignment_0()); 
                    // InternalFictiondsl.g:359:3: ( rule__Statement__AnnounceAssignment_0 )
                    // InternalFictiondsl.g:359:4: rule__Statement__AnnounceAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__AnnounceAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getAnnounceAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:363:2: ( ( rule__Statement__EndAssignment_1 ) )
                    {
                    // InternalFictiondsl.g:363:2: ( ( rule__Statement__EndAssignment_1 ) )
                    // InternalFictiondsl.g:364:3: ( rule__Statement__EndAssignment_1 )
                    {
                     before(grammarAccess.getStatementAccess().getEndAssignment_1()); 
                    // InternalFictiondsl.g:365:3: ( rule__Statement__EndAssignment_1 )
                    // InternalFictiondsl.g:365:4: rule__Statement__EndAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__EndAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getEndAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFictiondsl.g:369:2: ( ( rule__Statement__QuestionAssignment_2 ) )
                    {
                    // InternalFictiondsl.g:369:2: ( ( rule__Statement__QuestionAssignment_2 ) )
                    // InternalFictiondsl.g:370:3: ( rule__Statement__QuestionAssignment_2 )
                    {
                     before(grammarAccess.getStatementAccess().getQuestionAssignment_2()); 
                    // InternalFictiondsl.g:371:3: ( rule__Statement__QuestionAssignment_2 )
                    // InternalFictiondsl.g:371:4: rule__Statement__QuestionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__QuestionAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getQuestionAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Question__Alternatives_3_1"
    // InternalFictiondsl.g:379:1: rule__Question__Alternatives_3_1 : ( ( ( rule__Question__TypeAssignment_3_1_0 ) ) | ( ( rule__Question__Group_3_1_1__0 ) ) );
    public final void rule__Question__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:383:1: ( ( ( rule__Question__TypeAssignment_3_1_0 ) ) | ( ( rule__Question__Group_3_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=20 && LA2_0<=22)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFictiondsl.g:384:2: ( ( rule__Question__TypeAssignment_3_1_0 ) )
                    {
                    // InternalFictiondsl.g:384:2: ( ( rule__Question__TypeAssignment_3_1_0 ) )
                    // InternalFictiondsl.g:385:3: ( rule__Question__TypeAssignment_3_1_0 )
                    {
                     before(grammarAccess.getQuestionAccess().getTypeAssignment_3_1_0()); 
                    // InternalFictiondsl.g:386:3: ( rule__Question__TypeAssignment_3_1_0 )
                    // InternalFictiondsl.g:386:4: rule__Question__TypeAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__TypeAssignment_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getTypeAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:390:2: ( ( rule__Question__Group_3_1_1__0 ) )
                    {
                    // InternalFictiondsl.g:390:2: ( ( rule__Question__Group_3_1_1__0 ) )
                    // InternalFictiondsl.g:391:3: ( rule__Question__Group_3_1_1__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_3_1_1()); 
                    // InternalFictiondsl.g:392:3: ( rule__Question__Group_3_1_1__0 )
                    // InternalFictiondsl.g:392:4: rule__Question__Group_3_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_3_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Alternatives_3_1"


    // $ANTLR start "rule__Question__OpAlternatives_4_0_0"
    // InternalFictiondsl.g:400:1: rule__Question__OpAlternatives_4_0_0 : ( ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '==' ) | ( '!=' ) );
    public final void rule__Question__OpAlternatives_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:404:1: ( ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '==' ) | ( '!=' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFictiondsl.g:405:2: ( '<' )
                    {
                    // InternalFictiondsl.g:405:2: ( '<' )
                    // InternalFictiondsl.g:406:3: '<'
                    {
                     before(grammarAccess.getQuestionAccess().getOpLessThanSignKeyword_4_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getQuestionAccess().getOpLessThanSignKeyword_4_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:411:2: ( '<=' )
                    {
                    // InternalFictiondsl.g:411:2: ( '<=' )
                    // InternalFictiondsl.g:412:3: '<='
                    {
                     before(grammarAccess.getQuestionAccess().getOpLessThanSignEqualsSignKeyword_4_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getQuestionAccess().getOpLessThanSignEqualsSignKeyword_4_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFictiondsl.g:417:2: ( '>' )
                    {
                    // InternalFictiondsl.g:417:2: ( '>' )
                    // InternalFictiondsl.g:418:3: '>'
                    {
                     before(grammarAccess.getQuestionAccess().getOpGreaterThanSignKeyword_4_0_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getQuestionAccess().getOpGreaterThanSignKeyword_4_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFictiondsl.g:423:2: ( '>=' )
                    {
                    // InternalFictiondsl.g:423:2: ( '>=' )
                    // InternalFictiondsl.g:424:3: '>='
                    {
                     before(grammarAccess.getQuestionAccess().getOpGreaterThanSignEqualsSignKeyword_4_0_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getQuestionAccess().getOpGreaterThanSignEqualsSignKeyword_4_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFictiondsl.g:429:2: ( '==' )
                    {
                    // InternalFictiondsl.g:429:2: ( '==' )
                    // InternalFictiondsl.g:430:3: '=='
                    {
                     before(grammarAccess.getQuestionAccess().getOpEqualsSignEqualsSignKeyword_4_0_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getQuestionAccess().getOpEqualsSignEqualsSignKeyword_4_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFictiondsl.g:435:2: ( '!=' )
                    {
                    // InternalFictiondsl.g:435:2: ( '!=' )
                    // InternalFictiondsl.g:436:3: '!='
                    {
                     before(grammarAccess.getQuestionAccess().getOpExclamationMarkEqualsSignKeyword_4_0_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getQuestionAccess().getOpExclamationMarkEqualsSignKeyword_4_0_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__OpAlternatives_4_0_0"


    // $ANTLR start "rule__Target__Alternatives_2_1"
    // InternalFictiondsl.g:445:1: rule__Target__Alternatives_2_1 : ( ( ( rule__Target__Group_2_1_0__0 ) ) | ( ( rule__Target__Group_2_1_1__0 ) ) | ( ( rule__Target__ConditionAssignment_2_1_2 ) ) | ( ( rule__Target__Group_2_1_3__0 ) ) );
    public final void rule__Target__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:449:1: ( ( ( rule__Target__Group_2_1_0__0 ) ) | ( ( rule__Target__Group_2_1_1__0 ) ) | ( ( rule__Target__ConditionAssignment_2_1_2 ) ) | ( ( rule__Target__Group_2_1_3__0 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=RULE_STRING && LA4_1<=RULE_INT)||(LA4_1>=11 && LA4_1<=22)) ) {
                    alt4=4;
                }
                else if ( (LA4_1==EOF||LA4_1==25||LA4_1==30||LA4_1==32||LA4_1==35||LA4_1==37||LA4_1==39) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFictiondsl.g:450:2: ( ( rule__Target__Group_2_1_0__0 ) )
                    {
                    // InternalFictiondsl.g:450:2: ( ( rule__Target__Group_2_1_0__0 ) )
                    // InternalFictiondsl.g:451:3: ( rule__Target__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getTargetAccess().getGroup_2_1_0()); 
                    // InternalFictiondsl.g:452:3: ( rule__Target__Group_2_1_0__0 )
                    // InternalFictiondsl.g:452:4: rule__Target__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Target__Group_2_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTargetAccess().getGroup_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:456:2: ( ( rule__Target__Group_2_1_1__0 ) )
                    {
                    // InternalFictiondsl.g:456:2: ( ( rule__Target__Group_2_1_1__0 ) )
                    // InternalFictiondsl.g:457:3: ( rule__Target__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getTargetAccess().getGroup_2_1_1()); 
                    // InternalFictiondsl.g:458:3: ( rule__Target__Group_2_1_1__0 )
                    // InternalFictiondsl.g:458:4: rule__Target__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Target__Group_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTargetAccess().getGroup_2_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFictiondsl.g:462:2: ( ( rule__Target__ConditionAssignment_2_1_2 ) )
                    {
                    // InternalFictiondsl.g:462:2: ( ( rule__Target__ConditionAssignment_2_1_2 ) )
                    // InternalFictiondsl.g:463:3: ( rule__Target__ConditionAssignment_2_1_2 )
                    {
                     before(grammarAccess.getTargetAccess().getConditionAssignment_2_1_2()); 
                    // InternalFictiondsl.g:464:3: ( rule__Target__ConditionAssignment_2_1_2 )
                    // InternalFictiondsl.g:464:4: rule__Target__ConditionAssignment_2_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Target__ConditionAssignment_2_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTargetAccess().getConditionAssignment_2_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFictiondsl.g:468:2: ( ( rule__Target__Group_2_1_3__0 ) )
                    {
                    // InternalFictiondsl.g:468:2: ( ( rule__Target__Group_2_1_3__0 ) )
                    // InternalFictiondsl.g:469:3: ( rule__Target__Group_2_1_3__0 )
                    {
                     before(grammarAccess.getTargetAccess().getGroup_2_1_3()); 
                    // InternalFictiondsl.g:470:3: ( rule__Target__Group_2_1_3__0 )
                    // InternalFictiondsl.g:470:4: rule__Target__Group_2_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Target__Group_2_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTargetAccess().getGroup_2_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Alternatives_2_1"


    // $ANTLR start "rule__Target__Alternatives_2_1_0_1_1"
    // InternalFictiondsl.g:478:1: rule__Target__Alternatives_2_1_0_1_1 : ( ( 'this' ) | ( ( rule__Target__VardefAssignment_2_1_0_1_1_1 ) ) );
    public final void rule__Target__Alternatives_2_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:482:1: ( ( 'this' ) | ( ( rule__Target__VardefAssignment_2_1_0_1_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFictiondsl.g:483:2: ( 'this' )
                    {
                    // InternalFictiondsl.g:483:2: ( 'this' )
                    // InternalFictiondsl.g:484:3: 'this'
                    {
                     before(grammarAccess.getTargetAccess().getThisKeyword_2_1_0_1_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTargetAccess().getThisKeyword_2_1_0_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:489:2: ( ( rule__Target__VardefAssignment_2_1_0_1_1_1 ) )
                    {
                    // InternalFictiondsl.g:489:2: ( ( rule__Target__VardefAssignment_2_1_0_1_1_1 ) )
                    // InternalFictiondsl.g:490:3: ( rule__Target__VardefAssignment_2_1_0_1_1_1 )
                    {
                     before(grammarAccess.getTargetAccess().getVardefAssignment_2_1_0_1_1_1()); 
                    // InternalFictiondsl.g:491:3: ( rule__Target__VardefAssignment_2_1_0_1_1_1 )
                    // InternalFictiondsl.g:491:4: rule__Target__VardefAssignment_2_1_0_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Target__VardefAssignment_2_1_0_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTargetAccess().getVardefAssignment_2_1_0_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Alternatives_2_1_0_1_1"


    // $ANTLR start "rule__Exp__Alternatives"
    // InternalFictiondsl.g:499:1: rule__Exp__Alternatives : ( ( ( rule__Exp__Group_0__0 ) ) | ( ( rule__Exp__NumberAssignment_1 ) ) | ( ( rule__Exp__TypeAssignment_2 ) ) | ( ( rule__Exp__Group_3__0 ) ) | ( ruleEvaluate ) );
    public final void rule__Exp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:503:1: ( ( ( rule__Exp__Group_0__0 ) ) | ( ( rule__Exp__NumberAssignment_1 ) ) | ( ( rule__Exp__TypeAssignment_2 ) ) | ( ( rule__Exp__Group_3__0 ) ) | ( ruleEvaluate ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case 20:
            case 21:
            case 22:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFictiondsl.g:504:2: ( ( rule__Exp__Group_0__0 ) )
                    {
                    // InternalFictiondsl.g:504:2: ( ( rule__Exp__Group_0__0 ) )
                    // InternalFictiondsl.g:505:3: ( rule__Exp__Group_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_0()); 
                    // InternalFictiondsl.g:506:3: ( rule__Exp__Group_0__0 )
                    // InternalFictiondsl.g:506:4: rule__Exp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:510:2: ( ( rule__Exp__NumberAssignment_1 ) )
                    {
                    // InternalFictiondsl.g:510:2: ( ( rule__Exp__NumberAssignment_1 ) )
                    // InternalFictiondsl.g:511:3: ( rule__Exp__NumberAssignment_1 )
                    {
                     before(grammarAccess.getExpAccess().getNumberAssignment_1()); 
                    // InternalFictiondsl.g:512:3: ( rule__Exp__NumberAssignment_1 )
                    // InternalFictiondsl.g:512:4: rule__Exp__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__NumberAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getNumberAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFictiondsl.g:516:2: ( ( rule__Exp__TypeAssignment_2 ) )
                    {
                    // InternalFictiondsl.g:516:2: ( ( rule__Exp__TypeAssignment_2 ) )
                    // InternalFictiondsl.g:517:3: ( rule__Exp__TypeAssignment_2 )
                    {
                     before(grammarAccess.getExpAccess().getTypeAssignment_2()); 
                    // InternalFictiondsl.g:518:3: ( rule__Exp__TypeAssignment_2 )
                    // InternalFictiondsl.g:518:4: rule__Exp__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__TypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getTypeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFictiondsl.g:522:2: ( ( rule__Exp__Group_3__0 ) )
                    {
                    // InternalFictiondsl.g:522:2: ( ( rule__Exp__Group_3__0 ) )
                    // InternalFictiondsl.g:523:3: ( rule__Exp__Group_3__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_3()); 
                    // InternalFictiondsl.g:524:3: ( rule__Exp__Group_3__0 )
                    // InternalFictiondsl.g:524:4: rule__Exp__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFictiondsl.g:528:2: ( ruleEvaluate )
                    {
                    // InternalFictiondsl.g:528:2: ( ruleEvaluate )
                    // InternalFictiondsl.g:529:3: ruleEvaluate
                    {
                     before(grammarAccess.getExpAccess().getEvaluateParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEvaluate();

                    state._fsp--;

                     after(grammarAccess.getExpAccess().getEvaluateParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Alternatives"


    // $ANTLR start "rule__Evaluate__AddAlternatives_0_0_0"
    // InternalFictiondsl.g:538:1: rule__Evaluate__AddAlternatives_0_0_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Evaluate__AddAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:542:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFictiondsl.g:543:2: ( '+' )
                    {
                    // InternalFictiondsl.g:543:2: ( '+' )
                    // InternalFictiondsl.g:544:3: '+'
                    {
                     before(grammarAccess.getEvaluateAccess().getAddPlusSignKeyword_0_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEvaluateAccess().getAddPlusSignKeyword_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:549:2: ( '-' )
                    {
                    // InternalFictiondsl.g:549:2: ( '-' )
                    // InternalFictiondsl.g:550:3: '-'
                    {
                     before(grammarAccess.getEvaluateAccess().getAddHyphenMinusKeyword_0_0_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEvaluateAccess().getAddHyphenMinusKeyword_0_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__AddAlternatives_0_0_0"


    // $ANTLR start "rule__Evaluate__OpAlternatives_1_0"
    // InternalFictiondsl.g:559:1: rule__Evaluate__OpAlternatives_1_0 : ( ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '==' ) | ( '!=' ) );
    public final void rule__Evaluate__OpAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:563:1: ( ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '==' ) | ( '!=' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            case 15:
                {
                alt8=5;
                }
                break;
            case 16:
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
                    // InternalFictiondsl.g:564:2: ( '<' )
                    {
                    // InternalFictiondsl.g:564:2: ( '<' )
                    // InternalFictiondsl.g:565:3: '<'
                    {
                     before(grammarAccess.getEvaluateAccess().getOpLessThanSignKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEvaluateAccess().getOpLessThanSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:570:2: ( '<=' )
                    {
                    // InternalFictiondsl.g:570:2: ( '<=' )
                    // InternalFictiondsl.g:571:3: '<='
                    {
                     before(grammarAccess.getEvaluateAccess().getOpLessThanSignEqualsSignKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEvaluateAccess().getOpLessThanSignEqualsSignKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFictiondsl.g:576:2: ( '>' )
                    {
                    // InternalFictiondsl.g:576:2: ( '>' )
                    // InternalFictiondsl.g:577:3: '>'
                    {
                     before(grammarAccess.getEvaluateAccess().getOpGreaterThanSignKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEvaluateAccess().getOpGreaterThanSignKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFictiondsl.g:582:2: ( '>=' )
                    {
                    // InternalFictiondsl.g:582:2: ( '>=' )
                    // InternalFictiondsl.g:583:3: '>='
                    {
                     before(grammarAccess.getEvaluateAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEvaluateAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFictiondsl.g:588:2: ( '==' )
                    {
                    // InternalFictiondsl.g:588:2: ( '==' )
                    // InternalFictiondsl.g:589:3: '=='
                    {
                     before(grammarAccess.getEvaluateAccess().getOpEqualsSignEqualsSignKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEvaluateAccess().getOpEqualsSignEqualsSignKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFictiondsl.g:594:2: ( '!=' )
                    {
                    // InternalFictiondsl.g:594:2: ( '!=' )
                    // InternalFictiondsl.g:595:3: '!='
                    {
                     before(grammarAccess.getEvaluateAccess().getOpExclamationMarkEqualsSignKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEvaluateAccess().getOpExclamationMarkEqualsSignKeyword_1_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__OpAlternatives_1_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalFictiondsl.g:604:1: rule__Type__Alternatives : ( ( 'text' ) | ( 'number' ) | ( 'boolean' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:608:1: ( ( 'text' ) | ( 'number' ) | ( 'boolean' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
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
                    // InternalFictiondsl.g:609:2: ( 'text' )
                    {
                    // InternalFictiondsl.g:609:2: ( 'text' )
                    // InternalFictiondsl.g:610:3: 'text'
                    {
                     before(grammarAccess.getTypeAccess().getTextKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTextKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFictiondsl.g:615:2: ( 'number' )
                    {
                    // InternalFictiondsl.g:615:2: ( 'number' )
                    // InternalFictiondsl.g:616:3: 'number'
                    {
                     before(grammarAccess.getTypeAccess().getNumberKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getNumberKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFictiondsl.g:621:2: ( 'boolean' )
                    {
                    // InternalFictiondsl.g:621:2: ( 'boolean' )
                    // InternalFictiondsl.g:622:3: 'boolean'
                    {
                     before(grammarAccess.getTypeAccess().getBooleanKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getBooleanKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Story__Group__0"
    // InternalFictiondsl.g:631:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:635:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalFictiondsl.g:636:2: rule__Story__Group__0__Impl rule__Story__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Story__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0"


    // $ANTLR start "rule__Story__Group__0__Impl"
    // InternalFictiondsl.g:643:1: rule__Story__Group__0__Impl : ( 'story' ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:647:1: ( ( 'story' ) )
            // InternalFictiondsl.g:648:1: ( 'story' )
            {
            // InternalFictiondsl.g:648:1: ( 'story' )
            // InternalFictiondsl.g:649:2: 'story'
            {
             before(grammarAccess.getStoryAccess().getStoryKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getStoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0__Impl"


    // $ANTLR start "rule__Story__Group__1"
    // InternalFictiondsl.g:658:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:662:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalFictiondsl.g:663:2: rule__Story__Group__1__Impl rule__Story__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Story__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1"


    // $ANTLR start "rule__Story__Group__1__Impl"
    // InternalFictiondsl.g:670:1: rule__Story__Group__1__Impl : ( ( rule__Story__NameAssignment_1 ) ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:674:1: ( ( ( rule__Story__NameAssignment_1 ) ) )
            // InternalFictiondsl.g:675:1: ( ( rule__Story__NameAssignment_1 ) )
            {
            // InternalFictiondsl.g:675:1: ( ( rule__Story__NameAssignment_1 ) )
            // InternalFictiondsl.g:676:2: ( rule__Story__NameAssignment_1 )
            {
             before(grammarAccess.getStoryAccess().getNameAssignment_1()); 
            // InternalFictiondsl.g:677:2: ( rule__Story__NameAssignment_1 )
            // InternalFictiondsl.g:677:3: rule__Story__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Story__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1__Impl"


    // $ANTLR start "rule__Story__Group__2"
    // InternalFictiondsl.g:685:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:689:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalFictiondsl.g:690:2: rule__Story__Group__2__Impl rule__Story__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Story__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2"


    // $ANTLR start "rule__Story__Group__2__Impl"
    // InternalFictiondsl.g:697:1: rule__Story__Group__2__Impl : ( ( rule__Story__ExternalAssignment_2 )* ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:701:1: ( ( ( rule__Story__ExternalAssignment_2 )* ) )
            // InternalFictiondsl.g:702:1: ( ( rule__Story__ExternalAssignment_2 )* )
            {
            // InternalFictiondsl.g:702:1: ( ( rule__Story__ExternalAssignment_2 )* )
            // InternalFictiondsl.g:703:2: ( rule__Story__ExternalAssignment_2 )*
            {
             before(grammarAccess.getStoryAccess().getExternalAssignment_2()); 
            // InternalFictiondsl.g:704:2: ( rule__Story__ExternalAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFictiondsl.g:704:3: rule__Story__ExternalAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Story__ExternalAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStoryAccess().getExternalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2__Impl"


    // $ANTLR start "rule__Story__Group__3"
    // InternalFictiondsl.g:712:1: rule__Story__Group__3 : rule__Story__Group__3__Impl ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:716:1: ( rule__Story__Group__3__Impl )
            // InternalFictiondsl.g:717:2: rule__Story__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3"


    // $ANTLR start "rule__Story__Group__3__Impl"
    // InternalFictiondsl.g:723:1: rule__Story__Group__3__Impl : ( ( rule__Story__ScenarioAssignment_3 )* ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:727:1: ( ( ( rule__Story__ScenarioAssignment_3 )* ) )
            // InternalFictiondsl.g:728:1: ( ( rule__Story__ScenarioAssignment_3 )* )
            {
            // InternalFictiondsl.g:728:1: ( ( rule__Story__ScenarioAssignment_3 )* )
            // InternalFictiondsl.g:729:2: ( rule__Story__ScenarioAssignment_3 )*
            {
             before(grammarAccess.getStoryAccess().getScenarioAssignment_3()); 
            // InternalFictiondsl.g:730:2: ( rule__Story__ScenarioAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFictiondsl.g:730:3: rule__Story__ScenarioAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Story__ScenarioAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStoryAccess().getScenarioAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3__Impl"


    // $ANTLR start "rule__External__Group__0"
    // InternalFictiondsl.g:739:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:743:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // InternalFictiondsl.g:744:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__External__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__0"


    // $ANTLR start "rule__External__Group__0__Impl"
    // InternalFictiondsl.g:751:1: rule__External__Group__0__Impl : ( 'function' ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:755:1: ( ( 'function' ) )
            // InternalFictiondsl.g:756:1: ( 'function' )
            {
            // InternalFictiondsl.g:756:1: ( 'function' )
            // InternalFictiondsl.g:757:2: 'function'
            {
             before(grammarAccess.getExternalAccess().getFunctionKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__0__Impl"


    // $ANTLR start "rule__External__Group__1"
    // InternalFictiondsl.g:766:1: rule__External__Group__1 : rule__External__Group__1__Impl rule__External__Group__2 ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:770:1: ( rule__External__Group__1__Impl rule__External__Group__2 )
            // InternalFictiondsl.g:771:2: rule__External__Group__1__Impl rule__External__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__External__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__1"


    // $ANTLR start "rule__External__Group__1__Impl"
    // InternalFictiondsl.g:778:1: rule__External__Group__1__Impl : ( ( rule__External__NameAssignment_1 ) ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:782:1: ( ( ( rule__External__NameAssignment_1 ) ) )
            // InternalFictiondsl.g:783:1: ( ( rule__External__NameAssignment_1 ) )
            {
            // InternalFictiondsl.g:783:1: ( ( rule__External__NameAssignment_1 ) )
            // InternalFictiondsl.g:784:2: ( rule__External__NameAssignment_1 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_1()); 
            // InternalFictiondsl.g:785:2: ( rule__External__NameAssignment_1 )
            // InternalFictiondsl.g:785:3: rule__External__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__External__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__1__Impl"


    // $ANTLR start "rule__External__Group__2"
    // InternalFictiondsl.g:793:1: rule__External__Group__2 : rule__External__Group__2__Impl rule__External__Group__3 ;
    public final void rule__External__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:797:1: ( rule__External__Group__2__Impl rule__External__Group__3 )
            // InternalFictiondsl.g:798:2: rule__External__Group__2__Impl rule__External__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__External__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__2"


    // $ANTLR start "rule__External__Group__2__Impl"
    // InternalFictiondsl.g:805:1: rule__External__Group__2__Impl : ( '(' ) ;
    public final void rule__External__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:809:1: ( ( '(' ) )
            // InternalFictiondsl.g:810:1: ( '(' )
            {
            // InternalFictiondsl.g:810:1: ( '(' )
            // InternalFictiondsl.g:811:2: '('
            {
             before(grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__2__Impl"


    // $ANTLR start "rule__External__Group__3"
    // InternalFictiondsl.g:820:1: rule__External__Group__3 : rule__External__Group__3__Impl rule__External__Group__4 ;
    public final void rule__External__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:824:1: ( rule__External__Group__3__Impl rule__External__Group__4 )
            // InternalFictiondsl.g:825:2: rule__External__Group__3__Impl rule__External__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__External__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__3"


    // $ANTLR start "rule__External__Group__3__Impl"
    // InternalFictiondsl.g:832:1: rule__External__Group__3__Impl : ( ( rule__External__TypeAssignment_3 ) ) ;
    public final void rule__External__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:836:1: ( ( ( rule__External__TypeAssignment_3 ) ) )
            // InternalFictiondsl.g:837:1: ( ( rule__External__TypeAssignment_3 ) )
            {
            // InternalFictiondsl.g:837:1: ( ( rule__External__TypeAssignment_3 ) )
            // InternalFictiondsl.g:838:2: ( rule__External__TypeAssignment_3 )
            {
             before(grammarAccess.getExternalAccess().getTypeAssignment_3()); 
            // InternalFictiondsl.g:839:2: ( rule__External__TypeAssignment_3 )
            // InternalFictiondsl.g:839:3: rule__External__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__External__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__3__Impl"


    // $ANTLR start "rule__External__Group__4"
    // InternalFictiondsl.g:847:1: rule__External__Group__4 : rule__External__Group__4__Impl rule__External__Group__5 ;
    public final void rule__External__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:851:1: ( rule__External__Group__4__Impl rule__External__Group__5 )
            // InternalFictiondsl.g:852:2: rule__External__Group__4__Impl rule__External__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__External__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__4"


    // $ANTLR start "rule__External__Group__4__Impl"
    // InternalFictiondsl.g:859:1: rule__External__Group__4__Impl : ( ')' ) ;
    public final void rule__External__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:863:1: ( ( ')' ) )
            // InternalFictiondsl.g:864:1: ( ')' )
            {
            // InternalFictiondsl.g:864:1: ( ')' )
            // InternalFictiondsl.g:865:2: ')'
            {
             before(grammarAccess.getExternalAccess().getRightParenthesisKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__4__Impl"


    // $ANTLR start "rule__External__Group__5"
    // InternalFictiondsl.g:874:1: rule__External__Group__5 : rule__External__Group__5__Impl rule__External__Group__6 ;
    public final void rule__External__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:878:1: ( rule__External__Group__5__Impl rule__External__Group__6 )
            // InternalFictiondsl.g:879:2: rule__External__Group__5__Impl rule__External__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__External__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__5"


    // $ANTLR start "rule__External__Group__5__Impl"
    // InternalFictiondsl.g:886:1: rule__External__Group__5__Impl : ( ':' ) ;
    public final void rule__External__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:890:1: ( ( ':' ) )
            // InternalFictiondsl.g:891:1: ( ':' )
            {
            // InternalFictiondsl.g:891:1: ( ':' )
            // InternalFictiondsl.g:892:2: ':'
            {
             before(grammarAccess.getExternalAccess().getColonKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__5__Impl"


    // $ANTLR start "rule__External__Group__6"
    // InternalFictiondsl.g:901:1: rule__External__Group__6 : rule__External__Group__6__Impl ;
    public final void rule__External__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:905:1: ( rule__External__Group__6__Impl )
            // InternalFictiondsl.g:906:2: rule__External__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__6"


    // $ANTLR start "rule__External__Group__6__Impl"
    // InternalFictiondsl.g:912:1: rule__External__Group__6__Impl : ( ( rule__External__ResultAssignment_6 ) ) ;
    public final void rule__External__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:916:1: ( ( ( rule__External__ResultAssignment_6 ) ) )
            // InternalFictiondsl.g:917:1: ( ( rule__External__ResultAssignment_6 ) )
            {
            // InternalFictiondsl.g:917:1: ( ( rule__External__ResultAssignment_6 ) )
            // InternalFictiondsl.g:918:2: ( rule__External__ResultAssignment_6 )
            {
             before(grammarAccess.getExternalAccess().getResultAssignment_6()); 
            // InternalFictiondsl.g:919:2: ( rule__External__ResultAssignment_6 )
            // InternalFictiondsl.g:919:3: rule__External__ResultAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__External__ResultAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getResultAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__6__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalFictiondsl.g:928:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:932:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalFictiondsl.g:933:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalFictiondsl.g:940:1: rule__Scenario__Group__0__Impl : ( 'scenario' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:944:1: ( ( 'scenario' ) )
            // InternalFictiondsl.g:945:1: ( 'scenario' )
            {
            // InternalFictiondsl.g:945:1: ( 'scenario' )
            // InternalFictiondsl.g:946:2: 'scenario'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // InternalFictiondsl.g:955:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:959:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalFictiondsl.g:960:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalFictiondsl.g:967:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:971:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // InternalFictiondsl.g:972:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // InternalFictiondsl.g:972:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // InternalFictiondsl.g:973:2: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // InternalFictiondsl.g:974:2: ( rule__Scenario__NameAssignment_1 )
            // InternalFictiondsl.g:974:3: rule__Scenario__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // InternalFictiondsl.g:982:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:986:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalFictiondsl.g:987:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalFictiondsl.g:994:1: rule__Scenario__Group__2__Impl : ( '{' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:998:1: ( ( '{' ) )
            // InternalFictiondsl.g:999:1: ( '{' )
            {
            // InternalFictiondsl.g:999:1: ( '{' )
            // InternalFictiondsl.g:1000:2: '{'
            {
             before(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // InternalFictiondsl.g:1009:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1013:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalFictiondsl.g:1014:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalFictiondsl.g:1021:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__VarAssignment_3 )* ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1025:1: ( ( ( rule__Scenario__VarAssignment_3 )* ) )
            // InternalFictiondsl.g:1026:1: ( ( rule__Scenario__VarAssignment_3 )* )
            {
            // InternalFictiondsl.g:1026:1: ( ( rule__Scenario__VarAssignment_3 )* )
            // InternalFictiondsl.g:1027:2: ( rule__Scenario__VarAssignment_3 )*
            {
             before(grammarAccess.getScenarioAccess().getVarAssignment_3()); 
            // InternalFictiondsl.g:1028:2: ( rule__Scenario__VarAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFictiondsl.g:1028:3: rule__Scenario__VarAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Scenario__VarAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getVarAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__4"
    // InternalFictiondsl.g:1036:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1040:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalFictiondsl.g:1041:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Scenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__4"


    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // InternalFictiondsl.g:1048:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StatementAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1052:1: ( ( ( rule__Scenario__StatementAssignment_4 )* ) )
            // InternalFictiondsl.g:1053:1: ( ( rule__Scenario__StatementAssignment_4 )* )
            {
            // InternalFictiondsl.g:1053:1: ( ( rule__Scenario__StatementAssignment_4 )* )
            // InternalFictiondsl.g:1054:2: ( rule__Scenario__StatementAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementAssignment_4()); 
            // InternalFictiondsl.g:1055:2: ( rule__Scenario__StatementAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32||LA13_0==35||LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFictiondsl.g:1055:3: rule__Scenario__StatementAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Scenario__StatementAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStatementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__4__Impl"


    // $ANTLR start "rule__Scenario__Group__5"
    // InternalFictiondsl.g:1063:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1067:1: ( rule__Scenario__Group__5__Impl )
            // InternalFictiondsl.g:1068:2: rule__Scenario__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__5"


    // $ANTLR start "rule__Scenario__Group__5__Impl"
    // InternalFictiondsl.g:1074:1: rule__Scenario__Group__5__Impl : ( '}' ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1078:1: ( ( '}' ) )
            // InternalFictiondsl.g:1079:1: ( '}' )
            {
            // InternalFictiondsl.g:1079:1: ( '}' )
            // InternalFictiondsl.g:1080:2: '}'
            {
             before(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__5__Impl"


    // $ANTLR start "rule__VarDef__Group__0"
    // InternalFictiondsl.g:1090:1: rule__VarDef__Group__0 : rule__VarDef__Group__0__Impl rule__VarDef__Group__1 ;
    public final void rule__VarDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1094:1: ( rule__VarDef__Group__0__Impl rule__VarDef__Group__1 )
            // InternalFictiondsl.g:1095:2: rule__VarDef__Group__0__Impl rule__VarDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VarDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__Group__0"


    // $ANTLR start "rule__VarDef__Group__0__Impl"
    // InternalFictiondsl.g:1102:1: rule__VarDef__Group__0__Impl : ( 'var' ) ;
    public final void rule__VarDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1106:1: ( ( 'var' ) )
            // InternalFictiondsl.g:1107:1: ( 'var' )
            {
            // InternalFictiondsl.g:1107:1: ( 'var' )
            // InternalFictiondsl.g:1108:2: 'var'
            {
             before(grammarAccess.getVarDefAccess().getVarKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVarDefAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__Group__0__Impl"


    // $ANTLR start "rule__VarDef__Group__1"
    // InternalFictiondsl.g:1117:1: rule__VarDef__Group__1 : rule__VarDef__Group__1__Impl rule__VarDef__Group__2 ;
    public final void rule__VarDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1121:1: ( rule__VarDef__Group__1__Impl rule__VarDef__Group__2 )
            // InternalFictiondsl.g:1122:2: rule__VarDef__Group__1__Impl rule__VarDef__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__VarDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__Group__1"


    // $ANTLR start "rule__VarDef__Group__1__Impl"
    // InternalFictiondsl.g:1129:1: rule__VarDef__Group__1__Impl : ( ( rule__VarDef__NameAssignment_1 ) ) ;
    public final void rule__VarDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1133:1: ( ( ( rule__VarDef__NameAssignment_1 ) ) )
            // InternalFictiondsl.g:1134:1: ( ( rule__VarDef__NameAssignment_1 ) )
            {
            // InternalFictiondsl.g:1134:1: ( ( rule__VarDef__NameAssignment_1 ) )
            // InternalFictiondsl.g:1135:2: ( rule__VarDef__NameAssignment_1 )
            {
             before(grammarAccess.getVarDefAccess().getNameAssignment_1()); 
            // InternalFictiondsl.g:1136:2: ( rule__VarDef__NameAssignment_1 )
            // InternalFictiondsl.g:1136:3: rule__VarDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__Group__1__Impl"


    // $ANTLR start "rule__VarDef__Group__2"
    // InternalFictiondsl.g:1144:1: rule__VarDef__Group__2 : rule__VarDef__Group__2__Impl rule__VarDef__Group__3 ;
    public final void rule__VarDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1148:1: ( rule__VarDef__Group__2__Impl rule__VarDef__Group__3 )
            // InternalFictiondsl.g:1149:2: rule__VarDef__Group__2__Impl rule__VarDef__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__VarDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__Group__2"


    // $ANTLR start "rule__VarDef__Group__2__Impl"
    // InternalFictiondsl.g:1156:1: rule__VarDef__Group__2__Impl : ( ':' ) ;
    public final void rule__VarDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1160:1: ( ( ':' ) )
            // InternalFictiondsl.g:1161:1: ( ':' )
            {
            // InternalFictiondsl.g:1161:1: ( ':' )
            // InternalFictiondsl.g:1162:2: ':'
            {
             before(grammarAccess.getVarDefAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVarDefAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__Group__2__Impl"


    // $ANTLR start "rule__VarDef__Group__3"
    // InternalFictiondsl.g:1171:1: rule__VarDef__Group__3 : rule__VarDef__Group__3__Impl ;
    public final void rule__VarDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1175:1: ( rule__VarDef__Group__3__Impl )
            // InternalFictiondsl.g:1176:2: rule__VarDef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDef__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__Group__3"


    // $ANTLR start "rule__VarDef__Group__3__Impl"
    // InternalFictiondsl.g:1182:1: rule__VarDef__Group__3__Impl : ( ( rule__VarDef__TypeAssignment_3 ) ) ;
    public final void rule__VarDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1186:1: ( ( ( rule__VarDef__TypeAssignment_3 ) ) )
            // InternalFictiondsl.g:1187:1: ( ( rule__VarDef__TypeAssignment_3 ) )
            {
            // InternalFictiondsl.g:1187:1: ( ( rule__VarDef__TypeAssignment_3 ) )
            // InternalFictiondsl.g:1188:2: ( rule__VarDef__TypeAssignment_3 )
            {
             before(grammarAccess.getVarDefAccess().getTypeAssignment_3()); 
            // InternalFictiondsl.g:1189:2: ( rule__VarDef__TypeAssignment_3 )
            // InternalFictiondsl.g:1189:3: rule__VarDef__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VarDef__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVarDefAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalFictiondsl.g:1198:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1202:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalFictiondsl.g:1203:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalFictiondsl.g:1210:1: rule__Question__Group__0__Impl : ( 'question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1214:1: ( ( 'question' ) )
            // InternalFictiondsl.g:1215:1: ( 'question' )
            {
            // InternalFictiondsl.g:1215:1: ( 'question' )
            // InternalFictiondsl.g:1216:2: 'question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalFictiondsl.g:1225:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1229:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalFictiondsl.g:1230:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalFictiondsl.g:1237:1: rule__Question__Group__1__Impl : ( ( rule__Question__NameAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1241:1: ( ( ( rule__Question__NameAssignment_1 ) ) )
            // InternalFictiondsl.g:1242:1: ( ( rule__Question__NameAssignment_1 ) )
            {
            // InternalFictiondsl.g:1242:1: ( ( rule__Question__NameAssignment_1 ) )
            // InternalFictiondsl.g:1243:2: ( rule__Question__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_1()); 
            // InternalFictiondsl.g:1244:2: ( rule__Question__NameAssignment_1 )
            // InternalFictiondsl.g:1244:3: rule__Question__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalFictiondsl.g:1252:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1256:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalFictiondsl.g:1257:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalFictiondsl.g:1264:1: rule__Question__Group__2__Impl : ( ( rule__Question__ExpressionAssignment_2 ) ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1268:1: ( ( ( rule__Question__ExpressionAssignment_2 ) ) )
            // InternalFictiondsl.g:1269:1: ( ( rule__Question__ExpressionAssignment_2 ) )
            {
            // InternalFictiondsl.g:1269:1: ( ( rule__Question__ExpressionAssignment_2 ) )
            // InternalFictiondsl.g:1270:2: ( rule__Question__ExpressionAssignment_2 )
            {
             before(grammarAccess.getQuestionAccess().getExpressionAssignment_2()); 
            // InternalFictiondsl.g:1271:2: ( rule__Question__ExpressionAssignment_2 )
            // InternalFictiondsl.g:1271:3: rule__Question__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Question__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // InternalFictiondsl.g:1279:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1283:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalFictiondsl.g:1284:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // InternalFictiondsl.g:1291:1: rule__Question__Group__3__Impl : ( ( rule__Question__Group_3__0 )? ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1295:1: ( ( ( rule__Question__Group_3__0 )? ) )
            // InternalFictiondsl.g:1296:1: ( ( rule__Question__Group_3__0 )? )
            {
            // InternalFictiondsl.g:1296:1: ( ( rule__Question__Group_3__0 )? )
            // InternalFictiondsl.g:1297:2: ( rule__Question__Group_3__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_3()); 
            // InternalFictiondsl.g:1298:2: ( rule__Question__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFictiondsl.g:1298:3: rule__Question__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // InternalFictiondsl.g:1306:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1310:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // InternalFictiondsl.g:1311:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // InternalFictiondsl.g:1318:1: rule__Question__Group__4__Impl : ( ( rule__Question__Group_4__0 )? ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1322:1: ( ( ( rule__Question__Group_4__0 )? ) )
            // InternalFictiondsl.g:1323:1: ( ( rule__Question__Group_4__0 )? )
            {
            // InternalFictiondsl.g:1323:1: ( ( rule__Question__Group_4__0 )? )
            // InternalFictiondsl.g:1324:2: ( rule__Question__Group_4__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_4()); 
            // InternalFictiondsl.g:1325:2: ( rule__Question__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=11 && LA15_0<=16)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFictiondsl.g:1325:3: rule__Question__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // InternalFictiondsl.g:1333:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1337:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // InternalFictiondsl.g:1338:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // InternalFictiondsl.g:1345:1: rule__Question__Group__5__Impl : ( ( rule__Question__Group_5__0 )? ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1349:1: ( ( ( rule__Question__Group_5__0 )? ) )
            // InternalFictiondsl.g:1350:1: ( ( rule__Question__Group_5__0 )? )
            {
            // InternalFictiondsl.g:1350:1: ( ( rule__Question__Group_5__0 )? )
            // InternalFictiondsl.g:1351:2: ( rule__Question__Group_5__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_5()); 
            // InternalFictiondsl.g:1352:2: ( rule__Question__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFictiondsl.g:1352:3: rule__Question__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group__6"
    // InternalFictiondsl.g:1360:1: rule__Question__Group__6 : rule__Question__Group__6__Impl ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1364:1: ( rule__Question__Group__6__Impl )
            // InternalFictiondsl.g:1365:2: rule__Question__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // InternalFictiondsl.g:1371:1: rule__Question__Group__6__Impl : ( ( ( rule__Question__TargetAssignment_6 ) ) ( ( rule__Question__TargetAssignment_6 )* ) ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1375:1: ( ( ( ( rule__Question__TargetAssignment_6 ) ) ( ( rule__Question__TargetAssignment_6 )* ) ) )
            // InternalFictiondsl.g:1376:1: ( ( ( rule__Question__TargetAssignment_6 ) ) ( ( rule__Question__TargetAssignment_6 )* ) )
            {
            // InternalFictiondsl.g:1376:1: ( ( ( rule__Question__TargetAssignment_6 ) ) ( ( rule__Question__TargetAssignment_6 )* ) )
            // InternalFictiondsl.g:1377:2: ( ( rule__Question__TargetAssignment_6 ) ) ( ( rule__Question__TargetAssignment_6 )* )
            {
            // InternalFictiondsl.g:1377:2: ( ( rule__Question__TargetAssignment_6 ) )
            // InternalFictiondsl.g:1378:3: ( rule__Question__TargetAssignment_6 )
            {
             before(grammarAccess.getQuestionAccess().getTargetAssignment_6()); 
            // InternalFictiondsl.g:1379:3: ( rule__Question__TargetAssignment_6 )
            // InternalFictiondsl.g:1379:4: rule__Question__TargetAssignment_6
            {
            pushFollow(FOLLOW_17);
            rule__Question__TargetAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTargetAssignment_6()); 

            }

            // InternalFictiondsl.g:1382:2: ( ( rule__Question__TargetAssignment_6 )* )
            // InternalFictiondsl.g:1383:3: ( rule__Question__TargetAssignment_6 )*
            {
             before(grammarAccess.getQuestionAccess().getTargetAssignment_6()); 
            // InternalFictiondsl.g:1384:3: ( rule__Question__TargetAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFictiondsl.g:1384:4: rule__Question__TargetAssignment_6
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Question__TargetAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getTargetAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__Question__Group_3__0"
    // InternalFictiondsl.g:1394:1: rule__Question__Group_3__0 : rule__Question__Group_3__0__Impl rule__Question__Group_3__1 ;
    public final void rule__Question__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1398:1: ( rule__Question__Group_3__0__Impl rule__Question__Group_3__1 )
            // InternalFictiondsl.g:1399:2: rule__Question__Group_3__0__Impl rule__Question__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Question__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3__0"


    // $ANTLR start "rule__Question__Group_3__0__Impl"
    // InternalFictiondsl.g:1406:1: rule__Question__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Question__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1410:1: ( ( 'as' ) )
            // InternalFictiondsl.g:1411:1: ( 'as' )
            {
            // InternalFictiondsl.g:1411:1: ( 'as' )
            // InternalFictiondsl.g:1412:2: 'as'
            {
             before(grammarAccess.getQuestionAccess().getAsKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3__0__Impl"


    // $ANTLR start "rule__Question__Group_3__1"
    // InternalFictiondsl.g:1421:1: rule__Question__Group_3__1 : rule__Question__Group_3__1__Impl ;
    public final void rule__Question__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1425:1: ( rule__Question__Group_3__1__Impl )
            // InternalFictiondsl.g:1426:2: rule__Question__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3__1"


    // $ANTLR start "rule__Question__Group_3__1__Impl"
    // InternalFictiondsl.g:1432:1: rule__Question__Group_3__1__Impl : ( ( rule__Question__Alternatives_3_1 ) ) ;
    public final void rule__Question__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1436:1: ( ( ( rule__Question__Alternatives_3_1 ) ) )
            // InternalFictiondsl.g:1437:1: ( ( rule__Question__Alternatives_3_1 ) )
            {
            // InternalFictiondsl.g:1437:1: ( ( rule__Question__Alternatives_3_1 ) )
            // InternalFictiondsl.g:1438:2: ( rule__Question__Alternatives_3_1 )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives_3_1()); 
            // InternalFictiondsl.g:1439:2: ( rule__Question__Alternatives_3_1 )
            // InternalFictiondsl.g:1439:3: rule__Question__Alternatives_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3__1__Impl"


    // $ANTLR start "rule__Question__Group_3_1_1__0"
    // InternalFictiondsl.g:1448:1: rule__Question__Group_3_1_1__0 : rule__Question__Group_3_1_1__0__Impl rule__Question__Group_3_1_1__1 ;
    public final void rule__Question__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1452:1: ( rule__Question__Group_3_1_1__0__Impl rule__Question__Group_3_1_1__1 )
            // InternalFictiondsl.g:1453:2: rule__Question__Group_3_1_1__0__Impl rule__Question__Group_3_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Question__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_3_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3_1_1__0"


    // $ANTLR start "rule__Question__Group_3_1_1__0__Impl"
    // InternalFictiondsl.g:1460:1: rule__Question__Group_3_1_1__0__Impl : ( ( rule__Question__ExrefAssignment_3_1_1_0 ) ) ;
    public final void rule__Question__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1464:1: ( ( ( rule__Question__ExrefAssignment_3_1_1_0 ) ) )
            // InternalFictiondsl.g:1465:1: ( ( rule__Question__ExrefAssignment_3_1_1_0 ) )
            {
            // InternalFictiondsl.g:1465:1: ( ( rule__Question__ExrefAssignment_3_1_1_0 ) )
            // InternalFictiondsl.g:1466:2: ( rule__Question__ExrefAssignment_3_1_1_0 )
            {
             before(grammarAccess.getQuestionAccess().getExrefAssignment_3_1_1_0()); 
            // InternalFictiondsl.g:1467:2: ( rule__Question__ExrefAssignment_3_1_1_0 )
            // InternalFictiondsl.g:1467:3: rule__Question__ExrefAssignment_3_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Question__ExrefAssignment_3_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getExrefAssignment_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__Question__Group_3_1_1__1"
    // InternalFictiondsl.g:1475:1: rule__Question__Group_3_1_1__1 : rule__Question__Group_3_1_1__1__Impl rule__Question__Group_3_1_1__2 ;
    public final void rule__Question__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1479:1: ( rule__Question__Group_3_1_1__1__Impl rule__Question__Group_3_1_1__2 )
            // InternalFictiondsl.g:1480:2: rule__Question__Group_3_1_1__1__Impl rule__Question__Group_3_1_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Question__Group_3_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_3_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3_1_1__1"


    // $ANTLR start "rule__Question__Group_3_1_1__1__Impl"
    // InternalFictiondsl.g:1487:1: rule__Question__Group_3_1_1__1__Impl : ( '(' ) ;
    public final void rule__Question__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1491:1: ( ( '(' ) )
            // InternalFictiondsl.g:1492:1: ( '(' )
            {
            // InternalFictiondsl.g:1492:1: ( '(' )
            // InternalFictiondsl.g:1493:2: '('
            {
             before(grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_3_1_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftParenthesisKeyword_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__Question__Group_3_1_1__2"
    // InternalFictiondsl.g:1502:1: rule__Question__Group_3_1_1__2 : rule__Question__Group_3_1_1__2__Impl rule__Question__Group_3_1_1__3 ;
    public final void rule__Question__Group_3_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1506:1: ( rule__Question__Group_3_1_1__2__Impl rule__Question__Group_3_1_1__3 )
            // InternalFictiondsl.g:1507:2: rule__Question__Group_3_1_1__2__Impl rule__Question__Group_3_1_1__3
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group_3_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_3_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3_1_1__2"


    // $ANTLR start "rule__Question__Group_3_1_1__2__Impl"
    // InternalFictiondsl.g:1514:1: rule__Question__Group_3_1_1__2__Impl : ( ( rule__Question__TypeAssignment_3_1_1_2 ) ) ;
    public final void rule__Question__Group_3_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1518:1: ( ( ( rule__Question__TypeAssignment_3_1_1_2 ) ) )
            // InternalFictiondsl.g:1519:1: ( ( rule__Question__TypeAssignment_3_1_1_2 ) )
            {
            // InternalFictiondsl.g:1519:1: ( ( rule__Question__TypeAssignment_3_1_1_2 ) )
            // InternalFictiondsl.g:1520:2: ( rule__Question__TypeAssignment_3_1_1_2 )
            {
             before(grammarAccess.getQuestionAccess().getTypeAssignment_3_1_1_2()); 
            // InternalFictiondsl.g:1521:2: ( rule__Question__TypeAssignment_3_1_1_2 )
            // InternalFictiondsl.g:1521:3: rule__Question__TypeAssignment_3_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Question__TypeAssignment_3_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTypeAssignment_3_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3_1_1__2__Impl"


    // $ANTLR start "rule__Question__Group_3_1_1__3"
    // InternalFictiondsl.g:1529:1: rule__Question__Group_3_1_1__3 : rule__Question__Group_3_1_1__3__Impl ;
    public final void rule__Question__Group_3_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1533:1: ( rule__Question__Group_3_1_1__3__Impl )
            // InternalFictiondsl.g:1534:2: rule__Question__Group_3_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_3_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3_1_1__3"


    // $ANTLR start "rule__Question__Group_3_1_1__3__Impl"
    // InternalFictiondsl.g:1540:1: rule__Question__Group_3_1_1__3__Impl : ( ')' ) ;
    public final void rule__Question__Group_3_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1544:1: ( ( ')' ) )
            // InternalFictiondsl.g:1545:1: ( ')' )
            {
            // InternalFictiondsl.g:1545:1: ( ')' )
            // InternalFictiondsl.g:1546:2: ')'
            {
             before(grammarAccess.getQuestionAccess().getRightParenthesisKeyword_3_1_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightParenthesisKeyword_3_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_3_1_1__3__Impl"


    // $ANTLR start "rule__Question__Group_4__0"
    // InternalFictiondsl.g:1556:1: rule__Question__Group_4__0 : rule__Question__Group_4__0__Impl rule__Question__Group_4__1 ;
    public final void rule__Question__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1560:1: ( rule__Question__Group_4__0__Impl rule__Question__Group_4__1 )
            // InternalFictiondsl.g:1561:2: rule__Question__Group_4__0__Impl rule__Question__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Question__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__0"


    // $ANTLR start "rule__Question__Group_4__0__Impl"
    // InternalFictiondsl.g:1568:1: rule__Question__Group_4__0__Impl : ( ( rule__Question__OpAssignment_4_0 ) ) ;
    public final void rule__Question__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1572:1: ( ( ( rule__Question__OpAssignment_4_0 ) ) )
            // InternalFictiondsl.g:1573:1: ( ( rule__Question__OpAssignment_4_0 ) )
            {
            // InternalFictiondsl.g:1573:1: ( ( rule__Question__OpAssignment_4_0 ) )
            // InternalFictiondsl.g:1574:2: ( rule__Question__OpAssignment_4_0 )
            {
             before(grammarAccess.getQuestionAccess().getOpAssignment_4_0()); 
            // InternalFictiondsl.g:1575:2: ( rule__Question__OpAssignment_4_0 )
            // InternalFictiondsl.g:1575:3: rule__Question__OpAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Question__OpAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getOpAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__0__Impl"


    // $ANTLR start "rule__Question__Group_4__1"
    // InternalFictiondsl.g:1583:1: rule__Question__Group_4__1 : rule__Question__Group_4__1__Impl ;
    public final void rule__Question__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1587:1: ( rule__Question__Group_4__1__Impl )
            // InternalFictiondsl.g:1588:2: rule__Question__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__1"


    // $ANTLR start "rule__Question__Group_4__1__Impl"
    // InternalFictiondsl.g:1594:1: rule__Question__Group_4__1__Impl : ( ( rule__Question__ConditionAssignment_4_1 ) ) ;
    public final void rule__Question__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1598:1: ( ( ( rule__Question__ConditionAssignment_4_1 ) ) )
            // InternalFictiondsl.g:1599:1: ( ( rule__Question__ConditionAssignment_4_1 ) )
            {
            // InternalFictiondsl.g:1599:1: ( ( rule__Question__ConditionAssignment_4_1 ) )
            // InternalFictiondsl.g:1600:2: ( rule__Question__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getQuestionAccess().getConditionAssignment_4_1()); 
            // InternalFictiondsl.g:1601:2: ( rule__Question__ConditionAssignment_4_1 )
            // InternalFictiondsl.g:1601:3: rule__Question__ConditionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__ConditionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getConditionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__1__Impl"


    // $ANTLR start "rule__Question__Group_5__0"
    // InternalFictiondsl.g:1610:1: rule__Question__Group_5__0 : rule__Question__Group_5__0__Impl rule__Question__Group_5__1 ;
    public final void rule__Question__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1614:1: ( rule__Question__Group_5__0__Impl rule__Question__Group_5__1 )
            // InternalFictiondsl.g:1615:2: rule__Question__Group_5__0__Impl rule__Question__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Question__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_5__0"


    // $ANTLR start "rule__Question__Group_5__0__Impl"
    // InternalFictiondsl.g:1622:1: rule__Question__Group_5__0__Impl : ( 'in' ) ;
    public final void rule__Question__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1626:1: ( ( 'in' ) )
            // InternalFictiondsl.g:1627:1: ( 'in' )
            {
            // InternalFictiondsl.g:1627:1: ( 'in' )
            // InternalFictiondsl.g:1628:2: 'in'
            {
             before(grammarAccess.getQuestionAccess().getInKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getInKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_5__0__Impl"


    // $ANTLR start "rule__Question__Group_5__1"
    // InternalFictiondsl.g:1637:1: rule__Question__Group_5__1 : rule__Question__Group_5__1__Impl ;
    public final void rule__Question__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1641:1: ( rule__Question__Group_5__1__Impl )
            // InternalFictiondsl.g:1642:2: rule__Question__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_5__1"


    // $ANTLR start "rule__Question__Group_5__1__Impl"
    // InternalFictiondsl.g:1648:1: rule__Question__Group_5__1__Impl : ( ( rule__Question__RefAssignment_5_1 ) ) ;
    public final void rule__Question__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1652:1: ( ( ( rule__Question__RefAssignment_5_1 ) ) )
            // InternalFictiondsl.g:1653:1: ( ( rule__Question__RefAssignment_5_1 ) )
            {
            // InternalFictiondsl.g:1653:1: ( ( rule__Question__RefAssignment_5_1 ) )
            // InternalFictiondsl.g:1654:2: ( rule__Question__RefAssignment_5_1 )
            {
             before(grammarAccess.getQuestionAccess().getRefAssignment_5_1()); 
            // InternalFictiondsl.g:1655:2: ( rule__Question__RefAssignment_5_1 )
            // InternalFictiondsl.g:1655:3: rule__Question__RefAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__RefAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getRefAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_5__1__Impl"


    // $ANTLR start "rule__Announce__Group__0"
    // InternalFictiondsl.g:1664:1: rule__Announce__Group__0 : rule__Announce__Group__0__Impl rule__Announce__Group__1 ;
    public final void rule__Announce__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1668:1: ( rule__Announce__Group__0__Impl rule__Announce__Group__1 )
            // InternalFictiondsl.g:1669:2: rule__Announce__Group__0__Impl rule__Announce__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Announce__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Announce__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group__0"


    // $ANTLR start "rule__Announce__Group__0__Impl"
    // InternalFictiondsl.g:1676:1: rule__Announce__Group__0__Impl : ( 'announce' ) ;
    public final void rule__Announce__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1680:1: ( ( 'announce' ) )
            // InternalFictiondsl.g:1681:1: ( 'announce' )
            {
            // InternalFictiondsl.g:1681:1: ( 'announce' )
            // InternalFictiondsl.g:1682:2: 'announce'
            {
             before(grammarAccess.getAnnounceAccess().getAnnounceKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAnnounceAccess().getAnnounceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group__0__Impl"


    // $ANTLR start "rule__Announce__Group__1"
    // InternalFictiondsl.g:1691:1: rule__Announce__Group__1 : rule__Announce__Group__1__Impl rule__Announce__Group__2 ;
    public final void rule__Announce__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1695:1: ( rule__Announce__Group__1__Impl rule__Announce__Group__2 )
            // InternalFictiondsl.g:1696:2: rule__Announce__Group__1__Impl rule__Announce__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Announce__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Announce__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group__1"


    // $ANTLR start "rule__Announce__Group__1__Impl"
    // InternalFictiondsl.g:1703:1: rule__Announce__Group__1__Impl : ( ( rule__Announce__NameAssignment_1 ) ) ;
    public final void rule__Announce__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1707:1: ( ( ( rule__Announce__NameAssignment_1 ) ) )
            // InternalFictiondsl.g:1708:1: ( ( rule__Announce__NameAssignment_1 ) )
            {
            // InternalFictiondsl.g:1708:1: ( ( rule__Announce__NameAssignment_1 ) )
            // InternalFictiondsl.g:1709:2: ( rule__Announce__NameAssignment_1 )
            {
             before(grammarAccess.getAnnounceAccess().getNameAssignment_1()); 
            // InternalFictiondsl.g:1710:2: ( rule__Announce__NameAssignment_1 )
            // InternalFictiondsl.g:1710:3: rule__Announce__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Announce__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnounceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group__1__Impl"


    // $ANTLR start "rule__Announce__Group__2"
    // InternalFictiondsl.g:1718:1: rule__Announce__Group__2 : rule__Announce__Group__2__Impl rule__Announce__Group__3 ;
    public final void rule__Announce__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1722:1: ( rule__Announce__Group__2__Impl rule__Announce__Group__3 )
            // InternalFictiondsl.g:1723:2: rule__Announce__Group__2__Impl rule__Announce__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Announce__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Announce__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group__2"


    // $ANTLR start "rule__Announce__Group__2__Impl"
    // InternalFictiondsl.g:1730:1: rule__Announce__Group__2__Impl : ( ( rule__Announce__ExpressionAssignment_2 ) ) ;
    public final void rule__Announce__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1734:1: ( ( ( rule__Announce__ExpressionAssignment_2 ) ) )
            // InternalFictiondsl.g:1735:1: ( ( rule__Announce__ExpressionAssignment_2 ) )
            {
            // InternalFictiondsl.g:1735:1: ( ( rule__Announce__ExpressionAssignment_2 ) )
            // InternalFictiondsl.g:1736:2: ( rule__Announce__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAnnounceAccess().getExpressionAssignment_2()); 
            // InternalFictiondsl.g:1737:2: ( rule__Announce__ExpressionAssignment_2 )
            // InternalFictiondsl.g:1737:3: rule__Announce__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Announce__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnounceAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group__2__Impl"


    // $ANTLR start "rule__Announce__Group__3"
    // InternalFictiondsl.g:1745:1: rule__Announce__Group__3 : rule__Announce__Group__3__Impl rule__Announce__Group__4 ;
    public final void rule__Announce__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1749:1: ( rule__Announce__Group__3__Impl rule__Announce__Group__4 )
            // InternalFictiondsl.g:1750:2: rule__Announce__Group__3__Impl rule__Announce__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Announce__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Announce__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group__3"


    // $ANTLR start "rule__Announce__Group__3__Impl"
    // InternalFictiondsl.g:1757:1: rule__Announce__Group__3__Impl : ( ( rule__Announce__Group_3__0 )? ) ;
    public final void rule__Announce__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1761:1: ( ( ( rule__Announce__Group_3__0 )? ) )
            // InternalFictiondsl.g:1762:1: ( ( rule__Announce__Group_3__0 )? )
            {
            // InternalFictiondsl.g:1762:1: ( ( rule__Announce__Group_3__0 )? )
            // InternalFictiondsl.g:1763:2: ( rule__Announce__Group_3__0 )?
            {
             before(grammarAccess.getAnnounceAccess().getGroup_3()); 
            // InternalFictiondsl.g:1764:2: ( rule__Announce__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFictiondsl.g:1764:3: rule__Announce__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Announce__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnounceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group__3__Impl"


    // $ANTLR start "rule__Announce__Group__4"
    // InternalFictiondsl.g:1772:1: rule__Announce__Group__4 : rule__Announce__Group__4__Impl ;
    public final void rule__Announce__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1776:1: ( rule__Announce__Group__4__Impl )
            // InternalFictiondsl.g:1777:2: rule__Announce__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Announce__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group__4"


    // $ANTLR start "rule__Announce__Group__4__Impl"
    // InternalFictiondsl.g:1783:1: rule__Announce__Group__4__Impl : ( ( rule__Announce__TargetAssignment_4 ) ) ;
    public final void rule__Announce__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1787:1: ( ( ( rule__Announce__TargetAssignment_4 ) ) )
            // InternalFictiondsl.g:1788:1: ( ( rule__Announce__TargetAssignment_4 ) )
            {
            // InternalFictiondsl.g:1788:1: ( ( rule__Announce__TargetAssignment_4 ) )
            // InternalFictiondsl.g:1789:2: ( rule__Announce__TargetAssignment_4 )
            {
             before(grammarAccess.getAnnounceAccess().getTargetAssignment_4()); 
            // InternalFictiondsl.g:1790:2: ( rule__Announce__TargetAssignment_4 )
            // InternalFictiondsl.g:1790:3: rule__Announce__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Announce__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnnounceAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group__4__Impl"


    // $ANTLR start "rule__Announce__Group_3__0"
    // InternalFictiondsl.g:1799:1: rule__Announce__Group_3__0 : rule__Announce__Group_3__0__Impl rule__Announce__Group_3__1 ;
    public final void rule__Announce__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1803:1: ( rule__Announce__Group_3__0__Impl rule__Announce__Group_3__1 )
            // InternalFictiondsl.g:1804:2: rule__Announce__Group_3__0__Impl rule__Announce__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Announce__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Announce__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group_3__0"


    // $ANTLR start "rule__Announce__Group_3__0__Impl"
    // InternalFictiondsl.g:1811:1: rule__Announce__Group_3__0__Impl : ( '&' ) ;
    public final void rule__Announce__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1815:1: ( ( '&' ) )
            // InternalFictiondsl.g:1816:1: ( '&' )
            {
            // InternalFictiondsl.g:1816:1: ( '&' )
            // InternalFictiondsl.g:1817:2: '&'
            {
             before(grammarAccess.getAnnounceAccess().getAmpersandKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAnnounceAccess().getAmpersandKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group_3__0__Impl"


    // $ANTLR start "rule__Announce__Group_3__1"
    // InternalFictiondsl.g:1826:1: rule__Announce__Group_3__1 : rule__Announce__Group_3__1__Impl rule__Announce__Group_3__2 ;
    public final void rule__Announce__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1830:1: ( rule__Announce__Group_3__1__Impl rule__Announce__Group_3__2 )
            // InternalFictiondsl.g:1831:2: rule__Announce__Group_3__1__Impl rule__Announce__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__Announce__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Announce__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group_3__1"


    // $ANTLR start "rule__Announce__Group_3__1__Impl"
    // InternalFictiondsl.g:1838:1: rule__Announce__Group_3__1__Impl : ( ( rule__Announce__RefAssignment_3_1 ) ) ;
    public final void rule__Announce__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1842:1: ( ( ( rule__Announce__RefAssignment_3_1 ) ) )
            // InternalFictiondsl.g:1843:1: ( ( rule__Announce__RefAssignment_3_1 ) )
            {
            // InternalFictiondsl.g:1843:1: ( ( rule__Announce__RefAssignment_3_1 ) )
            // InternalFictiondsl.g:1844:2: ( rule__Announce__RefAssignment_3_1 )
            {
             before(grammarAccess.getAnnounceAccess().getRefAssignment_3_1()); 
            // InternalFictiondsl.g:1845:2: ( rule__Announce__RefAssignment_3_1 )
            // InternalFictiondsl.g:1845:3: rule__Announce__RefAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Announce__RefAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnounceAccess().getRefAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group_3__1__Impl"


    // $ANTLR start "rule__Announce__Group_3__2"
    // InternalFictiondsl.g:1853:1: rule__Announce__Group_3__2 : rule__Announce__Group_3__2__Impl rule__Announce__Group_3__3 ;
    public final void rule__Announce__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1857:1: ( rule__Announce__Group_3__2__Impl rule__Announce__Group_3__3 )
            // InternalFictiondsl.g:1858:2: rule__Announce__Group_3__2__Impl rule__Announce__Group_3__3
            {
            pushFollow(FOLLOW_15);
            rule__Announce__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Announce__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group_3__2"


    // $ANTLR start "rule__Announce__Group_3__2__Impl"
    // InternalFictiondsl.g:1865:1: rule__Announce__Group_3__2__Impl : ( '&' ) ;
    public final void rule__Announce__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1869:1: ( ( '&' ) )
            // InternalFictiondsl.g:1870:1: ( '&' )
            {
            // InternalFictiondsl.g:1870:1: ( '&' )
            // InternalFictiondsl.g:1871:2: '&'
            {
             before(grammarAccess.getAnnounceAccess().getAmpersandKeyword_3_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAnnounceAccess().getAmpersandKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group_3__2__Impl"


    // $ANTLR start "rule__Announce__Group_3__3"
    // InternalFictiondsl.g:1880:1: rule__Announce__Group_3__3 : rule__Announce__Group_3__3__Impl ;
    public final void rule__Announce__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1884:1: ( rule__Announce__Group_3__3__Impl )
            // InternalFictiondsl.g:1885:2: rule__Announce__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Announce__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group_3__3"


    // $ANTLR start "rule__Announce__Group_3__3__Impl"
    // InternalFictiondsl.g:1891:1: rule__Announce__Group_3__3__Impl : ( ( rule__Announce__ExpAssignment_3_3 ) ) ;
    public final void rule__Announce__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1895:1: ( ( ( rule__Announce__ExpAssignment_3_3 ) ) )
            // InternalFictiondsl.g:1896:1: ( ( rule__Announce__ExpAssignment_3_3 ) )
            {
            // InternalFictiondsl.g:1896:1: ( ( rule__Announce__ExpAssignment_3_3 ) )
            // InternalFictiondsl.g:1897:2: ( rule__Announce__ExpAssignment_3_3 )
            {
             before(grammarAccess.getAnnounceAccess().getExpAssignment_3_3()); 
            // InternalFictiondsl.g:1898:2: ( rule__Announce__ExpAssignment_3_3 )
            // InternalFictiondsl.g:1898:3: rule__Announce__ExpAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Announce__ExpAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getAnnounceAccess().getExpAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__Group_3__3__Impl"


    // $ANTLR start "rule__Target__Group__0"
    // InternalFictiondsl.g:1907:1: rule__Target__Group__0 : rule__Target__Group__0__Impl rule__Target__Group__1 ;
    public final void rule__Target__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1911:1: ( rule__Target__Group__0__Impl rule__Target__Group__1 )
            // InternalFictiondsl.g:1912:2: rule__Target__Group__0__Impl rule__Target__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Target__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__0"


    // $ANTLR start "rule__Target__Group__0__Impl"
    // InternalFictiondsl.g:1919:1: rule__Target__Group__0__Impl : ( 'to' ) ;
    public final void rule__Target__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1923:1: ( ( 'to' ) )
            // InternalFictiondsl.g:1924:1: ( 'to' )
            {
            // InternalFictiondsl.g:1924:1: ( 'to' )
            // InternalFictiondsl.g:1925:2: 'to'
            {
             before(grammarAccess.getTargetAccess().getToKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__0__Impl"


    // $ANTLR start "rule__Target__Group__1"
    // InternalFictiondsl.g:1934:1: rule__Target__Group__1 : rule__Target__Group__1__Impl rule__Target__Group__2 ;
    public final void rule__Target__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1938:1: ( rule__Target__Group__1__Impl rule__Target__Group__2 )
            // InternalFictiondsl.g:1939:2: rule__Target__Group__1__Impl rule__Target__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Target__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__1"


    // $ANTLR start "rule__Target__Group__1__Impl"
    // InternalFictiondsl.g:1946:1: rule__Target__Group__1__Impl : ( ( rule__Target__RefAssignment_1 ) ) ;
    public final void rule__Target__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1950:1: ( ( ( rule__Target__RefAssignment_1 ) ) )
            // InternalFictiondsl.g:1951:1: ( ( rule__Target__RefAssignment_1 ) )
            {
            // InternalFictiondsl.g:1951:1: ( ( rule__Target__RefAssignment_1 ) )
            // InternalFictiondsl.g:1952:2: ( rule__Target__RefAssignment_1 )
            {
             before(grammarAccess.getTargetAccess().getRefAssignment_1()); 
            // InternalFictiondsl.g:1953:2: ( rule__Target__RefAssignment_1 )
            // InternalFictiondsl.g:1953:3: rule__Target__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Target__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__1__Impl"


    // $ANTLR start "rule__Target__Group__2"
    // InternalFictiondsl.g:1961:1: rule__Target__Group__2 : rule__Target__Group__2__Impl ;
    public final void rule__Target__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1965:1: ( rule__Target__Group__2__Impl )
            // InternalFictiondsl.g:1966:2: rule__Target__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__2"


    // $ANTLR start "rule__Target__Group__2__Impl"
    // InternalFictiondsl.g:1972:1: rule__Target__Group__2__Impl : ( ( rule__Target__Group_2__0 )? ) ;
    public final void rule__Target__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1976:1: ( ( ( rule__Target__Group_2__0 )? ) )
            // InternalFictiondsl.g:1977:1: ( ( rule__Target__Group_2__0 )? )
            {
            // InternalFictiondsl.g:1977:1: ( ( rule__Target__Group_2__0 )? )
            // InternalFictiondsl.g:1978:2: ( rule__Target__Group_2__0 )?
            {
             before(grammarAccess.getTargetAccess().getGroup_2()); 
            // InternalFictiondsl.g:1979:2: ( rule__Target__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFictiondsl.g:1979:3: rule__Target__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Target__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__2__Impl"


    // $ANTLR start "rule__Target__Group_2__0"
    // InternalFictiondsl.g:1988:1: rule__Target__Group_2__0 : rule__Target__Group_2__0__Impl rule__Target__Group_2__1 ;
    public final void rule__Target__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:1992:1: ( rule__Target__Group_2__0__Impl rule__Target__Group_2__1 )
            // InternalFictiondsl.g:1993:2: rule__Target__Group_2__0__Impl rule__Target__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Target__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2__0"


    // $ANTLR start "rule__Target__Group_2__0__Impl"
    // InternalFictiondsl.g:2000:1: rule__Target__Group_2__0__Impl : ( 'if' ) ;
    public final void rule__Target__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2004:1: ( ( 'if' ) )
            // InternalFictiondsl.g:2005:1: ( 'if' )
            {
            // InternalFictiondsl.g:2005:1: ( 'if' )
            // InternalFictiondsl.g:2006:2: 'if'
            {
             before(grammarAccess.getTargetAccess().getIfKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getIfKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2__0__Impl"


    // $ANTLR start "rule__Target__Group_2__1"
    // InternalFictiondsl.g:2015:1: rule__Target__Group_2__1 : rule__Target__Group_2__1__Impl ;
    public final void rule__Target__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2019:1: ( rule__Target__Group_2__1__Impl )
            // InternalFictiondsl.g:2020:2: rule__Target__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2__1"


    // $ANTLR start "rule__Target__Group_2__1__Impl"
    // InternalFictiondsl.g:2026:1: rule__Target__Group_2__1__Impl : ( ( rule__Target__Alternatives_2_1 ) ) ;
    public final void rule__Target__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2030:1: ( ( ( rule__Target__Alternatives_2_1 ) ) )
            // InternalFictiondsl.g:2031:1: ( ( rule__Target__Alternatives_2_1 ) )
            {
            // InternalFictiondsl.g:2031:1: ( ( rule__Target__Alternatives_2_1 ) )
            // InternalFictiondsl.g:2032:2: ( rule__Target__Alternatives_2_1 )
            {
             before(grammarAccess.getTargetAccess().getAlternatives_2_1()); 
            // InternalFictiondsl.g:2033:2: ( rule__Target__Alternatives_2_1 )
            // InternalFictiondsl.g:2033:3: rule__Target__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Target__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2__1__Impl"


    // $ANTLR start "rule__Target__Group_2_1_0__0"
    // InternalFictiondsl.g:2042:1: rule__Target__Group_2_1_0__0 : rule__Target__Group_2_1_0__0__Impl rule__Target__Group_2_1_0__1 ;
    public final void rule__Target__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2046:1: ( rule__Target__Group_2_1_0__0__Impl rule__Target__Group_2_1_0__1 )
            // InternalFictiondsl.g:2047:2: rule__Target__Group_2_1_0__0__Impl rule__Target__Group_2_1_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Target__Group_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0__0"


    // $ANTLR start "rule__Target__Group_2_1_0__0__Impl"
    // InternalFictiondsl.g:2054:1: rule__Target__Group_2_1_0__0__Impl : ( ( rule__Target__ExrefAssignment_2_1_0_0 ) ) ;
    public final void rule__Target__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2058:1: ( ( ( rule__Target__ExrefAssignment_2_1_0_0 ) ) )
            // InternalFictiondsl.g:2059:1: ( ( rule__Target__ExrefAssignment_2_1_0_0 ) )
            {
            // InternalFictiondsl.g:2059:1: ( ( rule__Target__ExrefAssignment_2_1_0_0 ) )
            // InternalFictiondsl.g:2060:2: ( rule__Target__ExrefAssignment_2_1_0_0 )
            {
             before(grammarAccess.getTargetAccess().getExrefAssignment_2_1_0_0()); 
            // InternalFictiondsl.g:2061:2: ( rule__Target__ExrefAssignment_2_1_0_0 )
            // InternalFictiondsl.g:2061:3: rule__Target__ExrefAssignment_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Target__ExrefAssignment_2_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getExrefAssignment_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__Target__Group_2_1_0__1"
    // InternalFictiondsl.g:2069:1: rule__Target__Group_2_1_0__1 : rule__Target__Group_2_1_0__1__Impl ;
    public final void rule__Target__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2073:1: ( rule__Target__Group_2_1_0__1__Impl )
            // InternalFictiondsl.g:2074:2: rule__Target__Group_2_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0__1"


    // $ANTLR start "rule__Target__Group_2_1_0__1__Impl"
    // InternalFictiondsl.g:2080:1: rule__Target__Group_2_1_0__1__Impl : ( ( rule__Target__Group_2_1_0_1__0 )? ) ;
    public final void rule__Target__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2084:1: ( ( ( rule__Target__Group_2_1_0_1__0 )? ) )
            // InternalFictiondsl.g:2085:1: ( ( rule__Target__Group_2_1_0_1__0 )? )
            {
            // InternalFictiondsl.g:2085:1: ( ( rule__Target__Group_2_1_0_1__0 )? )
            // InternalFictiondsl.g:2086:2: ( rule__Target__Group_2_1_0_1__0 )?
            {
             before(grammarAccess.getTargetAccess().getGroup_2_1_0_1()); 
            // InternalFictiondsl.g:2087:2: ( rule__Target__Group_2_1_0_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFictiondsl.g:2087:3: rule__Target__Group_2_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Target__Group_2_1_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetAccess().getGroup_2_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__Target__Group_2_1_0_1__0"
    // InternalFictiondsl.g:2096:1: rule__Target__Group_2_1_0_1__0 : rule__Target__Group_2_1_0_1__0__Impl rule__Target__Group_2_1_0_1__1 ;
    public final void rule__Target__Group_2_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2100:1: ( rule__Target__Group_2_1_0_1__0__Impl rule__Target__Group_2_1_0_1__1 )
            // InternalFictiondsl.g:2101:2: rule__Target__Group_2_1_0_1__0__Impl rule__Target__Group_2_1_0_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Target__Group_2_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0_1__0"


    // $ANTLR start "rule__Target__Group_2_1_0_1__0__Impl"
    // InternalFictiondsl.g:2108:1: rule__Target__Group_2_1_0_1__0__Impl : ( '(' ) ;
    public final void rule__Target__Group_2_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2112:1: ( ( '(' ) )
            // InternalFictiondsl.g:2113:1: ( '(' )
            {
            // InternalFictiondsl.g:2113:1: ( '(' )
            // InternalFictiondsl.g:2114:2: '('
            {
             before(grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_1_0_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0_1__0__Impl"


    // $ANTLR start "rule__Target__Group_2_1_0_1__1"
    // InternalFictiondsl.g:2123:1: rule__Target__Group_2_1_0_1__1 : rule__Target__Group_2_1_0_1__1__Impl rule__Target__Group_2_1_0_1__2 ;
    public final void rule__Target__Group_2_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2127:1: ( rule__Target__Group_2_1_0_1__1__Impl rule__Target__Group_2_1_0_1__2 )
            // InternalFictiondsl.g:2128:2: rule__Target__Group_2_1_0_1__1__Impl rule__Target__Group_2_1_0_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Target__Group_2_1_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0_1__1"


    // $ANTLR start "rule__Target__Group_2_1_0_1__1__Impl"
    // InternalFictiondsl.g:2135:1: rule__Target__Group_2_1_0_1__1__Impl : ( ( rule__Target__Alternatives_2_1_0_1_1 ) ) ;
    public final void rule__Target__Group_2_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2139:1: ( ( ( rule__Target__Alternatives_2_1_0_1_1 ) ) )
            // InternalFictiondsl.g:2140:1: ( ( rule__Target__Alternatives_2_1_0_1_1 ) )
            {
            // InternalFictiondsl.g:2140:1: ( ( rule__Target__Alternatives_2_1_0_1_1 ) )
            // InternalFictiondsl.g:2141:2: ( rule__Target__Alternatives_2_1_0_1_1 )
            {
             before(grammarAccess.getTargetAccess().getAlternatives_2_1_0_1_1()); 
            // InternalFictiondsl.g:2142:2: ( rule__Target__Alternatives_2_1_0_1_1 )
            // InternalFictiondsl.g:2142:3: rule__Target__Alternatives_2_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Target__Alternatives_2_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getAlternatives_2_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0_1__1__Impl"


    // $ANTLR start "rule__Target__Group_2_1_0_1__2"
    // InternalFictiondsl.g:2150:1: rule__Target__Group_2_1_0_1__2 : rule__Target__Group_2_1_0_1__2__Impl rule__Target__Group_2_1_0_1__3 ;
    public final void rule__Target__Group_2_1_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2154:1: ( rule__Target__Group_2_1_0_1__2__Impl rule__Target__Group_2_1_0_1__3 )
            // InternalFictiondsl.g:2155:2: rule__Target__Group_2_1_0_1__2__Impl rule__Target__Group_2_1_0_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Target__Group_2_1_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0_1__2"


    // $ANTLR start "rule__Target__Group_2_1_0_1__2__Impl"
    // InternalFictiondsl.g:2162:1: rule__Target__Group_2_1_0_1__2__Impl : ( ')' ) ;
    public final void rule__Target__Group_2_1_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2166:1: ( ( ')' ) )
            // InternalFictiondsl.g:2167:1: ( ')' )
            {
            // InternalFictiondsl.g:2167:1: ( ')' )
            // InternalFictiondsl.g:2168:2: ')'
            {
             before(grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_1_0_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_1_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0_1__2__Impl"


    // $ANTLR start "rule__Target__Group_2_1_0_1__3"
    // InternalFictiondsl.g:2177:1: rule__Target__Group_2_1_0_1__3 : rule__Target__Group_2_1_0_1__3__Impl ;
    public final void rule__Target__Group_2_1_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2181:1: ( rule__Target__Group_2_1_0_1__3__Impl )
            // InternalFictiondsl.g:2182:2: rule__Target__Group_2_1_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0_1__3"


    // $ANTLR start "rule__Target__Group_2_1_0_1__3__Impl"
    // InternalFictiondsl.g:2188:1: rule__Target__Group_2_1_0_1__3__Impl : ( ( rule__Target__ConditionAssignment_2_1_0_1_3 )? ) ;
    public final void rule__Target__Group_2_1_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2192:1: ( ( ( rule__Target__ConditionAssignment_2_1_0_1_3 )? ) )
            // InternalFictiondsl.g:2193:1: ( ( rule__Target__ConditionAssignment_2_1_0_1_3 )? )
            {
            // InternalFictiondsl.g:2193:1: ( ( rule__Target__ConditionAssignment_2_1_0_1_3 )? )
            // InternalFictiondsl.g:2194:2: ( rule__Target__ConditionAssignment_2_1_0_1_3 )?
            {
             before(grammarAccess.getTargetAccess().getConditionAssignment_2_1_0_1_3()); 
            // InternalFictiondsl.g:2195:2: ( rule__Target__ConditionAssignment_2_1_0_1_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||(LA21_0>=11 && LA21_0<=22)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFictiondsl.g:2195:3: rule__Target__ConditionAssignment_2_1_0_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Target__ConditionAssignment_2_1_0_1_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetAccess().getConditionAssignment_2_1_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_0_1__3__Impl"


    // $ANTLR start "rule__Target__Group_2_1_1__0"
    // InternalFictiondsl.g:2204:1: rule__Target__Group_2_1_1__0 : rule__Target__Group_2_1_1__0__Impl rule__Target__Group_2_1_1__1 ;
    public final void rule__Target__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2208:1: ( rule__Target__Group_2_1_1__0__Impl rule__Target__Group_2_1_1__1 )
            // InternalFictiondsl.g:2209:2: rule__Target__Group_2_1_1__0__Impl rule__Target__Group_2_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Target__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_1__0"


    // $ANTLR start "rule__Target__Group_2_1_1__0__Impl"
    // InternalFictiondsl.g:2216:1: rule__Target__Group_2_1_1__0__Impl : ( '(' ) ;
    public final void rule__Target__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2220:1: ( ( '(' ) )
            // InternalFictiondsl.g:2221:1: ( '(' )
            {
            // InternalFictiondsl.g:2221:1: ( '(' )
            // InternalFictiondsl.g:2222:2: '('
            {
             before(grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_1_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Target__Group_2_1_1__1"
    // InternalFictiondsl.g:2231:1: rule__Target__Group_2_1_1__1 : rule__Target__Group_2_1_1__1__Impl rule__Target__Group_2_1_1__2 ;
    public final void rule__Target__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2235:1: ( rule__Target__Group_2_1_1__1__Impl rule__Target__Group_2_1_1__2 )
            // InternalFictiondsl.g:2236:2: rule__Target__Group_2_1_1__1__Impl rule__Target__Group_2_1_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Target__Group_2_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_1__1"


    // $ANTLR start "rule__Target__Group_2_1_1__1__Impl"
    // InternalFictiondsl.g:2243:1: rule__Target__Group_2_1_1__1__Impl : ( ( rule__Target__VardefAssignment_2_1_1_1 ) ) ;
    public final void rule__Target__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2247:1: ( ( ( rule__Target__VardefAssignment_2_1_1_1 ) ) )
            // InternalFictiondsl.g:2248:1: ( ( rule__Target__VardefAssignment_2_1_1_1 ) )
            {
            // InternalFictiondsl.g:2248:1: ( ( rule__Target__VardefAssignment_2_1_1_1 ) )
            // InternalFictiondsl.g:2249:2: ( rule__Target__VardefAssignment_2_1_1_1 )
            {
             before(grammarAccess.getTargetAccess().getVardefAssignment_2_1_1_1()); 
            // InternalFictiondsl.g:2250:2: ( rule__Target__VardefAssignment_2_1_1_1 )
            // InternalFictiondsl.g:2250:3: rule__Target__VardefAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Target__VardefAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getVardefAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Target__Group_2_1_1__2"
    // InternalFictiondsl.g:2258:1: rule__Target__Group_2_1_1__2 : rule__Target__Group_2_1_1__2__Impl rule__Target__Group_2_1_1__3 ;
    public final void rule__Target__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2262:1: ( rule__Target__Group_2_1_1__2__Impl rule__Target__Group_2_1_1__3 )
            // InternalFictiondsl.g:2263:2: rule__Target__Group_2_1_1__2__Impl rule__Target__Group_2_1_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Target__Group_2_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_1__2"


    // $ANTLR start "rule__Target__Group_2_1_1__2__Impl"
    // InternalFictiondsl.g:2270:1: rule__Target__Group_2_1_1__2__Impl : ( ')' ) ;
    public final void rule__Target__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2274:1: ( ( ')' ) )
            // InternalFictiondsl.g:2275:1: ( ')' )
            {
            // InternalFictiondsl.g:2275:1: ( ')' )
            // InternalFictiondsl.g:2276:2: ')'
            {
             before(grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_1_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_1__2__Impl"


    // $ANTLR start "rule__Target__Group_2_1_1__3"
    // InternalFictiondsl.g:2285:1: rule__Target__Group_2_1_1__3 : rule__Target__Group_2_1_1__3__Impl ;
    public final void rule__Target__Group_2_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2289:1: ( rule__Target__Group_2_1_1__3__Impl )
            // InternalFictiondsl.g:2290:2: rule__Target__Group_2_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_1__3"


    // $ANTLR start "rule__Target__Group_2_1_1__3__Impl"
    // InternalFictiondsl.g:2296:1: rule__Target__Group_2_1_1__3__Impl : ( ( rule__Target__ResAssignment_2_1_1_3 )? ) ;
    public final void rule__Target__Group_2_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2300:1: ( ( ( rule__Target__ResAssignment_2_1_1_3 )? ) )
            // InternalFictiondsl.g:2301:1: ( ( rule__Target__ResAssignment_2_1_1_3 )? )
            {
            // InternalFictiondsl.g:2301:1: ( ( rule__Target__ResAssignment_2_1_1_3 )? )
            // InternalFictiondsl.g:2302:2: ( rule__Target__ResAssignment_2_1_1_3 )?
            {
             before(grammarAccess.getTargetAccess().getResAssignment_2_1_1_3()); 
            // InternalFictiondsl.g:2303:2: ( rule__Target__ResAssignment_2_1_1_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_INT)||(LA22_0>=11 && LA22_0<=22)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFictiondsl.g:2303:3: rule__Target__ResAssignment_2_1_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Target__ResAssignment_2_1_1_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetAccess().getResAssignment_2_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_1__3__Impl"


    // $ANTLR start "rule__Target__Group_2_1_3__0"
    // InternalFictiondsl.g:2312:1: rule__Target__Group_2_1_3__0 : rule__Target__Group_2_1_3__0__Impl rule__Target__Group_2_1_3__1 ;
    public final void rule__Target__Group_2_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2316:1: ( rule__Target__Group_2_1_3__0__Impl rule__Target__Group_2_1_3__1 )
            // InternalFictiondsl.g:2317:2: rule__Target__Group_2_1_3__0__Impl rule__Target__Group_2_1_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Target__Group_2_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_3__0"


    // $ANTLR start "rule__Target__Group_2_1_3__0__Impl"
    // InternalFictiondsl.g:2324:1: rule__Target__Group_2_1_3__0__Impl : ( ( rule__Target__VardefAssignment_2_1_3_0 ) ) ;
    public final void rule__Target__Group_2_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2328:1: ( ( ( rule__Target__VardefAssignment_2_1_3_0 ) ) )
            // InternalFictiondsl.g:2329:1: ( ( rule__Target__VardefAssignment_2_1_3_0 ) )
            {
            // InternalFictiondsl.g:2329:1: ( ( rule__Target__VardefAssignment_2_1_3_0 ) )
            // InternalFictiondsl.g:2330:2: ( rule__Target__VardefAssignment_2_1_3_0 )
            {
             before(grammarAccess.getTargetAccess().getVardefAssignment_2_1_3_0()); 
            // InternalFictiondsl.g:2331:2: ( rule__Target__VardefAssignment_2_1_3_0 )
            // InternalFictiondsl.g:2331:3: rule__Target__VardefAssignment_2_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Target__VardefAssignment_2_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getVardefAssignment_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_3__0__Impl"


    // $ANTLR start "rule__Target__Group_2_1_3__1"
    // InternalFictiondsl.g:2339:1: rule__Target__Group_2_1_3__1 : rule__Target__Group_2_1_3__1__Impl ;
    public final void rule__Target__Group_2_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2343:1: ( rule__Target__Group_2_1_3__1__Impl )
            // InternalFictiondsl.g:2344:2: rule__Target__Group_2_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group_2_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_3__1"


    // $ANTLR start "rule__Target__Group_2_1_3__1__Impl"
    // InternalFictiondsl.g:2350:1: rule__Target__Group_2_1_3__1__Impl : ( ( rule__Target__ConditionAssignment_2_1_3_1 ) ) ;
    public final void rule__Target__Group_2_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2354:1: ( ( ( rule__Target__ConditionAssignment_2_1_3_1 ) ) )
            // InternalFictiondsl.g:2355:1: ( ( rule__Target__ConditionAssignment_2_1_3_1 ) )
            {
            // InternalFictiondsl.g:2355:1: ( ( rule__Target__ConditionAssignment_2_1_3_1 ) )
            // InternalFictiondsl.g:2356:2: ( rule__Target__ConditionAssignment_2_1_3_1 )
            {
             before(grammarAccess.getTargetAccess().getConditionAssignment_2_1_3_1()); 
            // InternalFictiondsl.g:2357:2: ( rule__Target__ConditionAssignment_2_1_3_1 )
            // InternalFictiondsl.g:2357:3: rule__Target__ConditionAssignment_2_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Target__ConditionAssignment_2_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getConditionAssignment_2_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_2_1_3__1__Impl"


    // $ANTLR start "rule__End__Group__0"
    // InternalFictiondsl.g:2366:1: rule__End__Group__0 : rule__End__Group__0__Impl rule__End__Group__1 ;
    public final void rule__End__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2370:1: ( rule__End__Group__0__Impl rule__End__Group__1 )
            // InternalFictiondsl.g:2371:2: rule__End__Group__0__Impl rule__End__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__End__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__0"


    // $ANTLR start "rule__End__Group__0__Impl"
    // InternalFictiondsl.g:2378:1: rule__End__Group__0__Impl : ( 'end' ) ;
    public final void rule__End__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2382:1: ( ( 'end' ) )
            // InternalFictiondsl.g:2383:1: ( 'end' )
            {
            // InternalFictiondsl.g:2383:1: ( 'end' )
            // InternalFictiondsl.g:2384:2: 'end'
            {
             before(grammarAccess.getEndAccess().getEndKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getEndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__0__Impl"


    // $ANTLR start "rule__End__Group__1"
    // InternalFictiondsl.g:2393:1: rule__End__Group__1 : rule__End__Group__1__Impl rule__End__Group__2 ;
    public final void rule__End__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2397:1: ( rule__End__Group__1__Impl rule__End__Group__2 )
            // InternalFictiondsl.g:2398:2: rule__End__Group__1__Impl rule__End__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__End__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__1"


    // $ANTLR start "rule__End__Group__1__Impl"
    // InternalFictiondsl.g:2405:1: rule__End__Group__1__Impl : ( ( rule__End__NameAssignment_1 ) ) ;
    public final void rule__End__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2409:1: ( ( ( rule__End__NameAssignment_1 ) ) )
            // InternalFictiondsl.g:2410:1: ( ( rule__End__NameAssignment_1 ) )
            {
            // InternalFictiondsl.g:2410:1: ( ( rule__End__NameAssignment_1 ) )
            // InternalFictiondsl.g:2411:2: ( rule__End__NameAssignment_1 )
            {
             before(grammarAccess.getEndAccess().getNameAssignment_1()); 
            // InternalFictiondsl.g:2412:2: ( rule__End__NameAssignment_1 )
            // InternalFictiondsl.g:2412:3: rule__End__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__End__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__1__Impl"


    // $ANTLR start "rule__End__Group__2"
    // InternalFictiondsl.g:2420:1: rule__End__Group__2 : rule__End__Group__2__Impl rule__End__Group__3 ;
    public final void rule__End__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2424:1: ( rule__End__Group__2__Impl rule__End__Group__3 )
            // InternalFictiondsl.g:2425:2: rule__End__Group__2__Impl rule__End__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__End__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__2"


    // $ANTLR start "rule__End__Group__2__Impl"
    // InternalFictiondsl.g:2432:1: rule__End__Group__2__Impl : ( ( rule__End__ExpressionAssignment_2 ) ) ;
    public final void rule__End__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2436:1: ( ( ( rule__End__ExpressionAssignment_2 ) ) )
            // InternalFictiondsl.g:2437:1: ( ( rule__End__ExpressionAssignment_2 ) )
            {
            // InternalFictiondsl.g:2437:1: ( ( rule__End__ExpressionAssignment_2 ) )
            // InternalFictiondsl.g:2438:2: ( rule__End__ExpressionAssignment_2 )
            {
             before(grammarAccess.getEndAccess().getExpressionAssignment_2()); 
            // InternalFictiondsl.g:2439:2: ( rule__End__ExpressionAssignment_2 )
            // InternalFictiondsl.g:2439:3: rule__End__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__End__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__2__Impl"


    // $ANTLR start "rule__End__Group__3"
    // InternalFictiondsl.g:2447:1: rule__End__Group__3 : rule__End__Group__3__Impl ;
    public final void rule__End__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2451:1: ( rule__End__Group__3__Impl )
            // InternalFictiondsl.g:2452:2: rule__End__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__End__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__3"


    // $ANTLR start "rule__End__Group__3__Impl"
    // InternalFictiondsl.g:2458:1: rule__End__Group__3__Impl : ( ( rule__End__Group_3__0 )? ) ;
    public final void rule__End__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2462:1: ( ( ( rule__End__Group_3__0 )? ) )
            // InternalFictiondsl.g:2463:1: ( ( rule__End__Group_3__0 )? )
            {
            // InternalFictiondsl.g:2463:1: ( ( rule__End__Group_3__0 )? )
            // InternalFictiondsl.g:2464:2: ( rule__End__Group_3__0 )?
            {
             before(grammarAccess.getEndAccess().getGroup_3()); 
            // InternalFictiondsl.g:2465:2: ( rule__End__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFictiondsl.g:2465:3: rule__End__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__End__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__3__Impl"


    // $ANTLR start "rule__End__Group_3__0"
    // InternalFictiondsl.g:2474:1: rule__End__Group_3__0 : rule__End__Group_3__0__Impl rule__End__Group_3__1 ;
    public final void rule__End__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2478:1: ( rule__End__Group_3__0__Impl rule__End__Group_3__1 )
            // InternalFictiondsl.g:2479:2: rule__End__Group_3__0__Impl rule__End__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__End__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group_3__0"


    // $ANTLR start "rule__End__Group_3__0__Impl"
    // InternalFictiondsl.g:2486:1: rule__End__Group_3__0__Impl : ( '&' ) ;
    public final void rule__End__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2490:1: ( ( '&' ) )
            // InternalFictiondsl.g:2491:1: ( '&' )
            {
            // InternalFictiondsl.g:2491:1: ( '&' )
            // InternalFictiondsl.g:2492:2: '&'
            {
             before(grammarAccess.getEndAccess().getAmpersandKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getAmpersandKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group_3__0__Impl"


    // $ANTLR start "rule__End__Group_3__1"
    // InternalFictiondsl.g:2501:1: rule__End__Group_3__1 : rule__End__Group_3__1__Impl rule__End__Group_3__2 ;
    public final void rule__End__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2505:1: ( rule__End__Group_3__1__Impl rule__End__Group_3__2 )
            // InternalFictiondsl.g:2506:2: rule__End__Group_3__1__Impl rule__End__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__End__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group_3__1"


    // $ANTLR start "rule__End__Group_3__1__Impl"
    // InternalFictiondsl.g:2513:1: rule__End__Group_3__1__Impl : ( ( rule__End__RefAssignment_3_1 ) ) ;
    public final void rule__End__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2517:1: ( ( ( rule__End__RefAssignment_3_1 ) ) )
            // InternalFictiondsl.g:2518:1: ( ( rule__End__RefAssignment_3_1 ) )
            {
            // InternalFictiondsl.g:2518:1: ( ( rule__End__RefAssignment_3_1 ) )
            // InternalFictiondsl.g:2519:2: ( rule__End__RefAssignment_3_1 )
            {
             before(grammarAccess.getEndAccess().getRefAssignment_3_1()); 
            // InternalFictiondsl.g:2520:2: ( rule__End__RefAssignment_3_1 )
            // InternalFictiondsl.g:2520:3: rule__End__RefAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__End__RefAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getRefAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group_3__1__Impl"


    // $ANTLR start "rule__End__Group_3__2"
    // InternalFictiondsl.g:2528:1: rule__End__Group_3__2 : rule__End__Group_3__2__Impl rule__End__Group_3__3 ;
    public final void rule__End__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2532:1: ( rule__End__Group_3__2__Impl rule__End__Group_3__3 )
            // InternalFictiondsl.g:2533:2: rule__End__Group_3__2__Impl rule__End__Group_3__3
            {
            pushFollow(FOLLOW_15);
            rule__End__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group_3__2"


    // $ANTLR start "rule__End__Group_3__2__Impl"
    // InternalFictiondsl.g:2540:1: rule__End__Group_3__2__Impl : ( '&' ) ;
    public final void rule__End__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2544:1: ( ( '&' ) )
            // InternalFictiondsl.g:2545:1: ( '&' )
            {
            // InternalFictiondsl.g:2545:1: ( '&' )
            // InternalFictiondsl.g:2546:2: '&'
            {
             before(grammarAccess.getEndAccess().getAmpersandKeyword_3_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getAmpersandKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group_3__2__Impl"


    // $ANTLR start "rule__End__Group_3__3"
    // InternalFictiondsl.g:2555:1: rule__End__Group_3__3 : rule__End__Group_3__3__Impl ;
    public final void rule__End__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2559:1: ( rule__End__Group_3__3__Impl )
            // InternalFictiondsl.g:2560:2: rule__End__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__End__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group_3__3"


    // $ANTLR start "rule__End__Group_3__3__Impl"
    // InternalFictiondsl.g:2566:1: rule__End__Group_3__3__Impl : ( ( rule__End__ExpAssignment_3_3 ) ) ;
    public final void rule__End__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2570:1: ( ( ( rule__End__ExpAssignment_3_3 ) ) )
            // InternalFictiondsl.g:2571:1: ( ( rule__End__ExpAssignment_3_3 ) )
            {
            // InternalFictiondsl.g:2571:1: ( ( rule__End__ExpAssignment_3_3 ) )
            // InternalFictiondsl.g:2572:2: ( rule__End__ExpAssignment_3_3 )
            {
             before(grammarAccess.getEndAccess().getExpAssignment_3_3()); 
            // InternalFictiondsl.g:2573:2: ( rule__End__ExpAssignment_3_3 )
            // InternalFictiondsl.g:2573:3: rule__End__ExpAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__End__ExpAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getExpAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group_3__3__Impl"


    // $ANTLR start "rule__Exp__Group_0__0"
    // InternalFictiondsl.g:2582:1: rule__Exp__Group_0__0 : rule__Exp__Group_0__0__Impl rule__Exp__Group_0__1 ;
    public final void rule__Exp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2586:1: ( rule__Exp__Group_0__0__Impl rule__Exp__Group_0__1 )
            // InternalFictiondsl.g:2587:2: rule__Exp__Group_0__0__Impl rule__Exp__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__Exp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0__0"


    // $ANTLR start "rule__Exp__Group_0__0__Impl"
    // InternalFictiondsl.g:2594:1: rule__Exp__Group_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2598:1: ( ( () ) )
            // InternalFictiondsl.g:2599:1: ( () )
            {
            // InternalFictiondsl.g:2599:1: ( () )
            // InternalFictiondsl.g:2600:2: ()
            {
             before(grammarAccess.getExpAccess().getEndingAction_0_0()); 
            // InternalFictiondsl.g:2601:2: ()
            // InternalFictiondsl.g:2601:3: 
            {
            }

             after(grammarAccess.getExpAccess().getEndingAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0__0__Impl"


    // $ANTLR start "rule__Exp__Group_0__1"
    // InternalFictiondsl.g:2609:1: rule__Exp__Group_0__1 : rule__Exp__Group_0__1__Impl ;
    public final void rule__Exp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2613:1: ( rule__Exp__Group_0__1__Impl )
            // InternalFictiondsl.g:2614:2: rule__Exp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0__1"


    // $ANTLR start "rule__Exp__Group_0__1__Impl"
    // InternalFictiondsl.g:2620:1: rule__Exp__Group_0__1__Impl : ( ( rule__Exp__ValueAssignment_0_1 ) ) ;
    public final void rule__Exp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2624:1: ( ( ( rule__Exp__ValueAssignment_0_1 ) ) )
            // InternalFictiondsl.g:2625:1: ( ( rule__Exp__ValueAssignment_0_1 ) )
            {
            // InternalFictiondsl.g:2625:1: ( ( rule__Exp__ValueAssignment_0_1 ) )
            // InternalFictiondsl.g:2626:2: ( rule__Exp__ValueAssignment_0_1 )
            {
             before(grammarAccess.getExpAccess().getValueAssignment_0_1()); 
            // InternalFictiondsl.g:2627:2: ( rule__Exp__ValueAssignment_0_1 )
            // InternalFictiondsl.g:2627:3: rule__Exp__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_0__1__Impl"


    // $ANTLR start "rule__Exp__Group_3__0"
    // InternalFictiondsl.g:2636:1: rule__Exp__Group_3__0 : rule__Exp__Group_3__0__Impl rule__Exp__Group_3__1 ;
    public final void rule__Exp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2640:1: ( rule__Exp__Group_3__0__Impl rule__Exp__Group_3__1 )
            // InternalFictiondsl.g:2641:2: rule__Exp__Group_3__0__Impl rule__Exp__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Exp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_3__0"


    // $ANTLR start "rule__Exp__Group_3__0__Impl"
    // InternalFictiondsl.g:2648:1: rule__Exp__Group_3__0__Impl : ( 'this' ) ;
    public final void rule__Exp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2652:1: ( ( 'this' ) )
            // InternalFictiondsl.g:2653:1: ( 'this' )
            {
            // InternalFictiondsl.g:2653:1: ( 'this' )
            // InternalFictiondsl.g:2654:2: 'this'
            {
             before(grammarAccess.getExpAccess().getThisKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getThisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_3__0__Impl"


    // $ANTLR start "rule__Exp__Group_3__1"
    // InternalFictiondsl.g:2663:1: rule__Exp__Group_3__1 : rule__Exp__Group_3__1__Impl ;
    public final void rule__Exp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2667:1: ( rule__Exp__Group_3__1__Impl )
            // InternalFictiondsl.g:2668:2: rule__Exp__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_3__1"


    // $ANTLR start "rule__Exp__Group_3__1__Impl"
    // InternalFictiondsl.g:2674:1: rule__Exp__Group_3__1__Impl : ( ruleEvaluate ) ;
    public final void rule__Exp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2678:1: ( ( ruleEvaluate ) )
            // InternalFictiondsl.g:2679:1: ( ruleEvaluate )
            {
            // InternalFictiondsl.g:2679:1: ( ruleEvaluate )
            // InternalFictiondsl.g:2680:2: ruleEvaluate
            {
             before(grammarAccess.getExpAccess().getEvaluateParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleEvaluate();

            state._fsp--;

             after(grammarAccess.getExpAccess().getEvaluateParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_3__1__Impl"


    // $ANTLR start "rule__Evaluate__Group__0"
    // InternalFictiondsl.g:2690:1: rule__Evaluate__Group__0 : rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1 ;
    public final void rule__Evaluate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2694:1: ( rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1 )
            // InternalFictiondsl.g:2695:2: rule__Evaluate__Group__0__Impl rule__Evaluate__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Evaluate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group__0"


    // $ANTLR start "rule__Evaluate__Group__0__Impl"
    // InternalFictiondsl.g:2702:1: rule__Evaluate__Group__0__Impl : ( ( rule__Evaluate__Group_0__0 )? ) ;
    public final void rule__Evaluate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2706:1: ( ( ( rule__Evaluate__Group_0__0 )? ) )
            // InternalFictiondsl.g:2707:1: ( ( rule__Evaluate__Group_0__0 )? )
            {
            // InternalFictiondsl.g:2707:1: ( ( rule__Evaluate__Group_0__0 )? )
            // InternalFictiondsl.g:2708:2: ( rule__Evaluate__Group_0__0 )?
            {
             before(grammarAccess.getEvaluateAccess().getGroup_0()); 
            // InternalFictiondsl.g:2709:2: ( rule__Evaluate__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=18 && LA24_0<=19)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalFictiondsl.g:2709:3: rule__Evaluate__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Evaluate__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluateAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group__0__Impl"


    // $ANTLR start "rule__Evaluate__Group__1"
    // InternalFictiondsl.g:2717:1: rule__Evaluate__Group__1 : rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2 ;
    public final void rule__Evaluate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2721:1: ( rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2 )
            // InternalFictiondsl.g:2722:2: rule__Evaluate__Group__1__Impl rule__Evaluate__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Evaluate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group__1"


    // $ANTLR start "rule__Evaluate__Group__1__Impl"
    // InternalFictiondsl.g:2729:1: rule__Evaluate__Group__1__Impl : ( ( rule__Evaluate__OpAssignment_1 ) ) ;
    public final void rule__Evaluate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2733:1: ( ( ( rule__Evaluate__OpAssignment_1 ) ) )
            // InternalFictiondsl.g:2734:1: ( ( rule__Evaluate__OpAssignment_1 ) )
            {
            // InternalFictiondsl.g:2734:1: ( ( rule__Evaluate__OpAssignment_1 ) )
            // InternalFictiondsl.g:2735:2: ( rule__Evaluate__OpAssignment_1 )
            {
             before(grammarAccess.getEvaluateAccess().getOpAssignment_1()); 
            // InternalFictiondsl.g:2736:2: ( rule__Evaluate__OpAssignment_1 )
            // InternalFictiondsl.g:2736:3: rule__Evaluate__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group__1__Impl"


    // $ANTLR start "rule__Evaluate__Group__2"
    // InternalFictiondsl.g:2744:1: rule__Evaluate__Group__2 : rule__Evaluate__Group__2__Impl ;
    public final void rule__Evaluate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2748:1: ( rule__Evaluate__Group__2__Impl )
            // InternalFictiondsl.g:2749:2: rule__Evaluate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group__2"


    // $ANTLR start "rule__Evaluate__Group__2__Impl"
    // InternalFictiondsl.g:2755:1: rule__Evaluate__Group__2__Impl : ( ( rule__Evaluate__ExpAssignment_2 ) ) ;
    public final void rule__Evaluate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2759:1: ( ( ( rule__Evaluate__ExpAssignment_2 ) ) )
            // InternalFictiondsl.g:2760:1: ( ( rule__Evaluate__ExpAssignment_2 ) )
            {
            // InternalFictiondsl.g:2760:1: ( ( rule__Evaluate__ExpAssignment_2 ) )
            // InternalFictiondsl.g:2761:2: ( rule__Evaluate__ExpAssignment_2 )
            {
             before(grammarAccess.getEvaluateAccess().getExpAssignment_2()); 
            // InternalFictiondsl.g:2762:2: ( rule__Evaluate__ExpAssignment_2 )
            // InternalFictiondsl.g:2762:3: rule__Evaluate__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group__2__Impl"


    // $ANTLR start "rule__Evaluate__Group_0__0"
    // InternalFictiondsl.g:2771:1: rule__Evaluate__Group_0__0 : rule__Evaluate__Group_0__0__Impl rule__Evaluate__Group_0__1 ;
    public final void rule__Evaluate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2775:1: ( rule__Evaluate__Group_0__0__Impl rule__Evaluate__Group_0__1 )
            // InternalFictiondsl.g:2776:2: rule__Evaluate__Group_0__0__Impl rule__Evaluate__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Evaluate__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_0__0"


    // $ANTLR start "rule__Evaluate__Group_0__0__Impl"
    // InternalFictiondsl.g:2783:1: rule__Evaluate__Group_0__0__Impl : ( ( rule__Evaluate__AddAssignment_0_0 ) ) ;
    public final void rule__Evaluate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2787:1: ( ( ( rule__Evaluate__AddAssignment_0_0 ) ) )
            // InternalFictiondsl.g:2788:1: ( ( rule__Evaluate__AddAssignment_0_0 ) )
            {
            // InternalFictiondsl.g:2788:1: ( ( rule__Evaluate__AddAssignment_0_0 ) )
            // InternalFictiondsl.g:2789:2: ( rule__Evaluate__AddAssignment_0_0 )
            {
             before(grammarAccess.getEvaluateAccess().getAddAssignment_0_0()); 
            // InternalFictiondsl.g:2790:2: ( rule__Evaluate__AddAssignment_0_0 )
            // InternalFictiondsl.g:2790:3: rule__Evaluate__AddAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__AddAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getAddAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_0__0__Impl"


    // $ANTLR start "rule__Evaluate__Group_0__1"
    // InternalFictiondsl.g:2798:1: rule__Evaluate__Group_0__1 : rule__Evaluate__Group_0__1__Impl ;
    public final void rule__Evaluate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2802:1: ( rule__Evaluate__Group_0__1__Impl )
            // InternalFictiondsl.g:2803:2: rule__Evaluate__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_0__1"


    // $ANTLR start "rule__Evaluate__Group_0__1__Impl"
    // InternalFictiondsl.g:2809:1: rule__Evaluate__Group_0__1__Impl : ( ( rule__Evaluate__RefAssignment_0_1 ) ) ;
    public final void rule__Evaluate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2813:1: ( ( ( rule__Evaluate__RefAssignment_0_1 ) ) )
            // InternalFictiondsl.g:2814:1: ( ( rule__Evaluate__RefAssignment_0_1 ) )
            {
            // InternalFictiondsl.g:2814:1: ( ( rule__Evaluate__RefAssignment_0_1 ) )
            // InternalFictiondsl.g:2815:2: ( rule__Evaluate__RefAssignment_0_1 )
            {
             before(grammarAccess.getEvaluateAccess().getRefAssignment_0_1()); 
            // InternalFictiondsl.g:2816:2: ( rule__Evaluate__RefAssignment_0_1 )
            // InternalFictiondsl.g:2816:3: rule__Evaluate__RefAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__RefAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getRefAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__Group_0__1__Impl"


    // $ANTLR start "rule__Story__NameAssignment_1"
    // InternalFictiondsl.g:2825:1: rule__Story__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Story__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2829:1: ( ( RULE_ID ) )
            // InternalFictiondsl.g:2830:2: ( RULE_ID )
            {
            // InternalFictiondsl.g:2830:2: ( RULE_ID )
            // InternalFictiondsl.g:2831:3: RULE_ID
            {
             before(grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__NameAssignment_1"


    // $ANTLR start "rule__Story__ExternalAssignment_2"
    // InternalFictiondsl.g:2840:1: rule__Story__ExternalAssignment_2 : ( ruleExternal ) ;
    public final void rule__Story__ExternalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2844:1: ( ( ruleExternal ) )
            // InternalFictiondsl.g:2845:2: ( ruleExternal )
            {
            // InternalFictiondsl.g:2845:2: ( ruleExternal )
            // InternalFictiondsl.g:2846:3: ruleExternal
            {
             before(grammarAccess.getStoryAccess().getExternalExternalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExternal();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getExternalExternalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__ExternalAssignment_2"


    // $ANTLR start "rule__Story__ScenarioAssignment_3"
    // InternalFictiondsl.g:2855:1: rule__Story__ScenarioAssignment_3 : ( ruleScenario ) ;
    public final void rule__Story__ScenarioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2859:1: ( ( ruleScenario ) )
            // InternalFictiondsl.g:2860:2: ( ruleScenario )
            {
            // InternalFictiondsl.g:2860:2: ( ruleScenario )
            // InternalFictiondsl.g:2861:3: ruleScenario
            {
             before(grammarAccess.getStoryAccess().getScenarioScenarioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getScenarioScenarioParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__ScenarioAssignment_3"


    // $ANTLR start "rule__External__NameAssignment_1"
    // InternalFictiondsl.g:2870:1: rule__External__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__External__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2874:1: ( ( RULE_ID ) )
            // InternalFictiondsl.g:2875:2: ( RULE_ID )
            {
            // InternalFictiondsl.g:2875:2: ( RULE_ID )
            // InternalFictiondsl.g:2876:3: RULE_ID
            {
             before(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__NameAssignment_1"


    // $ANTLR start "rule__External__TypeAssignment_3"
    // InternalFictiondsl.g:2885:1: rule__External__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__External__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2889:1: ( ( ruleType ) )
            // InternalFictiondsl.g:2890:2: ( ruleType )
            {
            // InternalFictiondsl.g:2890:2: ( ruleType )
            // InternalFictiondsl.g:2891:3: ruleType
            {
             before(grammarAccess.getExternalAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getExternalAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__TypeAssignment_3"


    // $ANTLR start "rule__External__ResultAssignment_6"
    // InternalFictiondsl.g:2900:1: rule__External__ResultAssignment_6 : ( ruleType ) ;
    public final void rule__External__ResultAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2904:1: ( ( ruleType ) )
            // InternalFictiondsl.g:2905:2: ( ruleType )
            {
            // InternalFictiondsl.g:2905:2: ( ruleType )
            // InternalFictiondsl.g:2906:3: ruleType
            {
             before(grammarAccess.getExternalAccess().getResultTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getExternalAccess().getResultTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__ResultAssignment_6"


    // $ANTLR start "rule__Scenario__NameAssignment_1"
    // InternalFictiondsl.g:2915:1: rule__Scenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2919:1: ( ( RULE_ID ) )
            // InternalFictiondsl.g:2920:2: ( RULE_ID )
            {
            // InternalFictiondsl.g:2920:2: ( RULE_ID )
            // InternalFictiondsl.g:2921:3: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__NameAssignment_1"


    // $ANTLR start "rule__Scenario__VarAssignment_3"
    // InternalFictiondsl.g:2930:1: rule__Scenario__VarAssignment_3 : ( ruleVarDef ) ;
    public final void rule__Scenario__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2934:1: ( ( ruleVarDef ) )
            // InternalFictiondsl.g:2935:2: ( ruleVarDef )
            {
            // InternalFictiondsl.g:2935:2: ( ruleVarDef )
            // InternalFictiondsl.g:2936:3: ruleVarDef
            {
             before(grammarAccess.getScenarioAccess().getVarVarDefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDef();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getVarVarDefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__VarAssignment_3"


    // $ANTLR start "rule__Scenario__StatementAssignment_4"
    // InternalFictiondsl.g:2945:1: rule__Scenario__StatementAssignment_4 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2949:1: ( ( ruleStatement ) )
            // InternalFictiondsl.g:2950:2: ( ruleStatement )
            {
            // InternalFictiondsl.g:2950:2: ( ruleStatement )
            // InternalFictiondsl.g:2951:3: ruleStatement
            {
             before(grammarAccess.getScenarioAccess().getStatementStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStatementStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__StatementAssignment_4"


    // $ANTLR start "rule__VarDef__NameAssignment_1"
    // InternalFictiondsl.g:2960:1: rule__VarDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2964:1: ( ( RULE_ID ) )
            // InternalFictiondsl.g:2965:2: ( RULE_ID )
            {
            // InternalFictiondsl.g:2965:2: ( RULE_ID )
            // InternalFictiondsl.g:2966:3: RULE_ID
            {
             before(grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__NameAssignment_1"


    // $ANTLR start "rule__VarDef__TypeAssignment_3"
    // InternalFictiondsl.g:2975:1: rule__VarDef__TypeAssignment_3 : ( ruleExp ) ;
    public final void rule__VarDef__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2979:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:2980:2: ( ruleExp )
            {
            // InternalFictiondsl.g:2980:2: ( ruleExp )
            // InternalFictiondsl.g:2981:3: ruleExp
            {
             before(grammarAccess.getVarDefAccess().getTypeExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getVarDefAccess().getTypeExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDef__TypeAssignment_3"


    // $ANTLR start "rule__Statement__AnnounceAssignment_0"
    // InternalFictiondsl.g:2990:1: rule__Statement__AnnounceAssignment_0 : ( ruleAnnounce ) ;
    public final void rule__Statement__AnnounceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:2994:1: ( ( ruleAnnounce ) )
            // InternalFictiondsl.g:2995:2: ( ruleAnnounce )
            {
            // InternalFictiondsl.g:2995:2: ( ruleAnnounce )
            // InternalFictiondsl.g:2996:3: ruleAnnounce
            {
             before(grammarAccess.getStatementAccess().getAnnounceAnnounceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnounce();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getAnnounceAnnounceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__AnnounceAssignment_0"


    // $ANTLR start "rule__Statement__EndAssignment_1"
    // InternalFictiondsl.g:3005:1: rule__Statement__EndAssignment_1 : ( ruleEnd ) ;
    public final void rule__Statement__EndAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3009:1: ( ( ruleEnd ) )
            // InternalFictiondsl.g:3010:2: ( ruleEnd )
            {
            // InternalFictiondsl.g:3010:2: ( ruleEnd )
            // InternalFictiondsl.g:3011:3: ruleEnd
            {
             before(grammarAccess.getStatementAccess().getEndEndParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getEndEndParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__EndAssignment_1"


    // $ANTLR start "rule__Statement__QuestionAssignment_2"
    // InternalFictiondsl.g:3020:1: rule__Statement__QuestionAssignment_2 : ( ruleQuestion ) ;
    public final void rule__Statement__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3024:1: ( ( ruleQuestion ) )
            // InternalFictiondsl.g:3025:2: ( ruleQuestion )
            {
            // InternalFictiondsl.g:3025:2: ( ruleQuestion )
            // InternalFictiondsl.g:3026:3: ruleQuestion
            {
             before(grammarAccess.getStatementAccess().getQuestionQuestionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getQuestionQuestionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__QuestionAssignment_2"


    // $ANTLR start "rule__Question__NameAssignment_1"
    // InternalFictiondsl.g:3035:1: rule__Question__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Question__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3039:1: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3040:2: ( RULE_ID )
            {
            // InternalFictiondsl.g:3040:2: ( RULE_ID )
            // InternalFictiondsl.g:3041:3: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__NameAssignment_1"


    // $ANTLR start "rule__Question__ExpressionAssignment_2"
    // InternalFictiondsl.g:3050:1: rule__Question__ExpressionAssignment_2 : ( ruleExp ) ;
    public final void rule__Question__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3054:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:3055:2: ( ruleExp )
            {
            // InternalFictiondsl.g:3055:2: ( ruleExp )
            // InternalFictiondsl.g:3056:3: ruleExp
            {
             before(grammarAccess.getQuestionAccess().getExpressionExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getExpressionExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ExpressionAssignment_2"


    // $ANTLR start "rule__Question__TypeAssignment_3_1_0"
    // InternalFictiondsl.g:3065:1: rule__Question__TypeAssignment_3_1_0 : ( ruleType ) ;
    public final void rule__Question__TypeAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3069:1: ( ( ruleType ) )
            // InternalFictiondsl.g:3070:2: ( ruleType )
            {
            // InternalFictiondsl.g:3070:2: ( ruleType )
            // InternalFictiondsl.g:3071:3: ruleType
            {
             before(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__TypeAssignment_3_1_0"


    // $ANTLR start "rule__Question__ExrefAssignment_3_1_1_0"
    // InternalFictiondsl.g:3080:1: rule__Question__ExrefAssignment_3_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Question__ExrefAssignment_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3084:1: ( ( ( RULE_ID ) ) )
            // InternalFictiondsl.g:3085:2: ( ( RULE_ID ) )
            {
            // InternalFictiondsl.g:3085:2: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3086:3: ( RULE_ID )
            {
             before(grammarAccess.getQuestionAccess().getExrefExternalCrossReference_3_1_1_0_0()); 
            // InternalFictiondsl.g:3087:3: ( RULE_ID )
            // InternalFictiondsl.g:3088:4: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getExrefExternalIDTerminalRuleCall_3_1_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getExrefExternalIDTerminalRuleCall_3_1_1_0_0_1()); 

            }

             after(grammarAccess.getQuestionAccess().getExrefExternalCrossReference_3_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ExrefAssignment_3_1_1_0"


    // $ANTLR start "rule__Question__TypeAssignment_3_1_1_2"
    // InternalFictiondsl.g:3099:1: rule__Question__TypeAssignment_3_1_1_2 : ( ruleType ) ;
    public final void rule__Question__TypeAssignment_3_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3103:1: ( ( ruleType ) )
            // InternalFictiondsl.g:3104:2: ( ruleType )
            {
            // InternalFictiondsl.g:3104:2: ( ruleType )
            // InternalFictiondsl.g:3105:3: ruleType
            {
             before(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_3_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_3_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__TypeAssignment_3_1_1_2"


    // $ANTLR start "rule__Question__OpAssignment_4_0"
    // InternalFictiondsl.g:3114:1: rule__Question__OpAssignment_4_0 : ( ( rule__Question__OpAlternatives_4_0_0 ) ) ;
    public final void rule__Question__OpAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3118:1: ( ( ( rule__Question__OpAlternatives_4_0_0 ) ) )
            // InternalFictiondsl.g:3119:2: ( ( rule__Question__OpAlternatives_4_0_0 ) )
            {
            // InternalFictiondsl.g:3119:2: ( ( rule__Question__OpAlternatives_4_0_0 ) )
            // InternalFictiondsl.g:3120:3: ( rule__Question__OpAlternatives_4_0_0 )
            {
             before(grammarAccess.getQuestionAccess().getOpAlternatives_4_0_0()); 
            // InternalFictiondsl.g:3121:3: ( rule__Question__OpAlternatives_4_0_0 )
            // InternalFictiondsl.g:3121:4: rule__Question__OpAlternatives_4_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Question__OpAlternatives_4_0_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getOpAlternatives_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__OpAssignment_4_0"


    // $ANTLR start "rule__Question__ConditionAssignment_4_1"
    // InternalFictiondsl.g:3129:1: rule__Question__ConditionAssignment_4_1 : ( ruleExp ) ;
    public final void rule__Question__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3133:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:3134:2: ( ruleExp )
            {
            // InternalFictiondsl.g:3134:2: ( ruleExp )
            // InternalFictiondsl.g:3135:3: ruleExp
            {
             before(grammarAccess.getQuestionAccess().getConditionExpParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getConditionExpParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ConditionAssignment_4_1"


    // $ANTLR start "rule__Question__RefAssignment_5_1"
    // InternalFictiondsl.g:3144:1: rule__Question__RefAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Question__RefAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3148:1: ( ( ( RULE_ID ) ) )
            // InternalFictiondsl.g:3149:2: ( ( RULE_ID ) )
            {
            // InternalFictiondsl.g:3149:2: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3150:3: ( RULE_ID )
            {
             before(grammarAccess.getQuestionAccess().getRefVarDefCrossReference_5_1_0()); 
            // InternalFictiondsl.g:3151:3: ( RULE_ID )
            // InternalFictiondsl.g:3152:4: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getRefVarDefIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRefVarDefIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getQuestionAccess().getRefVarDefCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__RefAssignment_5_1"


    // $ANTLR start "rule__Question__TargetAssignment_6"
    // InternalFictiondsl.g:3163:1: rule__Question__TargetAssignment_6 : ( ruleTarget ) ;
    public final void rule__Question__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3167:1: ( ( ruleTarget ) )
            // InternalFictiondsl.g:3168:2: ( ruleTarget )
            {
            // InternalFictiondsl.g:3168:2: ( ruleTarget )
            // InternalFictiondsl.g:3169:3: ruleTarget
            {
             before(grammarAccess.getQuestionAccess().getTargetTargetParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTargetTargetParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__TargetAssignment_6"


    // $ANTLR start "rule__Announce__NameAssignment_1"
    // InternalFictiondsl.g:3178:1: rule__Announce__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Announce__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3182:1: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3183:2: ( RULE_ID )
            {
            // InternalFictiondsl.g:3183:2: ( RULE_ID )
            // InternalFictiondsl.g:3184:3: RULE_ID
            {
             before(grammarAccess.getAnnounceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnnounceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__NameAssignment_1"


    // $ANTLR start "rule__Announce__ExpressionAssignment_2"
    // InternalFictiondsl.g:3193:1: rule__Announce__ExpressionAssignment_2 : ( ruleExp ) ;
    public final void rule__Announce__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3197:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:3198:2: ( ruleExp )
            {
            // InternalFictiondsl.g:3198:2: ( ruleExp )
            // InternalFictiondsl.g:3199:3: ruleExp
            {
             before(grammarAccess.getAnnounceAccess().getExpressionExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getAnnounceAccess().getExpressionExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__ExpressionAssignment_2"


    // $ANTLR start "rule__Announce__RefAssignment_3_1"
    // InternalFictiondsl.g:3208:1: rule__Announce__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Announce__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3212:1: ( ( ( RULE_ID ) ) )
            // InternalFictiondsl.g:3213:2: ( ( RULE_ID ) )
            {
            // InternalFictiondsl.g:3213:2: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3214:3: ( RULE_ID )
            {
             before(grammarAccess.getAnnounceAccess().getRefVarDefCrossReference_3_1_0()); 
            // InternalFictiondsl.g:3215:3: ( RULE_ID )
            // InternalFictiondsl.g:3216:4: RULE_ID
            {
             before(grammarAccess.getAnnounceAccess().getRefVarDefIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnnounceAccess().getRefVarDefIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAnnounceAccess().getRefVarDefCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__RefAssignment_3_1"


    // $ANTLR start "rule__Announce__ExpAssignment_3_3"
    // InternalFictiondsl.g:3227:1: rule__Announce__ExpAssignment_3_3 : ( ruleExp ) ;
    public final void rule__Announce__ExpAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3231:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:3232:2: ( ruleExp )
            {
            // InternalFictiondsl.g:3232:2: ( ruleExp )
            // InternalFictiondsl.g:3233:3: ruleExp
            {
             before(grammarAccess.getAnnounceAccess().getExpExpParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getAnnounceAccess().getExpExpParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__ExpAssignment_3_3"


    // $ANTLR start "rule__Announce__TargetAssignment_4"
    // InternalFictiondsl.g:3242:1: rule__Announce__TargetAssignment_4 : ( ruleTarget ) ;
    public final void rule__Announce__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3246:1: ( ( ruleTarget ) )
            // InternalFictiondsl.g:3247:2: ( ruleTarget )
            {
            // InternalFictiondsl.g:3247:2: ( ruleTarget )
            // InternalFictiondsl.g:3248:3: ruleTarget
            {
             before(grammarAccess.getAnnounceAccess().getTargetTargetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getAnnounceAccess().getTargetTargetParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Announce__TargetAssignment_4"


    // $ANTLR start "rule__Target__RefAssignment_1"
    // InternalFictiondsl.g:3257:1: rule__Target__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Target__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3261:1: ( ( ( RULE_ID ) ) )
            // InternalFictiondsl.g:3262:2: ( ( RULE_ID ) )
            {
            // InternalFictiondsl.g:3262:2: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3263:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetAccess().getRefSomeRefCrossReference_1_0()); 
            // InternalFictiondsl.g:3264:3: ( RULE_ID )
            // InternalFictiondsl.g:3265:4: RULE_ID
            {
             before(grammarAccess.getTargetAccess().getRefSomeRefIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getRefSomeRefIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTargetAccess().getRefSomeRefCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__RefAssignment_1"


    // $ANTLR start "rule__Target__ExrefAssignment_2_1_0_0"
    // InternalFictiondsl.g:3276:1: rule__Target__ExrefAssignment_2_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Target__ExrefAssignment_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3280:1: ( ( ( RULE_ID ) ) )
            // InternalFictiondsl.g:3281:2: ( ( RULE_ID ) )
            {
            // InternalFictiondsl.g:3281:2: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3282:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetAccess().getExrefExternalCrossReference_2_1_0_0_0()); 
            // InternalFictiondsl.g:3283:3: ( RULE_ID )
            // InternalFictiondsl.g:3284:4: RULE_ID
            {
             before(grammarAccess.getTargetAccess().getExrefExternalIDTerminalRuleCall_2_1_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getExrefExternalIDTerminalRuleCall_2_1_0_0_0_1()); 

            }

             after(grammarAccess.getTargetAccess().getExrefExternalCrossReference_2_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__ExrefAssignment_2_1_0_0"


    // $ANTLR start "rule__Target__VardefAssignment_2_1_0_1_1_1"
    // InternalFictiondsl.g:3295:1: rule__Target__VardefAssignment_2_1_0_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Target__VardefAssignment_2_1_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3299:1: ( ( ( RULE_ID ) ) )
            // InternalFictiondsl.g:3300:2: ( ( RULE_ID ) )
            {
            // InternalFictiondsl.g:3300:2: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3301:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_0_1_1_1_0()); 
            // InternalFictiondsl.g:3302:3: ( RULE_ID )
            // InternalFictiondsl.g:3303:4: RULE_ID
            {
             before(grammarAccess.getTargetAccess().getVardefVarDefIDTerminalRuleCall_2_1_0_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getVardefVarDefIDTerminalRuleCall_2_1_0_1_1_1_0_1()); 

            }

             after(grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__VardefAssignment_2_1_0_1_1_1"


    // $ANTLR start "rule__Target__ConditionAssignment_2_1_0_1_3"
    // InternalFictiondsl.g:3314:1: rule__Target__ConditionAssignment_2_1_0_1_3 : ( ruleExp ) ;
    public final void rule__Target__ConditionAssignment_2_1_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3318:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:3319:2: ( ruleExp )
            {
            // InternalFictiondsl.g:3319:2: ( ruleExp )
            // InternalFictiondsl.g:3320:3: ruleExp
            {
             before(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_0_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__ConditionAssignment_2_1_0_1_3"


    // $ANTLR start "rule__Target__VardefAssignment_2_1_1_1"
    // InternalFictiondsl.g:3329:1: rule__Target__VardefAssignment_2_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Target__VardefAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3333:1: ( ( ( RULE_ID ) ) )
            // InternalFictiondsl.g:3334:2: ( ( RULE_ID ) )
            {
            // InternalFictiondsl.g:3334:2: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3335:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_1_1_0()); 
            // InternalFictiondsl.g:3336:3: ( RULE_ID )
            // InternalFictiondsl.g:3337:4: RULE_ID
            {
             before(grammarAccess.getTargetAccess().getVardefVarDefIDTerminalRuleCall_2_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getVardefVarDefIDTerminalRuleCall_2_1_1_1_0_1()); 

            }

             after(grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__VardefAssignment_2_1_1_1"


    // $ANTLR start "rule__Target__ResAssignment_2_1_1_3"
    // InternalFictiondsl.g:3348:1: rule__Target__ResAssignment_2_1_1_3 : ( ruleExp ) ;
    public final void rule__Target__ResAssignment_2_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3352:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:3353:2: ( ruleExp )
            {
            // InternalFictiondsl.g:3353:2: ( ruleExp )
            // InternalFictiondsl.g:3354:3: ruleExp
            {
             before(grammarAccess.getTargetAccess().getResExpParserRuleCall_2_1_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getTargetAccess().getResExpParserRuleCall_2_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__ResAssignment_2_1_1_3"


    // $ANTLR start "rule__Target__ConditionAssignment_2_1_2"
    // InternalFictiondsl.g:3363:1: rule__Target__ConditionAssignment_2_1_2 : ( ruleExp ) ;
    public final void rule__Target__ConditionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3367:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:3368:2: ( ruleExp )
            {
            // InternalFictiondsl.g:3368:2: ( ruleExp )
            // InternalFictiondsl.g:3369:3: ruleExp
            {
             before(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__ConditionAssignment_2_1_2"


    // $ANTLR start "rule__Target__VardefAssignment_2_1_3_0"
    // InternalFictiondsl.g:3378:1: rule__Target__VardefAssignment_2_1_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Target__VardefAssignment_2_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3382:1: ( ( ( RULE_ID ) ) )
            // InternalFictiondsl.g:3383:2: ( ( RULE_ID ) )
            {
            // InternalFictiondsl.g:3383:2: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3384:3: ( RULE_ID )
            {
             before(grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_3_0_0()); 
            // InternalFictiondsl.g:3385:3: ( RULE_ID )
            // InternalFictiondsl.g:3386:4: RULE_ID
            {
             before(grammarAccess.getTargetAccess().getVardefVarDefIDTerminalRuleCall_2_1_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getVardefVarDefIDTerminalRuleCall_2_1_3_0_0_1()); 

            }

             after(grammarAccess.getTargetAccess().getVardefVarDefCrossReference_2_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__VardefAssignment_2_1_3_0"


    // $ANTLR start "rule__Target__ConditionAssignment_2_1_3_1"
    // InternalFictiondsl.g:3397:1: rule__Target__ConditionAssignment_2_1_3_1 : ( ruleExp ) ;
    public final void rule__Target__ConditionAssignment_2_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3401:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:3402:2: ( ruleExp )
            {
            // InternalFictiondsl.g:3402:2: ( ruleExp )
            // InternalFictiondsl.g:3403:3: ruleExp
            {
             before(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_2_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__ConditionAssignment_2_1_3_1"


    // $ANTLR start "rule__End__NameAssignment_1"
    // InternalFictiondsl.g:3412:1: rule__End__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__End__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3416:1: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3417:2: ( RULE_ID )
            {
            // InternalFictiondsl.g:3417:2: ( RULE_ID )
            // InternalFictiondsl.g:3418:3: RULE_ID
            {
             before(grammarAccess.getEndAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__NameAssignment_1"


    // $ANTLR start "rule__End__ExpressionAssignment_2"
    // InternalFictiondsl.g:3427:1: rule__End__ExpressionAssignment_2 : ( ruleExp ) ;
    public final void rule__End__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3431:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:3432:2: ( ruleExp )
            {
            // InternalFictiondsl.g:3432:2: ( ruleExp )
            // InternalFictiondsl.g:3433:3: ruleExp
            {
             before(grammarAccess.getEndAccess().getExpressionExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getEndAccess().getExpressionExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__ExpressionAssignment_2"


    // $ANTLR start "rule__End__RefAssignment_3_1"
    // InternalFictiondsl.g:3442:1: rule__End__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__End__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3446:1: ( ( ( RULE_ID ) ) )
            // InternalFictiondsl.g:3447:2: ( ( RULE_ID ) )
            {
            // InternalFictiondsl.g:3447:2: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3448:3: ( RULE_ID )
            {
             before(grammarAccess.getEndAccess().getRefVarDefCrossReference_3_1_0()); 
            // InternalFictiondsl.g:3449:3: ( RULE_ID )
            // InternalFictiondsl.g:3450:4: RULE_ID
            {
             before(grammarAccess.getEndAccess().getRefVarDefIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getRefVarDefIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEndAccess().getRefVarDefCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__RefAssignment_3_1"


    // $ANTLR start "rule__End__ExpAssignment_3_3"
    // InternalFictiondsl.g:3461:1: rule__End__ExpAssignment_3_3 : ( ruleExp ) ;
    public final void rule__End__ExpAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3465:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:3466:2: ( ruleExp )
            {
            // InternalFictiondsl.g:3466:2: ( ruleExp )
            // InternalFictiondsl.g:3467:3: ruleExp
            {
             before(grammarAccess.getEndAccess().getExpExpParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getEndAccess().getExpExpParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__ExpAssignment_3_3"


    // $ANTLR start "rule__Exp__ValueAssignment_0_1"
    // InternalFictiondsl.g:3476:1: rule__Exp__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Exp__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3480:1: ( ( RULE_STRING ) )
            // InternalFictiondsl.g:3481:2: ( RULE_STRING )
            {
            // InternalFictiondsl.g:3481:2: ( RULE_STRING )
            // InternalFictiondsl.g:3482:3: RULE_STRING
            {
             before(grammarAccess.getExpAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__ValueAssignment_0_1"


    // $ANTLR start "rule__Exp__NumberAssignment_1"
    // InternalFictiondsl.g:3491:1: rule__Exp__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__Exp__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3495:1: ( ( RULE_INT ) )
            // InternalFictiondsl.g:3496:2: ( RULE_INT )
            {
            // InternalFictiondsl.g:3496:2: ( RULE_INT )
            // InternalFictiondsl.g:3497:3: RULE_INT
            {
             before(grammarAccess.getExpAccess().getNumberINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getNumberINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__NumberAssignment_1"


    // $ANTLR start "rule__Exp__TypeAssignment_2"
    // InternalFictiondsl.g:3506:1: rule__Exp__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Exp__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3510:1: ( ( ruleType ) )
            // InternalFictiondsl.g:3511:2: ( ruleType )
            {
            // InternalFictiondsl.g:3511:2: ( ruleType )
            // InternalFictiondsl.g:3512:3: ruleType
            {
             before(grammarAccess.getExpAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getExpAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__TypeAssignment_2"


    // $ANTLR start "rule__Evaluate__AddAssignment_0_0"
    // InternalFictiondsl.g:3521:1: rule__Evaluate__AddAssignment_0_0 : ( ( rule__Evaluate__AddAlternatives_0_0_0 ) ) ;
    public final void rule__Evaluate__AddAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3525:1: ( ( ( rule__Evaluate__AddAlternatives_0_0_0 ) ) )
            // InternalFictiondsl.g:3526:2: ( ( rule__Evaluate__AddAlternatives_0_0_0 ) )
            {
            // InternalFictiondsl.g:3526:2: ( ( rule__Evaluate__AddAlternatives_0_0_0 ) )
            // InternalFictiondsl.g:3527:3: ( rule__Evaluate__AddAlternatives_0_0_0 )
            {
             before(grammarAccess.getEvaluateAccess().getAddAlternatives_0_0_0()); 
            // InternalFictiondsl.g:3528:3: ( rule__Evaluate__AddAlternatives_0_0_0 )
            // InternalFictiondsl.g:3528:4: rule__Evaluate__AddAlternatives_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__AddAlternatives_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getAddAlternatives_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__AddAssignment_0_0"


    // $ANTLR start "rule__Evaluate__RefAssignment_0_1"
    // InternalFictiondsl.g:3536:1: rule__Evaluate__RefAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Evaluate__RefAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3540:1: ( ( ( RULE_ID ) ) )
            // InternalFictiondsl.g:3541:2: ( ( RULE_ID ) )
            {
            // InternalFictiondsl.g:3541:2: ( ( RULE_ID ) )
            // InternalFictiondsl.g:3542:3: ( RULE_ID )
            {
             before(grammarAccess.getEvaluateAccess().getRefVarDefCrossReference_0_1_0()); 
            // InternalFictiondsl.g:3543:3: ( RULE_ID )
            // InternalFictiondsl.g:3544:4: RULE_ID
            {
             before(grammarAccess.getEvaluateAccess().getRefVarDefIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvaluateAccess().getRefVarDefIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getEvaluateAccess().getRefVarDefCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__RefAssignment_0_1"


    // $ANTLR start "rule__Evaluate__OpAssignment_1"
    // InternalFictiondsl.g:3555:1: rule__Evaluate__OpAssignment_1 : ( ( rule__Evaluate__OpAlternatives_1_0 ) ) ;
    public final void rule__Evaluate__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3559:1: ( ( ( rule__Evaluate__OpAlternatives_1_0 ) ) )
            // InternalFictiondsl.g:3560:2: ( ( rule__Evaluate__OpAlternatives_1_0 ) )
            {
            // InternalFictiondsl.g:3560:2: ( ( rule__Evaluate__OpAlternatives_1_0 ) )
            // InternalFictiondsl.g:3561:3: ( rule__Evaluate__OpAlternatives_1_0 )
            {
             before(grammarAccess.getEvaluateAccess().getOpAlternatives_1_0()); 
            // InternalFictiondsl.g:3562:3: ( rule__Evaluate__OpAlternatives_1_0 )
            // InternalFictiondsl.g:3562:4: rule__Evaluate__OpAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Evaluate__OpAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluateAccess().getOpAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__OpAssignment_1"


    // $ANTLR start "rule__Evaluate__ExpAssignment_2"
    // InternalFictiondsl.g:3570:1: rule__Evaluate__ExpAssignment_2 : ( ruleExp ) ;
    public final void rule__Evaluate__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFictiondsl.g:3574:1: ( ( ruleExp ) )
            // InternalFictiondsl.g:3575:2: ( ruleExp )
            {
            // InternalFictiondsl.g:3575:2: ( ruleExp )
            // InternalFictiondsl.g:3576:3: ruleExp
            {
             before(grammarAccess.getEvaluateAccess().getExpExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getEvaluateAccess().getExpExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluate__ExpAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000089C0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008900000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000007FF860L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000260001F800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000260001F802L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000360001F800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000027FF870L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});

}