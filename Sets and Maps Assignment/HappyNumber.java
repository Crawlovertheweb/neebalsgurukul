package LeetCode;

import java.util.Set;
import java.util.HashSet;

//Question 3:
//Write an algorithm to determine if a number n is happy.
//A happy number is a number defined by the following process:
//• Starting with any positive integer, replace the number by the sum of the
//squares of its digits.
//• Repeat the process until the number equals 1 (where it will stay), or it loops
//endlessly in a cycle which does not include 1.
//
//• Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.

public class HappyNumber {

	public static boolean isHappy(int n) {

		Set<Integer> s = new HashSet<>();

		while (n != 1) {

			int sum = 0;
			while (n > 0) {
				int d = n % 10;
				sum += d * d;
				n /= 10;
			}

			if (s.contains(sum)) {
				return false;
			}

			s.add(sum);

			n = sum;
		}

		return true;
	}

	public static void main(String[] args) {
		int n = 2; 
		boolean r = isHappy(n);
		System.out.println(r);
	}
}
