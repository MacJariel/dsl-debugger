package org.macjariel.dsl.debugger.model;

import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IThread;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping.IItem;

public interface IStackFrameFactory<T extends IDSLStackFrame> {

	/**
	 * Constructs a DSL stack frame.
	 * 
	 * @return
	 */
	T createStackFrame(IDebugTarget dslDebugTarget, IThread thread, IItem mappingItem);

	void updateStackFrame(IDebugTarget dslDebugTarget, IThread thread, T stackFrame, IItem mappingItem);
	
	boolean stackFrameEquals(T stackFrame, IItem mappingItem);
	
}
