package format;
import java.text.NumberFormat;
import java.util.Locale;
import static java.text.NumberFormat.*;

public class Ex01 {
	public static void main(String[] args) {
		double number = 1234567898765432123456789d;

		System.out.println("default: " + Locale.getDefault(Locale.Category.FORMAT));
		NumberFormat[] nfs = { getInstance(), getNumberInstance(), getCurrencyInstance() };

		System.out.println("origin: " + number);
		for (NumberFormat nf : nfs) {
			System.out.println(nf.format(number));
		}
	}
}
