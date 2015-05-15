/*
 * generated by Xtext
 */
package org.osate.xtext.aadl2.errormodel.scoping;

import org.eclipse.emf.ecore.*
import org.eclipse.xtext.EcoreUtil2
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause
import org.osate.xtext.aadl2.errormodel.errorModel.TypeSet
import org.osate.xtext.aadl2.properties.scoping.PropertiesScopeProvider
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorType
import org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine
import org.eclipse.xtext.resource.IResourceDescriptions
import org.osate.xtext.aadl2.properties.util.EMFIndexRetrieval
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelPackage
import java.util.LinkedHashSet
import org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelLibraryImpl
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation

// \[[^]]*|[A-Za-z0-9_]*\]

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class ErrorModelScopeProvider extends PropertiesScopeProvider {
	
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

	def scope_ErrorSource_outgoing(ErrorModelSubclause context, EReference reference) {
		println(getMethodName() + ": " + context);
		val errorLib = EcoreUtil2.getContainerOfType(context, ErrorModelSubclause);
		val props = getPropagationsFromSubclause(errorLib);
		println(props);
		return props.scopeFor(delegateGetScope(context, reference));
	}

	def scope_ErrorModelLibrary(EObject context, EReference reference) {
		val ErrorModelLibraryClass = ErrorModelPackage.eINSTANCE.getErrorModelLibrary();
		var iter = EMFIndexRetrieval.getAllEObjectsOfTypeInWorkspace(ErrorModelLibraryClass);
		// TODO: Why are there duplicates?
		var libs = new LinkedHashSet<ErrorModelLibraryImpl>;
		for (x : iter) {
			val curLibObj = x.getEObjectOrProxy();
			/*
			var ErrorModelLibraryImpl curLib;
			try {
				curLib = (curLibObj as ErrorModelLibraryImpl);
				libs.add(curLib as ErrorModelLibraryImpl);
				println(curLib.toString());
			} catch (ClassCastException e) {
				println("Error: Unexpected type: " + curLibObj.getClass().getName());
				//continue;				
			}
			*/
			//libs.add(curLib as ErrorModelLibraryImpl);
			val curLib = curLibObj;
			switch curLib {
				ErrorModelLibraryImpl: {					
					println(curLib.toString());
					libs.add(curLib);  // Why doesn't the switch cast it? 
					}
				default: {
					println("Error: Unexpected type: " + curLib.getClass().getName());					
				}
			}
			
		}
		//return libs.scopeFor(); // This doesn't work.
		return null;		
	}

}