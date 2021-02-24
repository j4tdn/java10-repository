package demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] original = { 1, 9, 5, 36, 12, 33 };
		System.out.println("original: " + Arrays.toString(original));
		System.out.println("sum: " + sum(original));
		System.out.println(getMinMax(original));
		System.out.println("add: " + Arrays.toString(add(original, 17, 2)));
		System.out.println("remove: " + Arrays.toString(remove(original, 3)));

	}

//1. sum
	private static int sum(int[] a) {
		int result = 0;
		for (int value : a) {
			if (value % 2 != 0) {
				result += value;
			}
		}
		return result;

	}

//2. MinMax
	private static MinMax getMinMax(int[] a) {
		// int max = Integer.MIN_VALUE;
		// int min = Integer.MAX_VALUE;
		MinMax result = new MinMax(Integer.MIN_VALUE, Integer.MAX_VALUE);
		for (int i = 0; i < a.length; i++) {
			if (a[i] > result.getMax()) {
				result.setMax(a[i]);
			}
			if (result.getMin() > a[i]) {
				result.setMin(a[i]);
			}
		}

		return result;
	}

//3. add element at index k
	private static int[] add(int[] a, int newValue, int pos) {
		if (pos < 0 || pos >= a.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] result = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}
		for (int i = result.length - 1; i > pos; i--) {
			result[i] = result[i - 1];
		}
		result[pos] = newValue;
		return result;
	}

//4. remove element at index k
	private static int[] remove(int[] a, int pos) {

		int[] tmp = Arrays.copyOfRange(a, 0, a.length);
		// shift left
		for (int i = pos; i < a.length - 1; i++) {
			tmp[i] = tmp[i + 1];
		}

		return Arrays.copyOfRange(tmp, 0, a.length - 1);
	}

//6. sort Array
	private static void sort() {
		// for (int i = 0; i < a.length - 1; i++) {
		// for (int j = i + 1; j < a.length; j++) {
		// if (a[i] > a[j]) {
		// a[j] = a[i];
		// }
//			}
		// }

	}

	private static class MinMax {
		private int min;
		private int max;

		public MinMax() {
			
		}

		public MinMax(int max, int min) {
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
			return "min: " + min + ",max:" + max;
		}
	}

}
