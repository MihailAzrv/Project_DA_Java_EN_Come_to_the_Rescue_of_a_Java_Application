package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class Analyse {
	
	private ISymptomReader reader;
	private ISymptomTreatement treatement;
	private ISymptomWriter writer;
	
	public Analyse(ISymptomReader reader, ISymptomTreatement treatement, ISymptomWriter writer) {
		this.reader = reader;
		this.treatement = treatement;
		this.writer = writer;
	}
	
	public List<String> getSymptoms() {
		return this.reader.GetSymptoms();
	}
	
	public TreeMap<String, Integer> countSymptoms (List<String> listNotCounted) {
		return this.treatement.countSymptoms(listNotCounted);
	}
	
	public void writeSymptoms (TreeMap <String, Integer> mapCounted) {
		this.writer.writeSymptoms(mapCounted);
	}

}
