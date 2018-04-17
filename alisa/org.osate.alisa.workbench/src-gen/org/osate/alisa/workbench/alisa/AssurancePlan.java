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
package org.osate.alisa.workbench.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.Subcomponent;

import org.osate.alisa.common.common.Description;

import org.osate.verify.verify.VerificationPlan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assurance Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#getTitle <em>Title</em>}</li>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#getDescription <em>Description</em>}</li>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#getAssure <em>Assure</em>}</li>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#getAssureSelf <em>Assure Self</em>}</li>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#getAssureGlobal <em>Assure Global</em>}</li>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#getAssureSubsystems <em>Assure Subsystems</em>}</li>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#isAssureAll <em>Assure All</em>}</li>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#getAssumeSubsystems <em>Assume Subsystems</em>}</li>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#isAssumeAll <em>Assume All</em>}</li>
 *   <li>{@link org.osate.alisa.workbench.alisa.AssurancePlan#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan()
 * @model
 * @generated
 */
public interface AssurancePlan extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ComponentImplementation)
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_Target()
   * @model
   * @generated
   */
  ComponentImplementation getTarget();

  /**
   * Sets the value of the '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ComponentImplementation value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(Description)
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link org.osate.alisa.workbench.alisa.AssurancePlan#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

  /**
   * Returns the value of the '<em><b>Assure</b></em>' reference list.
   * The list contents are of type {@link org.osate.verify.verify.VerificationPlan}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assure</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assure</em>' reference list.
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_Assure()
   * @model
   * @generated
   */
  EList<VerificationPlan> getAssure();

  /**
   * Returns the value of the '<em><b>Assure Self</b></em>' reference list.
   * The list contents are of type {@link org.osate.verify.verify.VerificationPlan}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assure Self</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assure Self</em>' reference list.
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_AssureSelf()
   * @model
   * @generated
   */
  EList<VerificationPlan> getAssureSelf();

  /**
   * Returns the value of the '<em><b>Assure Global</b></em>' reference list.
   * The list contents are of type {@link org.osate.verify.verify.VerificationPlan}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assure Global</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assure Global</em>' reference list.
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_AssureGlobal()
   * @model
   * @generated
   */
  EList<VerificationPlan> getAssureGlobal();

  /**
   * Returns the value of the '<em><b>Assure Subsystems</b></em>' reference list.
   * The list contents are of type {@link org.osate.aadl2.Subcomponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assure Subsystems</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assure Subsystems</em>' reference list.
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_AssureSubsystems()
   * @model
   * @generated
   */
  EList<Subcomponent> getAssureSubsystems();

  /**
   * Returns the value of the '<em><b>Assure All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assure All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assure All</em>' attribute.
   * @see #setAssureAll(boolean)
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_AssureAll()
   * @model
   * @generated
   */
  boolean isAssureAll();

  /**
   * Sets the value of the '{@link org.osate.alisa.workbench.alisa.AssurancePlan#isAssureAll <em>Assure All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assure All</em>' attribute.
   * @see #isAssureAll()
   * @generated
   */
  void setAssureAll(boolean value);

  /**
   * Returns the value of the '<em><b>Assume Subsystems</b></em>' reference list.
   * The list contents are of type {@link org.osate.aadl2.Subcomponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assume Subsystems</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assume Subsystems</em>' reference list.
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_AssumeSubsystems()
   * @model
   * @generated
   */
  EList<Subcomponent> getAssumeSubsystems();

  /**
   * Returns the value of the '<em><b>Assume All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assume All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assume All</em>' attribute.
   * @see #setAssumeAll(boolean)
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_AssumeAll()
   * @model
   * @generated
   */
  boolean isAssumeAll();

  /**
   * Sets the value of the '{@link org.osate.alisa.workbench.alisa.AssurancePlan#isAssumeAll <em>Assume All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assume All</em>' attribute.
   * @see #isAssumeAll()
   * @generated
   */
  void setAssumeAll(boolean value);

  /**
   * Returns the value of the '<em><b>Issues</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Issues</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Issues</em>' attribute list.
   * @see org.osate.alisa.workbench.alisa.AlisaPackage#getAssurancePlan_Issues()
   * @model unique="false"
   * @generated
   */
  EList<String> getIssues();

} // AssurancePlan
