package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class DateUtils {
	public static boolean isLeapYear(int year) {
		GregorianCalendar g = new GregorianCalendar();
		return g.isLeapYear(year);
	}

	private DateUtils() {

	}

	public static Date toDate(Calendar c) {
		Objects.requireNonNull(c, "calendar cannt be null.");
		return c.getTime();
	}

	// convert String ==> Date
	public static Date toDate(String s) {
		Objects.requireNonNull(s, "calendar cannt be null.");
		DateFormat df = new SimpleDateFormat("dd.MM.yy");
		Date date = null;
		try {
			date = df.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Calendar toCalendar(Date date) {
		Objects.requireNonNull(date, "date cannt be null.");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	/**
	 * Convert String to Calendar
	 */

	public static Calendar toCalendar(String s) {
		Objects.requireNonNull(s, "date cannt be null.");
		return toCalendar(toDate(s));
	}

	public static String toString(Date date) {
		Objects.requireNonNull(date, "date cannt be null.");
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy E LLL");
		return df.format(date);
	}

	public static String toString(Calendar c) {
		Objects.requireNonNull(c, "calendar cannt be null.");
		return toString(c.getTime());
	}

}
