package java10.datetime;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class ex03 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Date today = new Date();
		Date dateResult = DateUtils.toDate(now);
		Calendar cResult = DateUtils.toCalendar(today);
		
		System.out.println("dateResult: " +dateResult);
		System.out.println("cResult: " +cResult);
		
		System.out.println("formatted date: "+ DateUtils.toString(today));
		System.out.println("formatted calendar: " + DateUtils.toString(now));
		Date stringToDate = DateUtils.toDate("20.10.2020");
		Date stringToCalendar = DateUtils.toCalendar("20.10.2020");
		System.out.println("stringToDate: " +stringToDate);
		System.out.println("stringToCalendar: " + stringToCalendar);
	}
}
