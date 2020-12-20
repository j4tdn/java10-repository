package exception;

import java.util.Scanner;

public class Ex01NFE {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isValid = false;
		int number = 0;

		do {
			try {
				System.out.println("enter a number");

				number = Integer.parseInt(ip.nextLine());
				isValid = true;

			} catch (NumberFormatException nfe) {
				System.out.println("Invalid number !");
			}

		} while (!isValid);

//		

//		int number = Integer.parseInt(ip.nextLine());
		System.out.println("result :" + number);
		System.out.println("back to main thread");
	}

}
