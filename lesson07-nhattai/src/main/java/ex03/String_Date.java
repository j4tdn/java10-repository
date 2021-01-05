package ex03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String_Date {
	public static void main(String[] args) throws ParseException {
		// Date ==> String
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dateString = df.format(date);

		System.out.println("Ngày hiện tại: " + dateString);
		final DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		// String ==> Date
		Date date1 = df1.parse(dateString);
		System.out.println("date = " + date1);
	}
}
