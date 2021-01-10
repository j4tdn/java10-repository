package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
public static void main(String[] args) {
	BigDecimal bcOne = BigDecimal.ONE;
	BigDecimal bcRand = BigDecimal.valueOf(25369.5546d);
	System.out.println("bcOne:"+bcOne);
	System.out.println("bcSix: "+bcRand);
	System.out.println("Round1: " + bcRand.setScale(1, RoundingMode.HALF_UP));
	System.out.println("Round3: " + bcRand.setScale(3, RoundingMode.HALF_UP));
}
}