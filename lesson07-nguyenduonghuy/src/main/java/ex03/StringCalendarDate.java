package ex03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StringCalendarDate {
	public static void main(String[] args) {
		Date date = Calendar.getInstance(new Locale("vi", "VN")).getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("ss:mm:HH - dd/MM/yyyy");
		String s = sdf.format(date);
		System.out.println(s);
	}
}
