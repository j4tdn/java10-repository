package main;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.IntPredicate;


public class StreamMatch {
	public static void main(String[] args) {
		int[] digits = {1, 35, 1, 99, 5 , 8, 10, 77, 12};
		// 1st: is there any element that is divisible by 10
		// anyMatch	
		System.out.println(Arrays.stream(digits).anyMatch(new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				return value % 10 == 0;
			}
		}));
		// 2nd: find the first element that is divisible by 4 
		// findFirst
		// OptionalInt --> might be no value be returned --> null pointer exception when we call findFirst
		
		OptionalInt optInt = Arrays.stream(digits)
				.filter(t -> t % 4 == 0)
				.findFirst();
		if(optInt.isPresent()) {
			System.out.println("VALUE: " + optInt.getAsInt());
		}
		
		// 3nd: find the element that is divisible by 5 in the list
		OptionalInt optInt3 = Arrays.stream(digits)
				.filter(digit -> digit % 5 == 0)
				.findAny();
		if(optInt3.isPresent()) {
			System.out.println("Value of case 3: " + optInt3.getAsInt());
		}
		// 4th: does all elements less than 100
		// allMatch
		System.out.println("All numbers less than 100: " + Arrays.stream(digits).allMatch(digit -> digit < 100));
		
		// 5th: does no elements greater than 0
		System.out.println("No numbers greater that zero: " + Arrays.stream(digits).noneMatch(digit -> digit > 0));
		
	}
}
