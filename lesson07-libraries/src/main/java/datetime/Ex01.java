package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/*1. Lấy thông tin về thời gian với timezone
+ Ngày, Tháng, Năm
+ Giờ 12-24, Phút, Giây
+ Số ngày trong tháng, năm
+ Ngày trong tuần, tháng, năm
+ Tuần trong tháng, năm
+ Ngày đầu tiên trong tuần với locale
=>>> Epoch time*/
public class Ex01 {
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println("date: " + date);
		System.out.println("time: " + date.getTime());

		Calendar cld = Calendar.getInstance(new Locale("vi","VN"));
		cld.set(2020, 9, 15);
		cld.set(cld.MONTH, 7);
		cld.set(cld.DAY_OF_MONTH, 18);
		System.out.println("calender: " + cld);
		System.out.println("time: " + cld.getTimeInMillis());

		// ngay,thang,nam
		int day = cld.get(Calendar.DAY_OF_MONTH);
		int month = cld.get(Calendar.MONTH);
		int year = cld.get(Calendar.YEAR);
		System.out.println(day + "," + month + "," + year);
		// gio ,phut, giay
		int hours = cld.get(Calendar.HOUR);
		int mins = cld.get(Calendar.MINUTE);
		int mil = cld.get(Calendar.MILLISECOND);
		System.out.println(hours + "," + mins + "," + mil);
		// so ngay trong thang,nam
		int nodInMonth = cld.getActualMaximum(Calendar.DAY_OF_MONTH);
		int nodInYear = cld.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(nodInMonth + " , " + nodInYear);
		//ngay trong tuan
		int dow=cld.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: "+dow);
		// ngay dau tien trong tuan voi locate
		
		System.out.println("locate: "+ Locale.getDefault());
		System.out.println("fdow: "+cld.getFirstDayOfWeek());
		System.out.println("time by tz: "+Calendar.getInstance(TimeZone.getTimeZone("europe/berlin")));
	}
}
