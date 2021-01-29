package definition;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = new int[5];
		int[] numbers = { 2, 5, 8, 4 };

		System.out.println("digits length: " + digits.length);
		System.out.println("number length: " + numbers.length);
		System.out.println("class: " + digits.getClass());
		System.out.println("numbers[2]: " + numbers[2]);
		forIndex(digits);
		forEach(numbers);
	}

	private static void forIndex(int[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.println("items[" + i + "]: " + items[i]);
		}
	}

	private static void forEach(int[] items) {
		for (int i : items) {
			System.out.println(i);
		}
	}
}