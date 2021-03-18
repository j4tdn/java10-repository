package home;

public class Ex02A {
	public static void main(String[] args) {

		int[][] digits = { { 1, 2, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };

		for (int row = 0; row < digits.length; row++) {
			int rp = -1;
			int cp = -1;
			for (int col = 0; col < digits[0].length; col++) {
				if (digits[row][col] == 0) {
					rp = row;
					cp = col;
					break;
				}
			}
			if (rp != -1) {
				// set row values = 0;
				for (int zR = 0; zR < digits.length; zR++) {
					digits[zR][cp] = 0;
				}

				// set col values = 0;
				for (int zC = 0; zC < digits[0].length; zC++) {
					digits[rp][zC] = 0;
				}
				break;
			}
		}
		print(digits);
	}

	private static void print(int[][] a) {
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}
}
