package sorting;

import static utils.ArrayUtils.*;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		//bubble sort: sắp xếp nổi bột ==> sau 1 vòng for phần tử lớn nhất nằm bên phải (tăng dần)
		int [] numbers = {1,4,6,2,3};
		//bubbleSort(numbers);
		sort(numbers, SortOrder.DESC);
		//Arrays.sort(numbers);
		forEach(numbers);
		
	}

}
