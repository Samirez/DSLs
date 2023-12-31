/**
 * generated by Xtext 2.30.0
 */
package interactive.fictiondsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interactive.fictiondsl.End#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see interactive.fictiondsl.FictiondslPackage#getEnd()
 * @model
 * @generated
 */
public interface End extends SomeRef
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see interactive.fictiondsl.FictiondslPackage#getEnd_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link interactive.fictiondsl.End#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // End
