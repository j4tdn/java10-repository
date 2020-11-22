package dataType;

import bean.HandInteger;

public class Ex07 {
	public static void main(String[] args) {
		HandInteger origin = new HandInteger(11);
		doSomething(origin);
	}
	
	private static void doSomething(HandInteger origin) {
		origin.value = 68;
		HandInteger hand = new HandInteger(72);
		origin = hand;
		hand.value = 88;
	}
}
