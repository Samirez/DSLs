/**
 * generated by Xtext 2.30.0
 */
package ui.languagedsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.languagedsl.Form#getName <em>Name</em>}</li>
 *   <li>{@link ui.languagedsl.Form#getParam <em>Param</em>}</li>
 *   <li>{@link ui.languagedsl.Form#getParam2 <em>Param2</em>}</li>
 *   <li>{@link ui.languagedsl.Form#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see ui.languagedsl.LanguagedslPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ui.languagedsl.LanguagedslPackage#getForm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ui.languagedsl.Form#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link ui.languagedsl.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see ui.languagedsl.LanguagedslPackage#getForm_Param()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParam();

  /**
   * Returns the value of the '<em><b>Param2</b></em>' containment reference list.
   * The list contents are of type {@link ui.languagedsl.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param2</em>' containment reference list.
   * @see ui.languagedsl.LanguagedslPackage#getForm_Param2()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParam2();

  /**
   * Returns the value of the '<em><b>Layout</b></em>' containment reference list.
   * The list contents are of type {@link ui.languagedsl.Layout}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' containment reference list.
   * @see ui.languagedsl.LanguagedslPackage#getForm_Layout()
   * @model containment="true"
   * @generated
   */
  EList<Layout> getLayout();

} // Form