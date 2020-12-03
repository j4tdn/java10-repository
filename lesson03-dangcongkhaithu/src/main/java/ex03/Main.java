package ex03;

import java.util.Scanner;

public class Main {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("m = ");
		int m = Integer.parseInt(ip.nextLine());
		System.out.print("n = ");
		int n = Integer.parseInt(ip.nextLine());
		int[][] arr = new int[m][n];

		System.out.println("Nhập các phần tử: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = ip.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}

	}
}
