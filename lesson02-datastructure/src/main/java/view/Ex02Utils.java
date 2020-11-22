package view;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex02Utils {
	// access modifier: Phạm vi truy cập 
	// public, private
	// private: Class, Scpoe
	// public: everywhere
	// static method: ClassName.StaticMethed
	//non-static method: instance of class could call method
	
	public LocalDate getCurrentDate() {
		return LocalDate.now();
	}
	
	public static LocalTime getCurrentTime() {
		return LocalTime.now();
	}
}
