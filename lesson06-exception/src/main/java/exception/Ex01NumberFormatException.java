package exception;

import java.util.Scanner;

public class Ex01NumberFormatException {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		int number = 0;
		do {
			System.out.print("Enter a number: ");
			try {
				number = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number !");
			}
		} while (true);

		System.out.println("Result: " + number);
		System.out.println("Back to main thread");

	}
}
