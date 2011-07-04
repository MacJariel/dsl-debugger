package org.macjariel.karel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BEGIN-PROGRAM'", "'END-PROGRAM'", "'BEGIN-INIT'", "'END-INIT'", "'position'", "','", "';'", "'heading'", "'boardSize'", "'DEFINE COMMAND'", "'AS'", "'BEGIN'", "'END'", "'BEGIN-MAIN'", "'END-MAIN'", "'IF'", "'('", "')'", "'{'", "'}'", "'ELSE'", "'ITERATE'", "'TIMES'", "'WHILE'", "'@('", "'!'", "'NORTH'", "'SOUTH'", "'WEST'", "'EAST'", "'move'", "'turn'", "'turnOn'", "'turnOff'", "'put'", "'get'", "'WALL_AHEAD'", "'MARKED_PLACE'"
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:68:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:69:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:70:2: iv_ruleProgram= ruleProgram EOF
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:77:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) otherlv_4= 'END-PROGRAM' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_initSection_1_0 = null;

        EObject lv_userDefinedCommands_2_0 = null;

        EObject lv_main_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:80:28: ( (otherlv_0= 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) otherlv_4= 'END-PROGRAM' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:81:1: (otherlv_0= 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) otherlv_4= 'END-PROGRAM' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:81:1: (otherlv_0= 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) otherlv_4= 'END-PROGRAM' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:81:3: otherlv_0= 'BEGIN-PROGRAM' ( (lv_initSection_1_0= ruleInitSection ) )? ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )* ( (lv_main_3_0= ruleMain ) ) otherlv_4= 'END-PROGRAM'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProgram122); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getBEGINPROGRAMKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:85:1: ( (lv_initSection_1_0= ruleInitSection ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:86:1: (lv_initSection_1_0= ruleInitSection )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:86:1: (lv_initSection_1_0= ruleInitSection )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:87:3: lv_initSection_1_0= ruleInitSection
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

            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:103:3: ( (lv_userDefinedCommands_2_0= ruleUserDefinedCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20||LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:104:1: (lv_userDefinedCommands_2_0= ruleUserDefinedCommand )
            	    {
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:104:1: (lv_userDefinedCommands_2_0= ruleUserDefinedCommand )
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:105:3: lv_userDefinedCommands_2_0= ruleUserDefinedCommand
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

            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:121:3: ( (lv_main_3_0= ruleMain ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:122:1: (lv_main_3_0= ruleMain )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:122:1: (lv_main_3_0= ruleMain )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:123:3: lv_main_3_0= ruleMain
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:151:1: entryRuleInitSection returns [EObject current=null] : iv_ruleInitSection= ruleInitSection EOF ;
    public final EObject entryRuleInitSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitSection = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:152:2: (iv_ruleInitSection= ruleInitSection EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:153:2: iv_ruleInitSection= ruleInitSection EOF
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:160:1: ruleInitSection returns [EObject current=null] : (otherlv_0= 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ otherlv_2= 'END-INIT' ) ;
    public final EObject ruleInitSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_initCommands_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:163:28: ( (otherlv_0= 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ otherlv_2= 'END-INIT' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:164:1: (otherlv_0= 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ otherlv_2= 'END-INIT' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:164:1: (otherlv_0= 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ otherlv_2= 'END-INIT' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:164:3: otherlv_0= 'BEGIN-INIT' ( (lv_initCommands_1_0= ruleInitCommand ) )+ otherlv_2= 'END-INIT'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleInitSection282); 

                	newLeafNode(otherlv_0, grammarAccess.getInitSectionAccess().getBEGININITKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:168:1: ( (lv_initCommands_1_0= ruleInitCommand ) )+
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
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:169:1: (lv_initCommands_1_0= ruleInitCommand )
            	    {
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:169:1: (lv_initCommands_1_0= ruleInitCommand )
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:170:3: lv_initCommands_1_0= ruleInitCommand
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:198:1: entryRuleInitCommand returns [EObject current=null] : iv_ruleInitCommand= ruleInitCommand EOF ;
    public final EObject entryRuleInitCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitCommand = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:199:2: (iv_ruleInitCommand= ruleInitCommand EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:200:2: iv_ruleInitCommand= ruleInitCommand EOF
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:207:1: ruleInitCommand returns [EObject current=null] : (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand ) ;
    public final EObject ruleInitCommand() throws RecognitionException {
        EObject current = null;

        EObject this_InitPositionCommand_0 = null;

        EObject this_InitHeadingCommand_1 = null;

        EObject this_InitBoardSizeCommand_2 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:210:28: ( (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:211:1: (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:211:1: (this_InitPositionCommand_0= ruleInitPositionCommand | this_InitHeadingCommand_1= ruleInitHeadingCommand | this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand )
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
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:212:5: this_InitPositionCommand_0= ruleInitPositionCommand
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
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:222:5: this_InitHeadingCommand_1= ruleInitHeadingCommand
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
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:232:5: this_InitBoardSizeCommand_2= ruleInitBoardSizeCommand
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:248:1: entryRuleInitPositionCommand returns [EObject current=null] : iv_ruleInitPositionCommand= ruleInitPositionCommand EOF ;
    public final EObject entryRuleInitPositionCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitPositionCommand = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:249:2: (iv_ruleInitPositionCommand= ruleInitPositionCommand EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:250:2: iv_ruleInitPositionCommand= ruleInitPositionCommand EOF
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:257:1: ruleInitPositionCommand returns [EObject current=null] : (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ';' ) ;
    public final EObject ruleInitPositionCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:260:28: ( (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:261:1: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ';' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:261:1: (otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ';' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:261:3: otherlv_0= 'position' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleInitPositionCommand545); 

                	newLeafNode(otherlv_0, grammarAccess.getInitPositionCommandAccess().getPositionKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:265:1: ( (lv_x_1_0= RULE_INT ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:266:1: (lv_x_1_0= RULE_INT )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:266:1: (lv_x_1_0= RULE_INT )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:267:3: lv_x_1_0= RULE_INT
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
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:287:1: ( (lv_y_3_0= RULE_INT ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:288:1: (lv_y_3_0= RULE_INT )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:288:1: (lv_y_3_0= RULE_INT )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:289:3: lv_y_3_0= RULE_INT
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:317:1: entryRuleInitHeadingCommand returns [EObject current=null] : iv_ruleInitHeadingCommand= ruleInitHeadingCommand EOF ;
    public final EObject entryRuleInitHeadingCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitHeadingCommand = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:318:2: (iv_ruleInitHeadingCommand= ruleInitHeadingCommand EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:319:2: iv_ruleInitHeadingCommand= ruleInitHeadingCommand EOF
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:326:1: ruleInitHeadingCommand returns [EObject current=null] : (otherlv_0= 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) otherlv_2= ';' ) ;
    public final EObject ruleInitHeadingCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_heading_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:329:28: ( (otherlv_0= 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) otherlv_2= ';' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:330:1: (otherlv_0= 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) otherlv_2= ';' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:330:1: (otherlv_0= 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) otherlv_2= ';' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:330:3: otherlv_0= 'heading' ( (lv_heading_1_0= ruleHeadingKind ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleInitHeadingCommand696); 

                	newLeafNode(otherlv_0, grammarAccess.getInitHeadingCommandAccess().getHeadingKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:334:1: ( (lv_heading_1_0= ruleHeadingKind ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:335:1: (lv_heading_1_0= ruleHeadingKind )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:335:1: (lv_heading_1_0= ruleHeadingKind )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:336:3: lv_heading_1_0= ruleHeadingKind
            {
             
            	        newCompositeNode(grammarAccess.getInitHeadingCommandAccess().getHeadingHeadingKindEnumRuleCall_1_0()); 
            	    
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:364:1: entryRuleInitBoardSizeCommand returns [EObject current=null] : iv_ruleInitBoardSizeCommand= ruleInitBoardSizeCommand EOF ;
    public final EObject entryRuleInitBoardSizeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitBoardSizeCommand = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:365:2: (iv_ruleInitBoardSizeCommand= ruleInitBoardSizeCommand EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:366:2: iv_ruleInitBoardSizeCommand= ruleInitBoardSizeCommand EOF
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:373:1: ruleInitBoardSizeCommand returns [EObject current=null] : (otherlv_0= 'boardSize' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ';' ) ;
    public final EObject ruleInitBoardSizeCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_2=null;
        Token lv_height_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:376:28: ( (otherlv_0= 'boardSize' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:377:1: (otherlv_0= 'boardSize' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ';' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:377:1: (otherlv_0= 'boardSize' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ';' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:377:3: otherlv_0= 'boardSize' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleInitBoardSizeCommand812); 

                	newLeafNode(otherlv_0, grammarAccess.getInitBoardSizeCommandAccess().getBoardSizeKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:381:1: ( (lv_width_1_0= RULE_INT ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:382:1: (lv_width_1_0= RULE_INT )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:382:1: (lv_width_1_0= RULE_INT )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:383:3: lv_width_1_0= RULE_INT
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
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:403:1: ( (lv_height_3_0= RULE_INT ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:404:1: (lv_height_3_0= RULE_INT )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:404:1: (lv_height_3_0= RULE_INT )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:405:3: lv_height_3_0= RULE_INT
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


    // $ANTLR start "entryRuleUserDefinedCommand"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:433:1: entryRuleUserDefinedCommand returns [EObject current=null] : iv_ruleUserDefinedCommand= ruleUserDefinedCommand EOF ;
    public final EObject entryRuleUserDefinedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDefinedCommand = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:434:2: (iv_ruleUserDefinedCommand= ruleUserDefinedCommand EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:435:2: iv_ruleUserDefinedCommand= ruleUserDefinedCommand EOF
            {
             newCompositeNode(grammarAccess.getUserDefinedCommandRule()); 
            pushFollow(FOLLOW_ruleUserDefinedCommand_in_entryRuleUserDefinedCommand916);
            iv_ruleUserDefinedCommand=ruleUserDefinedCommand();

            state._fsp--;

             current =iv_ruleUserDefinedCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedCommand926); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:442:1: ruleUserDefinedCommand returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocumentationComment ) )? otherlv_1= 'DEFINE COMMAND' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'AS' otherlv_4= 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'END' ) ;
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
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:445:28: ( ( ( (lv_doc_0_0= ruleDocumentationComment ) )? otherlv_1= 'DEFINE COMMAND' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'AS' otherlv_4= 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'END' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:446:1: ( ( (lv_doc_0_0= ruleDocumentationComment ) )? otherlv_1= 'DEFINE COMMAND' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'AS' otherlv_4= 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'END' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:446:1: ( ( (lv_doc_0_0= ruleDocumentationComment ) )? otherlv_1= 'DEFINE COMMAND' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'AS' otherlv_4= 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'END' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:446:2: ( (lv_doc_0_0= ruleDocumentationComment ) )? otherlv_1= 'DEFINE COMMAND' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'AS' otherlv_4= 'BEGIN' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= 'END'
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:446:2: ( (lv_doc_0_0= ruleDocumentationComment ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:447:1: (lv_doc_0_0= ruleDocumentationComment )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:447:1: (lv_doc_0_0= ruleDocumentationComment )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:448:3: lv_doc_0_0= ruleDocumentationComment
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserDefinedCommandAccess().getDocDocumentationCommentParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocumentationComment_in_ruleUserDefinedCommand972);
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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleUserDefinedCommand985); 

                	newLeafNode(otherlv_1, grammarAccess.getUserDefinedCommandAccess().getDEFINECOMMANDKeyword_1());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:468:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:469:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:469:1: (lv_name_2_0= RULE_ID )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:470:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserDefinedCommand1002); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleUserDefinedCommand1019); 

                	newLeafNode(otherlv_3, grammarAccess.getUserDefinedCommandAccess().getASKeyword_3());
                
            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleUserDefinedCommand1031); 

                	newLeafNode(otherlv_4, grammarAccess.getUserDefinedCommandAccess().getBEGINKeyword_4());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:494:1: ( (lv_statements_5_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==26||LA6_0==32||LA6_0==34||(LA6_0>=41 && LA6_0<=46)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:495:1: (lv_statements_5_0= ruleStatement )
            	    {
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:495:1: (lv_statements_5_0= ruleStatement )
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:496:3: lv_statements_5_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserDefinedCommandAccess().getStatementsStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleUserDefinedCommand1052);
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
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleUserDefinedCommand1065); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:524:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:525:2: (iv_ruleMain= ruleMain EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:526:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain1101);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain1111); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:533:1: ruleMain returns [EObject current=null] : ( () otherlv_1= 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'END-MAIN' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:536:28: ( ( () otherlv_1= 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'END-MAIN' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:537:1: ( () otherlv_1= 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'END-MAIN' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:537:1: ( () otherlv_1= 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'END-MAIN' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:537:2: () otherlv_1= 'BEGIN-MAIN' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'END-MAIN'
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:537:2: ()
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:538:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMainAccess().getMainAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleMain1157); 

                	newLeafNode(otherlv_1, grammarAccess.getMainAccess().getBEGINMAINKeyword_1());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:547:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==26||LA7_0==32||LA7_0==34||(LA7_0>=41 && LA7_0<=46)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:548:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:548:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:549:3: lv_statements_2_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleMain1178);
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
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleMain1191); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:577:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:578:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:579:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1227);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1237); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:586:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_IterateStatement_1 = null;

        EObject this_WhileStatement_2 = null;

        EObject this_CommandStatement_3 = null;

        EObject this_UserDefinedCommandStatement_4 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:589:28: ( (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:590:1: (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:590:1: (this_IfStatement_0= ruleIfStatement | this_IterateStatement_1= ruleIterateStatement | this_WhileStatement_2= ruleWhileStatement | this_CommandStatement_3= ruleCommandStatement | this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt8=4;
                }
                break;
            case RULE_ID:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:591:5: this_IfStatement_0= ruleIfStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement1284);
                    this_IfStatement_0=ruleIfStatement();

                    state._fsp--;

                     
                            current = this_IfStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:601:5: this_IterateStatement_1= ruleIterateStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getIterateStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIterateStatement_in_ruleStatement1311);
                    this_IterateStatement_1=ruleIterateStatement();

                    state._fsp--;

                     
                            current = this_IterateStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:611:5: this_WhileStatement_2= ruleWhileStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement1338);
                    this_WhileStatement_2=ruleWhileStatement();

                    state._fsp--;

                     
                            current = this_WhileStatement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:621:5: this_CommandStatement_3= ruleCommandStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getCommandStatementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCommandStatement_in_ruleStatement1365);
                    this_CommandStatement_3=ruleCommandStatement();

                    state._fsp--;

                     
                            current = this_CommandStatement_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:631:5: this_UserDefinedCommandStatement_4= ruleUserDefinedCommandStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getUserDefinedCommandStatementParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_ruleStatement1392);
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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:647:1: entryRuleUserDefinedCommandStatement returns [EObject current=null] : iv_ruleUserDefinedCommandStatement= ruleUserDefinedCommandStatement EOF ;
    public final EObject entryRuleUserDefinedCommandStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDefinedCommandStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:648:2: (iv_ruleUserDefinedCommandStatement= ruleUserDefinedCommandStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:649:2: iv_ruleUserDefinedCommandStatement= ruleUserDefinedCommandStatement EOF
            {
             newCompositeNode(grammarAccess.getUserDefinedCommandStatementRule()); 
            pushFollow(FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement1427);
            iv_ruleUserDefinedCommandStatement=ruleUserDefinedCommandStatement();

            state._fsp--;

             current =iv_ruleUserDefinedCommandStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement1437); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:656:1: ruleUserDefinedCommandStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' ) ;
    public final EObject ruleUserDefinedCommandStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:659:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:660:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:660:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:660:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ';'
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:660:2: ( (otherlv_0= RULE_ID ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:661:1: (otherlv_0= RULE_ID )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:661:1: (otherlv_0= RULE_ID )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:662:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUserDefinedCommandStatementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserDefinedCommandStatement1482); 

            		newLeafNode(otherlv_0, grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleUserDefinedCommandStatement1494); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:685:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:686:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:687:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement1530);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement1540); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:694:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )? ) ;
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
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:697:28: ( (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )? ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:698:1: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )? )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:698:1: (otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )? )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:698:3: otherlv_0= 'IF' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleIfStatement1577); 

                	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIFKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleIfStatement1589); 

                	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:706:1: ( (lv_condition_2_0= ruleConditionExpr ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:707:1: (lv_condition_2_0= ruleConditionExpr )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:707:1: (lv_condition_2_0= ruleConditionExpr )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:708:3: lv_condition_2_0= ruleConditionExpr
            {
             
            	        newCompositeNode(grammarAccess.getIfStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionExpr_in_ruleIfStatement1610);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleIfStatement1622); 

                	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleIfStatement1634); 

                	newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:732:1: ( (lv_statements_5_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==26||LA9_0==32||LA9_0==34||(LA9_0>=41 && LA9_0<=46)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:733:1: (lv_statements_5_0= ruleStatement )
            	    {
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:733:1: (lv_statements_5_0= ruleStatement )
            	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:734:3: lv_statements_5_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleIfStatement1655);
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
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleIfStatement1668); 

                	newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_6());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:754:1: (otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:754:3: otherlv_7= 'ELSE' otherlv_8= '{' ( (lv_elseStatements_9_0= ruleStatement ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleIfStatement1681); 

                        	newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getELSEKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleIfStatement1693); 

                        	newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:762:1: ( (lv_elseStatements_9_0= ruleStatement ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID||LA10_0==26||LA10_0==32||LA10_0==34||(LA10_0>=41 && LA10_0<=46)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:763:1: (lv_elseStatements_9_0= ruleStatement )
                    	    {
                    	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:763:1: (lv_elseStatements_9_0= ruleStatement )
                    	    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:764:3: lv_elseStatements_9_0= ruleStatement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementsStatementParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleIfStatement1714);
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
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleIfStatement1727); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:792:1: entryRuleIterateStatement returns [EObject current=null] : iv_ruleIterateStatement= ruleIterateStatement EOF ;
    public final EObject entryRuleIterateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:793:2: (iv_ruleIterateStatement= ruleIterateStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:794:2: iv_ruleIterateStatement= ruleIterateStatement EOF
            {
             newCompositeNode(grammarAccess.getIterateStatementRule()); 
            pushFollow(FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement1765);
            iv_ruleIterateStatement=ruleIterateStatement();

            state._fsp--;

             current =iv_ruleIterateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterateStatement1775); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:801:1: ruleIterateStatement returns [EObject current=null] : (otherlv_0= 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'TIMES' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) otherlv_5= '}' ) ;
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
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:804:28: ( (otherlv_0= 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'TIMES' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) otherlv_5= '}' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:805:1: (otherlv_0= 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'TIMES' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) otherlv_5= '}' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:805:1: (otherlv_0= 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'TIMES' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) otherlv_5= '}' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:805:3: otherlv_0= 'ITERATE' ( (lv_times_1_0= RULE_INT ) ) otherlv_2= 'TIMES' otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleIterateStatement1812); 

                	newLeafNode(otherlv_0, grammarAccess.getIterateStatementAccess().getITERATEKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:809:1: ( (lv_times_1_0= RULE_INT ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:810:1: (lv_times_1_0= RULE_INT )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:810:1: (lv_times_1_0= RULE_INT )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:811:3: lv_times_1_0= RULE_INT
            {
            lv_times_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIterateStatement1829); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleIterateStatement1846); 

                	newLeafNode(otherlv_2, grammarAccess.getIterateStatementAccess().getTIMESKeyword_2());
                
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleIterateStatement1858); 

                	newLeafNode(otherlv_3, grammarAccess.getIterateStatementAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:835:1: ( (lv_statements_4_0= ruleStatement ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:836:1: (lv_statements_4_0= ruleStatement )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:836:1: (lv_statements_4_0= ruleStatement )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:837:3: lv_statements_4_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getIterateStatementAccess().getStatementsStatementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleIterateStatement1879);
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

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleIterateStatement1891); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:865:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:866:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:867:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement1927);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement1937); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:874:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) otherlv_6= '}' ) ;
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
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:877:28: ( (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) otherlv_6= '}' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:878:1: (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) otherlv_6= '}' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:878:1: (otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) otherlv_6= '}' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:878:3: otherlv_0= 'WHILE' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpr ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleWhileStatement1974); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWHILEKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleWhileStatement1986); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:886:1: ( (lv_condition_2_0= ruleConditionExpr ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:887:1: (lv_condition_2_0= ruleConditionExpr )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:887:1: (lv_condition_2_0= ruleConditionExpr )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:888:3: lv_condition_2_0= ruleConditionExpr
            {
             
            	        newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionExpr_in_ruleWhileStatement2007);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleWhileStatement2019); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleWhileStatement2031); 

                	newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:912:1: ( (lv_statements_5_0= ruleStatement ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:913:1: (lv_statements_5_0= ruleStatement )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:913:1: (lv_statements_5_0= ruleStatement )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:914:3: lv_statements_5_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleWhileStatement2052);
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

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleWhileStatement2064); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:942:1: entryRuleDocumentationComment returns [EObject current=null] : iv_ruleDocumentationComment= ruleDocumentationComment EOF ;
    public final EObject entryRuleDocumentationComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentationComment = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:943:2: (iv_ruleDocumentationComment= ruleDocumentationComment EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:944:2: iv_ruleDocumentationComment= ruleDocumentationComment EOF
            {
             newCompositeNode(grammarAccess.getDocumentationCommentRule()); 
            pushFollow(FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment2100);
            iv_ruleDocumentationComment=ruleDocumentationComment();

            state._fsp--;

             current =iv_ruleDocumentationComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentationComment2110); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:951:1: ruleDocumentationComment returns [EObject current=null] : (otherlv_0= '@(' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleDocumentationComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:954:28: ( (otherlv_0= '@(' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:955:1: (otherlv_0= '@(' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:955:1: (otherlv_0= '@(' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:955:3: otherlv_0= '@(' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleDocumentationComment2147); 

                	newLeafNode(otherlv_0, grammarAccess.getDocumentationCommentAccess().getCommercialAtLeftParenthesisKeyword_0());
                
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:959:1: ( (lv_text_1_0= RULE_STRING ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:960:1: (lv_text_1_0= RULE_STRING )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:960:1: (lv_text_1_0= RULE_STRING )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:961:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDocumentationComment2164); 

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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleDocumentationComment2181); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:989:1: entryRuleCommandStatement returns [EObject current=null] : iv_ruleCommandStatement= ruleCommandStatement EOF ;
    public final EObject entryRuleCommandStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandStatement = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:990:2: (iv_ruleCommandStatement= ruleCommandStatement EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:991:2: iv_ruleCommandStatement= ruleCommandStatement EOF
            {
             newCompositeNode(grammarAccess.getCommandStatementRule()); 
            pushFollow(FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement2217);
            iv_ruleCommandStatement=ruleCommandStatement();

            state._fsp--;

             current =iv_ruleCommandStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandStatement2227); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:998:1: ruleCommandStatement returns [EObject current=null] : ( ( (lv_kind_0_0= ruleCommandKind ) ) otherlv_1= ';' ) ;
    public final EObject ruleCommandStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1001:28: ( ( ( (lv_kind_0_0= ruleCommandKind ) ) otherlv_1= ';' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1002:1: ( ( (lv_kind_0_0= ruleCommandKind ) ) otherlv_1= ';' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1002:1: ( ( (lv_kind_0_0= ruleCommandKind ) ) otherlv_1= ';' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1002:2: ( (lv_kind_0_0= ruleCommandKind ) ) otherlv_1= ';'
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1002:2: ( (lv_kind_0_0= ruleCommandKind ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1003:1: (lv_kind_0_0= ruleCommandKind )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1003:1: (lv_kind_0_0= ruleCommandKind )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1004:3: lv_kind_0_0= ruleCommandKind
            {
             
            	        newCompositeNode(grammarAccess.getCommandStatementAccess().getKindCommandKindEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommandKind_in_ruleCommandStatement2273);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleCommandStatement2285); 

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


    // $ANTLR start "entryRuleConditionExpr"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1032:1: entryRuleConditionExpr returns [EObject current=null] : iv_ruleConditionExpr= ruleConditionExpr EOF ;
    public final EObject entryRuleConditionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionExpr = null;


        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1033:2: (iv_ruleConditionExpr= ruleConditionExpr EOF )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1034:2: iv_ruleConditionExpr= ruleConditionExpr EOF
            {
             newCompositeNode(grammarAccess.getConditionExprRule()); 
            pushFollow(FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr2321);
            iv_ruleConditionExpr=ruleConditionExpr();

            state._fsp--;

             current =iv_ruleConditionExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionExpr2331); 

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
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1041:1: ruleConditionExpr returns [EObject current=null] : ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) ) ;
    public final EObject ruleConditionExpr() throws RecognitionException {
        EObject current = null;

        Token lv_negation_0_0=null;
        Enumerator lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1044:28: ( ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1045:1: ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1045:1: ( ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1045:2: ( (lv_negation_0_0= '!' ) ) ( (lv_expr_1_0= ruleConditionKind ) )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1045:2: ( (lv_negation_0_0= '!' ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1046:1: (lv_negation_0_0= '!' )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1046:1: (lv_negation_0_0= '!' )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1047:3: lv_negation_0_0= '!'
            {
            lv_negation_0_0=(Token)match(input,36,FOLLOW_36_in_ruleConditionExpr2374); 

                    newLeafNode(lv_negation_0_0, grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionExprRule());
            	        }
                   		setWithLastConsumed(current, "negation", true, "!");
            	    

            }


            }

            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1060:2: ( (lv_expr_1_0= ruleConditionKind ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1061:1: (lv_expr_1_0= ruleConditionKind )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1061:1: (lv_expr_1_0= ruleConditionKind )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1062:3: lv_expr_1_0= ruleConditionKind
            {
             
            	        newCompositeNode(grammarAccess.getConditionExprAccess().getExprConditionKindEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionKind_in_ruleConditionExpr2408);
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


    // $ANTLR start "ruleHeadingKind"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1086:1: ruleHeadingKind returns [Enumerator current=null] : ( (enumLiteral_0= 'NORTH' ) | (enumLiteral_1= 'SOUTH' ) | (enumLiteral_2= 'WEST' ) | (enumLiteral_3= 'EAST' ) ) ;
    public final Enumerator ruleHeadingKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1088:28: ( ( (enumLiteral_0= 'NORTH' ) | (enumLiteral_1= 'SOUTH' ) | (enumLiteral_2= 'WEST' ) | (enumLiteral_3= 'EAST' ) ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1089:1: ( (enumLiteral_0= 'NORTH' ) | (enumLiteral_1= 'SOUTH' ) | (enumLiteral_2= 'WEST' ) | (enumLiteral_3= 'EAST' ) )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1089:1: ( (enumLiteral_0= 'NORTH' ) | (enumLiteral_1= 'SOUTH' ) | (enumLiteral_2= 'WEST' ) | (enumLiteral_3= 'EAST' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt12=1;
                }
                break;
            case 38:
                {
                alt12=2;
                }
                break;
            case 39:
                {
                alt12=3;
                }
                break;
            case 40:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1089:2: (enumLiteral_0= 'NORTH' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1089:2: (enumLiteral_0= 'NORTH' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1089:4: enumLiteral_0= 'NORTH'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleHeadingKind2458); 

                            current = grammarAccess.getHeadingKindAccess().getNORTHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHeadingKindAccess().getNORTHEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1095:6: (enumLiteral_1= 'SOUTH' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1095:6: (enumLiteral_1= 'SOUTH' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1095:8: enumLiteral_1= 'SOUTH'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleHeadingKind2475); 

                            current = grammarAccess.getHeadingKindAccess().getSOUTHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHeadingKindAccess().getSOUTHEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1101:6: (enumLiteral_2= 'WEST' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1101:6: (enumLiteral_2= 'WEST' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1101:8: enumLiteral_2= 'WEST'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleHeadingKind2492); 

                            current = grammarAccess.getHeadingKindAccess().getWESTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getHeadingKindAccess().getWESTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1107:6: (enumLiteral_3= 'EAST' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1107:6: (enumLiteral_3= 'EAST' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1107:8: enumLiteral_3= 'EAST'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_40_in_ruleHeadingKind2509); 

                            current = grammarAccess.getHeadingKindAccess().getEASTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getHeadingKindAccess().getEASTEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleHeadingKind"


    // $ANTLR start "ruleCommandKind"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1117:1: ruleCommandKind returns [Enumerator current=null] : ( (enumLiteral_0= 'move' ) | (enumLiteral_1= 'turn' ) | (enumLiteral_2= 'turnOn' ) | (enumLiteral_3= 'turnOff' ) | (enumLiteral_4= 'put' ) | (enumLiteral_5= 'get' ) ) ;
    public final Enumerator ruleCommandKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1119:28: ( ( (enumLiteral_0= 'move' ) | (enumLiteral_1= 'turn' ) | (enumLiteral_2= 'turnOn' ) | (enumLiteral_3= 'turnOff' ) | (enumLiteral_4= 'put' ) | (enumLiteral_5= 'get' ) ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1120:1: ( (enumLiteral_0= 'move' ) | (enumLiteral_1= 'turn' ) | (enumLiteral_2= 'turnOn' ) | (enumLiteral_3= 'turnOff' ) | (enumLiteral_4= 'put' ) | (enumLiteral_5= 'get' ) )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1120:1: ( (enumLiteral_0= 'move' ) | (enumLiteral_1= 'turn' ) | (enumLiteral_2= 'turnOn' ) | (enumLiteral_3= 'turnOff' ) | (enumLiteral_4= 'put' ) | (enumLiteral_5= 'get' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt13=1;
                }
                break;
            case 42:
                {
                alt13=2;
                }
                break;
            case 43:
                {
                alt13=3;
                }
                break;
            case 44:
                {
                alt13=4;
                }
                break;
            case 45:
                {
                alt13=5;
                }
                break;
            case 46:
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
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1120:2: (enumLiteral_0= 'move' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1120:2: (enumLiteral_0= 'move' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1120:4: enumLiteral_0= 'move'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleCommandKind2554); 

                            current = grammarAccess.getCommandKindAccess().getMOVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCommandKindAccess().getMOVEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1126:6: (enumLiteral_1= 'turn' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1126:6: (enumLiteral_1= 'turn' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1126:8: enumLiteral_1= 'turn'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleCommandKind2571); 

                            current = grammarAccess.getCommandKindAccess().getTURNLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCommandKindAccess().getTURNLEFTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1132:6: (enumLiteral_2= 'turnOn' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1132:6: (enumLiteral_2= 'turnOn' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1132:8: enumLiteral_2= 'turnOn'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_43_in_ruleCommandKind2588); 

                            current = grammarAccess.getCommandKindAccess().getTURNONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCommandKindAccess().getTURNONEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1138:6: (enumLiteral_3= 'turnOff' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1138:6: (enumLiteral_3= 'turnOff' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1138:8: enumLiteral_3= 'turnOff'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_44_in_ruleCommandKind2605); 

                            current = grammarAccess.getCommandKindAccess().getTURNOFFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCommandKindAccess().getTURNOFFEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1144:6: (enumLiteral_4= 'put' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1144:6: (enumLiteral_4= 'put' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1144:8: enumLiteral_4= 'put'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_45_in_ruleCommandKind2622); 

                            current = grammarAccess.getCommandKindAccess().getPUTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCommandKindAccess().getPUTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1150:6: (enumLiteral_5= 'get' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1150:6: (enumLiteral_5= 'get' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1150:8: enumLiteral_5= 'get'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_46_in_ruleCommandKind2639); 

                            current = grammarAccess.getCommandKindAccess().getGETEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getCommandKindAccess().getGETEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleCommandKind"


    // $ANTLR start "ruleConditionKind"
    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1160:1: ruleConditionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'WALL_AHEAD' ) | (enumLiteral_1= 'MARKED_PLACE' ) ) ;
    public final Enumerator ruleConditionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1162:28: ( ( (enumLiteral_0= 'WALL_AHEAD' ) | (enumLiteral_1= 'MARKED_PLACE' ) ) )
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1163:1: ( (enumLiteral_0= 'WALL_AHEAD' ) | (enumLiteral_1= 'MARKED_PLACE' ) )
            {
            // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1163:1: ( (enumLiteral_0= 'WALL_AHEAD' ) | (enumLiteral_1= 'MARKED_PLACE' ) )
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
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1163:2: (enumLiteral_0= 'WALL_AHEAD' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1163:2: (enumLiteral_0= 'WALL_AHEAD' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1163:4: enumLiteral_0= 'WALL_AHEAD'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleConditionKind2684); 

                            current = grammarAccess.getConditionKindAccess().getWALL_AHEADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConditionKindAccess().getWALL_AHEADEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1169:6: (enumLiteral_1= 'MARKED_PLACE' )
                    {
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1169:6: (enumLiteral_1= 'MARKED_PLACE' )
                    // ../org.macjariel.karel/src-gen/org/macjariel/karel/parser/antlr/internal/InternalKarel.g:1169:8: enumLiteral_1= 'MARKED_PLACE'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleConditionKind2701); 

                            current = grammarAccess.getConditionKindAccess().getMARKED_PLACEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConditionKindAccess().getMARKED_PLACEEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleConditionKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProgram122 = new BitSet(new long[]{0x0000000801102000L});
    public static final BitSet FOLLOW_ruleInitSection_in_ruleProgram143 = new BitSet(new long[]{0x0000000801102000L});
    public static final BitSet FOLLOW_ruleUserDefinedCommand_in_ruleProgram165 = new BitSet(new long[]{0x0000000801102000L});
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
    public static final BitSet FOLLOW_18_in_ruleInitHeadingCommand696 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_ruleHeadingKind_in_ruleInitHeadingCommand717 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInitHeadingCommand729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitBoardSizeCommand_in_entryRuleInitBoardSizeCommand765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitBoardSizeCommand775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleInitBoardSizeCommand812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitBoardSizeCommand829 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInitBoardSizeCommand846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInitBoardSizeCommand863 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInitBoardSizeCommand880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommand_in_entryRuleUserDefinedCommand916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedCommand926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_ruleUserDefinedCommand972 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUserDefinedCommand985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserDefinedCommand1002 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUserDefinedCommand1019 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleUserDefinedCommand1031 = new BitSet(new long[]{0x00007E0504800020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleUserDefinedCommand1052 = new BitSet(new long[]{0x00007E0504800020L});
    public static final BitSet FOLLOW_23_in_ruleUserDefinedCommand1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain1101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMain1157 = new BitSet(new long[]{0x00007E0506000020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleMain1178 = new BitSet(new long[]{0x00007E0506000020L});
    public static final BitSet FOLLOW_25_in_ruleMain1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_ruleStatement1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_ruleStatement1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_ruleStatement1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedCommandStatement_in_entryRuleUserDefinedCommandStatement1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedCommandStatement1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserDefinedCommandStatement1482 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUserDefinedCommandStatement1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement1530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleIfStatement1577 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIfStatement1589 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_ruleIfStatement1610 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIfStatement1622 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIfStatement1634 = new BitSet(new long[]{0x00007E0544000020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfStatement1655 = new BitSet(new long[]{0x00007E0544000020L});
    public static final BitSet FOLLOW_30_in_ruleIfStatement1668 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleIfStatement1681 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIfStatement1693 = new BitSet(new long[]{0x00007E0544000020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfStatement1714 = new BitSet(new long[]{0x00007E0544000020L});
    public static final BitSet FOLLOW_30_in_ruleIfStatement1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterateStatement_in_entryRuleIterateStatement1765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterateStatement1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleIterateStatement1812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIterateStatement1829 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleIterateStatement1846 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIterateStatement1858 = new BitSet(new long[]{0x00007E0504000020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIterateStatement1879 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleIterateStatement1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleWhileStatement1974 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleWhileStatement1986 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_ruleWhileStatement2007 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleWhileStatement2019 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleWhileStatement2031 = new BitSet(new long[]{0x00007E0504000020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhileStatement2052 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleWhileStatement2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentationComment_in_entryRuleDocumentationComment2100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentationComment2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDocumentationComment2147 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDocumentationComment2164 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDocumentationComment2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandStatement_in_entryRuleCommandStatement2217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandStatement2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandKind_in_ruleCommandStatement2273 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCommandStatement2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpr_in_entryRuleConditionExpr2321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionExpr2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleConditionExpr2374 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleConditionKind_in_ruleConditionExpr2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleHeadingKind2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleHeadingKind2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleHeadingKind2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleHeadingKind2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCommandKind2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCommandKind2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCommandKind2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCommandKind2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCommandKind2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCommandKind2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleConditionKind2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleConditionKind2701 = new BitSet(new long[]{0x0000000000000002L});

}