package view;

import java.time.LocalDate;
import java.time.LocalTime;


public class Ex02Utils {
	
	// access modifier: phạm vi truy cập
	// public, private
	// private: class scope
	// public: every where
	// static: belongs to class
	// static method: ClassName.staticMethod()
	// none-static method: instance of class could call method
	public static LocalDate getCurrentDate() {
		return LocalDate.now();

	}

	public LocalTime getCurrentTime() {
		return LocalTime.now();

	}
}	

