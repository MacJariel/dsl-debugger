package org.macjariel.dsl.debugger.model;

import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;

public class DslDebugElementFactory implements IDslDebugElementFactory {

	@Override
	public IStackFrame createStackFrame(IDebugTarget dslDebugTarget, IThread thread,
			IResource resource, int lineNumber, int charStart, int charEnd, String stackFrameText) {
		return new DSLStackFrame(dslDebugTarget, (DSLThread) thread, resource, lineNumber,
				charStart, charEnd, stackFrameText);
	}

}
