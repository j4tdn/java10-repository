package home;

public class Ex02A {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };
		forIndex2D(a);
		System.out.println("=================================");
		forIndex2D(changeMatrix(a));
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

	public static int[][] changeMatrix(int[][] digits) {
		int rp = -1;
		int cp = -1;
		for (int row = 0; row < digits.length; row++) {
			for (int col = 0; col < digits[row].length; col++) {
				if (digits[row][col] == 0) {
					rp = row;
					cp = col;
					break;
				}

			}
		}
			// set row value =0;
			for (int zr = 0; zr < digits.length; zr++) {
				digits[zr][cp] = 0;
			}
			// set col value =0
			for (int zc = 0; zc < digits[0].length; zc++) {
				digits[rp][zc] = 0;
			}
		
		return digits;

	}

}
