package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 3, 4, 3, 1, 9, 7, 8 };
		System.out.println(Arrays.toString(distinct(digits).toArray()));
		
		insertionSort(digits);
		System.out.println(Arrays.toString(digits));
	}

	private static List<Integer> distinct(int[] digits) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();

		for (int digit : digits) {
			map.put(digit, map.containsKey(digit) ? (map.get(digit) + 1) : 1);
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				result.add(entry.getKey());
			}
		}
		return result;
	}
	
	private static void insertionSort(int[] digits) {
		int value = 0;
		int pos = 0;
		for (int i = 0; i < digits.length; i++) {
			value = digits[i];
			pos = i;
			while (pos > 0 && digits[pos - 1] > value) {
				digits[pos] = digits[pos - 1];
				pos--;
			}
			if (pos != i) {
				digits[pos] = value;
			}
		}
	}
}
