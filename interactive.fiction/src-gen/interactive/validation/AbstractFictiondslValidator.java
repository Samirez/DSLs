/*
 * generated by Xtext 2.30.0
 */
package interactive.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractFictiondslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(interactive.fictiondsl.FictiondslPackage.eINSTANCE);
		return result;
	}
}
