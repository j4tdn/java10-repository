package data.type;

import bean.HandInteger;

public class Ex07 {
 public static void main(String[] args) {
	HandInteger origin = new HandInteger(11);
	doSomething(origin);	
	//origin=68 
}
  private static void doSomething(HandInteger origin) {
	    origin.value=68; //x1
		HandInteger hand = new HandInteger(72);
		origin =hand; //x2
		hand.value=88;
}
}
