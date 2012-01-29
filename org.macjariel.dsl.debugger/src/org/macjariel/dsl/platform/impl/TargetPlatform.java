package org.macjariel.dsl.platform.impl;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.platform.ITargetPlatformFactory;

public class TargetPlatform {

	static final String ATT_ID = "id";
	static final String ATT_NAME = "name";
	static final String ATT_CLASS = "class";

	/** An instance that represents unknown target platform. */
	public static final TargetPlatform UNKNOWN = new TargetPlatform() {
		@Override
		public ITargetPlatformFactory getFactory() {
			return null;
		}
	};

	private final IConfigurationElement configElement;
	private final String id;
	private final String name;
	private ITargetPlatformFactory factory;

	public TargetPlatform(IConfigurationElement configElem) {
		configElement = configElem;
		id = getAttribute(configElem, ATT_ID, null);
		name = getAttribute(configElem, ATT_NAME, id);
		getAttribute(configElem, ATT_CLASS, null);
	}

	private TargetPlatform() {
		this.id = "Unknown";
		this.name = "Unknown";
		this.configElement = null;
	}

	private static String getAttribute(IConfigurationElement configElem,
			String name, String defaultValue) {
		String value = configElem.getAttribute(name);
		if (value != null)
			return value;
		if (defaultValue != null)
			return defaultValue;
		throw new IllegalArgumentException("Missing " + name + " attribute");
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ITargetPlatformFactory getFactory() {
		if (factory != null)
			return factory;

		try {
			factory = (ITargetPlatformFactory) configElement
					.createExecutableExtension(ATT_CLASS);
		} catch (CoreException e) {
			DSLDebuggerLog.logError("Failed to instantiate factory: "
					+ configElement.getAttribute(ATT_CLASS)
					+ " in type: "
					+ id
					+ " in plugin: "
					+ configElement.getDeclaringExtension()
							.getNamespaceIdentifier(), e);
		}
		return factory;
	}
	
	public void dispose() {
		if (factory == null) return;
		factory.dispose();
		factory = null;
	}
}
