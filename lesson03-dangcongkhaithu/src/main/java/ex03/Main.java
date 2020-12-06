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

		System.out.println("Nhập mảng: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = ip.nextInt();
			}
		}

		System.out.println("Xuất mảng: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

	}

	private static int getYenNguaElement(int[][] arr) {

		return 0;
	}
}
