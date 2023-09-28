package LeetCode;

//Question 4:
//Given two strings s and t, determine if they are isomorphic.
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while
//preserving the order of characters. No two characters may map to the same
//character, but a character may map to itself.

import java.util.HashMap;


public class IsomorphicStrings {
	public static boolean isomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Character> n1 = new HashMap<>();
		HashMap<Character, Character> n2 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char s2 = s.charAt(i);
			char t2 = t.charAt(i);

			if (n1.containsKey(s2)) {
				if (n1.get(s2) != t2) {
					return false;
				}
			} else {
				n1.put(s2, t2);
			}

			if (n2.containsKey(t2)) {
				if (n2.get(t2) != s2) {
					return false;
				}
			} else {
				n2.put(t2, s2);
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s1 = "egg";
		String t1 = "add";
		System.out.println(isomorphic(s1, t1));

		String s2 = "foo";
		String t2 = "bar";
		System.out.println(isomorphic(s2, t2));

		String s3 = "paper";
		String t3 = "title";
		System.out.println(isomorphic(s3, t3));
	}
}
