package data.type;

import Bean.HandInteger;

public class Ex06 {
  public static void main(String[] args) {
	//how many objects were created ?
	// = amount of memories are create in heap
	Integer a = 10;
    HandInteger b = null;
	String c = new String("hello");
	int d = 10;
	HandInteger e = new HandInteger(100);
	HandInteger f = b;
	Integer k = 10;
  }
}
