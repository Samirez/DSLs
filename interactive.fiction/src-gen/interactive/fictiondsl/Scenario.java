/**
 * generated by Xtext 2.30.0
 */
package interactive.fictiondsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interactive.fictiondsl.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link interactive.fictiondsl.Scenario#getVar <em>Var</em>}</li>
 *   <li>{@link interactive.fictiondsl.Scenario#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see interactive.fictiondsl.FictiondslPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see interactive.fictiondsl.FictiondslPackage#getScenario_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link interactive.fictiondsl.Scenario#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference list.
   * The list contents are of type {@link interactive.fictiondsl.VarDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference list.
   * @see interactive.fictiondsl.FictiondslPackage#getScenario_Var()
   * @model containment="true"
   * @generated
   */
  EList<VarDef> getVar();

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
   * The list contents are of type {@link interactive.fictiondsl.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference list.
   * @see interactive.fictiondsl.FictiondslPackage#getScenario_Statement()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatement();

EList<External> getExternal();

EList<Target> getTarget();

EList<End> getEnd();

} // Scenario
