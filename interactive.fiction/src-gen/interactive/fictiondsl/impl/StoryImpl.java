/**
 * generated by Xtext 2.30.0
 */
package interactive.fictiondsl.impl;

import interactive.fictiondsl.External;
import interactive.fictiondsl.FictiondslPackage;
import interactive.fictiondsl.Question;
import interactive.fictiondsl.Scenario;
import interactive.fictiondsl.Story;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Story</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interactive.fictiondsl.impl.StoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link interactive.fictiondsl.impl.StoryImpl#getExternal <em>External</em>}</li>
 *   <li>{@link interactive.fictiondsl.impl.StoryImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoryImpl extends MinimalEObjectImpl.Container implements Story
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getExternal() <em>External</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternal()
   * @generated
   * @ordered
   */
  protected EList<External> external;

  /**
   * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenario()
   * @generated
   * @ordered
   */
  protected EList<Scenario> scenario;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FictiondslPackage.Literals.STORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FictiondslPackage.STORY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<External> getExternal()
  {
    if (external == null)
    {
      external = new EObjectContainmentEList<External>(External.class, this, FictiondslPackage.STORY__EXTERNAL);
    }
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Scenario> getScenario()
  {
    if (scenario == null)
    {
      scenario = new EObjectContainmentEList<Scenario>(Scenario.class, this, FictiondslPackage.STORY__SCENARIO);
    }
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FictiondslPackage.STORY__EXTERNAL:
        return ((InternalEList<?>)getExternal()).basicRemove(otherEnd, msgs);
      case FictiondslPackage.STORY__SCENARIO:
        return ((InternalEList<?>)getScenario()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FictiondslPackage.STORY__NAME:
        return getName();
      case FictiondslPackage.STORY__EXTERNAL:
        return getExternal();
      case FictiondslPackage.STORY__SCENARIO:
        return getScenario();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FictiondslPackage.STORY__NAME:
        setName((String)newValue);
        return;
      case FictiondslPackage.STORY__EXTERNAL:
        getExternal().clear();
        getExternal().addAll((Collection<? extends External>)newValue);
        return;
      case FictiondslPackage.STORY__SCENARIO:
        getScenario().clear();
        getScenario().addAll((Collection<? extends Scenario>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FictiondslPackage.STORY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FictiondslPackage.STORY__EXTERNAL:
        getExternal().clear();
        return;
      case FictiondslPackage.STORY__SCENARIO:
        getScenario().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FictiondslPackage.STORY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FictiondslPackage.STORY__EXTERNAL:
        return external != null && !external.isEmpty();
      case FictiondslPackage.STORY__SCENARIO:
        return scenario != null && !scenario.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

@Override
public EList<Question> getQuestions() {
	// TODO Auto-generated method stub
	return null;
}

} //StoryImpl