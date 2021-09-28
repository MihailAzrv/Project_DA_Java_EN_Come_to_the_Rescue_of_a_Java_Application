package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomCountedToFile {
	
	private String outputData;
	
	public WriteSymptomCountedToFile(String outputData) {
		this.outputData = outputData;
	}
	
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
