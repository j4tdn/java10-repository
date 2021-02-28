package sorting;

import static utils.ArrayUtils.*;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// bubble sort:sap xep noi bot
		int[] numbers = { 1, 4, 5, 3, 2 };
		// bubbleSort(numbers);
		sort(numbers, SortOrder.DESC);
		forEach(numbers);
	}

}
