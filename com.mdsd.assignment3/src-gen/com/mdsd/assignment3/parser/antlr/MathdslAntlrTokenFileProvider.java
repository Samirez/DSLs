/*
 * generated by Xtext 2.30.0
 */
package com.mdsd.assignment3.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MathdslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/mdsd/assignment3/parser/antlr/internal/InternalMathdsl.tokens");
	}
}
