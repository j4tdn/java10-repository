package defintion;

import static utils.ArrayUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		int[] digits = { 1, 6 };
		
		doSomethong(digits);

		forEach(digits);
		// A: 1, 6 >><<
		// B: 20, 6 >><<
		// C: 1, 20 >><<
	}

	private static void doSomethong(int[] items) {
		items[0] = 20;
	}
}
