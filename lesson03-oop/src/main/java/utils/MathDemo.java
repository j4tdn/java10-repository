package utils;

import utils.MathUtils;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		
		int x = MathUtils.sum(a, b);
//		
//		MathUtils m1 = new MathUtils();
//		int result = m1.sum(a, b);
		
		
		MathUtils u1 = new MathUtils(1,2);
		u1.calculate();
		
		MathUtils u2 = new MathUtils(1,2);
		u2.calculate();
		
		
		
//		System.out.println("result: " +result);

	}

}
