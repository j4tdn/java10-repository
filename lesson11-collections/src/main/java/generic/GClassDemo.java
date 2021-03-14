package generic;

import java.util.function.Predicate;

public class GClassDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		System.out.println("Size: " + digits.size());
		
		digits.add(10);
		digits.add(20);
		digits.add(30);
		digits.add(40);
		digits.add(50);
		System.out.println("Size: " + digits.size());
		digits.iterate();
		
		// functional interface
		int count1 = digits.count(digit -> digit > 30);
		System.out.println("count: " +count1);
		
		
		//
		int count = digits.count(new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer digit) {
				return digit > 30;
			}
		});
		System.out.println("count: " +count);
		
		digits.removeIf(digit -> digit > 20);
		digits.iterate();
	}

}
