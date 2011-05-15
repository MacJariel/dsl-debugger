/*
* generated by Xtext
*/
package org.macjariel.karel.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.macjariel.karel.services.KarelGrammarAccess;

public class KarelParser extends AbstractContentAssistParser {
	
	@Inject
	private KarelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.macjariel.karel.ui.contentassist.antlr.internal.InternalKarelParser createParser() {
		org.macjariel.karel.ui.contentassist.antlr.internal.InternalKarelParser result = new org.macjariel.karel.ui.contentassist.antlr.internal.InternalKarelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInitCommandAccess().getAlternatives(), "rule__InitCommand__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getHeadingKindAccess().getAlternatives(), "rule__HeadingKind__Alternatives");
					put(grammarAccess.getCommandKindAccess().getAlternatives(), "rule__CommandKind__Alternatives");
					put(grammarAccess.getConditionKindAccess().getAlternatives(), "rule__ConditionKind__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getInitSectionAccess().getGroup(), "rule__InitSection__Group__0");
					put(grammarAccess.getInitPositionCommandAccess().getGroup(), "rule__InitPositionCommand__Group__0");
					put(grammarAccess.getInitHeadingCommandAccess().getGroup(), "rule__InitHeadingCommand__Group__0");
					put(grammarAccess.getInitBoardSizeCommandAccess().getGroup(), "rule__InitBoardSizeCommand__Group__0");
					put(grammarAccess.getUserDefinedCommandAccess().getGroup(), "rule__UserDefinedCommand__Group__0");
					put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
					put(grammarAccess.getUserDefinedCommandStatementAccess().getGroup(), "rule__UserDefinedCommandStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup_7(), "rule__IfStatement__Group_7__0");
					put(grammarAccess.getIterateStatementAccess().getGroup(), "rule__IterateStatement__Group__0");
					put(grammarAccess.getWhileStatementAccess().getGroup(), "rule__WhileStatement__Group__0");
					put(grammarAccess.getDocumentationCommentAccess().getGroup(), "rule__DocumentationComment__Group__0");
					put(grammarAccess.getCommandStatementAccess().getGroup(), "rule__CommandStatement__Group__0");
					put(grammarAccess.getConditionExprAccess().getGroup(), "rule__ConditionExpr__Group__0");
					put(grammarAccess.getProgramAccess().getInitSectionAssignment_1(), "rule__Program__InitSectionAssignment_1");
					put(grammarAccess.getProgramAccess().getUserDefinedCommandsAssignment_2(), "rule__Program__UserDefinedCommandsAssignment_2");
					put(grammarAccess.getProgramAccess().getMainAssignment_3(), "rule__Program__MainAssignment_3");
					put(grammarAccess.getInitSectionAccess().getInitCommandsAssignment_1(), "rule__InitSection__InitCommandsAssignment_1");
					put(grammarAccess.getInitPositionCommandAccess().getXAssignment_1(), "rule__InitPositionCommand__XAssignment_1");
					put(grammarAccess.getInitPositionCommandAccess().getYAssignment_3(), "rule__InitPositionCommand__YAssignment_3");
					put(grammarAccess.getInitHeadingCommandAccess().getHeadingAssignment_1(), "rule__InitHeadingCommand__HeadingAssignment_1");
					put(grammarAccess.getInitBoardSizeCommandAccess().getWidthAssignment_1(), "rule__InitBoardSizeCommand__WidthAssignment_1");
					put(grammarAccess.getInitBoardSizeCommandAccess().getHeightAssignment_3(), "rule__InitBoardSizeCommand__HeightAssignment_3");
					put(grammarAccess.getUserDefinedCommandAccess().getDocAssignment_0(), "rule__UserDefinedCommand__DocAssignment_0");
					put(grammarAccess.getUserDefinedCommandAccess().getNameAssignment_2(), "rule__UserDefinedCommand__NameAssignment_2");
					put(grammarAccess.getUserDefinedCommandAccess().getStatementsAssignment_5(), "rule__UserDefinedCommand__StatementsAssignment_5");
					put(grammarAccess.getMainAccess().getStatementsAssignment_2(), "rule__Main__StatementsAssignment_2");
					put(grammarAccess.getUserDefinedCommandStatementAccess().getCommandAssignment_0(), "rule__UserDefinedCommandStatement__CommandAssignment_0");
					put(grammarAccess.getIfStatementAccess().getConditionAssignment_2(), "rule__IfStatement__ConditionAssignment_2");
					put(grammarAccess.getIfStatementAccess().getStatementsAssignment_5(), "rule__IfStatement__StatementsAssignment_5");
					put(grammarAccess.getIfStatementAccess().getElseStatementsAssignment_7_2(), "rule__IfStatement__ElseStatementsAssignment_7_2");
					put(grammarAccess.getIterateStatementAccess().getTimesAssignment_1(), "rule__IterateStatement__TimesAssignment_1");
					put(grammarAccess.getIterateStatementAccess().getStatementsAssignment_4(), "rule__IterateStatement__StatementsAssignment_4");
					put(grammarAccess.getWhileStatementAccess().getConditionAssignment_2(), "rule__WhileStatement__ConditionAssignment_2");
					put(grammarAccess.getWhileStatementAccess().getStatementsAssignment_5(), "rule__WhileStatement__StatementsAssignment_5");
					put(grammarAccess.getDocumentationCommentAccess().getTextAssignment_1(), "rule__DocumentationComment__TextAssignment_1");
					put(grammarAccess.getCommandStatementAccess().getKindAssignment_0(), "rule__CommandStatement__KindAssignment_0");
					put(grammarAccess.getConditionExprAccess().getNegationAssignment_0(), "rule__ConditionExpr__NegationAssignment_0");
					put(grammarAccess.getConditionExprAccess().getExprAssignment_1(), "rule__ConditionExpr__ExprAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.macjariel.karel.ui.contentassist.antlr.internal.InternalKarelParser typedParser = (org.macjariel.karel.ui.contentassist.antlr.internal.InternalKarelParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public KarelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(KarelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
