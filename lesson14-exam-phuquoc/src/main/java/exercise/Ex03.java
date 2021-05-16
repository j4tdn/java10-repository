package exercise;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String firstWord = "word";
		String secondWord = "orwd";
		System.out.println("Chuỗi trên là đảo chuỗi"+isAnagram(firstWord, secondWord));
		
		String str = "aaaababbbddc";
		System.out.println("Kí tự xuất hiện nhiều nhất " + charactersAppearALot(str));
	}
	// Ex03.1
	public static boolean isAnagram(String firstWord, String secondWord) {
		char[] word1 = firstWord.trim().replaceAll("[\\s]", "").toCharArray();
		char[] word2 = secondWord.trim().replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		return Arrays.equals(word1, word2);
	}

	
	// Ex03.2
	public static char charactersAppearALot(String str) {
		int ASCII_SIZE = 256;
		int count[] = new int[ASCII_SIZE];
		int length = str.length();
		for (int i = 0; i < length; i++)
			count[str.charAt(i)]++;

		int max = -100000;
		char result = ' ';
		for (int i = 0; i < length; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
}
