package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Anything that will treat symptom data. The important part is the
 * return value from the operation, which is a TreeMap with key of strings and value of integers
 */
public interface ISymptomTreatement {
	/**
	 * @param listNotCounted
	 * @return a list of keys containing the symptoms with their values containing the number of times that the symptoms were encountered.
	 * The list is ordered in an alphabetically way.
	 */
	TreeMap<String, Integer> countSymptoms(List<String> listNotCounted);
	
}
