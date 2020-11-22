package data.type;

import bean.HandInteger;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandInteger origin = new HandInteger(11); // x1
		System.out.println("1origin : " + origin);
		doSomething(origin);
		System.out.println("2origin : " + origin);
	}

// static : luôn khởi tạo hàm này
	// HandInteger origin = origin;
	private static void doSomething(HandInteger origin) {
		origin.value = 68;
		System.out.println("3origin : " + origin);
		HandInteger hand = new HandInteger(72);
		System.out.println("4Hand : " + hand);
		origin = hand;
		System.out.println("5origin : " + origin);
		System.out.println("6Hand : " + hand);
		origin.value = 88;
		System.out.println("7origin : " + origin);
	}

	/*
	 * Giải thích:
	 * - hai biến origin là hai biến khác nhau ở stack
	 * chú ý : 2 ô nhớ trên head
	 * 
	 */

	// stack: origin (x1)
	// origin (x2)
	// heap
	// x1 = 68

	// x2 = 88
	//

	// heap

}
