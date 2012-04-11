/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the Eclipse Public License as published by Eclipse, either
 * version 1.0 of the License, or (at your option) any later version. This
 * program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse Public License for
 * more details. You should have received a copy of the Eclipse Public License
 * along with this program. If not, see
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
package fr.tpt.aadl.annex.behavior.aadlba.impl;

import fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage;
import fr.tpt.aadl.annex.behavior.aadlba.DataAccessHolder;
import fr.tpt.aadl.annex.behavior.aadlba.GroupHolder;
import fr.tpt.aadl.annex.behavior.aadlba.GroupableElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.DataAccess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Access Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.DataAccessHolderImpl#getGroupHolders <em>Group Holders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAccessHolderImpl extends DataHolderImpl implements DataAccessHolder
{
  /**
   * The cached value of the '{@link #getGroupHolders() <em>Group Holders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupHolders()
   * @generated
   * @ordered
   */
  protected EList<GroupHolder> groupHolders;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataAccessHolderImpl()
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
    return AadlBaPackage.Literals.DATA_ACCESS_HOLDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupHolder> getGroupHolders()
  {
    if (groupHolders == null)
    {
      groupHolders = new EObjectContainmentEList.Unsettable<GroupHolder>(GroupHolder.class, this, AadlBaPackage.DATA_ACCESS_HOLDER__GROUP_HOLDERS);
    }
    return groupHolders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetGroupHolders()
  {
    if (groupHolders != null) ((InternalEList.Unsettable<?>)groupHolders).unset();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetGroupHolders()
  {
    return groupHolders != null && ((InternalEList.Unsettable<?>)groupHolders).isSet();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataAccess(DataAccess dataAccess)
  {
    element = dataAccess ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAccess getDataAccess()
  {
    return (DataAccess) element;
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
      case AadlBaPackage.DATA_ACCESS_HOLDER__GROUP_HOLDERS:
        return ((InternalEList<?>)getGroupHolders()).basicRemove(otherEnd, msgs);
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
      case AadlBaPackage.DATA_ACCESS_HOLDER__GROUP_HOLDERS:
        return getGroupHolders();
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
      case AadlBaPackage.DATA_ACCESS_HOLDER__GROUP_HOLDERS:
        getGroupHolders().clear();
        getGroupHolders().addAll((Collection<? extends GroupHolder>)newValue);
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
      case AadlBaPackage.DATA_ACCESS_HOLDER__GROUP_HOLDERS:
        unsetGroupHolders();
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
      case AadlBaPackage.DATA_ACCESS_HOLDER__GROUP_HOLDERS:
        return isSetGroupHolders();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == GroupableElement.class)
    {
      switch (derivedFeatureID)
      {
        case AadlBaPackage.DATA_ACCESS_HOLDER__GROUP_HOLDERS: return AadlBaPackage.GROUPABLE_ELEMENT__GROUP_HOLDERS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == GroupableElement.class)
    {
      switch (baseFeatureID)
      {
        case AadlBaPackage.GROUPABLE_ELEMENT__GROUP_HOLDERS: return AadlBaPackage.DATA_ACCESS_HOLDER__GROUP_HOLDERS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //DataAccessHolderImpl
