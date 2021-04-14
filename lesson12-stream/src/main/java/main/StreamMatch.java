package main;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamMatch {
	public static void main(String[] args) {
		// Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
		int[] digits = { 1, 2, 1, 95, 5, 8, 10, 4, 12 };

		// is there any element that is divisible by 10 (anyMatch)
		boolean anyMatch = Arrays.stream(digits)
				.anyMatch(digit -> digit % 10 == 0);
		System.out.println("anyMatch: " + anyMatch);

		// find the first element that is divisible by 4
		OptionalInt optInt = Arrays.stream(digits)
		.filter(digit -> digit % 4 == 0)
		.findFirst();
		
		if(optInt.isPresent()) {
			System.out.println("value: "+ optInt.getAsInt());
		}

		// find the element that is divisible by 5 in the list
		OptionalInt optInt3 = Arrays.stream(digits)
				.filter(digit -> digit % 5 == 0)
				.findAny();
		
		if(optInt3.isPresent()) {
			System.out.println("value is divisible by 5: "+ optInt.getAsInt());
		}

		// does all elements less than 100
		boolean allLessthan100 = Arrays.stream(digits)
				.allMatch(digit -> digit < 100);
		System.out.println("allmatch: " + allLessthan100);

		// 5th: does no elements greater than 0
		// noneMatch
		boolean noGreaterZero = Arrays.stream(digits)
				.noneMatch(digit -> digit > 0);
		System.out.println("anyMatch3: " +noGreaterZero);
	}

}
