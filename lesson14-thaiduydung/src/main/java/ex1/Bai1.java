package ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bai1 {

	public static Set<Integer> demNhieuLan(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					set.add(arr[i]);
				}
			}
		}
		return set;
	}

	public static List<Integer> dem1Lan(int[] arr, List<Integer> list) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					list.remove((Integer) arr[i]);
					list.remove((Integer) arr[j]);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };
		Set<Integer> set = demNhieuLan(arr);
		for (Integer integer : set) {
			System.out.println(integer);
		}
		System.out.println("===================");
		List<Integer> list = new ArrayList<Integer>();
		for (Integer integer : arr) {
			list.add(integer);
		}
		list = dem1Lan(arr, list);
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}
