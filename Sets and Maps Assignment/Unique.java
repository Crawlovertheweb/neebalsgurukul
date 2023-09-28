package LeetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Unique {

	// Question 5:
	// Write a program to find unique vowels in 2 Sets
	public static void main(String[] args) {

		Set<String> x = new HashSet<>();
		x.add("a");
		x.add("e");
		x.add("i");

		Set<String> y = new HashSet<>();
		y.add("i");
		y.add("o");
		y.add("u");
		y.add("a");

		x.addAll(x);
		x.retainAll(y);

		System.out.println(x);

	}

}
