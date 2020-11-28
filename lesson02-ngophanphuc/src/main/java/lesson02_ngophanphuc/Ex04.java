
package lesson02_ngophanphuc;

public class Ex04 {
	public static void main(String[] args) {
		int arr[] = { 6, 2, 3, 4, 9, 6, 2, 13, 15, 25, 51, 33, 8 };
		System.out.println("So le lon nhat thu 2 la: " + OddMax2nd(arr));
	}

	public static int OddMax2nd(int arr[]) {
		int oddMax = 0;
		int length = arr.length - 1;
		
		for (int i = 0; i <= length; i++) {
			for (int j = i + 1; j <= length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}
			if (arr[i] % 2 != 0) {
				oddMax = arr[i];
			}
		}
		
		while (length >= 0) {
			if (arr[length] % 2 != 0 && arr[length] < oddMax) {
				return arr[length];
			}
			length--;
		}
		return 0;
	}
}