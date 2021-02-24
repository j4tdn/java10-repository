package defintion;

import utils.ArraysUtils;

public class Ex05 {
	public static void main(String[] args) {
		// 1 dimension
		int[] a = {1, 2, 3};
		
		// 2 dimension
		int[][] b = {{1, 2, 3}, {4, 5, 6}}; 
		
		ArraysUtils.foreach(a);
		ArraysUtils.forIndex2D(b);
	}
}
