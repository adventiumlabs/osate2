/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 * 
 * See COPYRIGHT file for full details.
 */
package org.osate.assure.assure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.assure.assure.AssurePackage;
import org.osate.assure.assure.VerificationActivityResult;
import org.osate.assure.assure.VerificationResult;

import org.osate.verify.verify.VerificationActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Activity Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.assure.assure.impl.VerificationActivityResultImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.VerificationActivityResultImpl#getPreconditionResult <em>Precondition Result</em>}</li>
 *   <li>{@link org.osate.assure.assure.impl.VerificationActivityResultImpl#getValidationResult <em>Validation Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationActivityResultImpl extends VerificationResultImpl implements VerificationActivityResult
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected VerificationActivity target;

  /**
   * The cached value of the '{@link #getPreconditionResult() <em>Precondition Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreconditionResult()
   * @generated
   * @ordered
   */
  protected VerificationResult preconditionResult;

  /**
   * The cached value of the '{@link #getValidationResult() <em>Validation Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidationResult()
   * @generated
   * @ordered
   */
  protected VerificationResult validationResult;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerificationActivityResultImpl()
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
    return AssurePackage.Literals.VERIFICATION_ACTIVITY_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationActivity getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (VerificationActivity)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssurePackage.VERIFICATION_ACTIVITY_RESULT__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationActivity basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(VerificationActivity newTarget)
  {
    VerificationActivity oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.VERIFICATION_ACTIVITY_RESULT__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationResult getPreconditionResult()
  {
    return preconditionResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreconditionResult(VerificationResult newPreconditionResult, NotificationChain msgs)
  {
    VerificationResult oldPreconditionResult = preconditionResult;
    preconditionResult = newPreconditionResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssurePackage.VERIFICATION_ACTIVITY_RESULT__PRECONDITION_RESULT, oldPreconditionResult, newPreconditionResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreconditionResult(VerificationResult newPreconditionResult)
  {
    if (newPreconditionResult != preconditionResult)
    {
      NotificationChain msgs = null;
      if (preconditionResult != null)
        msgs = ((InternalEObject)preconditionResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssurePackage.VERIFICATION_ACTIVITY_RESULT__PRECONDITION_RESULT, null, msgs);
      if (newPreconditionResult != null)
        msgs = ((InternalEObject)newPreconditionResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssurePackage.VERIFICATION_ACTIVITY_RESULT__PRECONDITION_RESULT, null, msgs);
      msgs = basicSetPreconditionResult(newPreconditionResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.VERIFICATION_ACTIVITY_RESULT__PRECONDITION_RESULT, newPreconditionResult, newPreconditionResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationResult getValidationResult()
  {
    return validationResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidationResult(VerificationResult newValidationResult, NotificationChain msgs)
  {
    VerificationResult oldValidationResult = validationResult;
    validationResult = newValidationResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssurePackage.VERIFICATION_ACTIVITY_RESULT__VALIDATION_RESULT, oldValidationResult, newValidationResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidationResult(VerificationResult newValidationResult)
  {
    if (newValidationResult != validationResult)
    {
      NotificationChain msgs = null;
      if (validationResult != null)
        msgs = ((InternalEObject)validationResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssurePackage.VERIFICATION_ACTIVITY_RESULT__VALIDATION_RESULT, null, msgs);
      if (newValidationResult != null)
        msgs = ((InternalEObject)newValidationResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssurePackage.VERIFICATION_ACTIVITY_RESULT__VALIDATION_RESULT, null, msgs);
      msgs = basicSetValidationResult(newValidationResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssurePackage.VERIFICATION_ACTIVITY_RESULT__VALIDATION_RESULT, newValidationResult, newValidationResult));
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
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__PRECONDITION_RESULT:
        return basicSetPreconditionResult(null, msgs);
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__VALIDATION_RESULT:
        return basicSetValidationResult(null, msgs);
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
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__PRECONDITION_RESULT:
        return getPreconditionResult();
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__VALIDATION_RESULT:
        return getValidationResult();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__TARGET:
        setTarget((VerificationActivity)newValue);
        return;
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__PRECONDITION_RESULT:
        setPreconditionResult((VerificationResult)newValue);
        return;
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__VALIDATION_RESULT:
        setValidationResult((VerificationResult)newValue);
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
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__TARGET:
        setTarget((VerificationActivity)null);
        return;
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__PRECONDITION_RESULT:
        setPreconditionResult((VerificationResult)null);
        return;
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__VALIDATION_RESULT:
        setValidationResult((VerificationResult)null);
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
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__TARGET:
        return target != null;
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__PRECONDITION_RESULT:
        return preconditionResult != null;
      case AssurePackage.VERIFICATION_ACTIVITY_RESULT__VALIDATION_RESULT:
        return validationResult != null;
    }
    return super.eIsSet(featureID);
  }

} //VerificationActivityResultImpl