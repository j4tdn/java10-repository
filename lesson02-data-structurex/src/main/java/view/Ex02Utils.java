package view;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex02Utils {
	// access modifier: pham vi truy cap
	// public, private
	private static LocalDate getCurrentDatte() {
		return LocalDate.now();
	}

	public static LocalTime getCurrentTime() {
		return LocalTime.now();
	}
}
