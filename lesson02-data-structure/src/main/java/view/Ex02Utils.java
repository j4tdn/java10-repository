package view;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex02Utils {
	//access modifier : phạm vi truy cập
	//public, private
	// private: class scope
	//public: everywhere
	//static method : ClassName.staticMethod()
	//non-static method: instance of class could 
	public static LocalDate getCurrentDate() {
		return LocalDate.now();
	}

	public static LocalTime getCurrentTime() {
		return LocalTime.now();
	}

}
