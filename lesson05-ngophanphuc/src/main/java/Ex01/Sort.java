package Ex01;

public class Sort {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 5, 4, 3, 8, 9, 6 };
		// System.out.println("ket qua la: " + show(arr));
		sort(arr);
		show(arr);

	}

	public static void sort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}

		}
	}

	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[i + 1]) {
					continue;
				}
				System.out.println("..." + arr[i]);
			}

		}
	}
}
