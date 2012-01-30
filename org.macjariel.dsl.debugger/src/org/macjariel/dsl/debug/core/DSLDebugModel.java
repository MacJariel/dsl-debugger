package org.macjariel.dsl.debug.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.internal.debug.core.DSLStackFrame;
import org.macjariel.dsl.internal.debug.core.DSLThread;
import org.macjariel.dsl.internal.debug.core.breakpoints.DSLLineBreakpoint;
import org.macjariel.dsl.mapping.ISourceTargetMapping.IItem;

public class DSLDebugModel {

	/**
	 * Not to be instantiated.
	 */
	private DSLDebugModel() {
		super();
	}

	/**
	 * Returns the identifier for the JDI debug model plug-in
	 * 
	 * @return plug-in identifier
	 */
	public static String getPluginIdentifier() {
		return DSLDebuggerPlugin.PLUGIN_ID;
	}

	/**
	 * Creates and returns a DSL line breakpoint at the line of the given
	 * semantic element. The marker associated with the breakpoint will be
	 * created on the specified resource.
	 * 
	 * @param resource
	 *            the resource on which to create the associated breakpoint
	 *            marker
	 * @param semanticElement
	 *            the element of the semantic model on which the breakpoint will
	 *            be installed
	 * @param registerDSL
	 *            whether to add this breakpoint to the breakpoint manager
	 * @param registerGPL
	 *            whether to add the corresponding GPL breakpoint to the
	 *            breakpoint manager
	 * @param attributes
	 *            a map of client defined attributes that should be assigned to
	 *            the underlying breakpoint marker on creation, or
	 *            <code>null</code> if none.
	 * 
	 * @return a DSL line breakpoint
	 * 
	 * @throws CoreException
	 *             If this method fails. Reasons include:
	 *             <ul>
	 *             <li>Failure creating underlying marker. The exception's
	 *             status contains the underlying exception responsible for the
	 *             failure.</li>
	 *             </ul>
	 */
	public static IDSLLineBreakpoint createLineBreakpoint(final IResource resource,
			final EObject semanticElement, final boolean registerDSL, final boolean registerGPL,
			Map<String, Object> attributes) throws CoreException {
		if (attributes == null) {
			attributes = new HashMap<String, Object>(10);
		}
		return new DSLLineBreakpoint(resource, semanticElement, registerDSL, registerGPL,
				attributes);
	}

	public static IDSLStackFrame createStackFrame(IDebugTarget dslDebugTarget, IThread thread,
			IItem mappingItem) {
		return new DSLStackFrame(dslDebugTarget, (DSLThread) thread,
				mappingItem.getSemanticElement(), mappingItem.getSourceFile(),
				mappingItem.getSourceStartLine(), mappingItem.getSourceCharStart(),
				mappingItem.getSourceCharEnd(), mappingItem.getSourceSubroutineName());
	}

	public static void updateStackFrame(IDebugTarget dslDebugTarget, IThread thread,
			IDSLStackFrame stackFrame, IItem mappingItem) {
		Assert.isTrue(stackFrame.getDebugTarget().equals(dslDebugTarget));
		Assert.isTrue(stackFrame.getThread().equals(thread));

		((DSLStackFrame) stackFrame).update(mappingItem.getSemanticElement(),
				mappingItem.getSourceFile(), mappingItem.getSourceStartLine(),
				mappingItem.getSourceCharStart(), mappingItem.getSourceCharEnd(),
				mappingItem.getSourceSubroutineName());
	}

	public static boolean stackFrameEquals(IDSLStackFrame stackFrame, IItem mappingItem) {
		return stackFrame.getSemanticElement().equals(mappingItem.getSemanticElement());
	}

}
