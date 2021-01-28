package defintion;

import static utils.ArrayUtils.*;

public class Ex05 {
	public static void main(String[] args) {
		// 1 dimensions
		int[] a = { 1, 2, 3 };

		// 2 dimensions
		// rows:3, columns:2
		int[][] b = { { 1, 2 }, { 4, 5,6 }, { 7, 8,9 } };
		forIndex2D(b);
	}
}
