package data.type;

import bean.HandInteger;

public class Ex06 {
	public static void main(String[] args) {
		// how many object were created ?
		// = amout of memories are create in heap
		Integer a = 10;
		HandInteger b = null;
		String c = new String("hello");
		int d = 10;
		HandInteger e = new HandInteger(100);
		HandInteger f = b;
	}
}
