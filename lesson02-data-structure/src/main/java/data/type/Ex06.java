package data.type;

import bean.HandInteger;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// how many objects were crated?
//		 == amount of memories are create in heap : 3
		Integer a = 10; // +
		HandInteger b = null; // ko chứa trên head
		String c = new String("hello"); // ++
		int d = 10; // tạo biến bình thường
		HandInteger e = new HandInteger(100);// +++
		HandInteger f = b; // ko chứa trên head
	}

}
