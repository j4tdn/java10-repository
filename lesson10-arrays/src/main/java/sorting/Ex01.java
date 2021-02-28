package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		//bubble sort: sắp xếp nổi bọt
		int[] numbers = {1, 4, 6, 2, 3 };
		//ArrayUtils.bubbleSort(numbers);
		ArrayUtils.sort(numbers, SortOrder.DESC);
		
		System.out.println(Arrays.toString(numbers));
	}
	

}
