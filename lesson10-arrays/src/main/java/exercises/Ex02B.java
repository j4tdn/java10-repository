package exercises;

import java.util.HashSet;
import java.util.Set;

public class Ex02B {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 1, 9, 0, 9 }, { 2, 9, 6, 0 }, { 1, 2, 4, 5 } };
		print(a);
		System.out.println("=============================");
		
		Set<Integer> rows = new HashSet<>();
		Set<Integer> cols = new HashSet<>();

		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				if (a[row][col] == 0) {
					rows.add(row);
					cols.add(col);
				}
			}
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				if (rows.contains(row) || cols.contains(col)) {
					a[row][col] = 0;
				}
			}
		}
		print(a);
	}

	private static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
