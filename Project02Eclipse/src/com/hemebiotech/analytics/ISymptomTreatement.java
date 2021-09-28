package com.hemebiotech.analytics;

public interface ISymptomTreatement {

	TreeMap<String, Integer> countSymptoms(List<String> listNotCounted);
	
}
