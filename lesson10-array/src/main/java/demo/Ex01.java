package demo;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] original = {1, 9, 5, 36, 12, 33};
		System.out.println("Original: " + Arrays.toString(original));
		System.out.println("Sum: " + sum(original));
		System.out.println(getMinMax(original));
		System.out.println("Add: " + Arrays.toString(add(original, 17, 2)));
		System.out.println("Remove: " + Arrays.toString(remove(original, 3)));
		SelectionSort(original);
		System.out.println("Selection Sort: " + Arrays.toString(original));
		System.out.println("Reverse: " + Arrays.toString(reverse(original)));
	}
	// 1. Odd number
	private static int sum (int[] arr) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				result += arr[i];
			}
		}
		return result;
	}
	
	// 2. Min Max
	private static MinMax getMinMax(int[] arr) {
		// int max = Integer.MIN_VALUE;
		// int min = Integer.MAX_VALUE;
		
		MinMax result = new MinMax(Integer.MAX_VALUE, Integer.MIN_VALUE);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > result.getMax()) {
				result.setMax(arr[i]);
			}
			if(arr[i] < result.getMin()) {
				result.setMin(arr[i]);
			}
		}
		
		return result;
	}
	
	// 3. Add element at index k
	// 1 9 5 36 12 33
	// 1 9 17 5 36 12 33
	// k = 2, value = 17 >>
	private static int[] add(int[] arr, int newValue, int pos){
		if(pos < 0 || pos >= arr.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] result = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			result[i] = arr[i];
		}
		for(int i = result.length - 1; i > pos; i--) {
			result[i] = result[i - 1];
		}
		result[pos] = newValue;
		return result;
	}
	// 4. Remove element from index k
	// 1 9 5 "36" 12 33 
	// k = 3
	private static int[] remove(int[] arr, int pos) {
		int[] tmp = Arrays.copyOfRange(arr, 0, arr.length);
		// Shift left
		for(int i = pos; i < arr.length - 1; i++) {
			tmp[i] = tmp[i + 1];
		}
		return Arrays.copyOfRange(tmp, 0, arr.length - 1);
	}
	// 6. Sort
	private static void SelectionSort (int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for(int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			// swap smallest to the front
			swap(arr, i, smallest);
		}
	}
	
	private static void swap (int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
	
	private static class MinMax {
		private int min;
		private int max;
		
		public MinMax() {
			
		}
		
		public MinMax(int min, int max) {
			this.min = min;
			this.max = max;
		}

		public int getMin() {
			return min;
		}

		public void setMin(int min) {
			this.min = min;
		}

		public int getMax() {
			return max;
		}

		public void setMax(int max) {
			this.max = max;
		}
		@Override
		public String toString() {
			return "min: " + min + ", max:" + max;
		}
	}
	public static void reverse(int[] arr) {
	}
}
