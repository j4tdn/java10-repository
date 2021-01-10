package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex03 {
	// String-Calendar-Date
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Date today = new Date();
		
		Date dateResult = DateUtils.toDate(now);
		Calendar cResult = DateUtils.toCalendar(today);
		
		System.out.println("dateResult: " + dateResult);
		System.out.println("cResult: " + cResult);
		
		// calendar||date => string format
		System.out.println("formatted date: " + DateUtils.toString(today));
		System.out.println("formatted calendar: " + DateUtils.toString(now));
		
		Date stringToDate = DateUtils.toDate("30.10.2020");
		Calendar stringToCalendar = DateUtils.toCalendar("18.10.2020");
		System.out.println("stringToDate: " + stringToDate);
		System.out.println("stringToCalendar: " + stringToCalendar);
	}
}