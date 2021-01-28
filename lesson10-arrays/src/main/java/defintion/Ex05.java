package defintion;

import utils.ArrayUtils;

public class Ex05 {
public static void main(String[] args) {
	// Mảng 1 chiều
	int[] a= {1,2,3};
	
	// Mảng 2 chiều
	//row: 3,columns:3
	int[][] b= {{1,2},{4,5},{7,8}};
	ArrayUtils.forIndex2D(b);
}
}
