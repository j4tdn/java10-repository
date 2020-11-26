package view;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex02Utils {
	private static LocalDate getLocalDate() {
		return LocalDate.now();
	}

	public static LocalTime getCurrentTime() {
		return LocalTime.now();
	}
}
