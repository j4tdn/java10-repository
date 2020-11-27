package data.type;

import bean.HandInteger;

public class Ex08 {
			
		//global variable
		//local variable
		public static void demo() {
			//local variable
			int x = 10;
			if (x > 5) {
				int y = 10;
			}
		}
		public static void main(String[] args) {
		// primitive
		// object
		// final: => stack (cho kiểu đối tượng, kiểu nguyên thủy)
		// cannot change value
		final int a = 10;
		//a = 20;
		// cannot modify object's address
		final HandInteger hand = new HandInteger(20); // final là hằng số ở stack
		hand.value = 99;
		//hand = null;
	}
}
