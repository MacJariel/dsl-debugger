package org.macjariel.dsl.debug.core;

import java.util.List;

import org.eclipse.debug.core.model.IThread;

public interface IDSLThread extends IThread, IDSLDebugElement {

	IThread getGplThread();
	
	List<? extends IDSLStackFrame> getDSLStackFrames();
	
	ISteppingStrategy getSteppingStrategy();
	
	void setSteppingStrategy(ISteppingStrategy steppingStrategy);
	
	void setStepping(boolean stepping);
}
