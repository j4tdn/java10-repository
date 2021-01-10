package datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex03 {
	// String-Calender-Date
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Date today = new Date();
		
		Date dateResult = DateUtils.toDate(now);
		Calendar cResult = DateUtils.toCalendar(today);

		System.out.println("dateResult: " + dateResult);
		System.out.println("cResult: " + cResult);
		
		// calender || date => string format
		System.out.println("formatred date: " + DateUtils.toString(today));
		System.out.println("formatred Calendar: " + DateUtils.toString(now));
    
		Date stringToDate = DateUtils.toDate("3200.1000.2000");
		Calendar stringToCalendar = DateUtils.toCalendar("3200.1000.2000");
		System.out.println("stringToDate: " + stringToDate);
		System.out.println("stringToDate: " + stringToDate);
	}
}