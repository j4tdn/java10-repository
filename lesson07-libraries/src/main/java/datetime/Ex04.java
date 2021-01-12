package datetime;

import java.util.Calendar.*;

import sun.security.jca.GetInstance;

import java.util.Calendar;
import utils.DateUtils; 
public class Ex04 {
	
public static void main(String[] args) {
	 Calendar start= Calendar.getInstance();
	 start.set(Calendar.DAY_OF_MONTH, start.getActualMinimum(Calendar.DAY_OF_MONTH));
		
		// end: 07.01.2020
		Calendar end = Calendar.getInstance();
		// end: 31.01.2020
		end.set(Calendar.DAY_OF_MONTH, end.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);
		
		while(start.before(end)) {
			if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(DateUtils.toString(start));
				start.add(Calendar.DAY_OF_MONTH, 7);
			} else {
				// find first Sunday
				start.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
	}
}
