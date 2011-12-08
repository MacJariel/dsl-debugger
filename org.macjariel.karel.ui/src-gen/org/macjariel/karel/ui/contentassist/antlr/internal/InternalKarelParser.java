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


    // $ANTLR start "entryRuleUserDefinedCommandStatement"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:340:1: entryRuleUserDefinedCommandStatement : ruleUserDefinedCommandStatement EOF ;
    public final void entryRuleUserDefinedCommandStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:341:1: ( ruleUserDefinedCommandStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:342:1: ruleUserDefinedCommandStatement EOF
            {
             before(grammarAccess.getUserDefinedCommandStatementRule()); 
            pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement661);
            ruleUserDefinedCommandStatement();

            state._fsp--;

             after(grammarAccess.getUserDefinedCommandStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement668); 

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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:349:1: ruleUserDefinedCommandStatement : ( ( rule__UserDefinedCommandStatement__Group__0 ) ) ;
    public final void ruleUserDefinedCommandStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:353:2: ( ( ( rule__UserDefinedCommandStatement__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:354:1: ( ( rule__UserDefinedCommandStatement__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:354:1: ( ( rule__UserDefinedCommandStatement__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:355:1: ( rule__UserDefinedCommandStatement__Group__0 )
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:356:1: ( rule__UserDefinedCommandStatement__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:356:2: rule__UserDefinedCommandStatement__Group__0
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__0_in_ruleUserDefinedCommandStatement694);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:368:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:369:1: ( ruleIfStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:370:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement721);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement728); 

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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:377:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:381:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:382:1: ( ( rule__IfStatement__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:382:1: ( ( rule__IfStatement__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:383:1: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:384:1: ( rule__IfStatement__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:384:2: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__0_in_ruleIfStatement754);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:396:1: entryRuleIterateStatement : ruleIterateStatement EOF ;
    public final void entryRuleIterateStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:397:1: ( ruleIterateStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:398:1: ruleIterateStatement EOF
            {
             before(grammarAccess.getIterateStatementRule()); 
            pushFollow(FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement781);
            ruleIterateStatement();

            state._fsp--;

             after(grammarAccess.getIterateStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterateStatement788); 

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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:405:1: ruleIterateStatement : ( ( rule__IterateStatement__Group__0 ) ) ;
    public final void ruleIterateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:409:2: ( ( ( rule__IterateStatement__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:410:1: ( ( rule__IterateStatement__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:410:1: ( ( rule__IterateStatement__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:411:1: ( rule__IterateStatement__Group__0 )
            {
             before(grammarAccess.getIterateStatementAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:412:1: ( rule__IterateStatement__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:412:2: rule__IterateStatement__Group__0
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__0_in_ruleIterateStatement814);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:424:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:425:1: ( ruleWhileStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:426:1: ruleWhileStatement EOF
            {
             before(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement841);
            ruleWhileStatement();

            state._fsp--;

             after(grammarAccess.getWhileStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement848); 

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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:433:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:437:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:438:1: ( ( rule__WhileStatement__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:438:1: ( ( rule__WhileStatement__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:439:1: ( rule__WhileStatement__Group__0 )
            {
             before(grammarAccess.getWhileStatementAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:440:1: ( rule__WhileStatement__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:440:2: rule__WhileStatement__Group__0
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__0_in_ruleWhileStatement874);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:452:1: entryRuleDocumentationComment : ruleDocumentationComment EOF ;
    public final void entryRuleDocumentationComment() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:453:1: ( ruleDocumentationComment EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:454:1: ruleDocumentationComment EOF
            {
             before(grammarAccess.getDocumentationCommentRule()); 
            pushFollow(FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment901);
            ruleDocumentationComment();

            state._fsp--;

             after(grammarAccess.getDocumentationCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentationComment908); 

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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:461:1: ruleDocumentationComment : ( ( rule__DocumentationComment__Group__0 ) ) ;
    public final void ruleDocumentationComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:465:2: ( ( ( rule__DocumentationComment__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:466:1: ( ( rule__DocumentationComment__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:466:1: ( ( rule__DocumentationComment__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:467:1: ( rule__DocumentationComment__Group__0 )
            {
             before(grammarAccess.getDocumentationCommentAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:468:1: ( rule__DocumentationComment__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:468:2: rule__DocumentationComment__Group__0
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__0_in_ruleDocumentationComment934);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:480:1: entryRuleCommandStatement : ruleCommandStatement EOF ;
    public final void entryRuleCommandStatement() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:481:1: ( ruleCommandStatement EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:482:1: ruleCommandStatement EOF
            {
             before(grammarAccess.getCommandStatementRule()); 
            pushFollow(FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement961);
            ruleCommandStatement();

            state._fsp--;

             after(grammarAccess.getCommandStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandStatement968); 

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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:489:1: ruleCommandStatement : ( ( rule__CommandStatement__Group__0 ) ) ;
    public final void ruleCommandStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:493:2: ( ( ( rule__CommandStatement__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:494:1: ( ( rule__CommandStatement__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:494:1: ( ( rule__CommandStatement__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:495:1: ( rule__CommandStatement__Group__0 )
            {
             before(grammarAccess.getCommandStatementAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:496:1: ( rule__CommandStatement__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:496:2: rule__CommandStatement__Group__0
            {
            pushFollow(FOLLOW_rule__CommandStatement__Group__0_in_ruleCommandStatement994);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:508:1: entryRuleCommandKind : ruleCommandKind EOF ;
    public final void entryRuleCommandKind() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:509:1: ( ruleCommandKind EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:510:1: ruleCommandKind EOF
            {
             before(grammarAccess.getCommandKindRule()); 
            pushFollow(FOLLOW_ruleCommandKind_in_entryRuleCommandKind1021);
            ruleCommandKind();

            state._fsp--;

             after(grammarAccess.getCommandKindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandKind1028); 

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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:517:1: ruleCommandKind : ( ( rule__CommandKind__Alternatives ) ) ;
    public final void ruleCommandKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:521:2: ( ( ( rule__CommandKind__Alternatives ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:522:1: ( ( rule__CommandKind__Alternatives ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:522:1: ( ( rule__CommandKind__Alternatives ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:523:1: ( rule__CommandKind__Alternatives )
            {
             before(grammarAccess.getCommandKindAccess().getAlternatives()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:524:1: ( rule__CommandKind__Alternatives )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:524:2: rule__CommandKind__Alternatives
            {
            pushFollow(FOLLOW_rule__CommandKind__Alternatives_in_ruleCommandKind1054);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:536:1: entryRuleConditionExpr : ruleConditionExpr EOF ;
    public final void entryRuleConditionExpr() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:537:1: ( ruleConditionExpr EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:538:1: ruleConditionExpr EOF
            {
             before(grammarAccess.getConditionExprRule()); 
            pushFollow(FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr1081);
            ruleConditionExpr();

            state._fsp--;

             after(grammarAccess.getConditionExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionExpr1088); 

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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:545:1: ruleConditionExpr : ( ( rule__ConditionExpr__Group__0 ) ) ;
    public final void ruleConditionExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:549:2: ( ( ( rule__ConditionExpr__Group__0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:550:1: ( ( rule__ConditionExpr__Group__0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:550:1: ( ( rule__ConditionExpr__Group__0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:551:1: ( rule__ConditionExpr__Group__0 )
            {
             before(grammarAccess.getConditionExprAccess().getGroup()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:552:1: ( rule__ConditionExpr__Group__0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:552:2: rule__ConditionExpr__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionExpr__Group__0_in_ruleConditionExpr1114);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:564:1: entryRuleConditionKind : ruleConditionKind EOF ;
    public final void entryRuleConditionKind() throws RecognitionException {
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:565:1: ( ruleConditionKind EOF )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:566:1: ruleConditionKind EOF
            {
             before(grammarAccess.getConditionKindRule()); 
            pushFollow(FOLLOW_ruleConditionKind_in_entryRuleConditionKind1141);
            ruleConditionKind();

            state._fsp--;

             after(grammarAccess.getConditionKindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionKind1148); 

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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:573:1: ruleConditionKind : ( ( rule__ConditionKind__Alternatives ) ) ;
    public final void ruleConditionKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:577:2: ( ( ( rule__ConditionKind__Alternatives ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:578:1: ( ( rule__ConditionKind__Alternatives ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:578:1: ( ( rule__ConditionKind__Alternatives ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:579:1: ( rule__ConditionKind__Alternatives )
            {
             before(grammarAccess.getConditionKindAccess().getAlternatives()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:580:1: ( rule__ConditionKind__Alternatives )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:580:2: rule__ConditionKind__Alternatives
            {
            pushFollow(FOLLOW_rule__ConditionKind__Alternatives_in_ruleConditionKind1174);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:592:1: rule__InitCommand__Alternatives : ( ( ruleInitPositionCommand ) | ( ruleInitHeadingCommand ) | ( ruleInitBoardSizeCommand ) );
    public final void rule__InitCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:596:1: ( ( ruleInitPositionCommand ) | ( ruleInitHeadingCommand ) | ( ruleInitBoardSizeCommand ) )
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
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:597:1: ( ruleInitPositionCommand )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:597:1: ( ruleInitPositionCommand )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:598:1: ruleInitPositionCommand
                    {
                     before(grammarAccess.getInitCommandAccess().getInitPositionCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInitPositionCommand_in_rule__InitCommand__Alternatives1210);
                    ruleInitPositionCommand();

                    state._fsp--;

                     after(grammarAccess.getInitCommandAccess().getInitPositionCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:603:6: ( ruleInitHeadingCommand )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:603:6: ( ruleInitHeadingCommand )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:604:1: ruleInitHeadingCommand
                    {
                     before(grammarAccess.getInitCommandAccess().getInitHeadingCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInitHeadingCommand_in_rule__InitCommand__Alternatives1227);
                    ruleInitHeadingCommand();

                    state._fsp--;

                     after(grammarAccess.getInitCommandAccess().getInitHeadingCommandParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:609:6: ( ruleInitBoardSizeCommand )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:609:6: ( ruleInitBoardSizeCommand )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:610:1: ruleInitBoardSizeCommand
                    {
                     before(grammarAccess.getInitCommandAccess().getInitBoardSizeCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInitBoardSizeCommand_in_rule__InitCommand__Alternatives1244);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:620:1: rule__HeadingKind__Alternatives : ( ( 'NORTH' ) | ( 'SOUTH' ) | ( 'WEST' ) | ( 'EAST' ) );
    public final void rule__HeadingKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:624:1: ( ( 'NORTH' ) | ( 'SOUTH' ) | ( 'WEST' ) | ( 'EAST' ) )
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
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:625:1: ( 'NORTH' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:625:1: ( 'NORTH' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:626:1: 'NORTH'
                    {
                     before(grammarAccess.getHeadingKindAccess().getNORTHKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__HeadingKind__Alternatives1277); 
                     after(grammarAccess.getHeadingKindAccess().getNORTHKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:633:6: ( 'SOUTH' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:633:6: ( 'SOUTH' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:634:1: 'SOUTH'
                    {
                     before(grammarAccess.getHeadingKindAccess().getSOUTHKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__HeadingKind__Alternatives1297); 
                     after(grammarAccess.getHeadingKindAccess().getSOUTHKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:641:6: ( 'WEST' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:641:6: ( 'WEST' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:642:1: 'WEST'
                    {
                     before(grammarAccess.getHeadingKindAccess().getWESTKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__HeadingKind__Alternatives1317); 
                     after(grammarAccess.getHeadingKindAccess().getWESTKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:649:6: ( 'EAST' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:649:6: ( 'EAST' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:650:1: 'EAST'
                    {
                     before(grammarAccess.getHeadingKindAccess().getEASTKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__HeadingKind__Alternatives1337); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:662:1: rule__Statement__Alternatives : ( ( ruleIfStatement ) | ( ruleIterateStatement ) | ( ruleWhileStatement ) | ( ruleCommandStatement ) | ( ruleUserDefinedCommandStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:666:1: ( ( ruleIfStatement ) | ( ruleIterateStatement ) | ( ruleWhileStatement ) | ( ruleCommandStatement ) | ( ruleUserDefinedCommandStatement ) )
            int alt3=5;
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
            case RULE_ID:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:667:1: ( ruleIfStatement )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:667:1: ( ruleIfStatement )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:668:1: ruleIfStatement
                    {
                     before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIfStatement_in_rule__Statement__Alternatives1371);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:673:6: ( ruleIterateStatement )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:673:6: ( ruleIterateStatement )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:674:1: ruleIterateStatement
                    {
                     before(grammarAccess.getStatementAccess().getIterateStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIterateStatement_in_rule__Statement__Alternatives1388);
                    ruleIterateStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIterateStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:679:6: ( ruleWhileStatement )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:679:6: ( ruleWhileStatement )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:680:1: ruleWhileStatement
                    {
                     before(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleWhileStatement_in_rule__Statement__Alternatives1405);
                    ruleWhileStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:685:6: ( ruleCommandStatement )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:685:6: ( ruleCommandStatement )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:686:1: ruleCommandStatement
                    {
                     before(grammarAccess.getStatementAccess().getCommandStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCommandStatement_in_rule__Statement__Alternatives1422);
                    ruleCommandStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCommandStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:691:6: ( ruleUserDefinedCommandStatement )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:691:6: ( ruleUserDefinedCommandStatement )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:692:1: ruleUserDefinedCommandStatement
                    {
                     before(grammarAccess.getStatementAccess().getUserDefinedCommandStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_rule__Statement__Alternatives1439);
                    ruleUserDefinedCommandStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getUserDefinedCommandStatementParserRuleCall_4()); 

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


    // $ANTLR start "rule__CommandKind__Alternatives"
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:702:1: rule__CommandKind__Alternatives : ( ( 'move' ) | ( 'turn' ) | ( 'turnOn' ) | ( 'turnOff' ) | ( 'put' ) | ( 'get' ) );
    public final void rule__CommandKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:706:1: ( ( 'move' ) | ( 'turn' ) | ( 'turnOn' ) | ( 'turnOff' ) | ( 'put' ) | ( 'get' ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:707:1: ( 'move' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:707:1: ( 'move' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:708:1: 'move'
                    {
                     before(grammarAccess.getCommandKindAccess().getMoveKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__CommandKind__Alternatives1472); 
                     after(grammarAccess.getCommandKindAccess().getMoveKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:715:6: ( 'turn' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:715:6: ( 'turn' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:716:1: 'turn'
                    {
                     before(grammarAccess.getCommandKindAccess().getTurnKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__CommandKind__Alternatives1492); 
                     after(grammarAccess.getCommandKindAccess().getTurnKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:723:6: ( 'turnOn' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:723:6: ( 'turnOn' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:724:1: 'turnOn'
                    {
                     before(grammarAccess.getCommandKindAccess().getTurnOnKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__CommandKind__Alternatives1512); 
                     after(grammarAccess.getCommandKindAccess().getTurnOnKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:731:6: ( 'turnOff' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:731:6: ( 'turnOff' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:732:1: 'turnOff'
                    {
                     before(grammarAccess.getCommandKindAccess().getTurnOffKeyword_3()); 
                    match(input,18,FOLLOW_18_in_rule__CommandKind__Alternatives1532); 
                     after(grammarAccess.getCommandKindAccess().getTurnOffKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:739:6: ( 'put' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:739:6: ( 'put' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:740:1: 'put'
                    {
                     before(grammarAccess.getCommandKindAccess().getPutKeyword_4()); 
                    match(input,19,FOLLOW_19_in_rule__CommandKind__Alternatives1552); 
                     after(grammarAccess.getCommandKindAccess().getPutKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:747:6: ( 'get' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:747:6: ( 'get' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:748:1: 'get'
                    {
                     before(grammarAccess.getCommandKindAccess().getGetKeyword_5()); 
                    match(input,20,FOLLOW_20_in_rule__CommandKind__Alternatives1572); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:760:1: rule__ConditionKind__Alternatives : ( ( 'WALL_AHEAD' ) | ( 'MARKED_PLACE' ) );
    public final void rule__ConditionKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:764:1: ( ( 'WALL_AHEAD' ) | ( 'MARKED_PLACE' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:765:1: ( 'WALL_AHEAD' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:765:1: ( 'WALL_AHEAD' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:766:1: 'WALL_AHEAD'
                    {
                     before(grammarAccess.getConditionKindAccess().getWALL_AHEADKeyword_0()); 
                    match(input,21,FOLLOW_21_in_rule__ConditionKind__Alternatives1607); 
                     after(grammarAccess.getConditionKindAccess().getWALL_AHEADKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:773:6: ( 'MARKED_PLACE' )
                    {
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:773:6: ( 'MARKED_PLACE' )
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:774:1: 'MARKED_PLACE'
                    {
                     before(grammarAccess.getConditionKindAccess().getMARKED_PLACEKeyword_1()); 
                    match(input,22,FOLLOW_22_in_rule__ConditionKind__Alternatives1627); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:788:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:792:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:793:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01659);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01662);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:800:1: rule__Program__Group__0__Impl : ( 'BEGIN-PROGRAM' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:804:1: ( ( 'BEGIN-PROGRAM' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:805:1: ( 'BEGIN-PROGRAM' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:805:1: ( 'BEGIN-PROGRAM' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:806:1: 'BEGIN-PROGRAM'
            {
             before(grammarAccess.getProgramAccess().getBEGINPROGRAMKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Program__Group__0__Impl1690); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:819:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:823:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:824:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11721);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11724);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:831:1: rule__Program__Group__1__Impl : ( ( rule__Program__InitSectionAssignment_1 )? ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:835:1: ( ( ( rule__Program__InitSectionAssignment_1 )? ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:836:1: ( ( rule__Program__InitSectionAssignment_1 )? )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:836:1: ( ( rule__Program__InitSectionAssignment_1 )? )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:837:1: ( rule__Program__InitSectionAssignment_1 )?
            {
             before(grammarAccess.getProgramAccess().getInitSectionAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:838:1: ( rule__Program__InitSectionAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:838:2: rule__Program__InitSectionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Program__InitSectionAssignment_1_in_rule__Program__Group__1__Impl1751);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:848:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:852:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:853:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21782);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21785);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:860:1: rule__Program__Group__2__Impl : ( ( rule__Program__UserDefinedCommandsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:864:1: ( ( ( rule__Program__UserDefinedCommandsAssignment_2 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:865:1: ( ( rule__Program__UserDefinedCommandsAssignment_2 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:865:1: ( ( rule__Program__UserDefinedCommandsAssignment_2 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:866:1: ( rule__Program__UserDefinedCommandsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getUserDefinedCommandsAssignment_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:867:1: ( rule__Program__UserDefinedCommandsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32||LA7_0==47) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:867:2: rule__Program__UserDefinedCommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Program__UserDefinedCommandsAssignment_2_in_rule__Program__Group__2__Impl1812);
            	    rule__Program__UserDefinedCommandsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:877:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:881:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:882:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31843);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31846);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:889:1: rule__Program__Group__3__Impl : ( ( rule__Program__MainAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:893:1: ( ( ( rule__Program__MainAssignment_3 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:894:1: ( ( rule__Program__MainAssignment_3 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:894:1: ( ( rule__Program__MainAssignment_3 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:895:1: ( rule__Program__MainAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getMainAssignment_3()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:896:1: ( rule__Program__MainAssignment_3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:896:2: rule__Program__MainAssignment_3
            {
            pushFollow(FOLLOW_rule__Program__MainAssignment_3_in_rule__Program__Group__3__Impl1873);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:906:1: rule__Program__Group__4 : rule__Program__Group__4__Impl ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:910:1: ( rule__Program__Group__4__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:911:2: rule__Program__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41903);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:917:1: rule__Program__Group__4__Impl : ( 'END-PROGRAM' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:921:1: ( ( 'END-PROGRAM' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:922:1: ( 'END-PROGRAM' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:922:1: ( 'END-PROGRAM' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:923:1: 'END-PROGRAM'
            {
             before(grammarAccess.getProgramAccess().getENDPROGRAMKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Program__Group__4__Impl1931); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:946:1: rule__InitSection__Group__0 : rule__InitSection__Group__0__Impl rule__InitSection__Group__1 ;
    public final void rule__InitSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:950:1: ( rule__InitSection__Group__0__Impl rule__InitSection__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:951:2: rule__InitSection__Group__0__Impl rule__InitSection__Group__1
            {
            pushFollow(FOLLOW_rule__InitSection__Group__0__Impl_in_rule__InitSection__Group__01972);
            rule__InitSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitSection__Group__1_in_rule__InitSection__Group__01975);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:958:1: rule__InitSection__Group__0__Impl : ( 'BEGIN-INIT' ) ;
    public final void rule__InitSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:962:1: ( ( 'BEGIN-INIT' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:963:1: ( 'BEGIN-INIT' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:963:1: ( 'BEGIN-INIT' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:964:1: 'BEGIN-INIT'
            {
             before(grammarAccess.getInitSectionAccess().getBEGININITKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__InitSection__Group__0__Impl2003); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:977:1: rule__InitSection__Group__1 : rule__InitSection__Group__1__Impl rule__InitSection__Group__2 ;
    public final void rule__InitSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:981:1: ( rule__InitSection__Group__1__Impl rule__InitSection__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:982:2: rule__InitSection__Group__1__Impl rule__InitSection__Group__2
            {
            pushFollow(FOLLOW_rule__InitSection__Group__1__Impl_in_rule__InitSection__Group__12034);
            rule__InitSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitSection__Group__2_in_rule__InitSection__Group__12037);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:989:1: rule__InitSection__Group__1__Impl : ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) ) ;
    public final void rule__InitSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:993:1: ( ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:994:1: ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:994:1: ( ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:995:1: ( ( rule__InitSection__InitCommandsAssignment_1 ) ) ( ( rule__InitSection__InitCommandsAssignment_1 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:995:1: ( ( rule__InitSection__InitCommandsAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:996:1: ( rule__InitSection__InitCommandsAssignment_1 )
            {
             before(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:997:1: ( rule__InitSection__InitCommandsAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:997:2: rule__InitSection__InitCommandsAssignment_1
            {
            pushFollow(FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2066);
            rule__InitSection__InitCommandsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1()); 

            }

            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1000:1: ( ( rule__InitSection__InitCommandsAssignment_1 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1001:1: ( rule__InitSection__InitCommandsAssignment_1 )*
            {
             before(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1002:1: ( rule__InitSection__InitCommandsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27||(LA8_0>=30 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1002:2: rule__InitSection__InitCommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2078);
            	    rule__InitSection__InitCommandsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1013:1: rule__InitSection__Group__2 : rule__InitSection__Group__2__Impl ;
    public final void rule__InitSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1017:1: ( rule__InitSection__Group__2__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1018:2: rule__InitSection__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InitSection__Group__2__Impl_in_rule__InitSection__Group__22111);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1024:1: rule__InitSection__Group__2__Impl : ( 'END-INIT' ) ;
    public final void rule__InitSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1028:1: ( ( 'END-INIT' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1029:1: ( 'END-INIT' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1029:1: ( 'END-INIT' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1030:1: 'END-INIT'
            {
             before(grammarAccess.getInitSectionAccess().getENDINITKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__InitSection__Group__2__Impl2139); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1049:1: rule__InitPositionCommand__Group__0 : rule__InitPositionCommand__Group__0__Impl rule__InitPositionCommand__Group__1 ;
    public final void rule__InitPositionCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1053:1: ( rule__InitPositionCommand__Group__0__Impl rule__InitPositionCommand__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1054:2: rule__InitPositionCommand__Group__0__Impl rule__InitPositionCommand__Group__1
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__0__Impl_in_rule__InitPositionCommand__Group__02176);
            rule__InitPositionCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__1_in_rule__InitPositionCommand__Group__02179);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1061:1: rule__InitPositionCommand__Group__0__Impl : ( 'position' ) ;
    public final void rule__InitPositionCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1065:1: ( ( 'position' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1066:1: ( 'position' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1066:1: ( 'position' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1067:1: 'position'
            {
             before(grammarAccess.getInitPositionCommandAccess().getPositionKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__InitPositionCommand__Group__0__Impl2207); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1080:1: rule__InitPositionCommand__Group__1 : rule__InitPositionCommand__Group__1__Impl rule__InitPositionCommand__Group__2 ;
    public final void rule__InitPositionCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1084:1: ( rule__InitPositionCommand__Group__1__Impl rule__InitPositionCommand__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1085:2: rule__InitPositionCommand__Group__1__Impl rule__InitPositionCommand__Group__2
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__1__Impl_in_rule__InitPositionCommand__Group__12238);
            rule__InitPositionCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__2_in_rule__InitPositionCommand__Group__12241);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1092:1: rule__InitPositionCommand__Group__1__Impl : ( ( rule__InitPositionCommand__XAssignment_1 ) ) ;
    public final void rule__InitPositionCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1096:1: ( ( ( rule__InitPositionCommand__XAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1097:1: ( ( rule__InitPositionCommand__XAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1097:1: ( ( rule__InitPositionCommand__XAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1098:1: ( rule__InitPositionCommand__XAssignment_1 )
            {
             before(grammarAccess.getInitPositionCommandAccess().getXAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1099:1: ( rule__InitPositionCommand__XAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1099:2: rule__InitPositionCommand__XAssignment_1
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__XAssignment_1_in_rule__InitPositionCommand__Group__1__Impl2268);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1109:1: rule__InitPositionCommand__Group__2 : rule__InitPositionCommand__Group__2__Impl rule__InitPositionCommand__Group__3 ;
    public final void rule__InitPositionCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1113:1: ( rule__InitPositionCommand__Group__2__Impl rule__InitPositionCommand__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1114:2: rule__InitPositionCommand__Group__2__Impl rule__InitPositionCommand__Group__3
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__2__Impl_in_rule__InitPositionCommand__Group__22298);
            rule__InitPositionCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__3_in_rule__InitPositionCommand__Group__22301);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1121:1: rule__InitPositionCommand__Group__2__Impl : ( ',' ) ;
    public final void rule__InitPositionCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1125:1: ( ( ',' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1126:1: ( ',' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1126:1: ( ',' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1127:1: ','
            {
             before(grammarAccess.getInitPositionCommandAccess().getCommaKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__InitPositionCommand__Group__2__Impl2329); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1140:1: rule__InitPositionCommand__Group__3 : rule__InitPositionCommand__Group__3__Impl rule__InitPositionCommand__Group__4 ;
    public final void rule__InitPositionCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1144:1: ( rule__InitPositionCommand__Group__3__Impl rule__InitPositionCommand__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1145:2: rule__InitPositionCommand__Group__3__Impl rule__InitPositionCommand__Group__4
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__3__Impl_in_rule__InitPositionCommand__Group__32360);
            rule__InitPositionCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitPositionCommand__Group__4_in_rule__InitPositionCommand__Group__32363);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1152:1: rule__InitPositionCommand__Group__3__Impl : ( ( rule__InitPositionCommand__YAssignment_3 ) ) ;
    public final void rule__InitPositionCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1156:1: ( ( ( rule__InitPositionCommand__YAssignment_3 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1157:1: ( ( rule__InitPositionCommand__YAssignment_3 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1157:1: ( ( rule__InitPositionCommand__YAssignment_3 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1158:1: ( rule__InitPositionCommand__YAssignment_3 )
            {
             before(grammarAccess.getInitPositionCommandAccess().getYAssignment_3()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1159:1: ( rule__InitPositionCommand__YAssignment_3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1159:2: rule__InitPositionCommand__YAssignment_3
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__YAssignment_3_in_rule__InitPositionCommand__Group__3__Impl2390);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1169:1: rule__InitPositionCommand__Group__4 : rule__InitPositionCommand__Group__4__Impl ;
    public final void rule__InitPositionCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1173:1: ( rule__InitPositionCommand__Group__4__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1174:2: rule__InitPositionCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InitPositionCommand__Group__4__Impl_in_rule__InitPositionCommand__Group__42420);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1180:1: rule__InitPositionCommand__Group__4__Impl : ( ';' ) ;
    public final void rule__InitPositionCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1184:1: ( ( ';' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1185:1: ( ';' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1185:1: ( ';' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1186:1: ';'
            {
             before(grammarAccess.getInitPositionCommandAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__InitPositionCommand__Group__4__Impl2448); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1209:1: rule__InitHeadingCommand__Group__0 : rule__InitHeadingCommand__Group__0__Impl rule__InitHeadingCommand__Group__1 ;
    public final void rule__InitHeadingCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1213:1: ( rule__InitHeadingCommand__Group__0__Impl rule__InitHeadingCommand__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1214:2: rule__InitHeadingCommand__Group__0__Impl rule__InitHeadingCommand__Group__1
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__0__Impl_in_rule__InitHeadingCommand__Group__02489);
            rule__InitHeadingCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__1_in_rule__InitHeadingCommand__Group__02492);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1221:1: rule__InitHeadingCommand__Group__0__Impl : ( 'heading' ) ;
    public final void rule__InitHeadingCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1225:1: ( ( 'heading' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1226:1: ( 'heading' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1226:1: ( 'heading' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1227:1: 'heading'
            {
             before(grammarAccess.getInitHeadingCommandAccess().getHeadingKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__InitHeadingCommand__Group__0__Impl2520); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1240:1: rule__InitHeadingCommand__Group__1 : rule__InitHeadingCommand__Group__1__Impl rule__InitHeadingCommand__Group__2 ;
    public final void rule__InitHeadingCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1244:1: ( rule__InitHeadingCommand__Group__1__Impl rule__InitHeadingCommand__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1245:2: rule__InitHeadingCommand__Group__1__Impl rule__InitHeadingCommand__Group__2
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__1__Impl_in_rule__InitHeadingCommand__Group__12551);
            rule__InitHeadingCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__2_in_rule__InitHeadingCommand__Group__12554);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1252:1: rule__InitHeadingCommand__Group__1__Impl : ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) ) ;
    public final void rule__InitHeadingCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1256:1: ( ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1257:1: ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1257:1: ( ( rule__InitHeadingCommand__HeadingAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1258:1: ( rule__InitHeadingCommand__HeadingAssignment_1 )
            {
             before(grammarAccess.getInitHeadingCommandAccess().getHeadingAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1259:1: ( rule__InitHeadingCommand__HeadingAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1259:2: rule__InitHeadingCommand__HeadingAssignment_1
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__HeadingAssignment_1_in_rule__InitHeadingCommand__Group__1__Impl2581);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1269:1: rule__InitHeadingCommand__Group__2 : rule__InitHeadingCommand__Group__2__Impl ;
    public final void rule__InitHeadingCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1273:1: ( rule__InitHeadingCommand__Group__2__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1274:2: rule__InitHeadingCommand__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InitHeadingCommand__Group__2__Impl_in_rule__InitHeadingCommand__Group__22611);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1280:1: rule__InitHeadingCommand__Group__2__Impl : ( ';' ) ;
    public final void rule__InitHeadingCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1284:1: ( ( ';' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1285:1: ( ';' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1285:1: ( ';' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1286:1: ';'
            {
             before(grammarAccess.getInitHeadingCommandAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__InitHeadingCommand__Group__2__Impl2639); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1305:1: rule__InitBoardSizeCommand__Group__0 : rule__InitBoardSizeCommand__Group__0__Impl rule__InitBoardSizeCommand__Group__1 ;
    public final void rule__InitBoardSizeCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1309:1: ( rule__InitBoardSizeCommand__Group__0__Impl rule__InitBoardSizeCommand__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1310:2: rule__InitBoardSizeCommand__Group__0__Impl rule__InitBoardSizeCommand__Group__1
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__0__Impl_in_rule__InitBoardSizeCommand__Group__02676);
            rule__InitBoardSizeCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__1_in_rule__InitBoardSizeCommand__Group__02679);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1317:1: rule__InitBoardSizeCommand__Group__0__Impl : ( 'boardSize' ) ;
    public final void rule__InitBoardSizeCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1321:1: ( ( 'boardSize' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1322:1: ( 'boardSize' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1322:1: ( 'boardSize' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1323:1: 'boardSize'
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getBoardSizeKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__InitBoardSizeCommand__Group__0__Impl2707); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1336:1: rule__InitBoardSizeCommand__Group__1 : rule__InitBoardSizeCommand__Group__1__Impl rule__InitBoardSizeCommand__Group__2 ;
    public final void rule__InitBoardSizeCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1340:1: ( rule__InitBoardSizeCommand__Group__1__Impl rule__InitBoardSizeCommand__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1341:2: rule__InitBoardSizeCommand__Group__1__Impl rule__InitBoardSizeCommand__Group__2
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__1__Impl_in_rule__InitBoardSizeCommand__Group__12738);
            rule__InitBoardSizeCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__2_in_rule__InitBoardSizeCommand__Group__12741);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1348:1: rule__InitBoardSizeCommand__Group__1__Impl : ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) ) ;
    public final void rule__InitBoardSizeCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1352:1: ( ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1353:1: ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1353:1: ( ( rule__InitBoardSizeCommand__WidthAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1354:1: ( rule__InitBoardSizeCommand__WidthAssignment_1 )
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getWidthAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1355:1: ( rule__InitBoardSizeCommand__WidthAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1355:2: rule__InitBoardSizeCommand__WidthAssignment_1
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__WidthAssignment_1_in_rule__InitBoardSizeCommand__Group__1__Impl2768);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1365:1: rule__InitBoardSizeCommand__Group__2 : rule__InitBoardSizeCommand__Group__2__Impl rule__InitBoardSizeCommand__Group__3 ;
    public final void rule__InitBoardSizeCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1369:1: ( rule__InitBoardSizeCommand__Group__2__Impl rule__InitBoardSizeCommand__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1370:2: rule__InitBoardSizeCommand__Group__2__Impl rule__InitBoardSizeCommand__Group__3
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__2__Impl_in_rule__InitBoardSizeCommand__Group__22798);
            rule__InitBoardSizeCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__3_in_rule__InitBoardSizeCommand__Group__22801);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1377:1: rule__InitBoardSizeCommand__Group__2__Impl : ( ',' ) ;
    public final void rule__InitBoardSizeCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1381:1: ( ( ',' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1382:1: ( ',' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1382:1: ( ',' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1383:1: ','
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getCommaKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__InitBoardSizeCommand__Group__2__Impl2829); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1396:1: rule__InitBoardSizeCommand__Group__3 : rule__InitBoardSizeCommand__Group__3__Impl rule__InitBoardSizeCommand__Group__4 ;
    public final void rule__InitBoardSizeCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1400:1: ( rule__InitBoardSizeCommand__Group__3__Impl rule__InitBoardSizeCommand__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1401:2: rule__InitBoardSizeCommand__Group__3__Impl rule__InitBoardSizeCommand__Group__4
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__3__Impl_in_rule__InitBoardSizeCommand__Group__32860);
            rule__InitBoardSizeCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__4_in_rule__InitBoardSizeCommand__Group__32863);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1408:1: rule__InitBoardSizeCommand__Group__3__Impl : ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) ) ;
    public final void rule__InitBoardSizeCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1412:1: ( ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1413:1: ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1413:1: ( ( rule__InitBoardSizeCommand__HeightAssignment_3 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1414:1: ( rule__InitBoardSizeCommand__HeightAssignment_3 )
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getHeightAssignment_3()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1415:1: ( rule__InitBoardSizeCommand__HeightAssignment_3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1415:2: rule__InitBoardSizeCommand__HeightAssignment_3
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__HeightAssignment_3_in_rule__InitBoardSizeCommand__Group__3__Impl2890);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1425:1: rule__InitBoardSizeCommand__Group__4 : rule__InitBoardSizeCommand__Group__4__Impl ;
    public final void rule__InitBoardSizeCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1429:1: ( rule__InitBoardSizeCommand__Group__4__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1430:2: rule__InitBoardSizeCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InitBoardSizeCommand__Group__4__Impl_in_rule__InitBoardSizeCommand__Group__42920);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1436:1: rule__InitBoardSizeCommand__Group__4__Impl : ( ';' ) ;
    public final void rule__InitBoardSizeCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1440:1: ( ( ';' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1441:1: ( ';' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1441:1: ( ';' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1442:1: ';'
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__InitBoardSizeCommand__Group__4__Impl2948); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1465:1: rule__UserDefinedCommand__Group__0 : rule__UserDefinedCommand__Group__0__Impl rule__UserDefinedCommand__Group__1 ;
    public final void rule__UserDefinedCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1469:1: ( rule__UserDefinedCommand__Group__0__Impl rule__UserDefinedCommand__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1470:2: rule__UserDefinedCommand__Group__0__Impl rule__UserDefinedCommand__Group__1
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__0__Impl_in_rule__UserDefinedCommand__Group__02989);
            rule__UserDefinedCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__1_in_rule__UserDefinedCommand__Group__02992);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1477:1: rule__UserDefinedCommand__Group__0__Impl : ( ( rule__UserDefinedCommand__DocAssignment_0 )? ) ;
    public final void rule__UserDefinedCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1481:1: ( ( ( rule__UserDefinedCommand__DocAssignment_0 )? ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1482:1: ( ( rule__UserDefinedCommand__DocAssignment_0 )? )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1482:1: ( ( rule__UserDefinedCommand__DocAssignment_0 )? )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1483:1: ( rule__UserDefinedCommand__DocAssignment_0 )?
            {
             before(grammarAccess.getUserDefinedCommandAccess().getDocAssignment_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1484:1: ( rule__UserDefinedCommand__DocAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1484:2: rule__UserDefinedCommand__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UserDefinedCommand__DocAssignment_0_in_rule__UserDefinedCommand__Group__0__Impl3019);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1494:1: rule__UserDefinedCommand__Group__1 : rule__UserDefinedCommand__Group__1__Impl rule__UserDefinedCommand__Group__2 ;
    public final void rule__UserDefinedCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1498:1: ( rule__UserDefinedCommand__Group__1__Impl rule__UserDefinedCommand__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1499:2: rule__UserDefinedCommand__Group__1__Impl rule__UserDefinedCommand__Group__2
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__1__Impl_in_rule__UserDefinedCommand__Group__13050);
            rule__UserDefinedCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__2_in_rule__UserDefinedCommand__Group__13053);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1506:1: rule__UserDefinedCommand__Group__1__Impl : ( 'DEFINE COMMAND' ) ;
    public final void rule__UserDefinedCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1510:1: ( ( 'DEFINE COMMAND' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1511:1: ( 'DEFINE COMMAND' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1511:1: ( 'DEFINE COMMAND' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1512:1: 'DEFINE COMMAND'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getDEFINECOMMANDKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__UserDefinedCommand__Group__1__Impl3081); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1525:1: rule__UserDefinedCommand__Group__2 : rule__UserDefinedCommand__Group__2__Impl rule__UserDefinedCommand__Group__3 ;
    public final void rule__UserDefinedCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1529:1: ( rule__UserDefinedCommand__Group__2__Impl rule__UserDefinedCommand__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1530:2: rule__UserDefinedCommand__Group__2__Impl rule__UserDefinedCommand__Group__3
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__2__Impl_in_rule__UserDefinedCommand__Group__23112);
            rule__UserDefinedCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__3_in_rule__UserDefinedCommand__Group__23115);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1537:1: rule__UserDefinedCommand__Group__2__Impl : ( ( rule__UserDefinedCommand__NameAssignment_2 ) ) ;
    public final void rule__UserDefinedCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1541:1: ( ( ( rule__UserDefinedCommand__NameAssignment_2 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1542:1: ( ( rule__UserDefinedCommand__NameAssignment_2 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1542:1: ( ( rule__UserDefinedCommand__NameAssignment_2 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1543:1: ( rule__UserDefinedCommand__NameAssignment_2 )
            {
             before(grammarAccess.getUserDefinedCommandAccess().getNameAssignment_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1544:1: ( rule__UserDefinedCommand__NameAssignment_2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1544:2: rule__UserDefinedCommand__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__NameAssignment_2_in_rule__UserDefinedCommand__Group__2__Impl3142);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1554:1: rule__UserDefinedCommand__Group__3 : rule__UserDefinedCommand__Group__3__Impl rule__UserDefinedCommand__Group__4 ;
    public final void rule__UserDefinedCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1558:1: ( rule__UserDefinedCommand__Group__3__Impl rule__UserDefinedCommand__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1559:2: rule__UserDefinedCommand__Group__3__Impl rule__UserDefinedCommand__Group__4
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__3__Impl_in_rule__UserDefinedCommand__Group__33172);
            rule__UserDefinedCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__4_in_rule__UserDefinedCommand__Group__33175);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1566:1: rule__UserDefinedCommand__Group__3__Impl : ( 'AS' ) ;
    public final void rule__UserDefinedCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1570:1: ( ( 'AS' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1571:1: ( 'AS' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1571:1: ( 'AS' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1572:1: 'AS'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getASKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__UserDefinedCommand__Group__3__Impl3203); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1585:1: rule__UserDefinedCommand__Group__4 : rule__UserDefinedCommand__Group__4__Impl rule__UserDefinedCommand__Group__5 ;
    public final void rule__UserDefinedCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1589:1: ( rule__UserDefinedCommand__Group__4__Impl rule__UserDefinedCommand__Group__5 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1590:2: rule__UserDefinedCommand__Group__4__Impl rule__UserDefinedCommand__Group__5
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__4__Impl_in_rule__UserDefinedCommand__Group__43234);
            rule__UserDefinedCommand__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__5_in_rule__UserDefinedCommand__Group__43237);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1597:1: rule__UserDefinedCommand__Group__4__Impl : ( 'BEGIN' ) ;
    public final void rule__UserDefinedCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1601:1: ( ( 'BEGIN' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1602:1: ( 'BEGIN' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1602:1: ( 'BEGIN' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1603:1: 'BEGIN'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getBEGINKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__UserDefinedCommand__Group__4__Impl3265); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1616:1: rule__UserDefinedCommand__Group__5 : rule__UserDefinedCommand__Group__5__Impl rule__UserDefinedCommand__Group__6 ;
    public final void rule__UserDefinedCommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1620:1: ( rule__UserDefinedCommand__Group__5__Impl rule__UserDefinedCommand__Group__6 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1621:2: rule__UserDefinedCommand__Group__5__Impl rule__UserDefinedCommand__Group__6
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__5__Impl_in_rule__UserDefinedCommand__Group__53296);
            rule__UserDefinedCommand__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__6_in_rule__UserDefinedCommand__Group__53299);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1628:1: rule__UserDefinedCommand__Group__5__Impl : ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* ) ;
    public final void rule__UserDefinedCommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1632:1: ( ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1633:1: ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1633:1: ( ( rule__UserDefinedCommand__StatementsAssignment_5 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1634:1: ( rule__UserDefinedCommand__StatementsAssignment_5 )*
            {
             before(grammarAccess.getUserDefinedCommandAccess().getStatementsAssignment_5()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1635:1: ( rule__UserDefinedCommand__StatementsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=15 && LA10_0<=20)||LA10_0==38||LA10_0==44||LA10_0==46) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1635:2: rule__UserDefinedCommand__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__UserDefinedCommand__StatementsAssignment_5_in_rule__UserDefinedCommand__Group__5__Impl3326);
            	    rule__UserDefinedCommand__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1645:1: rule__UserDefinedCommand__Group__6 : rule__UserDefinedCommand__Group__6__Impl ;
    public final void rule__UserDefinedCommand__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1649:1: ( rule__UserDefinedCommand__Group__6__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1650:2: rule__UserDefinedCommand__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__UserDefinedCommand__Group__6__Impl_in_rule__UserDefinedCommand__Group__63357);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1656:1: rule__UserDefinedCommand__Group__6__Impl : ( 'END' ) ;
    public final void rule__UserDefinedCommand__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1660:1: ( ( 'END' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1661:1: ( 'END' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1661:1: ( 'END' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1662:1: 'END'
            {
             before(grammarAccess.getUserDefinedCommandAccess().getENDKeyword_6()); 
            match(input,35,FOLLOW_35_in_rule__UserDefinedCommand__Group__6__Impl3385); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1689:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1693:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1694:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__03430);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__1_in_rule__Main__Group__03433);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1701:1: rule__Main__Group__0__Impl : ( () ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1705:1: ( ( () ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1706:1: ( () )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1706:1: ( () )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1707:1: ()
            {
             before(grammarAccess.getMainAccess().getMainAction_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1708:1: ()
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1710:1: 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1720:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1724:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1725:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__13491);
            rule__Main__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__2_in_rule__Main__Group__13494);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1732:1: rule__Main__Group__1__Impl : ( 'BEGIN-MAIN' ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1736:1: ( ( 'BEGIN-MAIN' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1737:1: ( 'BEGIN-MAIN' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1737:1: ( 'BEGIN-MAIN' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1738:1: 'BEGIN-MAIN'
            {
             before(grammarAccess.getMainAccess().getBEGINMAINKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Main__Group__1__Impl3522); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1751:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1755:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1756:2: rule__Main__Group__2__Impl rule__Main__Group__3
            {
            pushFollow(FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__23553);
            rule__Main__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__3_in_rule__Main__Group__23556);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1763:1: rule__Main__Group__2__Impl : ( ( rule__Main__StatementsAssignment_2 )* ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1767:1: ( ( ( rule__Main__StatementsAssignment_2 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1768:1: ( ( rule__Main__StatementsAssignment_2 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1768:1: ( ( rule__Main__StatementsAssignment_2 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1769:1: ( rule__Main__StatementsAssignment_2 )*
            {
             before(grammarAccess.getMainAccess().getStatementsAssignment_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1770:1: ( rule__Main__StatementsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=15 && LA11_0<=20)||LA11_0==38||LA11_0==44||LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1770:2: rule__Main__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Main__StatementsAssignment_2_in_rule__Main__Group__2__Impl3583);
            	    rule__Main__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1780:1: rule__Main__Group__3 : rule__Main__Group__3__Impl ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1784:1: ( rule__Main__Group__3__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1785:2: rule__Main__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__33614);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1791:1: rule__Main__Group__3__Impl : ( 'END-MAIN' ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1795:1: ( ( 'END-MAIN' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1796:1: ( 'END-MAIN' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1796:1: ( 'END-MAIN' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1797:1: 'END-MAIN'
            {
             before(grammarAccess.getMainAccess().getENDMAINKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__Main__Group__3__Impl3642); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1818:1: rule__UserDefinedCommandStatement__Group__0 : rule__UserDefinedCommandStatement__Group__0__Impl rule__UserDefinedCommandStatement__Group__1 ;
    public final void rule__UserDefinedCommandStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1822:1: ( rule__UserDefinedCommandStatement__Group__0__Impl rule__UserDefinedCommandStatement__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1823:2: rule__UserDefinedCommandStatement__Group__0__Impl rule__UserDefinedCommandStatement__Group__1
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__0__Impl_in_rule__UserDefinedCommandStatement__Group__03681);
            rule__UserDefinedCommandStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__1_in_rule__UserDefinedCommandStatement__Group__03684);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1830:1: rule__UserDefinedCommandStatement__Group__0__Impl : ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) ) ;
    public final void rule__UserDefinedCommandStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1834:1: ( ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1835:1: ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1835:1: ( ( rule__UserDefinedCommandStatement__CommandAssignment_0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1836:1: ( rule__UserDefinedCommandStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getCommandAssignment_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1837:1: ( rule__UserDefinedCommandStatement__CommandAssignment_0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1837:2: rule__UserDefinedCommandStatement__CommandAssignment_0
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__CommandAssignment_0_in_rule__UserDefinedCommandStatement__Group__0__Impl3711);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1847:1: rule__UserDefinedCommandStatement__Group__1 : rule__UserDefinedCommandStatement__Group__1__Impl ;
    public final void rule__UserDefinedCommandStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1851:1: ( rule__UserDefinedCommandStatement__Group__1__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1852:2: rule__UserDefinedCommandStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UserDefinedCommandStatement__Group__1__Impl_in_rule__UserDefinedCommandStatement__Group__13741);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1858:1: rule__UserDefinedCommandStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__UserDefinedCommandStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1862:1: ( ( ';' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1863:1: ( ';' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1863:1: ( ';' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1864:1: ';'
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getSemicolonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__UserDefinedCommandStatement__Group__1__Impl3769); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1881:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1885:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1886:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__0__Impl_in_rule__IfStatement__Group__03804);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__1_in_rule__IfStatement__Group__03807);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1893:1: rule__IfStatement__Group__0__Impl : ( 'IF' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1897:1: ( ( 'IF' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1898:1: ( 'IF' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1898:1: ( 'IF' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1899:1: 'IF'
            {
             before(grammarAccess.getIfStatementAccess().getIFKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__IfStatement__Group__0__Impl3835); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1912:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1916:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1917:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__1__Impl_in_rule__IfStatement__Group__13866);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__2_in_rule__IfStatement__Group__13869);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1924:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1928:1: ( ( '(' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1929:1: ( '(' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1929:1: ( '(' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1930:1: '('
            {
             before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__IfStatement__Group__1__Impl3897); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1943:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1947:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1948:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__2__Impl_in_rule__IfStatement__Group__23928);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__3_in_rule__IfStatement__Group__23931);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1955:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__ConditionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1959:1: ( ( ( rule__IfStatement__ConditionAssignment_2 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1960:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1960:1: ( ( rule__IfStatement__ConditionAssignment_2 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1961:1: ( rule__IfStatement__ConditionAssignment_2 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1962:1: ( rule__IfStatement__ConditionAssignment_2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1962:2: rule__IfStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__IfStatement__ConditionAssignment_2_in_rule__IfStatement__Group__2__Impl3958);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1972:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1976:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1977:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__3__Impl_in_rule__IfStatement__Group__33988);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__4_in_rule__IfStatement__Group__33991);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1984:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1988:1: ( ( ')' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1989:1: ( ')' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1989:1: ( ')' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:1990:1: ')'
            {
             before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__IfStatement__Group__3__Impl4019); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2003:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2007:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2008:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__4__Impl_in_rule__IfStatement__Group__44050);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__5_in_rule__IfStatement__Group__44053);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2015:1: rule__IfStatement__Group__4__Impl : ( '{' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2019:1: ( ( '{' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2020:1: ( '{' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2020:1: ( '{' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2021:1: '{'
            {
             before(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__IfStatement__Group__4__Impl4081); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2034:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2038:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2039:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__5__Impl_in_rule__IfStatement__Group__54112);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__6_in_rule__IfStatement__Group__54115);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2046:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__StatementsAssignment_5 )* ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2050:1: ( ( ( rule__IfStatement__StatementsAssignment_5 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2051:1: ( ( rule__IfStatement__StatementsAssignment_5 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2051:1: ( ( rule__IfStatement__StatementsAssignment_5 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2052:1: ( rule__IfStatement__StatementsAssignment_5 )*
            {
             before(grammarAccess.getIfStatementAccess().getStatementsAssignment_5()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2053:1: ( rule__IfStatement__StatementsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=15 && LA12_0<=20)||LA12_0==38||LA12_0==44||LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2053:2: rule__IfStatement__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__IfStatement__StatementsAssignment_5_in_rule__IfStatement__Group__5__Impl4142);
            	    rule__IfStatement__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2063:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7 ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2067:1: ( rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2068:2: rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__6__Impl_in_rule__IfStatement__Group__64173);
            rule__IfStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__7_in_rule__IfStatement__Group__64176);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2075:1: rule__IfStatement__Group__6__Impl : ( '}' ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2079:1: ( ( '}' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2080:1: ( '}' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2080:1: ( '}' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2081:1: '}'
            {
             before(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__IfStatement__Group__6__Impl4204); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2094:1: rule__IfStatement__Group__7 : rule__IfStatement__Group__7__Impl ;
    public final void rule__IfStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2098:1: ( rule__IfStatement__Group__7__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2099:2: rule__IfStatement__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__7__Impl_in_rule__IfStatement__Group__74235);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2105:1: rule__IfStatement__Group__7__Impl : ( ( rule__IfStatement__Group_7__0 )? ) ;
    public final void rule__IfStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2109:1: ( ( ( rule__IfStatement__Group_7__0 )? ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2110:1: ( ( rule__IfStatement__Group_7__0 )? )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2110:1: ( ( rule__IfStatement__Group_7__0 )? )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2111:1: ( rule__IfStatement__Group_7__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_7()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2112:1: ( rule__IfStatement__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2112:2: rule__IfStatement__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_7__0_in_rule__IfStatement__Group__7__Impl4262);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2138:1: rule__IfStatement__Group_7__0 : rule__IfStatement__Group_7__0__Impl rule__IfStatement__Group_7__1 ;
    public final void rule__IfStatement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2142:1: ( rule__IfStatement__Group_7__0__Impl rule__IfStatement__Group_7__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2143:2: rule__IfStatement__Group_7__0__Impl rule__IfStatement__Group_7__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__0__Impl_in_rule__IfStatement__Group_7__04309);
            rule__IfStatement__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_7__1_in_rule__IfStatement__Group_7__04312);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2150:1: rule__IfStatement__Group_7__0__Impl : ( 'ELSE' ) ;
    public final void rule__IfStatement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2154:1: ( ( 'ELSE' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2155:1: ( 'ELSE' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2155:1: ( 'ELSE' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2156:1: 'ELSE'
            {
             before(grammarAccess.getIfStatementAccess().getELSEKeyword_7_0()); 
            match(input,43,FOLLOW_43_in_rule__IfStatement__Group_7__0__Impl4340); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2169:1: rule__IfStatement__Group_7__1 : rule__IfStatement__Group_7__1__Impl rule__IfStatement__Group_7__2 ;
    public final void rule__IfStatement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2173:1: ( rule__IfStatement__Group_7__1__Impl rule__IfStatement__Group_7__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2174:2: rule__IfStatement__Group_7__1__Impl rule__IfStatement__Group_7__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__1__Impl_in_rule__IfStatement__Group_7__14371);
            rule__IfStatement__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_7__2_in_rule__IfStatement__Group_7__14374);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2181:1: rule__IfStatement__Group_7__1__Impl : ( '{' ) ;
    public final void rule__IfStatement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2185:1: ( ( '{' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2186:1: ( '{' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2186:1: ( '{' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2187:1: '{'
            {
             before(grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,41,FOLLOW_41_in_rule__IfStatement__Group_7__1__Impl4402); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2200:1: rule__IfStatement__Group_7__2 : rule__IfStatement__Group_7__2__Impl rule__IfStatement__Group_7__3 ;
    public final void rule__IfStatement__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2204:1: ( rule__IfStatement__Group_7__2__Impl rule__IfStatement__Group_7__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2205:2: rule__IfStatement__Group_7__2__Impl rule__IfStatement__Group_7__3
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__2__Impl_in_rule__IfStatement__Group_7__24433);
            rule__IfStatement__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_7__3_in_rule__IfStatement__Group_7__24436);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2212:1: rule__IfStatement__Group_7__2__Impl : ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* ) ;
    public final void rule__IfStatement__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2216:1: ( ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2217:1: ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2217:1: ( ( rule__IfStatement__ElseStatementsAssignment_7_2 )* )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2218:1: ( rule__IfStatement__ElseStatementsAssignment_7_2 )*
            {
             before(grammarAccess.getIfStatementAccess().getElseStatementsAssignment_7_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2219:1: ( rule__IfStatement__ElseStatementsAssignment_7_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=15 && LA14_0<=20)||LA14_0==38||LA14_0==44||LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2219:2: rule__IfStatement__ElseStatementsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__IfStatement__ElseStatementsAssignment_7_2_in_rule__IfStatement__Group_7__2__Impl4463);
            	    rule__IfStatement__ElseStatementsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2229:1: rule__IfStatement__Group_7__3 : rule__IfStatement__Group_7__3__Impl ;
    public final void rule__IfStatement__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2233:1: ( rule__IfStatement__Group_7__3__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2234:2: rule__IfStatement__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_7__3__Impl_in_rule__IfStatement__Group_7__34494);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2240:1: rule__IfStatement__Group_7__3__Impl : ( '}' ) ;
    public final void rule__IfStatement__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2244:1: ( ( '}' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2245:1: ( '}' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2245:1: ( '}' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2246:1: '}'
            {
             before(grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,42,FOLLOW_42_in_rule__IfStatement__Group_7__3__Impl4522); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2267:1: rule__IterateStatement__Group__0 : rule__IterateStatement__Group__0__Impl rule__IterateStatement__Group__1 ;
    public final void rule__IterateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2271:1: ( rule__IterateStatement__Group__0__Impl rule__IterateStatement__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2272:2: rule__IterateStatement__Group__0__Impl rule__IterateStatement__Group__1
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__0__Impl_in_rule__IterateStatement__Group__04561);
            rule__IterateStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__1_in_rule__IterateStatement__Group__04564);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2279:1: rule__IterateStatement__Group__0__Impl : ( 'ITERATE' ) ;
    public final void rule__IterateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2283:1: ( ( 'ITERATE' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2284:1: ( 'ITERATE' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2284:1: ( 'ITERATE' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2285:1: 'ITERATE'
            {
             before(grammarAccess.getIterateStatementAccess().getITERATEKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__IterateStatement__Group__0__Impl4592); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2298:1: rule__IterateStatement__Group__1 : rule__IterateStatement__Group__1__Impl rule__IterateStatement__Group__2 ;
    public final void rule__IterateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2302:1: ( rule__IterateStatement__Group__1__Impl rule__IterateStatement__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2303:2: rule__IterateStatement__Group__1__Impl rule__IterateStatement__Group__2
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__1__Impl_in_rule__IterateStatement__Group__14623);
            rule__IterateStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__2_in_rule__IterateStatement__Group__14626);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2310:1: rule__IterateStatement__Group__1__Impl : ( ( rule__IterateStatement__TimesAssignment_1 ) ) ;
    public final void rule__IterateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2314:1: ( ( ( rule__IterateStatement__TimesAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2315:1: ( ( rule__IterateStatement__TimesAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2315:1: ( ( rule__IterateStatement__TimesAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2316:1: ( rule__IterateStatement__TimesAssignment_1 )
            {
             before(grammarAccess.getIterateStatementAccess().getTimesAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2317:1: ( rule__IterateStatement__TimesAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2317:2: rule__IterateStatement__TimesAssignment_1
            {
            pushFollow(FOLLOW_rule__IterateStatement__TimesAssignment_1_in_rule__IterateStatement__Group__1__Impl4653);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2327:1: rule__IterateStatement__Group__2 : rule__IterateStatement__Group__2__Impl rule__IterateStatement__Group__3 ;
    public final void rule__IterateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2331:1: ( rule__IterateStatement__Group__2__Impl rule__IterateStatement__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2332:2: rule__IterateStatement__Group__2__Impl rule__IterateStatement__Group__3
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__2__Impl_in_rule__IterateStatement__Group__24683);
            rule__IterateStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__3_in_rule__IterateStatement__Group__24686);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2339:1: rule__IterateStatement__Group__2__Impl : ( 'TIMES' ) ;
    public final void rule__IterateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2343:1: ( ( 'TIMES' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2344:1: ( 'TIMES' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2344:1: ( 'TIMES' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2345:1: 'TIMES'
            {
             before(grammarAccess.getIterateStatementAccess().getTIMESKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__IterateStatement__Group__2__Impl4714); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2358:1: rule__IterateStatement__Group__3 : rule__IterateStatement__Group__3__Impl rule__IterateStatement__Group__4 ;
    public final void rule__IterateStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2362:1: ( rule__IterateStatement__Group__3__Impl rule__IterateStatement__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2363:2: rule__IterateStatement__Group__3__Impl rule__IterateStatement__Group__4
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__3__Impl_in_rule__IterateStatement__Group__34745);
            rule__IterateStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__4_in_rule__IterateStatement__Group__34748);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2370:1: rule__IterateStatement__Group__3__Impl : ( '{' ) ;
    public final void rule__IterateStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2374:1: ( ( '{' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2375:1: ( '{' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2375:1: ( '{' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2376:1: '{'
            {
             before(grammarAccess.getIterateStatementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__IterateStatement__Group__3__Impl4776); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2389:1: rule__IterateStatement__Group__4 : rule__IterateStatement__Group__4__Impl rule__IterateStatement__Group__5 ;
    public final void rule__IterateStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2393:1: ( rule__IterateStatement__Group__4__Impl rule__IterateStatement__Group__5 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2394:2: rule__IterateStatement__Group__4__Impl rule__IterateStatement__Group__5
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__4__Impl_in_rule__IterateStatement__Group__44807);
            rule__IterateStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterateStatement__Group__5_in_rule__IterateStatement__Group__44810);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2401:1: rule__IterateStatement__Group__4__Impl : ( ( rule__IterateStatement__StatementsAssignment_4 ) ) ;
    public final void rule__IterateStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2405:1: ( ( ( rule__IterateStatement__StatementsAssignment_4 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2406:1: ( ( rule__IterateStatement__StatementsAssignment_4 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2406:1: ( ( rule__IterateStatement__StatementsAssignment_4 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2407:1: ( rule__IterateStatement__StatementsAssignment_4 )
            {
             before(grammarAccess.getIterateStatementAccess().getStatementsAssignment_4()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2408:1: ( rule__IterateStatement__StatementsAssignment_4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2408:2: rule__IterateStatement__StatementsAssignment_4
            {
            pushFollow(FOLLOW_rule__IterateStatement__StatementsAssignment_4_in_rule__IterateStatement__Group__4__Impl4837);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2418:1: rule__IterateStatement__Group__5 : rule__IterateStatement__Group__5__Impl ;
    public final void rule__IterateStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2422:1: ( rule__IterateStatement__Group__5__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2423:2: rule__IterateStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__IterateStatement__Group__5__Impl_in_rule__IterateStatement__Group__54867);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2429:1: rule__IterateStatement__Group__5__Impl : ( '}' ) ;
    public final void rule__IterateStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2433:1: ( ( '}' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2434:1: ( '}' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2434:1: ( '}' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2435:1: '}'
            {
             before(grammarAccess.getIterateStatementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__IterateStatement__Group__5__Impl4895); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2460:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2464:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2465:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__0__Impl_in_rule__WhileStatement__Group__04938);
            rule__WhileStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__1_in_rule__WhileStatement__Group__04941);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2472:1: rule__WhileStatement__Group__0__Impl : ( 'WHILE' ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2476:1: ( ( 'WHILE' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2477:1: ( 'WHILE' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2477:1: ( 'WHILE' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2478:1: 'WHILE'
            {
             before(grammarAccess.getWhileStatementAccess().getWHILEKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__WhileStatement__Group__0__Impl4969); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2491:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2495:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2496:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__1__Impl_in_rule__WhileStatement__Group__15000);
            rule__WhileStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__2_in_rule__WhileStatement__Group__15003);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2503:1: rule__WhileStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2507:1: ( ( '(' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2508:1: ( '(' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2508:1: ( '(' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2509:1: '('
            {
             before(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__WhileStatement__Group__1__Impl5031); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2522:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2526:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2527:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__2__Impl_in_rule__WhileStatement__Group__25062);
            rule__WhileStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__3_in_rule__WhileStatement__Group__25065);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2534:1: rule__WhileStatement__Group__2__Impl : ( ( rule__WhileStatement__ConditionAssignment_2 ) ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2538:1: ( ( ( rule__WhileStatement__ConditionAssignment_2 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2539:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2539:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2540:1: ( rule__WhileStatement__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhileStatementAccess().getConditionAssignment_2()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2541:1: ( rule__WhileStatement__ConditionAssignment_2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2541:2: rule__WhileStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__WhileStatement__ConditionAssignment_2_in_rule__WhileStatement__Group__2__Impl5092);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2551:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2555:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2556:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__3__Impl_in_rule__WhileStatement__Group__35122);
            rule__WhileStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__4_in_rule__WhileStatement__Group__35125);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2563:1: rule__WhileStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2567:1: ( ( ')' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2568:1: ( ')' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2568:1: ( ')' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2569:1: ')'
            {
             before(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__WhileStatement__Group__3__Impl5153); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2582:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5 ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2586:1: ( rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2587:2: rule__WhileStatement__Group__4__Impl rule__WhileStatement__Group__5
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__4__Impl_in_rule__WhileStatement__Group__45184);
            rule__WhileStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__5_in_rule__WhileStatement__Group__45187);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2594:1: rule__WhileStatement__Group__4__Impl : ( '{' ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2598:1: ( ( '{' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2599:1: ( '{' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2599:1: ( '{' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2600:1: '{'
            {
             before(grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__WhileStatement__Group__4__Impl5215); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2613:1: rule__WhileStatement__Group__5 : rule__WhileStatement__Group__5__Impl rule__WhileStatement__Group__6 ;
    public final void rule__WhileStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2617:1: ( rule__WhileStatement__Group__5__Impl rule__WhileStatement__Group__6 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2618:2: rule__WhileStatement__Group__5__Impl rule__WhileStatement__Group__6
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__5__Impl_in_rule__WhileStatement__Group__55246);
            rule__WhileStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhileStatement__Group__6_in_rule__WhileStatement__Group__55249);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2625:1: rule__WhileStatement__Group__5__Impl : ( ( rule__WhileStatement__StatementsAssignment_5 ) ) ;
    public final void rule__WhileStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2629:1: ( ( ( rule__WhileStatement__StatementsAssignment_5 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2630:1: ( ( rule__WhileStatement__StatementsAssignment_5 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2630:1: ( ( rule__WhileStatement__StatementsAssignment_5 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2631:1: ( rule__WhileStatement__StatementsAssignment_5 )
            {
             before(grammarAccess.getWhileStatementAccess().getStatementsAssignment_5()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2632:1: ( rule__WhileStatement__StatementsAssignment_5 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2632:2: rule__WhileStatement__StatementsAssignment_5
            {
            pushFollow(FOLLOW_rule__WhileStatement__StatementsAssignment_5_in_rule__WhileStatement__Group__5__Impl5276);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2642:1: rule__WhileStatement__Group__6 : rule__WhileStatement__Group__6__Impl ;
    public final void rule__WhileStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2646:1: ( rule__WhileStatement__Group__6__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2647:2: rule__WhileStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__WhileStatement__Group__6__Impl_in_rule__WhileStatement__Group__65306);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2653:1: rule__WhileStatement__Group__6__Impl : ( '}' ) ;
    public final void rule__WhileStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2657:1: ( ( '}' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2658:1: ( '}' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2658:1: ( '}' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2659:1: '}'
            {
             before(grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__WhileStatement__Group__6__Impl5334); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2686:1: rule__DocumentationComment__Group__0 : rule__DocumentationComment__Group__0__Impl rule__DocumentationComment__Group__1 ;
    public final void rule__DocumentationComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2690:1: ( rule__DocumentationComment__Group__0__Impl rule__DocumentationComment__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2691:2: rule__DocumentationComment__Group__0__Impl rule__DocumentationComment__Group__1
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__0__Impl_in_rule__DocumentationComment__Group__05379);
            rule__DocumentationComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DocumentationComment__Group__1_in_rule__DocumentationComment__Group__05382);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2698:1: rule__DocumentationComment__Group__0__Impl : ( '@(' ) ;
    public final void rule__DocumentationComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2702:1: ( ( '@(' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2703:1: ( '@(' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2703:1: ( '@(' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2704:1: '@('
            {
             before(grammarAccess.getDocumentationCommentAccess().getCommercialAtLeftParenthesisKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__DocumentationComment__Group__0__Impl5410); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2717:1: rule__DocumentationComment__Group__1 : rule__DocumentationComment__Group__1__Impl rule__DocumentationComment__Group__2 ;
    public final void rule__DocumentationComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2721:1: ( rule__DocumentationComment__Group__1__Impl rule__DocumentationComment__Group__2 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2722:2: rule__DocumentationComment__Group__1__Impl rule__DocumentationComment__Group__2
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__1__Impl_in_rule__DocumentationComment__Group__15441);
            rule__DocumentationComment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DocumentationComment__Group__2_in_rule__DocumentationComment__Group__15444);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2729:1: rule__DocumentationComment__Group__1__Impl : ( ( rule__DocumentationComment__TextAssignment_1 ) ) ;
    public final void rule__DocumentationComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2733:1: ( ( ( rule__DocumentationComment__TextAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2734:1: ( ( rule__DocumentationComment__TextAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2734:1: ( ( rule__DocumentationComment__TextAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2735:1: ( rule__DocumentationComment__TextAssignment_1 )
            {
             before(grammarAccess.getDocumentationCommentAccess().getTextAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2736:1: ( rule__DocumentationComment__TextAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2736:2: rule__DocumentationComment__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__DocumentationComment__TextAssignment_1_in_rule__DocumentationComment__Group__1__Impl5471);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2746:1: rule__DocumentationComment__Group__2 : rule__DocumentationComment__Group__2__Impl ;
    public final void rule__DocumentationComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2750:1: ( rule__DocumentationComment__Group__2__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2751:2: rule__DocumentationComment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DocumentationComment__Group__2__Impl_in_rule__DocumentationComment__Group__25501);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2757:1: rule__DocumentationComment__Group__2__Impl : ( ')' ) ;
    public final void rule__DocumentationComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2761:1: ( ( ')' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2762:1: ( ')' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2762:1: ( ')' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2763:1: ')'
            {
             before(grammarAccess.getDocumentationCommentAccess().getRightParenthesisKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__DocumentationComment__Group__2__Impl5529); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2782:1: rule__CommandStatement__Group__0 : rule__CommandStatement__Group__0__Impl rule__CommandStatement__Group__1 ;
    public final void rule__CommandStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2786:1: ( rule__CommandStatement__Group__0__Impl rule__CommandStatement__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2787:2: rule__CommandStatement__Group__0__Impl rule__CommandStatement__Group__1
            {
            pushFollow(FOLLOW_rule__CommandStatement__Group__0__Impl_in_rule__CommandStatement__Group__05566);
            rule__CommandStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandStatement__Group__1_in_rule__CommandStatement__Group__05569);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2794:1: rule__CommandStatement__Group__0__Impl : ( ( rule__CommandStatement__KindAssignment_0 ) ) ;
    public final void rule__CommandStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2798:1: ( ( ( rule__CommandStatement__KindAssignment_0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2799:1: ( ( rule__CommandStatement__KindAssignment_0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2799:1: ( ( rule__CommandStatement__KindAssignment_0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2800:1: ( rule__CommandStatement__KindAssignment_0 )
            {
             before(grammarAccess.getCommandStatementAccess().getKindAssignment_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2801:1: ( rule__CommandStatement__KindAssignment_0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2801:2: rule__CommandStatement__KindAssignment_0
            {
            pushFollow(FOLLOW_rule__CommandStatement__KindAssignment_0_in_rule__CommandStatement__Group__0__Impl5596);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2811:1: rule__CommandStatement__Group__1 : rule__CommandStatement__Group__1__Impl ;
    public final void rule__CommandStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2815:1: ( rule__CommandStatement__Group__1__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2816:2: rule__CommandStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CommandStatement__Group__1__Impl_in_rule__CommandStatement__Group__15626);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2822:1: rule__CommandStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__CommandStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2826:1: ( ( ';' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2827:1: ( ';' )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2827:1: ( ';' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2828:1: ';'
            {
             before(grammarAccess.getCommandStatementAccess().getSemicolonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__CommandStatement__Group__1__Impl5654); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2845:1: rule__ConditionExpr__Group__0 : rule__ConditionExpr__Group__0__Impl rule__ConditionExpr__Group__1 ;
    public final void rule__ConditionExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2849:1: ( rule__ConditionExpr__Group__0__Impl rule__ConditionExpr__Group__1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2850:2: rule__ConditionExpr__Group__0__Impl rule__ConditionExpr__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionExpr__Group__0__Impl_in_rule__ConditionExpr__Group__05689);
            rule__ConditionExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionExpr__Group__1_in_rule__ConditionExpr__Group__05692);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2857:1: rule__ConditionExpr__Group__0__Impl : ( ( rule__ConditionExpr__NegationAssignment_0 ) ) ;
    public final void rule__ConditionExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2861:1: ( ( ( rule__ConditionExpr__NegationAssignment_0 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2862:1: ( ( rule__ConditionExpr__NegationAssignment_0 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2862:1: ( ( rule__ConditionExpr__NegationAssignment_0 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2863:1: ( rule__ConditionExpr__NegationAssignment_0 )
            {
             before(grammarAccess.getConditionExprAccess().getNegationAssignment_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2864:1: ( rule__ConditionExpr__NegationAssignment_0 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2864:2: rule__ConditionExpr__NegationAssignment_0
            {
            pushFollow(FOLLOW_rule__ConditionExpr__NegationAssignment_0_in_rule__ConditionExpr__Group__0__Impl5719);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2874:1: rule__ConditionExpr__Group__1 : rule__ConditionExpr__Group__1__Impl ;
    public final void rule__ConditionExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2878:1: ( rule__ConditionExpr__Group__1__Impl )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2879:2: rule__ConditionExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionExpr__Group__1__Impl_in_rule__ConditionExpr__Group__15749);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2885:1: rule__ConditionExpr__Group__1__Impl : ( ( rule__ConditionExpr__ExprAssignment_1 ) ) ;
    public final void rule__ConditionExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2889:1: ( ( ( rule__ConditionExpr__ExprAssignment_1 ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2890:1: ( ( rule__ConditionExpr__ExprAssignment_1 ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2890:1: ( ( rule__ConditionExpr__ExprAssignment_1 ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2891:1: ( rule__ConditionExpr__ExprAssignment_1 )
            {
             before(grammarAccess.getConditionExprAccess().getExprAssignment_1()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2892:1: ( rule__ConditionExpr__ExprAssignment_1 )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2892:2: rule__ConditionExpr__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__ConditionExpr__ExprAssignment_1_in_rule__ConditionExpr__Group__1__Impl5776);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2907:1: rule__Program__InitSectionAssignment_1 : ( ruleInitSection ) ;
    public final void rule__Program__InitSectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2911:1: ( ( ruleInitSection ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2912:1: ( ruleInitSection )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2912:1: ( ruleInitSection )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2913:1: ruleInitSection
            {
             before(grammarAccess.getProgramAccess().getInitSectionInitSectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInitSection_in_rule__Program__InitSectionAssignment_15815);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2922:1: rule__Program__UserDefinedCommandsAssignment_2 : ( ruleUserDefinedCommand ) ;
    public final void rule__Program__UserDefinedCommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2926:1: ( ( ruleUserDefinedCommand ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2927:1: ( ruleUserDefinedCommand )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2927:1: ( ruleUserDefinedCommand )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2928:1: ruleUserDefinedCommand
            {
             before(grammarAccess.getProgramAccess().getUserDefinedCommandsUserDefinedCommandParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUserDefinedCommand_in_rule__Program__UserDefinedCommandsAssignment_25846);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2937:1: rule__Program__MainAssignment_3 : ( ruleMain ) ;
    public final void rule__Program__MainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2941:1: ( ( ruleMain ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2942:1: ( ruleMain )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2942:1: ( ruleMain )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2943:1: ruleMain
            {
             before(grammarAccess.getProgramAccess().getMainMainParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMain_in_rule__Program__MainAssignment_35877);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2952:1: rule__InitSection__InitCommandsAssignment_1 : ( ruleInitCommand ) ;
    public final void rule__InitSection__InitCommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2956:1: ( ( ruleInitCommand ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2957:1: ( ruleInitCommand )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2957:1: ( ruleInitCommand )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2958:1: ruleInitCommand
            {
             before(grammarAccess.getInitSectionAccess().getInitCommandsInitCommandParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInitCommand_in_rule__InitSection__InitCommandsAssignment_15908);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2967:1: rule__InitPositionCommand__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__InitPositionCommand__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2971:1: ( ( RULE_INT ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2972:1: ( RULE_INT )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2972:1: ( RULE_INT )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2973:1: RULE_INT
            {
             before(grammarAccess.getInitPositionCommandAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitPositionCommand__XAssignment_15939); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2982:1: rule__InitPositionCommand__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__InitPositionCommand__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2986:1: ( ( RULE_INT ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2987:1: ( RULE_INT )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2987:1: ( RULE_INT )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2988:1: RULE_INT
            {
             before(grammarAccess.getInitPositionCommandAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitPositionCommand__YAssignment_35970); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:2997:1: rule__InitHeadingCommand__HeadingAssignment_1 : ( ruleHeadingKind ) ;
    public final void rule__InitHeadingCommand__HeadingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3001:1: ( ( ruleHeadingKind ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3002:1: ( ruleHeadingKind )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3002:1: ( ruleHeadingKind )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3003:1: ruleHeadingKind
            {
             before(grammarAccess.getInitHeadingCommandAccess().getHeadingHeadingKindParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHeadingKind_in_rule__InitHeadingCommand__HeadingAssignment_16001);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3012:1: rule__InitBoardSizeCommand__WidthAssignment_1 : ( RULE_INT ) ;
    public final void rule__InitBoardSizeCommand__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3016:1: ( ( RULE_INT ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3017:1: ( RULE_INT )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3017:1: ( RULE_INT )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3018:1: RULE_INT
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getWidthINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__WidthAssignment_16032); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3027:1: rule__InitBoardSizeCommand__HeightAssignment_3 : ( RULE_INT ) ;
    public final void rule__InitBoardSizeCommand__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3031:1: ( ( RULE_INT ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3032:1: ( RULE_INT )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3032:1: ( RULE_INT )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3033:1: RULE_INT
            {
             before(grammarAccess.getInitBoardSizeCommandAccess().getHeightINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__HeightAssignment_36063); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3042:1: rule__UserDefinedCommand__DocAssignment_0 : ( ruleDocumentationComment ) ;
    public final void rule__UserDefinedCommand__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3046:1: ( ( ruleDocumentationComment ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3047:1: ( ruleDocumentationComment )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3047:1: ( ruleDocumentationComment )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3048:1: ruleDocumentationComment
            {
             before(grammarAccess.getUserDefinedCommandAccess().getDocDocumentationCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDocumentationComment_in_rule__UserDefinedCommand__DocAssignment_06094);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3057:1: rule__UserDefinedCommand__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__UserDefinedCommand__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3061:1: ( ( RULE_ID ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3062:1: ( RULE_ID )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3062:1: ( RULE_ID )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3063:1: RULE_ID
            {
             before(grammarAccess.getUserDefinedCommandAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserDefinedCommand__NameAssignment_26125); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3072:1: rule__UserDefinedCommand__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__UserDefinedCommand__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3076:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3077:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3077:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3078:1: ruleStatement
            {
             before(grammarAccess.getUserDefinedCommandAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__UserDefinedCommand__StatementsAssignment_56156);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3087:1: rule__Main__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Main__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3091:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3092:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3092:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3093:1: ruleStatement
            {
             before(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Main__StatementsAssignment_26187);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3102:1: rule__UserDefinedCommandStatement__CommandAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UserDefinedCommandStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3106:1: ( ( ( RULE_ID ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3107:1: ( ( RULE_ID ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3107:1: ( ( RULE_ID ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3108:1: ( RULE_ID )
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandCrossReference_0_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3109:1: ( RULE_ID )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3110:1: RULE_ID
            {
             before(grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserDefinedCommandStatement__CommandAssignment_06222); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3121:1: rule__IfStatement__ConditionAssignment_2 : ( ruleConditionExpr ) ;
    public final void rule__IfStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3125:1: ( ( ruleConditionExpr ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3126:1: ( ruleConditionExpr )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3126:1: ( ruleConditionExpr )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3127:1: ruleConditionExpr
            {
             before(grammarAccess.getIfStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConditionExpr_in_rule__IfStatement__ConditionAssignment_26257);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3136:1: rule__IfStatement__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__IfStatement__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3140:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3141:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3141:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3142:1: ruleStatement
            {
             before(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__IfStatement__StatementsAssignment_56288);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3151:1: rule__IfStatement__ElseStatementsAssignment_7_2 : ( ruleStatement ) ;
    public final void rule__IfStatement__ElseStatementsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3155:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3156:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3156:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3157:1: ruleStatement
            {
             before(grammarAccess.getIfStatementAccess().getElseStatementsStatementParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__IfStatement__ElseStatementsAssignment_7_26319);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3166:1: rule__IterateStatement__TimesAssignment_1 : ( RULE_INT ) ;
    public final void rule__IterateStatement__TimesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3170:1: ( ( RULE_INT ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3171:1: ( RULE_INT )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3171:1: ( RULE_INT )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3172:1: RULE_INT
            {
             before(grammarAccess.getIterateStatementAccess().getTimesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IterateStatement__TimesAssignment_16350); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3181:1: rule__IterateStatement__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__IterateStatement__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3185:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3186:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3186:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3187:1: ruleStatement
            {
             before(grammarAccess.getIterateStatementAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__IterateStatement__StatementsAssignment_46381);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3196:1: rule__WhileStatement__ConditionAssignment_2 : ( ruleConditionExpr ) ;
    public final void rule__WhileStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3200:1: ( ( ruleConditionExpr ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3201:1: ( ruleConditionExpr )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3201:1: ( ruleConditionExpr )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3202:1: ruleConditionExpr
            {
             before(grammarAccess.getWhileStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConditionExpr_in_rule__WhileStatement__ConditionAssignment_26412);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3211:1: rule__WhileStatement__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__WhileStatement__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3215:1: ( ( ruleStatement ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3216:1: ( ruleStatement )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3216:1: ( ruleStatement )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3217:1: ruleStatement
            {
             before(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__WhileStatement__StatementsAssignment_56443);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3226:1: rule__DocumentationComment__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DocumentationComment__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3230:1: ( ( RULE_STRING ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3231:1: ( RULE_STRING )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3231:1: ( RULE_STRING )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3232:1: RULE_STRING
            {
             before(grammarAccess.getDocumentationCommentAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DocumentationComment__TextAssignment_16474); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3241:1: rule__CommandStatement__KindAssignment_0 : ( ruleCommandKind ) ;
    public final void rule__CommandStatement__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3245:1: ( ( ruleCommandKind ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3246:1: ( ruleCommandKind )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3246:1: ( ruleCommandKind )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3247:1: ruleCommandKind
            {
             before(grammarAccess.getCommandStatementAccess().getKindCommandKindParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommandKind_in_rule__CommandStatement__KindAssignment_06505);
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3256:1: rule__ConditionExpr__NegationAssignment_0 : ( ( '!' ) ) ;
    public final void rule__ConditionExpr__NegationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3260:1: ( ( ( '!' ) ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3261:1: ( ( '!' ) )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3261:1: ( ( '!' ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3262:1: ( '!' )
            {
             before(grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0()); 
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3263:1: ( '!' )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3264:1: '!'
            {
             before(grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__ConditionExpr__NegationAssignment_06541); 
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
    // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3279:1: rule__ConditionExpr__ExprAssignment_1 : ( ruleConditionKind ) ;
    public final void rule__ConditionExpr__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3283:1: ( ( ruleConditionKind ) )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3284:1: ( ruleConditionKind )
            {
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3284:1: ( ruleConditionKind )
            // ../org.macjariel.karel.ui/src-gen/org/macjariel/karel/ui/contentassist/antlr/internal/InternalKarel.g:3285:1: ruleConditionKind
            {
             before(grammarAccess.getConditionExprAccess().getExprConditionKindParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionKind_in_rule__ConditionExpr__ExprAssignment_16580);
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
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__0_in_ruleUserDefinedCommandStatement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__0_in_ruleIfStatement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterateStatement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__0_in_ruleIterateStatement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__0_in_ruleWhileStatement874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentationComment908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__0_in_ruleDocumentationComment934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandStatement968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__0_in_ruleCommandStatement994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandKind_in_entryRuleCommandKind1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandKind1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandKind__Alternatives_in_ruleCommandKind1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionExpr1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__0_in_ruleConditionExpr1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionKind_in_entryRuleConditionKind1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionKind1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionKind__Alternatives_in_ruleConditionKind1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitPositionCommand_in_rule__InitCommand__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitHeadingCommand_in_rule__InitCommand__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitBoardSizeCommand_in_rule__InitCommand__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__HeadingKind__Alternatives1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__HeadingKind__Alternatives1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HeadingKind__Alternatives1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HeadingKind__Alternatives1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_rule__Statement__Alternatives1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_rule__Statement__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_rule__Statement__Alternatives1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_rule__Statement__Alternatives1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_rule__Statement__Alternatives1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CommandKind__Alternatives1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CommandKind__Alternatives1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CommandKind__Alternatives1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CommandKind__Alternatives1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CommandKind__Alternatives1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CommandKind__Alternatives1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ConditionKind__Alternatives1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ConditionKind__Alternatives1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01659 = new BitSet(new long[]{0x0000801102000000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Program__Group__0__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11721 = new BitSet(new long[]{0x0000801102000000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__InitSectionAssignment_1_in_rule__Program__Group__1__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21782 = new BitSet(new long[]{0x0000801102000000L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__UserDefinedCommandsAssignment_2_in_rule__Program__Group__2__Impl1812 = new BitSet(new long[]{0x0000800100000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31843 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__MainAssignment_3_in_rule__Program__Group__3__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Program__Group__4__Impl1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitSection__Group__0__Impl_in_rule__InitSection__Group__01972 = new BitSet(new long[]{0x00000000C8000000L});
    public static final BitSet FOLLOW_rule__InitSection__Group__1_in_rule__InitSection__Group__01975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InitSection__Group__0__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitSection__Group__1__Impl_in_rule__InitSection__Group__12034 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__InitSection__Group__2_in_rule__InitSection__Group__12037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2066 = new BitSet(new long[]{0x00000000C8000002L});
    public static final BitSet FOLLOW_rule__InitSection__InitCommandsAssignment_1_in_rule__InitSection__Group__1__Impl2078 = new BitSet(new long[]{0x00000000C8000002L});
    public static final BitSet FOLLOW_rule__InitSection__Group__2__Impl_in_rule__InitSection__Group__22111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__InitSection__Group__2__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__0__Impl_in_rule__InitPositionCommand__Group__02176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__1_in_rule__InitPositionCommand__Group__02179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__InitPositionCommand__Group__0__Impl2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__1__Impl_in_rule__InitPositionCommand__Group__12238 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__2_in_rule__InitPositionCommand__Group__12241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__XAssignment_1_in_rule__InitPositionCommand__Group__1__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__2__Impl_in_rule__InitPositionCommand__Group__22298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__3_in_rule__InitPositionCommand__Group__22301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__InitPositionCommand__Group__2__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__3__Impl_in_rule__InitPositionCommand__Group__32360 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__4_in_rule__InitPositionCommand__Group__32363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__YAssignment_3_in_rule__InitPositionCommand__Group__3__Impl2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitPositionCommand__Group__4__Impl_in_rule__InitPositionCommand__Group__42420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InitPositionCommand__Group__4__Impl2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__0__Impl_in_rule__InitHeadingCommand__Group__02489 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__1_in_rule__InitHeadingCommand__Group__02492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InitHeadingCommand__Group__0__Impl2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__1__Impl_in_rule__InitHeadingCommand__Group__12551 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__2_in_rule__InitHeadingCommand__Group__12554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__HeadingAssignment_1_in_rule__InitHeadingCommand__Group__1__Impl2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitHeadingCommand__Group__2__Impl_in_rule__InitHeadingCommand__Group__22611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InitHeadingCommand__Group__2__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__0__Impl_in_rule__InitBoardSizeCommand__Group__02676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__1_in_rule__InitBoardSizeCommand__Group__02679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InitBoardSizeCommand__Group__0__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__1__Impl_in_rule__InitBoardSizeCommand__Group__12738 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__2_in_rule__InitBoardSizeCommand__Group__12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__WidthAssignment_1_in_rule__InitBoardSizeCommand__Group__1__Impl2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__2__Impl_in_rule__InitBoardSizeCommand__Group__22798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__3_in_rule__InitBoardSizeCommand__Group__22801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__InitBoardSizeCommand__Group__2__Impl2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__3__Impl_in_rule__InitBoardSizeCommand__Group__32860 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__4_in_rule__InitBoardSizeCommand__Group__32863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__HeightAssignment_3_in_rule__InitBoardSizeCommand__Group__3__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitBoardSizeCommand__Group__4__Impl_in_rule__InitBoardSizeCommand__Group__42920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InitBoardSizeCommand__Group__4__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__0__Impl_in_rule__UserDefinedCommand__Group__02989 = new BitSet(new long[]{0x0000800100000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__1_in_rule__UserDefinedCommand__Group__02992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__DocAssignment_0_in_rule__UserDefinedCommand__Group__0__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__1__Impl_in_rule__UserDefinedCommand__Group__13050 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__2_in_rule__UserDefinedCommand__Group__13053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__UserDefinedCommand__Group__1__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__2__Impl_in_rule__UserDefinedCommand__Group__23112 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__3_in_rule__UserDefinedCommand__Group__23115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__NameAssignment_2_in_rule__UserDefinedCommand__Group__2__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__3__Impl_in_rule__UserDefinedCommand__Group__33172 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__4_in_rule__UserDefinedCommand__Group__33175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__UserDefinedCommand__Group__3__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__4__Impl_in_rule__UserDefinedCommand__Group__43234 = new BitSet(new long[]{0x00005048001F8020L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__5_in_rule__UserDefinedCommand__Group__43237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__UserDefinedCommand__Group__4__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__5__Impl_in_rule__UserDefinedCommand__Group__53296 = new BitSet(new long[]{0x00005048001F8020L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__6_in_rule__UserDefinedCommand__Group__53299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__StatementsAssignment_5_in_rule__UserDefinedCommand__Group__5__Impl3326 = new BitSet(new long[]{0x00005040001F8022L});
    public static final BitSet FOLLOW_rule__UserDefinedCommand__Group__6__Impl_in_rule__UserDefinedCommand__Group__63357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__UserDefinedCommand__Group__6__Impl3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__03430 = new BitSet(new long[]{0x0000801102000000L});
    public static final BitSet FOLLOW_rule__Main__Group__1_in_rule__Main__Group__03433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__13491 = new BitSet(new long[]{0x00005060001F8020L});
    public static final BitSet FOLLOW_rule__Main__Group__2_in_rule__Main__Group__13494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Main__Group__1__Impl3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__23553 = new BitSet(new long[]{0x00005060001F8020L});
    public static final BitSet FOLLOW_rule__Main__Group__3_in_rule__Main__Group__23556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__StatementsAssignment_2_in_rule__Main__Group__2__Impl3583 = new BitSet(new long[]{0x00005040001F8022L});
    public static final BitSet FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__33614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Main__Group__3__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__0__Impl_in_rule__UserDefinedCommandStatement__Group__03681 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__1_in_rule__UserDefinedCommandStatement__Group__03684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__CommandAssignment_0_in_rule__UserDefinedCommandStatement__Group__0__Impl3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedCommandStatement__Group__1__Impl_in_rule__UserDefinedCommandStatement__Group__13741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__UserDefinedCommandStatement__Group__1__Impl3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__0__Impl_in_rule__IfStatement__Group__03804 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__1_in_rule__IfStatement__Group__03807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IfStatement__Group__0__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__1__Impl_in_rule__IfStatement__Group__13866 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__2_in_rule__IfStatement__Group__13869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__IfStatement__Group__1__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__2__Impl_in_rule__IfStatement__Group__23928 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__3_in_rule__IfStatement__Group__23931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__ConditionAssignment_2_in_rule__IfStatement__Group__2__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__3__Impl_in_rule__IfStatement__Group__33988 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__4_in_rule__IfStatement__Group__33991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__IfStatement__Group__3__Impl4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__4__Impl_in_rule__IfStatement__Group__44050 = new BitSet(new long[]{0x00005440001F8020L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__5_in_rule__IfStatement__Group__44053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IfStatement__Group__4__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__5__Impl_in_rule__IfStatement__Group__54112 = new BitSet(new long[]{0x00005440001F8020L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__6_in_rule__IfStatement__Group__54115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__StatementsAssignment_5_in_rule__IfStatement__Group__5__Impl4142 = new BitSet(new long[]{0x00005040001F8022L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__6__Impl_in_rule__IfStatement__Group__64173 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__7_in_rule__IfStatement__Group__64176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IfStatement__Group__6__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__7__Impl_in_rule__IfStatement__Group__74235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__0_in_rule__IfStatement__Group__7__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__0__Impl_in_rule__IfStatement__Group_7__04309 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__1_in_rule__IfStatement__Group_7__04312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__IfStatement__Group_7__0__Impl4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__1__Impl_in_rule__IfStatement__Group_7__14371 = new BitSet(new long[]{0x00005440001F8020L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__2_in_rule__IfStatement__Group_7__14374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IfStatement__Group_7__1__Impl4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__2__Impl_in_rule__IfStatement__Group_7__24433 = new BitSet(new long[]{0x00005440001F8020L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__3_in_rule__IfStatement__Group_7__24436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__ElseStatementsAssignment_7_2_in_rule__IfStatement__Group_7__2__Impl4463 = new BitSet(new long[]{0x00005040001F8022L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_7__3__Impl_in_rule__IfStatement__Group_7__34494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IfStatement__Group_7__3__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__0__Impl_in_rule__IterateStatement__Group__04561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__1_in_rule__IterateStatement__Group__04564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__IterateStatement__Group__0__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__1__Impl_in_rule__IterateStatement__Group__14623 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__2_in_rule__IterateStatement__Group__14626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__TimesAssignment_1_in_rule__IterateStatement__Group__1__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__2__Impl_in_rule__IterateStatement__Group__24683 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__3_in_rule__IterateStatement__Group__24686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__IterateStatement__Group__2__Impl4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__3__Impl_in_rule__IterateStatement__Group__34745 = new BitSet(new long[]{0x00005040001F8020L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__4_in_rule__IterateStatement__Group__34748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IterateStatement__Group__3__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__4__Impl_in_rule__IterateStatement__Group__44807 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__5_in_rule__IterateStatement__Group__44810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__StatementsAssignment_4_in_rule__IterateStatement__Group__4__Impl4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterateStatement__Group__5__Impl_in_rule__IterateStatement__Group__54867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IterateStatement__Group__5__Impl4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__0__Impl_in_rule__WhileStatement__Group__04938 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__1_in_rule__WhileStatement__Group__04941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__WhileStatement__Group__0__Impl4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__1__Impl_in_rule__WhileStatement__Group__15000 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__2_in_rule__WhileStatement__Group__15003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__WhileStatement__Group__1__Impl5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__2__Impl_in_rule__WhileStatement__Group__25062 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__3_in_rule__WhileStatement__Group__25065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__ConditionAssignment_2_in_rule__WhileStatement__Group__2__Impl5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__3__Impl_in_rule__WhileStatement__Group__35122 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__4_in_rule__WhileStatement__Group__35125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__WhileStatement__Group__3__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__4__Impl_in_rule__WhileStatement__Group__45184 = new BitSet(new long[]{0x00005040001F8020L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__5_in_rule__WhileStatement__Group__45187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__WhileStatement__Group__4__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__5__Impl_in_rule__WhileStatement__Group__55246 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__6_in_rule__WhileStatement__Group__55249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__StatementsAssignment_5_in_rule__WhileStatement__Group__5__Impl5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhileStatement__Group__6__Impl_in_rule__WhileStatement__Group__65306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__WhileStatement__Group__6__Impl5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__0__Impl_in_rule__DocumentationComment__Group__05379 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__1_in_rule__DocumentationComment__Group__05382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DocumentationComment__Group__0__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__1__Impl_in_rule__DocumentationComment__Group__15441 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__2_in_rule__DocumentationComment__Group__15444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__TextAssignment_1_in_rule__DocumentationComment__Group__1__Impl5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocumentationComment__Group__2__Impl_in_rule__DocumentationComment__Group__25501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DocumentationComment__Group__2__Impl5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__0__Impl_in_rule__CommandStatement__Group__05566 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__1_in_rule__CommandStatement__Group__05569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__KindAssignment_0_in_rule__CommandStatement__Group__0__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandStatement__Group__1__Impl_in_rule__CommandStatement__Group__15626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommandStatement__Group__1__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__0__Impl_in_rule__ConditionExpr__Group__05689 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__1_in_rule__ConditionExpr__Group__05692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__NegationAssignment_0_in_rule__ConditionExpr__Group__0__Impl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__Group__1__Impl_in_rule__ConditionExpr__Group__15749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionExpr__ExprAssignment_1_in_rule__ConditionExpr__Group__1__Impl5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitSection_in_rule__Program__InitSectionAssignment_15815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommand_in_rule__Program__UserDefinedCommandsAssignment_25846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__Program__MainAssignment_35877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitCommand_in_rule__InitSection__InitCommandsAssignment_15908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitPositionCommand__XAssignment_15939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitPositionCommand__YAssignment_35970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeadingKind_in_rule__InitHeadingCommand__HeadingAssignment_16001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__WidthAssignment_16032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InitBoardSizeCommand__HeightAssignment_36063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_rule__UserDefinedCommand__DocAssignment_06094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserDefinedCommand__NameAssignment_26125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__UserDefinedCommand__StatementsAssignment_56156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Main__StatementsAssignment_26187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserDefinedCommandStatement__CommandAssignment_06222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_rule__IfStatement__ConditionAssignment_26257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__IfStatement__StatementsAssignment_56288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__IfStatement__ElseStatementsAssignment_7_26319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IterateStatement__TimesAssignment_16350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__IterateStatement__StatementsAssignment_46381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_rule__WhileStatement__ConditionAssignment_26412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__WhileStatement__StatementsAssignment_56443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DocumentationComment__TextAssignment_16474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandKind_in_rule__CommandStatement__KindAssignment_06505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ConditionExpr__NegationAssignment_06541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionKind_in_rule__ConditionExpr__ExprAssignment_16580 = new BitSet(new long[]{0x0000000000000002L});

}