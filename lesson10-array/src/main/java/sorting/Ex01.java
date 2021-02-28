package sorting;
import static utils.ArrayUtils.*;

import java.util.Arrays;

import utils.ArrayUtils;
public class Ex01 {
	public static void main(String[] args) {
		// Bubble Sort: Sắp xếp nổi bọt
		
		int[] numbers = {1, 4, 6, 2, 3};
		// bubbleSort(numbers);
		// Arrays.sort(numbers);
		sort(numbers, SortOrder.DESC);
		forEach(numbers);
	}
	
	
}
