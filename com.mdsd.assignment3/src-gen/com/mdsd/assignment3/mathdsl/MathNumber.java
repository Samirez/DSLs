/**
 * generated by Xtext 2.30.0
 */
package com.mdsd.assignment3.mathdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mdsd.assignment3.mathdsl.MathNumber#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.mdsd.assignment3.mathdsl.MathdslPackage#getMathNumber()
 * @model
 * @generated
 */
public interface MathNumber extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see com.mdsd.assignment3.mathdsl.MathdslPackage#getMathNumber_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link com.mdsd.assignment3.mathdsl.MathNumber#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // MathNumber
