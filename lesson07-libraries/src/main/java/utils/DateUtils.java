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
	 * Convert calendar to date
	 */

	public static Date toDate(Calendar c) { 
		Objects.requireNonNull(c, "calendar cannt be null.");
		return c.getTime();
	}

	/**
	 * 
	 * Convert string to date Formated: đ.MM.yyyy
	 */

	public static Date toDate(String s) {
		Objects.requireNonNull(s, "text date cannt be null.");
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		Date date = null;
		try {
			date = df.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * Convert date to calendar
	 */

	public static Calendar toCalendar(Date date) {
		Objects.requireNonNull(date, "date cannot be null.");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	
	/**
	 * 
	 * Convert string to calendar
	 */
	public static Calendar toCalendar(String s) {
		Objects.requireNonNull(s, "date cannot be null.");
		return toCalendar(toDate(s));
	}


	/**
	 * Convert date to string // 07-Jan-21 => 07.01.2021 | 07/01/2021 || 2021-01-07
	 */

	public static String toString(Date date) {
		Objects.requireNonNull(date, "date cannt be null.");
		// Thu Jan 07 23:05:35 ICT 2021
		DateFormat df = new SimpleDateFormat("EEE LLL dd HH:mm:ss z yyyy");
		return df.format(date);
	}

	public static String toString(Calendar c) {
		Objects.requireNonNull(c, "calendar cannt be null.");
		return toString(c.getTime());
	}

	public static boolean isLeapTear(int year) {
		GregorianCalendar g = new GregorianCalendar();
		return g.isLeapYear(year);
	}
}
