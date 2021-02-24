package demo;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] original = { 1, 9, 5, 36, 12, 33 };
		
		System.out.println(Arrays.toString(original));
		System.out.println(sumOfOddNumber(original));
		System.out.println(getMinMax(original));
		System.out.println(Arrays.toString(add(original, 10, 2)));
		System.out.println(Arrays.toString(remove(original, 2)));
		System.out.println(Arrays.toString(update(original, 100, 2)));
		bubblesoft(original);
	}

	// 1 Calculate sum of odd numbers 
	private static int sumOfOddNumber(int[] a) {
		int result = 0;
		for (int i : a) {
			if (i % 2 == 0) {
				result += i;
			}
		}
		return result;
	}

	// 2 Find max, min in one loop
	private static class MinMax {
		private int min, max;

		public MinMax() {
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
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
			return "MinMax [min=" + min + ", max=" + max + "]";
		}
	}

	private static MinMax getMinMax(int[] a) {
		MinMax result = new MinMax(); 
		for (int i = 0; i < a.length; i++) {
			if (result.getMin() > a[i]) {
				result.setMin(a[i]); 
			}
			if (result.getMax() < a[i]) {
				result.setMax(a[i]);
			}
		}
		return result;
	}
	
	// 3 Add element to index k
	private static int[] add(int[] a, int value, int index) {
		if (index < 0 || index >= a.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] result = new int[a.length + 1];
		for (int i = 0; i < index; i++) {
			result[i] = a[i];
		}
		result[index] = value;
		for (int i = index + 1; i < result.length; i++) {
			result[i] = a[i-1];
		}
		return result;
	}
	
	// 4 Remove element from index k 
	private static int[] remove(int[] a, int index) {
		if (index < 0 || index >= a.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] result = new int[a.length - 1];
		for (int i = 0; i < index; i++) {
			result[i] = a[i];
		}
		for (int i = index + 1; i < a.length; i++) {
			result[i-1] = a[i];
		}
		return result;
	}
	
	// 5 Update element at index k
	private static int[] update(int[] a, int value, int index) {
		int[] result = new int[a.length];
		for (int i = 0; i < index; i++) {
			result[i] = a[i];
		}
		result[index] = value;
		for (int i = index + 1; i < result.length; i++) {
			result[i] = a[i];
		}
		return result;
	}

	// 6 Sort array using bubble/insertion/selection algorithm
	private static void bubblesoft(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
