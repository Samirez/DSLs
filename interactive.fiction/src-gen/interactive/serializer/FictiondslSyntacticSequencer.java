/*
 * generated by Xtext 2.30.0
 */
package interactive.serializer;

import com.google.inject.Inject;
import interactive.services.FictiondslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class FictiondslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FictiondslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Exp_ThisKeyword_3_0_q;
	protected AbstractElementAlias match_Target___LeftParenthesisKeyword_2_1_0_1_0_ThisKeyword_2_1_0_1_1_0_RightParenthesisKeyword_2_1_0_1_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FictiondslGrammarAccess) access;
		match_Exp_ThisKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getExpAccess().getThisKeyword_3_0());
		match_Target___LeftParenthesisKeyword_2_1_0_1_0_ThisKeyword_2_1_0_1_1_0_RightParenthesisKeyword_2_1_0_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_1_0_1_0()), new TokenAlias(false, false, grammarAccess.getTargetAccess().getThisKeyword_2_1_0_1_1_0()), new TokenAlias(false, false, grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_1_0_1_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Exp_ThisKeyword_3_0_q.equals(syntax))
				emit_Exp_ThisKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Target___LeftParenthesisKeyword_2_1_0_1_0_ThisKeyword_2_1_0_1_1_0_RightParenthesisKeyword_2_1_0_1_2__q.equals(syntax))
				emit_Target___LeftParenthesisKeyword_2_1_0_1_0_ThisKeyword_2_1_0_1_1_0_RightParenthesisKeyword_2_1_0_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'this'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) add='+'
	 *     (rule start) (ambiguity) add='-'
	 *     (rule start) (ambiguity) op='!='
	 *     (rule start) (ambiguity) op='&lt;'
	 *     (rule start) (ambiguity) op='&lt;='
	 *     (rule start) (ambiguity) op='=='
	 *     (rule start) (ambiguity) op='&gt;'
	 *     (rule start) (ambiguity) op='&gt;='
	 
	 * </pre>
	 */
	protected void emit_Exp_ThisKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' 'this' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     exref=[External|ID] (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Target___LeftParenthesisKeyword_2_1_0_1_0_ThisKeyword_2_1_0_1_1_0_RightParenthesisKeyword_2_1_0_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
