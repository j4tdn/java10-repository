package utils;

public class ArrayUtils {
	private ArrayUtils() {

	}

	// for-index
	public static void forIndex(int[] items) {
		System.out.println();
		for (int i = 0; i < items.length; i++) {
			System.out.print("a[" + i + "] = " + items[i] + "  ");
		}
	}

	// for-each
	public static void forEach(int[] items) {
		System.out.println();
		for (int item : items) {
			System.out.print(item + " ");
		}
	}

	public static void forIndex2D(int[][] items) {
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				System.out.print(items[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void getOdd(int[] items) {
		System.out.println("Các số lẻ trong mảng: ");
		for (int i = 0; i < items.length; i++) {
			if (items[i] % 2 != 0) {
				System.out.println(items[i]);
			}
		}
	}

	public static void getEven(int[] items) {
		System.out.println();
		System.out.println("Các số chẵn trong mảng: ");
		for (int i = 0; i < items.length; i++) {
			if (items[i] % 2 == 0) {

				System.out.println(items[i]);
			}
		}
	}
}
