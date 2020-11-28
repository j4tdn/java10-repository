package data.type;

import bean.HandInteger;

public class Ex08 {
	public static void main(String[] args) {
		//primitive
		//object
		// cannot change value
		private static void demo() {
		a = 20;
		// cannot midify object's address
		final HandInteger hand = new HandInteger(20);
		hand.value = 99;		
		hand = null;
	}
}

