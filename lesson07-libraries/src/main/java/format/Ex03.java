package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
public static void main(String[] args) {
	BigDecimal bdOne=BigDecimal.ONE;
	BigDecimal bdRand=BigDecimal.valueOf(25369.2536d);
	System.out.println("bdOne: "+bdOne);
	System.out.println("bdSix: "+bdRand);
	System.out.println("Round 1: "+bdRand.setScale(1, RoundingMode.HALF_UP));
	System.out.println("Round 3: "+bdRand.setScale(3, RoundingMode.HALF_UP));
}
}
