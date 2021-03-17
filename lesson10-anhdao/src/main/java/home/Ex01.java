package home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 3, 4, 3, 1, 9, 7, 8 };

		System.out.println(Arrays.toString(distinct(digits).toArray()));

		int[] numbers = { 1, 9, 12, 4, 8, 10 };
		insertionSort(numbers);

		int max = numbers[numbers.length - 1];
		int count = 0;

		for (int i = numbers.length - 1; i >= 0; i--) {
			if (numbers[i] < max) {
				count++;
				max = numbers[i];
				if (count == 2) {
					System.out.println("third max: " + numbers[i]);
					break;
				}
			}
		}
		
		List<Integer> sortedList = new ArrayList<>();
		for(int number: numbers) {
			sortedList.add(number);
		}
		Set<Integer> set = new LinkedHashSet<>(sortedList);
		for(Integer item: set) {
			System.out.println(item + " ");
		}
		sortedList = new ArrayList<>(set);
		System.out.println("\nthird max: "+ sortedList.get(sortedList.size()-3));
	}
    //int[] 
	

	private static List<Integer> distinct(int[] digits) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int digit : digits) {
			map.put(digit, map.containsKey(digit) ? map.get(digit) + 1 : 1);
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				result.add(entry.getKey());
			}
		}
		return result;
	}

	private static void insertionSort(int[] digits) {
		int valToInsert;
		int posToInsert;
		for (int i = 0; i < digits.length; i++) {
			valToInsert = digits[i];
			posToInsert = i;
			while (posToInsert > 0 && digits[posToInsert - 1] > valToInsert) {
				digits[posToInsert] = digits[posToInsert - 1];
				posToInsert--;
			}
			if (posToInsert != i) {
				digits[posToInsert] = valToInsert;
			}
		}
	}
}
