package org.macjariel.dsl.mapping;

import java.util.List;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.macjariel.dsl.internal.debug.core.IDSLStackFrame;
import org.macjariel.dsl.internal.debug.core.IStackFrameFactory;

/**
 * 
 * @author MacJariel
 * 
 */
public interface ICallStackMapping {

	/**
	 * Updates call stack of the DSL program according to the call stack of the
	 * GPL program. The method should update the DSL stack frame.
	 * 
	 * @param <T>
	 * 
	 * @param dslDebugTarget
	 *            debug target of the DSL Debugger
	 * @param dslThread
	 *            DSL thread, whose call stack will be updated
	 * @param dslStackFrames
	 *            the list of stack frames that represents the current DSL
	 *            stack, this list will be updated.
	 * @param gplStackFrames
	 *            the array of stack frames that represents the current GPL
	 *            stack
	 * @throws DebugException
	 *             Can throw {@link DebugException} in case that
	 */
	public <T extends IDSLStackFrame> void updateStackFrames(IDebugTarget dslDebugTarget,
			IThread dslThread, List<T> dslStackFrames, IStackFrame[] gplStackFrames,
			IStackFrameFactory<T> stackFrameFactory) throws DebugException;

}
