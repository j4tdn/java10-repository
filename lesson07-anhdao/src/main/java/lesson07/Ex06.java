package lesson07;

import java.util.Calendar;

/**
 * 6. Lịch nghỉ tết âm lịch: 20/12 AL = 01/02/2021 Tính số buổi học từ ngày hiện
 * tại đến 01/02/2021
 */
public class Ex06 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MONTH, 1);
		Calendar tetHoliday = Calendar.getInstance();
		tetHoliday.set(2021, 02, 01);
		int count = 0;
		while (now.before(tetHoliday)) {
			if (now.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || now.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
				++ count;
			}
			now.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println(" Số buổi học đến tết: " + count);

	}

}
