package com.mdsd.assignment3.validation;

import com.google.common.base.Objects;
import com.mdsd.assignment3.mathdsl.MathExp;
import com.mdsd.assignment3.mathdsl.MathdslPackage;
import com.mdsd.assignment3.mathdsl.VarBinding;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MathdslValidator extends AbstractMathdslValidator {
  public static final String VAR_UNIQUE = "var_unique";

  @Check
  public void uniqueGlobalVariableDefinition(final VarBinding binding) {
    EObject _eContainer = binding.eContainer();
    final Function1<VarBinding, Boolean> _function = (VarBinding it) -> {
      String _name = it.getName();
      String _name_1 = binding.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    int _size = IterableExtensions.size(IterableExtensions.<VarBinding>filter(((MathExp) _eContainer).getVariables(), _function));
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      this.error("Duplicate global variable", MathdslPackage.eINSTANCE.getBinding_Name(), MathdslValidator.VAR_UNIQUE);
    }
  }
}
