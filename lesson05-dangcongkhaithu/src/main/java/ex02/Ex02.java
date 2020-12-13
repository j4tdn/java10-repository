package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 6, 5 };
		int result = getMissingNumber(arr);
		System.out.println(result);
	}

	private static int getMissingNumber(int[] arr) {
		int n = arr.length;
		int sum = (n + 1) * (n + 2) / 2;
		int sumArr = 0;
		for (int i = 0; i < arr.length; i++) {
			sumArr += arr[i];
		}
		return sum - sumArr;
	}
}
