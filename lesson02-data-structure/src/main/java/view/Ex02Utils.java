package view;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex02Utils {
	// access modifier: phạm vi truy cập
	// public, private
	// private: Class scope
	// public: everywhere
	// static method: Classname.staticMethod()
	// non-static method: instance of class could call method
	
	public LocalDate getCurrentDate() {
		return LocalDate.now();
	}

	public static LocalTime getCurrentTime() {
		return LocalTime.now();
	}
}
