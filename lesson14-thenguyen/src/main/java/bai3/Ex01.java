package bai3;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {

		System.out.println(anagram("hello", "llohe"));

	}

	private static boolean anagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		Integer[] result1 = new Integer[s1.length()];
		Integer[] result2 = new Integer[s1.length()];

		for (int i = 0; i < s1.length(); i++) {

			result1[i] = s1.codePointAt(i);
			result2[i] = s1.codePointAt(i);
		}
		Arrays.sort(result1);
		Arrays.sort(result2);
		for (int i = 0; i < result1.length; i++) {
			if (result1[i] != result2[i]) {
				return false;
			}
		}

		return true;
	}
}
