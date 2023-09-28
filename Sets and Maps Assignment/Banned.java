package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Question 2:
//Given a string paragraph and a string array of the banned words banned, return
//the most frequent word that is not banned. It is guaranteed there is at least one
//word that is not banned, and that the answer is unique.
//The words in paragraph are case-insensitive and the answer should be returned in
//lowercase.

public class Banned {

	public static String mostfrequentword(String p, String[] b) {
		Set<String> s = new HashSet<>(Arrays.asList(b));
		p = p.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		String[] w = p.split("\\s+");
		Map<String, Integer> frequency = new HashMap<>();

		for (String word : w) {
			if (!s.contains(word)) {
				frequency.put(word, frequency.getOrDefault(word, 0) + 1);
			}
		}
		return Collections.max(frequency.entrySet(), Map.Entry.comparingByValue()).getKey();
	}

	public static void main(String[] args) {
		String p = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] ban = { "hit" };
		System.out.println(mostfrequentword(p, ban));
	}
}
