/*
 * generated by Xtext 2.30.0
 */
package interactive.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import interactive.ide.contentassist.antlr.internal.InternalFictiondslParser;
import interactive.services.FictiondslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class FictiondslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(FictiondslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, FictiondslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getQuestionAccess().getAlternatives_3_1(), "rule__Question__Alternatives_3_1");
			builder.put(grammarAccess.getQuestionAccess().getOpAlternatives_4_0_0(), "rule__Question__OpAlternatives_4_0_0");
			builder.put(grammarAccess.getTargetAccess().getAlternatives_2_1(), "rule__Target__Alternatives_2_1");
			builder.put(grammarAccess.getTargetAccess().getAlternatives_2_1_0_1_1(), "rule__Target__Alternatives_2_1_0_1_1");
			builder.put(grammarAccess.getExpAccess().getAlternatives(), "rule__Exp__Alternatives");
			builder.put(grammarAccess.getEvaluateAccess().getAddAlternatives_0_0_0(), "rule__Evaluate__AddAlternatives_0_0_0");
			builder.put(grammarAccess.getEvaluateAccess().getOpAlternatives_1_0(), "rule__Evaluate__OpAlternatives_1_0");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getSomeRefAccess().getAlternatives(), "rule__SomeRef__Alternatives");
			builder.put(grammarAccess.getStoryAccess().getGroup(), "rule__Story__Group__0");
			builder.put(grammarAccess.getExternalAccess().getGroup(), "rule__External__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getVarDefAccess().getGroup(), "rule__VarDef__Group__0");
			builder.put(grammarAccess.getQuestionAccess().getGroup(), "rule__Question__Group__0");
			builder.put(grammarAccess.getQuestionAccess().getGroup_3(), "rule__Question__Group_3__0");
			builder.put(grammarAccess.getQuestionAccess().getGroup_3_1_1(), "rule__Question__Group_3_1_1__0");
			builder.put(grammarAccess.getQuestionAccess().getGroup_4(), "rule__Question__Group_4__0");
			builder.put(grammarAccess.getQuestionAccess().getGroup_5(), "rule__Question__Group_5__0");
			builder.put(grammarAccess.getAnnounceAccess().getGroup(), "rule__Announce__Group__0");
			builder.put(grammarAccess.getAnnounceAccess().getGroup_3(), "rule__Announce__Group_3__0");
			builder.put(grammarAccess.getTargetAccess().getGroup(), "rule__Target__Group__0");
			builder.put(grammarAccess.getTargetAccess().getGroup_2(), "rule__Target__Group_2__0");
			builder.put(grammarAccess.getTargetAccess().getGroup_2_1_0(), "rule__Target__Group_2_1_0__0");
			builder.put(grammarAccess.getTargetAccess().getGroup_2_1_0_1(), "rule__Target__Group_2_1_0_1__0");
			builder.put(grammarAccess.getTargetAccess().getGroup_2_1_1(), "rule__Target__Group_2_1_1__0");
			builder.put(grammarAccess.getTargetAccess().getGroup_2_1_3(), "rule__Target__Group_2_1_3__0");
			builder.put(grammarAccess.getEndAccess().getGroup(), "rule__End__Group__0");
			builder.put(grammarAccess.getEndAccess().getGroup_3(), "rule__End__Group_3__0");
			builder.put(grammarAccess.getExpAccess().getGroup_0(), "rule__Exp__Group_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_3(), "rule__Exp__Group_3__0");
			builder.put(grammarAccess.getEvaluateAccess().getGroup(), "rule__Evaluate__Group__0");
			builder.put(grammarAccess.getEvaluateAccess().getGroup_0(), "rule__Evaluate__Group_0__0");
			builder.put(grammarAccess.getStoryAccess().getNameAssignment_1(), "rule__Story__NameAssignment_1");
			builder.put(grammarAccess.getStoryAccess().getExternalAssignment_2(), "rule__Story__ExternalAssignment_2");
			builder.put(grammarAccess.getStoryAccess().getScenarioAssignment_3(), "rule__Story__ScenarioAssignment_3");
			builder.put(grammarAccess.getExternalAccess().getNameAssignment_1(), "rule__External__NameAssignment_1");
			builder.put(grammarAccess.getExternalAccess().getTypeAssignment_3(), "rule__External__TypeAssignment_3");
			builder.put(grammarAccess.getExternalAccess().getResultAssignment_6(), "rule__External__ResultAssignment_6");
			builder.put(grammarAccess.getScenarioAccess().getNameAssignment_1(), "rule__Scenario__NameAssignment_1");
			builder.put(grammarAccess.getScenarioAccess().getVarAssignment_3(), "rule__Scenario__VarAssignment_3");
			builder.put(grammarAccess.getScenarioAccess().getStatementAssignment_4(), "rule__Scenario__StatementAssignment_4");
			builder.put(grammarAccess.getVarDefAccess().getNameAssignment_1(), "rule__VarDef__NameAssignment_1");
			builder.put(grammarAccess.getVarDefAccess().getTypeAssignment_3(), "rule__VarDef__TypeAssignment_3");
			builder.put(grammarAccess.getStatementAccess().getAnnounceAssignment_0(), "rule__Statement__AnnounceAssignment_0");
			builder.put(grammarAccess.getStatementAccess().getEndAssignment_1(), "rule__Statement__EndAssignment_1");
			builder.put(grammarAccess.getStatementAccess().getQuestionAssignment_2(), "rule__Statement__QuestionAssignment_2");
			builder.put(grammarAccess.getQuestionAccess().getNameAssignment_1(), "rule__Question__NameAssignment_1");
			builder.put(grammarAccess.getQuestionAccess().getExpressionAssignment_2(), "rule__Question__ExpressionAssignment_2");
			builder.put(grammarAccess.getQuestionAccess().getTypeAssignment_3_1_0(), "rule__Question__TypeAssignment_3_1_0");
			builder.put(grammarAccess.getQuestionAccess().getExrefAssignment_3_1_1_0(), "rule__Question__ExrefAssignment_3_1_1_0");
			builder.put(grammarAccess.getQuestionAccess().getTypeAssignment_3_1_1_2(), "rule__Question__TypeAssignment_3_1_1_2");
			builder.put(grammarAccess.getQuestionAccess().getOpAssignment_4_0(), "rule__Question__OpAssignment_4_0");
			builder.put(grammarAccess.getQuestionAccess().getConditionAssignment_4_1(), "rule__Question__ConditionAssignment_4_1");
			builder.put(grammarAccess.getQuestionAccess().getRefAssignment_5_1(), "rule__Question__RefAssignment_5_1");
			builder.put(grammarAccess.getQuestionAccess().getTargetAssignment_6(), "rule__Question__TargetAssignment_6");
			builder.put(grammarAccess.getAnnounceAccess().getNameAssignment_1(), "rule__Announce__NameAssignment_1");
			builder.put(grammarAccess.getAnnounceAccess().getExpressionAssignment_2(), "rule__Announce__ExpressionAssignment_2");
			builder.put(grammarAccess.getAnnounceAccess().getRefAssignment_3_1(), "rule__Announce__RefAssignment_3_1");
			builder.put(grammarAccess.getAnnounceAccess().getExpAssignment_3_3(), "rule__Announce__ExpAssignment_3_3");
			builder.put(grammarAccess.getAnnounceAccess().getTargetAssignment_4(), "rule__Announce__TargetAssignment_4");
			builder.put(grammarAccess.getTargetAccess().getRefAssignment_1(), "rule__Target__RefAssignment_1");
			builder.put(grammarAccess.getTargetAccess().getExrefAssignment_2_1_0_0(), "rule__Target__ExrefAssignment_2_1_0_0");
			builder.put(grammarAccess.getTargetAccess().getVardefAssignment_2_1_0_1_1_1(), "rule__Target__VardefAssignment_2_1_0_1_1_1");
			builder.put(grammarAccess.getTargetAccess().getConditionAssignment_2_1_0_1_3(), "rule__Target__ConditionAssignment_2_1_0_1_3");
			builder.put(grammarAccess.getTargetAccess().getVardefAssignment_2_1_1_1(), "rule__Target__VardefAssignment_2_1_1_1");
			builder.put(grammarAccess.getTargetAccess().getResAssignment_2_1_1_3(), "rule__Target__ResAssignment_2_1_1_3");
			builder.put(grammarAccess.getTargetAccess().getConditionAssignment_2_1_2(), "rule__Target__ConditionAssignment_2_1_2");
			builder.put(grammarAccess.getTargetAccess().getVardefAssignment_2_1_3_0(), "rule__Target__VardefAssignment_2_1_3_0");
			builder.put(grammarAccess.getTargetAccess().getConditionAssignment_2_1_3_1(), "rule__Target__ConditionAssignment_2_1_3_1");
			builder.put(grammarAccess.getEndAccess().getNameAssignment_1(), "rule__End__NameAssignment_1");
			builder.put(grammarAccess.getEndAccess().getExpressionAssignment_2(), "rule__End__ExpressionAssignment_2");
			builder.put(grammarAccess.getEndAccess().getRefAssignment_3_1(), "rule__End__RefAssignment_3_1");
			builder.put(grammarAccess.getEndAccess().getExpAssignment_3_3(), "rule__End__ExpAssignment_3_3");
			builder.put(grammarAccess.getExpAccess().getValueAssignment_0_1(), "rule__Exp__ValueAssignment_0_1");
			builder.put(grammarAccess.getExpAccess().getNumberAssignment_1(), "rule__Exp__NumberAssignment_1");
			builder.put(grammarAccess.getExpAccess().getTypeAssignment_2(), "rule__Exp__TypeAssignment_2");
			builder.put(grammarAccess.getEvaluateAccess().getAddAssignment_0_0(), "rule__Evaluate__AddAssignment_0_0");
			builder.put(grammarAccess.getEvaluateAccess().getRefAssignment_0_1(), "rule__Evaluate__RefAssignment_0_1");
			builder.put(grammarAccess.getEvaluateAccess().getOpAssignment_1(), "rule__Evaluate__OpAssignment_1");
			builder.put(grammarAccess.getEvaluateAccess().getExpAssignment_2(), "rule__Evaluate__ExpAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private FictiondslGrammarAccess grammarAccess;

	@Override
	protected InternalFictiondslParser createParser() {
		InternalFictiondslParser result = new InternalFictiondslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FictiondslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FictiondslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
