/**
 * generated by Xtext 2.30.0
 */
package ui.languagedsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.languagedsl.Button#getSave <em>Save</em>}</li>
 *   <li>{@link ui.languagedsl.Button#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see ui.languagedsl.LanguagedslPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Reference
{
  /**
   * Returns the value of the '<em><b>Save</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Save</em>' attribute.
   * @see #setSave(String)
   * @see ui.languagedsl.LanguagedslPackage#getButton_Save()
   * @model
   * @generated
   */
  String getSave();

  /**
   * Sets the value of the '{@link ui.languagedsl.Button#getSave <em>Save</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Save</em>' attribute.
   * @see #getSave()
   * @generated
   */
  void setSave(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Exp)
   * @see ui.languagedsl.LanguagedslPackage#getButton_Exp()
   * @model containment="true"
   * @generated
   */
  Exp getExp();

  /**
   * Sets the value of the '{@link ui.languagedsl.Button#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Exp value);

} // Button
