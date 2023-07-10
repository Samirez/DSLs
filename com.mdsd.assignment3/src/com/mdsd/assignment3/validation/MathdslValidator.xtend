package com.mdsd.assignment3.validation

import org.eclipse.xtext.validation.Check
import com.mdsd.assignment3.mathdsl.MathExp
import com.mdsd.assignment3.mathdsl.VarBinding
import com.mdsd.assignment3.mathdsl.MathdslPackage
import com.mdsd.assignment3.validation.AbstractMathdslValidator

class MathdslValidator extends AbstractMathdslValidator {

	public static final String VAR_UNIQUE = "var_unique";

	@Check
	def void uniqueGlobalVariableDefinition(VarBinding binding){
		if((binding.eContainer as MathExp).variables.filter[name == binding.name].size > 1)
			error("Duplicate global variable", MathdslPackage.eINSTANCE.binding_Name, VAR_UNIQUE);
	}

}
