package demo;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] original = { 1, 9, 5, 36, 12, 33 };
		System.out.println("original: " + Arrays.toString(original));
		System.out.println("sum: " + sum(original));
		System.out.println(getMinMax(original));
		System.out.println("add: " +  Arrays.toString(add(original, 17, 2)));
		System.out.println("remove" +  Arrays.toString(remove(original, 3)));
	}

	// 1. odd numbers
	//
	private static int sum(int[] a) {
		int result = 0;
		for (int value : a) {
			if (value % 2 != 0) {
				result += value;
			}
		}
		return result;
	}

	// 2. min max
	private static MinMax getMinMax(int[] a) {
		MinMax result = new MinMax(Integer.MAX_VALUE, Integer.MIN_VALUE);
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > result.getMax()) {
				result.setMax(a[i]);
			}
			if (a[i] < result.getMin()) {
				result.setMin(a[i]);
			}
		}

		return result;
	}

	// 3. add element at index k
	// a ==> 1, 9, 5, 36, 12, 33
	// result 1, 9, 5, 36, 12, 33, 0
	// 1, 9, 5, 5 , 36, 12, 33
	// k = 2, value=17 >>
	// C1: 1 for
	// C2: copy each part
	// C3: copy all then shift right
	private static int[] add(int[] a, int newValue, int pos) {
		if (pos < 0 || pos >= a.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] result = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			// 1 2 3
			// 1 2 3 0
			result[i] = a[i];
		}
		for (int i = result.length - 1; i > pos; i--) {
			result[i] = result[i - 1];
		}
		result[pos] = newValue;
		return result;
	}

	// 4. remove element at index k
	// 1, 9, 5, "36", 12, 33
	// 1, 9, 5, 12, 33, 33
	// k=3
	private static int[] remove(int[] a, int pos) {
		int[] tmp = Arrays.copyOfRange(a, 0, a.length);
		// shift left
		for (int i = pos; i < a.length - 1; i++) {
			tmp[i] = tmp[i+1];
		}
		return Arrays.copyOfRange(tmp, 0, a.length - 1);
	}

	// 6. sort
	private static void sort(int[] a) {

	}

	private static class MinMax {
		private int min;
		private int max;

		public MinMax(int min, int max) {
			this.min = min;
			this.max = max;
		}

		public int getMax() {
			return max;
		}

		public void setMax(int max) {
			this.max = max;
		}

		public int getMin() {
			return min;
		}

		public void setMin(int min) {
			this.min = min;
		}
		
		@Override
		public String toString() {
			return "min: " + min + ", max: " + max;
		}
	}
}
