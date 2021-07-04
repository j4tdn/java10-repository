package format;

import java.text.DecimalFormat;

public class Ex02 {
	public static void main(String[] args) {
		double number = 456123456.7d;
		DecimalFormat df = new DecimalFormat("0,000.##");
		String result = df.format(number);
		System.out.println("result: " + result);
	}
}
