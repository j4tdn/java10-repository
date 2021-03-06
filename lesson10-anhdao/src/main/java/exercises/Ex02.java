package exercises;

public class Ex02 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };
		forIndex2D(a);
		System.out.println("=================================");
		forIndex2D(changeMatrix(a));
	}

	public static int[][] changeMatrix(int[][] digits) {
		int countCol = 0;
		int countRow = 0;

		for (int row = 0; row < digits.length; row++) {
			for (int col = 0; col < digits[row].length; col++) {
				if (digits[row][col] == 0) {
					while (countCol < digits[row].length) {
						digits[row][countCol++] = 0;
					}
					while (countRow < digits.length) {
						digits[countRow++][col] = 0;
					}
				}
			}
		}
		return digits;

	}

	public static void forIndex2D(int[][] items) {
		System.out.println();
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				System.out.print(items[row][col] + " ");
			}
			System.out.println();
		}
	}
}
