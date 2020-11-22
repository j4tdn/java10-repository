package data.type;

import bean.HandInteger;

public class Ex08 {

	// global variable: toan bo
	// local variable : cuc bo

	// cuc bo
	//access modifier private int x = 10;
	private static void demo() {
		int x = 10;
		if (x > 5) {
			int y = 10;
//			y la cuc bo
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 1.primitive
		// 2.object
		// final là : hằng số ở stack:
		// 1.can not change value
		// 2.

		final int a = 10;
		//a = 20;
		// can not modify object's address
		final HandInteger hand = new HandInteger(20);
		hand.value = 99;
//		hand = null;
	}
}

// biến là đơn vị lưu trữ trong lập trình
/*
 * Biến là 1 tham chiếu cùng ô nhớ với giá trị của nó trong stack.( kiểu nguyên
 * thủy) Biến là thành phần dùng để xác định dữ liệu và được dùng để tham chiếu
 * đến các giá trị xác định được tạo ra trong chương trình Trong java tất cả các
 * biến khi sử dụng phải được khởi tạo trước - khai báo biến là tạo cho nó một
 * khoảng trắng
 */