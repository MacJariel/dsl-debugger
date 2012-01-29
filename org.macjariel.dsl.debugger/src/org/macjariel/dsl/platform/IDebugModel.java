package org.macjariel.dsl.platform;

import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.IThread;

/**
 * Provides utility methods for creating debug targets and breakpoints specific
 * to a debug model.
 * 
 * @author MacJariel
 * 
 */
public interface IDebugModel {
	ILineBreakpoint createLineBreakpoint(IResource resource, String typeName, int lineNumber,
			int charStart, int charEnd, int hitCount, boolean register, Map<String, Object> attributes) throws CoreException;

	/**
	 * Returns whether the thread is an user thread of given GPL.
	 * @param thread
	 * @return
	 */
	boolean isUserThread(IThread thread) throws DebugException;
}
