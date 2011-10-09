package org.macjariel.dsl.debugger.traceability;

import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.texteditor.MarkerUtilities;
import org.macjariel.dsl.debugger.DSLDebuggerPlugin;
import org.macjariel.dsl.debugger.traceability.TotalMapping.TotalMappingItem;

/**
 * This class can annotate resources in the editor, so that one can conveniently
 * visualize given DSL2GPL mapping.
 * 
 * TODO: Remove dependency on UI classes (MarkerUtilities).
 * @author MacJariel
 * 
 */
public class ResourceAnnotator {

	private final SourceTargetMapping mapping;

	public ResourceAnnotator(SourceTargetMapping mapping) {
		this.mapping = mapping;
	}

	public void annotateResources() {
		// TODO: Improve the SourceTargetMapping interface, so we can do this
		// generally
		if (mapping instanceof TotalMapping == false) {
			throw new RuntimeException(
					"Cannot annotate resources using other maping than TotalMapping.");
		}

		TotalMapping totalMapping = (TotalMapping) mapping;

		for (TotalMappingItem item : totalMapping.items) {
			try {
				HashMap<String, Object> attributes = new HashMap<String, Object>();
				MarkerUtilities.setLineNumber(attributes, item.sourceStartLine);
				MarkerUtilities.setCharStart(attributes, item.sourceStartOffset);
				MarkerUtilities.setCharEnd(attributes, item.sourceEndOffset);

				String message = "Lines: " + item.sourceStartLine + ":" + item.sourceEndLine
						+ ", Chars: " + item.sourceStartOffset + ":" + item.sourceEndOffset;

				MarkerUtilities.setMessage(attributes, message);

				MarkerUtilities.createMarker(item.sourceFile, attributes,
						DSLDebuggerPlugin.DSL_CODE_MARKER);

			} catch (CoreException e) {
				e.printStackTrace();
			}
			
			try {
				HashMap<String, Object> attributes = new HashMap<String, Object>();
				MarkerUtilities.setLineNumber(attributes, item.targetStartLine);
				MarkerUtilities.setCharStart(attributes, item.targetStartOffset);
				MarkerUtilities.setCharEnd(attributes, item.targetEndOffset);

				String message = "Lines: " + item.targetStartLine + ":" + item.targetEndLine
						+ ", Chars: " + item.targetStartOffset + ":" + item.targetEndOffset;

				MarkerUtilities.setMessage(attributes, message);

				MarkerUtilities.createMarker(item.targetFile, attributes,
						DSLDebuggerPlugin.GPL_CODE_MARKER);

			} catch (CoreException e) {
				e.printStackTrace();
			}
			

		}

	}

}
