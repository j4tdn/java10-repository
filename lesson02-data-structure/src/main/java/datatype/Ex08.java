package datatype;

import bean.HandInteger;

public class Ex08 {
	public static void main(String[] args) {
		// final => stack
		
		// cannot change value
		final int a = 10;
		// a = 9;
		
		final HandInteger hand = new HandInteger(9);
		hand.value = 10;
	}
}
