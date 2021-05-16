package demo;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		// Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N
		int[] input1 = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };
		int[] uniqueNumbers = getNumbersWithPredicate(input1, number1 -> number1 == 1);
		int[] uniqueNumbers2 = getNumbersWithPredicate(input1, number2 -> number2 > 1);
		show(uniqueNumbers);
		System.out.println("===========");
		show(uniqueNumbers2);
	}

	private static int[] getNumbersWithPredicate(int[] numbers, Predicate<Long> predicate) {
		int[] result = Arrays.stream(numbers).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> predicate.test(entry.getValue())).mapToInt(entry -> entry.getKey()).toArray();
		return result;
	}

	private static void show(int[] numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
