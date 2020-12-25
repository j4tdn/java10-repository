package demo;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = { 3, 2, 1, 6, 5 };
		int number = getMissingNumber(digits);
		System.out.println("missed number: " + number);
	}

	private static int getMissingNumber(int[] digits) {
		// (1,n) = n*(n+1)/2
		int max = digits.length + 1; // 6
		return (max * (max + 1)) / 2 - sum(digits);
	}

	private static int sum(int[] digits) {

		int result = 0;
		for (int digit : digits) {
			result += digit;

		}
		return result;
	}
}
