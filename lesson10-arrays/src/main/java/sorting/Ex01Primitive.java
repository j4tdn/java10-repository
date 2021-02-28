package sorting;


import static utils.ArraysUtils.*;

public class Ex01Primitive {
	public static void main(String[] args) {
		// bubble sort
		int[] numbers= {1, 6, 8, 7, 3, 4, 2};
//		bubblesort(numbers);
//		Arrays.sort(numbers);
		sort(numbers, SortOrder.DESC);
		foreach(numbers);
	}
}
