/**
 * generated by Xtext 2.30.0
 */
package ui.languagedsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.languagedsl.Title#getName <em>Name</em>}</li>
 *   <li>{@link ui.languagedsl.Title#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see ui.languagedsl.LanguagedslPackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ui.languagedsl.LanguagedslPackage#getTitle_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ui.languagedsl.Title#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Form</b></em>' containment reference list.
   * The list contents are of type {@link ui.languagedsl.Form}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form</em>' containment reference list.
   * @see ui.languagedsl.LanguagedslPackage#getTitle_Form()
   * @model containment="true"
   * @generated
   */
  EList<Form> getForm();

} // Title
