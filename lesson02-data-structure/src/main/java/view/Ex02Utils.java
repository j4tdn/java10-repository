package view;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex02Utils {
	// access modifier: phạm vi truy cập
	// public,private
	//private : Dung trong pham vi cua class
	//public: Dung dc o moi noi
	//static method: nó thuộc về class (Dùng class đó . chấm cái hàm đó được)-ClassName.staticMethod())
	// non-static method: thể hiện của cái lớp gọi được cái phương thức này
	private static LocalDate getCurrentDay() {
		return LocalDate.now();
	}
	public static LocalTime getCurrentTime() {
		return LocalTime.now();
	}
}
