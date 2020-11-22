package data.type;

import bean.HandInteger;

public class Ex08 {
	
	// global variable => JAVA: attribute
	// local variable
	
	// access modifier
	private static int x = 10;
	
	private static void demo() {
		// local variable
		int x = 99;
		if (x > 5) {
			int y = 10;
		}
		System.out.println("x: " + x);
	}
	
	private static void test() {
		System.out.println("x: " + x);
	}
	
	public static void main(String[] args) {
		// primitive
		// object
		// final: => stack
		// cannot change value
		final int a = 10;
		// a = 20;
		
		// cannot modify objects's address
		final HandInteger hand = new HandInteger(20);
		hand.value = 99;
		// hand = null;
	}
}
