/*
* generated by Xtext
*/
grammar InternalKarel;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.macjariel.karel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	 iv_ruleProgram=ruleProgram 
	 { $current=$iv_ruleProgram.current; } 
	 EOF 
;

// Rule Program
ruleProgram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='BEGIN-PROGRAM' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getBEGINPROGRAMKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getInitSectionInitSectionParserRuleCall_1_0()); 
	    }
		lv_initSection_1_0=ruleInitSection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		set(
       			$current, 
       			"initSection",
        		lv_initSection_1_0, 
        		"InitSection");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getUserDefinedCommandsUserDefinedCommandParserRuleCall_2_0()); 
	    }
		lv_userDefinedCommands_2_0=ruleUserDefinedCommand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		add(
       			$current, 
       			"userDefinedCommands",
        		lv_userDefinedCommands_2_0, 
        		"UserDefinedCommand");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_3_0()); 
	    }
		lv_main_3_0=ruleMain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		set(
       			$current, 
       			"main",
        		lv_main_3_0, 
        		"Main");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='END-PROGRAM' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getENDPROGRAMKeyword_4());
    }
)
;





// Entry rule entryRuleInitSection
entryRuleInitSection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInitSectionRule()); }
	 iv_ruleInitSection=ruleInitSection 
	 { $current=$iv_ruleInitSection.current; } 
	 EOF 
;

// Rule InitSection
ruleInitSection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='BEGIN-INIT' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInitSectionAccess().getBEGININITKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInitSectionAccess().getInitCommandsInitCommandParserRuleCall_1_0()); 
	    }
		lv_initCommands_1_0=ruleInitCommand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInitSectionRule());
	        }
       		add(
       			$current, 
       			"initCommands",
        		lv_initCommands_1_0, 
        		"InitCommand");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_2='END-INIT' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getInitSectionAccess().getENDINITKeyword_2());
    }
)
;





// Entry rule entryRuleInitCommand
entryRuleInitCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInitCommandRule()); }
	 iv_ruleInitCommand=ruleInitCommand 
	 { $current=$iv_ruleInitCommand.current; } 
	 EOF 
;

// Rule InitCommand
ruleInitCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getInitCommandAccess().getInitPositionCommandParserRuleCall_0()); 
    }
    this_InitPositionCommand_0=ruleInitPositionCommand
    { 
        $current = $this_InitPositionCommand_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getInitCommandAccess().getInitHeadingCommandParserRuleCall_1()); 
    }
    this_InitHeadingCommand_1=ruleInitHeadingCommand
    { 
        $current = $this_InitHeadingCommand_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getInitCommandAccess().getInitBoardSizeCommandParserRuleCall_2()); 
    }
    this_InitBoardSizeCommand_2=ruleInitBoardSizeCommand
    { 
        $current = $this_InitBoardSizeCommand_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleInitPositionCommand
entryRuleInitPositionCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInitPositionCommandRule()); }
	 iv_ruleInitPositionCommand=ruleInitPositionCommand 
	 { $current=$iv_ruleInitPositionCommand.current; } 
	 EOF 
;

// Rule InitPositionCommand
ruleInitPositionCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='position' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInitPositionCommandAccess().getPositionKeyword_0());
    }
(
(
		lv_x_1_0=RULE_INT
		{
			newLeafNode(lv_x_1_0, grammarAccess.getInitPositionCommandAccess().getXINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInitPositionCommandRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"x",
        		lv_x_1_0, 
        		"INT");
	    }

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getInitPositionCommandAccess().getCommaKeyword_2());
    }
(
(
		lv_y_3_0=RULE_INT
		{
			newLeafNode(lv_y_3_0, grammarAccess.getInitPositionCommandAccess().getYINTTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInitPositionCommandRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"y",
        		lv_y_3_0, 
        		"INT");
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getInitPositionCommandAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleInitHeadingCommand
entryRuleInitHeadingCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInitHeadingCommandRule()); }
	 iv_ruleInitHeadingCommand=ruleInitHeadingCommand 
	 { $current=$iv_ruleInitHeadingCommand.current; } 
	 EOF 
;

// Rule InitHeadingCommand
ruleInitHeadingCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='heading' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInitHeadingCommandAccess().getHeadingKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInitHeadingCommandAccess().getHeadingHeadingKindParserRuleCall_1_0()); 
	    }
		lv_heading_1_0=ruleHeadingKind		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInitHeadingCommandRule());
	        }
       		set(
       			$current, 
       			"heading",
        		lv_heading_1_0, 
        		"HeadingKind");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getInitHeadingCommandAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleInitBoardSizeCommand
entryRuleInitBoardSizeCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInitBoardSizeCommandRule()); }
	 iv_ruleInitBoardSizeCommand=ruleInitBoardSizeCommand 
	 { $current=$iv_ruleInitBoardSizeCommand.current; } 
	 EOF 
;

// Rule InitBoardSizeCommand
ruleInitBoardSizeCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='boardSize' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInitBoardSizeCommandAccess().getBoardSizeKeyword_0());
    }
(
(
		lv_width_1_0=RULE_INT
		{
			newLeafNode(lv_width_1_0, grammarAccess.getInitBoardSizeCommandAccess().getWidthINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInitBoardSizeCommandRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"width",
        		lv_width_1_0, 
        		"INT");
	    }

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getInitBoardSizeCommandAccess().getCommaKeyword_2());
    }
(
(
		lv_height_3_0=RULE_INT
		{
			newLeafNode(lv_height_3_0, grammarAccess.getInitBoardSizeCommandAccess().getHeightINTTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInitBoardSizeCommandRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"height",
        		lv_height_3_0, 
        		"INT");
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getInitBoardSizeCommandAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleHeadingKind
entryRuleHeadingKind returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getHeadingKindRule()); } 
	 iv_ruleHeadingKind=ruleHeadingKind 
	 { $current=$iv_ruleHeadingKind.current.getText(); }  
	 EOF 
;

// Rule HeadingKind
ruleHeadingKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='NORTH' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getHeadingKindAccess().getNORTHKeyword_0()); 
    }

    |
	kw='SOUTH' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getHeadingKindAccess().getSOUTHKeyword_1()); 
    }

    |
	kw='WEST' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getHeadingKindAccess().getWESTKeyword_2()); 
    }

    |
	kw='EAST' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getHeadingKindAccess().getEASTKeyword_3()); 
    }
)
    ;





// Entry rule entryRuleUserDefinedCommand
entryRuleUserDefinedCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUserDefinedCommandRule()); }
	 iv_ruleUserDefinedCommand=ruleUserDefinedCommand 
	 { $current=$iv_ruleUserDefinedCommand.current; } 
	 EOF 
;

// Rule UserDefinedCommand
ruleUserDefinedCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getUserDefinedCommandAccess().getDocDocumentationCommentParserRuleCall_0_0()); 
	    }
		lv_doc_0_0=ruleDocumentationComment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUserDefinedCommandRule());
	        }
       		set(
       			$current, 
       			"doc",
        		lv_doc_0_0, 
        		"DocumentationComment");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_1='DEFINE COMMAND' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getUserDefinedCommandAccess().getDEFINECOMMANDKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getUserDefinedCommandAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUserDefinedCommandRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='AS' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getUserDefinedCommandAccess().getASKeyword_3());
    }
	otherlv_4='BEGIN' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getUserDefinedCommandAccess().getBEGINKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getUserDefinedCommandAccess().getStatementsStatementParserRuleCall_5_0()); 
	    }
		lv_statements_5_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUserDefinedCommandRule());
	        }
       		add(
       			$current, 
       			"statements",
        		lv_statements_5_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='END' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getUserDefinedCommandAccess().getENDKeyword_6());
    }
)
;





// Entry rule entryRuleMain
entryRuleMain returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMainRule()); }
	 iv_ruleMain=ruleMain 
	 { $current=$iv_ruleMain.current; } 
	 EOF 
;

// Rule Main
ruleMain returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getMainAccess().getMainAction_0(),
            $current);
    }
)	otherlv_1='BEGIN-MAIN' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMainAccess().getBEGINMAINKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_2_0()); 
	    }
		lv_statements_2_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMainRule());
	        }
       		add(
       			$current, 
       			"statements",
        		lv_statements_2_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3='END-MAIN' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMainAccess().getENDMAINKeyword_3());
    }
)
;





// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	 iv_ruleStatement=ruleStatement 
	 { $current=$iv_ruleStatement.current; } 
	 EOF 
;

