/**
 * generated by Xtext 2.30.0
 */
package interactive.fictiondsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interactive.fictiondsl.Question#getType <em>Type</em>}</li>
 *   <li>{@link interactive.fictiondsl.Question#getExref <em>Exref</em>}</li>
 *   <li>{@link interactive.fictiondsl.Question#getOp <em>Op</em>}</li>
 *   <li>{@link interactive.fictiondsl.Question#getCondition <em>Condition</em>}</li>
 *   <li>{@link interactive.fictiondsl.Question#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see interactive.fictiondsl.FictiondslPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends SomeRef
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see interactive.fictiondsl.FictiondslPackage#getQuestion_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link interactive.fictiondsl.Question#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Exref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exref</em>' reference.
   * @see #setExref(External)
   * @see interactive.fictiondsl.FictiondslPackage#getQuestion_Exref()
   * @model
   * @generated
   */
  External getExref();

  /**
   * Sets the value of the '{@link interactive.fictiondsl.Question#getExref <em>Exref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exref</em>' reference.
   * @see #getExref()
   * @generated
   */
  void setExref(External value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see interactive.fictiondsl.FictiondslPackage#getQuestion_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link interactive.fictiondsl.Question#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see interactive.fictiondsl.FictiondslPackage#getQuestion_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link interactive.fictiondsl.Question#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference list.
   * The list contents are of type {@link interactive.fictiondsl.Target}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference list.
   * @see interactive.fictiondsl.FictiondslPackage#getQuestion_Target()
   * @model containment="true"
   * @generated
   */
  EList<Target> getTarget();

} // Question
