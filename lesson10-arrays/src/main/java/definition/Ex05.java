package definition;

import utils.ArrayUtils;

public class Ex05 {
	public static void main(String[] args) {
		//1 dimension
		int[] a = { 1, 2, 3 };
		
		//2 dimension
		//rows: 3, columns: 3
		int[][] b = { { 1, 2 }, { 4, 5 }, { 7, 7 } };

		ArrayUtils.forIndex2D(b);

	}

}
