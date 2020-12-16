package lesson05;

public class Ex02 {

	public static void main(String[] args) {
		int[] a = { 3, 2, 1, 6, 5 };
		int result = getMissingNumber(a);
		System.out.println(result);
	}

	private static int getMissingNumber(int[] a) {
		int n = a.length;
		int sum = (n + 1) * (n + 2) / 2;
		int sumA = 0;
		for (int i = 0; i < a.length; i++) {
			sumA += a[i];
		}
		return sum - sumA;
	}

}
