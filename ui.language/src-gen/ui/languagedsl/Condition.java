/**
 * generated by Xtext 2.30.0
 */
package ui.languagedsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.languagedsl.Condition#getOp <em>Op</em>}</li>
 *   <li>{@link ui.languagedsl.Condition#getExp <em>Exp</em>}</li>
 *   <li>{@link ui.languagedsl.Condition#getRef <em>Ref</em>}</li>
 *   <li>{@link ui.languagedsl.Condition#getType <em>Type</em>}</li>
 *   <li>{@link ui.languagedsl.Condition#getOp2 <em>Op2</em>}</li>
 *   <li>{@link ui.languagedsl.Condition#getExp2 <em>Exp2</em>}</li>
 * </ul>
 *
 * @see ui.languagedsl.LanguagedslPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see ui.languagedsl.LanguagedslPackage#getCondition_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link ui.languagedsl.Condition#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Exp)
   * @see ui.languagedsl.LanguagedslPackage#getCondition_Exp()
   * @model containment="true"
   * @generated
   */
  Exp getExp();

  /**
   * Sets the value of the '{@link ui.languagedsl.Condition#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Exp value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Reference)
   * @see ui.languagedsl.LanguagedslPackage#getCondition_Ref()
   * @model
   * @generated
   */
  Reference getRef();

  /**
   * Sets the value of the '{@link ui.languagedsl.Condition#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Reference value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see ui.languagedsl.LanguagedslPackage#getCondition_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link ui.languagedsl.Condition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Op2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op2</em>' attribute.
   * @see #setOp2(String)
   * @see ui.languagedsl.LanguagedslPackage#getCondition_Op2()
   * @model
   * @generated
   */
  String getOp2();

  /**
   * Sets the value of the '{@link ui.languagedsl.Condition#getOp2 <em>Op2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op2</em>' attribute.
   * @see #getOp2()
   * @generated
   */
  void setOp2(String value);

  /**
   * Returns the value of the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp2</em>' containment reference.
   * @see #setExp2(Exp)
   * @see ui.languagedsl.LanguagedslPackage#getCondition_Exp2()
   * @model containment="true"
   * @generated
   */
  Exp getExp2();

  /**
   * Sets the value of the '{@link ui.languagedsl.Condition#getExp2 <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp2</em>' containment reference.
   * @see #getExp2()
   * @generated
   */
  void setExp2(Exp value);

} // Condition
