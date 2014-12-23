/**
 */
package org.osate.reqspec.reqSpec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.alisa.common.common.Description;

import org.osate.categories.categories.RequirementCategory;

import org.osate.reqspec.reqSpec.ContractualElement;
import org.osate.reqspec.reqSpec.ExternalDocument;
import org.osate.reqspec.reqSpec.Goal;
import org.osate.reqspec.reqSpec.RSLVariable;
import org.osate.reqspec.reqSpec.ReqSpecPackage;
import org.osate.reqspec.reqSpec.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getReqValue <em>Req Value</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getGoalReference <em>Goal Reference</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getHazardReference <em>Hazard Reference</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getRefinesReference <em>Refines Reference</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getSubrequirement <em>Subrequirement</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getDecomposesReference <em>Decomposes Reference</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getEvolvesReference <em>Evolves Reference</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getStakeholderRequirementReference <em>Stakeholder Requirement Reference</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getSystemRequirementReference <em>System Requirement Reference</em>}</li>
 *   <li>{@link org.osate.reqspec.reqSpec.impl.RequirementImpl#getDocReference <em>Doc Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends ContractualElementImpl implements Requirement
{
  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected RequirementCategory category;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected Description description;

  /**
   * The default value of the '{@link #getAssert() <em>Assert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssert()
   * @generated
   * @ordered
   */
  protected static final String ASSERT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssert() <em>Assert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssert()
   * @generated
   * @ordered
   */
  protected String assert_ = ASSERT_EDEFAULT;

  /**
   * The cached value of the '{@link #getReqValue() <em>Req Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqValue()
   * @generated
   * @ordered
   */
  protected EList<RSLVariable> reqValue;

  /**
   * The cached value of the '{@link #getGoalReference() <em>Goal Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoalReference()
   * @generated
   * @ordered
   */
  protected EList<Goal> goalReference;

  /**
   * The cached value of the '{@link #getHazardReference() <em>Hazard Reference</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHazardReference()
   * @generated
   * @ordered
   */
  protected EList<String> hazardReference;

  /**
   * The cached value of the '{@link #getRefinesReference() <em>Refines Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefinesReference()
   * @generated
   * @ordered
   */
  protected EList<Requirement> refinesReference;

  /**
   * The cached value of the '{@link #getSubrequirement() <em>Subrequirement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubrequirement()
   * @generated
   * @ordered
   */
  protected EList<Requirement> subrequirement;

  /**
   * The cached value of the '{@link #getDecomposesReference() <em>Decomposes Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecomposesReference()
   * @generated
   * @ordered
   */
  protected EList<Requirement> decomposesReference;

  /**
   * The cached value of the '{@link #getEvolvesReference() <em>Evolves Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvolvesReference()
   * @generated
   * @ordered
   */
  protected EList<Requirement> evolvesReference;

  /**
   * The cached value of the '{@link #getStakeholderRequirementReference() <em>Stakeholder Requirement Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakeholderRequirementReference()
   * @generated
   * @ordered
   */
  protected EList<Goal> stakeholderRequirementReference;

  /**
   * The cached value of the '{@link #getSystemRequirementReference() <em>System Requirement Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemRequirementReference()
   * @generated
   * @ordered
   */
  protected EList<ContractualElement> systemRequirementReference;

  /**
   * The cached value of the '{@link #getDocReference() <em>Doc Reference</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocReference()
   * @generated
   * @ordered
   */
  protected EList<ExternalDocument> docReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequirementImpl()
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
    return ReqSpecPackage.Literals.REQUIREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementCategory getCategory()
  {
    if (category != null && category.eIsProxy())
    {
      InternalEObject oldCategory = (InternalEObject)category;
      category = (RequirementCategory)eResolveProxy(oldCategory);
      if (category != oldCategory)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqSpecPackage.REQUIREMENT__CATEGORY, oldCategory, category));
      }
    }
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementCategory basicGetCategory()
  {
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategory(RequirementCategory newCategory)
  {
    RequirementCategory oldCategory = category;
    category = newCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqSpecPackage.REQUIREMENT__CATEGORY, oldCategory, category));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs)
  {
    Description oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqSpecPackage.REQUIREMENT__DESCRIPTION, oldDescription, newDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(Description newDescription)
  {
    if (newDescription != description)
    {
      NotificationChain msgs = null;
      if (description != null)
        msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqSpecPackage.REQUIREMENT__DESCRIPTION, null, msgs);
      if (newDescription != null)
        msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqSpecPackage.REQUIREMENT__DESCRIPTION, null, msgs);
      msgs = basicSetDescription(newDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqSpecPackage.REQUIREMENT__DESCRIPTION, newDescription, newDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssert()
  {
    return assert_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssert(String newAssert)
  {
    String oldAssert = assert_;
    assert_ = newAssert;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqSpecPackage.REQUIREMENT__ASSERT, oldAssert, assert_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RSLVariable> getReqValue()
  {
    if (reqValue == null)
    {
      reqValue = new EObjectContainmentEList<RSLVariable>(RSLVariable.class, this, ReqSpecPackage.REQUIREMENT__REQ_VALUE);
    }
    return reqValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getGoalReference()
  {
    if (goalReference == null)
    {
      goalReference = new EObjectResolvingEList<Goal>(Goal.class, this, ReqSpecPackage.REQUIREMENT__GOAL_REFERENCE);
    }
    return goalReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getHazardReference()
  {
    if (hazardReference == null)
    {
      hazardReference = new EDataTypeEList<String>(String.class, this, ReqSpecPackage.REQUIREMENT__HAZARD_REFERENCE);
    }
    return hazardReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getRefinesReference()
  {
    if (refinesReference == null)
    {
      refinesReference = new EObjectResolvingEList<Requirement>(Requirement.class, this, ReqSpecPackage.REQUIREMENT__REFINES_REFERENCE);
    }
    return refinesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getSubrequirement()
  {
    if (subrequirement == null)
    {
      subrequirement = new EObjectContainmentEList<Requirement>(Requirement.class, this, ReqSpecPackage.REQUIREMENT__SUBREQUIREMENT);
    }
    return subrequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getDecomposesReference()
  {
    if (decomposesReference == null)
    {
      decomposesReference = new EObjectResolvingEList<Requirement>(Requirement.class, this, ReqSpecPackage.REQUIREMENT__DECOMPOSES_REFERENCE);
    }
    return decomposesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getEvolvesReference()
  {
    if (evolvesReference == null)
    {
      evolvesReference = new EObjectResolvingEList<Requirement>(Requirement.class, this, ReqSpecPackage.REQUIREMENT__EVOLVES_REFERENCE);
    }
    return evolvesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getStakeholderRequirementReference()
  {
    if (stakeholderRequirementReference == null)
    {
      stakeholderRequirementReference = new EObjectResolvingEList<Goal>(Goal.class, this, ReqSpecPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE);
    }
    return stakeholderRequirementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContractualElement> getSystemRequirementReference()
  {
    if (systemRequirementReference == null)
    {
      systemRequirementReference = new EObjectResolvingEList<ContractualElement>(ContractualElement.class, this, ReqSpecPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE);
    }
    return systemRequirementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalDocument> getDocReference()
  {
    if (docReference == null)
    {
      docReference = new EObjectContainmentEList<ExternalDocument>(ExternalDocument.class, this, ReqSpecPackage.REQUIREMENT__DOC_REFERENCE);
    }
    return docReference;
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
      case ReqSpecPackage.REQUIREMENT__DESCRIPTION:
        return basicSetDescription(null, msgs);
      case ReqSpecPackage.REQUIREMENT__REQ_VALUE:
        return ((InternalEList<?>)getReqValue()).basicRemove(otherEnd, msgs);
      case ReqSpecPackage.REQUIREMENT__SUBREQUIREMENT:
        return ((InternalEList<?>)getSubrequirement()).basicRemove(otherEnd, msgs);
      case ReqSpecPackage.REQUIREMENT__DOC_REFERENCE:
        return ((InternalEList<?>)getDocReference()).basicRemove(otherEnd, msgs);
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
      case ReqSpecPackage.REQUIREMENT__CATEGORY:
        if (resolve) return getCategory();
        return basicGetCategory();
      case ReqSpecPackage.REQUIREMENT__DESCRIPTION:
        return getDescription();
      case ReqSpecPackage.REQUIREMENT__ASSERT:
        return getAssert();
      case ReqSpecPackage.REQUIREMENT__REQ_VALUE:
        return getReqValue();
      case ReqSpecPackage.REQUIREMENT__GOAL_REFERENCE:
        return getGoalReference();
      case ReqSpecPackage.REQUIREMENT__HAZARD_REFERENCE:
        return getHazardReference();
      case ReqSpecPackage.REQUIREMENT__REFINES_REFERENCE:
        return getRefinesReference();
      case ReqSpecPackage.REQUIREMENT__SUBREQUIREMENT:
        return getSubrequirement();
      case ReqSpecPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        return getDecomposesReference();
      case ReqSpecPackage.REQUIREMENT__EVOLVES_REFERENCE:
        return getEvolvesReference();
      case ReqSpecPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        return getStakeholderRequirementReference();
      case ReqSpecPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        return getSystemRequirementReference();
      case ReqSpecPackage.REQUIREMENT__DOC_REFERENCE:
        return getDocReference();
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
      case ReqSpecPackage.REQUIREMENT__CATEGORY:
        setCategory((RequirementCategory)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__DESCRIPTION:
        setDescription((Description)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__ASSERT:
        setAssert((String)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__REQ_VALUE:
        getReqValue().clear();
        getReqValue().addAll((Collection<? extends RSLVariable>)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__GOAL_REFERENCE:
        getGoalReference().clear();
        getGoalReference().addAll((Collection<? extends Goal>)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__HAZARD_REFERENCE:
        getHazardReference().clear();
        getHazardReference().addAll((Collection<? extends String>)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__REFINES_REFERENCE:
        getRefinesReference().clear();
        getRefinesReference().addAll((Collection<? extends Requirement>)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__SUBREQUIREMENT:
        getSubrequirement().clear();
        getSubrequirement().addAll((Collection<? extends Requirement>)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        getDecomposesReference().clear();
        getDecomposesReference().addAll((Collection<? extends Requirement>)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__EVOLVES_REFERENCE:
        getEvolvesReference().clear();
        getEvolvesReference().addAll((Collection<? extends Requirement>)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        getStakeholderRequirementReference().clear();
        getStakeholderRequirementReference().addAll((Collection<? extends Goal>)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        getSystemRequirementReference().clear();
        getSystemRequirementReference().addAll((Collection<? extends ContractualElement>)newValue);
        return;
      case ReqSpecPackage.REQUIREMENT__DOC_REFERENCE:
        getDocReference().clear();
        getDocReference().addAll((Collection<? extends ExternalDocument>)newValue);
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
      case ReqSpecPackage.REQUIREMENT__CATEGORY:
        setCategory((RequirementCategory)null);
        return;
      case ReqSpecPackage.REQUIREMENT__DESCRIPTION:
        setDescription((Description)null);
        return;
      case ReqSpecPackage.REQUIREMENT__ASSERT:
        setAssert(ASSERT_EDEFAULT);
        return;
      case ReqSpecPackage.REQUIREMENT__REQ_VALUE:
        getReqValue().clear();
        return;
      case ReqSpecPackage.REQUIREMENT__GOAL_REFERENCE:
        getGoalReference().clear();
        return;
      case ReqSpecPackage.REQUIREMENT__HAZARD_REFERENCE:
        getHazardReference().clear();
        return;
      case ReqSpecPackage.REQUIREMENT__REFINES_REFERENCE:
        getRefinesReference().clear();
        return;
      case ReqSpecPackage.REQUIREMENT__SUBREQUIREMENT:
        getSubrequirement().clear();
        return;
      case ReqSpecPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        getDecomposesReference().clear();
        return;
      case ReqSpecPackage.REQUIREMENT__EVOLVES_REFERENCE:
        getEvolvesReference().clear();
        return;
      case ReqSpecPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        getStakeholderRequirementReference().clear();
        return;
      case ReqSpecPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        getSystemRequirementReference().clear();
        return;
      case ReqSpecPackage.REQUIREMENT__DOC_REFERENCE:
        getDocReference().clear();
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
      case ReqSpecPackage.REQUIREMENT__CATEGORY:
        return category != null;
      case ReqSpecPackage.REQUIREMENT__DESCRIPTION:
        return description != null;
      case ReqSpecPackage.REQUIREMENT__ASSERT:
        return ASSERT_EDEFAULT == null ? assert_ != null : !ASSERT_EDEFAULT.equals(assert_);
      case ReqSpecPackage.REQUIREMENT__REQ_VALUE:
        return reqValue != null && !reqValue.isEmpty();
      case ReqSpecPackage.REQUIREMENT__GOAL_REFERENCE:
        return goalReference != null && !goalReference.isEmpty();
      case ReqSpecPackage.REQUIREMENT__HAZARD_REFERENCE:
        return hazardReference != null && !hazardReference.isEmpty();
      case ReqSpecPackage.REQUIREMENT__REFINES_REFERENCE:
        return refinesReference != null && !refinesReference.isEmpty();
      case ReqSpecPackage.REQUIREMENT__SUBREQUIREMENT:
        return subrequirement != null && !subrequirement.isEmpty();
      case ReqSpecPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        return decomposesReference != null && !decomposesReference.isEmpty();
      case ReqSpecPackage.REQUIREMENT__EVOLVES_REFERENCE:
        return evolvesReference != null && !evolvesReference.isEmpty();
      case ReqSpecPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        return stakeholderRequirementReference != null && !stakeholderRequirementReference.isEmpty();
      case ReqSpecPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        return systemRequirementReference != null && !systemRequirementReference.isEmpty();
      case ReqSpecPackage.REQUIREMENT__DOC_REFERENCE:
        return docReference != null && !docReference.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (assert: ");
    result.append(assert_);
    result.append(", hazardReference: ");
    result.append(hazardReference);
    result.append(')');
    return result.toString();
  }

} //RequirementImpl