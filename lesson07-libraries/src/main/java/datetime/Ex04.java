package datetime;

import java.util.Calendar;

import utils.DateUtils;

import static java.util.Calendar.*; // import all non-private static method attributes from class Calendar

public class Ex04 {
	public static void main(String[] args) {
		// đếm xem tháng hiện tại có bao nhiêu ngày chủ nhật.
		// In ra thông tin dd//MM/yyyy
		Calendar start = Calendar.getInstance();
		start.set(DAY_OF_MONTH, 1);

		Calendar end = Calendar.getInstance();
		end.set(DAY_OF_MONTH, end.getActualMaximum(DAY_OF_MONTH));
		end.add(DAY_OF_MONTH, 1);
		while (start.before(end)) {
			if (start.get(DAY_OF_WEEK) == SUNDAY) {
				System.out.println(DateUtils.toString(start));
				start.add(DAY_OF_MONTH, 7);
			} else {
				start.add(DAY_OF_MONTH, 1);
			}
		}
	}
}
