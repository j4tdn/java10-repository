package Ex01;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("entering string: ");
		String input = ip.nextLine();
		toChar(input);
		System.out.println("\n=========");
		toWord(input);
		System.out.println("\n=========");
		
		System.out.println(reverseChar(input));
		System.out.println("\n=========");
		System.out.println(reverseWord(input));
		
		

		

	}


	private static char[] toChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i) + " ");
		}
		return input.toCharArray();
	}
	private static String[] toWord(String input) {
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i));
		}
		return input.split("\\s+");
	}
	
	private static char[] reverseChar(String s) {
		
		
		char[] toChar = toChar(s);
		char[] reverse = new char[toChar.length];
		int count = 0;
		for (int i = toChar.length - 1; i >= 0; i--) {
			reverse[count++] = toChar[i];
		}
		return reverse;
		
	}
	private static String[] reverseWord(String s) {
		String[] toWord = toWord(s);
		String[] reverse = new String[toWord.length];
		int count = 0;
		for (int i = toWord.length - 1; i >= 0; i--) {
			reverse[count++] = toWord[i];
		}
		return reverse;
	}
}
