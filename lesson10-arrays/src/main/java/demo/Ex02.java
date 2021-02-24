package demo;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		Reverse(arr);
	}

	private static void Reverse(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}

			System.out.print(arr[i] + " ");
		}
	}
}
