package defintion;

import  static utils.ArrayUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		int[] digits = { 1, 6 };
		
		doSomeThing(digits);
		
		forEach(digits);
		
	}
	
	private static void doSomeThing(int[] items) {
		items[0] = 20;
	}
}
