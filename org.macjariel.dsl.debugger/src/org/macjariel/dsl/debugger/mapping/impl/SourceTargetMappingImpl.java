package org.macjariel.dsl.debugger.mapping.impl;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.eclipse.acceleo.traceability.GeneratedFile;
import org.eclipse.acceleo.traceability.GeneratedText;
import org.eclipse.acceleo.traceability.InputElement;
import org.eclipse.acceleo.traceability.TraceabilityModel;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.macjariel.dsl.debugger.DSLDebuggerLog;
import org.macjariel.dsl.debugger.mapping.IMappingManager;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementTypesModel;
import org.macjariel.dsl.debugger.models.utils.ModuleElementTypesModelHelper;
import org.macjariel.dsl.debugger.traceability.SemanticElementType;
import org.macjariel.dsl.debugger.traceability.TraceabilityModelHelper;

/**
 * The class provides a mapping from any element in DSL program model to lists
 * of regions in generated files. It also contains convenience methods to obtain
 * generated text.
 * 
 * TODO: This class looks very ugly, TO BE REFACTORED.
 * 
 * @author MacJariel
 * 
 */
public class SourceTargetMappingImpl implements ISourceTargetMapping {

	private EObject dslProgramModel;

	private TraceabilityModel traceabilityModel;
	private ModuleElementTypesModel moduleElementTypesModel;

	private IMappingManager mappingManager;

	// TODO: make private
	private Vector<SourceTargetMappingItemImpl> items = new Vector<SourceTargetMappingItemImpl>();

	public SourceTargetMappingImpl(IMappingManager mappingManager, EObject dslProgramModel,
			EObject traceabilityModel, EObject moduleElementTypesModel) {
		this.mappingManager = mappingManager;

		this.dslProgramModel = dslProgramModel;
		this.traceabilityModel = (TraceabilityModel) traceabilityModel;
		this.moduleElementTypesModel = (ModuleElementTypesModel) moduleElementTypesModel;
		initMapping();
	}

	public void clearMapping() {
		items.clear();
	}

	public void initMapping() {
		TreeIterator<EObject> iter = EcoreUtil.getAllProperContents(dslProgramModel, false);
		while (iter.hasNext()) {
			EObject sourceElement = iter.next();

			Set<SemanticElementType> SemanticElementTypes = getElementType(sourceElement);
			if (SemanticElementTypes == null)
				continue;

			SourceTargetMappingItemImpl item = new SourceTargetMappingItemImpl();

			NodeModelUtils.getNode(sourceElement);

			item.fillSource(sourceElement, SemanticElementTypes);

			InputElement[] associatedInputElements = TraceabilityModelHelper
					.getAssociatedInputElements(sourceElement, traceabilityModel);
			Vector<GeneratedText> generatedTexts = new Vector<GeneratedText>();
			if (associatedInputElements.length > 0) {
				for (GeneratedFile gFile : traceabilityModel.getGeneratedFiles()) {
					for (GeneratedText gText : gFile.getGeneratedRegions()) {
						for (InputElement inputElement : associatedInputElements) {
							if (gText.getSourceElement() == inputElement) {
								// ModuleElement m = gText.getModuleElement();
								// EObject me = m.getModuleElement();

								generatedTexts.add(gText);
							}
						}
					}
				}
			}

			boolean joinConsecutiveRegions = false;
			if (joinConsecutiveRegions) {

				Collections.sort(generatedTexts);

				GeneratedFile gFile = null;
				int startOffset = 0;
				int endOffset = 0;

				for (GeneratedText gText : generatedTexts) {
					if (gFile == gText.getOutputFile() && endOffset == gText.getStartOffset()) {
						// This region connects to the previous one
						endOffset = gText.getEndOffset();

					} else {
						if (gFile != null) {
							SourceTargetMappingItemImpl newItem = (SourceTargetMappingItemImpl) item
									.clone();
							boolean isValid = newItem.fillTarget(gFile, startOffset, endOffset);
							if (isValid)
								putItem(newItem);
						}

						gFile = gText.getOutputFile();
						startOffset = gText.getStartOffset();
						endOffset = gText.getEndOffset();
					}
				}

				if (gFile != null) {
					boolean isValid = item.fillTarget(gFile, startOffset, endOffset);
					if (isValid)
						putItem(item);
				}
			} else {
				for (GeneratedText gText : generatedTexts) {
					SourceTargetMappingItemImpl newItem = (SourceTargetMappingItemImpl) item
							.clone();
					boolean isValid = newItem.fillTarget(gText.getOutputFile(),
							gText.getStartOffset(), gText.getEndOffset());
					if (isValid)
						putItem(newItem);

					if (gText.getModuleElement().getModuleElement().toString().equals("'this'")) {
						System.out.println("break");
					}

					Set<ModuleElementType> types = ModuleElementTypesModelHelper
							.getTypesForModuleElement(moduleElementTypesModel,
									gText.getModuleElement());
					if (types.contains(ModuleElementType.STATEMENT)) {
						newItem.showTargetAnnotation = true;
					}
					newItem.moduleElement = gText.getModuleElement().getModuleElement();
					newItem.targetAnnotationObject = newItem.moduleElement;

				}
			}
		}
	}

