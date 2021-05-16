package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex01 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int[] digits1 = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };
		int[] digits2 = { 5, 7, 9, 10, 20, 9, 7, 11};
		//Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N

		System.out.println(Arrays.toString(distinct(digits1).toArray()));
		System.out.println("=====================");
		// Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N
		System.out.println(Arrays.toString(multiple(digits2).toArray()));
		System.out.println("=====================");
		
	}

	private static List<Integer> distinct(int[] digits) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int digit : digits) {
			map.put(digit, map.containsKey(digit) ? map.get(digit) + 1 : 1);
		}

		for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				result.add(entry.getKey());
			}
		}
		return result;
	}
	private static List<Integer> multiple(int[] digits) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int digit : digits) {
			map.put(digit, map.containsKey(digit) ? map.get(digit) + 1 : 1);
		}
		
		for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				result.add(entry.getKey());
			}
		}
		return result;
	}
	
	
}
