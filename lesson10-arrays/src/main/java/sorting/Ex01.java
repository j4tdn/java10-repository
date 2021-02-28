package sorting;

import static utils.ArrayUtils.*;

import java.util.Arrays;


public class Ex01 {
	public static void main(String[] args) {
		// bubble sort: sắp xếp nổi bọt
		int[] numbers = { 1, 4, 6, 2, 3, 5 };
		//bubbleSort(numbers);
		sort(numbers,SortOrder.DESC);
		forEach(numbers);
		
	}

}
