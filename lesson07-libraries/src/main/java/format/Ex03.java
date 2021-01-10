package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
	public static void main(String[] args) {
		BigDecimal bd = BigDecimal.ONE;
		BigDecimal bd1 = BigDecimal.valueOf(12345.2329d);
		
		System.out.println("Round 1 :" + bd1.setScale(3, RoundingMode.HALF_UP));
		System.out.println("Round 1 :" + bd1.setScale(1, RoundingMode.HALF_UP));
		
		System.out.println("Round 2 :" + bd);


	}
}
