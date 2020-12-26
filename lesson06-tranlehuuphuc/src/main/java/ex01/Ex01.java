package ex01;

import java.util.Scanner;

public class Ex01 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("(ax + b = 0)");
		System.out.print("Enter a: ");
		double a = InputZero();
		System.out.print("Enter b: ");
		double b = Input();
		System.out.println("x = " + (-b/a));
	}

	private static double Input() {
		do {
			try {
				double input = sc.nextDouble();
				return input;
			} catch (Exception e) {
				System.err.print("Invalid number! Enter again:");
				sc.nextLine();
			}
		} while (true);
	}

	private static double InputZero() {
		do {
			try {
				double input = sc.nextDouble();
				if (input == 0) {
					System.err.print("0 is invalid! Enter again: ");
					continue;
				}
				return input;
			} catch (Exception e) {
				System.err.print("Invalid number! Enter again:");
				sc.nextLine();
			}
		} while (true);
	}


}
