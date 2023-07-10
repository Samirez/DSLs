/*
 * generated by Xtext 2.30.0
 */
package com.mdsd.assignment3.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mdsd.assignment3.MathdslRuntimeModule;
import com.mdsd.assignment3.MathdslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MathdslIdeSetup extends MathdslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MathdslRuntimeModule(), new MathdslIdeModule()));
	}
	
}