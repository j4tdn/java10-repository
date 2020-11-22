package data.type;

import bean.HandInteger;

public class Ex06 {
	//how many objects were created
	//amount of memories are created in HEAP
	//3 cai: 9, 11, 13
	Integer a = 10;
	HandInteger b = null;
	String c = new String("hello");
	int d = 10;
	HandInteger e = new HandInteger(100);
	HandInteger f = b;
}
