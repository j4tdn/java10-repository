package format;

import java.text.NumberFormat;
import java.util.Locale;

import static java.text.NumberFormat.*;
public class Ex01 {
	public static void main(String[] args) {
		double number = 1234567898554851123456d;
		
		NumberFormat[] nfs= {
				getInstance(),
				getNumberInstance(),
				getCurrencyInstance(new Locale("vi","VN"))
		};
		for(NumberFormat nf:nfs) {
			System.out.println(nf.format(number));
		}
	}
}
