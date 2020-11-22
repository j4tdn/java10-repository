package data.type;

import bean.handInteger;

public class Ex06 {
	public static void main(String[] args) {
		// how many objects were created ?
		// = amount of memories are create in heap
		Integer a = 10; // +
		handInteger b = null;
		String c = new String("hello"); //++
		int d = 10;
		handInteger e = new handInteger(100); //+++`
		handInteger f = b;
		Integer k = 10;
		// dap an : 3
	}

}
