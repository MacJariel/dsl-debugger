/*
 * generated by Xtext
 */
package org.macjariel.karel.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class KarelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.macjariel.karel.ui.internal.KarelActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.macjariel.karel.ui.internal.KarelActivator.getInstance().getInjector("org.macjariel.karel.Karel");
	}
	
}
