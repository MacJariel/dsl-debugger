package org.macjariel.dsl.debugger.model;

import org.eclipse.debug.core.model.ISourceLocator;
import org.eclipse.debug.core.model.IStackFrame;

public class DSLSourceLocator implements ISourceLocator {

	private ISourceLocator gplSourceLocator;

	public DSLSourceLocator(ISourceLocator gplSourceLocator) {
		this.gplSourceLocator = gplSourceLocator;
	}

	@Override
	public Object getSourceElement(IStackFrame stackFrame) {
		if (stackFrame instanceof DSLStackFrame) {
			// TODO: return something reasonable, like filename (or inspire in java impl.)
			return stackFrame;

		} else if (this.gplSourceLocator != null) {
			return this.gplSourceLocator.getSourceElement(stackFrame);
		}
		return null;
	}

}
