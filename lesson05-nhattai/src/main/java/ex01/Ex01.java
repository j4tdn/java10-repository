package ex01;

public class Ex01 {
	public static void main(String[] args) {
		int [] a = {3, 15, 21, 0, 15, 17, 21};
		uniqueNumber(a);
	}
	public static int[] uniqueNumber(int arr[]) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				if (arr[i] != arr[i + 1]) {
					System.out.println("Element appears only once : " + arr[i]);
				}
			}

			else if (i == arr.length - 1) {
				if (arr[i] != arr[i - 1]) {
					System.out.println("Element appears only once : " + arr[i]);
				}
			}

			else {
				if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {

					System.out.println("Element appears only once : " + arr[i]);
				}

			}

		}
		return arr;
	}
}


