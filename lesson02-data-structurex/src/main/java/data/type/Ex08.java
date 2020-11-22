package data.type;

import bean.HandInteger;

public class Ex08 {
	//global variable : bien toan cuc => attribute : thuoc tinh
	//local variable : bien cuc bo
	private static int x=10; //bien toan cuc
	private static void demo() {
		int x=10; // bien cuc bo trong pham vi cua demmo
		if(x>5) {
			//bien cuc bo trong pham vi dk x>5
			int y=10;
		}
		System.out.println("x=: " +x );
	}
	private static void test() {
		System.out.println("x=: " +x );
	}
	
  public static void main(String[] args) {
	  // cannot change value
	final int a=10;
	// cannot modify object's address
	final HandInteger hand= new HandInteger(20);
	hand.value=99;
}
}
