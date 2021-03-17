package ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex01Upgrade {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 3, 4, 3, 1 };
	}

	private static List<Integer> distinct(int[] digits) {
		List<Integer> results = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<>();

		for (int digit : digits) {
			map.put(digit, map.containsKey(digit) ? map.get(digit) + 1 : 1);
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				results.add(entry.getKey());
			}
		}
		return results;
	}
}
