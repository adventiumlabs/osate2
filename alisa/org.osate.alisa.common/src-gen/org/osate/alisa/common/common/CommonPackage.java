/**
 */
package org.osate.alisa.common.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.alisa.common.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "common";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.osate.org/alisa/common/Common";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "common";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CommonPackage eINSTANCE = org.osate.alisa.common.common.impl.CommonPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.alisa.common.common.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.common.common.impl.DescriptionImpl
   * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__DESCRIPTION = 0;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.alisa.common.common.impl.DescriptionElementImpl <em>Description Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.common.common.impl.DescriptionElementImpl
   * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getDescriptionElement()
   * @generated
   */
  int DESCRIPTION_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_ELEMENT__TEXT = 0;

  /**
   * The feature id for the '<em><b>Show Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_ELEMENT__SHOW_VALUE = 1;

  /**
   * The feature id for the '<em><b>This Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_ELEMENT__THIS_TARGET = 2;

  /**
   * The feature id for the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_ELEMENT__IMAGE = 3;

  /**
   * The number of structural features of the '<em>Description Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_ELEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.alisa.common.common.impl.RationaleImpl <em>Rationale</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.common.common.impl.RationaleImpl
   * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getRationale()
   * @generated
   */
  int RATIONALE = 2;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATIONALE__TEXT = 0;

  /**
   * The number of structural features of the '<em>Rationale</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATIONALE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.alisa.common.common.impl.UncertaintyImpl <em>Uncertainty</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.common.common.impl.UncertaintyImpl
   * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getUncertainty()
   * @generated
   */
  int UNCERTAINTY = 3;

  /**
   * The feature id for the '<em><b>Volatility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNCERTAINTY__VOLATILITY = 0;

  /**
   * The feature id for the '<em><b>Costimpact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNCERTAINTY__COSTIMPACT = 1;

  /**
   * The feature id for the '<em><b>Scheduleimpact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNCERTAINTY__SCHEDULEIMPACT = 2;

  /**
   * The feature id for the '<em><b>Familiarity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNCERTAINTY__FAMILIARITY = 3;

  /**
   * The feature id for the '<em><b>Timecriticality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNCERTAINTY__TIMECRITICALITY = 4;

  /**
   * The feature id for the '<em><b>Riskindex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNCERTAINTY__RISKINDEX = 5;

  /**
   * The feature id for the '<em><b>Maturityindex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNCERTAINTY__MATURITYINDEX = 6;

  /**
   * The number of structural features of the '<em>Uncertainty</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNCERTAINTY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.osate.alisa.common.common.impl.ShowValueImpl <em>Show Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.common.common.impl.ShowValueImpl
   * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getShowValue()
   * @generated
   */
  int SHOW_VALUE = 4;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_VALUE__REF = 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_VALUE__UNIT = 1;

  /**
   * The number of structural features of the '<em>Show Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.alisa.common.common.impl.ImageReferenceImpl <em>Image Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.common.common.impl.ImageReferenceImpl
   * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getImageReference()
   * @generated
   */
  int IMAGE_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Imgfile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_REFERENCE__IMGFILE = 0;

  /**
   * The number of structural features of the '<em>Image Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.alisa.common.common.impl.PropertyConsistentVariableDeclarationImpl <em>Property Consistent Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.common.common.impl.PropertyConsistentVariableDeclarationImpl
   * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getPropertyConsistentVariableDeclaration()
   * @generated
   */
  int PROPERTY_CONSISTENT_VARIABLE_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSISTENT_VARIABLE_DECLARATION__TYPE = XbasePackage.XVARIABLE_DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSISTENT_VARIABLE_DECLARATION__NAME = XbasePackage.XVARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSISTENT_VARIABLE_DECLARATION__RIGHT = XbasePackage.XVARIABLE_DECLARATION__RIGHT;

  /**
   * The feature id for the '<em><b>Writeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSISTENT_VARIABLE_DECLARATION__WRITEABLE = XbasePackage.XVARIABLE_DECLARATION__WRITEABLE;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSISTENT_VARIABLE_DECLARATION__PROPERTY = XbasePackage.XVARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Consistent Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSISTENT_VARIABLE_DECLARATION_FEATURE_COUNT = XbasePackage.XVARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.alisa.common.common.impl.ComputeDeclarationImpl <em>Compute Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.common.common.impl.ComputeDeclarationImpl
   * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getComputeDeclaration()
   * @generated
   */
  int COMPUTE_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE_DECLARATION__TYPE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE_DECLARATION__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Compute Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTE_DECLARATION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.alisa.common.common.impl.APropertyReferenceImpl <em>AProperty Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.common.common.impl.APropertyReferenceImpl
   * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getAPropertyReference()
   * @generated
   */
  int APROPERTY_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APROPERTY_REFERENCE__PROPERTY = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>AProperty Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APROPERTY_REFERENCE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.alisa.common.common.impl.XNumberLiteralUnitImpl <em>XNumber Literal Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.alisa.common.common.impl.XNumberLiteralUnitImpl
   * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getXNumberLiteralUnit()
   * @generated
   */
  int XNUMBER_LITERAL_UNIT = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNUMBER_LITERAL_UNIT__VALUE = XbasePackage.XNUMBER_LITERAL__VALUE;

  /**
   * The feature id for the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNUMBER_LITERAL_UNIT__UNIT = XbasePackage.XNUMBER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XNumber Literal Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNUMBER_LITERAL_UNIT_FEATURE_COUNT = XbasePackage.XNUMBER_LITERAL_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.osate.alisa.common.common.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see org.osate.alisa.common.common.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.alisa.common.common.Description#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Description</em>'.
   * @see org.osate.alisa.common.common.Description#getDescription()
   * @see #getDescription()
   * @generated
   */
  EReference getDescription_Description();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.common.common.DescriptionElement <em>Description Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description Element</em>'.
   * @see org.osate.alisa.common.common.DescriptionElement
   * @generated
   */
  EClass getDescriptionElement();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.DescriptionElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.osate.alisa.common.common.DescriptionElement#getText()
   * @see #getDescriptionElement()
   * @generated
   */
  EAttribute getDescriptionElement_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.alisa.common.common.DescriptionElement#getShowValue <em>Show Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Show Value</em>'.
   * @see org.osate.alisa.common.common.DescriptionElement#getShowValue()
   * @see #getDescriptionElement()
   * @generated
   */
  EReference getDescriptionElement_ShowValue();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.DescriptionElement#isThisTarget <em>This Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>This Target</em>'.
   * @see org.osate.alisa.common.common.DescriptionElement#isThisTarget()
   * @see #getDescriptionElement()
   * @generated
   */
  EAttribute getDescriptionElement_ThisTarget();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.alisa.common.common.DescriptionElement#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Image</em>'.
   * @see org.osate.alisa.common.common.DescriptionElement#getImage()
   * @see #getDescriptionElement()
   * @generated
   */
  EReference getDescriptionElement_Image();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.common.common.Rationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rationale</em>'.
   * @see org.osate.alisa.common.common.Rationale
   * @generated
   */
  EClass getRationale();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.Rationale#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.osate.alisa.common.common.Rationale#getText()
   * @see #getRationale()
   * @generated
   */
  EAttribute getRationale_Text();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.common.common.Uncertainty <em>Uncertainty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uncertainty</em>'.
   * @see org.osate.alisa.common.common.Uncertainty
   * @generated
   */
  EClass getUncertainty();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.Uncertainty#getVolatility <em>Volatility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Volatility</em>'.
   * @see org.osate.alisa.common.common.Uncertainty#getVolatility()
   * @see #getUncertainty()
   * @generated
   */
  EAttribute getUncertainty_Volatility();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.Uncertainty#getCostimpact <em>Costimpact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Costimpact</em>'.
   * @see org.osate.alisa.common.common.Uncertainty#getCostimpact()
   * @see #getUncertainty()
   * @generated
   */
  EAttribute getUncertainty_Costimpact();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.Uncertainty#getScheduleimpact <em>Scheduleimpact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scheduleimpact</em>'.
   * @see org.osate.alisa.common.common.Uncertainty#getScheduleimpact()
   * @see #getUncertainty()
   * @generated
   */
  EAttribute getUncertainty_Scheduleimpact();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.Uncertainty#getFamiliarity <em>Familiarity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Familiarity</em>'.
   * @see org.osate.alisa.common.common.Uncertainty#getFamiliarity()
   * @see #getUncertainty()
   * @generated
   */
  EAttribute getUncertainty_Familiarity();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.Uncertainty#getTimecriticality <em>Timecriticality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timecriticality</em>'.
   * @see org.osate.alisa.common.common.Uncertainty#getTimecriticality()
   * @see #getUncertainty()
   * @generated
   */
  EAttribute getUncertainty_Timecriticality();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.Uncertainty#getRiskindex <em>Riskindex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Riskindex</em>'.
   * @see org.osate.alisa.common.common.Uncertainty#getRiskindex()
   * @see #getUncertainty()
   * @generated
   */
  EAttribute getUncertainty_Riskindex();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.Uncertainty#getMaturityindex <em>Maturityindex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maturityindex</em>'.
   * @see org.osate.alisa.common.common.Uncertainty#getMaturityindex()
   * @see #getUncertainty()
   * @generated
   */
  EAttribute getUncertainty_Maturityindex();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.common.common.ShowValue <em>Show Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show Value</em>'.
   * @see org.osate.alisa.common.common.ShowValue
   * @generated
   */
  EClass getShowValue();

  /**
   * Returns the meta object for the reference '{@link org.osate.alisa.common.common.ShowValue#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.osate.alisa.common.common.ShowValue#getRef()
   * @see #getShowValue()
   * @generated
   */
  EReference getShowValue_Ref();

  /**
   * Returns the meta object for the reference '{@link org.osate.alisa.common.common.ShowValue#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Unit</em>'.
   * @see org.osate.alisa.common.common.ShowValue#getUnit()
   * @see #getShowValue()
   * @generated
   */
  EReference getShowValue_Unit();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.common.common.ImageReference <em>Image Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image Reference</em>'.
   * @see org.osate.alisa.common.common.ImageReference
   * @generated
   */
  EClass getImageReference();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.ImageReference#getImgfile <em>Imgfile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imgfile</em>'.
   * @see org.osate.alisa.common.common.ImageReference#getImgfile()
   * @see #getImageReference()
   * @generated
   */
  EAttribute getImageReference_Imgfile();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.common.common.PropertyConsistentVariableDeclaration <em>Property Consistent Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Consistent Variable Declaration</em>'.
   * @see org.osate.alisa.common.common.PropertyConsistentVariableDeclaration
   * @generated
   */
  EClass getPropertyConsistentVariableDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.osate.alisa.common.common.PropertyConsistentVariableDeclaration#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.osate.alisa.common.common.PropertyConsistentVariableDeclaration#getProperty()
   * @see #getPropertyConsistentVariableDeclaration()
   * @generated
   */
  EReference getPropertyConsistentVariableDeclaration_Property();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.common.common.ComputeDeclaration <em>Compute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compute Declaration</em>'.
   * @see org.osate.alisa.common.common.ComputeDeclaration
   * @generated
   */
  EClass getComputeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.alisa.common.common.ComputeDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.alisa.common.common.ComputeDeclaration#getType()
   * @see #getComputeDeclaration()
   * @generated
   */
  EReference getComputeDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.osate.alisa.common.common.ComputeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.alisa.common.common.ComputeDeclaration#getName()
   * @see #getComputeDeclaration()
   * @generated
   */
  EAttribute getComputeDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.common.common.APropertyReference <em>AProperty Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AProperty Reference</em>'.
   * @see org.osate.alisa.common.common.APropertyReference
   * @generated
   */
  EClass getAPropertyReference();

  /**
   * Returns the meta object for the reference '{@link org.osate.alisa.common.common.APropertyReference#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.osate.alisa.common.common.APropertyReference#getProperty()
   * @see #getAPropertyReference()
   * @generated
   */
  EReference getAPropertyReference_Property();

  /**
   * Returns the meta object for class '{@link org.osate.alisa.common.common.XNumberLiteralUnit <em>XNumber Literal Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XNumber Literal Unit</em>'.
   * @see org.osate.alisa.common.common.XNumberLiteralUnit
   * @generated
   */
  EClass getXNumberLiteralUnit();

  /**
   * Returns the meta object for the reference '{@link org.osate.alisa.common.common.XNumberLiteralUnit#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Unit</em>'.
   * @see org.osate.alisa.common.common.XNumberLiteralUnit#getUnit()
   * @see #getXNumberLiteralUnit()
   * @generated
   */
  EReference getXNumberLiteralUnit_Unit();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CommonFactory getCommonFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.alisa.common.common.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.common.common.impl.DescriptionImpl
     * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPTION__DESCRIPTION = eINSTANCE.getDescription_Description();

    /**
     * The meta object literal for the '{@link org.osate.alisa.common.common.impl.DescriptionElementImpl <em>Description Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.common.common.impl.DescriptionElementImpl
     * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getDescriptionElement()
     * @generated
     */
    EClass DESCRIPTION_ELEMENT = eINSTANCE.getDescriptionElement();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION_ELEMENT__TEXT = eINSTANCE.getDescriptionElement_Text();

    /**
     * The meta object literal for the '<em><b>Show Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPTION_ELEMENT__SHOW_VALUE = eINSTANCE.getDescriptionElement_ShowValue();

    /**
     * The meta object literal for the '<em><b>This Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION_ELEMENT__THIS_TARGET = eINSTANCE.getDescriptionElement_ThisTarget();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPTION_ELEMENT__IMAGE = eINSTANCE.getDescriptionElement_Image();

    /**
     * The meta object literal for the '{@link org.osate.alisa.common.common.impl.RationaleImpl <em>Rationale</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.common.common.impl.RationaleImpl
     * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getRationale()
     * @generated
     */
    EClass RATIONALE = eINSTANCE.getRationale();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RATIONALE__TEXT = eINSTANCE.getRationale_Text();

    /**
     * The meta object literal for the '{@link org.osate.alisa.common.common.impl.UncertaintyImpl <em>Uncertainty</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.common.common.impl.UncertaintyImpl
     * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getUncertainty()
     * @generated
     */
    EClass UNCERTAINTY = eINSTANCE.getUncertainty();

    /**
     * The meta object literal for the '<em><b>Volatility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNCERTAINTY__VOLATILITY = eINSTANCE.getUncertainty_Volatility();

    /**
     * The meta object literal for the '<em><b>Costimpact</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNCERTAINTY__COSTIMPACT = eINSTANCE.getUncertainty_Costimpact();

    /**
     * The meta object literal for the '<em><b>Scheduleimpact</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNCERTAINTY__SCHEDULEIMPACT = eINSTANCE.getUncertainty_Scheduleimpact();

    /**
     * The meta object literal for the '<em><b>Familiarity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNCERTAINTY__FAMILIARITY = eINSTANCE.getUncertainty_Familiarity();

    /**
     * The meta object literal for the '<em><b>Timecriticality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNCERTAINTY__TIMECRITICALITY = eINSTANCE.getUncertainty_Timecriticality();

    /**
     * The meta object literal for the '<em><b>Riskindex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNCERTAINTY__RISKINDEX = eINSTANCE.getUncertainty_Riskindex();

    /**
     * The meta object literal for the '<em><b>Maturityindex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNCERTAINTY__MATURITYINDEX = eINSTANCE.getUncertainty_Maturityindex();

    /**
     * The meta object literal for the '{@link org.osate.alisa.common.common.impl.ShowValueImpl <em>Show Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.common.common.impl.ShowValueImpl
     * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getShowValue()
     * @generated
     */
    EClass SHOW_VALUE = eINSTANCE.getShowValue();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOW_VALUE__REF = eINSTANCE.getShowValue_Ref();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOW_VALUE__UNIT = eINSTANCE.getShowValue_Unit();

    /**
     * The meta object literal for the '{@link org.osate.alisa.common.common.impl.ImageReferenceImpl <em>Image Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.common.common.impl.ImageReferenceImpl
     * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getImageReference()
     * @generated
     */
    EClass IMAGE_REFERENCE = eINSTANCE.getImageReference();

    /**
     * The meta object literal for the '<em><b>Imgfile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_REFERENCE__IMGFILE = eINSTANCE.getImageReference_Imgfile();

    /**
     * The meta object literal for the '{@link org.osate.alisa.common.common.impl.PropertyConsistentVariableDeclarationImpl <em>Property Consistent Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.common.common.impl.PropertyConsistentVariableDeclarationImpl
     * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getPropertyConsistentVariableDeclaration()
     * @generated
     */
    EClass PROPERTY_CONSISTENT_VARIABLE_DECLARATION = eINSTANCE.getPropertyConsistentVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONSISTENT_VARIABLE_DECLARATION__PROPERTY = eINSTANCE.getPropertyConsistentVariableDeclaration_Property();

    /**
     * The meta object literal for the '{@link org.osate.alisa.common.common.impl.ComputeDeclarationImpl <em>Compute Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.common.common.impl.ComputeDeclarationImpl
     * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getComputeDeclaration()
     * @generated
     */
    EClass COMPUTE_DECLARATION = eINSTANCE.getComputeDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPUTE_DECLARATION__TYPE = eINSTANCE.getComputeDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPUTE_DECLARATION__NAME = eINSTANCE.getComputeDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.osate.alisa.common.common.impl.APropertyReferenceImpl <em>AProperty Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.common.common.impl.APropertyReferenceImpl
     * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getAPropertyReference()
     * @generated
     */
    EClass APROPERTY_REFERENCE = eINSTANCE.getAPropertyReference();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APROPERTY_REFERENCE__PROPERTY = eINSTANCE.getAPropertyReference_Property();

    /**
     * The meta object literal for the '{@link org.osate.alisa.common.common.impl.XNumberLiteralUnitImpl <em>XNumber Literal Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.alisa.common.common.impl.XNumberLiteralUnitImpl
     * @see org.osate.alisa.common.common.impl.CommonPackageImpl#getXNumberLiteralUnit()
     * @generated
     */
    EClass XNUMBER_LITERAL_UNIT = eINSTANCE.getXNumberLiteralUnit();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XNUMBER_LITERAL_UNIT__UNIT = eINSTANCE.getXNumberLiteralUnit_Unit();

  }

} //CommonPackage