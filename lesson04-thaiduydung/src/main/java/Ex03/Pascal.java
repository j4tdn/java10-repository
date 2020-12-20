package Ex03;

import java.util.Scanner;

public class Pascal {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		display();
	}

	public static int pascal(int k, int n) {
		if (k == 0 || (k == 1 && n == 0) || k == n + 1)
			return 1;
		else
			return pascal(k - 1, n - 1) + pascal(k, n - 1);
	}

	public static void display() {
		System.out.print("Enter n:");
		int n = ip.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int k = 0; k <= i + 1; k++) {
				System.out.print(pascal(k, i) + " ");
			}
			System.out.println(" ");
		}
	}
}