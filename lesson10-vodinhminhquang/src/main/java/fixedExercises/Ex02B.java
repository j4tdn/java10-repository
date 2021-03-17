package fixedExercises;

import java.util.HashSet;
import java.util.List;

public class Ex02B {
	public static void main(String[] args) {
		int[][] digits = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 0, 8, 7 }, 
				{ 1, 9, 0, 9 }, 
				{ 2, 9, 6, 5 }, 
				{ 1, 0, 4, 5 } };

		HashSet<Integer> rows = new HashSet<>();
		HashSet<Integer> cols = new HashSet<>();
		for (int row = 0; row < digits.length; row++) {
			for (int col = 0; col < digits[0].length; col++) {
				if (digits[row][col] == 0) {
					rows.add(row);
					cols.add(col);
				}
			}
		}

		for (int row = 0; row < digits.length; row++) {
			for (int col = 0; col < digits[0].length; col++) {
				if (rows.contains(row) || cols.contains(col)) {
					digits[row][col] = 0;
				}
			}
		}
		print(digits);
	}
	private static void print(int[][] a) {
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				System.out.print(a[row][col] + "  ");
			}
			System.out.println();
		}
	}

}
