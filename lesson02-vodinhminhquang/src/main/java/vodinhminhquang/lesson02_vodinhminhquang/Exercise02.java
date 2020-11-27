package vodinhminhquang.lesson02_vodinhminhquang;

import java.math.BigInteger;

//Viết chương trình tính tổng S = 4! +7! + 12! + 18!

public class Exercise02 {
	public static void main(String[] args) {
		long S = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("S = 4! + 7! + 12! + 18! = " + S);
	}
	
	public static long factorial(int number) {		
		long P = 1;
		for (int i = number; i > 0; i--){
			P *= i;
		}
		return P;
	}
}
