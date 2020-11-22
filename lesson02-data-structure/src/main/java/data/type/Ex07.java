package data.type;

import bean.HandInteger;

public class Ex07 {
	public static void main(String[] args) {
		HandInteger origin = new HandInteger(11);
		System.out.println("main: "  + origin);
		doSomething(origin);
		System.out.println("dosomething:" + origin);

	}
	//origin (main) -> x1 (68)
	//hand x2 (72)
	// origin(dosomething) -> x2 (72)
	// origin(dosomething)  -> x2 (88)
	//
	
	private static void doSomething(HandInteger origin) {
		origin.value = 68;
		HandInteger hand = new HandInteger(72);
		origin = hand;// gán địa chỉ ô nhớ hand cho origin
		hand.value = 88;
	
		System.out.println("origin:" + origin);
		System.out.println("hand:" + hand);
	}
}
