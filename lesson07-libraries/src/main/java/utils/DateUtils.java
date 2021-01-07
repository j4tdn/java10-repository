package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class DateUtils {
	private DateUtils() {

	}

	/**
	 * Covert calendar to date
	 */
	public static Date toDate(Calendar c) {
		Objects.requireNonNull(c, "calendar can not be null");
		return c.getTime();
	}

	/**
	 * Covert string to date Formated: dd.MM.yyyy
	 */
	public static Date toDate(String s) {
		Objects.requireNonNull(s, "text can not be null");
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		Date date = null;
		try {
			date = df.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * Covert date to calendar
	 */
	public static Calendar toCalendar(Date date) {
		Objects.requireNonNull(date, "date can not be null");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	/**
	 * Covert string to calendar Formated: dd.MM.yyyy
	 */
	public static Calendar toCalendar(String s) {
		Objects.requireNonNull(s, "date can not be null");
		return toCalendar(toDate(s));
	}

	/**
	 * Covert date to string
	 */
	public static String toString(Date date) {
		Objects.requireNonNull(date, "date can not be null");
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		return df.format(date);
	}

	/**
	 * Covert Calendar to string
	 */
	public static String toString(Calendar c) {
		Objects.requireNonNull(c, "calendar can not be null");
		return toString(c.getTime());
	}

	public static boolean isLeapYear(int year) {
		GregorianCalendar g = new GregorianCalendar();
		return g.isLeapYear(year);
	}
}
