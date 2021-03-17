package home;

import java.util.HashSet;
import java.util.Set;

public class Ex02B {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };
		forIndex2D(a);
		System.out.println("=================================");
		Set<Integer> rows = new HashSet<>();
		Set<Integer> cols = new HashSet<>();

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] == 0) {
					rows.add(row);
					cols.add(col);
				}
			}
		}
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (rows.contains(row) || cols.contains(col)) {
					a[row][col] = 0;
				}
			}
		}
		
		forIndex2D(a);
	}

	public static void forIndex2D(int[][] items) {
		System.out.println();
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				System.out.print(items[row][col] + " ");
			}
			System.out.println();
		}
	}
}
