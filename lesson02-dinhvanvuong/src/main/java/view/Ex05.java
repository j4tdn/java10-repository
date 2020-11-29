package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value n: ");
		int n = sc.nextInt();
		String result = Builder(n);
	}

	private static String Builder(int n) {
		int result = 0;
		int c = n;
		for (result = 0; result <= n; result++) {
			while (n != 0) {
				int b = n % 2;
				result += b;
				n /= 2;
				System.out.println("Base of 2 " + c + " was : " + result);
			}
		}
		return null;

	}

}
