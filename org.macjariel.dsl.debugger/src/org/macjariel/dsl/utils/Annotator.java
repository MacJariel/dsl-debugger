package org.macjariel.dsl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.utils.XtextNodeHelper.PositionInfo;

/**
 * @todo Give better name to this class.
 * @author MacJariel
 * 
 */
public class Annotator {

	public static final String MARKER = DSLDebuggerPlugin.PLUGIN_ID + ".debugAnnotationMarker"; //$NON-NLS-1$

	private List<IMarker> markers = new ArrayList<IMarker>();

	public void addAnnotation(EObject semanticElement, String text) {
		INode node = NodeModelUtils.getNode(semanticElement);
		if (node == null)
			return;

		URI semanticElementURI = CommonPlugin.resolve(semanticElement.eResource().getURI());
		final IFile file = ResourcesPlugin.getWorkspace().getRoot()
				.getFileForLocation(new Path(semanticElementURI.toFileString()));

		PositionInfo res = XtextNodeHelper.stripWhitespaces(node, file);

		final HashMap<String, Object> attributes = new HashMap<String, Object>();
		MarkerUtilities.setLineNumber(attributes, res.startLine);
		MarkerUtilities.setCharStart(attributes, res.startChar);
		MarkerUtilities.setCharEnd(attributes, res.endChar);

		String message = text + " [" + semanticElement.toString() + "]";
		MarkerUtilities.setMessage(attributes, message);


		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IMarker marker = file.createMarker(MARKER);
				marker.setAttributes(attributes);
				markers.add(marker);
			}
		};

		try {
			file.getWorkspace().run(r, null, IWorkspace.AVOID_UPDATE, null);
		} catch (CoreException e) {
			DSLDebuggerLog.log(e);
		}
	}
	
	public void addAnnotation(Collection<EObject> semanticElements, String text) {
		for (EObject semanticElement: semanticElements)
			addAnnotation(semanticElement, text);
	}

	public void clearAnnotations() {
		for (Iterator<IMarker> it = markers.iterator(); it.hasNext();) {
			try {
				IMarker marker = it.next();
				marker.delete();
			} catch (CoreException e) {
				DSLDebuggerLog.log(e);
			} finally {
				it.remove();
			}
		}

	}

}
