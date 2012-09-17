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
import fr.tpt.aadl.annex.behavior.aadlba.BehaviorActionBlock;
import fr.tpt.aadl.annex.behavior.aadlba.BehaviorAnnex;
import fr.tpt.aadl.annex.behavior.aadlba.BehaviorState;
import fr.tpt.aadl.annex.behavior.aadlba.BehaviorTransition;
import fr.tpt.aadl.annex.behavior.aadlba.BehaviorVariable;
import fr.tpt.aadl.annex.behavior.texteditor.AadlBaHighlighter;
import fr.tpt.aadl.annex.behavior.utils.AadlBaLocationReference ;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.Element ;
import org.osate.aadl2.impl.AnnexSubclauseImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Annex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.BehaviorAnnexImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.BehaviorAnnexImpl#getStates <em>States</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.BehaviorAnnexImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.BehaviorAnnexImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorAnnexImpl extends AnnexSubclauseImpl implements BehaviorAnnex
{
  /**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
  protected EList<BehaviorVariable> variables;

  /**
   * @generated NOT
   */
  
  private Map<AadlBaLocationReference, Element> _links = new HashMap
	        <AadlBaLocationReference, Element>() ;
  
  public Map<AadlBaLocationReference, Element> getLinks()
  {
	  return _links;
  }
  
  private Map<BehaviorAnnex, AadlBaHighlighter> _annexHighlighters = 
		   new HashMap<BehaviorAnnex, AadlBaHighlighter>();
 
  public Map<BehaviorAnnex, AadlBaHighlighter> getHighlighters()
  {
	  return _annexHighlighters;
  }
  
  
  /**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
  protected EList<BehaviorState> states;

  /**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
  protected EList<BehaviorTransition> transitions;

  /**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorActionBlock> actions;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BehaviorAnnexImpl()
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
		return AadlBaPackage.Literals.BEHAVIOR_ANNEX;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<BehaviorVariable> getVariables()
  {
		if (variables == null) {
			variables = new EObjectContainmentEList.Unsettable<BehaviorVariable>(BehaviorVariable.class, this, AadlBaPackage.BEHAVIOR_ANNEX__VARIABLES);
		}
		return variables;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetVariables()
  {
		if (variables != null) ((InternalEList.Unsettable<?>)variables).unset();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetVariables()
  {
		return variables != null && ((InternalEList.Unsettable<?>)variables).isSet();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<BehaviorState> getStates()
  {
		if (states == null) {
			states = new EObjectContainmentEList.Unsettable<BehaviorState>(BehaviorState.class, this, AadlBaPackage.BEHAVIOR_ANNEX__STATES);
		}
		return states;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetStates()
  {
		if (states != null) ((InternalEList.Unsettable<?>)states).unset();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetStates()
  {
		return states != null && ((InternalEList.Unsettable<?>)states).isSet();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<BehaviorTransition> getTransitions()
  {
		if (transitions == null) {
			transitions = new EObjectContainmentEList.Unsettable<BehaviorTransition>(BehaviorTransition.class, this, AadlBaPackage.BEHAVIOR_ANNEX__TRANSITIONS);
		}
		return transitions;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetTransitions()
  {
		if (transitions != null) ((InternalEList.Unsettable<?>)transitions).unset();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetTransitions()
  {
		return transitions != null && ((InternalEList.Unsettable<?>)transitions).isSet();
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorActionBlock> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<BehaviorActionBlock>(BehaviorActionBlock.class, this, AadlBaPackage.BEHAVIOR_ANNEX__ACTIONS);
		}
		return actions;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case AadlBaPackage.BEHAVIOR_ANNEX__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case AadlBaPackage.BEHAVIOR_ANNEX__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case AadlBaPackage.BEHAVIOR_ANNEX__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case AadlBaPackage.BEHAVIOR_ANNEX__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case AadlBaPackage.BEHAVIOR_ANNEX__VARIABLES:
				return getVariables();
			case AadlBaPackage.BEHAVIOR_ANNEX__STATES:
				return getStates();
			case AadlBaPackage.BEHAVIOR_ANNEX__TRANSITIONS:
				return getTransitions();
			case AadlBaPackage.BEHAVIOR_ANNEX__ACTIONS:
				return getActions();
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
		switch (featureID) {
			case AadlBaPackage.BEHAVIOR_ANNEX__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends BehaviorVariable>)newValue);
				return;
			case AadlBaPackage.BEHAVIOR_ANNEX__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends BehaviorState>)newValue);
				return;
			case AadlBaPackage.BEHAVIOR_ANNEX__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends BehaviorTransition>)newValue);
				return;
			case AadlBaPackage.BEHAVIOR_ANNEX__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends BehaviorActionBlock>)newValue);
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
		switch (featureID) {
			case AadlBaPackage.BEHAVIOR_ANNEX__VARIABLES:
				unsetVariables();
				return;
			case AadlBaPackage.BEHAVIOR_ANNEX__STATES:
				unsetStates();
				return;
			case AadlBaPackage.BEHAVIOR_ANNEX__TRANSITIONS:
				unsetTransitions();
				return;
			case AadlBaPackage.BEHAVIOR_ANNEX__ACTIONS:
				getActions().clear();
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
		switch (featureID) {
			case AadlBaPackage.BEHAVIOR_ANNEX__VARIABLES:
				return isSetVariables();
			case AadlBaPackage.BEHAVIOR_ANNEX__STATES:
				return isSetStates();
			case AadlBaPackage.BEHAVIOR_ANNEX__TRANSITIONS:
				return isSetTransitions();
			case AadlBaPackage.BEHAVIOR_ANNEX__ACTIONS:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  @Override
  public AadlBaLocationReference getAadlBaLocationReference()
  {
    return (AadlBaLocationReference) this.getLocationReference() ;
  }
  
} //BehaviorAnnexImpl
