package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex04 {
	// Dem xem thang hien co bao nhieu ngay chu nhat
	// In ra thong tin dd/MM/yyyy
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(Calendar.DAY_OF_MONTH, 1);
		
		Calendar end = Calendar.getInstance();
		end.set(Calendar.DAY_OF_MONTH, end.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);
		while(start.before(end)) {
			if(start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(DateUtils.toString(start));
			}
			start.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
