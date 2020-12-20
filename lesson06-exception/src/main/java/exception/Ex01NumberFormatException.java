package exception;

import java.util.Scanner;

public class Ex01NumberFormatException {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		try {
//			System.out.print("Enter a number: ");
//			int number = Integer.parseInt(sc.nextLine());
//			System.out.println("result: " + number);
//		} catch (NumberFormatException nfe) {
//			System.out.println("Invalid number!");
//		}
//		System.out.println("Back to main thread");

		checkInput();
	}
	
	private static void checkInput() {
		do {
			try {
				System.out.println("Enter number: ");
				int number = Integer.parseInt(sc.nextLine());
				System.out.println("result: " + number);
				break;
			} catch (NumberFormatException nfe) {
				System.err.println("Invalid number! Enter again:");
			}
		} while (true);
	}
}