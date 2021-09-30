package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * Anything that will write a result to a source.
 */
public interface ISymptomWriter {
	/**
	 * Put the result from the TreeMap to a source.
	 * @param outputSort
	 */
	void writeSymptoms (TreeMap<String, Integer> outputSort);
	
}
