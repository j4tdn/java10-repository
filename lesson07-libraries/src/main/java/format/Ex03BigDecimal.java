package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03BigDecimal {
	public static void main(String[] args) {
		BigDecimal bdOne = BigDecimal.ONE;
		BigDecimal bdRand = BigDecimal.valueOf(1234522.6789d);
		BigDecimal bdBig = BigDecimal.valueOf(123456789987654321123456789d);
		
		System.out.println(bdOne);
		System.out.println(bdRand);
		System.out.println("round 1: " + bdRand.setScale(1, RoundingMode.HALF_UP));
		System.out.println("round 3: " + bdRand.setScale(3, RoundingMode.HALF_UP));
		System.out.println(bdBig);
	}
}
