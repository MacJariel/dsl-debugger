package org.macjariel.dsl.debugger.java.impl;

import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.eclipse.jdt.debug.core.JDIDebugModel;
import org.macjariel.dsl.debugger.platform.IDebugModel;

public class JDIDebugModelAdaptor implements IDebugModel {

	@Override
	public ILineBreakpoint createLineBreakpoint(IResource resource, String typeName,
			int lineNumber, int charStart, int charEnd, int hitCount, boolean register,
			Map<String, Object> attributes) throws CoreException {
		return JDIDebugModel.createLineBreakpoint(resource, typeName, lineNumber, charStart,
				charEnd, hitCount, register, attributes);
	}

	@Override
	public boolean isUserThread(IThread thread) throws DebugException {
		if (thread instanceof IJavaThread) {
			return !((IJavaThread)thread).isSystemThread();
		}
		return false;
	}

}
