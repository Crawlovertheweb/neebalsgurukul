package com.functional.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalOperationsMovie 
{

	public static void main(String[] args) 
	{
		List<Movie> movies = Arrays.asList(
				new Movie("Spotlight",2015,"Hollywood"),
				new Movie("Avengers: Infinity War",2018,"Hollywood"),
				new Movie("Inception",2010,"Hollywood"),
				new Movie("Forest Gump",1994,"Hollywood"),
				new Movie("3 Idiots",2009,"Bollywood"),
				new Movie("Beauty and the beast",2017,"Hollywood"),
				new Movie("Slumdog Millionaire",2008,"Bollywood")
);
    
		 // Mapping: Print only the names of all the movies
		System.out.println("Movie names");
        movies.stream()
              .map(Movie::getName)
              .forEach(System.out::println);
        
        System.out.println(" ");
     // Traversal: Print all the movie objects
        System.out.println("Movie objects");
        movies.forEach(System.out::println);
        System.out.println(" ");
        // Sorting: Sort and print in increasing order of release date
        System.out.println("Sorted movies according to the release year");
        Collections.sort(movies, Comparator.comparingInt(Movie::getReleaseYear));
        movies.forEach(System.out::println);
        System.out.println(" ");
     // Print a string containing all the movie names using reduce
        System.out.println("string conataining all the movie names using reduce");
        String movieNames = movies.stream()
                .map(Movie::getName)
                .reduce((n1, n2) -> n1 + ", " + n2)
                .orElse("");
        System.out.println("All movie names: " + movieNames);
    
	}

}
