package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex03 {
	public static void main(String[] args) {
		// Calendar - Date
		Calendar now = Calendar.getInstance();
		Date today = new Date();
		Date dateResult = DateUtils.toDate(now);
		Calendar cResult = DateUtils.toCalendar(today);

		System.out.println("dateResult: " + dateResult);
		System.out.println("cResult: " + cResult);
		
		// calendar || date => string format
		System.out.println("formatted date: " + DateUtils.toString(today));
		System.out.println("formatted calendar: " + DateUtils.toString(now));
		
		Date stringToDate = DateUtils.toDate("07.01.2021");
		Calendar stringToCalendar = DateUtils.toCalendar("07.01.2021");
		System.out.println("stringToDate: " + stringToDate);
		System.out.println("stringToCalendar: " + stringToCalendar);
	}
}
