package ex03;

import java.util.Scanner;

public class TrianglePascal {
	public static void main(String[] args) {
		System.out.print("Enter n:");
		display();
	}

	public static int pascal(int k, int n) {
		if (k == 0 || (k == 1 && n == 0) || k == n + 1)
			return 1;
		else
			return pascal(k - 1, n - 1) + pascal(k, n - 1);
	}

	public static void display() {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print(pascal(j, i) + "  ");
			}
			System.out.println("");
		}
	}
}