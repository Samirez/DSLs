/**
 * generated by Xtext 2.30.0
 */
package ui.languagedsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui.languagedsl.Element#getLabel <em>Label</em>}</li>
 *   <li>{@link ui.languagedsl.Element#getInput <em>Input</em>}</li>
 *   <li>{@link ui.languagedsl.Element#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @see ui.languagedsl.LanguagedslPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference list.
   * The list contents are of type {@link ui.languagedsl.Label}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference list.
   * @see ui.languagedsl.LanguagedslPackage#getElement_Label()
   * @model containment="true"
   * @generated
   */
  EList<Label> getLabel();

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference list.
   * The list contents are of type {@link ui.languagedsl.Input}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference list.
   * @see ui.languagedsl.LanguagedslPackage#getElement_Input()
   * @model containment="true"
   * @generated
   */
  EList<Input> getInput();

  /**
   * Returns the value of the '<em><b>Button</b></em>' containment reference list.
   * The list contents are of type {@link ui.languagedsl.Button}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Button</em>' containment reference list.
   * @see ui.languagedsl.LanguagedslPackage#getElement_Button()
   * @model containment="true"
   * @generated
   */
  EList<Button> getButton();

} // Element
