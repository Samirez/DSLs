/**
 * generated by Xtext 2.30.0
 */
package interactive.fictiondsl.impl;

import interactive.fictiondsl.Announce;
import interactive.fictiondsl.End;
import interactive.fictiondsl.FictiondslPackage;
import interactive.fictiondsl.Question;
import interactive.fictiondsl.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interactive.fictiondsl.impl.StatementImpl#getAnnounce <em>Announce</em>}</li>
 *   <li>{@link interactive.fictiondsl.impl.StatementImpl#getEnd <em>End</em>}</li>
 *   <li>{@link interactive.fictiondsl.impl.StatementImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
  /**
   * The cached value of the '{@link #getAnnounce() <em>Announce</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnounce()
   * @generated
   * @ordered
   */
  protected EList<Announce> announce;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected EList<End> end;

  /**
   * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected EList<Question> question;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return FictiondslPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Announce> getAnnounce()
  {
    if (announce == null)
    {
      announce = new EObjectContainmentEList<Announce>(Announce.class, this, FictiondslPackage.STATEMENT__ANNOUNCE);
    }
    return announce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<End> getEnd()
  {
    if (end == null)
    {
      end = new EObjectContainmentEList<End>(End.class, this, FictiondslPackage.STATEMENT__END);
    }
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Question> getQuestion()
  {
    if (question == null)
    {
      question = new EObjectContainmentEList<Question>(Question.class, this, FictiondslPackage.STATEMENT__QUESTION);
    }
    return question;
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
      case FictiondslPackage.STATEMENT__ANNOUNCE:
        return ((InternalEList<?>)getAnnounce()).basicRemove(otherEnd, msgs);
      case FictiondslPackage.STATEMENT__END:
        return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
      case FictiondslPackage.STATEMENT__QUESTION:
        return ((InternalEList<?>)getQuestion()).basicRemove(otherEnd, msgs);
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
      case FictiondslPackage.STATEMENT__ANNOUNCE:
        return getAnnounce();
      case FictiondslPackage.STATEMENT__END:
        return getEnd();
      case FictiondslPackage.STATEMENT__QUESTION:
        return getQuestion();
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
      case FictiondslPackage.STATEMENT__ANNOUNCE:
        getAnnounce().clear();
        getAnnounce().addAll((Collection<? extends Announce>)newValue);
        return;
      case FictiondslPackage.STATEMENT__END:
        getEnd().clear();
        getEnd().addAll((Collection<? extends End>)newValue);
        return;
      case FictiondslPackage.STATEMENT__QUESTION:
        getQuestion().clear();
        getQuestion().addAll((Collection<? extends Question>)newValue);
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
      case FictiondslPackage.STATEMENT__ANNOUNCE:
        getAnnounce().clear();
        return;
      case FictiondslPackage.STATEMENT__END:
        getEnd().clear();
        return;
      case FictiondslPackage.STATEMENT__QUESTION:
        getQuestion().clear();
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
      case FictiondslPackage.STATEMENT__ANNOUNCE:
        return announce != null && !announce.isEmpty();
      case FictiondslPackage.STATEMENT__END:
        return end != null && !end.isEmpty();
      case FictiondslPackage.STATEMENT__QUESTION:
        return question != null && !question.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StatementImpl
