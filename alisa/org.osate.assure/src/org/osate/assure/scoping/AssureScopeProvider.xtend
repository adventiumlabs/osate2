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

/*
 * generated by Xtext
 */
package org.osate.assure.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.emf.ecore.EReference
import org.osate.assure.assure.ClaimResult
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.util.SimpleAttributeResolver
import org.osate.aadl2.ComponentImplementation
import org.osate.assure.assure.SubsystemResult
import org.osate.assure.assure.ModelResult
import static extension org.osate.assure.util.AssureUtilExtension.*

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class AssureScopeProvider extends AbstractDeclarativeScopeProvider {

	def scope_NamedElement(ClaimResult context, EReference reference) {
		val targetClassifier = context.caseTargetClassifier
		if (targetClassifier != null) {
			val thescope = new SimpleScope(IScope::NULLSCOPE,
				Scopes::scopedElementsFor(targetClassifier.getAllFeatures+targetClassifier.allModes,
					QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), true)
			if (targetClassifier instanceof ComponentImplementation) {
				new SimpleScope(thescope,
					Scopes::scopedElementsFor(targetClassifier.allSubcomponents+targetClassifier.allEndToEndFlows+
						targetClassifier.allConnections,
						QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), true)
			} else {
				return thescope
			}
		} else {
			IScope.NULLSCOPE
		}
	}


	def scope_Subcomponent(SubsystemResult context, EReference reference) {
		val parent = context.eContainer
		val cl = switch(parent){
			SubsystemResult: parent.targetSystem.allClassifier
			ModelResult: parent.target
		}
		if (cl instanceof ComponentImplementation){
		val subs = cl.allSubcomponents
		return new SimpleScope(IScope::NULLSCOPE, Scopes::scopedElementsFor(subs,
					QualifiedName::wrapper(SimpleAttributeResolver::NAME_RESOLVER)), false)
		}
		return IScope::NULLSCOPE
	}

}
