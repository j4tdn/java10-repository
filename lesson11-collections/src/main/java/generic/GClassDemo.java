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
		System.out.println("size: " + digits.size());
		digits.iterate();
		
		int count = digits.count(t ->  t > 30);
		
		System.out.println(count);
		
		digits.removeIf(t -> t < 11);
		
		digits.iterate();
	}
}
