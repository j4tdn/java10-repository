package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class DateUtils {
	// just focus on input and output
	// don't care about constructor
	private DateUtils() {
		
	}
	
	/*
	 * Convert Calendar to Date
	 */
	
	
	
	public static Date toDate(Calendar c) {
		// equivalents to if (throw new ...)
		Objects.requireNonNull(c, "c cannot be null");
		return c.getTime();
	}
	
	/*
	 * Convert Date to Calendar
	 */
	
	
	
	public static Calendar toCalendar(Date date) {
		// equivalents to if (throw new ...)
		Objects.requireNonNull(date, "date cannot be null");
		// construct a calendar (date as up moment)
		Calendar c = Calendar.getInstance();
		
		// assigns c (Calendar) having the same time with date  
		c.setTime(date);
		return c;
	}
	
	/*
	 * Convert Date to String
	 * Eg: 07-Jan-21 => 07.01.2021 || 07/01/2021 || 2021-01-07
	 */
	
	public static String toString(Date date) {
		Objects.requireNonNull(date, "date cannot be null");
		DateFormat df = new SimpleDateFormat("EEE LLL dd HH:mm:ss z yyy");
	
		return df.format(date);
	}
	public static String toString (Calendar c) {
		Objects.requireNonNull(c, "Calendar cannot be null");
		return toString(c.getTime());
	}
	
	/*
	 * Convert String to Date
	 */
	public static Date toDate (String s) {
		Objects.requireNonNull(s, "Text date cannot be null");
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		Date date = null;
		
		try {
			date = df.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/*
	 * Convert String to Calendar
	 */
	public static Calendar toCalendar (String s) {
		Objects.requireNonNull(s, "Text date cannot be null");
		return toCalendar(toDate(s));
	}
	
	public static boolean isLeapYear(int year) {
		GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();
		return calendar.isLeapYear(year);
		
	}
	
}
