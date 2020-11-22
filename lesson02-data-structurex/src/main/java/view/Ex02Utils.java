package view;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex02Utils {
	// access modifier: pham vi truy cap
	// pubilc, private
	public static LocalDate getCurrentDate() {
		return LocalDate.now();
	}

	public  LocalTime getCurrentTime() {
		return LocalTime.now();
	}
}
