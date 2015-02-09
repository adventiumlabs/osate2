/**
 */
package org.osate.alisa.common.common.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.alisa.common.common.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonFactoryImpl extends EFactoryImpl implements CommonFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CommonFactory init()
  {
    try
    {
      CommonFactory theCommonFactory = (CommonFactory)EPackage.Registry.INSTANCE.getEFactory(CommonPackage.eNS_URI);
      if (theCommonFactory != null)
      {
        return theCommonFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CommonFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonFactoryImpl()
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
      case CommonPackage.DESCRIPTION: return createDescription();
      case CommonPackage.DESCRIPTION_ELEMENT: return createDescriptionElement();
      case CommonPackage.XEXPRESSION: return createXExpression();
      case CommonPackage.SHOW_VALUE: return createShowValue();
      case CommonPackage.XVARIABLE_DECLARATION: return createXVariableDeclaration();
      case CommonPackage.XNUMBER_LITERAL: return createXNumberLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescriptionElement createDescriptionElement()
  {
    DescriptionElementImpl descriptionElement = new DescriptionElementImpl();
    return descriptionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression createXExpression()
  {
    XExpressionImpl xExpression = new XExpressionImpl();
    return xExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowValue createShowValue()
  {
    ShowValueImpl showValue = new ShowValueImpl();
    return showValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XVariableDeclaration createXVariableDeclaration()
  {
    XVariableDeclarationImpl xVariableDeclaration = new XVariableDeclarationImpl();
    return xVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XNumberLiteral createXNumberLiteral()
  {
    XNumberLiteralImpl xNumberLiteral = new XNumberLiteralImpl();
    return xNumberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonPackage getCommonPackage()
  {
    return (CommonPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CommonPackage getPackage()
  {
    return CommonPackage.eINSTANCE;
  }

} //CommonFactoryImpl