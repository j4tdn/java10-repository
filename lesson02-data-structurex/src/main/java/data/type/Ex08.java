package data.type;

import bean.handInteger;

public class Ex08 {
	
	// global variable => JAVA: attribute
	// local variable
	
	private static void demo() {
		// local variable
		int x = 99;
		if(x > 5) {
			int y = 10;
		}
		System.out.println("x: "+ x);
	}
	
	
	public static void main(String[] args) {
		//primitive
		//object
		// cannot change value
		
		final int a = 10;
		//a = 20; error
		
		// cannot modify object's address
		final handInteger hand = new handInteger(15);
		hand.value = 99;
		//hand = null; error
		
	}

}
