package datetime;

import java.util.Calendar;

import utils.DateUtils;

// import all non-private static methods, attributes from class Calendar 
import static java.util.Calendar.*;


public class Ex04CountSunday {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(DAY_OF_MONTH, 1);
		
		Calendar end = Calendar.getInstance();
		end.set(DAY_OF_MONTH, start.getActualMaximum(DAY_OF_MONTH));
		end.add(DAY_OF_MONTH, 1);
		
		while (start.before(end)) {
			if (start.get(DAY_OF_WEEK) == SUNDAY) {
				System.out.println(DateUtils.toString(start));
				start.add(DAY_OF_MONTH, start.getActualMaximum(DAY_OF_WEEK));;
			} else {
				// find first Sunday
				start.add(DAY_OF_MONTH, 1);
			}
		}
	}
}
