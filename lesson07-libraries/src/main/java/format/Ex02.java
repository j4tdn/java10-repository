package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex02 {
public static void main(String[] args) {
	System.out.println("default: "+Locale.getDefault());
	double number=456123456.7268d;
	DecimalFormat df= new DecimalFormat("#,###.000");
	String result=df.format(number);
	System.out.println("result: "+result);
}
}
