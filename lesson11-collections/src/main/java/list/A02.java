package list;

import java.util.ArrayList;
import java.util.List;

public class A02 {
	public static void main(String[] args) {
		List<Integer> digits = new ArrayList<>();
		System.out.println("size: " + digits.size());

		System.out.println("code 1:" + System.identityHashCode(digits));

		digits.add(12);
		digits.add(14);
		digits.add(16);

		System.out.println("digits[1]: " + digits.get(1));
		digits.set(1, 41);
		digits.remove(0);

		System.out.println("digits[1]: " + digits.get(1));
		System.out.println("code 2:" + System.identityHashCode(digits));
		System.out.println("size: " + digits.size());
	}
}
