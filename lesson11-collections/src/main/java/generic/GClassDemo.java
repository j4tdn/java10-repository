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
		int count = digits.count(new Predicate<Integer>() {

			@Override
			public boolean test(Integer digit) {
				// TODO Auto-generated method stub
				return digit>30;

			}

		});
		System.out.println("count: " + count); 
		digits.removeIf(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t>30;
			}
		});
	}
	
}
