package lesson03_exercises_Ex03;

import java.util.Scanner;

public class saddleElement {
	public static void main(String[] args) {
		int i, j, n, m, kt = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines for the array: ");
		n = scanner.nextInt();
		System.out.println("Enter the number of columns for the array: ");
		m = scanner.nextInt();
		int[][] a = new int[n][m];
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.print("Enter the th element[" + i + ", " + j + "]: ");
				a[i][j] = scanner.nextInt();
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				if (a[i][j] == findMinRow(a, i, m) && a[i][j] == findMaxColumn(a, n, j)) {
					System.out.println("Element a[" + i + "," + j + "] is a saddle point \n");
					kt++;
				}
		}
		if (kt == 0)
			System.out.println("\n There are no saddle points");

	}

	private static int findMaxColumn(int a[][], int maxline, int j) {
		int k, max = a[0][j];
		for (k = 1; k < maxline; k++)
			if (a[k][j] > max)
				max = a[k][j];
		return max;
	}

	private static int findMinRow(int a[][], int i, int maxcolume) {
		int k, min = a[i][0];
		for (k = 1; k < maxcolume; k++)
			if (a[i][k] < min)
				min = a[i][k];
		return min;
	}

}