/*
 * generated by Xtext 2.30.0
 */
package ui;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class LanguagedslStandaloneSetup extends LanguagedslStandaloneSetupGenerated {

	public static void doSetup() {
		new LanguagedslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}