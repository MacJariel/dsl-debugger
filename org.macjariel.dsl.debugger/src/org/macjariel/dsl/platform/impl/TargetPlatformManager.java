package org.macjariel.dsl.platform.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.platform.ITargetPlatformFactory;

public class TargetPlatformManager {

	/** Target Platforms extension point element name (targetPlatform) */
	private static final String ELEMENT_TARGET_PLATFORM = "targetPlatform";

	private static TargetPlatform[] cachedTargetPlatforms;

	public static TargetPlatform[] getTargetPlatforms() {
		if (cachedTargetPlatforms != null)
			return cachedTargetPlatforms;

		IExtension[] extensions = Platform
				.getExtensionRegistry()
				.getExtensionPoint(DSLDebuggerPlugin.PLUGIN_ID,
						"targetPlatforms").getExtensions();

		List<TargetPlatform> targetPlatforms = new ArrayList<TargetPlatform>();
		targetPlatforms.add(TargetPlatform.UNKNOWN);
		
		for (IExtension extension : extensions) {
			for (IConfigurationElement configElement : extension
					.getConfigurationElements()) {
				TargetPlatform proxy = parseTargetPlatform(configElement);
				if (proxy != null)
					targetPlatforms.add(proxy);

			}
		}
		cachedTargetPlatforms = targetPlatforms
				.toArray(new TargetPlatform[targetPlatforms.size()]);
		return cachedTargetPlatforms;
	}
	
	public static ITargetPlatformFactory getTargetPlatformFactory(String targetPlatformId)
	{
		for (TargetPlatform targetPlatform : getTargetPlatforms()) {
			if (targetPlatform.getId().equals(targetPlatformId))
				return targetPlatform.getFactory();
		}
		throw new IllegalArgumentException("Missing Target Platform " + targetPlatformId);
	}

	public static void disposeTargetPlatforms() {
		if (cachedTargetPlatforms == null) return;
		for (TargetPlatform targetPlatform : cachedTargetPlatforms) {
			targetPlatform.dispose();
		}
		cachedTargetPlatforms = null;
	}
	
	private static TargetPlatform parseTargetPlatform(
			IConfigurationElement configElement) {
		if (!configElement.getName().equals(ELEMENT_TARGET_PLATFORM))
			return null;
		try {
			return new TargetPlatform(configElement);
		} catch (Exception e) {
			String name = configElement.getAttribute(TargetPlatform.ATT_NAME);
			if (name == null)
				name = "[missing name attribute]";
			String msg = "Failed to load targetPlatform named "
					+ name
					+ " in "
					+ configElement.getDeclaringExtension()
							.getNamespaceIdentifier();
			DSLDebuggerLog.logError(msg, e);
			return null;
		}
	}

}
