package format;

import java.text.DecimalFormat;

public class Ex02DecimalFormat {
	public static void main(String[] args) {
		double number = 6123456.7891d;
		DecimalFormat df = new DecimalFormat("#,###.00#");
		System.out.println(df.format(number));
	}
}
