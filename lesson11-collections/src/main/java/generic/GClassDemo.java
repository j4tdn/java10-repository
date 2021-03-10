package generic;

import java.util.function.Predicate;

public class GClassDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		System.out.println("size: " + digits.size());
		digits.add(10);
		digits.add(20);
		digits.add(30);
		digits.add(40);
		digits.add(50);
		System.out.println("size: " + digits.size());
		digits.iterate();
		
		// functional interface
		int count = digits.count(digit -> digit > 30);
		
		System.out.println("count: " + count);
		digits.remove(3);
		digits.iterate();
		digits.removeIf(digit -> digit > 20);
		digits.iterate();
	}
}
