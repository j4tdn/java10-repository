package ex01;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		int[] input1 = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };
		int[] uniqueNumbers = getNumbersWithPredicate(input1, number -> number == 1);
		int[] uniqueNumbers2 = getNumbersWithPredicate(input1, amount -> amount > 1);
		System.out.println("Cac phan tu xuat hien 1 lan: ");
		show(uniqueNumbers);
		System.out.println("Cac phan tu xuat hien nhieu lan: ");
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
