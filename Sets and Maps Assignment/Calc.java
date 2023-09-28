package LeetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Question 7:
//Create a set calculator which takes 2 sets as input and the operation( in, not in, &,
//|, ^,
//<, <=, >, >=, ==, !=, etc) to be performed on the sets. Display the result.
public class Calc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("set1 elements");
		Set<Integer> s1 = readSet(s);

		System.out.println("set2 elements");
		Set<Integer> s2 = readSet(s);

		System.out.println("enter the operation (&, |, ^, <, <=, >, >=, ==, !=): ");
		String operation = s.next();

		switch (operation) {
		case "&":
			s1.retainAll(s2);
			break;
		case "|":
			s1.addAll(s2);
			break;
		case "^":
			s1.removeAll(s2);
			break;
		case "<=":
			System.out.println("set 1 is subset of 2" + s1.containsAll(s2));
			break;
		case ">=":
			System.out.println("set 2 is subset of 1" + s2.containsAll(s1));
			break;
		case "==":
			System.out.println("set 1 is equal to set2" + s1.equals(s2));
			break;
		case "!=":
			System.out.println("set 1 is not equal to set2" + !s1.equals(s2));
			break;
		default:
			System.out.println("invalid operations");
		}
		System.out.println("result" + s1);

	}

	private static Set<Integer> readSet(Scanner sc) {
		Set<Integer> set = new HashSet<>();
		String input = sc.next();
		String[] elements = input.split(",");
		for (String element : elements) {
			set.add(Integer.parseInt(element.trim()));
		}
		return set;
	}
}
