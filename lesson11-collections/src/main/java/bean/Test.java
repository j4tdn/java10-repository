package bean;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		// Tổng 110 ngày + 10 ngày nghỉ tết = 120 ngày
		// Không tính chủ nhật
		LocalDate ldate = LocalDate.of(2020, 11, 3);
		System.out.println("Ngày bắt đầu: " + ldate);
		int day = 1;
		while (day < 120) {
			if (ldate.getDayOfWeek() != DayOfWeek.SUNDAY) {
				day += 1;
			}
			ldate = ldate.plusDays(1);
		}
		System.out.println("Ngày kết thúc: " + ldate);
		
	}
}
