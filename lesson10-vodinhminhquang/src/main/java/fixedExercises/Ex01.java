package fixedExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 3, 4, 3, 1};
		distinct(digits);
		System.out.println(Arrays.toString(distinct(digits).toArray()));
		
		System.out.println("================");
		int[] numbers = {1, 9, 12, 8, 4, 10};
		insertionSort(numbers);
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}

	private static List<Integer> distinct(int[] digits) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

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
		int valueToInsert;
		int posToInsert;
		for (int i = 0; i < digits.length; i++) {
			valueToInsert = digits[i];
			posToInsert = i;

			while (posToInsert > 0 && digits[posToInsert - 1] > valueToInsert) {
				digits[posToInsert] = digits[posToInsert - 1];
				posToInsert--;
			}
			
			if(posToInsert != i) {
				digits[posToInsert] = valueToInsert;
			}
		}
	}
}
