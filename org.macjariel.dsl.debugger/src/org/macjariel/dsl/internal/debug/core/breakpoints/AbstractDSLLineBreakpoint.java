package org.macjariel.dsl.internal.debug.core.breakpoints;

import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.debug.core.IDSLDebugTarget;
import org.macjariel.dsl.debug.core.IDSLLineBreakpoint;
import org.macjariel.dsl.xtext.XtextDslModelHelper;

public abstract class AbstractDSLLineBreakpoint extends LineBreakpoint implements
		IDSLLineBreakpoint {

	protected static final boolean LOGGING = true;

	/**
	 * Breakpoint attribute storing a semantic element associated with the
	 * breakpoint (value
	 * <code> "org.macjariel.dsl.debug.core.semanticElement" </code>). This
	 * attribute is stored as a <code>string</code> with URI to the semantic
	 * element.
	 */
	protected static final String SEMANTIC_ELEMENT = "org.macjariel.dsl.debug.core.semanticElement";

	/**
	 * Breakpoint attribute storing whether GPL breakpoints should be registered
	 * to the BreakpointManager (value
	 * <code> ""org.macjariel.dsl.debug.core.registerGplBreakpoint" </code>). This
	 * attribute is stored as a <code>boolean</code>.
	 */
	protected static final String REGISTER_GPL_BREAKPOINT =
			"org.macjariel.dsl.debug.core.registerGplBreakpoint";

	/**
	 * Semantic element in the DSL semantic model that this line breakpoint is
	 * attached to.
	 */
	private EObject semanticElement;

	public AbstractDSLLineBreakpoint() {
	}

	protected AbstractDSLLineBreakpoint(final IResource resource, final EObject semanticElement,
			final boolean register, final boolean registerGplBreakpoint, final Map<String, Object> attributes, final String markerType)
			throws CoreException {

		IWorkspaceRunnable wr = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {

				// get location of semantic element
				final ICompositeNode semanticElementNode = NodeModelUtils.getNode(semanticElement);
				final int lineNumber = semanticElementNode.getStartLine();
				final int charStart = semanticElementNode.getOffset();
				final int charEnd =
						semanticElementNode.getOffset() + semanticElementNode.getLength();

				// create the marker
				setMarker(resource.createMarker(markerType));

				// add attributes
				addLineBreakpointAttributes(attributes, getModelIdentifier(), true, lineNumber,
						charStart, charEnd);

				addSemanticElementAttribute(attributes, semanticElement);

				attributes.put(REGISTER_GPL_BREAKPOINT, registerGplBreakpoint);

				ensureMarker().setAttributes(attributes);

				// add to breakpoint manager if requested
				register(register);
			}
		};
		run(getMarkerRule(resource), wr);

		if (register) {
			createGplBreakpoint();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.core.model.IBreakpoint#getModelIdentifier()
	 */
	@Override
	public String getModelIdentifier() {
		return DSLDebuggerPlugin.DSL_DEBUG_MODEL_ID;
	}

	@Override
	public boolean getRegisterGplBreakpointFlag() throws CoreException {
		return ensureMarker().getAttribute(REGISTER_GPL_BREAKPOINT, false);
	}

	@Override
	public void setRegisterGplBreakpointFlag(boolean flag) throws CoreException {
		if (getRegisterGplBreakpointFlag() != flag) {
			setAttribute(REGISTER_GPL_BREAKPOINT, "");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (getMarker() == null)
			return this.getClass().getName() + " w/o marker";

		int lineNumber = 0;
		try {
			lineNumber = getLineNumber();
		} catch (CoreException e) {
			DSLDebuggerLog.log(e);
		}
		return getMarker().getResource().getName() + ": " + String.valueOf(lineNumber);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.macjariel.dsl.debugger.core.IDSLBreakpoint#installGplBreakpoint(org
	 * .eclipse.debug.core.model.IDebugTarget)
	 */
	@Override
	public void installGplBreakpoint(IDSLDebugTarget dslDebugTarget) throws CoreException {
		createGplBreakpoint();

		// updateGplBreakpoint(gplDebugTarget);

		// Unregistered breakpoints need to be manually added to debug target.
		if (getRegisterGplBreakpointFlag() == false) {
			dslDebugTarget.getGplDebugTarget().breakpointAdded(getGplBreakpoint());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.macjariel.dsl.debugger.core.IDSLBreakpoint#uninstallGplBreakpoint
	 * (org.eclipse.debug.core.model.IDebugTarget)
	 */
	@Override
	public void uninstallGplBreakpoint(IDSLDebugTarget dslDebugTarget) throws CoreException {
		if (getRegisterGplBreakpointFlag() == false) {
			dslDebugTarget.getGplDebugTarget().breakpointRemoved(getGplBreakpoint(), null);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.core.model.Breakpoint#delete()
	 */
	@Override
	public void delete() throws CoreException {
		deleteGplBreakpoint();
		super.delete();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.macjariel.dsl.debugger.core.IDSLLineBreakpoint#getSemanticElement()
	 */
	@Override
	public EObject getSemanticElement() throws CoreException {
		URI semanticElementURI = URI.createURI(ensureMarker().getAttribute(SEMANTIC_ELEMENT, ""));
		if (semanticElementURI == null) {
			DSLDebuggerLog
					.logError("DSLBreakpoint's marker doesn't contain semantic element. DSLBreakpoint: "
							+ this);
		}

		if (semanticElement == null
				|| !getSemanticElementURI(semanticElement).equals(semanticElementURI)) {
			// SemanticElement is not initialized or needs to be initialized
			// again (it might change)
			ResourceSet rs = XtextDslModelHelper.XTEXT_RESOURCE_SET;
			semanticElement = rs.getEObject(semanticElementURI, true);

		}
		return semanticElement;
	}

	/**
	 * Add this breakpoint to the breakpoint manager, or sets it as
	 * unregistered.
	 */
	protected void register(boolean register) throws CoreException {
		DebugPlugin plugin = DebugPlugin.getDefault();
		if (plugin != null && register) {
			plugin.getBreakpointManager().addBreakpoint(this);
		} else {
			setRegistered(false);
		}
	}

	/**
	 * Adds the standard attributes of a DSL line breakpoint to the given
	 * attribute map. The standard attributes are:
	 * <ol>
	 * <li>IBreakpoint.ID</li>
	 * <li>IBreakpoint.ENABLED</li>
	 * <li>IMarker.LINE_NUMBER</li>
	 * <li>IMarker.CHAR_START</li>
	 * <li>IMarker.CHAR_END</li>
	 * <li>DSLLineBreakpoint.SEMANTIC_ELEMENT</li>
	 * </ol>
	 * 
	 */
	protected static void addLineBreakpointAttributes(Map<String, Object> attributes,
			String modelIdentifier, boolean enabled, int lineNumber, int charStart, int charEnd) {
		attributes.put(IBreakpoint.ID, modelIdentifier);
		attributes.put(IBreakpoint.ENABLED, Boolean.valueOf(enabled));
		attributes.put(IMarker.LINE_NUMBER, new Integer(lineNumber));
		attributes.put(IMarker.CHAR_START, new Integer(charStart));
		attributes.put(IMarker.CHAR_END, new Integer(charEnd));

		// TODO: this was used to handle message of DSL breakpoints
		// marker.setAttribute(IMarker.MESSAGE, "DSL Line breakpoint: "
		// + resource.getName() + " [line: " + (lineNumber) + "]");

	}

	protected static void addSemanticElementAttribute(Map<String, Object> attributes,
			EObject semanticElement) {
		attributes.put(SEMANTIC_ELEMENT, getSemanticElementURI(semanticElement).toString());
	}

	private static URI getSemanticElementURI(EObject semanticElement) {
		Resource semanticElementRes = semanticElement.eResource();
		return semanticElementRes.getURI().appendFragment(
				semanticElementRes.getURIFragment(semanticElement));
	}

	abstract protected void createGplBreakpoint() throws CoreException;

	abstract protected void deleteGplBreakpoint() throws CoreException;

	abstract protected void updateGplBreakpoint(IDebugTarget gplDebugTarget) throws CoreException;

	abstract protected IBreakpoint getGplBreakpoint();
}
