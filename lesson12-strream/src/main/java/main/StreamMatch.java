package main;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamMatch {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 1, 4, 5, 8, 10, 4, 12 };
		// 1st: is there any element that is divisible by 10
		// anyMatch
		boolean anymatch = Arrays.stream(digits)
				.anyMatch(digit -> digit % 10 == 0);
		System.out.println("anymatch: " + anymatch);

		// 2nd: find the first element that is divisible by 4
		// findfirst
		OptionalInt opInt = Arrays.stream(digits)
				.filter(digit -> digit % 4 == 0)
				.findFirst();
		if (opInt.isPresent()) {
			System.out.println("Value: " + opInt.getAsInt());
		}

		// 3nd: find the element that is divisible by 5 in the list
		OptionalInt opInt3 = Arrays.stream(digits)
				.filter(digit -> digit % 5 == 0)
				.findAny();
		if (opInt3.isPresent()) {
			System.out.println("opInt3: " + opInt3.getAsInt());
		}

		// 4th: does all elements less than 100
		//allmatch
		boolean allmatch = Arrays.stream(digits).allMatch(digit -> digit < 100);
		System.out.println("allMatch: " + allmatch);

		// 5th: does no elements greater than 0
		//nonematch
		boolean nonematch = Arrays.stream(digits)
				.noneMatch(digit -> digit < 0);
		System.out.println("nonematch: " + nonematch);

	}
}