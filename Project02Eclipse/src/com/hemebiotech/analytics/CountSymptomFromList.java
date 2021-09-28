package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class CountSymptomFromList implements ISymptomTreatement {

	public TreeMap<String, Integer> countSymptoms (List<String> listNotCounted) {
		
		TreeMap<String, Integer> count = new TreeMap<String, Integer>();
		
		for (String symptom : listNotCounted) {
			if (!count.containsKey(symptom)) {
				count.put(symptom, 1);
			} 
			else if (count.containsKey(symptom)) {
				count.put(symptom, count.get(symptom) +1);
			}
		}
		
		return count;
	}
	
}
