package defintion;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = new int[5];
		int[] numbers = {2, 5, 4, 9};
		
		System.out.println(digits.length);
		System.out.println(numbers.length);
		System.out.println(digits.getClass());
		System.out.println("numbers[2]: " + numbers[2]);
		
		forIndex(digits);
		foreach(numbers);
	}
	
	private static void forIndex(int[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.println("items[" + i + "]: " + items[i]);
		}
	}
	
	private static void foreach(int[] items) {
		for (int i : items) {
			System.out.println(i);
		}
	}
}
