package Ex03;

import java.util.Scanner;

public class Main {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter row number: ");
		int row = ip.nextInt();
		System.out.print("Enter column number: ");
		int col = ip.nextInt();

		int A[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter A [" + i + "]" + "[" + j + "] = ");
				A[i][j] = ip.nextInt();
			}
		}
		System.out.println("Array :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(A[i][j] + "\t");
				if ((j + 1) % 3 == 0) {
					System.out.println();
				}
			}
		}
		Number.maxColumn(A, 0, 0, row, col);
		Number.minRow(A, 0, 0, row, col);
		Number.saddleElement(A, row, col);

	}
}
