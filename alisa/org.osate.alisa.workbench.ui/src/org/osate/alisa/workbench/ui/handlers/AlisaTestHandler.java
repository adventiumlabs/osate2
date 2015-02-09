package org.osate.alisa.workbench.ui.handlers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.instance.SystemInstance;
import org.osate.aadl2.instantiation.InstantiateModel;
import org.osate.assure.ui.util.AlisaLoader;
import org.osate.ui.dialogs.Dialog;

public class AlisaTestHandler extends EditorObjectHandler {

	@Override
	protected String getJobName() {
		return "Incremental Assurance";
	}

	@Override
	protected IStatus runJob(EObject root, IProgressMonitor monitor) {

		long start = System.currentTimeMillis();

		SystemInstance si;
		if (root instanceof ComponentImplementation) {
			ComponentImplementation compImpl = (ComponentImplementation) root;
			try {
				si = InstantiateModel.buildInstanceModelFile(compImpl);
			} catch (Exception e) {
				Dialog.showError("Model Instantiate", "Error while re-instantiating the model: " + e.getMessage());
				return Status.CANCEL_STATUS;
			}
		} else {
			Dialog.showError("Model Instantiate", "You must select a Component Implementation to instantiate");
			return Status.CANCEL_STATUS;
		}

//		InstantiateCase mycase = new InstantiateCase();
//		String result = mycase.generate(si);
//		System.out.println(result);
//
		Object[] args;
		args = new Object[1];
		args[0] = si;
		AlisaLoader.alisaInvoke("testresourcebudget.JulienTest", "julien", args);

		long stop = System.currentTimeMillis();
		System.out.println("Evaluation time: " + (stop - start) / 1000.0 + "s");
		System.out.println(EcoreUtil2.getURI(root));

		return Status.OK_STATUS;
	}
}
