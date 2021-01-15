package datetime;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex03StringCalendarDate {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Date today = new Date();
		
		Date dateResult = DateUtils.toDate(now);
		Calendar calResult = DateUtils.toCalendar(today);
		
		System.out.println(dateResult);
		System.out.println(calResult);
		
		// calendar/ date -> String
		System.out.println("Formatted Date: " + DateUtils.toString(now));
		System.out.println("Formatted Calendar: " + DateUtils.toString(today));
		
		// string to date
		Date stringToDate = null;
		try {
			stringToDate = DateUtils.toDate("20/11/2020");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(stringToDate);
		
		//string to calendar
		Calendar cal = null;
		try {
			cal = DateUtils.toCalendar("11/02/2000");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cal);
	}
}
