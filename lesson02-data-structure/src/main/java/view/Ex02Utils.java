package view;

import java.time.LocalDate;
//import java.time.LocalDate;
import java.time.LocalTime;

public class Ex02Utils {
	// access modifier: Phạm vi truy cập
	// public private
	// private: Class scope
	// public: everywhere
	// static method: ClassName.staticMethod()
	// non-static method: instance of class could call method
	private static LocalDate getCurrentDate() {
		return LocalDate.now();
	}

	public LocalTime getCurrentTime() {
		return LocalTime.now();
	}

}
