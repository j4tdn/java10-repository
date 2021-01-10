package format;

import java.text.NumberFormat;
import java.util.Locale;

import static java.text.NumberFormat.*;

public class Ex01 {
	public static void main(String[] args) {
		double number = 123456789876543212345678987654321d;
		
		NumberFormat[] nfs = {
				getInstance(),
				getNumberInstance(),
				getCurrencyInstance(new Locale("vi", "VN")),
		};
		System.out.println("origin: " + number);
		
		for (NumberFormat nf : nfs) {
			System.out.println(nf.format(number));
		}
	}
}
