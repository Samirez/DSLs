package com.mdsd.assignment3.scoping

import com.mdsd.assignment3.mathdsl.LetBinding
import com.mdsd.assignment3.mathdsl.MathExp
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import com.mdsd.assignment3.mathdsl.VariableUse

class MathdslScopeProvider extends AbstractMathdslScopeProvider {

	override getScope(EObject context, EReference reference) {
		return context.scopeForEObject(reference)
	}
	
	def dispatch scopeForEObject(EObject context, EReference reference) {
		return super.getScope(context, reference)
	}
	
	def dispatch scopeForEObject(VariableUse varUse, EReference reference) {
		varUse.scopeForVarUse
	}
	
	def IScope scopeForVarUse(EObject context) {
		val container = context.eContainer
		switch container {
			LetBinding: {
				if(container.binding == context)
					container.scopeForVarUse
				else
					Scopes.scopeFor(#[container], container.scopeForVarUse)
			}
			MathExp: Scopes.scopeFor(container.variables.filter[it != context])
			default: container.scopeForVarUse
		}
	}
}