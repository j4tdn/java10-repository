package list;

import java.util.ArrayList;
import java.util.List;

public class A1 {
	public static void main(String[] args) {
		// before 1.5
		List list = new ArrayList();
		list.add(1);
		list.add("a");
		list.add(2d);

		// after 1.5
		List<Integer> digits = new ArrayList<>();
		digits.add(1);
		
		
		for (Integer digit : digits) {
			System.out.println(digit *2);
			
		}
		
		//note: generic type support to catching errors at compile times
		
	}
}