package data.type;

import bean.HandInteger;

public class Ex08 {

	// global variable=> JAVA: attribute
	private static int x = 10;

	private static void demo() {
		// local variable
		int x = 99;
		if (x > 5) {
			int y = 10;
		}
		System.out.println("x:" + x);
	}

	private static void test() {
		System.out.println("x test" + x);
	}

	public static void main(String[] args) {
		// final => stack
		// primitive : cannot change value
		final int a = 10;
		// a = 20;
		// cannot object's address
		final HandInteger hand = new HandInteger(20);
		hand.value = 99;
		// hand = null;
	}
}