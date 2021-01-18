package format;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Locale;
public class Ex02 {
	public static void main(String[] args) {
		double number = 6123456.7268d;
		DecimalFormat df = new DecimalFormat("#,###.000");
		String result = df.format(number);
		System.out.println(result);
		
		System.out.println(Locale.getDefault());
	}
}