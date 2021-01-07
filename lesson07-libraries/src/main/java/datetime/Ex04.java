package datetime;

import java.util.Calendar;

import utils.DateUtils;

//import all non-static methods, attributes from class Calendar
//except Calendar class
import static java.util.Calendar.*;

public class Ex04 {

	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(DAY_OF_MONTH, start.getActualMinimum(DAY_OF_MONTH));

		Calendar end = Calendar.getInstance();
		end.set(DAY_OF_MONTH, end.getActualMaximum(DAY_OF_MONTH));
		end.add(DAY_OF_MONTH, 1);

		while(start.before(end)) {
			
			if(start.get(DAY_OF_WEEK)==SUNDAY) {
				System.out.println(DateUtils.toString(start));
				start.add(DAY_OF_MONTH, 7);
			}else {
				start.add(DAY_OF_MONTH, 1); 
			}
			
		}
	}
}