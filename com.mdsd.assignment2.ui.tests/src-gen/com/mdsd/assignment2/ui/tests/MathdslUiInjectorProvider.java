/*
 * generated by Xtext 2.30.0
 */
package com.mdsd.assignment2.ui.tests;

import com.google.inject.Injector;
import com.mdsd.assignment2.ui.internal.Assignment2Activator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class MathdslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Assignment2Activator.getInstance().getInjector("com.mdsd.assignment2.Mathdsl");
	}

}
