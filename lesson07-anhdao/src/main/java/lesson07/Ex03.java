package lesson07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 3. Định dạng về thời gian ===>  JAVA07: String-Calendar-Date
 * 
 */
public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		String pattern = "dd/MM/yyyy EEEE hh:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);

		Date date = c.getTime(); // or ==> new Date();
		System.out.println(pattern + ": " + df.format(date));

		// date ==> calendar
		Calendar covert = Calendar.getInstance();
		covert.setTime(date);

	}

}