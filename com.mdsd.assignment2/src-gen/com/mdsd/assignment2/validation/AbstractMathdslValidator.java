/*
 * generated by Xtext 2.30.0
 */
package com.mdsd.assignment2.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMathdslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.mdsd.assignment2.mathdsl.MathdslPackage.eINSTANCE);
		return result;
	}
}