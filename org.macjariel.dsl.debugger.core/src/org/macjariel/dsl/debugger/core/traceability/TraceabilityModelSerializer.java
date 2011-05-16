package org.macjariel.dsl.debugger.core.traceability;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.acceleo.engine.event.AcceleoTextGenerationEvent;
import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.service.AcceleoService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * This class serializes the traceability model of a Acceleo generation and
 * stores it to a file. The class operates as an AcceleoTextGenerationListener
 * that listens for generationEnd event.
 * 
 * @author MacJariel
 * 
 */
public class TraceabilityModelSerializer implements
		IAcceleoTextGenerationListener {

	private final URI traceabilityModelURI;

	/**
	 * Creates the TraceabilityModelSerializer that will store the serailized
	 * traceability model to file defined by traceabilityModelURI parameter.
	 * 
	 * @param traceabilityModelURI
	 *            URI of the file that will be used to store the model.
	 */
	public TraceabilityModelSerializer(URI traceabilityModelURI) {
		this.traceabilityModelURI = traceabilityModelURI;
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
		EObject eo = event.getTraceabilityInformation();
		if (eo == null) {
			// TODO: exception?
			System.err
					.println("Cannot obtain traceability information. Make sure that traceability is enabled.");
			return;
		}
		try {
			// URI uri =
			// URI.createPlatformResourceURI("/org.mcj.karel.example/trace-model.xmi",
			// false);
			Resource res = new XMIResourceImpl(traceabilityModelURI);
			Map<String, Boolean> options = new HashMap<String, Boolean>();

			options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			// options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE,
			// Boolean.TRUE);
			options.put(XMLResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE);
			// options.put(XMLResource.OPTION_XML_MAP, xmlMap);
			res.getContents().add(eo);
			res.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean listensToGenerationEnd() {
		return true;
	}

}
