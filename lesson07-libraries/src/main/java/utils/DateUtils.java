package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

import javax.management.modelmbean.RequiredModelMBean;

public class DateUtils {
	private DateUtils() {
		
	}
	public static Date toDate(Calendar c) {
		Objects.requireNonNull(c,"calendar cant be null.");
		return c.getTime();
	}
	
	public static Date toDate(String s) {
		Objects.requireNonNull(s,"date cant be null.");
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		Date date = null;
		try {
			df.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	* Convert date to String
	 */
	public static String toString(Date date) {
		// 07-Jan-21 => 07.01.2021| 07/01/2021 || 2021-01-07
		Objects.requireNonNull(date,"date can't be null.");
		// date -> string
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		return df.format(date);
		
	}
	public static String toString(Calendar c) {
		// 07-Jan-21 => 07.01.2021| 07/01/2021 || 2021-01-07
		Objects.requireNonNull(c,"calendar can't be null.");
		// date -> string
		return toString(c.getTime());
	}
	
	public static Calendar toCalendar(Date date) {
		// 07-Jan-21 => 07.01.2021| 07/01/2021 || 2021-01-07
		Objects.requireNonNull(date,"date text can't be null.");
		// date -> string
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	
	public static Calendar toCalendar(String s) {
		// 07-Jan-21 => 07.01.2021| 07/01/2021 || 2021-01-07
		Objects.requireNonNull(s,"date text can't be null.");
		// date -> string
		return toCalendar(toDate(s));
	}
	public static String isLeapYear(int year) {
		
		// TODO Auto-generated method stub
		GregorianCalendar g = new GregorianCalendar();
		
		return null;
	}
}
