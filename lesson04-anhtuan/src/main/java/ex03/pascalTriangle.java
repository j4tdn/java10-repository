package ex03;

import java.util.Scanner;

public class pascalTriangle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n:");
		int n = ip.nextInt();
		painting(n);

	}
	public static void painting(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pascal(j, i) + "\t");
			}
			System.out.println(" ");
		}
	}

	public static int pascal(int k, int n) {
		if (k == 0 || k == n) {
			return 1;
		}
		if (k == 1) {
			return n;
		}
		return pascal(k - 1, n - 1) + pascal(k, n - 1);
	}



}
