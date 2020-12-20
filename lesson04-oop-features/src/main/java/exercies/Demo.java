package exercies;

public class Demo {
	public static void main(String[] args) {
		// Give an ONE direction
		int[] arr = { 2, 3, 4, 5, 6, 10 };
		int sum = sumArray(arr, a -> a % 2 == 0);

		System.out.println(sum);
	}

	private static int sumArray(int[] arr, Condition condition) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (condition.test(arr[i])) {
				sum += arr[i];
			}
		}
		return sum;
	}
}
