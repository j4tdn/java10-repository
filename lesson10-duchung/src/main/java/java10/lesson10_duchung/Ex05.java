package java10.lesson10_duchung;

public class Ex05 {
	public static void main(String[] args) {
		int[] arr = { 1, 9, 3, 4, 5, 2, 8, 7, 0, 10, 6 };
		System.out.println("Selection Sort: ");
		forEach(selectionSort(arr));
		System.out.println("\nInsertion Sort : ");
		forEach(insertionSort(arr));
	}

	private static int[] selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min])
					min = j;
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	private static int[] insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
	
	public static void forEach(int[] arr) {
		for (int element : arr) {
			System.out.print(element + "   ");
		}
	}
}
