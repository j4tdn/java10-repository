package format;

import java.text.NumberFormat;
import java.util.Locale;

import static java.text.NumberFormat.*;

public class Ex01NumberFormat {
	public static void main(String[] args) {
		double number = 1234567890000000000000d;
		System.out.println(Locale.getDefault());
		
		NumberFormat[] nfs = {getInstance(), getNumberInstance(), getCurrencyInstance(new Locale("vi", "Vn"))};
		
		System.out.println(number);
		for (NumberFormat nf : nfs) {
			System.out.println(nf.format(number));
		}
	}
}
