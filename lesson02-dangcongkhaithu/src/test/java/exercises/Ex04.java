package exercises;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = { 5, 1, 1, 9, 11, 20, 19, 17, 21, 30 };
		arr = getOdds(arr);
		arr = sort(arr);

		System.out.println("Số lẻ lớn thứ hai là: " + arr[arr.length - 2]);

	}

	private static int[] getOdds(int[] arr) {
		int results[] = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				results[count++] = arr[i];
			}
		}
		return results;
	}

	private static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
}
