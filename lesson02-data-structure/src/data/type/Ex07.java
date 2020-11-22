package data.type;

import bean.HandInteger;

public class Ex07 {

	public static void main(String[] args) {
		HandInteger origin = new HandInteger(11);
		doSomething(origin);
	}
	
	// static
	// java document
	// origin: x1 (68)
	// hand: x2 (88)
	// origin: x2
	private static void doSomething(HandInteger origin) {
		origin.value = 68;
		HandInteger hand = new HandInteger(72);
		origin = hand;
		hand.value = 88;
	}
}
