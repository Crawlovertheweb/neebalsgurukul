package com.functional.assignment;

import java.util.HashMap;
import java.util.Map;

public class FunctionalOperationsMarks {

	public static void main(String[] args) 
	{
		Map<String,Double> marks = new HashMap<>();
		marks.put("Science", 66.00);
		marks.put("Maths", 78.00);
		marks.put("English", 90.00);
		 // Reduce: Find the average of all the marks
        double average = marks.values().stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0); // Provide a default value in case the map is empty

        System.out.println("Average Marks: " + average);
    }
	}


