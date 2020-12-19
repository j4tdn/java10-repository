package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		System.out.print("Enter size: ");
		int n = new Scanner(System.in).nextInt();
		Display(n);
	}

	public static void Display(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(Pascal(j, i) + "\t");
			}
			System.out.println();
		}
	}

	public static int Pascal(int k, int n) {
		if (k == 0 || k == n) {
			return 1;
		}
		if (k == 1) {
			return n;
		}
		return Pascal(k - 1, n - 1) + Pascal(k, n - 1);
	}
}
