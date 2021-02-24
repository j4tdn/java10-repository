package definition;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = new int[5];
		int[] numbers = { 2, 5, 8, 4 };
		System.out.println("digits length: " + digits.length);
		System.out.println("numbers length: " + numbers.length);
		System.out.println("class: " + digits.getClass());
		System.out.println("digit[3]" + digits[3]);
		System.out.println("numbers[2]" + numbers[3]);
		forIndex(numbers);
		forEach(numbers);
	}

	// for - index
	private static void forIndex(int[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.print("a[" + i + "] = " + items[i] + "  ");
		}
	}

	// for - each
	private static void forEach(int[] items) {
		System.out.println();
		for (int item : items) {
			System.out.println(item + "  ");
		}
	}

}
