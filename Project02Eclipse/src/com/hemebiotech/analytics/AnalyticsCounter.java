package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * This class contains the main method of the program.
 */
public class AnalyticsCounter {
	
	final static String inputData = "symptoms.txt";
	final static String outputData = "result.out";
	
	public static void main(String[] args) {

		Analyse analyse = new Analyse(new ReadSymptomDataFromFile(inputData), new CountSymptomFromList(), new WriteSymptomCountedToFile(outputData));
		
		List<String> list = analyse.getSymptoms();
		
		TreeMap<String, Integer> sort = analyse.countSymptoms(list);
		
		analyse.writeSymptoms(sort);
	}
	
}
