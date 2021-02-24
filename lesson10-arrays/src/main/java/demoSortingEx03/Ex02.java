package demoSortingEx03;

import static utils.ArrayUtils.*;

public class Ex02 {
	
	public static void main(String[] args) {
		String[] sequences = { "1", "0", null, "x", "a", "b", null, "19", "2" };
		//??? tại sao số từ 10-19  lại sắp xếp bé hơn 2
		//Ex02: Sorting with String, handle NULL values
		//+ Manually
		//+ Using Arrays.sort (quicksort)
		
		bubbleSort(sequences);
		// bubbleSortNullLast(sequences);
		forEachString(sequences);
		
	}
}
