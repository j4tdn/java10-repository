package data.type;

import Bean.HandInteger;

public class Ex07 {
  public static void main(String[] args) {
	  HandInteger origin = new HandInteger(11);
	  doSomething(origin);
  }
  
  //static
  //java document
  private static void doSomething(HandInteger origin) {
	   origin.value = 68;
	   HandInteger hand = new HandInteger(72);
	   origin.value = 72;
	   hand.value = 88;
}
			  
			  
}

