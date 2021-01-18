package exercises;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String input = ip.nextLine();
		toChar(input);
		toWord(input);
		reverseWAndC(input);
	}

	public static void toChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i) + " ");
		}
		System.out.println("\n==========");
	}

	public static void toWord(String input) {
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i));
		}
		System.out.println();
		System.out.println("==========");
	}

	public static void reverseWAndC(String input) {
		String reverse = new StringBuffer(input).reverse().toString();
		for (int i = 0; i < input.length(); i++) {
			System.out.print(reverse.charAt(i) + " ");
		}
		System.out.println("\n==========\n" + reverse);
	}

}
