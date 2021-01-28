package defintion;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = new int[5];
		int[] numbers = { 2, 5, 8, 4 };

		System.out.println("digits length: " + digits.length);
		System.out.println("number length: " + numbers.length);
		System.out.println("class:  " + digits.getClass());
		System.out.println("numbers[2]: " + numbers[2]);
		System.out.println("digits[3]: " + digits[3]);

		forEach(numbers);
		forIndex(numbers);
		
	}

	// for-index
	private static void forIndex(int[] items) {
		System.out.println();
		for (int i = 0; i < items.length; i++) {
			System.out.print("a[" + i + "] = " + items[i] + " ");
		}
	}

	// for-each
	private static void forEach(int[] items) {
		System.out.println();
		for (int item : items) {
			System.out.print(item + " ");
		}
	}
}
