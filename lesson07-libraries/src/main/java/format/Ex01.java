package format;

import java.text.NumberFormat;
import java.util.Locale;

import static java.text.NumberFormat.*;

public class Ex01 {
	public static void main(String[] args) {
		double number = 12345678987654323456789d;
		System.out.println("default: " + Locale.getDefault());
		NumberFormat[] nfs = {
				getInstance(),
				getNumberInstance(),
				getCurrencyInstance(new Locale("vi", "VN"))
		};
		System.out.println("origin:  " + number);
		for (NumberFormat nf : nfs){
			System.out.println(nf.format(number));
		}
	}
}
