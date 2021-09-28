package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface ISymptomTreatement {

	TreeMap<String, Integer> countSymptoms(List<String> listNotCounted);
	
}
