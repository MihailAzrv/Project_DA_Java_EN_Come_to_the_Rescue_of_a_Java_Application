package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Simple brute force of implementation
 */
public class WriteSymptomCountedToFile implements ISymptomWriter {
	
	private String outputData;
	
	/**
	 * @param outputData : a full or partial path to the file with symptom strings in it, one per line.
	 */
	public WriteSymptomCountedToFile(String outputData) {
		this.outputData = outputData;
	}
	
	@Override
	public void writeSymptoms(TreeMap<String, Integer> outputSort) {
		
		try {
			FileWriter writer = new FileWriter(outputData);
			
			for (Map.Entry<String, Integer> entry : outputSort.entrySet()) {
				writer.write(entry.getKey() + ":" + entry.getValue());
				writer.write(System.lineSeparator());
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
