package format;

import java.text.NumberFormat;
import java.util.Locale;

import static java.text.NumberFormat.*;

public class Ex01 {
	public static void main(String[] args) {
		double number = 123456789876543889999098877799000076d;
		NumberFormat [] nfs = {
			getInstance(),
			getNumberInstance(),
			getCurrencyInstance(new Locale("vi", "VN"))
			
		};
		System.out.println(+ number);

		System.out.println("=====================");
		
		for (NumberFormat nf: nfs) {
			System.out.println(nf.format(number));
		}
	}
}
