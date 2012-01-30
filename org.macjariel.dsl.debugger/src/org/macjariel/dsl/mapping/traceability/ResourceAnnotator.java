package org.macjariel.dsl.mapping.traceability;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.internal.mapping.SourceTargetMappingItemImpl;
import org.macjariel.dsl.mapping.IMappingManager;
import org.macjariel.dsl.mapping.ISourceTargetMapping;

/**
 * This class can annotate resources in the editor, so that one can conveniently
 * visualize given DSL2GPL mapping.
 * 
 * TODO: Remove dependency on UI classes (MarkerUtilities).
 * 
 * @author MacJariel
 * 
 */
public class ResourceAnnotator {

	private final ISourceTargetMapping mapping;

	private final Set<IResource> annotatedResources = new HashSet<IResource>();

	public ResourceAnnotator(IMappingManager mappingManager) {
		this.mapping = mappingManager.getSourceTargetMapping();
	}

	public void clearMarkers() {
		for (ISourceTargetMapping.IItem item : mapping.getAllMappingItems()) {
			annotatedResources.add(item.getSourceFile());
			annotatedResources.add(item.getTargetFile());
		}

		Iterator<IResource> it = annotatedResources.iterator();
		while (it.hasNext()) {
			IResource res = it.next();
			try {
				IMarker[] markers = res.findMarkers(DSLDebuggerPlugin.DSL_CODE_MARKER, false,
						IResource.DEPTH_INFINITE);
				for (IMarker marker : markers) {
					marker.delete();
				}
				markers = res.findMarkers(DSLDebuggerPlugin.GPL_CODE_MARKER, false,
						IResource.DEPTH_INFINITE);
				for (IMarker marker : markers) {
					marker.delete();
				}

			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		annotatedResources.clear();
	}

	public void annotateResources() {
		clearMarkers();
		for (ISourceTargetMapping.IItem item : mapping.getAllMappingItems()) {
			try {
				HashMap<String, Object> attributes = new HashMap<String, Object>();
				MarkerUtilities.setLineNumber(attributes, item.getSourceStartLine());
				MarkerUtilities.setCharStart(attributes, item.getSourceCharStart());
				MarkerUtilities.setCharEnd(attributes, item.getSourceCharEnd());

				String message = "Lines: " + item.getSourceStartLine() + ":"
						+ item.getSourceEndLine() + ", Chars: " + item.getSourceCharStart() + ":"
						+ item.getSourceCharEnd();

				MarkerUtilities.setMessage(attributes, message);

				MarkerUtilities.createMarker(item.getSourceFile(), attributes,
						DSLDebuggerPlugin.DSL_CODE_MARKER);
			} catch (CoreException e) {
				e.printStackTrace();
			}

			if (!(item instanceof SourceTargetMappingItemImpl)
					|| ((SourceTargetMappingItemImpl) item).showTargetAnnotation) {

				try {
					HashMap<String, Object> attributes = new HashMap<String, Object>();
					MarkerUtilities.setLineNumber(attributes, item.getTargetStartLine());
					MarkerUtilities.setCharStart(attributes, item.getTargetCharStart());
					MarkerUtilities.setCharEnd(attributes, item.getTargetCharEnd());

					String message = "Lines: " + item.getTargetStartLine() + ":"
							+ item.getTargetEndLine() + ", Chars: " + item.getTargetCharStart()
							+ ":" + item.getTargetCharEnd();

					if (item instanceof SourceTargetMappingItemImpl) {
						message += ", Object: "
								+ ((SourceTargetMappingItemImpl) item).targetAnnotationObject;
					}

					MarkerUtilities.setMessage(attributes, message);

					MarkerUtilities.createMarker(item.getTargetFile(), attributes,
							DSLDebuggerPlugin.GPL_CODE_MARKER);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
