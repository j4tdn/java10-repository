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
	 * Convert Calendar to Date
	 */
	public static Date toDate(Calendar c) {
		Objects.requireNonNull(c, "Calendar cann't be null");
//		if (c == null) {
//			throw new NullPointerException();
//		}
		return c.getTime();
	}
	
	/**
	 * Convert String to Date
	 * Formatted: dd/MM/yyyy
	 * @throws ParseException 
	 */
	public static Date toDate(String s) throws ParseException {
		Objects.requireNonNull(s, "String cann't be null");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.parse(s);
	}
	
	/**
	 * Covert Date to Calendar
	 */
	public static Calendar toCalendar(Date date) {
		Objects.requireNonNull(date, "Date can't be null");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	
	/**
	 * Covert String to Calendar
	 * @throws ParseException 
	 */
	public static Calendar toCalendar(String s) throws ParseException {
		Objects.requireNonNull(s, "Date cann't be null");
		return toCalendar(toDate(s));
	}
	
	/**
	 * Covert Date to String
	 *  07-Jan-21  || 07/01/2021 || 2021.01.07 | ...
	 */
	public static String toString(Date date) {
		Objects.requireNonNull(date, "Date cann't be null");
		// Date -> String
		DateFormat df = new SimpleDateFormat("E dd/MMM/yyyy");
		return df.format(date);
	}
	
	/**
	 * Convert Calendar to String
	 */
	public static String toString(Calendar c) {
		Objects.requireNonNull(c, "Date cann't be null");
		return toString(c.getTime());
	}

	public static boolean isLeapYear(int year) {
		GregorianCalendar g = new GregorianCalendar();
		return g.isLeapYear(year);
	}
}
