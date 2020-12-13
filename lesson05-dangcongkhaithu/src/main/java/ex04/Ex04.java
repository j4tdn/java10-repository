package ex04;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 5 };

		int result = leastCommonMultipleArray(arr);
		System.out.println(result);
	}

	private static int greatestCommonDivisor(int a, int b) {
		if (a == 0 || b == 0) {
			return a + b;
		}
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

	private static int leastCommonMultiple(int a, int b) {
		return (a * b) / greatestCommonDivisor(a, b);
	}

	private static int leastCommonMultipleArray(int[] arr) {
		int tmp = leastCommonMultiple(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			tmp = leastCommonMultiple(tmp, arr[i]);
		}
		return tmp;
	}
}
