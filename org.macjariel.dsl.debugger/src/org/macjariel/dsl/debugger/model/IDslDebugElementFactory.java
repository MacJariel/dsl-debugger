package org.macjariel.dsl.debugger.model;

import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;

public interface IDslDebugElementFactory {

	/**
	 * Constructs a DSL stack frame.
	 * 
	 * @param dslDebugTarget dslDebugTarget
	 * @param thread thread that will own this stack frame
	 * @param resource resource (IFile) that will represent this stack frame
	 * @param lineNumber line in the resource
	 * @param charStart starting offset in the resource
	 * @param charEnd ending offset in the resource
	 * @param stackFrameText text that should be displayed on the stack frame
	 * @return
	 */
	IStackFrame createStackFrame(IDebugTarget dslDebugTarget, IThread thread, IResource resource, int lineNumber,
	int charStart, int charEnd, String stackFrameText);
	
}
