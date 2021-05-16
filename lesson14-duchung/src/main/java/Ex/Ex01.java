package Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex01 {
	private static int[] arr = new int[100];
	private static Random rd = new Random();
	private static List<Integer> arr1 = new ArrayList<Integer>();
	private static List<Integer> arr2 = new ArrayList<Integer>();

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(20) + 1;
		}
		int i, j, dem = 1;
		for (i = 0; i < arr.length; i++)
			for (j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j)
					dem++;
				if (dem == 1) {
					arr1.add(arr[i]);
					dem = 1;
				} else{
					arr2.add(arr[i]);
				}

			}
		System.out.println("Số xuất hiện 1 lần");
		arr1.stream().distinct().forEach(System.out::println);
		System.out.println("Số xuất hiện hơn 1 lần");
		arr2.stream().distinct().forEach(System.out::println);

	}
	

}
