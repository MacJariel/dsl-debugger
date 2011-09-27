package org.macjariel.karel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.macjariel.karel.services.KarelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKarelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BEGIN-PROGRAM'", "'END-PROGRAM'", "'BEGIN-INIT'", "'END-INIT'", "'position'", "','", "';'", "'heading'", "'boardSize'", "'NORTH'", "'SOUTH'", "'WEST'", "'EAST'", "'DEFINE COMMAND'", "'AS'", "'BEGIN'", "'END'", "'BEGIN-MAIN'", "'END-MAIN'", "'IF'", "'('", "')'", "'{'", "'}'", "'ELSE'", "'ITERATE'", "'TIMES'", "'WHILE'", "'@('", "'move'", "'turn'", "'turnOn'", "'turnOff'", "'put'", "'get'", "'!'", "'WALL_AHEAD'", "'MARKED_PLACE'"
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
    public String getGrammarFileName() { return "../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g"; }



     	private KarelGrammarAccess grammarAccess;
     	
        public InternalKarelParser(TokenStream input, KarelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected KarelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:76:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) otherlv_4= 'END-PROGRAM' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_initSection_1_0 = null;

        EObject lv_userDefinedCommands_2_0 = null;

        EObject lv_main_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:79:28: ( (otherlv_0= 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) otherlv_4= 'END-PROGRAM' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:80:1: (otherlv_0= 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) otherlv_4= 'END-PROGRAM' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:80:1: (otherlv_0= 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) otherlv_4= 'END-PROGRAM' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:80:3: otherlv_0= 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) otherlv_4= 'END-PROGRAM'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProgram122); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getBEGINPROGRAMKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:84:1: ( (lv_initSection_1_0= ruleInitSection ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:85:1: (lv_initSection_1_0= ruleInitSection )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:85:1: (lv_initSection_1_0= ruleInitSection )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:86:3: lv_initSection_1_0= ruleInitSection
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getInitSectionInitSectionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInitSection_in_ruleProgram143);
                    lv_initSection_1_0=ruleInitSection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		set(
                           			current, 
                           			"initSection",
                            		lv_initSection_1_0, 
                            		"InitSection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:102:3: ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24||LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:103:1: (lv_userDefinedCommands_2_0= ruleUserDefinedCommand )
            	    {
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:103:1: (lv_userDefinedCommands_2_0= ruleUserDefinedCommand )
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:104:3: lv_userDefinedCommands_2_0= ruleUserDefinedCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getUserDefinedCommandsUserDefinedCommandParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUserDefinedCommand_in_ruleProgram165);
            	    lv_userDefinedCommands_2_0=ruleUserDefinedCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"userDefinedCommands",
            	            		lv_userDefinedCommands_2_0, 
            	            		"UserDefinedCommand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:120:3: ( (lv_main_3_0= ruleMain ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:121:1: (lv_main_3_0= ruleMain )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:121:1: (lv_main_3_0= ruleMain )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:122:3: lv_main_3_0= ruleMain
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMain_in_ruleProgram187);
            lv_main_3_0=ruleMain();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"main",
                    		lv_main_3_0, 
                    		"Main");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleProgram199); 

                	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getENDPROGRAMKeyword_4());
                

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleInitSection"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:150:1: entryRuleInitSection returns [EObject current=null] : iv_ruleInitSection= ruleInitSection EOF ;
    public final EObject entryRuleInitSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitSection = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:151:2: (iv_ruleInitSection= ruleInitSection EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:152:2: iv_ruleInitSection= ruleInitSection EOF
            {
             newCompositeNode(grammarAccess.getInitSectionRule()); 
            pushFollow(FOLLOW_ruleInitSection_in_entryRuleInitSection235);
            iv_ruleInitSection=ruleInitSection();

            state._fsp--;

             current =iv_ruleInitSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitSection245); 

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
    // $ANTLR end "entryRuleInitSection"


    // $ANTLR start "ruleInitSection"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:159:1: ruleInitSection returns [EObject current=null] : (otherlv_0= 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ otherlv_2= 'END-INIT' ) ;
    public final EObject ruleInitSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_initCommands_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:162:28: ( (otherlv_0= 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ otherlv_2= 'END-INIT' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:163:1: (otherlv_0= 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ otherlv_2= 'END-INIT' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:163:1: (otherlv_0= 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ otherlv_2= 'END-INIT' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:163:3: otherlv_0= 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ otherlv_2= 'END-INIT'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleInitSection282); 

                	newLeafNode(otherlv_0, grammarAccess.getInitSectionAccess().getBEGININITKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:167:1: ( (lv_initCommands_1_0= ruleInitCommand ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||(LA3_0>=18 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:168:1: (lv_initCommands_1_0= ruleInitCommand )
            	    {
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:168:1: (lv_initCommands_1_0= ruleInitCommand )
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:169:3: lv_initCommands_1_0= ruleInitCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInitSectionAccess().getInitCommandsInitCommandParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInitCommand_in_ruleInitSection303);
            	    lv_initCommands_1_0=ruleInitCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInitSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"initCommands",
            	            		lv_initCommands_1_0, 
            	            		"InitCommand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleInitSection316); 

                	newLeafNode(otherlv_2, grammarAccess.getInitSectionAccess().getENDINITKeyword_2());
                

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
    // $ANTLR end "ruleInitSection"


    // $ANTLR start "entryRuleInitCommand"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:197:1: entryRuleInitCommand returns [EObject current=null] : iv_ruleInitCommand= ruleInitCommand EOF ;
    public final EObject entryRuleInitCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitCommand = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:198:2: (iv_ruleInitCommand= ruleInitCommand EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:199:2: iv_ruleInitCommand= ruleInitCommand EOF
            {
             newCompositeNode(grammarAccess.getInitCommandRule()); 
            pushFollow(FOLLOW_ruleInitCommand_in_entryRuleInitCommand352);
            iv_ruleInitCommand=ruleInitCommand();

            state._fsp--;

             current =iv_ruleInitCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitCommand362); 

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
    // $ANTLR end "entryRuleInitCommand"


    // $ANTLR start "ruleInitCommand"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:206:1: ruleInitCommand returns [EObject current=null] : (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand ) ;
    public final EObject ruleInitCommand() throws RecognitionException {
        EObject current = null;

        EObject this_InitPositionCommand_0 = null;

        EObject this_InitHeadingCommand_1 = null;

        EObject this_InitBoardSizeCommand_2 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:209:28: ( (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:210:1: (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:210:1: (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
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
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:211:5: this_InitPositionCommand_0= ruleInitPositionCommand
                    {
                     
                            newCompositeNode(grammarAccess.getInitCommandAccess().getInitPositionCommandParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInitPositionCommand_in_ruleInitCommand409);
                    this_InitPositionCommand_0=ruleInitPositionCommand();

                    state._fsp--;

                     
                            current = this_InitPositionCommand_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:221:5: this_InitHeadingCommand_1= ruleInitHeadingCommand
                    {
                     
                            newCompositeNode(grammarAccess.getInitCommandAccess().getInitHeadingCommandParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInitHeadingCommand_in_ruleInitCommand436);
                    this_InitHeadingCommand_1=ruleInitHeadingCommand();

                    state._fsp--;

                     
                            current = this_InitHeadingCommand_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:231:5: this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand
                    {
                     
                            newCompositeNode(grammarAccess.getInitCommandAccess().getInitBoardSizeCommandParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInitBoardSizeCommand_in_ruleInitCommand463);
                    this_InitBoardSizeCommand_2=ruleInitBoardSizeCommand();

                    state._fsp--;

                     
                            current = this_InitBoardSizeCommand_2; 
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
    // $ANTLR end "ruleInitCommand"


    // $ANTLR start "entryRuleInitPositionCommand"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:247:1: entryRuleInitPositionCommand returns [EObject current=null] : iv_ruleInitPositionCommand= ruleInitPositionCommand EOF ;
    public final EObject entryRuleInitPositionCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitPositionCommand = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:248:2: (iv_ruleInitPositionCommand= ruleInitPositionCommand EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:249:2: iv_ruleInitPositionCommand= ruleInitPositionCommand EOF
            {
             newCompositeNode(grammarAccess.getInitPositionCommandRule()); 
            pushFollow(FOLLOW_ruleInitPositionCommand_in_entryRuleInitPositionCommand498);
            iv_ruleInitPositionCommand=ruleInitPositionCommand();

            state._fsp--;

             current =iv_ruleInitPositionCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitPositionCommand508); 

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
    // $ANTLR end "entryRuleInitPositionCommand"


    // $ANTLR start "ruleInitPositionCommand"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:256:1: ruleInitPositionCommand returns [EObject current=null] : (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ';' ) ;
    public final EObject ruleInitPositionCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:259:28: ( (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:260:1: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ';' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:260:1: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ';' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:260:3: otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleInitPositionCommand545); 

                	newLeafNode(otherlv_0, grammarAccess.getInitPositionCommandAccess().getPositionKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:264:1: ( (lv_x_1_0= RULE_INT ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:265:1: (lv_x_1_0= RULE_INT )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:265:1: (lv_x_1_0= RULE_INT )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:266:3: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitPositionCommand562); 

            			newLeafNode(lv_x_1_0, grammarAccess.getInitPositionCommandAccess().getXINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitPositionCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleInitPositionCommand579); 

                	newLeafNode(otherlv_2, grammarAccess.getInitPositionCommandAccess().getCommaKeyword_2());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:286:1: ( (lv_y_3_0= RULE_INT ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:287:1: (lv_y_3_0= RULE_INT )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:287:1: (lv_y_3_0= RULE_INT )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:288:3: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitPositionCommand596); 

            			newLeafNode(lv_y_3_0, grammarAccess.getInitPositionCommandAccess().getYINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitPositionCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleInitPositionCommand613); 

                	newLeafNode(otherlv_4, grammarAccess.getInitPositionCommandAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleInitPositionCommand"


    // $ANTLR start "entryRuleInitHeadingCommand"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:316:1: entryRuleInitHeadingCommand returns [EObject current=null] : iv_ruleInitHeadingCommand= ruleInitHeadingCommand EOF ;
    public final EObject entryRuleInitHeadingCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitHeadingCommand = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:317:2: (iv_ruleInitHeadingCommand= ruleInitHeadingCommand EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:318:2: iv_ruleInitHeadingCommand= ruleInitHeadingCommand EOF
            {
             newCompositeNode(grammarAccess.getInitHeadingCommandRule()); 
            pushFollow(FOLLOW_ruleInitHeadingCommand_in_entryRuleInitHeadingCommand649);
            iv_ruleInitHeadingCommand=ruleInitHeadingCommand();

            state._fsp--;

             current =iv_ruleInitHeadingCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitHeadingCommand659); 

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
    // $ANTLR end "entryRuleInitHeadingCommand"


    // $ANTLR start "ruleInitHeadingCommand"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:325:1: ruleInitHeadingCommand returns [EObject current=null] : (otherlv_0= 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) otherlv_2= ';' ) ;
    public final EObject ruleInitHeadingCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_heading_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:328:28: ( (otherlv_0= 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) otherlv_2= ';' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:329:1: (otherlv_0= 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) otherlv_2= ';' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:329:1: (otherlv_0= 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) otherlv_2= ';' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:329:3: otherlv_0= 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleInitHeadingCommand696); 

                	newLeafNode(otherlv_0, grammarAccess.getInitHeadingCommandAccess().getHeadingKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:333:1: ( (lv_heading_1_0= ruleHeadingKind ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:334:1: (lv_heading_1_0= ruleHeadingKind )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:334:1: (lv_heading_1_0= ruleHeadingKind )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:335:3: lv_heading_1_0= ruleHeadingKind
            {
             
            	        newCompositeNode(grammarAccess.getInitHeadingCommandAccess().getHeadingHeadingKindParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleHeadingKind_in_ruleInitHeadingCommand717);
            lv_heading_1_0=ruleHeadingKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInitHeadingCommandRule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_1_0, 
                    		"HeadingKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInitHeadingCommand729); 

                	newLeafNode(otherlv_2, grammarAccess.getInitHeadingCommandAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleInitHeadingCommand"


    // $ANTLR start "entryRuleInitBoardSizeCommand"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:363:1: entryRuleInitBoardSizeCommand returns [EObject current=null] : iv_ruleInitBoardSizeCommand= ruleInitBoardSizeCommand EOF ;
    public final EObject entryRuleInitBoardSizeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitBoardSizeCommand = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:364:2: (iv_ruleInitBoardSizeCommand= ruleInitBoardSizeCommand EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:365:2: iv_ruleInitBoardSizeCommand= ruleInitBoardSizeCommand EOF
            {
             newCompositeNode(grammarAccess.getInitBoardSizeCommandRule()); 
            pushFollow(FOLLOW_ruleInitBoardSizeCommand_in_entryRuleInitBoardSizeCommand765);
            iv_ruleInitBoardSizeCommand=ruleInitBoardSizeCommand();

            state._fsp--;

             current =iv_ruleInitBoardSizeCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitBoardSizeCommand775); 

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
    // $ANTLR end "entryRuleInitBoardSizeCommand"


    // $ANTLR start "ruleInitBoardSizeCommand"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:372:1: ruleInitBoardSizeCommand returns [EObject current=null] : (otherlv_0= 'boardSize' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ';' ) ;
    public final EObject ruleInitBoardSizeCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_2=null;
        Token lv_height_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:375:28: ( (otherlv_0= 'boardSize' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:376:1: (otherlv_0= 'boardSize' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ';' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:376:1: (otherlv_0= 'boardSize' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ';' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:376:3: otherlv_0= 'boardSize' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleInitBoardSizeCommand812); 

                	newLeafNode(otherlv_0, grammarAccess.getInitBoardSizeCommandAccess().getBoardSizeKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:380:1: ( (lv_width_1_0= RULE_INT ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:381:1: (lv_width_1_0= RULE_INT )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:381:1: (lv_width_1_0= RULE_INT )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:382:3: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitBoardSizeCommand829); 

            			newLeafNode(lv_width_1_0, grammarAccess.getInitBoardSizeCommandAccess().getWidthINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitBoardSizeCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleInitBoardSizeCommand846); 

                	newLeafNode(otherlv_2, grammarAccess.getInitBoardSizeCommandAccess().getCommaKeyword_2());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:402:1: ( (lv_height_3_0= RULE_INT ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:403:1: (lv_height_3_0= RULE_INT )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:403:1: (lv_height_3_0= RULE_INT )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:404:3: lv_height_3_0= RULE_INT
            {
            lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInitBoardSizeCommand863); 

            			newLeafNode(lv_height_3_0, grammarAccess.getInitBoardSizeCommandAccess().getHeightINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitBoardSizeCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleInitBoardSizeCommand880); 

                	newLeafNode(otherlv_4, grammarAccess.getInitBoardSizeCommandAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleInitBoardSizeCommand"


    // $ANTLR start "entryRuleHeadingKind"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:432:1: entryRuleHeadingKind returns [String current=null] : iv_ruleHeadingKind= ruleHeadingKind EOF ;
    public final String entryRuleHeadingKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHeadingKind = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:433:2: (iv_ruleHeadingKind= ruleHeadingKind EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:434:2: iv_ruleHeadingKind= ruleHeadingKind EOF
            {
             newCompositeNode(grammarAccess.getHeadingKindRule()); 
            pushFollow(FOLLOW_ruleHeadingKind_in_entryRuleHeadingKind917);
            iv_ruleHeadingKind=ruleHeadingKind();

            state._fsp--;

             current =iv_ruleHeadingKind.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeadingKind928); 

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
    // $ANTLR end "entryRuleHeadingKind"


    // $ANTLR start "ruleHeadingKind"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:441:1: ruleHeadingKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NORTH' | kw= 'SOUTH' | kw= 'WEST' | kw= 'EAST' ) ;
    public final AntlrDatatypeRuleToken ruleHeadingKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:444:28: ( (kw= 'NORTH' | kw= 'SOUTH' | kw= 'WEST' | kw= 'EAST' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:445:1: (kw= 'NORTH' | kw= 'SOUTH' | kw= 'WEST' | kw= 'EAST' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:445:1: (kw= 'NORTH' | kw= 'SOUTH' | kw= 'WEST' | kw= 'EAST' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:446:2: kw= 'NORTH'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleHeadingKind966); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getHeadingKindAccess().getNORTHKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:453:2: kw= 'SOUTH'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleHeadingKind985); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getHeadingKindAccess().getSOUTHKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:460:2: kw= 'WEST'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleHeadingKind1004); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getHeadingKindAccess().getWESTKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:467:2: kw= 'EAST'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleHeadingKind1023); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getHeadingKindAccess().getEASTKeyword_3()); 
                        

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
    // $ANTLR end "ruleHeadingKind"


    // $ANTLR start "entryRuleUserDefinedCommand"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:480:1: entryRuleUserDefinedCommand returns [EObject current=null] : iv_ruleUserDefinedCommand= ruleUserDefinedCommand EOF ;
    public final EObject entryRuleUserDefinedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDefinedCommand = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:481:2: (iv_ruleUserDefinedCommand= ruleUserDefinedCommand EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:482:2: iv_ruleUserDefinedCommand= ruleUserDefinedCommand EOF
            {
             newCompositeNode(grammarAccess.getUserDefinedCommandRule()); 
            pushFollow(FOLLOW_ruleUserDefinedCommand_in_entryRuleUserDefinedCommand1063);
            iv_ruleUserDefinedCommand=ruleUserDefinedCommand();

            state._fsp--;

             current =iv_ruleUserDefinedCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedCommand1073); 

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
    // $ANTLR end "entryRuleUserDefinedCommand"


    // $ANTLR start "ruleUserDefinedCommand"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:489:1: ruleUserDefinedCommand returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocumentationComment ) )? otherlv_1= 'DEFINE COMMAND' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'AS' otherlv_4= 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'END' ) ;
    public final EObject ruleUserDefinedCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_doc_0_0 = null;

        EObject lv_statements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:492:28: ( ( ( (lv_doc_0_0= ruleDocumentationComment ) )? otherlv_1= 'DEFINE COMMAND' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'AS' otherlv_4= 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'END' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:493:1: ( ( (lv_doc_0_0= ruleDocumentationComment ) )? otherlv_1= 'DEFINE COMMAND' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'AS' otherlv_4= 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'END' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:493:1: ( ( (lv_doc_0_0= ruleDocumentationComment ) )? otherlv_1= 'DEFINE COMMAND' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'AS' otherlv_4= 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'END' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:493:2: ( (lv_doc_0_0= ruleDocumentationComment ) )? otherlv_1= 'DEFINE COMMAND' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'AS' otherlv_4= 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'END'
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:493:2: ( (lv_doc_0_0= ruleDocumentationComment ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:494:1: (lv_doc_0_0= ruleDocumentationComment )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:494:1: (lv_doc_0_0= ruleDocumentationComment )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:495:3: lv_doc_0_0= ruleDocumentationComment
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserDefinedCommandAccess().getDocDocumentationCommentParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocumentationComment_in_ruleUserDefinedCommand1119);
                    lv_doc_0_0=ruleDocumentationComment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserDefinedCommandRule());
                    	        }
                           		set(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DocumentationComment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleUserDefinedCommand1132); 

                	newLeafNode(otherlv_1, grammarAccess.getUserDefinedCommandAccess().getDEFINECOMMANDKeyword_1());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:515:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:516:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:516:1: (lv_name_2_0= RULE_ID )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:517:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserDefinedCommand1149); 

            			newLeafNode(lv_name_2_0, grammarAccess.getUserDefinedCommandAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUserDefinedCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleUserDefinedCommand1166); 

                	newLeafNode(otherlv_3, grammarAccess.getUserDefinedCommandAccess().getASKeyword_3());
                
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleUserDefinedCommand1178); 

                	newLeafNode(otherlv_4, grammarAccess.getUserDefinedCommandAccess().getBEGINKeyword_4());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:541:1: ( (lv_statements_5_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==30||LA7_0==36||LA7_0==38||(LA7_0>=40 && LA7_0<=45)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:542:1: (lv_statements_5_0= ruleStatement )
            	    {
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:542:1: (lv_statements_5_0= ruleStatement )
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:543:3: lv_statements_5_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserDefinedCommandAccess().getStatementsStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleUserDefinedCommand1199);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserDefinedCommandRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_5_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleUserDefinedCommand1212); 

                	newLeafNode(otherlv_6, grammarAccess.getUserDefinedCommandAccess().getENDKeyword_6());
                

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
    // $ANTLR end "ruleUserDefinedCommand"


    // $ANTLR start "entryRuleMain"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:571:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:572:2: (iv_ruleMain= ruleMain EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:573:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain1248);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain1258); 

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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:580:1: ruleMain returns [EObject current=null] : ( () otherlv_1= 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'END-MAIN' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:583:28: ( ( () otherlv_1= 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'END-MAIN' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:584:1: ( () otherlv_1= 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'END-MAIN' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:584:1: ( () otherlv_1= 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'END-MAIN' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:584:2: () otherlv_1= 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'END-MAIN'
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:584:2: ()
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:585:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMainAccess().getMainAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleMain1304); 

                	newLeafNode(otherlv_1, grammarAccess.getMainAccess().getBEGINMAINKeyword_1());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:594:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==30||LA8_0==36||LA8_0==38||(LA8_0>=40 && LA8_0<=45)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:595:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:595:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:596:3: lv_statements_2_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleMain1325);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_2_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleMain1338); 

                	newLeafNode(otherlv_3, grammarAccess.getMainAccess().getENDMAINKeyword_3());
                

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleStatement"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:624:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:625:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:626:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1374);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1384); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:633:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_IterateStatement_1 = null;

        EObject this_WhileStatement_2 = null;

        EObject this_CommandStatement_3 = null;

        EObject this_UserDefinedCommandStatement_4 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:636:28: ( (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:637:1: (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:637:1: (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            case 38:
                {
                alt9=3;
                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt9=4;
                }
                break;
            case RULE_ID:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:638:5: this_IfStatement_0= ruleIfStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement1431);
                    this_IfStatement_0=ruleIfStatement();

                    state._fsp--;

                     
                            current = this_IfStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:648:5: this_IterateStatement_1= ruleIterateStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getIterateStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIterateStatement_in_ruleStatement1458);
                    this_IterateStatement_1=ruleIterateStatement();

                    state._fsp--;

                     
                            current = this_IterateStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:658:5: this_WhileStatement_2= ruleWhileStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement1485);
                    this_WhileStatement_2=ruleWhileStatement();

                    state._fsp--;

                     
                            current = this_WhileStatement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:668:5: this_CommandStatement_3= ruleCommandStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getCommandStatementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCommandStatement_in_ruleStatement1512);
                    this_CommandStatement_3=ruleCommandStatement();

                    state._fsp--;

                     
                            current = this_CommandStatement_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:678:5: this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getUserDefinedCommandStatementParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_ruleStatement1539);
                    this_UserDefinedCommandStatement_4=ruleUserDefinedCommandStatement();

                    state._fsp--;

                     
                            current = this_UserDefinedCommandStatement_4; 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleUserDefinedCommandStatement"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:694:1: entryRuleUserDefinedCommandStatement returns [EObject current=null] : iv_ruleUserDefinedCommandStatement= ruleUserDefinedCommandStatement EOF ;
    public final EObject entryRuleUserDefinedCommandStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDefinedCommandStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:695:2: (iv_ruleUserDefinedCommandStatement= ruleUserDefinedCommandStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:696:2: iv_ruleUserDefinedCommandStatement= ruleUserDefinedCommandStatement EOF
            {
             newCompositeNode(grammarAccess.getUserDefinedCommandStatementRule()); 
            pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement1574);
            iv_ruleUserDefinedCommandStatement=ruleUserDefinedCommandStatement();

            state._fsp--;

             current =iv_ruleUserDefinedCommandStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement1584); 

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
    // $ANTLR end "entryRuleUserDefinedCommandStatement"


    // $ANTLR start "ruleUserDefinedCommandStatement"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:703:1: ruleUserDefinedCommandStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' ) ;
    public final EObject ruleUserDefinedCommandStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:706:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:707:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:707:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:707:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ';'
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:707:2: ( (otherlv_0= RULE_ID ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:708:1: (otherlv_0= RULE_ID )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:708:1: (otherlv_0= RULE_ID )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:709:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUserDefinedCommandStatementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserDefinedCommandStatement1629); 

            		newLeafNode(otherlv_0, grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleUserDefinedCommandStatement1641); 

                	newLeafNode(otherlv_1, grammarAccess.getUserDefinedCommandStatementAccess().getSemicolonKeyword_1());
                

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
    // $ANTLR end "ruleUserDefinedCommandStatement"


    // $ANTLR start "entryRuleIfStatement"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:732:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:733:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:734:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement1677);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement1687); 

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:741:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_elseStatements_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:744:28: ( (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )? ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:745:1: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )? )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:745:1: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )? )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:745:3: otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleIfStatement1724); 

                	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIFKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleIfStatement1736); 

                	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:753:1: ( (lv_condition_2_0= ruleConditionExpr ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:754:1: (lv_condition_2_0= ruleConditionExpr )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:754:1: (lv_condition_2_0= ruleConditionExpr )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:755:3: lv_condition_2_0= ruleConditionExpr
            {
             
            	        newCompositeNode(grammarAccess.getIfStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionExpr_in_ruleIfStatement1757);
            lv_condition_2_0=ruleConditionExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"ConditionExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleIfStatement1769); 

                	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleIfStatement1781); 

                	newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:779:1: ( (lv_statements_5_0= ruleStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==30||LA10_0==36||LA10_0==38||(LA10_0>=40 && LA10_0<=45)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:780:1: (lv_statements_5_0= ruleStatement )
            	    {
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:780:1: (lv_statements_5_0= ruleStatement )
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:781:3: lv_statements_5_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleIfStatement1802);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_5_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleIfStatement1815); 

                	newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_6());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:801:1: (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:801:3: otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleIfStatement1828); 

                        	newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getELSEKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleIfStatement1840); 

                        	newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:809:1: ( (lv_elseStatements_9_0= ruleStatement ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==30||LA11_0==36||LA11_0==38||(LA11_0>=40 && LA11_0<=45)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:810:1: (lv_elseStatements_9_0= ruleStatement )
                    	    {
                    	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:810:1: (lv_elseStatements_9_0= ruleStatement )
                    	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:811:3: lv_elseStatements_9_0= ruleStatement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementsStatementParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleIfStatement1861);
                    	    lv_elseStatements_9_0=ruleStatement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elseStatements",
                    	            		lv_elseStatements_9_0, 
                    	            		"Statement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,34,FOLLOW_34_in_ruleIfStatement1874); 

                        	newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7_3());
                        

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleIterateStatement"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:839:1: entryRuleIterateStatement returns [EObject current=null] : iv_ruleIterateStatement= ruleIterateStatement EOF ;
    public final EObject entryRuleIterateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:840:2: (iv_ruleIterateStatement= ruleIterateStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:841:2: iv_ruleIterateStatement= ruleIterateStatement EOF
            {
             newCompositeNode(grammarAccess.getIterateStatementRule()); 
            pushFollow(FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement1912);
            iv_ruleIterateStatement=ruleIterateStatement();

            state._fsp--;

             current =iv_ruleIterateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterateStatement1922); 

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
    // $ANTLR end "entryRuleIterateStatement"


    // $ANTLR start "ruleIterateStatement"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:848:1: ruleIterateStatement returns [EObject current=null] : (otherlv_0= 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'TIMES' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) otherlv_5= '}' ) ;
    public final EObject ruleIterateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_times_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_statements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:851:28: ( (otherlv_0= 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'TIMES' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) otherlv_5= '}' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:852:1: (otherlv_0= 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'TIMES' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) otherlv_5= '}' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:852:1: (otherlv_0= 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'TIMES' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) otherlv_5= '}' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:852:3: otherlv_0= 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'TIMES' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleIterateStatement1959); 

                	newLeafNode(otherlv_0, grammarAccess.getIterateStatementAccess().getITERATEKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:856:1: ( (lv_times_1_0= RULE_INT ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:857:1: (lv_times_1_0= RULE_INT )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:857:1: (lv_times_1_0= RULE_INT )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:858:3: lv_times_1_0= RULE_INT
            {
            lv_times_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIterateStatement1976); 

            			newLeafNode(lv_times_1_0, grammarAccess.getIterateStatementAccess().getTimesINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIterateStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"times",
                    		lv_times_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleIterateStatement1993); 

                	newLeafNode(otherlv_2, grammarAccess.getIterateStatementAccess().getTIMESKeyword_2());
                
            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleIterateStatement2005); 

                	newLeafNode(otherlv_3, grammarAccess.getIterateStatementAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:882:1: ( (lv_statements_4_0= ruleStatement ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:883:1: (lv_statements_4_0= ruleStatement )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:883:1: (lv_statements_4_0= ruleStatement )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:884:3: lv_statements_4_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getIterateStatementAccess().getStatementsStatementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleIterateStatement2026);
            lv_statements_4_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIterateStatementRule());
            	        }
                   		add(
                   			current, 
                   			"statements",
                    		lv_statements_4_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleIterateStatement2038); 

                	newLeafNode(otherlv_5, grammarAccess.getIterateStatementAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleIterateStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:912:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:913:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:914:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement2074);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement2084); 

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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:921:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) otherlv_6= '}' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:924:28: ( (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) otherlv_6= '}' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:925:1: (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) otherlv_6= '}' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:925:1: (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) otherlv_6= '}' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:925:3: otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleWhileStatement2121); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWHILEKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleWhileStatement2133); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:933:1: ( (lv_condition_2_0= ruleConditionExpr ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:934:1: (lv_condition_2_0= ruleConditionExpr )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:934:1: (lv_condition_2_0= ruleConditionExpr )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:935:3: lv_condition_2_0= ruleConditionExpr
            {
             
            	        newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionExpr_in_ruleWhileStatement2154);
            lv_condition_2_0=ruleConditionExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"ConditionExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleWhileStatement2166); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleWhileStatement2178); 

                	newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:959:1: ( (lv_statements_5_0= ruleStatement ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:960:1: (lv_statements_5_0= ruleStatement )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:960:1: (lv_statements_5_0= ruleStatement )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:961:3: lv_statements_5_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleWhileStatement2199);
            lv_statements_5_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	        }
                   		add(
                   			current, 
                   			"statements",
                    		lv_statements_5_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleWhileStatement2211); 

                	newLeafNode(otherlv_6, grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleDocumentationComment"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:989:1: entryRuleDocumentationComment returns [EObject current=null] : iv_ruleDocumentationComment= ruleDocumentationComment EOF ;
    public final EObject entryRuleDocumentationComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentationComment = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:990:2: (iv_ruleDocumentationComment= ruleDocumentationComment EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:991:2: iv_ruleDocumentationComment= ruleDocumentationComment EOF
            {
             newCompositeNode(grammarAccess.getDocumentationCommentRule()); 
            pushFollow(FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment2247);
            iv_ruleDocumentationComment=ruleDocumentationComment();

            state._fsp--;

             current =iv_ruleDocumentationComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentationComment2257); 

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
    // $ANTLR end "entryRuleDocumentationComment"


    // $ANTLR start "ruleDocumentationComment"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:998:1: ruleDocumentationComment returns [EObject current=null] : (otherlv_0= '@(' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleDocumentationComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1001:28: ( (otherlv_0= '@(' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1002:1: (otherlv_0= '@(' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1002:1: (otherlv_0= '@(' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1002:3: otherlv_0= '@(' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleDocumentationComment2294); 

                	newLeafNode(otherlv_0, grammarAccess.getDocumentationCommentAccess().getCommercialAtLeftParenthesisKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1006:1: ( (lv_text_1_0= RULE_STRING ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1007:1: (lv_text_1_0= RULE_STRING )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1007:1: (lv_text_1_0= RULE_STRING )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1008:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDocumentationComment2311); 

            			newLeafNode(lv_text_1_0, grammarAccess.getDocumentationCommentAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDocumentationCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleDocumentationComment2328); 

                	newLeafNode(otherlv_2, grammarAccess.getDocumentationCommentAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleDocumentationComment"


    // $ANTLR start "entryRuleCommandStatement"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1036:1: entryRuleCommandStatement returns [EObject current=null] : iv_ruleCommandStatement= ruleCommandStatement EOF ;
    public final EObject entryRuleCommandStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1037:2: (iv_ruleCommandStatement= ruleCommandStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1038:2: iv_ruleCommandStatement= ruleCommandStatement EOF
            {
             newCompositeNode(grammarAccess.getCommandStatementRule()); 
            pushFollow(FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement2364);
            iv_ruleCommandStatement=ruleCommandStatement();

            state._fsp--;

             current =iv_ruleCommandStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandStatement2374); 

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
    // $ANTLR end "entryRuleCommandStatement"


    // $ANTLR start "ruleCommandStatement"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1045:1: ruleCommandStatement returns [EObject current=null] : ( ( (lv_kind_0_0= ruleCommandKind ) ) otherlv_1= ';' ) ;
    public final EObject ruleCommandStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1048:28: ( ( ( (lv_kind_0_0= ruleCommandKind ) ) otherlv_1= ';' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1049:1: ( ( (lv_kind_0_0= ruleCommandKind ) ) otherlv_1= ';' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1049:1: ( ( (lv_kind_0_0= ruleCommandKind ) ) otherlv_1= ';' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1049:2: ( (lv_kind_0_0= ruleCommandKind ) ) otherlv_1= ';'
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1049:2: ( (lv_kind_0_0= ruleCommandKind ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1050:1: (lv_kind_0_0= ruleCommandKind )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1050:1: (lv_kind_0_0= ruleCommandKind )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1051:3: lv_kind_0_0= ruleCommandKind
            {
             
            	        newCompositeNode(grammarAccess.getCommandStatementAccess().getKindCommandKindParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommandKind_in_ruleCommandStatement2420);
            lv_kind_0_0=ruleCommandKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommandStatementRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_0_0, 
                    		"CommandKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleCommandStatement2432); 

                	newLeafNode(otherlv_1, grammarAccess.getCommandStatementAccess().getSemicolonKeyword_1());
                

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
    // $ANTLR end "ruleCommandStatement"


    // $ANTLR start "entryRuleCommandKind"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1079:1: entryRuleCommandKind returns [String current=null] : iv_ruleCommandKind= ruleCommandKind EOF ;
    public final String entryRuleCommandKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommandKind = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1080:2: (iv_ruleCommandKind= ruleCommandKind EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1081:2: iv_ruleCommandKind= ruleCommandKind EOF
            {
             newCompositeNode(grammarAccess.getCommandKindRule()); 
            pushFollow(FOLLOW_ruleCommandKind_in_entryRuleCommandKind2469);
            iv_ruleCommandKind=ruleCommandKind();

            state._fsp--;

             current =iv_ruleCommandKind.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandKind2480); 

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
    // $ANTLR end "entryRuleCommandKind"


    // $ANTLR start "ruleCommandKind"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1088:1: ruleCommandKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'move' | kw= 'turn' | kw= 'turnOn' | kw= 'turnOff' | kw= 'put' | kw= 'get' ) ;
    public final AntlrDatatypeRuleToken ruleCommandKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1091:28: ( (kw= 'move' | kw= 'turn' | kw= 'turnOn' | kw= 'turnOff' | kw= 'put' | kw= 'get' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1092:1: (kw= 'move' | kw= 'turn' | kw= 'turnOn' | kw= 'turnOff' | kw= 'put' | kw= 'get' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1092:1: (kw= 'move' | kw= 'turn' | kw= 'turnOn' | kw= 'turnOff' | kw= 'put' | kw= 'get' )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt13=1;
                }
                break;
            case 41:
                {
                alt13=2;
                }
                break;
            case 42:
                {
                alt13=3;
                }
                break;
            case 43:
                {
                alt13=4;
                }
                break;
            case 44:
                {
                alt13=5;
                }
                break;
            case 45:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1093:2: kw= 'move'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleCommandKind2518); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCommandKindAccess().getMoveKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1100:2: kw= 'turn'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleCommandKind2537); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCommandKindAccess().getTurnKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1107:2: kw= 'turnOn'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleCommandKind2556); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCommandKindAccess().getTurnOnKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1114:2: kw= 'turnOff'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleCommandKind2575); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCommandKindAccess().getTurnOffKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1121:2: kw= 'put'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleCommandKind2594); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCommandKindAccess().getPutKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1128:2: kw= 'get'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleCommandKind2613); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCommandKindAccess().getGetKeyword_5()); 
                        

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
    // $ANTLR end "ruleCommandKind"


    // $ANTLR start "entryRuleConditionExpr"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1141:1: entryRuleConditionExpr returns [EObject current=null] : iv_ruleConditionExpr= ruleConditionExpr EOF ;
    public final EObject entryRuleConditionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionExpr = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1142:2: (iv_ruleConditionExpr= ruleConditionExpr EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1143:2: iv_ruleConditionExpr= ruleConditionExpr EOF
            {
             newCompositeNode(grammarAccess.getConditionExprRule()); 
            pushFollow(FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr2653);
            iv_ruleConditionExpr=ruleConditionExpr();

            state._fsp--;

             current =iv_ruleConditionExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionExpr2663); 

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
    // $ANTLR end "entryRuleConditionExpr"


    // $ANTLR start "ruleConditionExpr"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1150:1: ruleConditionExpr returns [EObject current=null] : ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) ) ;
    public final EObject ruleConditionExpr() throws RecognitionException {
        EObject current = null;

        Token lv_negation_0_0=null;
        AntlrDatatypeRuleToken lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1153:28: ( ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1154:1: ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1154:1: ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1154:2: ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1154:2: ( (lv_negation_0_0= '!' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1155:1: (lv_negation_0_0= '!' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1155:1: (lv_negation_0_0= '!' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1156:3: lv_negation_0_0= '!'
            {
            lv_negation_0_0=(Token)match(input,46,FOLLOW_46_in_ruleConditionExpr2706); 

                    newLeafNode(lv_negation_0_0, grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionExprRule());
            	        }
                   		setWithLastConsumed(current, "negation", true, "!");
            	    

            }


            }

            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1169:2: ( (lv_expr_1_0= ruleConditionKind ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1170:1: (lv_expr_1_0= ruleConditionKind )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1170:1: (lv_expr_1_0= ruleConditionKind )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1171:3: lv_expr_1_0= ruleConditionKind
            {
             
            	        newCompositeNode(grammarAccess.getConditionExprAccess().getExprConditionKindParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionKind_in_ruleConditionExpr2740);
            lv_expr_1_0=ruleConditionKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionExprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"ConditionKind");
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
    // $ANTLR end "ruleConditionExpr"


    // $ANTLR start "entryRuleConditionKind"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1195:1: entryRuleConditionKind returns [String current=null] : iv_ruleConditionKind= ruleConditionKind EOF ;
    public final String entryRuleConditionKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionKind = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1196:2: (iv_ruleConditionKind= ruleConditionKind EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1197:2: iv_ruleConditionKind= ruleConditionKind EOF
            {
             newCompositeNode(grammarAccess.getConditionKindRule()); 
            pushFollow(FOLLOW_ruleConditionKind_in_entryRuleConditionKind2777);
            iv_ruleConditionKind=ruleConditionKind();

            state._fsp--;

             current =iv_ruleConditionKind.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionKind2788); 

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
    // $ANTLR end "entryRuleConditionKind"


    // $ANTLR start "ruleConditionKind"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1204:1: ruleConditionKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WALL_AHEAD' | kw= 'MARKED_PLACE' ) ;
    public final AntlrDatatypeRuleToken ruleConditionKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1207:28: ( (kw= 'WALL_AHEAD' | kw= 'MARKED_PLACE' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1208:1: (kw= 'WALL_AHEAD' | kw= 'MARKED_PLACE' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1208:1: (kw= 'WALL_AHEAD' | kw= 'MARKED_PLACE' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            else if ( (LA14_0==48) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1209:2: kw= 'WALL_AHEAD'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleConditionKind2826); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConditionKindAccess().getWALL_AHEADKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1216:2: kw= 'MARKED_PLACE'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleConditionKind2845); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConditionKindAccess().getMARKED_PLACEKeyword_1()); 
                        

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
    // $ANTLR end "ruleConditionKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProgram122 = new BitSet(new long[]{0x0000008011002000L});
    public static final BitSet FOLLOW_ruleInitSection_in_ruleProgram143 = new BitSet(new long[]{0x0000008011002000L});
    public static final BitSet FOLLOW_ruleUserDefinedCommand_in_ruleProgram165 = new BitSet(new long[]{0x0000008011002000L});
    public static final BitSet FOLLOW_ruleMain_in_ruleProgram187 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitSection_in_entryRuleInitSection235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitSection245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleInitSection282 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_ruleInitCommand_in_ruleInitSection303 = new BitSet(new long[]{0x00000000000CC000L});
    public static final BitSet FOLLOW_14_in_ruleInitSection316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitCommand_in_entryRuleInitCommand352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitCommand362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitPositionCommand_in_ruleInitCommand409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitHeadingCommand_in_ruleInitCommand436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitBoardSizeCommand_in_ruleInitCommand463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitPositionCommand_in_entryRuleInitPositionCommand498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitPositionCommand508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleInitPositionCommand545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitPositionCommand562 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInitPositionCommand579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitPositionCommand596 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInitPositionCommand613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitHeadingCommand_in_entryRuleInitHeadingCommand649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitHeadingCommand659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleInitHeadingCommand696 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleHeadingKind_in_ruleInitHeadingCommand717 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInitHeadingCommand729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitBoardSizeCommand_in_entryRuleInitBoardSizeCommand765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitBoardSizeCommand775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleInitBoardSizeCommand812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitBoardSizeCommand829 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInitBoardSizeCommand846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitBoardSizeCommand863 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInitBoardSizeCommand880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeadingKind_in_entryRuleHeadingKind917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeadingKind928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleHeadingKind966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleHeadingKind985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleHeadingKind1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleHeadingKind1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommand_in_entryRuleUserDefinedCommand1063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedCommand1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_ruleUserDefinedCommand1119 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleUserDefinedCommand1132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserDefinedCommand1149 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleUserDefinedCommand1166 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleUserDefinedCommand1178 = new BitSet(new long[]{0x00003F5048000020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleUserDefinedCommand1199 = new BitSet(new long[]{0x00003F5048000020L});
    public static final BitSet FOLLOW_27_in_ruleUserDefinedCommand1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain1248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMain1304 = new BitSet(new long[]{0x00003F5060000020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleMain1325 = new BitSet(new long[]{0x00003F5060000020L});
    public static final BitSet FOLLOW_29_in_ruleMain1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_ruleStatement1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_ruleStatement1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_ruleStatement1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserDefinedCommandStatement1629 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUserDefinedCommandStatement1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement1677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleIfStatement1724 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleIfStatement1736 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_ruleIfStatement1757 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleIfStatement1769 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleIfStatement1781 = new BitSet(new long[]{0x00003F5440000020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfStatement1802 = new BitSet(new long[]{0x00003F5440000020L});
    public static final BitSet FOLLOW_34_in_ruleIfStatement1815 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleIfStatement1828 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleIfStatement1840 = new BitSet(new long[]{0x00003F5440000020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfStatement1861 = new BitSet(new long[]{0x00003F5440000020L});
    public static final BitSet FOLLOW_34_in_ruleIfStatement1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement1912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterateStatement1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleIterateStatement1959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIterateStatement1976 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleIterateStatement1993 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleIterateStatement2005 = new BitSet(new long[]{0x00003F5040000020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIterateStatement2026 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleIterateStatement2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement2074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleWhileStatement2121 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleWhileStatement2133 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_ruleWhileStatement2154 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleWhileStatement2166 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleWhileStatement2178 = new BitSet(new long[]{0x00003F5040000020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhileStatement2199 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleWhileStatement2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment2247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentationComment2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDocumentationComment2294 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDocumentationComment2311 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDocumentationComment2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement2364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandStatement2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandKind_in_ruleCommandStatement2420 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCommandStatement2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandKind_in_entryRuleCommandKind2469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandKind2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCommandKind2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCommandKind2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCommandKind2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCommandKind2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCommandKind2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCommandKind2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr2653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionExpr2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleConditionExpr2706 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleConditionKind_in_ruleConditionExpr2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionKind_in_entryRuleConditionKind2777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionKind2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleConditionKind2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleConditionKind2845 = new BitSet(new long[]{0x0000000000000002L});

}