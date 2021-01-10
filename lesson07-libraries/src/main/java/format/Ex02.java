package format;

import java.text.DecimalFormat;

public class Ex02 {
	public static void main(String[] args) {
		double number = 6123456789.7268d;
		DecimalFormat df = new DecimalFormat("#,####.000");
		String result = df.format(number);
		System.out.println("result:  " + result);
	}
}
