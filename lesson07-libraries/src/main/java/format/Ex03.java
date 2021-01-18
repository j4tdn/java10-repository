package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
	public static void main(String[] args) {
		// Alt + Shift + R: rename all a number of variable
		// setScale là làm tròn đến bao nhiều chữ số
		// RoundingMode là kiểu làm tr
		BigDecimal bdOne = BigDecimal.ONE;
		BigDecimal bdRand = BigDecimal.valueOf(25369.2536d);
		
		System.out.println("bdOne: " + bdOne);
		System.out.println("bdSix: " + bdRand);
		System.out.println("Round1: " + bdRand.setScale(1, RoundingMode.HALF_UP));
		System.out.println("Round3: " + bdRand.setScale(3, RoundingMode.HALF_UP));
	}
}
