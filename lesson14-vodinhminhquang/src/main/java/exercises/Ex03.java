package exercises;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(areAnagrams("Word", "orWd"));
		System.out.println(areAnagrams("Word", "Word"));
		System.out.println(areAnagrams("word", "DoRw"));
		System.out.println(areAnagrams("Word", "worrd"));
		System.out.println(areAnagrams("Java", "ajav"));
		System.out.println(areAnagrams("Vava", "Avav"));
		System.out.println(areAnagrams("Hello", "Hellloo"));
	}

	private static boolean areAnagrams(String s1, String s2) {
		char[] convertWord01 = s1.toCharArray();
		char[] convertWord02 = s2.toCharArray();

		if (s1.length() != s2.length()) {
			return false;
		}

		Arrays.sort(convertWord01);
		Arrays.sort(convertWord02);

		if (!Arrays.equals(convertWord01, convertWord01)) {
			return false;
		}
		return true;
	}
}
