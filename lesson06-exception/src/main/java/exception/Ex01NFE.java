package exception;

import java.util.Scanner;

public class Ex01NFE {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isValid = false;
		int number = 0;
		do {
			try {
				System.out.print("Enter a number: ");
				number = Integer.parseInt(ip.nextLine());
				isValid = true;
				// System.out.println("Result: " + number);
			} catch (NumberFormatException nfe) {
				System.out.println("Invalid number !");
			}

		} while (!isValid);

		System.out.println("Back to main thread");
	}
}
