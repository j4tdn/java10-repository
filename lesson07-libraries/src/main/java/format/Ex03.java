package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
public static void main(String[] args) {
	BigDecimal bd = BigDecimal.ONE;
	BigDecimal bdRand = BigDecimal.valueOf(23569.2536d);
	BigDecimal bdOne = BigDecimal.ONE;
	
	System.out.println("bdOne: "+ bdOne);
	System.out.println("bdRand: "+ bdRand);
	System.out.println("Round 1: "+ bdRand.setScale(1, RoundingMode.HALF_UP));
	System.out.println("Round 3: "+ bdRand.setScale(3, RoundingMode.HALF_UP));
	
}
}
