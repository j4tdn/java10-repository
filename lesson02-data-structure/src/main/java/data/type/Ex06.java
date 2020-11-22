package data.type;

import bean.HandInteger;

public class Ex06 {
	public static void main(String[] args) {
		// how many object were create?
		// = amount of memories are create in heap
		Integer a = 10; // +
		HandInteger b = null;// no
		String s = new String("hello");// ++
		int d = 10;// no
		HandInteger e = new HandInteger(100);// +++
		HandInteger f = b;// no
		Integer k = 10;// no
	}
}
