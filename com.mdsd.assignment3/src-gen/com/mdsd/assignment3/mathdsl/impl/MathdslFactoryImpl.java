/**
 * generated by Xtext 2.30.0
 */
package com.mdsd.assignment3.mathdsl.impl;

import com.mdsd.assignment3.mathdsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathdslFactoryImpl extends EFactoryImpl implements MathdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MathdslFactory init()
  {
    try
    {
      MathdslFactory theMathdslFactory = (MathdslFactory)EPackage.Registry.INSTANCE.getEFactory(MathdslPackage.eNS_URI);
      if (theMathdslFactory != null)
      {
        return theMathdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MathdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MathdslPackage.MATH_EXP: return createMathExp();
      case MathdslPackage.VAR_BINDING: return createVarBinding();
      case MathdslPackage.EXTERNAL: return createExternal();
      case MathdslPackage.EXTERNAL_USE: return createExternalUse();
      case MathdslPackage.EXPRESSION: return createExpression();
      case MathdslPackage.LET_BINDING: return createLetBinding();
      case MathdslPackage.BINDING: return createBinding();
      case MathdslPackage.VARIABLE_USE: return createVariableUse();
      case MathdslPackage.PLUS: return createPlus();
      case MathdslPackage.MINUS: return createMinus();
      case MathdslPackage.MULT: return createMult();
      case MathdslPackage.DIV: return createDiv();
      case MathdslPackage.MATH_NUMBER: return createMathNumber();
      case MathdslPackage.PARENTHESIS: return createParenthesis();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathExp createMathExp()
  {
    MathExpImpl mathExp = new MathExpImpl();
    return mathExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarBinding createVarBinding()
  {
    VarBindingImpl varBinding = new VarBindingImpl();
    return varBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public External createExternal()
  {
    ExternalImpl external = new ExternalImpl();
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalUse createExternalUse()
  {
    ExternalUseImpl externalUse = new ExternalUseImpl();
    return externalUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LetBinding createLetBinding()
  {
    LetBindingImpl letBinding = new LetBindingImpl();
    return letBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableUse createVariableUse()
  {
    VariableUseImpl variableUse = new VariableUseImpl();
    return variableUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathNumber createMathNumber()
  {
    MathNumberImpl mathNumber = new MathNumberImpl();
    return mathNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parenthesis createParenthesis()
  {
    ParenthesisImpl parenthesis = new ParenthesisImpl();
    return parenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathdslPackage getMathdslPackage()
  {
    return (MathdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MathdslPackage getPackage()
  {
    return MathdslPackage.eINSTANCE;
  }

} //MathdslFactoryImpl
