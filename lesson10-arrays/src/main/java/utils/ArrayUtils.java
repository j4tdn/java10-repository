package utils;

public class ArrayUtils {
	private ArrayUtils() {

	}

	// for-index
	public static void forIndex(int[] items) {
		System.out.println();
		for (int i = 0; i < items.length; i++) {
			System.out.print("items" + "[" + i + "] = " + items[i] + "   ");
		}
	}

	// for-each
	public static void forEach(int[] items) {
		System.out.println();
		for (int item : items) {
			System.out.print(item + "   ");
		}
	}

	public static void forIndex2D(int[][] itmes) {
		for (int row = 0; row < itmes.length; row++) {
			for (int col = 0; col < itmes[row].length; col++) {
				System.out.print(itmes[row][col]);
			}
			System.out.println();
		}
	}
}