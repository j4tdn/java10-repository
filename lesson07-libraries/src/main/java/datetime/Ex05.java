package datetime;

import utils.DateUtils;
// kiểm tra xem năm đó có phải năm nhuận hay không
public class Ex05 {
	public static void main(String[] args) {
		int year = 2010;
		System.out.println("isLeapYear: " + DateUtils.isLeapYear(year));
		
	}
}
