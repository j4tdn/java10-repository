package exam;

public class Exercise02 {
	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 1, 6, 5 };
		int[] arr2 = {3, 7, 9, 2, 1, 6, 5, 4, 10};
		int result = 0;
		boolean flat = false;
		do {
			for (int i = 0; i < arr1.length; i++) {
				result = arr1[i] + 1;
				if (missingNumbers(arr1, result, i)) {
					flat = true;
					System.out.println("Missing number: " + result);
					break;
				}

			}
		} while (!flat);

	}

	public static boolean missingNumbers(int[] arr, int result, int position) {
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if (arr[j] != result && i != j) {
					return true;
				}
			}
		}
		return false;
	}
}
