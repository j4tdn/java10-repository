package data.type;

import bean.HandInteger;

public class Ex08 {
	//access modifier
	private static int x = 10;
	//global variable
	//local variable
	private static void test() {
		System.out.println(x);
	}
	private static void demo() {
		//local variable
		int x = 10;
		if (x > 5) {
			int y = 10;
		}
		System.out.println(x);
	}
	public static void main (String[] args) {
		//final is allocated in STACK
		//cannot change value
		final int a = 10;
		//cannot modify object's address
		final HandInteger hand = new HandInteger(20);
		hand.value = 99;
	}
}
