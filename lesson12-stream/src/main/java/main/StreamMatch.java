package main;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamMatch {
	public static void main(String[] args) {
		int[] digits = {1, 35, 1, 99, 5, 8, 10, 77, 12};
		// 1st: is there any element that is divisible by 10
		// anyMatch
		boolean anyMatch = Arrays.stream(digits)
		      .anyMatch(digit -> digit % 10 == 0);
		System.out.println("anyMatch: " + anyMatch);
		
		// 2nd: find the first element that is divisible by 4
		// findFirst
		OptionalInt optInt = Arrays.stream(digits)
			  .filter(digit -> digit % 4 == 0)  
			  .findFirst();
		
		if (optInt.isPresent()) {
			System.out.println("VALUE: " + optInt.getAsInt());
		}
		
		// 3nd: find the element that is divisible by 5 in the list
		OptionalInt optInt3 = Arrays.stream(digits)
				  .filter(digit -> digit % 5 == 0)  
				  .findAny();
		if (optInt3.isPresent()) {
			System.out.println("optInt3: " + optInt3.getAsInt());
		}
		
		// 4th: does all elements less than 100
		// allMatch
		boolean allLessThan100 = Arrays.stream(digits)
			  .allMatch(digit -> digit < 100);
		System.out.println("allLessThan100: " + allLessThan100);
		
		// 5th: does no elements greater than 0
		// noneMatch
		boolean noGreaterThanZero = Arrays.stream(digits)
				.noneMatch(digit -> digit > 0);
		
		// a b => !(a > 0) & !(b > 0) != a < 0 || b < 0
		
		System.out.println("noGreaterThanZero: " + noGreaterThanZero);
		
	}
}
