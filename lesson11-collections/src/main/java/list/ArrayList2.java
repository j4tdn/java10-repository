package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
	public static void main(String[] args) {
		List<Integer> digits = new ArrayList<>();
		System.out.println("size: " + digits.size());
		System.out.println("hashcode 01: " + System.identityHashCode(digits));

		digits.add(10);
		digits.add(12);
		
		System.out.println("digits[1] = " + digits.get(1));
		digits.set(1, 21);
		System.out.println("digits[1] = " + digits.get(1));
		digits.remove(0);
		
		System.out.println("size: " + digits.size());
		System.out.println("hashcode 02: " + System.identityHashCode(digits));
	}
}
