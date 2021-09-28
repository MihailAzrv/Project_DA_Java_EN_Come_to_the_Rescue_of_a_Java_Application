package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

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
