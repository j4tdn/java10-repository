package ex01;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		do {

			try {
				
				System.out.println("a =");
				float a = Integer.parseInt(ip.nextLine());
				System.out.println("b =");
				float b = Integer.parseInt(ip.nextLine());
				equation(a,b);
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			System.out.println(" === back to main ===");
		} while (true);

	}

	public static void equation(float a, float b) {
		float result = 0;
		if (a == 0) {
			if (b == 0) {
				System.out.println("No solution !!!");
			} else {
				System.out.println("No solution !!!");
			}

		}
		result = -b / a;
		System.out.println("result = " + result);

	}
}