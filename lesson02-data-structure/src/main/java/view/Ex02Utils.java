package view;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex02Utils {
	// access modifier
	// public, private
	// private: Class scope
	// public: everywhere
	
	// static: ClassName.staticMethod()
	// non-static: instance of class could call method
	private static LocalDate getCurrentDate() {
		return LocalDate.now();
	}

	public static LocalTime getCurrentTime() {
		return LocalTime.now();
	}
}
