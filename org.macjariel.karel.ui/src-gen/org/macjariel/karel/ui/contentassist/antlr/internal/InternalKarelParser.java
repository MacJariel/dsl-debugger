package org.macjariel.karel.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.macjariel.karel.services.KarelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKarelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NORTH'", "'SOUTH'", "'WEST'", "'EAST'", "'move'", "'turn'", "'turnOn'", "'turnOff'", "'put'", "'get'", "'WALL_AHEAD'", "'MARKED_PLACE'", "'BEGIN-PROGRAM'", "'END-PROGRAM'", "'BEGIN-INIT'", "'END-INIT'", "'position'", "','", "';'", "'heading'", "'boardSize'", "'DEFINE COMMAND'", "'AS'", "'BEGIN'", "'END'", "'BEGIN-MAIN'", "'END-MAIN'", "'IF'", "'('", "')'", "'{'", "'}'", "'ELSE'", "'ITERATE'", "'TIMES'", "'WHILE'", "'@('", "'!'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalKarelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKarelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKarelParser.tokenNames; }
    public String getGrammarFileName() { return "../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g"; }


     
     	private KarelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KarelGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProgram"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:61:1: ( ruleProgram EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:69:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:73:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:74:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:74:1: ( ( rule__Program__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:75:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:76:1: ( rule__Program__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:76:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram94);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleInitSection"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:88:1: entryRuleInitSection : ruleInitSection EOF ;
    public final void entryRuleInitSection() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:89:1: ( ruleInitSection EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:90:1: ruleInitSection EOF
            {
             before(grammarAccess.getInitSectionRule()); 
            pushFollow(FOLLOW_ruleInitSection_in_entryRuleInitSection121);
            ruleInitSection();

            state._fsp--;

             after(grammarAccess.getInitSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitSection128); 

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
    // $ANTLR end "entryRuleInitSection"


    // $ANTLR start "ruleInitSection"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:97:1: ruleInitSection : ( ( rule__InitSection__Group__0 ) ) ;
    public final void ruleInitSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:101:2: ( ( ( rule__InitSection__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:102:1: ( ( rule__InitSection__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:102:1: ( ( rule__InitSection__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:103:1: ( rule__InitSection__Group__0 )
            {
             before(grammarAccess.getInitSectionAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:104:1: ( rule__InitSection__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:104:2: rule__InitSection__Group__0
            {
            pushFollow(FOLLOW_rule__InitSection__Group__0_in_ruleInitSection154);
            rule__InitSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitSectionAccess().getGroup()); 

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
    // $ANTLR end "ruleInitSection"


    // $ANTLR start "entryRuleInitCommand"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:116:1: entryRuleInitCommand : ruleInitCommand EOF ;
    public final void entryRuleInitCommand() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:117:1: ( ruleInitCommand EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:118:1: ruleInitCommand EOF
            {
             before(grammarAccess.getInitCommandRule()); 
            pushFollow(FOLLOW_ruleInitCommand_in_entryRuleInitCommand181);
            ruleInitCommand();

            state._fsp--;

             after(grammarAccess.getInitCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitCommand188); 

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
    // $ANTLR end "entryRuleInitCommand"


    // $ANTLR start "ruleInitCommand"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:125:1: ruleInitCommand : ( ( rule__InitCommand__Alternatives ) ) ;
    public final void ruleInitCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:129:2: ( ( ( rule__InitCommand__Alternatives ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:130:1: ( ( rule__InitCommand__Alternatives ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:130:1: ( ( rule__InitCommand__Alternatives ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:131:1: ( rule__InitCommand__Alternatives )
            {
             before(grammarAccess.getInitCommandAccess().getAlternatives()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:132:1: ( rule__InitCommand__Alternatives )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:132:2: rule__InitCommand__Alternatives
            {
            pushFollow(FOLLOW_rule__InitCommand__Alternatives_in_ruleInitCommand214);
            rule__InitCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInitCommandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInitCommand"


    // $ANTLR start "entryRuleInitPositionCommand"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:144:1: entryRuleInitPositionCommand : ruleInitPositionCommand EOF ;
    public final void entryRuleInitPositionCommand() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:145:1: ( ruleInitPositionCommand EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:146:1: ruleInitPositionCommand EOF
            {
             before(grammarAccess.getInitPositionCommandRule()); 
            pushFollow(FOLLOW_ruleInitPositionCommand_in_entryRuleInitPositionCommand241);
            ruleInitPositionCommand();

            state._fsp--;

             after(grammarAccess.getInitPositionCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitPositionCommand248); 

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
    // $ANTLR end "entryRuleInitPositionCommand"


    // $ANTLR start "ruleInitPositionCommand"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:153:1: ruleInitPositionCommand : ( ( rule__InitPositionCommand__Group__0 ) ) ;
    public final void ruleInitPositionCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:157:2: ( ( ( rule__InitPositionCommand__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:158:1: ( ( rule__InitPositionCommand__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:158:1: ( ( rule__InitPositionCommand__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:159:1: ( rule__InitPositionCommand__Group__0 )
            {
             before(grammarAccess.getInitPositionCommandAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:160:1: ( rule__InitPositionCommand__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:160:2: rule__InitPositionCommand__Group__0
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__0_in_ruleInitPositionCommand274);
            rule__InitPositionCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitPositionCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleInitPositionCommand"


    // $ANTLR start "entryRuleInitHeadingCommand"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:172:1: entryRuleInitHeadingCommand : ruleInitHeadingCommand EOF ;
    public final void entryRuleInitHeadingCommand() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:173:1: ( ruleInitHeadingCommand EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:174:1: ruleInitHeadingCommand EOF
            {
             before(grammarAccess.getInitHeadingCommandRule()); 
            pushFollow(FOLLOW_ruleInitHeadingCommand_in_entryRuleInitHeadingCommand301);
            ruleInitHeadingCommand();

            state._fsp--;

             after(grammarAccess.getInitHeadingCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitHeadingCommand308); 

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
    // $ANTLR end "entryRuleInitHeadingCommand"


    // $ANTLR start "ruleInitHeadingCommand"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:181:1: ruleInitHeadingCommand : ( ( rule__InitHeadingCommand__Group__0 ) ) ;
    public final void ruleInitHeadingCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:185:2: ( ( ( rule__InitHeadingCommand__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:186:1: ( ( rule__InitHeadingCommand__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:186:1: ( ( rule__InitHeadingCommand__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:187:1: ( rule__InitHeadingCommand__Group__0 )
            {
             before(grammarAccess.getInitHeadingCommandAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:188:1: ( rule__InitHeadingCommand__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:188:2: rule__InitHeadingCommand__Group__0
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__0_in_ruleInitHeadingCommand334);
            rule__InitHeadingCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitHeadingCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleInitHeadingCommand"


    // $ANTLR start "entryRuleInitBoardSizeCommand"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:200:1: entryRuleInitBoardSizeCommand : ruleInitBoardSizeCommand EOF ;
    public final void entryRuleInitBoardSizeCommand() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:201:1: ( ruleInitBoardSizeCommand EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:202:1: ruleInitBoardSizeCommand EOF
            {
             before(grammarAccess.getInitBoardSizeCommandRule()); 
            pushFollow(FOLLOW_ruleInitBoardSizeCommand_in_entryRuleInitBoardSizeCommand361);
            ruleInitBoardSizeCommand();

            state._fsp--;

             after(grammarAccess.getInitBoardSizeCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitBoardSizeCommand368); 

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
    // $ANTLR end "entryRuleInitBoardSizeCommand"


    // $ANTLR start "ruleInitBoardSizeCommand"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:209:1: ruleInitBoardSizeCommand : ( ( rule__InitBoardSizeCommand__Group__0 ) ) ;
    public final void ruleInitBoardSizeCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:213:2: ( ( ( rule__InitBoardSizeCommand__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:214:1: ( ( rule__InitBoardSizeCommand__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:214:1: ( ( rule__InitBoardSizeCommand__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:215:1: ( rule__InitBoardSizeCommand__Group__0 )
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:216:1: ( rule__InitBoardSizeCommand__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:216:2: rule__InitBoardSizeCommand__Group__0
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__0_in_ruleInitBoardSizeCommand394);
            rule__InitBoardSizeCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitBoardSizeCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleInitBoardSizeCommand"


    // $ANTLR start "entryRuleHeadingKind"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:228:1: entryRuleHeadingKind : ruleHeadingKind EOF ;
    public final void entryRuleHeadingKind() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:229:1: ( ruleHeadingKind EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:230:1: ruleHeadingKind EOF
            {
             before(grammarAccess.getHeadingKindRule()); 
            pushFollow(FOLLOW_ruleHeadingKind_in_entryRuleHeadingKind421);
            ruleHeadingKind();

            state._fsp--;

             after(grammarAccess.getHeadingKindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeadingKind428); 

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
    // $ANTLR end "entryRuleHeadingKind"


    // $ANTLR start "ruleHeadingKind"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:237:1: ruleHeadingKind : ( ( rule__HeadingKind__Alternatives ) ) ;
    public final void ruleHeadingKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:241:2: ( ( ( rule__HeadingKind__Alternatives ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:242:1: ( ( rule__HeadingKind__Alternatives ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:242:1: ( ( rule__HeadingKind__Alternatives ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:243:1: ( rule__HeadingKind__Alternatives )
            {
             before(grammarAccess.getHeadingKindAccess().getAlternatives()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:244:1: ( rule__HeadingKind__Alternatives )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:244:2: rule__HeadingKind__Alternatives
            {
            pushFollow(FOLLOW_rule__HeadingKind__Alternatives_in_ruleHeadingKind454);
            rule__HeadingKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHeadingKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHeadingKind"


    // $ANTLR start "entryRuleUserDefinedCommand"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:256:1: entryRuleUserDefinedCommand : ruleUserDefinedCommand EOF ;
    public final void entryRuleUserDefinedCommand() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:257:1: ( ruleUserDefinedCommand EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:258:1: ruleUserDefinedCommand EOF
            {
             before(grammarAccess.getUserDefinedCommandRule()); 
            pushFollow(FOLLOW_ruleUserDefinedCommand_in_entryRuleUserDefinedCommand481);
            ruleUserDefinedCommand();

            state._fsp--;

             after(grammarAccess.getUserDefinedCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedCommand488); 

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
    // $ANTLR end "entryRuleUserDefinedCommand"


    // $ANTLR start "ruleUserDefinedCommand"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:265:1: ruleUserDefinedCommand : ( ( rule__UserDefinedCommand__Group__0 ) ) ;
    public final void ruleUserDefinedCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:269:2: ( ( ( rule__UserDefinedCommand__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:270:1: ( ( rule__UserDefinedCommand__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:270:1: ( ( rule__UserDefinedCommand__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:271:1: ( rule__UserDefinedCommand__Group__0 )
            {
             before(grammarAccess.getUserDefinedCommandAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:272:1: ( rule__UserDefinedCommand__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:272:2: rule__UserDefinedCommand__Group__0
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__0_in_ruleUserDefinedCommand514);
            rule__UserDefinedCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserDefinedCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleUserDefinedCommand"


    // $ANTLR start "entryRuleMain"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:284:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:285:1: ( ruleMain EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:286:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain541);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain548); 

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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:293:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:297:2: ( ( ( rule__Main__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:298:1: ( ( rule__Main__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:298:1: ( ( rule__Main__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:299:1: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:300:1: ( rule__Main__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:300:2: rule__Main__Group__0
            {
            pushFollow(FOLLOW_rule__Main__Group__0_in_ruleMain574);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:312:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:313:1: ( ruleStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:314:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement601);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement608); 

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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:321:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:325:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:326:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:326:1: ( ( rule__Statement__Alternatives ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:327:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:328:1: ( rule__Statement__Alternatives )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:328:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement634);
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


    // $ANTLR start "entryRuleBreakableStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:340:1: entryRuleBreakableStatement : ruleBreakableStatement EOF ;
    public final void entryRuleBreakableStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:341:1: ( ruleBreakableStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:342:1: ruleBreakableStatement EOF
            {
             before(grammarAccess.getBreakableStatementRule()); 
            pushFollow(FOLLOW_ruleBreakableStatement_in_entryRuleBreakableStatement661);
            ruleBreakableStatement();

            state._fsp--;

             after(grammarAccess.getBreakableStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakableStatement668); 

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
    // $ANTLR end "entryRuleBreakableStatement"


    // $ANTLR start "ruleBreakableStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:349:1: ruleBreakableStatement : ( ( rule__BreakableStatement__Alternatives ) ) ;
    public final void ruleBreakableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:353:2: ( ( ( rule__BreakableStatement__Alternatives ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:354:1: ( ( rule__BreakableStatement__Alternatives ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:354:1: ( ( rule__BreakableStatement__Alternatives ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:355:1: ( rule__BreakableStatement__Alternatives )
            {
             before(grammarAccess.getBreakableStatementAccess().getAlternatives()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:356:1: ( rule__BreakableStatement__Alternatives )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:356:2: rule__BreakableStatement__Alternatives
            {
            pushFollow(FOLLOW_rule__BreakableStatement__Alternatives_in_ruleBreakableStatement694);
            rule__BreakableStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBreakableStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBreakableStatement"


    // $ANTLR start "entryRuleUserDefinedCommandStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:368:1: entryRuleUserDefinedCommandStatement : ruleUserDefinedCommandStatement EOF ;
    public final void entryRuleUserDefinedCommandStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:369:1: ( ruleUserDefinedCommandStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:370:1: ruleUserDefinedCommandStatement EOF
            {
             before(grammarAccess.getUserDefinedCommandStatementRule()); 
            pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement721);
            ruleUserDefinedCommandStatement();

            state._fsp--;

             after(grammarAccess.getUserDefinedCommandStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement728); 

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
    // $ANTLR end "entryRuleUserDefinedCommandStatement"


    // $ANTLR start "ruleUserDefinedCommandStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:377:1: ruleUserDefinedCommandStatement : ( ( rule__UserDefinedCommandStatement__Group__0 ) ) ;
    public final void ruleUserDefinedCommandStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:381:2: ( ( ( rule__UserDefinedCommandStatement__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:382:1: ( ( rule__UserDefinedCommandStatement__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:382:1: ( ( rule__UserDefinedCommandStatement__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:383:1: ( rule__UserDefinedCommandStatement__Group__0 )
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:384:1: ( rule__UserDefinedCommandStatement__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:384:2: rule__UserDefinedCommandStatement__Group__0
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__0_in_ruleUserDefinedCommandStatement754);
            rule__UserDefinedCommandStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserDefinedCommandStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleUserDefinedCommandStatement"


    // $ANTLR start "entryRuleIfStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:396:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:397:1: ( ruleIfStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:398:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement781);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement788); 

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:405:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:409:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:410:1: ( ( rule__IfStatement__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:410:1: ( ( rule__IfStatement__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:411:1: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:412:1: ( rule__IfStatement__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:412:2: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__0_in_ruleIfStatement814);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleIterateStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:424:1: entryRuleIterateStatement : ruleIterateStatement EOF ;
    public final void entryRuleIterateStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:425:1: ( ruleIterateStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:426:1: ruleIterateStatement EOF
            {
             before(grammarAccess.getIterateStatementRule()); 
            pushFollow(FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement841);
            ruleIterateStatement();

            state._fsp--;

             after(grammarAccess.getIterateStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterateStatement848); 

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
    // $ANTLR end "entryRuleIterateStatement"


    // $ANTLR start "ruleIterateStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:433:1: ruleIterateStatement : ( ( rule__IterateStatement__Group__0 ) ) ;
    public final void ruleIterateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:437:2: ( ( ( rule__IterateStatement__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:438:1: ( ( rule__IterateStatement__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:438:1: ( ( rule__IterateStatement__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:439:1: ( rule__IterateStatement__Group__0 )
            {
             before(grammarAccess.getIterateStatementAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:440:1: ( rule__IterateStatement__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:440:2: rule__IterateStatement__Group__0
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__0_in_ruleIterateStatement874);
            rule__IterateStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIterateStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleIterateStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:452:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:453:1: ( ruleWhileStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:454:1: ruleWhileStatement EOF
            {
             before(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement901);
            ruleWhileStatement();

            state._fsp--;

             after(grammarAccess.getWhileStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement908); 

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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:461:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:465:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:466:1: ( ( rule__WhileStatement__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:466:1: ( ( rule__WhileStatement__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:467:1: ( rule__WhileStatement__Group__0 )
            {
             before(grammarAccess.getWhileStatementAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:468:1: ( rule__WhileStatement__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:468:2: rule__WhileStatement__Group__0
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__0_in_ruleWhileStatement934);
            rule__WhileStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleDocumentationComment"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:480:1: entryRuleDocumentationComment : ruleDocumentationComment EOF ;
    public final void entryRuleDocumentationComment() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:481:1: ( ruleDocumentationComment EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:482:1: ruleDocumentationComment EOF
            {
             before(grammarAccess.getDocumentationCommentRule()); 
            pushFollow(FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment961);
            ruleDocumentationComment();

            state._fsp--;

             after(grammarAccess.getDocumentationCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentationComment968); 

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
    // $ANTLR end "entryRuleDocumentationComment"


    // $ANTLR start "ruleDocumentationComment"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:489:1: ruleDocumentationComment : ( ( rule__DocumentationComment__Group__0 ) ) ;
    public final void ruleDocumentationComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:493:2: ( ( ( rule__DocumentationComment__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:494:1: ( ( rule__DocumentationComment__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:494:1: ( ( rule__DocumentationComment__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:495:1: ( rule__DocumentationComment__Group__0 )
            {
             before(grammarAccess.getDocumentationCommentAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:496:1: ( rule__DocumentationComment__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:496:2: rule__DocumentationComment__Group__0
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__0_in_ruleDocumentationComment994);
            rule__DocumentationComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentationCommentAccess().getGroup()); 

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
    // $ANTLR end "ruleDocumentationComment"


    // $ANTLR start "entryRuleCommandStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:508:1: entryRuleCommandStatement : ruleCommandStatement EOF ;
    public final void entryRuleCommandStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:509:1: ( ruleCommandStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:510:1: ruleCommandStatement EOF
            {
             before(grammarAccess.getCommandStatementRule()); 
            pushFollow(FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement1021);
            ruleCommandStatement();

            state._fsp--;

             after(grammarAccess.getCommandStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandStatement1028); 

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
    // $ANTLR end "entryRuleCommandStatement"


    // $ANTLR start "ruleCommandStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:517:1: ruleCommandStatement : ( ( rule__CommandStatement__Group__0 ) ) ;
    public final void ruleCommandStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:521:2: ( ( ( rule__CommandStatement__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:522:1: ( ( rule__CommandStatement__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:522:1: ( ( rule__CommandStatement__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:523:1: ( rule__CommandStatement__Group__0 )
            {
             before(grammarAccess.getCommandStatementAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:524:1: ( rule__CommandStatement__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:524:2: rule__CommandStatement__Group__0
            {
            pushFollow(FOLLOW_rule__CommandStatement__Group__0_in_ruleCommandStatement1054);
            rule__CommandStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleCommandStatement"


    // $ANTLR start "entryRuleCommandKind"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:536:1: entryRuleCommandKind : ruleCommandKind EOF ;
    public final void entryRuleCommandKind() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:537:1: ( ruleCommandKind EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:538:1: ruleCommandKind EOF
            {
             before(grammarAccess.getCommandKindRule()); 
            pushFollow(FOLLOW_ruleCommandKind_in_entryRuleCommandKind1081);
            ruleCommandKind();

            state._fsp--;

             after(grammarAccess.getCommandKindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandKind1088); 

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
    // $ANTLR end "entryRuleCommandKind"


    // $ANTLR start "ruleCommandKind"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:545:1: ruleCommandKind : ( ( rule__CommandKind__Alternatives ) ) ;
    public final void ruleCommandKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:549:2: ( ( ( rule__CommandKind__Alternatives ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:550:1: ( ( rule__CommandKind__Alternatives ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:550:1: ( ( rule__CommandKind__Alternatives ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:551:1: ( rule__CommandKind__Alternatives )
            {
             before(grammarAccess.getCommandKindAccess().getAlternatives()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:552:1: ( rule__CommandKind__Alternatives )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:552:2: rule__CommandKind__Alternatives
            {
            pushFollow(FOLLOW_rule__CommandKind__Alternatives_in_ruleCommandKind1114);
            rule__CommandKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCommandKind"


    // $ANTLR start "entryRuleConditionExpr"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:564:1: entryRuleConditionExpr : ruleConditionExpr EOF ;
    public final void entryRuleConditionExpr() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:565:1: ( ruleConditionExpr EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:566:1: ruleConditionExpr EOF
            {
             before(grammarAccess.getConditionExprRule()); 
            pushFollow(FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr1141);
            ruleConditionExpr();

            state._fsp--;

             after(grammarAccess.getConditionExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionExpr1148); 

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
    // $ANTLR end "entryRuleConditionExpr"


    // $ANTLR start "ruleConditionExpr"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:573:1: ruleConditionExpr : ( ( rule__ConditionExpr__Group__0 ) ) ;
    public final void ruleConditionExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:577:2: ( ( ( rule__ConditionExpr__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:578:1: ( ( rule__ConditionExpr__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:578:1: ( ( rule__ConditionExpr__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:579:1: ( rule__ConditionExpr__Group__0 )
            {
             before(grammarAccess.getConditionExprAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:580:1: ( rule__ConditionExpr__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:580:2: rule__ConditionExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionExpr__Group__0_in_ruleConditionExpr1174);
            rule__ConditionExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionExprAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionExpr"


    // $ANTLR start "entryRuleConditionKind"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:592:1: entryRuleConditionKind : ruleConditionKind EOF ;
    public final void entryRuleConditionKind() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:593:1: ( ruleConditionKind EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:594:1: ruleConditionKind EOF
            {
             before(grammarAccess.getConditionKindRule()); 
            pushFollow(FOLLOW_ruleConditionKind_in_entryRuleConditionKind1201);
            ruleConditionKind();

            state._fsp--;

             after(grammarAccess.getConditionKindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionKind1208); 

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
    // $ANTLR end "entryRuleConditionKind"


    // $ANTLR start "ruleConditionKind"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:601:1: ruleConditionKind : ( ( rule__ConditionKind__Alternatives ) ) ;
    public final void ruleConditionKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:605:2: ( ( ( rule__ConditionKind__Alternatives ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:606:1: ( ( rule__ConditionKind__Alternatives ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:606:1: ( ( rule__ConditionKind__Alternatives ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:607:1: ( rule__ConditionKind__Alternatives )
            {
             before(grammarAccess.getConditionKindAccess().getAlternatives()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:608:1: ( rule__ConditionKind__Alternatives )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:608:2: rule__ConditionKind__Alternatives
            {
            pushFollow(FOLLOW_rule__ConditionKind__Alternatives_in_ruleConditionKind1234);
            rule__ConditionKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConditionKind"


    // $ANTLR start "rule__InitCommand__Alternatives"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:620:1: rule__InitCommand__Alternatives : ( ( ruleInitPositionCommand ) | ( ruleInitHeadingCommand ) | ( ruleInitBoardSizeCommand ) );
    public final void rule__InitCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:624:1: ( ( ruleInitPositionCommand ) | ( ruleInitHeadingCommand ) | ( ruleInitBoardSizeCommand ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 31:
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
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:625:1: ( ruleInitPositionCommand )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:625:1: ( ruleInitPositionCommand )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:626:1: ruleInitPositionCommand
                    {
                     before(grammarAccess.getInitCommandAccess().getInitPositionCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInitPositionCommand_in_rule__InitCommand__Alternatives1270);
                    ruleInitPositionCommand();

                    state._fsp--;

                     after(grammarAccess.getInitCommandAccess().getInitPositionCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:631:6: ( ruleInitHeadingCommand )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:631:6: ( ruleInitHeadingCommand )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:632:1: ruleInitHeadingCommand
                    {
                     before(grammarAccess.getInitCommandAccess().getInitHeadingCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInitHeadingCommand_in_rule__InitCommand__Alternatives1287);
                    ruleInitHeadingCommand();

                    state._fsp--;

                     after(grammarAccess.getInitCommandAccess().getInitHeadingCommandParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:637:6: ( ruleInitBoardSizeCommand )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:637:6: ( ruleInitBoardSizeCommand )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:638:1: ruleInitBoardSizeCommand
                    {
                     before(grammarAccess.getInitCommandAccess().getInitBoardSizeCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInitBoardSizeCommand_in_rule__InitCommand__Alternatives1304);
                    ruleInitBoardSizeCommand();

                    state._fsp--;

                     after(grammarAccess.getInitCommandAccess().getInitBoardSizeCommandParserRuleCall_2()); 

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
    // $ANTLR end "rule__InitCommand__Alternatives"


    // $ANTLR start "rule__HeadingKind__Alternatives"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:648:1: rule__HeadingKind__Alternatives : ( ( 'NORTH' ) | ( 'SOUTH' ) | ( 'WEST' ) | ( 'EAST' ) );
    public final void rule__HeadingKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:652:1: ( ( 'NORTH' ) | ( 'SOUTH' ) | ( 'WEST' ) | ( 'EAST' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:653:1: ( 'NORTH' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:653:1: ( 'NORTH' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:654:1: 'NORTH'
                    {
                     before(grammarAccess.getHeadingKindAccess().getNORTHKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__HeadingKind__Alternatives1337); 
                     after(grammarAccess.getHeadingKindAccess().getNORTHKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:661:6: ( 'SOUTH' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:661:6: ( 'SOUTH' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:662:1: 'SOUTH'
                    {
                     before(grammarAccess.getHeadingKindAccess().getSOUTHKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__HeadingKind__Alternatives1357); 
                     after(grammarAccess.getHeadingKindAccess().getSOUTHKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:669:6: ( 'WEST' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:669:6: ( 'WEST' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:670:1: 'WEST'
                    {
                     before(grammarAccess.getHeadingKindAccess().getWESTKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__HeadingKind__Alternatives1377); 
                     after(grammarAccess.getHeadingKindAccess().getWESTKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:677:6: ( 'EAST' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:677:6: ( 'EAST' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:678:1: 'EAST'
                    {
                     before(grammarAccess.getHeadingKindAccess().getEASTKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__HeadingKind__Alternatives1397); 
                     after(grammarAccess.getHeadingKindAccess().getEASTKeyword_3()); 

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
    // $ANTLR end "rule__HeadingKind__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:690:1: rule__Statement__Alternatives : ( ( ruleIfStatement ) | ( ruleIterateStatement ) | ( ruleWhileStatement ) | ( ruleBreakableStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:694:1: ( ( ruleIfStatement ) | ( ruleIterateStatement ) | ( ruleWhileStatement ) | ( ruleBreakableStatement ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt3=1;
                }
                break;
            case 44:
                {
                alt3=2;
                }
                break;
            case 46:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:695:1: ( ruleIfStatement )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:695:1: ( ruleIfStatement )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:696:1: ruleIfStatement
                    {
                     before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIfStatement_in_rule__Statement__Alternatives1431);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:701:6: ( ruleIterateStatement )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:701:6: ( ruleIterateStatement )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:702:1: ruleIterateStatement
                    {
                     before(grammarAccess.getStatementAccess().getIterateStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIterateStatement_in_rule__Statement__Alternatives1448);
                    ruleIterateStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIterateStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:707:6: ( ruleWhileStatement )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:707:6: ( ruleWhileStatement )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:708:1: ruleWhileStatement
                    {
                     before(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleWhileStatement_in_rule__Statement__Alternatives1465);
                    ruleWhileStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:713:6: ( ruleBreakableStatement )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:713:6: ( ruleBreakableStatement )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:714:1: ruleBreakableStatement
                    {
                     before(grammarAccess.getStatementAccess().getBreakableStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleBreakableStatement_in_rule__Statement__Alternatives1482);
                    ruleBreakableStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBreakableStatementParserRuleCall_3()); 

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


    // $ANTLR start "rule__BreakableStatement__Alternatives"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:724:1: rule__BreakableStatement__Alternatives : ( ( ruleCommandStatement ) | ( ruleUserDefinedCommandStatement ) );
    public final void rule__BreakableStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:728:1: ( ( ruleCommandStatement ) | ( ruleUserDefinedCommandStatement ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=15 && LA4_0<=20)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:729:1: ( ruleCommandStatement )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:729:1: ( ruleCommandStatement )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:730:1: ruleCommandStatement
                    {
                     before(grammarAccess.getBreakableStatementAccess().getCommandStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCommandStatement_in_rule__BreakableStatement__Alternatives1514);
                    ruleCommandStatement();

                    state._fsp--;

                     after(grammarAccess.getBreakableStatementAccess().getCommandStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:735:6: ( ruleUserDefinedCommandStatement )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:735:6: ( ruleUserDefinedCommandStatement )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:736:1: ruleUserDefinedCommandStatement
                    {
                     before(grammarAccess.getBreakableStatementAccess().getUserDefinedCommandStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_rule__BreakableStatement__Alternatives1531);
                    ruleUserDefinedCommandStatement();

                    state._fsp--;

                     after(grammarAccess.getBreakableStatementAccess().getUserDefinedCommandStatementParserRuleCall_1()); 

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
    // $ANTLR end "rule__BreakableStatement__Alternatives"


    // $ANTLR start "rule__CommandKind__Alternatives"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:746:1: rule__CommandKind__Alternatives : ( ( 'move' ) | ( 'turn' ) | ( 'turnOn' ) | ( 'turnOff' ) | ( 'put' ) | ( 'get' ) );
    public final void rule__CommandKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:750:1: ( ( 'move' ) | ( 'turn' ) | ( 'turnOn' ) | ( 'turnOff' ) | ( 'put' ) | ( 'get' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:751:1: ( 'move' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:751:1: ( 'move' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:752:1: 'move'
                    {
                     before(grammarAccess.getCommandKindAccess().getMoveKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__CommandKind__Alternatives1564); 
                     after(grammarAccess.getCommandKindAccess().getMoveKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:759:6: ( 'turn' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:759:6: ( 'turn' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:760:1: 'turn'
                    {
                     before(grammarAccess.getCommandKindAccess().getTurnKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__CommandKind__Alternatives1584); 
                     after(grammarAccess.getCommandKindAccess().getTurnKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:767:6: ( 'turnOn' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:767:6: ( 'turnOn' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:768:1: 'turnOn'
                    {
                     before(grammarAccess.getCommandKindAccess().getTurnOnKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__CommandKind__Alternatives1604); 
                     after(grammarAccess.getCommandKindAccess().getTurnOnKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:775:6: ( 'turnOff' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:775:6: ( 'turnOff' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:776:1: 'turnOff'
                    {
                     before(grammarAccess.getCommandKindAccess().getTurnOffKeyword_3()); 
                    match(input,18,FOLLOW_18_in_rule__CommandKind__Alternatives1624); 
                     after(grammarAccess.getCommandKindAccess().getTurnOffKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:783:6: ( 'put' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:783:6: ( 'put' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:784:1: 'put'
                    {
                     before(grammarAccess.getCommandKindAccess().getPutKeyword_4()); 
                    match(input,19,FOLLOW_19_in_rule__CommandKind__Alternatives1644); 
                     after(grammarAccess.getCommandKindAccess().getPutKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:791:6: ( 'get' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:791:6: ( 'get' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:792:1: 'get'
                    {
                     before(grammarAccess.getCommandKindAccess().getGetKeyword_5()); 
                    match(input,20,FOLLOW_20_in_rule__CommandKind__Alternatives1664); 
                     after(grammarAccess.getCommandKindAccess().getGetKeyword_5()); 

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
    // $ANTLR end "rule__CommandKind__Alternatives"


    // $ANTLR start "rule__ConditionKind__Alternatives"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:804:1: rule__ConditionKind__Alternatives : ( ( 'WALL_AHEAD' ) | ( 'MARKED_PLACE' ) );
    public final void rule__ConditionKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:808:1: ( ( 'WALL_AHEAD' ) | ( 'MARKED_PLACE' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:809:1: ( 'WALL_AHEAD' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:809:1: ( 'WALL_AHEAD' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:810:1: 'WALL_AHEAD'
                    {
                     before(grammarAccess.getConditionKindAccess().getWALL_AHEADKeyword_0()); 
                    match(input,21,FOLLOW_21_in_rule__ConditionKind__Alternatives1699); 
                     after(grammarAccess.getConditionKindAccess().getWALL_AHEADKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:817:6: ( 'MARKED_PLACE' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:817:6: ( 'MARKED_PLACE' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:818:1: 'MARKED_PLACE'
                    {
                     before(grammarAccess.getConditionKindAccess().getMARKED_PLACEKeyword_1()); 
                    match(input,22,FOLLOW_22_in_rule__ConditionKind__Alternatives1719); 
                     after(grammarAccess.getConditionKindAccess().getMARKED_PLACEKeyword_1()); 

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
    // $ANTLR end "rule__ConditionKind__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:832:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:836:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:837:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01751);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01754);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:844:1: rule__Program__Group__0__Impl : ( 'BEGIN-PROGRAM' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:848:1: ( ( 'BEGIN-PROGRAM' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:849:1: ( 'BEGIN-PROGRAM' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:849:1: ( 'BEGIN-PROGRAM' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:850:1: 'BEGIN-PROGRAM'
            {
             before(grammarAccess.getProgramAccess().getBEGINPROGRAMKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Program__Group__0__Impl1782); 
             after(grammarAccess.getProgramAccess().getBEGINPROGRAMKeyword_0()); 

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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:863:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:867:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:868:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11813);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11816);
            rule__Program__Group__2();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:875:1: rule__Program__Group__1__Impl : ( ( rule__Program__InitSectionAssignment_1 )? ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:879:1: ( ( ( rule__Program__InitSectionAssignment_1 )? ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:880:1: ( ( rule__Program__InitSectionAssignment_1 )? )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:880:1: ( ( rule__Program__InitSectionAssignment_1 )? )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:881:1: ( rule__Program__InitSectionAssignment_1 )?
            {
             before(grammarAccess.getProgramAccess().getInitSectionAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:882:1: ( rule__Program__InitSectionAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:882:2: rule__Program__InitSectionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Program__InitSectionAssignment_1_in_rule__Program__Group__1__Impl1843);
                    rule__Program__InitSectionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getInitSectionAssignment_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:892:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:896:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:897:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21874);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21877);
            rule__Program__Group__3();

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
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:904:1: rule__Program__Group__2__Impl : ( ( rule__Program__UserDefinedCommandsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:908:1: ( ( ( rule__Program__UserDefinedCommandsAssignment_2 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:909:1: ( ( rule__Program__UserDefinedCommandsAssignment_2 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:909:1: ( ( rule__Program__UserDefinedCommandsAssignment_2 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:910:1: ( rule__Program__UserDefinedCommandsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getUserDefinedCommandsAssignment_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:911:1: ( rule__Program__UserDefinedCommandsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==32||LA8_0==47) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:911:2: rule__Program__UserDefinedCommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Program__UserDefinedCommandsAssignment_2_in_rule__Program__Group__2__Impl1904);
            	    rule__Program__UserDefinedCommandsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getUserDefinedCommandsAssignment_2()); 

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
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:921:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:925:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:926:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31935);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31938);
            rule__Program__Group__4();

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
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:933:1: rule__Program__Group__3__Impl : ( ( rule__Program__MainAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:937:1: ( ( ( rule__Program__MainAssignment_3 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:938:1: ( ( rule__Program__MainAssignment_3 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:938:1: ( ( rule__Program__MainAssignment_3 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:939:1: ( rule__Program__MainAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getMainAssignment_3()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:940:1: ( rule__Program__MainAssignment_3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:940:2: rule__Program__MainAssignment_3
            {
            pushFollow(FOLLOW_rule__Program__MainAssignment_3_in_rule__Program__Group__3__Impl1965);
            rule__Program__MainAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getMainAssignment_3()); 

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
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:950:1: rule__Program__Group__4 : rule__Program__Group__4__Impl ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:954:1: ( rule__Program__Group__4__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:955:2: rule__Program__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41995);
            rule__Program__Group__4__Impl();

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
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:961:1: rule__Program__Group__4__Impl : ( 'END-PROGRAM' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:965:1: ( ( 'END-PROGRAM' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:966:1: ( 'END-PROGRAM' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:966:1: ( 'END-PROGRAM' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:967:1: 'END-PROGRAM'
            {
             before(grammarAccess.getProgramAccess().getENDPROGRAMKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Program__Group__4__Impl2023); 
             after(grammarAccess.getProgramAccess().getENDPROGRAMKeyword_4()); 

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
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__InitSection__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:990:1: rule__InitSection__Group__0 : rule__InitSection__Group__0__Impl rule__InitSection__Group__1 ;
    public final void rule__InitSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:994:1: ( rule__InitSection__Group__0__Impl rule__InitSection__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:995:2: rule__InitSection__Group__0__Impl rule__InitSection__Group__1
            {
            pushFollow(FOLLOW_rule__InitSection__Group__0__Impl_in_rule__InitSection__Group__02064);
            rule__InitSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitSection__Group__1_in_rule__InitSection__Group__02067);
            rule__InitSection__Group__1();

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
    // $ANTLR end "rule__InitSection__Group__0"


    // $ANTLR start "rule__InitSection__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1002:1: rule__InitSection__Group__0__Impl : ( 'BEGIN-INIT' ) ;
    public final void rule__InitSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1006:1: ( ( 'BEGIN-INIT' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1007:1: ( 'BEGIN-INIT' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1007:1: ( 'BEGIN-INIT' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1008:1: 'BEGIN-INIT'
            {
             before(grammarAccess.getInitSectionAccess().getBEGININITKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__InitSection__Group__0__Impl2095); 
             after(grammarAccess.getInitSectionAccess().getBEGININITKeyword_0()); 

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
    // $ANTLR end "rule__InitSection__Group__0__Impl"


    // $ANTLR start "rule__InitSection__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1021:1: rule__InitSection__Group__1 : rule__InitSection__Group__1__Impl rule__InitSection__Group__2 ;
    public final void rule__InitSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1025:1: ( rule__InitSection__Group__1__Impl rule__InitSection__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1026:2: rule__InitSection__Group__1__Impl rule__InitSection__Group__2
            {
            pushFollow(FOLLOW_rule__InitSection__Group__1__Impl_in_rule__InitSection__Group__12126);
            rule__InitSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitSection__Group__2_in_rule__InitSection__Group__12129);
            rule__InitSection__Group__2();

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
    // $ANTLR end "rule__InitSection__Group__1"


    // $ANTLR start "rule__InitSection__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1033:1: rule__InitSection__Group__1__Impl : ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) ) ;
    public final void rule__InitSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1037:1: ( ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1038:1: ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1038:1: ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1039:1: ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1039:1: ( ( rule__InitSection__InitCommandsAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1040:1: ( rule__InitSection__InitCommandsAssignment_1 )
            {
             before(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1041:1: ( rule__InitSection__InitCommandsAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1041:2: rule__InitSection__InitCommandsAssignment_1
            {
            pushFollow(FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2158);
            rule__InitSection__InitCommandsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1()); 

            }

            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1044:1: ( ( rule__InitSection__InitCommandsAssignment_1 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1045:1: ( rule__InitSection__InitCommandsAssignment_1 )*
            {
             before(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1046:1: ( rule__InitSection__InitCommandsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27||(LA9_0>=30 && LA9_0<=31)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1046:2: rule__InitSection__InitCommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2170);
            	    rule__InitSection__InitCommandsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1()); 

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
    // $ANTLR end "rule__InitSection__Group__1__Impl"


    // $ANTLR start "rule__InitSection__Group__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1057:1: rule__InitSection__Group__2 : rule__InitSection__Group__2__Impl ;
    public final void rule__InitSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1061:1: ( rule__InitSection__Group__2__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1062:2: rule__InitSection__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InitSection__Group__2__Impl_in_rule__InitSection__Group__22203);
            rule__InitSection__Group__2__Impl();

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
    // $ANTLR end "rule__InitSection__Group__2"


    // $ANTLR start "rule__InitSection__Group__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1068:1: rule__InitSection__Group__2__Impl : ( 'END-INIT' ) ;
    public final void rule__InitSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1072:1: ( ( 'END-INIT' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1073:1: ( 'END-INIT' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1073:1: ( 'END-INIT' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1074:1: 'END-INIT'
            {
             before(grammarAccess.getInitSectionAccess().getENDINITKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__InitSection__Group__2__Impl2231); 
             after(grammarAccess.getInitSectionAccess().getENDINITKeyword_2()); 

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
    // $ANTLR end "rule__InitSection__Group__2__Impl"


    // $ANTLR start "rule__InitPositionCommand__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1093:1: rule__InitPositionCommand__Group__0 : rule__InitPositionCommand__Group__0__Impl rule__InitPositionCommand__Group__1 ;
    public final void rule__InitPositionCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1097:1: ( rule__InitPositionCommand__Group__0__Impl rule__InitPositionCommand__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1098:2: rule__InitPositionCommand__Group__0__Impl rule__InitPositionCommand__Group__1
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__0__Impl_in_rule__InitPositionCommand__Group__02268);
            rule__InitPositionCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__1_in_rule__InitPositionCommand__Group__02271);
            rule__InitPositionCommand__Group__1();

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
    // $ANTLR end "rule__InitPositionCommand__Group__0"


    // $ANTLR start "rule__InitPositionCommand__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1105:1: rule__InitPositionCommand__Group__0__Impl : ( 'position' ) ;
    public final void rule__InitPositionCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1109:1: ( ( 'position' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1110:1: ( 'position' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1110:1: ( 'position' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1111:1: 'position'
            {
             before(grammarAccess.getInitPositionCommandAccess().getPositionKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__InitPositionCommand__Group__0__Impl2299); 
             after(grammarAccess.getInitPositionCommandAccess().getPositionKeyword_0()); 

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
    // $ANTLR end "rule__InitPositionCommand__Group__0__Impl"


    // $ANTLR start "rule__InitPositionCommand__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1124:1: rule__InitPositionCommand__Group__1 : rule__InitPositionCommand__Group__1__Impl rule__InitPositionCommand__Group__2 ;
    public final void rule__InitPositionCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1128:1: ( rule__InitPositionCommand__Group__1__Impl rule__InitPositionCommand__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1129:2: rule__InitPositionCommand__Group__1__Impl rule__InitPositionCommand__Group__2
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__1__Impl_in_rule__InitPositionCommand__Group__12330);
            rule__InitPositionCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__2_in_rule__InitPositionCommand__Group__12333);
            rule__InitPositionCommand__Group__2();

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
    // $ANTLR end "rule__InitPositionCommand__Group__1"


    // $ANTLR start "rule__InitPositionCommand__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1136:1: rule__InitPositionCommand__Group__1__Impl : ( ( rule__InitPositionCommand__XAssignment_1 ) ) ;
    public final void rule__InitPositionCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1140:1: ( ( ( rule__InitPositionCommand__XAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1141:1: ( ( rule__InitPositionCommand__XAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1141:1: ( ( rule__InitPositionCommand__XAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1142:1: ( rule__InitPositionCommand__XAssignment_1 )
            {
             before(grammarAccess.getInitPositionCommandAccess().getXAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1143:1: ( rule__InitPositionCommand__XAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1143:2: rule__InitPositionCommand__XAssignment_1
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__XAssignment_1_in_rule__InitPositionCommand__Group__1__Impl2360);
            rule__InitPositionCommand__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitPositionCommandAccess().getXAssignment_1()); 

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
    // $ANTLR end "rule__InitPositionCommand__Group__1__Impl"


    // $ANTLR start "rule__InitPositionCommand__Group__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1153:1: rule__InitPositionCommand__Group__2 : rule__InitPositionCommand__Group__2__Impl rule__InitPositionCommand__Group__3 ;
    public final void rule__InitPositionCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1157:1: ( rule__InitPositionCommand__Group__2__Impl rule__InitPositionCommand__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1158:2: rule__InitPositionCommand__Group__2__Impl rule__InitPositionCommand__Group__3
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__2__Impl_in_rule__InitPositionCommand__Group__22390);
            rule__InitPositionCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__3_in_rule__InitPositionCommand__Group__22393);
            rule__InitPositionCommand__Group__3();

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
    // $ANTLR end "rule__InitPositionCommand__Group__2"


    // $ANTLR start "rule__InitPositionCommand__Group__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1165:1: rule__InitPositionCommand__Group__2__Impl : ( ',' ) ;
    public final void rule__InitPositionCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1169:1: ( ( ',' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1170:1: ( ',' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1170:1: ( ',' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1171:1: ','
            {
             before(grammarAccess.getInitPositionCommandAccess().getCommaKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__InitPositionCommand__Group__2__Impl2421); 
             after(grammarAccess.getInitPositionCommandAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__InitPositionCommand__Group__2__Impl"


    // $ANTLR start "rule__InitPositionCommand__Group__3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1184:1: rule__InitPositionCommand__Group__3 : rule__InitPositionCommand__Group__3__Impl rule__InitPositionCommand__Group__4 ;
    public final void rule__InitPositionCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1188:1: ( rule__InitPositionCommand__Group__3__Impl rule__InitPositionCommand__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1189:2: rule__InitPositionCommand__Group__3__Impl rule__InitPositionCommand__Group__4
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__3__Impl_in_rule__InitPositionCommand__Group__32452);
            rule__InitPositionCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__4_in_rule__InitPositionCommand__Group__32455);
            rule__InitPositionCommand__Group__4();

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
    // $ANTLR end "rule__InitPositionCommand__Group__3"


    // $ANTLR start "rule__InitPositionCommand__Group__3__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1196:1: rule__InitPositionCommand__Group__3__Impl : ( ( rule__InitPositionCommand__YAssignment_3 ) ) ;
    public final void rule__InitPositionCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1200:1: ( ( ( rule__InitPositionCommand__YAssignment_3 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1201:1: ( ( rule__InitPositionCommand__YAssignment_3 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1201:1: ( ( rule__InitPositionCommand__YAssignment_3 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1202:1: ( rule__InitPositionCommand__YAssignment_3 )
            {
             before(grammarAccess.getInitPositionCommandAccess().getYAssignment_3()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1203:1: ( rule__InitPositionCommand__YAssignment_3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1203:2: rule__InitPositionCommand__YAssignment_3
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__YAssignment_3_in_rule__InitPositionCommand__Group__3__Impl2482);
            rule__InitPositionCommand__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitPositionCommandAccess().getYAssignment_3()); 

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
    // $ANTLR end "rule__InitPositionCommand__Group__3__Impl"


    // $ANTLR start "rule__InitPositionCommand__Group__4"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1213:1: rule__InitPositionCommand__Group__4 : rule__InitPositionCommand__Group__4__Impl ;
    public final void rule__InitPositionCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1217:1: ( rule__InitPositionCommand__Group__4__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1218:2: rule__InitPositionCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__4__Impl_in_rule__InitPositionCommand__Group__42512);
            rule__InitPositionCommand__Group__4__Impl();

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
    // $ANTLR end "rule__InitPositionCommand__Group__4"


    // $ANTLR start "rule__InitPositionCommand__Group__4__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1224:1: rule__InitPositionCommand__Group__4__Impl : ( ';' ) ;
    public final void rule__InitPositionCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1228:1: ( ( ';' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1229:1: ( ';' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1229:1: ( ';' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1230:1: ';'
            {
             before(grammarAccess.getInitPositionCommandAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__InitPositionCommand__Group__4__Impl2540); 
             after(grammarAccess.getInitPositionCommandAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__InitPositionCommand__Group__4__Impl"


    // $ANTLR start "rule__InitHeadingCommand__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1253:1: rule__InitHeadingCommand__Group__0 : rule__InitHeadingCommand__Group__0__Impl rule__InitHeadingCommand__Group__1 ;
    public final void rule__InitHeadingCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1257:1: ( rule__InitHeadingCommand__Group__0__Impl rule__InitHeadingCommand__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1258:2: rule__InitHeadingCommand__Group__0__Impl rule__InitHeadingCommand__Group__1
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__0__Impl_in_rule__InitHeadingCommand__Group__02581);
            rule__InitHeadingCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__1_in_rule__InitHeadingCommand__Group__02584);
            rule__InitHeadingCommand__Group__1();

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
    // $ANTLR end "rule__InitHeadingCommand__Group__0"


    // $ANTLR start "rule__InitHeadingCommand__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1265:1: rule__InitHeadingCommand__Group__0__Impl : ( 'heading' ) ;
    public final void rule__InitHeadingCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1269:1: ( ( 'heading' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1270:1: ( 'heading' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1270:1: ( 'heading' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1271:1: 'heading'
            {
             before(grammarAccess.getInitHeadingCommandAccess().getHeadingKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__InitHeadingCommand__Group__0__Impl2612); 
             after(grammarAccess.getInitHeadingCommandAccess().getHeadingKeyword_0()); 

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
    // $ANTLR end "rule__InitHeadingCommand__Group__0__Impl"


    // $ANTLR start "rule__InitHeadingCommand__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1284:1: rule__InitHeadingCommand__Group__1 : rule__InitHeadingCommand__Group__1__Impl rule__InitHeadingCommand__Group__2 ;
    public final void rule__InitHeadingCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1288:1: ( rule__InitHeadingCommand__Group__1__Impl rule__InitHeadingCommand__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1289:2: rule__InitHeadingCommand__Group__1__Impl rule__InitHeadingCommand__Group__2
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__1__Impl_in_rule__InitHeadingCommand__Group__12643);
            rule__InitHeadingCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__2_in_rule__InitHeadingCommand__Group__12646);
            rule__InitHeadingCommand__Group__2();

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
    // $ANTLR end "rule__InitHeadingCommand__Group__1"


    // $ANTLR start "rule__InitHeadingCommand__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1296:1: rule__InitHeadingCommand__Group__1__Impl : ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) ) ;
    public final void rule__InitHeadingCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1300:1: ( ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1301:1: ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1301:1: ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1302:1: ( rule__InitHeadingCommand__HeadingAssignment_1 )
            {
             before(grammarAccess.getInitHeadingCommandAccess().getHeadingAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1303:1: ( rule__InitHeadingCommand__HeadingAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1303:2: rule__InitHeadingCommand__HeadingAssignment_1
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__HeadingAssignment_1_in_rule__InitHeadingCommand__Group__1__Impl2673);
            rule__InitHeadingCommand__HeadingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitHeadingCommandAccess().getHeadingAssignment_1()); 

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
    // $ANTLR end "rule__InitHeadingCommand__Group__1__Impl"


    // $ANTLR start "rule__InitHeadingCommand__Group__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1313:1: rule__InitHeadingCommand__Group__2 : rule__InitHeadingCommand__Group__2__Impl ;
    public final void rule__InitHeadingCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1317:1: ( rule__InitHeadingCommand__Group__2__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1318:2: rule__InitHeadingCommand__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__2__Impl_in_rule__InitHeadingCommand__Group__22703);
            rule__InitHeadingCommand__Group__2__Impl();

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
    // $ANTLR end "rule__InitHeadingCommand__Group__2"


    // $ANTLR start "rule__InitHeadingCommand__Group__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1324:1: rule__InitHeadingCommand__Group__2__Impl : ( ';' ) ;
    public final void rule__InitHeadingCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1328:1: ( ( ';' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1329:1: ( ';' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1329:1: ( ';' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1330:1: ';'
            {
             before(grammarAccess.getInitHeadingCommandAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__InitHeadingCommand__Group__2__Impl2731); 
             after(grammarAccess.getInitHeadingCommandAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__InitHeadingCommand__Group__2__Impl"


    // $ANTLR start "rule__InitBoardSizeCommand__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1349:1: rule__InitBoardSizeCommand__Group__0 : rule__InitBoardSizeCommand__Group__0__Impl rule__InitBoardSizeCommand__Group__1 ;
    public final void rule__InitBoardSizeCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1353:1: ( rule__InitBoardSizeCommand__Group__0__Impl rule__InitBoardSizeCommand__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1354:2: rule__InitBoardSizeCommand__Group__0__Impl rule__InitBoardSizeCommand__Group__1
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__0__Impl_in_rule__InitBoardSizeCommand__Group__02768);
            rule__InitBoardSizeCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__1_in_rule__InitBoardSizeCommand__Group__02771);
            rule__InitBoardSizeCommand__Group__1();

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
    // $ANTLR end "rule__InitBoardSizeCommand__Group__0"


    // $ANTLR start "rule__InitBoardSizeCommand__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1361:1: rule__InitBoardSizeCommand__Group__0__Impl : ( 'boardSize' ) ;
    public final void rule__InitBoardSizeCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1365:1: ( ( 'boardSize' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1366:1: ( 'boardSize' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1366:1: ( 'boardSize' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1367:1: 'boardSize'
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getBoardSizeKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__InitBoardSizeCommand__Group__0__Impl2799); 
             after(grammarAccess.getInitBoardSizeCommandAccess().getBoardSizeKeyword_0()); 

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
    // $ANTLR end "rule__InitBoardSizeCommand__Group__0__Impl"


    // $ANTLR start "rule__InitBoardSizeCommand__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1380:1: rule__InitBoardSizeCommand__Group__1 : rule__InitBoardSizeCommand__Group__1__Impl rule__InitBoardSizeCommand__Group__2 ;
    public final void rule__InitBoardSizeCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1384:1: ( rule__InitBoardSizeCommand__Group__1__Impl rule__InitBoardSizeCommand__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1385:2: rule__InitBoardSizeCommand__Group__1__Impl rule__InitBoardSizeCommand__Group__2
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__1__Impl_in_rule__InitBoardSizeCommand__Group__12830);
            rule__InitBoardSizeCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__2_in_rule__InitBoardSizeCommand__Group__12833);
            rule__InitBoardSizeCommand__Group__2();

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
    // $ANTLR end "rule__InitBoardSizeCommand__Group__1"


    // $ANTLR start "rule__InitBoardSizeCommand__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1392:1: rule__InitBoardSizeCommand__Group__1__Impl : ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) ) ;
    public final void rule__InitBoardSizeCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1396:1: ( ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1397:1: ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1397:1: ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1398:1: ( rule__InitBoardSizeCommand__WidthAssignment_1 )
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getWidthAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1399:1: ( rule__InitBoardSizeCommand__WidthAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1399:2: rule__InitBoardSizeCommand__WidthAssignment_1
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__WidthAssignment_1_in_rule__InitBoardSizeCommand__Group__1__Impl2860);
            rule__InitBoardSizeCommand__WidthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitBoardSizeCommandAccess().getWidthAssignment_1()); 

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
    // $ANTLR end "rule__InitBoardSizeCommand__Group__1__Impl"


    // $ANTLR start "rule__InitBoardSizeCommand__Group__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1409:1: rule__InitBoardSizeCommand__Group__2 : rule__InitBoardSizeCommand__Group__2__Impl rule__InitBoardSizeCommand__Group__3 ;
    public final void rule__InitBoardSizeCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1413:1: ( rule__InitBoardSizeCommand__Group__2__Impl rule__InitBoardSizeCommand__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1414:2: rule__InitBoardSizeCommand__Group__2__Impl rule__InitBoardSizeCommand__Group__3
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__2__Impl_in_rule__InitBoardSizeCommand__Group__22890);
            rule__InitBoardSizeCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__3_in_rule__InitBoardSizeCommand__Group__22893);
            rule__InitBoardSizeCommand__Group__3();

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
    // $ANTLR end "rule__InitBoardSizeCommand__Group__2"


    // $ANTLR start "rule__InitBoardSizeCommand__Group__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1421:1: rule__InitBoardSizeCommand__Group__2__Impl : ( ',' ) ;
    public final void rule__InitBoardSizeCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1425:1: ( ( ',' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1426:1: ( ',' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1426:1: ( ',' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1427:1: ','
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getCommaKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__InitBoardSizeCommand__Group__2__Impl2921); 
             after(grammarAccess.getInitBoardSizeCommandAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__InitBoardSizeCommand__Group__2__Impl"


    // $ANTLR start "rule__InitBoardSizeCommand__Group__3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1440:1: rule__InitBoardSizeCommand__Group__3 : rule__InitBoardSizeCommand__Group__3__Impl rule__InitBoardSizeCommand__Group__4 ;
    public final void rule__InitBoardSizeCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1444:1: ( rule__InitBoardSizeCommand__Group__3__Impl rule__InitBoardSizeCommand__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1445:2: rule__InitBoardSizeCommand__Group__3__Impl rule__InitBoardSizeCommand__Group__4
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__3__Impl_in_rule__InitBoardSizeCommand__Group__32952);
            rule__InitBoardSizeCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__4_in_rule__InitBoardSizeCommand__Group__32955);
            rule__InitBoardSizeCommand__Group__4();

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
    // $ANTLR end "rule__InitBoardSizeCommand__Group__3"


    // $ANTLR start "rule__InitBoardSizeCommand__Group__3__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1452:1: rule__InitBoardSizeCommand__Group__3__Impl : ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) ) ;
    public final void rule__InitBoardSizeCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1456:1: ( ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1457:1: ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1457:1: ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1458:1: ( rule__InitBoardSizeCommand__HeightAssignment_3 )
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getHeightAssignment_3()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1459:1: ( rule__InitBoardSizeCommand__HeightAssignment_3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1459:2: rule__InitBoardSizeCommand__HeightAssignment_3
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__HeightAssignment_3_in_rule__InitBoardSizeCommand__Group__3__Impl2982);
            rule__InitBoardSizeCommand__HeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitBoardSizeCommandAccess().getHeightAssignment_3()); 

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
    // $ANTLR end "rule__InitBoardSizeCommand__Group__3__Impl"


    // $ANTLR start "rule__InitBoardSizeCommand__Group__4"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1469:1: rule__InitBoardSizeCommand__Group__4 : rule__InitBoardSizeCommand__Group__4__Impl ;
    public final void rule__InitBoardSizeCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1473:1: ( rule__InitBoardSizeCommand__Group__4__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1474:2: rule__InitBoardSizeCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__4__Impl_in_rule__InitBoardSizeCommand__Group__43012);
            rule__InitBoardSizeCommand__Group__4__Impl();

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
    // $ANTLR end "rule__InitBoardSizeCommand__Group__4"


    // $ANTLR start "rule__InitBoardSizeCommand__Group__4__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1480:1: rule__InitBoardSizeCommand__Group__4__Impl : ( ';' ) ;
    public final void rule__InitBoardSizeCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1484:1: ( ( ';' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1485:1: ( ';' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1485:1: ( ';' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1486:1: ';'
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__InitBoardSizeCommand__Group__4__Impl3040); 
             after(grammarAccess.getInitBoardSizeCommandAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__InitBoardSizeCommand__Group__4__Impl"


    // $ANTLR start "rule__UserDefinedCommand__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1509:1: rule__UserDefinedCommand__Group__0 : rule__UserDefinedCommand__Group__0__Impl rule__UserDefinedCommand__Group__1 ;
    public final void rule__UserDefinedCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1513:1: ( rule__UserDefinedCommand__Group__0__Impl rule__UserDefinedCommand__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1514:2: rule__UserDefinedCommand__Group__0__Impl rule__UserDefinedCommand__Group__1
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__0__Impl_in_rule__UserDefinedCommand__Group__03081);
            rule__UserDefinedCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__1_in_rule__UserDefinedCommand__Group__03084);
            rule__UserDefinedCommand__Group__1();

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
    // $ANTLR end "rule__UserDefinedCommand__Group__0"


    // $ANTLR start "rule__UserDefinedCommand__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1521:1: rule__UserDefinedCommand__Group__0__Impl : ( ( rule__UserDefinedCommand__DocAssignment_0 )? ) ;
    public final void rule__UserDefinedCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1525:1: ( ( ( rule__UserDefinedCommand__DocAssignment_0 )? ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1526:1: ( ( rule__UserDefinedCommand__DocAssignment_0 )? )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1526:1: ( ( rule__UserDefinedCommand__DocAssignment_0 )? )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1527:1: ( rule__UserDefinedCommand__DocAssignment_0 )?
            {
             before(grammarAccess.getUserDefinedCommandAccess().getDocAssignment_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1528:1: ( rule__UserDefinedCommand__DocAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==47) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1528:2: rule__UserDefinedCommand__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UserDefinedCommand__DocAssignment_0_in_rule__UserDefinedCommand__Group__0__Impl3111);
                    rule__UserDefinedCommand__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserDefinedCommandAccess().getDocAssignment_0()); 

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
    // $ANTLR end "rule__UserDefinedCommand__Group__0__Impl"


    // $ANTLR start "rule__UserDefinedCommand__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1538:1: rule__UserDefinedCommand__Group__1 : rule__UserDefinedCommand__Group__1__Impl rule__UserDefinedCommand__Group__2 ;
    public final void rule__UserDefinedCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1542:1: ( rule__UserDefinedCommand__Group__1__Impl rule__UserDefinedCommand__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1543:2: rule__UserDefinedCommand__Group__1__Impl rule__UserDefinedCommand__Group__2
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__1__Impl_in_rule__UserDefinedCommand__Group__13142);
            rule__UserDefinedCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__2_in_rule__UserDefinedCommand__Group__13145);
            rule__UserDefinedCommand__Group__2();

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
    // $ANTLR end "rule__UserDefinedCommand__Group__1"


    // $ANTLR start "rule__UserDefinedCommand__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1550:1: rule__UserDefinedCommand__Group__1__Impl : ( 'DEFINE COMMAND' ) ;
    public final void rule__UserDefinedCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1554:1: ( ( 'DEFINE COMMAND' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1555:1: ( 'DEFINE COMMAND' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1555:1: ( 'DEFINE COMMAND' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1556:1: 'DEFINE COMMAND'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getDEFINECOMMANDKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__UserDefinedCommand__Group__1__Impl3173); 
             after(grammarAccess.getUserDefinedCommandAccess().getDEFINECOMMANDKeyword_1()); 

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
    // $ANTLR end "rule__UserDefinedCommand__Group__1__Impl"


    // $ANTLR start "rule__UserDefinedCommand__Group__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1569:1: rule__UserDefinedCommand__Group__2 : rule__UserDefinedCommand__Group__2__Impl rule__UserDefinedCommand__Group__3 ;
    public final void rule__UserDefinedCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1573:1: ( rule__UserDefinedCommand__Group__2__Impl rule__UserDefinedCommand__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1574:2: rule__UserDefinedCommand__Group__2__Impl rule__UserDefinedCommand__Group__3
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__2__Impl_in_rule__UserDefinedCommand__Group__23204);
            rule__UserDefinedCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__3_in_rule__UserDefinedCommand__Group__23207);
            rule__UserDefinedCommand__Group__3();

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
    // $ANTLR end "rule__UserDefinedCommand__Group__2"


    // $ANTLR start "rule__UserDefinedCommand__Group__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1581:1: rule__UserDefinedCommand__Group__2__Impl : ( ( rule__UserDefinedCommand__NameAssignment_2 ) ) ;
    public final void rule__UserDefinedCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1585:1: ( ( ( rule__UserDefinedCommand__NameAssignment_2 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1586:1: ( ( rule__UserDefinedCommand__NameAssignment_2 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1586:1: ( ( rule__UserDefinedCommand__NameAssignment_2 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1587:1: ( rule__UserDefinedCommand__NameAssignment_2 )
            {
             before(grammarAccess.getUserDefinedCommandAccess().getNameAssignment_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1588:1: ( rule__UserDefinedCommand__NameAssignment_2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1588:2: rule__UserDefinedCommand__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__NameAssignment_2_in_rule__UserDefinedCommand__Group__2__Impl3234);
            rule__UserDefinedCommand__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUserDefinedCommandAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__UserDefinedCommand__Group__2__Impl"


    // $ANTLR start "rule__UserDefinedCommand__Group__3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1598:1: rule__UserDefinedCommand__Group__3 : rule__UserDefinedCommand__Group__3__Impl rule__UserDefinedCommand__Group__4 ;
    public final void rule__UserDefinedCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1602:1: ( rule__UserDefinedCommand__Group__3__Impl rule__UserDefinedCommand__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1603:2: rule__UserDefinedCommand__Group__3__Impl rule__UserDefinedCommand__Group__4
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__3__Impl_in_rule__UserDefinedCommand__Group__33264);
            rule__UserDefinedCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__4_in_rule__UserDefinedCommand__Group__33267);
            rule__UserDefinedCommand__Group__4();

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
    // $ANTLR end "rule__UserDefinedCommand__Group__3"


    // $ANTLR start "rule__UserDefinedCommand__Group__3__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1610:1: rule__UserDefinedCommand__Group__3__Impl : ( 'AS' ) ;
    public final void rule__UserDefinedCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1614:1: ( ( 'AS' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1615:1: ( 'AS' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1615:1: ( 'AS' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1616:1: 'AS'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getASKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__UserDefinedCommand__Group__3__Impl3295); 
             after(grammarAccess.getUserDefinedCommandAccess().getASKeyword_3()); 

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
    // $ANTLR end "rule__UserDefinedCommand__Group__3__Impl"


    // $ANTLR start "rule__UserDefinedCommand__Group__4"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1629:1: rule__UserDefinedCommand__Group__4 : rule__UserDefinedCommand__Group__4__Impl rule__UserDefinedCommand__Group__5 ;
    public final void rule__UserDefinedCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1633:1: ( rule__UserDefinedCommand__Group__4__Impl rule__UserDefinedCommand__Group__5 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1634:2: rule__UserDefinedCommand__Group__4__Impl rule__UserDefinedCommand__Group__5
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__4__Impl_in_rule__UserDefinedCommand__Group__43326);
            rule__UserDefinedCommand__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__5_in_rule__UserDefinedCommand__Group__43329);
            rule__UserDefinedCommand__Group__5();

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
    // $ANTLR end "rule__UserDefinedCommand__Group__4"


    // $ANTLR start "rule__UserDefinedCommand__Group__4__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1641:1: rule__UserDefinedCommand__Group__4__Impl : ( 'BEGIN' ) ;
    public final void rule__UserDefinedCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1645:1: ( ( 'BEGIN' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1646:1: ( 'BEGIN' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1646:1: ( 'BEGIN' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1647:1: 'BEGIN'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getBEGINKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__UserDefinedCommand__Group__4__Impl3357); 
             after(grammarAccess.getUserDefinedCommandAccess().getBEGINKeyword_4()); 

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
    // $ANTLR end "rule__UserDefinedCommand__Group__4__Impl"


    // $ANTLR start "rule__UserDefinedCommand__Group__5"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1660:1: rule__UserDefinedCommand__Group__5 : rule__UserDefinedCommand__Group__5__Impl rule__UserDefinedCommand__Group__6 ;
    public final void rule__UserDefinedCommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1664:1: ( rule__UserDefinedCommand__Group__5__Impl rule__UserDefinedCommand__Group__6 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1665:2: rule__UserDefinedCommand__Group__5__Impl rule__UserDefinedCommand__Group__6
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__5__Impl_in_rule__UserDefinedCommand__Group__53388);
            rule__UserDefinedCommand__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__6_in_rule__UserDefinedCommand__Group__53391);
            rule__UserDefinedCommand__Group__6();

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
    // $ANTLR end "rule__UserDefinedCommand__Group__5"


    // $ANTLR start "rule__UserDefinedCommand__Group__5__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1672:1: rule__UserDefinedCommand__Group__5__Impl : ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* ) ;
    public final void rule__UserDefinedCommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1676:1: ( ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1677:1: ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1677:1: ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1678:1: ( rule__UserDefinedCommand__StatementsAssignment_5 )*
            {
             before(grammarAccess.getUserDefinedCommandAccess().getStatementsAssignment_5()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1679:1: ( rule__UserDefinedCommand__StatementsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=15 && LA11_0<=20)||LA11_0==38||LA11_0==44||LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1679:2: rule__UserDefinedCommand__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__UserDefinedCommand__StatementsAssignment_5_in_rule__UserDefinedCommand__Group__5__Impl3418);
            	    rule__UserDefinedCommand__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getUserDefinedCommandAccess().getStatementsAssignment_5()); 

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
    // $ANTLR end "rule__UserDefinedCommand__Group__5__Impl"


    // $ANTLR start "rule__UserDefinedCommand__Group__6"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1689:1: rule__UserDefinedCommand__Group__6 : rule__UserDefinedCommand__Group__6__Impl ;
    public final void rule__UserDefinedCommand__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1693:1: ( rule__UserDefinedCommand__Group__6__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1694:2: rule__UserDefinedCommand__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__6__Impl_in_rule__UserDefinedCommand__Group__63449);
            rule__UserDefinedCommand__Group__6__Impl();

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
    // $ANTLR end "rule__UserDefinedCommand__Group__6"


    // $ANTLR start "rule__UserDefinedCommand__Group__6__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1700:1: rule__UserDefinedCommand__Group__6__Impl : ( 'END' ) ;
    public final void rule__UserDefinedCommand__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1704:1: ( ( 'END' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1705:1: ( 'END' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1705:1: ( 'END' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1706:1: 'END'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getENDKeyword_6()); 
            match(input,35,FOLLOW_35_in_rule__UserDefinedCommand__Group__6__Impl3477); 
             after(grammarAccess.getUserDefinedCommandAccess().getENDKeyword_6()); 

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
    // $ANTLR end "rule__UserDefinedCommand__Group__6__Impl"


    // $ANTLR start "rule__Main__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1733:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1737:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1738:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__03522);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__1_in_rule__Main__Group__03525);
            rule__Main__Group__1();

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
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1745:1: rule__Main__Group__0__Impl : ( () ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1749:1: ( ( () ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1750:1: ( () )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1750:1: ( () )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1751:1: ()
            {
             before(grammarAccess.getMainAccess().getMainAction_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1752:1: ()
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1754:1: 
            {
            }

             after(grammarAccess.getMainAccess().getMainAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1764:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1768:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1769:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__13583);
            rule__Main__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__2_in_rule__Main__Group__13586);
            rule__Main__Group__2();

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
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1776:1: rule__Main__Group__1__Impl : ( 'BEGIN-MAIN' ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1780:1: ( ( 'BEGIN-MAIN' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1781:1: ( 'BEGIN-MAIN' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1781:1: ( 'BEGIN-MAIN' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1782:1: 'BEGIN-MAIN'
            {
             before(grammarAccess.getMainAccess().getBEGINMAINKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Main__Group__1__Impl3614); 
             after(grammarAccess.getMainAccess().getBEGINMAINKeyword_1()); 

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
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1795:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1799:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1800:2: rule__Main__Group__2__Impl rule__Main__Group__3
            {
            pushFollow(FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__23645);
            rule__Main__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__3_in_rule__Main__Group__23648);
            rule__Main__Group__3();

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
    // $ANTLR end "rule__Main__Group__2"


    // $ANTLR start "rule__Main__Group__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1807:1: rule__Main__Group__2__Impl : ( ( rule__Main__StatementsAssignment_2 )* ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1811:1: ( ( ( rule__Main__StatementsAssignment_2 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1812:1: ( ( rule__Main__StatementsAssignment_2 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1812:1: ( ( rule__Main__StatementsAssignment_2 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1813:1: ( rule__Main__StatementsAssignment_2 )*
            {
             before(grammarAccess.getMainAccess().getStatementsAssignment_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1814:1: ( rule__Main__StatementsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=15 && LA12_0<=20)||LA12_0==38||LA12_0==44||LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1814:2: rule__Main__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Main__StatementsAssignment_2_in_rule__Main__Group__2__Impl3675);
            	    rule__Main__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getStatementsAssignment_2()); 

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
    // $ANTLR end "rule__Main__Group__2__Impl"


    // $ANTLR start "rule__Main__Group__3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1824:1: rule__Main__Group__3 : rule__Main__Group__3__Impl ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1828:1: ( rule__Main__Group__3__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1829:2: rule__Main__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__33706);
            rule__Main__Group__3__Impl();

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
    // $ANTLR end "rule__Main__Group__3"


    // $ANTLR start "rule__Main__Group__3__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1835:1: rule__Main__Group__3__Impl : ( 'END-MAIN' ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1839:1: ( ( 'END-MAIN' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1840:1: ( 'END-MAIN' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1840:1: ( 'END-MAIN' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1841:1: 'END-MAIN'
            {
             before(grammarAccess.getMainAccess().getENDMAINKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__Main__Group__3__Impl3734); 
             after(grammarAccess.getMainAccess().getENDMAINKeyword_3()); 

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
    // $ANTLR end "rule__Main__Group__3__Impl"


    // $ANTLR start "rule__UserDefinedCommandStatement__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1862:1: rule__UserDefinedCommandStatement__Group__0 : rule__UserDefinedCommandStatement__Group__0__Impl rule__UserDefinedCommandStatement__Group__1 ;
    public final void rule__UserDefinedCommandStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1866:1: ( rule__UserDefinedCommandStatement__Group__0__Impl rule__UserDefinedCommandStatement__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1867:2: rule__UserDefinedCommandStatement__Group__0__Impl rule__UserDefinedCommandStatement__Group__1
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__0__Impl_in_rule__UserDefinedCommandStatement__Group__03773);
            rule__UserDefinedCommandStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__1_in_rule__UserDefinedCommandStatement__Group__03776);
            rule__UserDefinedCommandStatement__Group__1();

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
    // $ANTLR end "rule__UserDefinedCommandStatement__Group__0"


    // $ANTLR start "rule__UserDefinedCommandStatement__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1874:1: rule__UserDefinedCommandStatement__Group__0__Impl : ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) ) ;
    public final void rule__UserDefinedCommandStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1878:1: ( ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1879:1: ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1879:1: ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1880:1: ( rule__UserDefinedCommandStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getCommandAssignment_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1881:1: ( rule__UserDefinedCommandStatement__CommandAssignment_0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1881:2: rule__UserDefinedCommandStatement__CommandAssignment_0
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__CommandAssignment_0_in_rule__UserDefinedCommandStatement__Group__0__Impl3803);
            rule__UserDefinedCommandStatement__CommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUserDefinedCommandStatementAccess().getCommandAssignment_0()); 

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
    // $ANTLR end "rule__UserDefinedCommandStatement__Group__0__Impl"


    // $ANTLR start "rule__UserDefinedCommandStatement__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1891:1: rule__UserDefinedCommandStatement__Group__1 : rule__UserDefinedCommandStatement__Group__1__Impl ;
    public final void rule__UserDefinedCommandStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1895:1: ( rule__UserDefinedCommandStatement__Group__1__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1896:2: rule__UserDefinedCommandStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__1__Impl_in_rule__UserDefinedCommandStatement__Group__13833);
            rule__UserDefinedCommandStatement__Group__1__Impl();

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
    // $ANTLR end "rule__UserDefinedCommandStatement__Group__1"


    // $ANTLR start "rule__UserDefinedCommandStatement__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1902:1: rule__UserDefinedCommandStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__UserDefinedCommandStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1906:1: ( ( ';' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1907:1: ( ';' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1907:1: ( ';' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1908:1: ';'
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getSemicolonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__UserDefinedCommandStatement__Group__1__Impl3861); 
             after(grammarAccess.getUserDefinedCommandStatementAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__UserDefinedCommandStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1925:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1929:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1930:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__0__Impl_in_rule__IfStatement__Group__03896);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__1_in_rule__IfStatement__Group__03899);
            rule__IfStatement__Group__1();

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
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1937:1: rule__IfStatement__Group__0__Impl : ( 'IF' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1941:1: ( ( 'IF' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1942:1: ( 'IF' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1942:1: ( 'IF' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1943:1: 'IF'
            {
             before(grammarAccess.getIfStatementAccess().getIFKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__IfStatement__Group__0__Impl3927); 
             after(grammarAccess.getIfStatementAccess().getIFKeyword_0()); 

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
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1956:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1960:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1961:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__1__Impl_in_rule__IfStatement__Group__13958);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__2_in_rule__IfStatement__Group__13961);
            rule__IfStatement__Group__2();

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
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1968:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1972:1: ( ( '(' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1973:1: ( '(' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1973:1: ( '(' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1974:1: '('
            {
             before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__IfStatement__Group__1__Impl3989); 
             after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1987:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1991:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1992:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__2__Impl_in_rule__IfStatement__Group__24020);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__3_in_rule__IfStatement__Group__24023);
            rule__IfStatement__Group__3();

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
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1999:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__ConditionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2003:1: ( ( ( rule__IfStatement__ConditionAssignment_2 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2004:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2004:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2005:1: ( rule__IfStatement__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2006:1: ( rule__IfStatement__ConditionAssignment_2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2006:2: rule__IfStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__IfStatement__ConditionAssignment_2_in_rule__IfStatement__Group__2__Impl4050);
            rule__IfStatement__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getConditionAssignment_2()); 

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
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2016:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2020:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2021:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__3__Impl_in_rule__IfStatement__Group__34080);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__4_in_rule__IfStatement__Group__34083);
            rule__IfStatement__Group__4();

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
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2028:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2032:1: ( ( ')' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2033:1: ( ')' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2033:1: ( ')' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2034:1: ')'
            {
             before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__IfStatement__Group__3__Impl4111); 
             after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2047:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2051:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2052:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__4__Impl_in_rule__IfStatement__Group__44142);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__5_in_rule__IfStatement__Group__44145);
            rule__IfStatement__Group__5();

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
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2059:1: rule__IfStatement__Group__4__Impl : ( '{' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2063:1: ( ( '{' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2064:1: ( '{' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2064:1: ( '{' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2065:1: '{'
            {
             before(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__IfStatement__Group__4__Impl4173); 
             after(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2078:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2082:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2083:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__5__Impl_in_rule__IfStatement__Group__54204);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__6_in_rule__IfStatement__Group__54207);
            rule__IfStatement__Group__6();

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
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2090:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__StatementsAssignment_5 )* ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2094:1: ( ( ( rule__IfStatement__StatementsAssignment_5 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2095:1: ( ( rule__IfStatement__StatementsAssignment_5 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2095:1: ( ( rule__IfStatement__StatementsAssignment_5 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2096:1: ( rule__IfStatement__StatementsAssignment_5 )*
            {
             before(grammarAccess.getIfStatementAccess().getStatementsAssignment_5()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2097:1: ( rule__IfStatement__StatementsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=15 && LA13_0<=20)||LA13_0==38||LA13_0==44||LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2097:2: rule__IfStatement__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__IfStatement__StatementsAssignment_5_in_rule__IfStatement__Group__5__Impl4234);
            	    rule__IfStatement__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getStatementsAssignment_5()); 

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
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group__6"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2107:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7 ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2111:1: ( rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2112:2: rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__6__Impl_in_rule__IfStatement__Group__64265);
            rule__IfStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__7_in_rule__IfStatement__Group__64268);
            rule__IfStatement__Group__7();

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
    // $ANTLR end "rule__IfStatement__Group__6"


    // $ANTLR start "rule__IfStatement__Group__6__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2119:1: rule__IfStatement__Group__6__Impl : ( '}' ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2123:1: ( ( '}' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2124:1: ( '}' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2124:1: ( '}' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2125:1: '}'
            {
             before(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__IfStatement__Group__6__Impl4296); 
             after(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__IfStatement__Group__6__Impl"


    // $ANTLR start "rule__IfStatement__Group__7"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2138:1: rule__IfStatement__Group__7 : rule__IfStatement__Group__7__Impl ;
    public final void rule__IfStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2142:1: ( rule__IfStatement__Group__7__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2143:2: rule__IfStatement__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__7__Impl_in_rule__IfStatement__Group__74327);
            rule__IfStatement__Group__7__Impl();

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
    // $ANTLR end "rule__IfStatement__Group__7"


    // $ANTLR start "rule__IfStatement__Group__7__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2149:1: rule__IfStatement__Group__7__Impl : ( ( rule__IfStatement__Group_7__0 )? ) ;
    public final void rule__IfStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2153:1: ( ( ( rule__IfStatement__Group_7__0 )? ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2154:1: ( ( rule__IfStatement__Group_7__0 )? )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2154:1: ( ( rule__IfStatement__Group_7__0 )? )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2155:1: ( rule__IfStatement__Group_7__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_7()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2156:1: ( rule__IfStatement__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2156:2: rule__IfStatement__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_7__0_in_rule__IfStatement__Group__7__Impl4354);
                    rule__IfStatement__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfStatementAccess().getGroup_7()); 

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
    // $ANTLR end "rule__IfStatement__Group__7__Impl"


    // $ANTLR start "rule__IfStatement__Group_7__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2182:1: rule__IfStatement__Group_7__0 : rule__IfStatement__Group_7__0__Impl rule__IfStatement__Group_7__1 ;
    public final void rule__IfStatement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2186:1: ( rule__IfStatement__Group_7__0__Impl rule__IfStatement__Group_7__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2187:2: rule__IfStatement__Group_7__0__Impl rule__IfStatement__Group_7__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__0__Impl_in_rule__IfStatement__Group_7__04401);
            rule__IfStatement__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_7__1_in_rule__IfStatement__Group_7__04404);
            rule__IfStatement__Group_7__1();

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
    // $ANTLR end "rule__IfStatement__Group_7__0"


    // $ANTLR start "rule__IfStatement__Group_7__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2194:1: rule__IfStatement__Group_7__0__Impl : ( 'ELSE' ) ;
    public final void rule__IfStatement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2198:1: ( ( 'ELSE' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2199:1: ( 'ELSE' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2199:1: ( 'ELSE' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2200:1: 'ELSE'
            {
             before(grammarAccess.getIfStatementAccess().getELSEKeyword_7_0()); 
            match(input,43,FOLLOW_43_in_rule__IfStatement__Group_7__0__Impl4432); 
             after(grammarAccess.getIfStatementAccess().getELSEKeyword_7_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_7__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_7__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2213:1: rule__IfStatement__Group_7__1 : rule__IfStatement__Group_7__1__Impl rule__IfStatement__Group_7__2 ;
    public final void rule__IfStatement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2217:1: ( rule__IfStatement__Group_7__1__Impl rule__IfStatement__Group_7__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2218:2: rule__IfStatement__Group_7__1__Impl rule__IfStatement__Group_7__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__1__Impl_in_rule__IfStatement__Group_7__14463);
            rule__IfStatement__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_7__2_in_rule__IfStatement__Group_7__14466);
            rule__IfStatement__Group_7__2();

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
    // $ANTLR end "rule__IfStatement__Group_7__1"


    // $ANTLR start "rule__IfStatement__Group_7__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2225:1: rule__IfStatement__Group_7__1__Impl : ( '{' ) ;
    public final void rule__IfStatement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2229:1: ( ( '{' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2230:1: ( '{' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2230:1: ( '{' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2231:1: '{'
            {
             before(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,41,FOLLOW_41_in_rule__IfStatement__Group_7__1__Impl4494); 
             after(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_7__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_7__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2244:1: rule__IfStatement__Group_7__2 : rule__IfStatement__Group_7__2__Impl rule__IfStatement__Group_7__3 ;
    public final void rule__IfStatement__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2248:1: ( rule__IfStatement__Group_7__2__Impl rule__IfStatement__Group_7__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2249:2: rule__IfStatement__Group_7__2__Impl rule__IfStatement__Group_7__3
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__2__Impl_in_rule__IfStatement__Group_7__24525);
            rule__IfStatement__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_7__3_in_rule__IfStatement__Group_7__24528);
            rule__IfStatement__Group_7__3();

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
    // $ANTLR end "rule__IfStatement__Group_7__2"


    // $ANTLR start "rule__IfStatement__Group_7__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2256:1: rule__IfStatement__Group_7__2__Impl : ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* ) ;
    public final void rule__IfStatement__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2260:1: ( ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2261:1: ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2261:1: ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2262:1: ( rule__IfStatement__ElseStatementsAssignment_7_2 )*
            {
             before(grammarAccess.getIfStatementAccess().getElseStatementsAssignment_7_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2263:1: ( rule__IfStatement__ElseStatementsAssignment_7_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=15 && LA15_0<=20)||LA15_0==38||LA15_0==44||LA15_0==46) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2263:2: rule__IfStatement__ElseStatementsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__IfStatement__ElseStatementsAssignment_7_2_in_rule__IfStatement__Group_7__2__Impl4555);
            	    rule__IfStatement__ElseStatementsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getElseStatementsAssignment_7_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_7__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_7__3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2273:1: rule__IfStatement__Group_7__3 : rule__IfStatement__Group_7__3__Impl ;
    public final void rule__IfStatement__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2277:1: ( rule__IfStatement__Group_7__3__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2278:2: rule__IfStatement__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__3__Impl_in_rule__IfStatement__Group_7__34586);
            rule__IfStatement__Group_7__3__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_7__3"


    // $ANTLR start "rule__IfStatement__Group_7__3__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2284:1: rule__IfStatement__Group_7__3__Impl : ( '}' ) ;
    public final void rule__IfStatement__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2288:1: ( ( '}' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2289:1: ( '}' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2289:1: ( '}' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2290:1: '}'
            {
             before(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,42,FOLLOW_42_in_rule__IfStatement__Group_7__3__Impl4614); 
             after(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__IfStatement__Group_7__3__Impl"


    // $ANTLR start "rule__IterateStatement__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2311:1: rule__IterateStatement__Group__0 : rule__IterateStatement__Group__0__Impl rule__IterateStatement__Group__1 ;
    public final void rule__IterateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2315:1: ( rule__IterateStatement__Group__0__Impl rule__IterateStatement__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2316:2: rule__IterateStatement__Group__0__Impl rule__IterateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__0__Impl_in_rule__IterateStatement__Group__04653);
            rule__IterateStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__1_in_rule__IterateStatement__Group__04656);
            rule__IterateStatement__Group__1();

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
    // $ANTLR end "rule__IterateStatement__Group__0"


    // $ANTLR start "rule__IterateStatement__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2323:1: rule__IterateStatement__Group__0__Impl : ( 'ITERATE' ) ;
    public final void rule__IterateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2327:1: ( ( 'ITERATE' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2328:1: ( 'ITERATE' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2328:1: ( 'ITERATE' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2329:1: 'ITERATE'
            {
             before(grammarAccess.getIterateStatementAccess().getITERATEKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__IterateStatement__Group__0__Impl4684); 
             after(grammarAccess.getIterateStatementAccess().getITERATEKeyword_0()); 

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
    // $ANTLR end "rule__IterateStatement__Group__0__Impl"


    // $ANTLR start "rule__IterateStatement__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2342:1: rule__IterateStatement__Group__1 : rule__IterateStatement__Group__1__Impl rule__IterateStatement__Group__2 ;
    public final void rule__IterateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2346:1: ( rule__IterateStatement__Group__1__Impl rule__IterateStatement__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2347:2: rule__IterateStatement__Group__1__Impl rule__IterateStatement__Group__2
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__1__Impl_in_rule__IterateStatement__Group__14715);
            rule__IterateStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__2_in_rule__IterateStatement__Group__14718);
            rule__IterateStatement__Group__2();

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
    // $ANTLR end "rule__IterateStatement__Group__1"


    // $ANTLR start "rule__IterateStatement__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2354:1: rule__IterateStatement__Group__1__Impl : ( ( rule__IterateStatement__TimesAssignment_1 ) ) ;
    public final void rule__IterateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2358:1: ( ( ( rule__IterateStatement__TimesAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2359:1: ( ( rule__IterateStatement__TimesAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2359:1: ( ( rule__IterateStatement__TimesAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2360:1: ( rule__IterateStatement__TimesAssignment_1 )
            {
             before(grammarAccess.getIterateStatementAccess().getTimesAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2361:1: ( rule__IterateStatement__TimesAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2361:2: rule__IterateStatement__TimesAssignment_1
            {
            pushFollow(FOLLOW_rule__IterateStatement__TimesAssignment_1_in_rule__IterateStatement__Group__1__Impl4745);
            rule__IterateStatement__TimesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIterateStatementAccess().getTimesAssignment_1()); 

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
    // $ANTLR end "rule__IterateStatement__Group__1__Impl"


    // $ANTLR start "rule__IterateStatement__Group__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2371:1: rule__IterateStatement__Group__2 : rule__IterateStatement__Group__2__Impl rule__IterateStatement__Group__3 ;
    public final void rule__IterateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2375:1: ( rule__IterateStatement__Group__2__Impl rule__IterateStatement__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2376:2: rule__IterateStatement__Group__2__Impl rule__IterateStatement__Group__3
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__2__Impl_in_rule__IterateStatement__Group__24775);
            rule__IterateStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__3_in_rule__IterateStatement__Group__24778);
            rule__IterateStatement__Group__3();

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
    // $ANTLR end "rule__IterateStatement__Group__2"


    // $ANTLR start "rule__IterateStatement__Group__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2383:1: rule__IterateStatement__Group__2__Impl : ( 'TIMES' ) ;
    public final void rule__IterateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2387:1: ( ( 'TIMES' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2388:1: ( 'TIMES' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2388:1: ( 'TIMES' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2389:1: 'TIMES'
            {
             before(grammarAccess.getIterateStatementAccess().getTIMESKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__IterateStatement__Group__2__Impl4806); 
             after(grammarAccess.getIterateStatementAccess().getTIMESKeyword_2()); 

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
    // $ANTLR end "rule__IterateStatement__Group__2__Impl"


    // $ANTLR start "rule__IterateStatement__Group__3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2402:1: rule__IterateStatement__Group__3 : rule__IterateStatement__Group__3__Impl rule__IterateStatement__Group__4 ;
    public final void rule__IterateStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2406:1: ( rule__IterateStatement__Group__3__Impl rule__IterateStatement__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2407:2: rule__IterateStatement__Group__3__Impl rule__IterateStatement__Group__4
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__3__Impl_in_rule__IterateStatement__Group__34837);
            rule__IterateStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__4_in_rule__IterateStatement__Group__34840);
            rule__IterateStatement__Group__4();

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
    // $ANTLR end "rule__IterateStatement__Group__3"


    // $ANTLR start "rule__IterateStatement__Group__3__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2414:1: rule__IterateStatement__Group__3__Impl : ( '{' ) ;
    public final void rule__IterateStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2418:1: ( ( '{' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2419:1: ( '{' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2419:1: ( '{' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2420:1: '{'
            {
             before(grammarAccess.getIterateStatementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__IterateStatement__Group__3__Impl4868); 
             after(grammarAccess.getIterateStatementAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__IterateStatement__Group__3__Impl"


    // $ANTLR start "rule__IterateStatement__Group__4"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2433:1: rule__IterateStatement__Group__4 : rule__IterateStatement__Group__4__Impl rule__IterateStatement__Group__5 ;
    public final void rule__IterateStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2437:1: ( rule__IterateStatement__Group__4__Impl rule__IterateStatement__Group__5 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2438:2: rule__IterateStatement__Group__4__Impl rule__IterateStatement__Group__5
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__4__Impl_in_rule__IterateStatement__Group__44899);
            rule__IterateStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__5_in_rule__IterateStatement__Group__44902);
            rule__IterateStatement__Group__5();

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
    // $ANTLR end "rule__IterateStatement__Group__4"


    // $ANTLR start "rule__IterateStatement__Group__4__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2445:1: rule__IterateStatement__Group__4__Impl : ( ( rule__IterateStatement__StatementsAssignment_4 ) ) ;
    public final void rule__IterateStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2449:1: ( ( ( rule__IterateStatement__StatementsAssignment_4 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2450:1: ( ( rule__IterateStatement__StatementsAssignment_4 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2450:1: ( ( rule__IterateStatement__StatementsAssignment_4 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2451:1: ( rule__IterateStatement__StatementsAssignment_4 )
            {
             before(grammarAccess.getIterateStatementAccess().getStatementsAssignment_4()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2452:1: ( rule__IterateStatement__StatementsAssignment_4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2452:2: rule__IterateStatement__StatementsAssignment_4
            {
            pushFollow(FOLLOW_rule__IterateStatement__StatementsAssignment_4_in_rule__IterateStatement__Group__4__Impl4929);
            rule__IterateStatement__StatementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIterateStatementAccess().getStatementsAssignment_4()); 

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
    // $ANTLR end "rule__IterateStatement__Group__4__Impl"


    // $ANTLR start "rule__IterateStatement__Group__5"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2462:1: rule__IterateStatement__Group__5 : rule__IterateStatement__Group__5__Impl ;
    public final void rule__IterateStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2466:1: ( rule__IterateStatement__Group__5__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2467:2: rule__IterateStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__5__Impl_in_rule__IterateStatement__Group__54959);
            rule__IterateStatement__Group__5__Impl();

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
    // $ANTLR end "rule__IterateStatement__Group__5"


    // $ANTLR start "rule__IterateStatement__Group__5__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2473:1: rule__IterateStatement__Group__5__Impl : ( '}' ) ;
    public final void rule__IterateStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2477:1: ( ( '}' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2478:1: ( '}' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2478:1: ( '}' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2479:1: '}'
            {
             before(grammarAccess.getIterateStatementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__IterateStatement__Group__5__Impl4987); 
             after(grammarAccess.getIterateStatementAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__IterateStatement__Group__5__Impl"


    // $ANTLR start "rule__WhileStatement__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2504:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2508:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2509:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__0__Impl_in_rule__WhileStatement__Group__05030);
            rule__WhileStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__1_in_rule__WhileStatement__Group__05033);
            rule__WhileStatement__Group__1();

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
    // $ANTLR end "rule__WhileStatement__Group__0"


    // $ANTLR start "rule__WhileStatement__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2516:1: rule__WhileStatement__Group__0__Impl : ( 'WHILE' ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2520:1: ( ( 'WHILE' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2521:1: ( 'WHILE' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2521:1: ( 'WHILE' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2522:1: 'WHILE'
            {
             before(grammarAccess.getWhileStatementAccess().getWHILEKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__WhileStatement__Group__0__Impl5061); 
             after(grammarAccess.getWhileStatementAccess().getWHILEKeyword_0()); 

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
    // $ANTLR end "rule__WhileStatement__Group__0__Impl"


    // $ANTLR start "rule__WhileStatement__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2535:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2539:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2540:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__1__Impl_in_rule__WhileStatement__Group__15092);
            rule__WhileStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__2_in_rule__WhileStatement__Group__15095);
            rule__WhileStatement__Group__2();

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
    // $ANTLR end "rule__WhileStatement__Group__1"


    // $ANTLR start "rule__WhileStatement__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2547:1: rule__WhileStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2551:1: ( ( '(' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2552:1: ( '(' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2552:1: ( '(' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2553:1: '('
            {
             before(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__WhileStatement__Group__1__Impl5123); 
             after(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__WhileStatement__Group__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2566:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2570:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2571:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__2__Impl_in_rule__WhileStatement__Group__25154);
            rule__WhileStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__3_in_rule__WhileStatement__Group__25157);
            rule__WhileStatement__Group__3();

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
    // $ANTLR end "rule__WhileStatement__Group__2"


    // $ANTLR start "rule__WhileStatement__Group__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2578:1: rule__WhileStatement__Group__2__Impl : ( ( rule__WhileStatement__ConditionAssignment_2 ) ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2582:1: ( ( ( rule__WhileStatement__ConditionAssignment_2 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2583:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2583:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2584:1: ( rule__WhileStatement__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhileStatementAccess().getConditionAssignment_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2585:1: ( rule__WhileStatement__ConditionAssignment_2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2585:2: rule__WhileStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__WhileStatement__ConditionAssignment_2_in_rule__WhileStatement__Group__2__Impl5184);
            rule__WhileStatement__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileStatementAccess().getConditionAssignment_2()); 

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
    // $ANTLR end "rule__WhileStatement__Group__2__Impl"


    // $ANTLR start "rule__WhileStatement__Group__3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2595:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2599:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2600:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__3__Impl_in_rule__WhileStatement__Group__35214);
            rule__WhileStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__4_in_rule__WhileStatement__Group__35217);
            rule__WhileStatement__Group__4();

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
    // $ANTLR end "rule__WhileStatement__Group__3"


    // $ANTLR start "rule__WhileStatement__Group__3__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2607:1: rule__WhileStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2611:1: ( ( ')' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2612:1: ( ')' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2612:1: ( ')' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2613:1: ')'
            {
             before(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__WhileStatement__Group__3__Impl5245); 
             after(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__WhileStatement__Group__3__Impl"


    // $ANTLR start "rule__WhileStatement__Group__4"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2626:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5 ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2630:1: ( rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2631:2: rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__4__Impl_in_rule__WhileStatement__Group__45276);
            rule__WhileStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__5_in_rule__WhileStatement__Group__45279);
            rule__WhileStatement__Group__5();

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
    // $ANTLR end "rule__WhileStatement__Group__4"


    // $ANTLR start "rule__WhileStatement__Group__4__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2638:1: rule__WhileStatement__Group__4__Impl : ( '{' ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2642:1: ( ( '{' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2643:1: ( '{' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2643:1: ( '{' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2644:1: '{'
            {
             before(grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__WhileStatement__Group__4__Impl5307); 
             after(grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__WhileStatement__Group__4__Impl"


    // $ANTLR start "rule__WhileStatement__Group__5"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2657:1: rule__WhileStatement__Group__5 : rule__WhileStatement__Group__5__Impl rule__WhileStatement__Group__6 ;
    public final void rule__WhileStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2661:1: ( rule__WhileStatement__Group__5__Impl rule__WhileStatement__Group__6 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2662:2: rule__WhileStatement__Group__5__Impl rule__WhileStatement__Group__6
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__5__Impl_in_rule__WhileStatement__Group__55338);
            rule__WhileStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__6_in_rule__WhileStatement__Group__55341);
            rule__WhileStatement__Group__6();

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
    // $ANTLR end "rule__WhileStatement__Group__5"


    // $ANTLR start "rule__WhileStatement__Group__5__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2669:1: rule__WhileStatement__Group__5__Impl : ( ( rule__WhileStatement__StatementsAssignment_5 ) ) ;
    public final void rule__WhileStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2673:1: ( ( ( rule__WhileStatement__StatementsAssignment_5 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2674:1: ( ( rule__WhileStatement__StatementsAssignment_5 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2674:1: ( ( rule__WhileStatement__StatementsAssignment_5 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2675:1: ( rule__WhileStatement__StatementsAssignment_5 )
            {
             before(grammarAccess.getWhileStatementAccess().getStatementsAssignment_5()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2676:1: ( rule__WhileStatement__StatementsAssignment_5 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2676:2: rule__WhileStatement__StatementsAssignment_5
            {
            pushFollow(FOLLOW_rule__WhileStatement__StatementsAssignment_5_in_rule__WhileStatement__Group__5__Impl5368);
            rule__WhileStatement__StatementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWhileStatementAccess().getStatementsAssignment_5()); 

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
    // $ANTLR end "rule__WhileStatement__Group__5__Impl"


    // $ANTLR start "rule__WhileStatement__Group__6"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2686:1: rule__WhileStatement__Group__6 : rule__WhileStatement__Group__6__Impl ;
    public final void rule__WhileStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2690:1: ( rule__WhileStatement__Group__6__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2691:2: rule__WhileStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__6__Impl_in_rule__WhileStatement__Group__65398);
            rule__WhileStatement__Group__6__Impl();

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
    // $ANTLR end "rule__WhileStatement__Group__6"


    // $ANTLR start "rule__WhileStatement__Group__6__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2697:1: rule__WhileStatement__Group__6__Impl : ( '}' ) ;
    public final void rule__WhileStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2701:1: ( ( '}' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2702:1: ( '}' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2702:1: ( '}' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2703:1: '}'
            {
             before(grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__WhileStatement__Group__6__Impl5426); 
             after(grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__WhileStatement__Group__6__Impl"


    // $ANTLR start "rule__DocumentationComment__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2730:1: rule__DocumentationComment__Group__0 : rule__DocumentationComment__Group__0__Impl rule__DocumentationComment__Group__1 ;
    public final void rule__DocumentationComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2734:1: ( rule__DocumentationComment__Group__0__Impl rule__DocumentationComment__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2735:2: rule__DocumentationComment__Group__0__Impl rule__DocumentationComment__Group__1
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__0__Impl_in_rule__DocumentationComment__Group__05471);
            rule__DocumentationComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DocumentationComment__Group__1_in_rule__DocumentationComment__Group__05474);
            rule__DocumentationComment__Group__1();

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
    // $ANTLR end "rule__DocumentationComment__Group__0"


    // $ANTLR start "rule__DocumentationComment__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2742:1: rule__DocumentationComment__Group__0__Impl : ( '@(' ) ;
    public final void rule__DocumentationComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2746:1: ( ( '@(' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2747:1: ( '@(' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2747:1: ( '@(' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2748:1: '@('
            {
             before(grammarAccess.getDocumentationCommentAccess().getCommercialAtLeftParenthesisKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__DocumentationComment__Group__0__Impl5502); 
             after(grammarAccess.getDocumentationCommentAccess().getCommercialAtLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__DocumentationComment__Group__0__Impl"


    // $ANTLR start "rule__DocumentationComment__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2761:1: rule__DocumentationComment__Group__1 : rule__DocumentationComment__Group__1__Impl rule__DocumentationComment__Group__2 ;
    public final void rule__DocumentationComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2765:1: ( rule__DocumentationComment__Group__1__Impl rule__DocumentationComment__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2766:2: rule__DocumentationComment__Group__1__Impl rule__DocumentationComment__Group__2
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__1__Impl_in_rule__DocumentationComment__Group__15533);
            rule__DocumentationComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DocumentationComment__Group__2_in_rule__DocumentationComment__Group__15536);
            rule__DocumentationComment__Group__2();

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
    // $ANTLR end "rule__DocumentationComment__Group__1"


    // $ANTLR start "rule__DocumentationComment__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2773:1: rule__DocumentationComment__Group__1__Impl : ( ( rule__DocumentationComment__TextAssignment_1 ) ) ;
    public final void rule__DocumentationComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2777:1: ( ( ( rule__DocumentationComment__TextAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2778:1: ( ( rule__DocumentationComment__TextAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2778:1: ( ( rule__DocumentationComment__TextAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2779:1: ( rule__DocumentationComment__TextAssignment_1 )
            {
             before(grammarAccess.getDocumentationCommentAccess().getTextAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2780:1: ( rule__DocumentationComment__TextAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2780:2: rule__DocumentationComment__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__DocumentationComment__TextAssignment_1_in_rule__DocumentationComment__Group__1__Impl5563);
            rule__DocumentationComment__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentationCommentAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__DocumentationComment__Group__1__Impl"


    // $ANTLR start "rule__DocumentationComment__Group__2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2790:1: rule__DocumentationComment__Group__2 : rule__DocumentationComment__Group__2__Impl ;
    public final void rule__DocumentationComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2794:1: ( rule__DocumentationComment__Group__2__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2795:2: rule__DocumentationComment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__2__Impl_in_rule__DocumentationComment__Group__25593);
            rule__DocumentationComment__Group__2__Impl();

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
    // $ANTLR end "rule__DocumentationComment__Group__2"


    // $ANTLR start "rule__DocumentationComment__Group__2__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2801:1: rule__DocumentationComment__Group__2__Impl : ( ')' ) ;
    public final void rule__DocumentationComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2805:1: ( ( ')' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2806:1: ( ')' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2806:1: ( ')' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2807:1: ')'
            {
             before(grammarAccess.getDocumentationCommentAccess().getRightParenthesisKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__DocumentationComment__Group__2__Impl5621); 
             after(grammarAccess.getDocumentationCommentAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__DocumentationComment__Group__2__Impl"


    // $ANTLR start "rule__CommandStatement__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2826:1: rule__CommandStatement__Group__0 : rule__CommandStatement__Group__0__Impl rule__CommandStatement__Group__1 ;
    public final void rule__CommandStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2830:1: ( rule__CommandStatement__Group__0__Impl rule__CommandStatement__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2831:2: rule__CommandStatement__Group__0__Impl rule__CommandStatement__Group__1
            {
            pushFollow(FOLLOW_rule__CommandStatement__Group__0__Impl_in_rule__CommandStatement__Group__05658);
            rule__CommandStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandStatement__Group__1_in_rule__CommandStatement__Group__05661);
            rule__CommandStatement__Group__1();

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
    // $ANTLR end "rule__CommandStatement__Group__0"


    // $ANTLR start "rule__CommandStatement__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2838:1: rule__CommandStatement__Group__0__Impl : ( ( rule__CommandStatement__KindAssignment_0 ) ) ;
    public final void rule__CommandStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2842:1: ( ( ( rule__CommandStatement__KindAssignment_0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2843:1: ( ( rule__CommandStatement__KindAssignment_0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2843:1: ( ( rule__CommandStatement__KindAssignment_0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2844:1: ( rule__CommandStatement__KindAssignment_0 )
            {
             before(grammarAccess.getCommandStatementAccess().getKindAssignment_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2845:1: ( rule__CommandStatement__KindAssignment_0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2845:2: rule__CommandStatement__KindAssignment_0
            {
            pushFollow(FOLLOW_rule__CommandStatement__KindAssignment_0_in_rule__CommandStatement__Group__0__Impl5688);
            rule__CommandStatement__KindAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandStatementAccess().getKindAssignment_0()); 

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
    // $ANTLR end "rule__CommandStatement__Group__0__Impl"


    // $ANTLR start "rule__CommandStatement__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2855:1: rule__CommandStatement__Group__1 : rule__CommandStatement__Group__1__Impl ;
    public final void rule__CommandStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2859:1: ( rule__CommandStatement__Group__1__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2860:2: rule__CommandStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CommandStatement__Group__1__Impl_in_rule__CommandStatement__Group__15718);
            rule__CommandStatement__Group__1__Impl();

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
    // $ANTLR end "rule__CommandStatement__Group__1"


    // $ANTLR start "rule__CommandStatement__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2866:1: rule__CommandStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__CommandStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2870:1: ( ( ';' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2871:1: ( ';' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2871:1: ( ';' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2872:1: ';'
            {
             before(grammarAccess.getCommandStatementAccess().getSemicolonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__CommandStatement__Group__1__Impl5746); 
             after(grammarAccess.getCommandStatementAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__CommandStatement__Group__1__Impl"


    // $ANTLR start "rule__ConditionExpr__Group__0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2889:1: rule__ConditionExpr__Group__0 : rule__ConditionExpr__Group__0__Impl rule__ConditionExpr__Group__1 ;
    public final void rule__ConditionExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2893:1: ( rule__ConditionExpr__Group__0__Impl rule__ConditionExpr__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2894:2: rule__ConditionExpr__Group__0__Impl rule__ConditionExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionExpr__Group__0__Impl_in_rule__ConditionExpr__Group__05781);
            rule__ConditionExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionExpr__Group__1_in_rule__ConditionExpr__Group__05784);
            rule__ConditionExpr__Group__1();

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
    // $ANTLR end "rule__ConditionExpr__Group__0"


    // $ANTLR start "rule__ConditionExpr__Group__0__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2901:1: rule__ConditionExpr__Group__0__Impl : ( ( rule__ConditionExpr__NegationAssignment_0 ) ) ;
    public final void rule__ConditionExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2905:1: ( ( ( rule__ConditionExpr__NegationAssignment_0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2906:1: ( ( rule__ConditionExpr__NegationAssignment_0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2906:1: ( ( rule__ConditionExpr__NegationAssignment_0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2907:1: ( rule__ConditionExpr__NegationAssignment_0 )
            {
             before(grammarAccess.getConditionExprAccess().getNegationAssignment_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2908:1: ( rule__ConditionExpr__NegationAssignment_0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2908:2: rule__ConditionExpr__NegationAssignment_0
            {
            pushFollow(FOLLOW_rule__ConditionExpr__NegationAssignment_0_in_rule__ConditionExpr__Group__0__Impl5811);
            rule__ConditionExpr__NegationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionExprAccess().getNegationAssignment_0()); 

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
    // $ANTLR end "rule__ConditionExpr__Group__0__Impl"


    // $ANTLR start "rule__ConditionExpr__Group__1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2918:1: rule__ConditionExpr__Group__1 : rule__ConditionExpr__Group__1__Impl ;
    public final void rule__ConditionExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2922:1: ( rule__ConditionExpr__Group__1__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2923:2: rule__ConditionExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionExpr__Group__1__Impl_in_rule__ConditionExpr__Group__15841);
            rule__ConditionExpr__Group__1__Impl();

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
    // $ANTLR end "rule__ConditionExpr__Group__1"


    // $ANTLR start "rule__ConditionExpr__Group__1__Impl"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2929:1: rule__ConditionExpr__Group__1__Impl : ( ( rule__ConditionExpr__ExprAssignment_1 ) ) ;
    public final void rule__ConditionExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2933:1: ( ( ( rule__ConditionExpr__ExprAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2934:1: ( ( rule__ConditionExpr__ExprAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2934:1: ( ( rule__ConditionExpr__ExprAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2935:1: ( rule__ConditionExpr__ExprAssignment_1 )
            {
             before(grammarAccess.getConditionExprAccess().getExprAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2936:1: ( rule__ConditionExpr__ExprAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2936:2: rule__ConditionExpr__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionExpr__ExprAssignment_1_in_rule__ConditionExpr__Group__1__Impl5868);
            rule__ConditionExpr__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionExprAccess().getExprAssignment_1()); 

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
    // $ANTLR end "rule__ConditionExpr__Group__1__Impl"


    // $ANTLR start "rule__Program__InitSectionAssignment_1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2951:1: rule__Program__InitSectionAssignment_1 : ( ruleInitSection ) ;
    public final void rule__Program__InitSectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2955:1: ( ( ruleInitSection ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2956:1: ( ruleInitSection )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2956:1: ( ruleInitSection )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2957:1: ruleInitSection
            {
             before(grammarAccess.getProgramAccess().getInitSectionInitSectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInitSection_in_rule__Program__InitSectionAssignment_15907);
            ruleInitSection();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getInitSectionInitSectionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__InitSectionAssignment_1"


    // $ANTLR start "rule__Program__UserDefinedCommandsAssignment_2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2966:1: rule__Program__UserDefinedCommandsAssignment_2 : ( ruleUserDefinedCommand ) ;
    public final void rule__Program__UserDefinedCommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2970:1: ( ( ruleUserDefinedCommand ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2971:1: ( ruleUserDefinedCommand )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2971:1: ( ruleUserDefinedCommand )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2972:1: ruleUserDefinedCommand
            {
             before(grammarAccess.getProgramAccess().getUserDefinedCommandsUserDefinedCommandParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUserDefinedCommand_in_rule__Program__UserDefinedCommandsAssignment_25938);
            ruleUserDefinedCommand();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getUserDefinedCommandsUserDefinedCommandParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Program__UserDefinedCommandsAssignment_2"


    // $ANTLR start "rule__Program__MainAssignment_3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2981:1: rule__Program__MainAssignment_3 : ( ruleMain ) ;
    public final void rule__Program__MainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2985:1: ( ( ruleMain ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2986:1: ( ruleMain )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2986:1: ( ruleMain )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2987:1: ruleMain
            {
             before(grammarAccess.getProgramAccess().getMainMainParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMain_in_rule__Program__MainAssignment_35969);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getMainMainParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Program__MainAssignment_3"


    // $ANTLR start "rule__InitSection__InitCommandsAssignment_1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2996:1: rule__InitSection__InitCommandsAssignment_1 : ( ruleInitCommand ) ;
    public final void rule__InitSection__InitCommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3000:1: ( ( ruleInitCommand ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3001:1: ( ruleInitCommand )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3001:1: ( ruleInitCommand )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3002:1: ruleInitCommand
            {
             before(grammarAccess.getInitSectionAccess().getInitCommandsInitCommandParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInitCommand_in_rule__InitSection__InitCommandsAssignment_16000);
            ruleInitCommand();

            state._fsp--;

             after(grammarAccess.getInitSectionAccess().getInitCommandsInitCommandParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__InitSection__InitCommandsAssignment_1"


    // $ANTLR start "rule__InitPositionCommand__XAssignment_1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3011:1: rule__InitPositionCommand__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__InitPositionCommand__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3015:1: ( ( RULE_INT ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3016:1: ( RULE_INT )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3016:1: ( RULE_INT )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3017:1: RULE_INT
            {
             before(grammarAccess.getInitPositionCommandAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitPositionCommand__XAssignment_16031); 
             after(grammarAccess.getInitPositionCommandAccess().getXINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__InitPositionCommand__XAssignment_1"


    // $ANTLR start "rule__InitPositionCommand__YAssignment_3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3026:1: rule__InitPositionCommand__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__InitPositionCommand__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3030:1: ( ( RULE_INT ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3031:1: ( RULE_INT )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3031:1: ( RULE_INT )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3032:1: RULE_INT
            {
             before(grammarAccess.getInitPositionCommandAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitPositionCommand__YAssignment_36062); 
             after(grammarAccess.getInitPositionCommandAccess().getYINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__InitPositionCommand__YAssignment_3"


    // $ANTLR start "rule__InitHeadingCommand__HeadingAssignment_1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3041:1: rule__InitHeadingCommand__HeadingAssignment_1 : ( ruleHeadingKind ) ;
    public final void rule__InitHeadingCommand__HeadingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3045:1: ( ( ruleHeadingKind ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3046:1: ( ruleHeadingKind )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3046:1: ( ruleHeadingKind )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3047:1: ruleHeadingKind
            {
             before(grammarAccess.getInitHeadingCommandAccess().getHeadingHeadingKindParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHeadingKind_in_rule__InitHeadingCommand__HeadingAssignment_16093);
            ruleHeadingKind();

            state._fsp--;

             after(grammarAccess.getInitHeadingCommandAccess().getHeadingHeadingKindParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__InitHeadingCommand__HeadingAssignment_1"


    // $ANTLR start "rule__InitBoardSizeCommand__WidthAssignment_1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3056:1: rule__InitBoardSizeCommand__WidthAssignment_1 : ( RULE_INT ) ;
    public final void rule__InitBoardSizeCommand__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3060:1: ( ( RULE_INT ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3061:1: ( RULE_INT )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3061:1: ( RULE_INT )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3062:1: RULE_INT
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getWidthINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__WidthAssignment_16124); 
             after(grammarAccess.getInitBoardSizeCommandAccess().getWidthINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__InitBoardSizeCommand__WidthAssignment_1"


    // $ANTLR start "rule__InitBoardSizeCommand__HeightAssignment_3"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3071:1: rule__InitBoardSizeCommand__HeightAssignment_3 : ( RULE_INT ) ;
    public final void rule__InitBoardSizeCommand__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3075:1: ( ( RULE_INT ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3076:1: ( RULE_INT )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3076:1: ( RULE_INT )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3077:1: RULE_INT
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getHeightINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__HeightAssignment_36155); 
             after(grammarAccess.getInitBoardSizeCommandAccess().getHeightINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__InitBoardSizeCommand__HeightAssignment_3"


    // $ANTLR start "rule__UserDefinedCommand__DocAssignment_0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3086:1: rule__UserDefinedCommand__DocAssignment_0 : ( ruleDocumentationComment ) ;
    public final void rule__UserDefinedCommand__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3090:1: ( ( ruleDocumentationComment ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3091:1: ( ruleDocumentationComment )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3091:1: ( ruleDocumentationComment )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3092:1: ruleDocumentationComment
            {
             before(grammarAccess.getUserDefinedCommandAccess().getDocDocumentationCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDocumentationComment_in_rule__UserDefinedCommand__DocAssignment_06186);
            ruleDocumentationComment();

            state._fsp--;

             after(grammarAccess.getUserDefinedCommandAccess().getDocDocumentationCommentParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__UserDefinedCommand__DocAssignment_0"


    // $ANTLR start "rule__UserDefinedCommand__NameAssignment_2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3101:1: rule__UserDefinedCommand__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__UserDefinedCommand__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3105:1: ( ( RULE_ID ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3106:1: ( RULE_ID )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3106:1: ( RULE_ID )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3107:1: RULE_ID
            {
             before(grammarAccess.getUserDefinedCommandAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserDefinedCommand__NameAssignment_26217); 
             after(grammarAccess.getUserDefinedCommandAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__UserDefinedCommand__NameAssignment_2"


    // $ANTLR start "rule__UserDefinedCommand__StatementsAssignment_5"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3116:1: rule__UserDefinedCommand__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__UserDefinedCommand__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3120:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3121:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3121:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3122:1: ruleStatement
            {
             before(grammarAccess.getUserDefinedCommandAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__UserDefinedCommand__StatementsAssignment_56248);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getUserDefinedCommandAccess().getStatementsStatementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__UserDefinedCommand__StatementsAssignment_5"


    // $ANTLR start "rule__Main__StatementsAssignment_2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3131:1: rule__Main__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Main__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3135:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3136:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3136:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3137:1: ruleStatement
            {
             before(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Main__StatementsAssignment_26279);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Main__StatementsAssignment_2"


    // $ANTLR start "rule__UserDefinedCommandStatement__CommandAssignment_0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3146:1: rule__UserDefinedCommandStatement__CommandAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UserDefinedCommandStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3150:1: ( ( ( RULE_ID ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3151:1: ( ( RULE_ID ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3151:1: ( ( RULE_ID ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3152:1: ( RULE_ID )
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandCrossReference_0_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3153:1: ( RULE_ID )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3154:1: RULE_ID
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserDefinedCommandStatement__CommandAssignment_06314); 
             after(grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandCrossReference_0_0()); 

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
    // $ANTLR end "rule__UserDefinedCommandStatement__CommandAssignment_0"


    // $ANTLR start "rule__IfStatement__ConditionAssignment_2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3165:1: rule__IfStatement__ConditionAssignment_2 : ( ruleConditionExpr ) ;
    public final void rule__IfStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3169:1: ( ( ruleConditionExpr ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3170:1: ( ruleConditionExpr )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3170:1: ( ruleConditionExpr )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3171:1: ruleConditionExpr
            {
             before(grammarAccess.getIfStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConditionExpr_in_rule__IfStatement__ConditionAssignment_26349);
            ruleConditionExpr();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__IfStatement__ConditionAssignment_2"


    // $ANTLR start "rule__IfStatement__StatementsAssignment_5"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3180:1: rule__IfStatement__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__IfStatement__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3184:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3185:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3185:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3186:1: ruleStatement
            {
             before(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__IfStatement__StatementsAssignment_56380);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__IfStatement__StatementsAssignment_5"


    // $ANTLR start "rule__IfStatement__ElseStatementsAssignment_7_2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3195:1: rule__IfStatement__ElseStatementsAssignment_7_2 : ( ruleStatement ) ;
    public final void rule__IfStatement__ElseStatementsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3199:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3200:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3200:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3201:1: ruleStatement
            {
             before(grammarAccess.getIfStatementAccess().getElseStatementsStatementParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__IfStatement__ElseStatementsAssignment_7_26411);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getElseStatementsStatementParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__IfStatement__ElseStatementsAssignment_7_2"


    // $ANTLR start "rule__IterateStatement__TimesAssignment_1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3210:1: rule__IterateStatement__TimesAssignment_1 : ( RULE_INT ) ;
    public final void rule__IterateStatement__TimesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3214:1: ( ( RULE_INT ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3215:1: ( RULE_INT )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3215:1: ( RULE_INT )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3216:1: RULE_INT
            {
             before(grammarAccess.getIterateStatementAccess().getTimesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IterateStatement__TimesAssignment_16442); 
             after(grammarAccess.getIterateStatementAccess().getTimesINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__IterateStatement__TimesAssignment_1"


    // $ANTLR start "rule__IterateStatement__StatementsAssignment_4"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3225:1: rule__IterateStatement__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__IterateStatement__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3229:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3230:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3230:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3231:1: ruleStatement
            {
             before(grammarAccess.getIterateStatementAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__IterateStatement__StatementsAssignment_46473);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getIterateStatementAccess().getStatementsStatementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__IterateStatement__StatementsAssignment_4"


    // $ANTLR start "rule__WhileStatement__ConditionAssignment_2"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3240:1: rule__WhileStatement__ConditionAssignment_2 : ( ruleConditionExpr ) ;
    public final void rule__WhileStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3244:1: ( ( ruleConditionExpr ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3245:1: ( ruleConditionExpr )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3245:1: ( ruleConditionExpr )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3246:1: ruleConditionExpr
            {
             before(grammarAccess.getWhileStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConditionExpr_in_rule__WhileStatement__ConditionAssignment_26504);
            ruleConditionExpr();

            state._fsp--;

             after(grammarAccess.getWhileStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__WhileStatement__ConditionAssignment_2"


    // $ANTLR start "rule__WhileStatement__StatementsAssignment_5"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3255:1: rule__WhileStatement__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__WhileStatement__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3259:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3260:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3260:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3261:1: ruleStatement
            {
             before(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__WhileStatement__StatementsAssignment_56535);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__WhileStatement__StatementsAssignment_5"


    // $ANTLR start "rule__DocumentationComment__TextAssignment_1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3270:1: rule__DocumentationComment__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DocumentationComment__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3274:1: ( ( RULE_STRING ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3275:1: ( RULE_STRING )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3275:1: ( RULE_STRING )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3276:1: RULE_STRING
            {
             before(grammarAccess.getDocumentationCommentAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DocumentationComment__TextAssignment_16566); 
             after(grammarAccess.getDocumentationCommentAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DocumentationComment__TextAssignment_1"


    // $ANTLR start "rule__CommandStatement__KindAssignment_0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3285:1: rule__CommandStatement__KindAssignment_0 : ( ruleCommandKind ) ;
    public final void rule__CommandStatement__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3289:1: ( ( ruleCommandKind ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3290:1: ( ruleCommandKind )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3290:1: ( ruleCommandKind )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3291:1: ruleCommandKind
            {
             before(grammarAccess.getCommandStatementAccess().getKindCommandKindParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommandKind_in_rule__CommandStatement__KindAssignment_06597);
            ruleCommandKind();

            state._fsp--;

             after(grammarAccess.getCommandStatementAccess().getKindCommandKindParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__CommandStatement__KindAssignment_0"


    // $ANTLR start "rule__ConditionExpr__NegationAssignment_0"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3300:1: rule__ConditionExpr__NegationAssignment_0 : ( ( '!' ) ) ;
    public final void rule__ConditionExpr__NegationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3304:1: ( ( ( '!' ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3305:1: ( ( '!' ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3305:1: ( ( '!' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3306:1: ( '!' )
            {
             before(grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3307:1: ( '!' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3308:1: '!'
            {
             before(grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__ConditionExpr__NegationAssignment_06633); 
             after(grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0()); 

            }

             after(grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0()); 

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
    // $ANTLR end "rule__ConditionExpr__NegationAssignment_0"


    // $ANTLR start "rule__ConditionExpr__ExprAssignment_1"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3323:1: rule__ConditionExpr__ExprAssignment_1 : ( ruleConditionKind ) ;
    public final void rule__ConditionExpr__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3327:1: ( ( ruleConditionKind ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3328:1: ( ruleConditionKind )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3328:1: ( ruleConditionKind )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3329:1: ruleConditionKind
            {
             before(grammarAccess.getConditionExprAccess().getExprConditionKindParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionKind_in_rule__ConditionExpr__ExprAssignment_16672);
            ruleConditionKind();

            state._fsp--;

             after(grammarAccess.getConditionExprAccess().getExprConditionKindParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConditionExpr__ExprAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitSection_in_entryRuleInitSection121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitSection128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitSection__Group__0_in_ruleInitSection154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitCommand_in_entryRuleInitCommand181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitCommand188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitCommand__Alternatives_in_ruleInitCommand214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitPositionCommand_in_entryRuleInitPositionCommand241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitPositionCommand248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__0_in_ruleInitPositionCommand274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitHeadingCommand_in_entryRuleInitHeadingCommand301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitHeadingCommand308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__0_in_ruleInitHeadingCommand334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitBoardSizeCommand_in_entryRuleInitBoardSizeCommand361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitBoardSizeCommand368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__0_in_ruleInitBoardSizeCommand394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeadingKind_in_entryRuleHeadingKind421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeadingKind428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeadingKind__Alternatives_in_ruleHeadingKind454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommand_in_entryRuleUserDefinedCommand481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedCommand488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__0_in_ruleUserDefinedCommand514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0_in_ruleMain574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakableStatement_in_entryRuleBreakableStatement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakableStatement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakableStatement__Alternatives_in_ruleBreakableStatement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__0_in_ruleUserDefinedCommandStatement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__0_in_ruleIfStatement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterateStatement848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__0_in_ruleIterateStatement874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__0_in_ruleWhileStatement934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentationComment968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__0_in_ruleDocumentationComment994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandStatement1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__0_in_ruleCommandStatement1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandKind_in_entryRuleCommandKind1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandKind1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandKind__Alternatives_in_ruleCommandKind1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionExpr1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__0_in_ruleConditionExpr1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionKind_in_entryRuleConditionKind1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionKind1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionKind__Alternatives_in_ruleConditionKind1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitPositionCommand_in_rule__InitCommand__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitHeadingCommand_in_rule__InitCommand__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitBoardSizeCommand_in_rule__InitCommand__Alternatives1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__HeadingKind__Alternatives1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__HeadingKind__Alternatives1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HeadingKind__Alternatives1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HeadingKind__Alternatives1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_rule__Statement__Alternatives1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_rule__Statement__Alternatives1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_rule__Statement__Alternatives1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakableStatement_in_rule__Statement__Alternatives1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_rule__BreakableStatement__Alternatives1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_rule__BreakableStatement__Alternatives1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CommandKind__Alternatives1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CommandKind__Alternatives1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CommandKind__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CommandKind__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CommandKind__Alternatives1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CommandKind__Alternatives1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ConditionKind__Alternatives1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ConditionKind__Alternatives1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01751 = new BitSet(new long[]{0x0000801102000000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Program__Group__0__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11813 = new BitSet(new long[]{0x0000801102000000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__InitSectionAssignment_1_in_rule__Program__Group__1__Impl1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21874 = new BitSet(new long[]{0x0000801102000000L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__UserDefinedCommandsAssignment_2_in_rule__Program__Group__2__Impl1904 = new BitSet(new long[]{0x0000800100000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31935 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__MainAssignment_3_in_rule__Program__Group__3__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Program__Group__4__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitSection__Group__0__Impl_in_rule__InitSection__Group__02064 = new BitSet(new long[]{0x00000000C8000000L});
    public static final BitSet FOLLOW_rule__InitSection__Group__1_in_rule__InitSection__Group__02067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InitSection__Group__0__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitSection__Group__1__Impl_in_rule__InitSection__Group__12126 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__InitSection__Group__2_in_rule__InitSection__Group__12129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2158 = new BitSet(new long[]{0x00000000C8000002L});
    public static final BitSet FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2170 = new BitSet(new long[]{0x00000000C8000002L});
    public static final BitSet FOLLOW_rule__InitSection__Group__2__Impl_in_rule__InitSection__Group__22203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__InitSection__Group__2__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__0__Impl_in_rule__InitPositionCommand__Group__02268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__1_in_rule__InitPositionCommand__Group__02271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__InitPositionCommand__Group__0__Impl2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__1__Impl_in_rule__InitPositionCommand__Group__12330 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__2_in_rule__InitPositionCommand__Group__12333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__XAssignment_1_in_rule__InitPositionCommand__Group__1__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__2__Impl_in_rule__InitPositionCommand__Group__22390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__3_in_rule__InitPositionCommand__Group__22393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__InitPositionCommand__Group__2__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__3__Impl_in_rule__InitPositionCommand__Group__32452 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__4_in_rule__InitPositionCommand__Group__32455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__YAssignment_3_in_rule__InitPositionCommand__Group__3__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__4__Impl_in_rule__InitPositionCommand__Group__42512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InitPositionCommand__Group__4__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__0__Impl_in_rule__InitHeadingCommand__Group__02581 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__1_in_rule__InitHeadingCommand__Group__02584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InitHeadingCommand__Group__0__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__1__Impl_in_rule__InitHeadingCommand__Group__12643 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__2_in_rule__InitHeadingCommand__Group__12646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__HeadingAssignment_1_in_rule__InitHeadingCommand__Group__1__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__2__Impl_in_rule__InitHeadingCommand__Group__22703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InitHeadingCommand__Group__2__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__0__Impl_in_rule__InitBoardSizeCommand__Group__02768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__1_in_rule__InitBoardSizeCommand__Group__02771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InitBoardSizeCommand__Group__0__Impl2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__1__Impl_in_rule__InitBoardSizeCommand__Group__12830 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__2_in_rule__InitBoardSizeCommand__Group__12833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__WidthAssignment_1_in_rule__InitBoardSizeCommand__Group__1__Impl2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__2__Impl_in_rule__InitBoardSizeCommand__Group__22890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__3_in_rule__InitBoardSizeCommand__Group__22893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__InitBoardSizeCommand__Group__2__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__3__Impl_in_rule__InitBoardSizeCommand__Group__32952 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__4_in_rule__InitBoardSizeCommand__Group__32955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__HeightAssignment_3_in_rule__InitBoardSizeCommand__Group__3__Impl2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__4__Impl_in_rule__InitBoardSizeCommand__Group__43012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InitBoardSizeCommand__Group__4__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__0__Impl_in_rule__UserDefinedCommand__Group__03081 = new BitSet(new long[]{0x0000800100000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__1_in_rule__UserDefinedCommand__Group__03084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__DocAssignment_0_in_rule__UserDefinedCommand__Group__0__Impl3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__1__Impl_in_rule__UserDefinedCommand__Group__13142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__2_in_rule__UserDefinedCommand__Group__13145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__UserDefinedCommand__Group__1__Impl3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__2__Impl_in_rule__UserDefinedCommand__Group__23204 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__3_in_rule__UserDefinedCommand__Group__23207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__NameAssignment_2_in_rule__UserDefinedCommand__Group__2__Impl3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__3__Impl_in_rule__UserDefinedCommand__Group__33264 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__4_in_rule__UserDefinedCommand__Group__33267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__UserDefinedCommand__Group__3__Impl3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__4__Impl_in_rule__UserDefinedCommand__Group__43326 = new BitSet(new long[]{0x00005048001F8020L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__5_in_rule__UserDefinedCommand__Group__43329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__UserDefinedCommand__Group__4__Impl3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__5__Impl_in_rule__UserDefinedCommand__Group__53388 = new BitSet(new long[]{0x00005048001F8020L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__6_in_rule__UserDefinedCommand__Group__53391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__StatementsAssignment_5_in_rule__UserDefinedCommand__Group__5__Impl3418 = new BitSet(new long[]{0x00005040001F8022L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__6__Impl_in_rule__UserDefinedCommand__Group__63449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__UserDefinedCommand__Group__6__Impl3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__03522 = new BitSet(new long[]{0x0000801102000000L});
    public static final BitSet FOLLOW_rule__Main__Group__1_in_rule__Main__Group__03525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__13583 = new BitSet(new long[]{0x00005060001F8020L});
    public static final BitSet FOLLOW_rule__Main__Group__2_in_rule__Main__Group__13586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Main__Group__1__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__23645 = new BitSet(new long[]{0x00005060001F8020L});
    public static final BitSet FOLLOW_rule__Main__Group__3_in_rule__Main__Group__23648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__StatementsAssignment_2_in_rule__Main__Group__2__Impl3675 = new BitSet(new long[]{0x00005040001F8022L});
    public static final BitSet FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__33706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Main__Group__3__Impl3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__0__Impl_in_rule__UserDefinedCommandStatement__Group__03773 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__1_in_rule__UserDefinedCommandStatement__Group__03776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__CommandAssignment_0_in_rule__UserDefinedCommandStatement__Group__0__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__1__Impl_in_rule__UserDefinedCommandStatement__Group__13833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__UserDefinedCommandStatement__Group__1__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__0__Impl_in_rule__IfStatement__Group__03896 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__1_in_rule__IfStatement__Group__03899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IfStatement__Group__0__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__1__Impl_in_rule__IfStatement__Group__13958 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__2_in_rule__IfStatement__Group__13961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__IfStatement__Group__1__Impl3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__2__Impl_in_rule__IfStatement__Group__24020 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__3_in_rule__IfStatement__Group__24023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__ConditionAssignment_2_in_rule__IfStatement__Group__2__Impl4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__3__Impl_in_rule__IfStatement__Group__34080 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__4_in_rule__IfStatement__Group__34083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__IfStatement__Group__3__Impl4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__4__Impl_in_rule__IfStatement__Group__44142 = new BitSet(new long[]{0x00005440001F8020L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__5_in_rule__IfStatement__Group__44145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IfStatement__Group__4__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__5__Impl_in_rule__IfStatement__Group__54204 = new BitSet(new long[]{0x00005440001F8020L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__6_in_rule__IfStatement__Group__54207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__StatementsAssignment_5_in_rule__IfStatement__Group__5__Impl4234 = new BitSet(new long[]{0x00005040001F8022L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__6__Impl_in_rule__IfStatement__Group__64265 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__7_in_rule__IfStatement__Group__64268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IfStatement__Group__6__Impl4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__7__Impl_in_rule__IfStatement__Group__74327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__0_in_rule__IfStatement__Group__7__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__0__Impl_in_rule__IfStatement__Group_7__04401 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__1_in_rule__IfStatement__Group_7__04404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__IfStatement__Group_7__0__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__1__Impl_in_rule__IfStatement__Group_7__14463 = new BitSet(new long[]{0x00005440001F8020L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__2_in_rule__IfStatement__Group_7__14466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IfStatement__Group_7__1__Impl4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__2__Impl_in_rule__IfStatement__Group_7__24525 = new BitSet(new long[]{0x00005440001F8020L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__3_in_rule__IfStatement__Group_7__24528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__ElseStatementsAssignment_7_2_in_rule__IfStatement__Group_7__2__Impl4555 = new BitSet(new long[]{0x00005040001F8022L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__3__Impl_in_rule__IfStatement__Group_7__34586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IfStatement__Group_7__3__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__0__Impl_in_rule__IterateStatement__Group__04653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__1_in_rule__IterateStatement__Group__04656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__IterateStatement__Group__0__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__1__Impl_in_rule__IterateStatement__Group__14715 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__2_in_rule__IterateStatement__Group__14718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__TimesAssignment_1_in_rule__IterateStatement__Group__1__Impl4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__2__Impl_in_rule__IterateStatement__Group__24775 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__3_in_rule__IterateStatement__Group__24778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__IterateStatement__Group__2__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__3__Impl_in_rule__IterateStatement__Group__34837 = new BitSet(new long[]{0x00005040001F8020L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__4_in_rule__IterateStatement__Group__34840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IterateStatement__Group__3__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__4__Impl_in_rule__IterateStatement__Group__44899 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__5_in_rule__IterateStatement__Group__44902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__StatementsAssignment_4_in_rule__IterateStatement__Group__4__Impl4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__5__Impl_in_rule__IterateStatement__Group__54959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IterateStatement__Group__5__Impl4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__0__Impl_in_rule__WhileStatement__Group__05030 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__1_in_rule__WhileStatement__Group__05033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__WhileStatement__Group__0__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__1__Impl_in_rule__WhileStatement__Group__15092 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__2_in_rule__WhileStatement__Group__15095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__WhileStatement__Group__1__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__2__Impl_in_rule__WhileStatement__Group__25154 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__3_in_rule__WhileStatement__Group__25157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__ConditionAssignment_2_in_rule__WhileStatement__Group__2__Impl5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__3__Impl_in_rule__WhileStatement__Group__35214 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__4_in_rule__WhileStatement__Group__35217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__WhileStatement__Group__3__Impl5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__4__Impl_in_rule__WhileStatement__Group__45276 = new BitSet(new long[]{0x00005040001F8020L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__5_in_rule__WhileStatement__Group__45279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__WhileStatement__Group__4__Impl5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__5__Impl_in_rule__WhileStatement__Group__55338 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__6_in_rule__WhileStatement__Group__55341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__StatementsAssignment_5_in_rule__WhileStatement__Group__5__Impl5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__6__Impl_in_rule__WhileStatement__Group__65398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__WhileStatement__Group__6__Impl5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__0__Impl_in_rule__DocumentationComment__Group__05471 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__1_in_rule__DocumentationComment__Group__05474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DocumentationComment__Group__0__Impl5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__1__Impl_in_rule__DocumentationComment__Group__15533 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__2_in_rule__DocumentationComment__Group__15536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__TextAssignment_1_in_rule__DocumentationComment__Group__1__Impl5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__2__Impl_in_rule__DocumentationComment__Group__25593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DocumentationComment__Group__2__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__0__Impl_in_rule__CommandStatement__Group__05658 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__1_in_rule__CommandStatement__Group__05661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__KindAssignment_0_in_rule__CommandStatement__Group__0__Impl5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__1__Impl_in_rule__CommandStatement__Group__15718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommandStatement__Group__1__Impl5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__0__Impl_in_rule__ConditionExpr__Group__05781 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__1_in_rule__ConditionExpr__Group__05784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__NegationAssignment_0_in_rule__ConditionExpr__Group__0__Impl5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__1__Impl_in_rule__ConditionExpr__Group__15841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__ExprAssignment_1_in_rule__ConditionExpr__Group__1__Impl5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitSection_in_rule__Program__InitSectionAssignment_15907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommand_in_rule__Program__UserDefinedCommandsAssignment_25938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__Program__MainAssignment_35969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitCommand_in_rule__InitSection__InitCommandsAssignment_16000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitPositionCommand__XAssignment_16031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitPositionCommand__YAssignment_36062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeadingKind_in_rule__InitHeadingCommand__HeadingAssignment_16093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__WidthAssignment_16124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__HeightAssignment_36155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_rule__UserDefinedCommand__DocAssignment_06186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserDefinedCommand__NameAssignment_26217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__UserDefinedCommand__StatementsAssignment_56248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Main__StatementsAssignment_26279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserDefinedCommandStatement__CommandAssignment_06314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_rule__IfStatement__ConditionAssignment_26349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__IfStatement__StatementsAssignment_56380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__IfStatement__ElseStatementsAssignment_7_26411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IterateStatement__TimesAssignment_16442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__IterateStatement__StatementsAssignment_46473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_rule__WhileStatement__ConditionAssignment_26504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__WhileStatement__StatementsAssignment_56535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DocumentationComment__TextAssignment_16566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandKind_in_rule__CommandStatement__KindAssignment_06597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ConditionExpr__NegationAssignment_06633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionKind_in_rule__ConditionExpr__ExprAssignment_16672 = new BitSet(new long[]{0x0000000000000002L});

}