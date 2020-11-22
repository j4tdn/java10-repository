package data.type;

import bean.handInteger;

public class Ex05 {
	
	
	public static void main(String[] args) {
		handInteger a = new handInteger(10);
		handInteger b = new handInteger(20);
		
		//default print object a
		//auto call to string
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		swap(a, b);
		System.out.println("==========" );
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	private static void swap(handInteger a, handInteger b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;	
	}
}
