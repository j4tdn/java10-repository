package ex01;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex01 {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 0; i < 101; i++);
			System.out.print("\r\n" + "Nhập số phần tử: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("\r\n" + "Nhập số phần tử: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = scanner.nextInt();
		}
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			addElement(map, arr[i]);
		}
		System.out.print("\r\n" + "các phần tử chỉ xuất hiện một lần duy nhất trong mảng: ");
		for (Integer key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.print(key + " ");
			}
		}
	}

	public static void addElement(Map<Integer, Integer> map, int element) {
		if (map.containsKey(element)) {
			int count = map.get(element) + 1;
			map.put(element, count);
		} else {
			map.put(element, 1);
		}
	}
}
