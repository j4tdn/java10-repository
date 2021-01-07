package datetime;

import static java.util.Calendar.*;

import java.util.Calendar;

import utils.DateUtils;

/*
 * 4. Đếm xem tháng hiện có bao nhiêu chủ nhật.
 * 	  In ra thông tin dd/MM/yyyy
 */
public class Ex04 {
	public static void main(String[] args) {
		// start: 07.01.2020
		Calendar start = Calendar.getInstance();
		// start: 01.01.2020
		start.set(Calendar.DAY_OF_MONTH, start.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		// end: 07.01.2020
		Calendar end = Calendar.getInstance();
		// end: 31.01.2020
		end.set(Calendar.DAY_OF_MONTH, end.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);
		// before means smaller than
		while(start.before(end)) {
			if(start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(DateUtils.toString(start));
			} else {
				// find first Sunday
				start.add(Calendar.DAY_OF_MONTH, 1);
			}
						
		}
		
	}
}
