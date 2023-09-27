package com.functional.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionalOperationsContact 
{

	public static void main(String[] args) 
	{

		Map<String,String> Contact = new HashMap<>();
		Contact.put("1237589020", "John");
		Contact.put("1237009020", "John");
		Contact.put("7890291111", "Neal");
		Contact.put("2647210290", "Raju");
		Contact.put("9999999999", "Peter");
		Contact.put("9081234567", "Neha");
		
		for(Map.Entry<String, String> entry : Contact.entrySet()) {
		System.out.println(entry.getKey() + " - "+ entry.getValue());
	}
	
	System.out.println(" ");
	
	 // Filter and print the contacts for which the name is "John"	
	System.out.println("Filter and print the contacts for which the name is John ");
	Contact.forEach((k, v) ->
	{
        if ("John".equals(v)) {
            System.out.println(k + " - " + v);
        }
	});
	
	System.out.println(" ");
	// Filter and collect all the contacts with the name "John" into a new map
	System.out.println(" Filter and collect all the contacts with the name \"John\" into a new map ");

    Map<String, String> johnContacts = Contact.entrySet().stream()
            .filter(entry -> "John".equals(entry.getValue()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    johnContacts.forEach((k, v) -> System.out.println(k + " - " + v));

    System.out.println(" ");
    // Map: Create a string with all the names separated by comma
	System.out.println("  Create a string with all the names separated by comma ");

    String allNames = Contact.values().stream()
            .collect(Collectors.joining(", "));

    System.out.println("Names: " + allNames);

}
}
