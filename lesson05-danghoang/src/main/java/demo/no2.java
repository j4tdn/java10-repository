package java10.lesson05_danghoang;

public class no2 {
	public static void main(String[] args) {
		int arr1[] = { 3, 2, 1, 6, 5 };
		int arr2[] = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println(getMissingNumber(arr1));
		System.out.println(getMissingNumber(arr2));
	}

	private static int getMissingNumber(int[] arr) {
		int n = arr.length;
		int sum = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < n; i++) {
			sum = sum - arr[i];
		}
		return sum;

	}
}

	
	
	
	
	
	
	
	
	
	