package Ex02;

public class MissingNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 5, 4, 3, 8, 9, 6 };
		// System.out.println("ket qua la: " + show(arr));
		check(arr,6);

	}

	public static void check(int arr[], int n) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			count++;
			if (arr[i] == n) {
				//count++;
				System.out.println("phan tu can tim co gia tri"+ (count-1));
			}

		}
	}
}