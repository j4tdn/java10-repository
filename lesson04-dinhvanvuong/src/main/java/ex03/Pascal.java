package ex03;

import java.util.Scanner;

public class Pascal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n = sc.nextInt();
		display(n);
	}

	public static int Factorial(int n) {
		int gt = 1;
		if (n == 0 || n == 1)
			return 1;
		else
			for (int i = 2; i <= n; i++)
				gt*= i;
		return gt;

	}

	public static void display(int n) {
		for (int i = 0; i <= n; i++) {
			for (int k = 0; k <= i; k++)
				System.out.println((Factorial(i) / (Factorial(k) * Factorial(i - k))) + "");
			System.out.println("");
		}

	}

}