// Rule Statement
ruleStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
    }
    this_IfStatement_0=ruleIfStatement
    { 
        $current = $this_IfStatement_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getIterateStatementParserRuleCall_1()); 
    }
    this_IterateStatement_1=ruleIterateStatement
    { 
        $current = $this_IterateStatement_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2()); 
    }
    this_WhileStatement_2=ruleWhileStatement
    { 
        $current = $this_WhileStatement_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getBreakableStatementParserRuleCall_3()); 
    }
    this_BreakableStatement_3=ruleBreakableStatement
    { 
        $current = $this_BreakableStatement_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleBreakableStatement
entryRuleBreakableStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBreakableStatementRule()); }
	 iv_ruleBreakableStatement=ruleBreakableStatement 
	 { $current=$iv_ruleBreakableStatement.current; } 
	 EOF 
;

// Rule BreakableStatement
ruleBreakableStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getBreakableStatementAccess().getCommandStatementParserRuleCall_0()); 
    }
    this_CommandStatement_0=ruleCommandStatement
    { 
        $current = $this_CommandStatement_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBreakableStatementAccess().getUserDefinedCommandStatementParserRuleCall_1()); 
    }
    this_UserDefinedCommandStatement_1=ruleUserDefinedCommandStatement
    { 
        $current = $this_UserDefinedCommandStatement_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleUserDefinedCommandStatement
entryRuleUserDefinedCommandStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUserDefinedCommandStatementRule()); }
	 iv_ruleUserDefinedCommandStatement=ruleUserDefinedCommandStatement 
	 { $current=$iv_ruleUserDefinedCommandStatement.current; } 
	 EOF 
;

// Rule UserDefinedCommandStatement
ruleUserDefinedCommandStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUserDefinedCommandStatementRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getUserDefinedCommandStatementAccess().getCommandUserDefinedCommandCrossReference_0_0()); 
	}

)
)	otherlv_1=';' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getUserDefinedCommandStatementAccess().getSemicolonKeyword_1());
    }
)
;





// Entry rule entryRuleIfStatement
entryRuleIfStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIfStatementRule()); }
	 iv_ruleIfStatement=ruleIfStatement 
	 { $current=$iv_ruleIfStatement.current; } 
	 EOF 
;

// Rule IfStatement
ruleIfStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='IF' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIFKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
	    }
		lv_condition_2_0=ruleConditionExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfStatementRule());
	        }
       		set(
       			$current, 
       			"condition",
        		lv_condition_2_0, 
        		"ConditionExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
    }
	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
	    }
		lv_statements_5_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfStatementRule());
	        }
       		add(
       			$current, 
       			"statements",
        		lv_statements_5_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_6());
    }
(	otherlv_7='ELSE' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getELSEKeyword_7_0());
    }
	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getLeftCurlyBracketKeyword_7_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementsStatementParserRuleCall_7_2_0()); 
	    }
		lv_elseStatements_9_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfStatementRule());
	        }
       		add(
       			$current, 
       			"elseStatements",
        		lv_elseStatements_9_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getRightCurlyBracketKeyword_7_3());
    }
)?)
;





// Entry rule entryRuleIterateStatement
entryRuleIterateStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIterateStatementRule()); }
	 iv_ruleIterateStatement=ruleIterateStatement 
	 { $current=$iv_ruleIterateStatement.current; } 
	 EOF 
;

// Rule IterateStatement
ruleIterateStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='ITERATE' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIterateStatementAccess().getITERATEKeyword_0());
    }
(
(
		lv_times_1_0=RULE_INT
		{
			newLeafNode(lv_times_1_0, grammarAccess.getIterateStatementAccess().getTimesINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIterateStatementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"times",
        		lv_times_1_0, 
        		"INT");
	    }

)
)	otherlv_2='TIMES' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getIterateStatementAccess().getTIMESKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIterateStatementAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIterateStatementAccess().getStatementsStatementParserRuleCall_4_0()); 
	    }
		lv_statements_4_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIterateStatementRule());
	        }
       		add(
       			$current, 
       			"statements",
        		lv_statements_4_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getIterateStatementAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleWhileStatement
entryRuleWhileStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getWhileStatementRule()); }
	 iv_ruleWhileStatement=ruleWhileStatement 
	 { $current=$iv_ruleWhileStatement.current; } 
	 EOF 
