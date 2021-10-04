package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * This class is the object of the program. It contains the constructor for Analyse.
 */
public class Analyse {

	private ISymptomReader reader;
	private ISymptomTreatement treatement;
	private ISymptomWriter writer;
	
	/**
	 * This constructor allows to use the different interfaces for each method.
	 * @param reader
	 * @param treatement
	 * @param writer
	 */
	public Analyse(ISymptomReader reader, ISymptomTreatement treatement, ISymptomWriter writer) {
		this.reader = reader;
		this.treatement = treatement;
		this.writer = writer;
	}
	
	public List<String> getSymptoms() {
		return this.reader.getSymptoms();
	}
	
	public TreeMap<String, Integer> countSymptoms (List<String> listNotCounted) {
		return this.treatement.countSymptoms(listNotCounted);
	}
	
	public void writeSymptoms (TreeMap <String, Integer> mapCounted) {
		this.writer.writeSymptoms(mapCounted);
	}

}
