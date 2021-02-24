package demo;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] a = { 1, 9, 5, 36, 12, 33 };
		sumOdd(a);
		System.out.println(getMinMax(a));
		System.out.println("add: " + Arrays.toString(add(a, 17, 2)));
		System.out.println("remove: " + Arrays.toString(remove(a, 3)));

	}

	// 1. odd numbers
	private static void sumOdd(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				result += a[i];
			}

		}
		System.out.println("Tổng lẻ trong mảng: " + result);
	}

	private static MinMax getMinMax(int[] a) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		return new MinMax(min, max);

	}

	private static int[] add(int[] a, int newValue, int pos) {

		int[] result = new int[a.length + 1];
		if (pos < 0 || pos >= a.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for (int i = 0; i < pos; i++) {
			result[i] = a[i];
		}
		result[pos] = newValue;
		for (int i = pos + 1; i < result.length; i++) {
			result[i] = a[i - 1];
		}
		return result;
	}

	private static int[] remove(int[] a, int pos) {

		int[] tmp = Arrays.copyOfRange(a, 0, a.length);
		for (int i = pos; i < a.length - 1; i++) {
			tmp[i] = tmp[i + 1];
		}

		return Arrays.copyOfRange(tmp, 0, a.length - 1);
	}

	private static void sort(int[] a) {

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

}
