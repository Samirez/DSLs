/**
 * generated by Xtext 2.30.0
 */
package com.mdsd.assignment2.mathdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mdsd.assignment2.mathdsl.VarUse#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see com.mdsd.assignment2.mathdsl.MathdslPackage#getVarUse()
 * @model
 * @generated
 */
public interface VarUse extends Expression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Binding)
   * @see com.mdsd.assignment2.mathdsl.MathdslPackage#getVarUse_Ref()
   * @model
   * @generated
   */
  Binding getRef();

  /**
   * Sets the value of the '{@link com.mdsd.assignment2.mathdsl.VarUse#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Binding value);

} // VarUse
