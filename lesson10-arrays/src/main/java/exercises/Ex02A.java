package exercises;

public class Ex02A {
	public static void main(String[] args) {
		int[][] a = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{1, 9, 0, 9},
				{2, 9, 6, 5},
				{1, 2, 4, 5}
		};
		print(a);
		System.out.println("=====================");
		magic(a);
		print(a);
	}
	
	private static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void magic(int[][] a) {
		for (int row = 0; row < a.length; row++) {
			int rowPos = -1;
			int colPos = -1;
			for (int col = 0; col < a[0].length; col++) {
				if (a[row][col] == 0) {
					rowPos = row;
					colPos = col;
				}
			}
			if (rowPos != -1) {
				// set row values = 0
				for (int zeroRow = 0; zeroRow < a.length; zeroRow++) {
					a[zeroRow][colPos] = 0;
				}
				// set column values = 0
				for (int zeroColumn = 0; zeroColumn < a[0].length; zeroColumn++) {
					a[rowPos][zeroColumn] = 0;
				}
				break;
			}
		}
	}
}
