package definition;

import utils.ArrayUtils;

public class Ex05 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 }; // mang 1 chieu
		// mang 2 chieu
		// rows:3, columns:2
		int[][] b = { { 1, 2 }, { 4, 5, 6 }, { 7, 7, 8 } };
		ArrayUtils.forIndex2D(b);
		;
	}
}
