package ex;

import java.util.Arrays;

public class ex03_1 {
	public static void main(String[] args) {
		System.out.println(anagram("Word", "dwoR"));

	}

	private static boolean anagram(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}

		Integer[] result1 = new Integer[word1.length()];
		Integer[] result2 = new Integer[word2.length()];

		for (int i = 0; i < word1.length(); i++) {

			result1[i] = word1.codePointAt(i);
			result2[i] = word1.codePointAt(i);
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
