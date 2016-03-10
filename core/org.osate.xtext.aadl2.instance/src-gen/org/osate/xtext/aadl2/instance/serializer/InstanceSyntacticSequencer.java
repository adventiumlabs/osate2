/*
 * generated by Xtext
 */
package org.osate.xtext.aadl2.instance.serializer;

import com.google.inject.Inject;
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
import org.osate.xtext.aadl2.instance.services.InstanceGrammarAccess;

@SuppressWarnings("all")
public class InstanceSyntacticSequencer extends AbstractSyntacticSequencer {

	protected InstanceGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ComponentInstance___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q;
	protected AbstractElementAlias match_FeatureInstance___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (InstanceGrammarAccess) access;
		match_ComponentInstance___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getComponentInstanceAccess().getRightCurlyBracketKeyword_8_2()));
		match_FeatureInstance___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFeatureInstanceAccess().getLeftCurlyBracketKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getFeatureInstanceAccess().getRightCurlyBracketKeyword_8_2()));
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
			if(match_ComponentInstance___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q.equals(syntax))
				emit_ComponentInstance___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FeatureInstance___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q.equals(syntax))
				emit_FeatureInstance___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     dstConnectionInstance+=[ConnectionInstance|IndexRef] ')' (ambiguity) (rule end)
	 *     srcConnectionInstance+=[ConnectionInstance|IndexRef] ')' (ambiguity) (rule end)
	 *     subcomponent=[Subcomponent|DeclarativeRef] (ambiguity) (rule end)
	 */
	protected void emit_ComponentInstance___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     dstConnectionInstance+=[ConnectionInstance|IndexRef] ')' (ambiguity) (rule end)
	 *     dstFlowSpec+=[FlowSpecificationInstance|ID] ')' (ambiguity) (rule end)
	 *     feature=[Feature|DeclarativeRef] (ambiguity) (rule end)
	 *     srcConnectionInstance+=[ConnectionInstance|IndexRef] ')' (ambiguity) (rule end)
	 *     srcFlowSpec+=[FlowSpecificationInstance|ID] ')' (ambiguity) (rule end)
	 */
	protected void emit_FeatureInstance___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
