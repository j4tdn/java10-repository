package demo;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {

		int[] original = { 1, 9, 5, 36, 12, 33 };
		sumOfOdd(original);
		System.out.println("original: "+Arrays.toString(original));
		System.out.println("min-max: " + getMinMax(original));
		System.out.println("add: " + Arrays.toString(add(original, 17, 2)));
		System.out.println("remove: " + Arrays.toString(remove(original, 3)));
	}

	// 1. odd numbers
	private static void sumOfOdd(int[] a) {
		int sum = 0;
		for (int num : a) {
			if (num % 2 != 0) {
				sum = sum + num;
			}
		}
		System.out.print("tổng lẻ: " + sum);
		System.out.println("\n=============");
	}
	// 2. min-max

	private static MinMax getMinMax(int[] a) {
		// -2^32
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

	// 3. add element at index k
	private static int[] add(int[] a, int newValue, int pos) {
		
		if (pos < 0 || pos >= a.length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		int[] result = new int[a.length + 1];
		for (int i = 0; i < pos; i++) {
			result[i] = a[i];
		}
		result[pos] = newValue;
		for (int i = pos + 1; i < result.length; i++) {
			result[i] = a[i - 1];
		}
		

//		int[] result = new int[a.length + 1];
//		for(int i=0; i<result.length;i++) {
//			if(i < pos) {
//				result[i]=a[i];
//			}else if(i == pos) {
//				result[i] = newValue;
//			}else {
//				result[i] = a[pos++];
//			}
//		}
		return result;
	}

	// 4. remove element at index k
	private static int[] remove(int[] a, int pos) {
//		int[] tmp = new int[a.length];
//
//		for (int i = 0; i < a.length; i++) {
//			tmp[i] = a[i];
//		}

		int[] tmp = Arrays.copyOfRange(a, 0, a.length);

		// shift left
		for (int i = pos; i < a.length - 1; i++) {
			tmp[i] = tmp[i + 1];
		}

		return Arrays.copyOfRange(tmp, 0, a.length - 1);
	}

	// 6. sort
	private static void sort(int[] a) {
		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
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
			return "min: " + min + ", max: " + max;
		}

	}

//	private static void minMax(int[] number) {
//		int max = number[0];
//		int min = number[0];
//		for (int i = 0; i < number.length; i++) {
//			if (number[i] > max) {
//				max = number[i];
//			}
//			if (number[i] < min) {
//				min = number[i];
//			}
//		}
//
//		System.out.println("số lớn nhất là: " + max);
//		System.out.println("=============");
//		System.out.print("số bé nhất là: " + min);
//		
//
//	}

}