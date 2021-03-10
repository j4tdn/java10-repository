package generic;

import java.util.function.Predicate;

public class GClassDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Ilist<Integer> digits = new JavaList<>();
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
			public boolean test(Integer t) {
				
				return t > 30;
			}
		});
	
        System.out.println(count);
}
}
