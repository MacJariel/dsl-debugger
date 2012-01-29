package org.macjariel.dsl.internal.debug.core;

import org.eclipse.core.runtime.Assert;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IThread;
import org.macjariel.dsl.mapping.ISourceTargetMapping.IItem;

public enum DSLStackFrameFactory implements IStackFrameFactory<DSLStackFrame> {
	INSTANCE;

	@Override
	public DSLStackFrame createStackFrame(IDebugTarget dslDebugTarget, IThread thread,
			IItem mappingItem) {
		return new DSLStackFrame(dslDebugTarget, (DSLThread) thread,
				mappingItem.getSemanticElement(), mappingItem.getSourceFile(),
				mappingItem.getSourceStartLine(), mappingItem.getSourceCharStart(),
				mappingItem.getSourceCharEnd(), mappingItem.getSourceSubroutineName());
	}

	@Override
	public void updateStackFrame(IDebugTarget dslDebugTarget, IThread thread,
			DSLStackFrame stackFrame, IItem mappingItem) {
		Assert.isTrue(stackFrame.getDebugTarget().equals(dslDebugTarget));
		Assert.isTrue(stackFrame.getThread().equals(thread));
		stackFrame.update(mappingItem.getSemanticElement(), mappingItem.getSourceFile(),
				mappingItem.getSourceStartLine(), mappingItem.getSourceCharStart(),
				mappingItem.getSourceCharEnd(), mappingItem.getSourceSubroutineName());
	}

	@Override
	public boolean stackFrameEquals(DSLStackFrame stackFrame, IItem mappingItem) {
		return stackFrame.getSemanticElement().equals(mappingItem.getSemanticElement());
	}
}
