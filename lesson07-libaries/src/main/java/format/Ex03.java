package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
	public static void main(String[] args) {
		BigDecimal bdOne = BigDecimal.ONE;
		BigDecimal bdSix = BigDecimal.valueOf(25369.2536d);
		
		System.out.println("bdOne: " + bdOne);
		System.out.println("bdSix: " + bdSix);
		
		System.out.println("Round1: " + bdSix.setScale(1, RoundingMode.HALF_UP));
		System.out.println("Round3: " + bdSix.setScale(3, RoundingMode.HALF_UP));
	}
}
