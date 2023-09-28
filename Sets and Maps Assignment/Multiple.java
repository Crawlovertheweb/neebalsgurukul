package LeetCode;

import java.util.HashSet;
import java.util.Set;

//Question 6:
//WAP to create 2 sets, one containing multiple of 5 less than 30 and another
//containing
//multiple of 3 less than 20. Display the following:
//I. Union of 2 sets and its length
//II. Intersection of 2 sets and its length
//III. Difference of set1 and set2 and its length

public class Multiple {
	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();

		for (int i = 5; i < 30; i += 5) {
			s1.add(i);
		}

		for (int i = 3; i < 20; i += 3) {
			s2.add(i);
		}

		Set<Integer> u = new HashSet<>(s1);
		u.addAll(s2);
		System.out.println("I. Union of set1 and set2: " + u);
		System.out.println("   Length of the union: " + u.size());

		Set<Integer> i = new HashSet<>(s1);
		i.retainAll(s2);
		System.out.println("II. Intersection of set1 and set2: " + i);
		System.out.println("    Length of the intersection: " + i.size());

		Set<Integer> d = new HashSet<>(s1);
		d.removeAll(s2);
		System.out.println("III. Difference of set1 and set2: " + d);
		System.out.println("     Length of the difference: " + d.size());
	}
}
