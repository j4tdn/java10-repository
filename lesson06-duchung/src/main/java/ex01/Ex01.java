package ex01;

import java.util.Scanner;

public class Ex01 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {
				System.out.print("Enter a: ");
				float a = Float.parseFloat(ip.nextLine());
				System.out.print("Enter b: ");
				float b = Float.parseFloat(ip.nextLine());
				firstDegreeEquation(a, b);
				break;

			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		} while (true);
	}

	public static void firstDegreeEquation(float a, float b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("The equation has countless solutions");
			} else {
				System.out.println(" The equation has no solution");
			}
		} else {
			float x = -b / a;
			System.out.println("The equation has solution x = " + x);
		}
	}
}
