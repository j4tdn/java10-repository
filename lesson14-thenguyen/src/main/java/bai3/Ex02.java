package bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(getLetters("aaaccdcee"));
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
