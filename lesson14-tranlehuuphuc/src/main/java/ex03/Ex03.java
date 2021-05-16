package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(anagram("hello", "llohe"));
		System.out.println("Nhap chuoi ki tu");
//		String str = "ádasdsadasdsa" + "";
		String str = sc.nextLine() + "";
		System.out.println("Max occurring character is " + getMaxOccuringChar(str));

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

	///////////////////////////////////////////////////
	static Scanner sc = new Scanner(System.in);
	static final int ASCII_SIZE = 256;

	static char getMaxOccuringChar(String str) {

		int count[] = new int[ASCII_SIZE];

		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1;
		char result = ' ';

		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}

}
