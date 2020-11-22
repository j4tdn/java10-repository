package view;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex02Utils {
	// public access modifier: pham vi truy cap 
	// public, private
	// private: class scope
	// public :everywhere
	// static: ClassName.staticMethod()
	//non-static method: instance of class could call method
	private static LocalDate getCurrentDate() {
		return LocalDate.now();
	}

	public  LocalTime getCurrentTime() {
		return LocalTime.now();
	}

}
