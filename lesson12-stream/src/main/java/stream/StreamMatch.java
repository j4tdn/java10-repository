package stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamMatch {
	public static void main(String[] args) {
		int[] digits = {1, 2, 1, 77, 5, 8, 10, 4, 12};
//		1: is there any element that is divisible by 10
		boolean anyMatch = Arrays.stream(digits).anyMatch(d -> d % 10 == 0);
		System.out.println(anyMatch);
		
//		2: find the first element that is divisible by 4
		OptionalInt opInt = Arrays.stream(digits).filter(d -> d % 4 == 0).findFirst();
		if (opInt.isPresent()) {
			System.out.println(opInt.getAsInt());
		}
		
//		3: find the element that is divisible by 5 in the list
		OptionalInt opInt2 = Arrays.stream(digits).filter(d -> d % 5 == 0).findAny();
		if (opInt2.isPresent()) {
			System.out.println(opInt2.getAsInt());
		}
		
//		4: does all elements less than 100
		boolean allMatch = Arrays.stream(digits).allMatch(d -> d < 100);
		System.out.println(allMatch);
		
//		5: does no elements greater than 0
		boolean noneMatch = Arrays.stream(digits).noneMatch(d -> d > 0);
		System.out.println(noneMatch);
	}
}
