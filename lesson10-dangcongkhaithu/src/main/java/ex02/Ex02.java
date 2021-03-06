package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int[][] input = { { 1, 2, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };
		
		int[][] output = matrix(input);
	
		for (int i = 0; i < output.length; i ++) {
			for (int j = 0; j < output[0].length; j ++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static int[][] matrix(int[][] a) {
		int x = 0;
		int y = 0;
		for (int i = 0; i < a.length; i ++) {
			for (int j = 0; j < a[0].length; j ++) {
				if (a[i][j] == 0) {
					x = i;
					y = j;
					}
				}
			}
		for (int n = 0; n < a[0].length; n ++) {
			a[x][n] = 0;
		}
		for (int n = 0; n < a.length; n ++) {
			a[n][y] = 0;
		}
		return a;
		
	}
	
	

}
