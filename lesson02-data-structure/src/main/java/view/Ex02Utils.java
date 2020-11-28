package view;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex02Utils {
	// access modifiler : phạm vi truy cập
	// public, private
	public static LocalDate getCurrentData() {
		return LocalDate.now();
	}
	public static LocalTime getCurrentTime() {
		return LocalTime.now();
	}
}
