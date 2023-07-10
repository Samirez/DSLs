/*
 * generated by Xtext 2.30.0
 */
package com.mdsd.assignment2.serializer;

import com.google.inject.Inject;
import com.mdsd.assignment2.mathdsl.Div;
import com.mdsd.assignment2.mathdsl.LetBinding;
import com.mdsd.assignment2.mathdsl.MathExp;
import com.mdsd.assignment2.mathdsl.MathdslPackage;
import com.mdsd.assignment2.mathdsl.Minus;
import com.mdsd.assignment2.mathdsl.Mult;
import com.mdsd.assignment2.mathdsl.Num;
import com.mdsd.assignment2.mathdsl.Plus;
import com.mdsd.assignment2.mathdsl.VarBinding;
import com.mdsd.assignment2.mathdsl.VarUse;
import com.mdsd.assignment2.services.MathdslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MathdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MathdslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MathdslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MathdslPackage.DIV:
				sequence_Term(context, (Div) semanticObject); 
				return; 
			case MathdslPackage.LET_BINDING:
				sequence_LetBinding(context, (LetBinding) semanticObject); 
				return; 
			case MathdslPackage.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case MathdslPackage.MINUS:
				sequence_Exp(context, (Minus) semanticObject); 
				return; 
			case MathdslPackage.MULT:
				sequence_Term(context, (Mult) semanticObject); 
				return; 
			case MathdslPackage.NUM:
				sequence_Number(context, (Num) semanticObject); 
				return; 
			case MathdslPackage.PLUS:
				sequence_Exp(context, (Plus) semanticObject); 
				return; 
			case MathdslPackage.VAR_BINDING:
				sequence_VarBinding(context, (VarBinding) semanticObject); 
				return; 
			case MathdslPackage.VAR_USE:
				sequence_VariableUse(context, (VarUse) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Minus
	 *     Exp.Plus_1_0_0_0 returns Minus
	 *     Exp.Minus_1_0_1_0 returns Minus
	 *     Term returns Minus
	 *     Term.Mult_1_0_0_0 returns Minus
	 *     Term.Div_1_0_1_0 returns Minus
	 *     Primary returns Minus
	 *     Parenthesis returns Minus
	 *
	 * Constraint:
	 *     (left=Exp_Minus_1_0_1_0 right=Term)
	 * </pre>
	 */
	protected void sequence_Exp(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Plus
	 *     Exp.Plus_1_0_0_0 returns Plus
	 *     Exp.Minus_1_0_1_0 returns Plus
	 *     Term returns Plus
	 *     Term.Mult_1_0_0_0 returns Plus
	 *     Term.Div_1_0_1_0 returns Plus
	 *     Primary returns Plus
	 *     Parenthesis returns Plus
	 *
	 * Constraint:
	 *     (left=Exp_Plus_1_0_0_0 right=Term)
	 * </pre>
	 */
	protected void sequence_Exp(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightTermParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns LetBinding
	 *     Exp.Plus_1_0_0_0 returns LetBinding
	 *     Exp.Minus_1_0_1_0 returns LetBinding
	 *     Term returns LetBinding
	 *     Term.Mult_1_0_0_0 returns LetBinding
	 *     Term.Div_1_0_1_0 returns LetBinding
	 *     Primary returns LetBinding
	 *     Binding returns LetBinding
	 *     LetBinding returns LetBinding
	 *     Parenthesis returns LetBinding
	 *
	 * Constraint:
	 *     (name=ID binding=Exp body=Exp)
	 * </pre>
	 */
	protected void sequence_LetBinding(ISerializationContext context, LetBinding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.BINDING__NAME));
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.LET_BINDING__BINDING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.LET_BINDING__BINDING));
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.LET_BINDING__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.LET_BINDING__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0(), semanticObject.getBinding());
		feeder.accept(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     variables+=VarBinding+
	 * </pre>
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Num
	 *     Exp.Plus_1_0_0_0 returns Num
	 *     Exp.Minus_1_0_1_0 returns Num
	 *     Term returns Num
	 *     Term.Mult_1_0_0_0 returns Num
	 *     Term.Div_1_0_1_0 returns Num
	 *     Primary returns Num
	 *     Parenthesis returns Num
	 *     Number returns Num
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_Number(ISerializationContext context, Num semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.NUM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.NUM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Div
	 *     Exp.Plus_1_0_0_0 returns Div
	 *     Exp.Minus_1_0_1_0 returns Div
	 *     Term returns Div
	 *     Term.Mult_1_0_0_0 returns Div
	 *     Term.Div_1_0_1_0 returns Div
	 *     Primary returns Div
	 *     Parenthesis returns Div
	 *
	 * Constraint:
	 *     (left=Term_Div_1_0_1_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_Term(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTermAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Mult
	 *     Exp.Plus_1_0_0_0 returns Mult
	 *     Exp.Minus_1_0_1_0 returns Mult
	 *     Term returns Mult
	 *     Term.Mult_1_0_0_0 returns Mult
	 *     Term.Div_1_0_1_0 returns Mult
	 *     Primary returns Mult
	 *     Parenthesis returns Mult
	 *
	 * Constraint:
	 *     (left=Term_Mult_1_0_0_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_Term(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.MULT__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.MULT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTermAccess().getMultLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VarBinding returns VarBinding
	 *     Binding returns VarBinding
	 *
	 * Constraint:
	 *     (name=ID exp=Exp)
	 * </pre>
	 */
	protected void sequence_VarBinding(ISerializationContext context, VarBinding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.BINDING__NAME));
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.VAR_BINDING__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.VAR_BINDING__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVarBindingAccess().getExpExpParserRuleCall_3_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns VarUse
	 *     Exp.Plus_1_0_0_0 returns VarUse
	 *     Exp.Minus_1_0_1_0 returns VarUse
	 *     Term returns VarUse
	 *     Term.Mult_1_0_0_0 returns VarUse
	 *     Term.Div_1_0_1_0 returns VarUse
	 *     Primary returns VarUse
	 *     Parenthesis returns VarUse
	 *     VariableUse returns VarUse
	 *
	 * Constraint:
	 *     ref=[Binding|ID]
	 * </pre>
	 */
	protected void sequence_VariableUse(ISerializationContext context, VarUse semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathdslPackage.Literals.VAR_USE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathdslPackage.Literals.VAR_USE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableUseAccess().getRefBindingIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MathdslPackage.Literals.VAR_USE__REF, false));
		feeder.finish();
	}
	
	
}
