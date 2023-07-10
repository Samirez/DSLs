/*
 * generated by Xtext 2.30.0
 */
package ui.validation;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import ui.languagedsl.Button;
import ui.languagedsl.Condition;
import ui.languagedsl.Element;
import ui.languagedsl.Input;
import ui.languagedsl.LanguagedslPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 * @param <Type>
 */
public class LanguagedslValidator<Type> extends AbstractLanguagedslValidator {
	
	public static final String INVALID_NAME = "invalidName";

	@Check 
	public void checkElementNames(Element element, String elementType,  EStructuralFeature feature) {
		EList<Input> input = element.getInput();
		EList<Button> button = element.getButton();
		 for (int i = 0; i < input.size(); i++) {
		        for (int j = i + 1; j < button.size(); j++) {
		             Input element1 = input.get(i);
		             Button element2 = button.get(j);
		            if (element1.getClass().getSimpleName().equals(element2.getClass().getName())) {
		                error(elementType + " with name " + element1.getClass().getName() + " already exists",
		                        feature, i);
		                error(elementType + " with name " + element2.getClass().getName() + " already exists",
		                        feature, j);
		            }
		        }
	    }
	}
	
	@Check
	public void validateInputType(List<Condition> condition, List<Input> input) {
		for (int i=0; i<input.size(); i++) {
			Input type1 = input.get(i);
			String type2 = ((Condition) condition).getType();
			if (type1.toString()!=type2) {
				warning("the type is not equal",
						LanguagedslPackage.Literals.CONDITION__TYPE,
						INVALID_NAME);
			}
		}
		
	}
}
