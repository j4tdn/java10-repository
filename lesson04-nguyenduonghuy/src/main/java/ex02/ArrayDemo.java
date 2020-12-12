package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayDemo {
	private static Scanner sc = new Scanner(System.in);
	private static Random rd = new Random();

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			arr.add(rd.nextInt(51));
		}
		System.out.println("Array: " + arr.toString());

		ConditionArray div7 = (i) -> i % 7 == 0 && i % 35 != 0;
		ConditionArray div5 = (i) -> i % 5 == 0 && i % 35 != 0;
		ConditionArray other = (i) -> i % 35 == 0 || (i % 7 != 0 && i % 5 != 0);
		
		result.addAll(conArr(arr, div7));
		result.addAll(conArr(arr, other));
		result.addAll(conArr(arr, div5));
		System.out.println("Array: " + result.toString());
	}

	private static List<Integer> conArr(List<Integer> arr, ConditionArray con) {
		List<Integer> newArr = new ArrayList<>();
		for (Integer i : arr) {
			if (con.test(i)) {
				newArr.add(i);
			}
		}
		return newArr;
	}
}
