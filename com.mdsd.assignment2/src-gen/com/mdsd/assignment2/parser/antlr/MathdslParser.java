/*
 * generated by Xtext 2.30.0
 */
package com.mdsd.assignment2.parser.antlr;

import com.google.inject.Inject;
import com.mdsd.assignment2.parser.antlr.internal.InternalMathdslParser;
import com.mdsd.assignment2.services.MathdslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MathdslParser extends AbstractAntlrParser {

	@Inject
	private MathdslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMathdslParser createParser(XtextTokenStream stream) {
		return new InternalMathdslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MathExp";
	}

	public MathdslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathdslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
