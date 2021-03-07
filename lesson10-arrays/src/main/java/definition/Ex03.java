package definition;

import utils.ArrayUtils;

public class Ex03 {
	public static void main(String[] args) {
		int[] digits = {1, 6};
		
		doSomething(digits);
		
		   
		ArrayUtils.forEach(digits);
	}
	
	private static void doSomething(int[] items) {
		items[0] = 20;
	}
}