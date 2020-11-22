package data.type;

import bean.handInteger;

public class Ex07 {
	public static void main(String[] args) {
		handInteger origin = new handInteger(11);
		doSomething(origin);
	}
	
	private static void doSomething(handInteger origin) {
		origin.value = 68;
		handInteger hand = new handInteger(72);
		origin = hand;
		origin.value = 88;			
	}

}
