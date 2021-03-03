package list;

import java.util.ArrayList;
import java.util.List;

public class A01 {
	public static void  main(String[] args) {
		//before 1.5: raw type ==> không hỗ trợ bắt lỗi tại compile ==> 
		List list = new ArrayList();
		list.add(1);
		list.add("a");
		list.add(2d);
		
		for(Object object : list) {
			System.out.println((Integer)object*2);
		}
		// after 1.5: generic type
		List<Integer> digits = new ArrayList<>();
		digits.add(1);
		// note generic type supports to catching errors at compile time
		for(Integer digit : digits) {
			System.out.println((digit*2));
		}
	}
}