	// TODO: convenience method, to be removed probably
	/*
	 * private void printRegion(GeneratedFile gFile, int startOffset, int
	 * endOffset) { System.out.println("**** Region: [" + startOffset + " - " +
	 * endOffset + "], [" + gFile.getName() + "]");
	 * 
	 * try { URI targetURI = new URI("file", gFile.getPath(), "");
	 * IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot(); IFile[]
	 * files = root.findFilesForLocationURI(targetURI); assert (files.length <=
	 * 1); if (files.length == 0) {
	 * System.out.println("Error: cannot find target file!"); } else { char[]
	 * buffer = new char[endOffset - startOffset + 2]; InputStreamReader isr =
	 * new InputStreamReader(files[0].getContents()); isr.skip(startOffset);
	 * isr.read(buffer, 0, endOffset - startOffset); System.out.println(buffer);
	 * } } catch (URISyntaxException e) { e.printStackTrace(); } catch
	 * (CoreException e) { e.printStackTrace(); } catch (IOException e) {
	 * e.printStackTrace(); } }
	 */

	private void putItem(SourceTargetMappingItemImpl item) {
		items.add(item);

		// DEBUG - add markers

		IMarker dslMarker;
		try {
			// dslMarker =
			// item.sourceFile.createMarker(DSLDebuggerPlugin.DSL_CODE_MARKER);
			// HashMap<String, Object> hashMap = new HashMap<String, Object>();

			dslMarker = item.sourceFile.createMarker(IMarker.TEXT);
			dslMarker.setAttribute(IMarker.LINE_NUMBER, item.sourceStartLine);
			dslMarker.setAttribute(IMarker.CHAR_START, item.sourceStartOffset);
			dslMarker.setAttribute(IMarker.CHAR_END, item.sourceEndOffset);
			String text = "Lines: " + item.sourceStartLine + ":" + item.sourceEndLine + ", Chars: "
					+ item.sourceStartOffset + ":" + item.sourceEndOffset;

			dslMarker.setAttribute(IMarker.TEXT, text);
			dslMarker.setAttribute(IMarker.MESSAGE, text);

		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the set containing element types of the given source element, or
	 * null if source element's metaclass does not have the right annotation.
	 * 
	 * @param sourceElement
	 * @return
	 */
	static Set<SemanticElementType> getElementType(EObject sourceElement) {
		EAnnotation dslAnnotation = sourceElement.eClass().getEAnnotation(
				TraceabilityModelHelper.DSL_DEBUGGER_ANNOTATION_SOURCE);
		if (dslAnnotation == null) {
			return null;
		} else {
			return SemanticElementType.create(dslAnnotation.getDetails().get("type"));
		}
	}

	public ISourceTargetMapping.IItem findMappingForSourceElement(EObject sourceElement) {
		for (SourceTargetMappingItemImpl item : items) {
			if (item.semanticElement.equals(sourceElement))
				return item;
		}
		return null;
	}

	public void debugPrint() {
		for (SourceTargetMappingItemImpl item : items) {
			item.debugPrint();
		}
	}

	@Override
	public IItem lookupSourceElement(IResource resource, int lineNumber, int charStart, int charEnd) {

		List<SourceTargetMappingItemImpl> resultItems = new Vector<SourceTargetMappingItemImpl>();

		for (SourceTargetMappingItemImpl item : this.items) {

			if (resource.equals(item.targetFile) == false) {
				continue;
			}

			// / TODO: this is not working yet - continue here
			if (lineNumber >= item.targetStartLine && lineNumber <= item.targetEndLine) {

				resultItems.add(item);
			}

		}

		if (resultItems.size() == 1) {
			return resultItems.get(0);
		}

		// STRATEGY:
		// // 1. If all elements have the same sourceElement, we can return any
		// of these (let's say the first one)
		// // 2. We can discard all sourceElements that are not of the STATEMENT
		// types (for example there could be
		// // SUBRUTINE_DEFINITION sourceElements that were used to generate the
		// name of a subrutine.

		EObject sourceElement = null;
		boolean allSourceElementsAreEqual = true;

		Iterator<SourceTargetMappingItemImpl> it = resultItems.iterator();
		while (it.hasNext()) {
			SourceTargetMappingItemImpl resultItem = it.next();

			// This part will remove all items with non STATEMENT source
			// element.
			if (!resultItem.getSemanticElementTypes().contains(SemanticElementType.STATEMENT)) {
				DSLDebuggerLog.logInfo("SourceElementLookup: Discarding mapping item with source: "
						+ resultItem.semanticElement + " for not being of the STATEMENT type.");
				it.remove();
				continue;
			}

			// This part ensures that variable allSourceElementsAreEqual will be
			// set correctly when the cycle terminates.
			if (sourceElement == null) {
				sourceElement = resultItem.semanticElement;
			} else if (!EcoreUtil.equals(sourceElement, resultItem.semanticElement)) {
				allSourceElementsAreEqual = false;
			}
		}

		if (resultItems.size() > 1 && allSourceElementsAreEqual) {
			return resultItems.get(0);
		}

		if (resultItems.size() > 1) {
			// We still need to decide between more than one source element.
			// TODO
			DSLDebuggerLog
					.logInfo("SourceElementLookup: cannot decide which source element to return. DEBUG_ME");
			return resultItems.get(0);
		}

		DSLDebuggerLog.logInfo("SourceElementLookup: could not find any suitable source element.");
		return null;
	}

	@Override
	public IItem[] getAllMappingItems() {
		return this.items.toArray(new IItem[this.items.size()]);
	}
}
