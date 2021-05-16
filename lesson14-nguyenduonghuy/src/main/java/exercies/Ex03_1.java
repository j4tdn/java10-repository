package exercies;

import java.util.Arrays;

public class Ex03_1 {
	public static void main(String[] args) {
		System.out.println(isAnagram("W or  d", "or  Wd"));
	}
	
	private static boolean isAnagram(String s1, String s2) {
		if (s1.contains(" ")) {
			s1 = s1.replaceAll(" ", "");
		}
		if (s2.contains(" ")) {
			s2 = s2.replaceAll(" ", "");
		}
		char[] s1Char = s1.toLowerCase().toCharArray();
		char[] s2Char = s2.toLowerCase().toCharArray();
		if (s1Char.length != s2Char.length) {
			return false;
		}
		Arrays.sort(s1Char);
		Arrays.sort(s2Char);
		return Arrays.compare(s1Char, s2Char) == 0;
	}
}
