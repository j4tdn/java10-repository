package datetime;

// import all non-private static methods, attributes from class Calendar
// except Calendear class
import static java.util.Calendar.*;
import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {
		// start: 07.01.2020
		Calendar start = getInstance();
		//start: 01.01.2020
		start.set(DAY_OF_MONTH, start.getActualMinimum(DAY_OF_MONTH));
		
		// end: 07.01.2020
		Calendar end = getInstance();
		//end: 31.01.2020
		end.set(DAY_OF_MONTH, end.getActualMaximum(DAY_OF_MONTH));
		
		while(start.before(end)) {
			if(start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY);
			 	System.out.println(DateUtils.toString(start));
			 	start.add(DAY_OF_MONTH, 7);
		} 
		 
			start.add(DAY_OF_MONTH, 1);
	}
}