;

// Rule WhileStatement
ruleWhileStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='WHILE' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWHILEKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionConditionExprParserRuleCall_2_0()); 
	    }
		lv_condition_2_0=ruleConditionExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWhileStatementRule());
	        }
       		set(
       			$current, 
       			"condition",
        		lv_condition_2_0, 
        		"ConditionExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
    }
	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getWhileStatementAccess().getStatementsStatementParserRuleCall_5_0()); 
	    }
		lv_statements_5_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWhileStatementRule());
	        }
       		add(
       			$current, 
       			"statements",
        		lv_statements_5_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getWhileStatementAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleDocumentationComment
entryRuleDocumentationComment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDocumentationCommentRule()); }
	 iv_ruleDocumentationComment=ruleDocumentationComment 
	 { $current=$iv_ruleDocumentationComment.current; } 
	 EOF 
;

// Rule DocumentationComment
ruleDocumentationComment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='@(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDocumentationCommentAccess().getCommercialAtLeftParenthesisKeyword_0());
    }
(
(
		lv_text_1_0=RULE_STRING
		{
			newLeafNode(lv_text_1_0, grammarAccess.getDocumentationCommentAccess().getTextSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDocumentationCommentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_1_0, 
        		"STRING");
	    }

)
)	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDocumentationCommentAccess().getRightParenthesisKeyword_2());
    }
)
;





// Entry rule entryRuleCommandStatement
entryRuleCommandStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandStatementRule()); }
	 iv_ruleCommandStatement=ruleCommandStatement 
	 { $current=$iv_ruleCommandStatement.current; } 
	 EOF 
;

// Rule CommandStatement
ruleCommandStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getCommandStatementAccess().getKindCommandKindParserRuleCall_0_0()); 
	    }
		lv_kind_0_0=ruleCommandKind		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandStatementRule());
	        }
       		set(
       			$current, 
       			"kind",
        		lv_kind_0_0, 
        		"CommandKind");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=';' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCommandStatementAccess().getSemicolonKeyword_1());
    }
)
;





// Entry rule entryRuleCommandKind
entryRuleCommandKind returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandKindRule()); } 
	 iv_ruleCommandKind=ruleCommandKind 
	 { $current=$iv_ruleCommandKind.current.getText(); }  
	 EOF 
;

// Rule CommandKind
ruleCommandKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='move' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getCommandKindAccess().getMoveKeyword_0()); 
    }

    |
	kw='turn' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getCommandKindAccess().getTurnKeyword_1()); 
    }

    |
	kw='turnOn' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getCommandKindAccess().getTurnOnKeyword_2()); 
    }

    |
	kw='turnOff' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getCommandKindAccess().getTurnOffKeyword_3()); 
    }

    |
	kw='put' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getCommandKindAccess().getPutKeyword_4()); 
    }

    |
	kw='get' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getCommandKindAccess().getGetKeyword_5()); 
    }
)
    ;





// Entry rule entryRuleConditionExpr
entryRuleConditionExpr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionExprRule()); }
	 iv_ruleConditionExpr=ruleConditionExpr 
	 { $current=$iv_ruleConditionExpr.current; } 
	 EOF 
;

// Rule ConditionExpr
ruleConditionExpr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_negation_0_0=	'!' 
    {
        newLeafNode(lv_negation_0_0, grammarAccess.getConditionExprAccess().getNegationExclamationMarkKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionExprRule());
	        }
       		setWithLastConsumed($current, "negation", true, "!");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getConditionExprAccess().getExprConditionKindParserRuleCall_1_0()); 
	    }
		lv_expr_1_0=ruleConditionKind		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConditionExprRule());
	        }
       		set(
       			$current, 
       			"expr",
        		lv_expr_1_0, 
        		"ConditionKind");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleConditionKind
entryRuleConditionKind returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionKindRule()); } 
	 iv_ruleConditionKind=ruleConditionKind 
	 { $current=$iv_ruleConditionKind.current.getText(); }  
	 EOF 
;

// Rule ConditionKind
ruleConditionKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='WALL_AHEAD' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getConditionKindAccess().getWALL_AHEADKeyword_0()); 
    }

    |
	kw='MARKED_PLACE' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getConditionKindAccess().getMARKED_PLACEKeyword_1()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


