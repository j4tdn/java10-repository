package format;

import java.text.NumberFormat;
import java.util.Locale;

import static java.text.NumberFormat.*;

public class Ex01 {
	public static void main(String[] args) {
		double number = 1234567898765432123456789d;
		System.out.println("dafault: "+ Locale.getDefault());
		NumberFormat[] nfs = {
				getInstance(),
				getNumberInstance(),
				getCurrencyInstance(new Locale("vi","VN")),
		};
		
		for (NumberFormat nf: nfs) {
			System.out.println(nf.format(number));
		}
	}
}
