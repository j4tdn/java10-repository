package data.type;

import Bean.HandInteger;
    
public class Ex08 {
	
   private int x = 10;
   private static void demo() {
	   //local variable
	   int x=10;
	   if (x > 5) {
		   int y = 10;
	   }
	   System.out.println("x: " + x);
   }
   
   public static void main(String[] args) {
	// primitive
	// object
	// final: => stack   
	// cannot change value
	final int a = 10;
	// a = 20;
	
	//cannot mordifyobjects's address
    final HandInteger hand = new HandInteger(20);
    hand.value = 99;
    // hand = null;
}
}
