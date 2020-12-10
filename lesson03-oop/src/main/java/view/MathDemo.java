package view;

import utils.MathUtils;

public class MathDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int x = MathUtils.sum(a, b);
		System.out.println(x);
		
		MathUtils m4 = new MathUtils(a, b);
		int r4 = m4.calculate();
		
//		MathUtils m1 = new MathUtils();
//		int r1 = m1.sum(a, b);
//		
//		MathUtils m2 = new MathUtils();
//		int r2 = m2.sum(a, b);
//		
//		MathUtils m3 = new MathUtils();
//		int r3 = m3.sum(a, b);
	}
}
