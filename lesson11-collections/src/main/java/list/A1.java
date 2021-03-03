package list;

import java.util.ArrayList;
import java.util.List;

public class A1 {
	public static void main(String[] args) {
		// before 1.5: raw type
		List list = new ArrayList();
		list.add(1);
		list.add("a");
		list.add(2d);

		for (Object object : list) {
			System.out.println((Integer) object * 2);
		}

		// after 1.5: generic type
		List<Integer> digits = new ArrayList();
		digits.add(1);
		// digits.add("b");

		for (Integer digit : digits) {
			System.out.println(digit * 2);
		}

		// note: generic type supports to catching errors at compile time
	}

}
