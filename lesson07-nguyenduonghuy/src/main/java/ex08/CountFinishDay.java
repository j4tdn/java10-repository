package ex08;

import java.util.Calendar;
import java.util.Locale;

import static java.util.Calendar.*;

public class CountFinishDay {
	/**
	 * 	8. Nhóm A nhận được dự án được giao phải hoàn thành trong 110 ngày
   	 *	Mỗi tuần nhân viên được nghỉ làm ngày chủ nhật.
   	 *	Nếu trúng dịp lễ tết sẽ nghỉ từ ngày 25/12 đến 05/01.
	 *	=> Ngày nào nhóm A phải bàn giao dự án ?
	 */
	// 25/12 -> 05/01 âm  =>>  06/02 -> 16/02 => 11 ngày nghỉ
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(new Locale("vi", "VN"));
		cal.set(DAY_OF_MONTH, 7); // Bắt đầu làm từ 07/01
		finishDay(cal);
	}
	
	private static void finishDay(Calendar c) {
		int count = 1;
		while (count <= 110) {
			if (c.get(MONTH) == FEBRUARY && c.get(DAY_OF_MONTH) == 6) {
				c.add(DAY_OF_MONTH, 11);
			}
			if (c.get(DAY_OF_WEEK) != SUNDAY) {
				System.out.print((count++) + " - ");
				System.out.println(c.getTime());
			} 
			c.add(DAY_OF_MONTH, 1);
		}
	}
}
