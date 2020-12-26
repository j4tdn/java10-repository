package exercise01;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		boolean isValidA = false;
		boolean isValidB = false;
		int a = 0;
		int b = 0;

		System.out.println("Ax + B = 0");
		do {
			try {
				System.out.print("Enter a number for parameter A: ");
				a = Integer.parseInt(console.nextLine());

				isValidA = true;
			} catch (Exception e) {
				System.out.println("Invalid Number !");
			}
			System.out.println();
		} while (!isValidA);

		do {
			try {
				System.out.print("Enter a number for parameter B: ");
				b = Integer.parseInt(console.nextLine());

				System.out.println();
				System.out.println("x = " + divide(a, b));
				isValidB = true;
			} catch (Exception e) {
				System.out.println("Invalid Number !");
			}
			System.out.println();
		} while (!isValidB);
		
		console.close();
		System.out.println("Finished !!!");
	}

	private static double divide(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return (-b / a);
	}
}
