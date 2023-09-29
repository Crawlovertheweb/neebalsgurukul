package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class TownJudge {
	public static int findJudge(int n, int[][] trust) {
		if (trust.length == 0) {
			return n;
		}

		HashSet<Integer> trusting = new HashSet<>();
		HashMap<Integer, Integer> trustCount = new HashMap<>();

		for (int i = 0; i < trust.length; i++) {
			trusting.add(trust[i][0]);

			int trusted = trust[i][1];
			trustCount.put(trusted, trustCount.getOrDefault(trusted, 0) + 1);
		}

		for (Integer key : trustCount.keySet()) {
			if (trustCount.get(key) == n - 1 && !trusting.contains(key)) {
				return key;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int n = 3;
		int[][] trust = { { 1, 3 }, { 2, 3 } };

		int result = findJudge(n, trust);
		System.out.println(result); // Output: 2
	}
}
