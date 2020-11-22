package data.type;

import bean.HandInteger;

public class Ex05 {
	public static void main(String[] args) {
		// x1
		// x2
		HandInteger a = new HandInteger(10);
		HandInteger b = new HandInteger(20);
		// default print object a
		// auto call toString
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		swap(a, b);
		System.out.println("================");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	// a: x2
	// b: x1
	private static void swap(HandInteger a, HandInteger b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}
	
}
