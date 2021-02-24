package utils;

public class ArraysUtils {
	private ArraysUtils() {
	}
	
	public static void forIndex(int[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.println("items[" + i + "]: " + items[i]);
		}
	}
	
	public static void foreach(int[] items) {
		for (int i : items) {
			System.out.println(i);
		}
	}
	
	public static void forIndex2D(int[][] items) {
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[0].length; col++) {
				System.out.print(items[row][col] + "  ");
			}
			System.out.println();
		}
	}
}
