/**
 * generated by Xtext 2.30.0
 */
package ui.languagedsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.languagedsl.TextExp#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see ui.languagedsl.LanguagedslPackage#getTextExp()
 * @model
 * @generated
 */
public interface TextExp extends Exp
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Exp)
   * @see ui.languagedsl.LanguagedslPackage#getTextExp_Exp()
   * @model containment="true"
   * @generated
   */
  Exp getExp();

  /**
   * Sets the value of the '{@link ui.languagedsl.TextExp#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Exp value);

} // TextExp
