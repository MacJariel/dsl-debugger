package org.macjariel.dsl.debugger.core.traceability;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;

import org.eclipse.acceleo.engine.event.AcceleoTextGenerationEvent;
import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.service.AcceleoService;
import org.eclipse.acceleo.model.mtl.Documentation;
import org.eclipse.acceleo.model.mtl.DocumentedElement;
import org.eclipse.acceleo.model.mtl.Query;
import org.eclipse.acceleo.model.mtl.Template;
import org.eclipse.acceleo.traceability.GeneratedFile;
import org.eclipse.acceleo.traceability.GeneratedText;
import org.eclipse.acceleo.traceability.TraceabilityModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementTypesModel;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesFactory;

/**
 * This class serializes the traceability model of a Acceleo generation and
 * stores it to a file. The class operates as an AcceleoTextGenerationListener
 * that listens for generationEnd event.
 * 
 * @author MacJariel
 * 
 */
public class TraceabilityModelSerializer implements IAcceleoTextGenerationListener {

	public static final String TRACEABILITY_FILENAME = "traceability.xmi";

	public static final String MODULEELEMENTTYPES_FILENAME = "moduleelementtypes.xmi";

	private final URI targetFolderURI;

	/**
	 * Creates the TraceabilityModelSerializer that will store the serailized
	 * traceability model to file defined by traceabilityModelURI parameter.
	 * 
	 * @param targetFolderURI
	 *            URI of the file that will be used to store the model.
	 */
	public TraceabilityModelSerializer(URI targetFolderURI) {
		this.targetFolderURI = targetFolderURI;
	}

	/**
	 * Registers the object to listen to Acceleo text generation events.
	 */
	public void register() {
		AcceleoService.addStaticListener(this);
	}

	/**
	 * Unregisters the object to listen to Acceleo text generation events.
	 */
	public void unregister() {
		AcceleoService.removeStaticListener(this);
	}

	@Override
	public void textGenerated(AcceleoTextGenerationEvent event) {
	}

	@Override
	public void filePathComputed(AcceleoTextGenerationEvent event) {
	}

	@Override
	public void fileGenerated(AcceleoTextGenerationEvent event) {
	}

	@Override
	public void generationEnd(AcceleoTextGenerationEvent event) {
		System.out.println("Generation ended.");
		// We are going to create the traceability model here.
		TraceabilityModel traceabilityModel = (TraceabilityModel) event
				.getTraceabilityInformation();
		if (traceabilityModel == null) {
			// TODO: exception?
			System.err
					.println("Cannot obtain traceability information. Make sure that traceability is enabled.");
			return;
		}

		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE);

		try {
			Resource traceabilityRes = new XMIResourceImpl(
					targetFolderURI.appendSegment(TRACEABILITY_FILENAME));
			traceabilityRes.getContents().add(traceabilityModel);
			traceabilityRes.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}

		ModuleElementTypesModel moduleElementTypesModel = ModuleelementtypesFactory.eINSTANCE
				.createModuleElementTypesModel();
		for (GeneratedFile gFile : traceabilityModel.getGeneratedFiles()) {
			for (GeneratedText gText : gFile.getGeneratedRegions()) {
				EObject parent = gText.getModuleElement().getModuleElement().eContainer();
				while (parent != null && !(parent instanceof Template)
						&& !(parent instanceof Query)) {
					parent = parent.eContainer();
				}
				if (parent != null) {
					Documentation doc = ((DocumentedElement) parent).getDocumentation();
					if (doc != null) {
						ModuleElement moduleElement = ModuleelementtypesFactory.eINSTANCE
								.createModuleElement();
						moduleElement.setModuleElement(gText.getModuleElement());
						moduleElement.getModuleElementTypes().addAll(
								parseModuleElementDocumentationString(doc.getBody().getValue()));
						moduleElementTypesModel.getModuleElements().add(moduleElement);
					}
				}
			}
		}

		try {
			Resource moduleElementTypesRes = new XMIResourceImpl(
					targetFolderURI.appendSegment(MODULEELEMENTTYPES_FILENAME));
			moduleElementTypesRes.getContents().add(moduleElementTypesModel);
			moduleElementTypesRes.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Collection<ModuleElementType> parseModuleElementDocumentationString(String docString) {
		Collection<ModuleElementType> result = new Vector<ModuleElementType>(
				ModuleElementType.VALUES.size());

		StringTokenizer st = new StringTokenizer(docString);
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if (token.equals("@type")) {
				while (st.hasMoreTokens()) {
					String typeToken = st.nextToken();
					boolean wasTypeToken = false;
					for (ModuleElementType type : ModuleElementType.VALUES) {
						if (type.getLiteral().equals(typeToken)) {
							result.add(type);
							wasTypeToken = true;
							break;
						}
					}
					if (!wasTypeToken)
						break;
				}
			}
		}
		return result;
	}

	@Override
	public boolean listensToGenerationEnd() {
		return true;
	}

}
