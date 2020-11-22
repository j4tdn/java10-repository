package data.type;

import bean.HandInteger;

public class Ex08 {
	
	private static int x = 20;
	
	private static void demo() {
		// local variable
		int x = 10;
		if(x > 5) {
			int y = 10;
		}
	}
	
	public static void main(String[] args) {
		// primitive
		// object
		
		final int a = 10;
		//a = 20;
		
		// cannot modify object's address
		final HandInteger hand = new HandInteger(20);
		hand.value = 10;
	}
}
