package org.osate.xtext.aadl2.errormodel.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.osate.aadl2.Classifier
import org.osate.aadl2.ComponentImplementation
import org.osate.aadl2.DirectionType
import org.osate.aadl2.FeatureGroup
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorType
import org.osate.xtext.aadl2.errormodel.errorModel.FeatureorPPReference
import org.osate.xtext.aadl2.errormodel.errorModel.TypeSet
import org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet
import org.osate.xtext.aadl2.properties.scoping.PropertiesScopeProvider

import static extension org.osate.xtext.aadl2.errormodel.util.EMV2Util.getAllContainingClassifierEMV2Subclauses
import static extension org.osate.xtext.aadl2.errormodel.util.EMV2Util.getAllPropagationPoints
import static extension org.osate.xtext.aadl2.errormodel.util.EMV2Util.getFeatureorPPRefs

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
class ErrorModelScopeProvider extends PropertiesScopeProvider {
	
	def String getMethodName() { // For debugging
		val StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		return ste.get(2).getMethodName();
	}
	
	def Iterable<ErrorType> getErrorTypesFromLib(ErrorModelLibrary lib) {
		return (#[lib.types] + lib.extends.map[it | getErrorTypesFromLib(it)]).flatten();
	}

	def Iterable<TypeSet> getTypesetsFromLib(ErrorModelLibrary lib) {
		return (#[lib.typesets] + lib.extends.map[it | getTypesetsFromLib(it)]).flatten();
	}

	def scope_ErrorType_superType(ErrorModelLibrary context, EReference reference) {
		val errorLib = EcoreUtil2.getContainerOfType(context, ErrorModelLibrary);
		return getErrorTypesFromLib(errorLib).scopeFor(delegateGetScope(context, reference));
	}

	def scope_ErrorType_aliasedType(ErrorModelLibrary context, EReference reference) {
		val errorLib = EcoreUtil2.getContainerOfType(context, ErrorModelLibrary);
		return getErrorTypesFromLib(errorLib).scopeFor(delegateGetScope(context, reference));
	}

	def scope_TypeSet_aliasedType(ErrorModelLibrary context, EReference reference) {
		val errorLib = EcoreUtil2.getContainerOfType(context, ErrorModelLibrary);
		return getTypesetsFromLib(errorLib).scopeFor(delegateGetScope(context, reference));
	}
	
	def getErrorLibsFromContext(EObject context) {
		println(getMethodName() + ": " + context);
		var EObject parCtx;
		for (parCtx = context; parCtx != null; parCtx = parCtx.eContainer()) {
			switch (parCtx) {
				ErrorModelLibrary:
					return #[parCtx]	
				ErrorModelSubclause:
					return parCtx.useTypes	
				TypeTransformationSet:
					return parCtx.useTypes					
			}
		}
		return null;
	}

	def scope_TypeToken_type(EObject context, EReference reference) {
		println(getMethodName() + ": " + context);
		val parentScope = delegateGetScope(context, reference);
		val errorLibs = getErrorLibsFromContext(context);
		val errorTypes = (
			errorLibs.map[it | getErrorTypesFromLib(it)] +
			errorLibs.map[it | getTypesetsFromLib(it)]).flatten();
		println("Error Types: " + errorTypes.map[it | it.name].toString());
		return errorTypes.scopeFor(parentScope);
	}
	
	def get_ErrorBehaviorStateMachines_from_context(EObject context) {
		return #[EcoreUtil2.getContainerOfType(context, ErrorBehaviorStateMachine)];
		// TODO: Consider a state machine that extends another state machine.
		// TODO: Can an ErrorBehaviorState occur outside the scope of a ErrorBehaviorStateMachine?
	}
	
	def scope_ErrorBehaviorState(EObject context, EReference reference) {
		println(getMethodName() + ": " + context);
		val states = get_ErrorBehaviorStateMachines_from_context(context).map[it | it.states].flatten();
		return states.scopeFor();
	}

	def scope_ErrorBehaviorEvent(EObject context, EReference reference) {
		println(getMethodName() + ": " + context);
		val events = EcoreUtil2.getContainerOfType(context, ErrorBehaviorStateMachine).events;
		// TODO: same as for scope_ErrorBehaviorState
		return events.scopeFor();		
	}
	
	def scope_ErrorEvent(EObject context, EReference reference) {
		println(getMethodName() + ": " + context);
		val events = EcoreUtil2.getContainerOfType(context, ErrorBehaviorStateMachine).events;
		// TODO: same as for scope_ErrorBehaviorState
		return events.scopeFor();		
	}
	
	def Iterable<ErrorPropagation> getPropagationsFromSubclause(ErrorModelSubclause lib) {
		return (#[lib.propagations]).flatten();
	}

	def scope_ErrorModelLibrary(EObject context, EReference reference) {
		scopeWithoutEMV2Prefix(context, reference)
	}
	
	def scope_TypeMappingSet(EObject context, EReference reference) {
		scopeWithoutEMV2Prefix(context, reference)
	}
	
	def scope_FeatureorPPReference_featureorPP(Classifier context, EReference reference) {
		(context.getAllFeatures + context.allPropagationPoints + if (context instanceof ComponentImplementation) {
			context.allInternalFeatures
		} else {
			emptyList
		}).scopeFor
	}
	
	def scope_FeatureorPPReference_featureorPP(FeatureorPPReference context, EReference reference) {
		switch fg : context.featureorPP {
			FeatureGroup: fg.featureGroupType.getAllFeatures.scopeFor
			default: IScope.NULLSCOPE
		}
	}
	
	def scope_ErrorSource_outgoing(Classifier context, EReference reference) {
		val propagations = context.allContainingClassifierEMV2Subclauses.map[propagations].flatten.filter[!not && direction == DirectionType.OUT]
		new SimpleScope(propagations.map[EObjectDescription.create(kind ?: featureorPPRefs.join(".", [featureorPP.name]), it)])
	}
	
	def private scopeWithoutEMV2Prefix(EObject context, EReference reference) {
		new SimpleScope(delegateGetScope(context, reference).allElements.map[EObjectDescription.create(name.firstSegment.substring("emv2$".length), EObjectOrProxy)], true)
	}
}