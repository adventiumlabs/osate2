/*
 * generated by Xtext
 */
package org.osate.alisa.common;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CommonUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.osate.alisa.common.ui.internal.CommonActivator.getInstance().getInjector("org.osate.alisa.common.Common");
	}
	
}