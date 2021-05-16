package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(anagram("java", "ajav"));
		System.out.println("Ky tu xuat hien nhieu nhat: ");
		System.out.println(getLetters("abbccddd"));
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

	private static List<Character> getLetters(String in) {
		List<Character> result = new ArrayList<Character>();
		Set<Character> letterUniques = new HashSet<Character>();
		char[] c = in.toCharArray();
		for (char i : c) {
			letterUniques.add(i);
		}

		List<Integer> counts = new ArrayList<Integer>();
		int count = 0;
		for (Character item : letterUniques) {
			for (char c1 : c) {
				if (item == c1) {
					count++;
				}
			}
			counts.add(count);
			count = 0;
		}

		int max = counts.get(0);
		for (Integer item : counts) {
			if (item >= max) {
				max = item;
			}
		}
		int index = 0;
		for (Character i : letterUniques) {
			if (counts.get(index++) == max) {
				result.add(i);
			}
		}

		return result;

	}
}
