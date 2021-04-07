package defintion;

import utils.ArrayUtils;

public class Ex05 {
	public static void main(String[] args) {
		// 1 dimension
		int[] a = { 1, 2, 3 };

		// 2 dimensions
		// rows: 3, columns: 2
		int[][] b = { { 1, 2 }, { 4, 5, 6 }, { 7, 7, 8 } };
		ArrayUtils.forIndex2D(b);
	}
}
