package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		// before 1.5: raw type
		List list = new ArrayList();	// object
		list.add(1);
		list.add("a");
		list.add(2.5d);
		for (Object object : list) {
			System.out.println((Integer)object*2);
			
		}
		
		// after 1.5: generic type
		List<Integer> digits = new ArrayList<>();
		digits.add(10);
//		digits.add("a");
		
		// note: generic type bat loi tai compile.
	}
}
