package data.type;

import bean.HandInteger;

public class Ex07 {
	public static void main(String[] args) {
		HandInteger origin = new HandInteger(11);
		doSomething(origin);
		System.out.println(origin);
	}
	
	private static void doSomething(HandInteger origin) {
		origin.value = 68; // thay doi heap x1 = 68
		HandInteger hand = new HandInteger(72); //tao o nho x2
		origin = hand;  // gan origin phia duoi o nho x2 
		hand.value = 88;  // o nho x2 = 88
		System.out.println("inside void :"+origin);
	}

}
