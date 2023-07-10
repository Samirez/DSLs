/*
 * generated by Xtext 2.30.0
 */
package interactive.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import interactive.fictiondsl.Expression;
import interactive.fictiondsl.External;
import interactive.fictiondsl.FictiondslPackage;
import interactive.fictiondsl.Question;
import interactive.fictiondsl.Scenario;
import interactive.fictiondsl.Statement;
import interactive.fictiondsl.Story;
import interactive.fictiondsl.Target;
/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class FictiondslValidator extends AbstractFictiondslValidator {
	
	public static final String INVALID_NAME = "invalidName";

	@Check
    public void checkScenarioNames1(Story story) {
        validateScenarioNames(story);
        validateFunctionNames(story);
        validateStatementNames(story);
        validateScenarioEnds(story);
        validateQuestionInputValidation(story);
        validateThisKeywordUsage(story); 
        validateOnKeywordUsage(story);
    }
	private void validateDistinctNames(EList<Statement> eList, String elementType, EStructuralFeature feature) {
	    for (int i = 0; i < eList.size(); i++) {
	        for (int j = i + 1; j < eList.size(); j++) {
	            Statement element1 = eList.get(i);
	            Statement element2 = eList.get(j);
	            if (element1.getClass().getSimpleName().equals(element2.getClass().getName())) {
	                error(elementType + " with name " + element1.getClass().getName() + " already exists",
	                        feature, i);
	                error(elementType + " with name " + element2.getClass().getName() + " already exists",
	                        feature, j);
	            }
	        }
	    }
	}
	 private void validateOnKeywordUsage(Story story) {
        for (Scenario scenario : story.getScenario()) {
            if (!scenario.getExternal().isEmpty()) {
                for (Target target : scenario.getTarget()) {
                    if (target.getRef() instanceof Scenario && target.getExref() != null) {
                        error("The 'on' keyword is only allowed when an external scenario is specified",
                                target,
                                FictiondslPackage.Literals.TARGET__EXREF);
                    }
                }
            }
        }
    }
    private void validateThisKeywordUsage(Story story) {
        for (Scenario scenario : story.getScenario()) {
            for (Target target : scenario.getTarget()) {
                if (target.getCondition() != null && containsThisKeyword(target.getCondition())) {
                    error("The 'this' keyword can only be used inside expressions defined in the 'Target' rule",
                            target,
                            FictiondslPackage.Literals.TARGET__CONDITION);
                }
            }
        }
    }

    private boolean containsThisKeyword(Expression expression) {
        if (expression instanceof Expression) {
            Expression exp = (Expression) expression;
            if (exp.getExp() != null) {
                // Check if "this" keyword is used
                return true;
            }
        }
        return false;
    }

        private void validateQuestionInputValidation(Story story) {
            for (Question question : story.getQuestions()) {
                if (!isValidQuestionInputValidation(question.getExpression().toString())) {
                    error("Only one type keyword is allowed in a question input validation expression",
                            question,
                            FictiondslPackage.Literals.QUESTION__CONDITION);
                }
            }
        }

        private boolean isValidQuestionInputValidation(String expression) {
            Set<String> typeKeywords = new HashSet<>();
            String[] keywords = { "text", "number", "boolean" };
            for (String keyword : keywords) {
                if (expression.contains(keyword)) {
                    typeKeywords.add(keyword);
                }
            }
            return typeKeywords.size() <= 1;
        }
        
	private void validateScenarioEnds(Story story) {
        for (Scenario scenario : story.getScenario()) {
            if (scenario.getEnd().isEmpty()) {
                error("Scenario '" + scenario.getName() + "' should have at least one end statement",
                        FictiondslPackage.Literals.SCENARIO__NAME);
            }
        }
    }
    
	 private void validateScenarioNames(Story story) {
	        EList<Scenario> scenarios = story.getScenario();
	        for (int i = 0; i < scenarios.size(); i++) {
	            for (int j = i + 1; j < scenarios.size(); j++) {
	                Scenario scenario1 = scenarios.get(i);
	                Scenario scenario2 = scenarios.get(j);
	                if (scenario1.getName().equals(scenario2.getName())) {
	                    error("Scenario with name " + scenario1.getName() + " already exists",
	                            FictiondslPackage.Literals.STORY__SCENARIO, i);
	                    error("Scenario with name " + scenario2.getName() + " already exists",
	                            FictiondslPackage.Literals.STORY__SCENARIO, j);
	                }
	            }
	        }
	    }

	 private void validateFunctionNames(Story story) {
	        EList<External> functions = story.getExternal();
	        for (int i = 0; i < functions.size(); i++) {
	            for (int j = i + 1; j < functions.size(); j++) {
	                External function1 = functions.get(i);
	                External function2 = functions.get(j);
	                if (function1.getName().equals(function2.getName())) {
	                    error("Function with name " + function1.getName() + " already exists",
	                            FictiondslPackage.Literals.STORY__EXTERNAL, i);
	                    error("Function with name " + function2.getName() + " already exists",
	                            FictiondslPackage.Literals.STORY__EXTERNAL, j);
	                }
	            }
	        }
	    }
	 
	 private void validateStatementNames(Story story) {
	        EList<Scenario> scenarios = story.getScenario();
	        for (Scenario scenario : scenarios) {
	            validateDistinctNames(scenario.getStatement(), "Announce", FictiondslPackage.Literals.SCENARIO__STATEMENT);
	            validateDistinctNames(scenario.getStatement(), "Question", FictiondslPackage.Literals.SCENARIO__STATEMENT);
	            validateDistinctNames(scenario.getStatement(), "End", FictiondslPackage.Literals.SCENARIO__STATEMENT);
	        }
	    }

}
