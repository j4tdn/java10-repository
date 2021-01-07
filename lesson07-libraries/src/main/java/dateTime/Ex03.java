package dateTime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex03 {
public static void main(String[] args) {
	Calendar now = Calendar.getInstance();
	Date today = new Date();
	
	Date dateResult = DateUtils.toDate(now);
    Calendar calendarResult = DateUtils.toCalendar(today);
	
	
	System.out.println("dateResult: "+ dateResult);
	System.out.println("calendarResult: "+ calendarResult);
	
	// calendar || date ==> String format
	System.out.println("formatted date : " + DateUtils.toString(today));
	System.out.println("formatted calendar : " + DateUtils.toString(now));

	Date stringToDate = DateUtils.toDate("20.10.2020");
	System.out.println("string to date: " + stringToDate);
	
	Calendar stringToCalendar = DateUtils.toCalendar("20.10.2020");
	System.out.println("string to date: " + stringToCalendar);
}
}
