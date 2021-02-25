package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int[] a = { 1, 9, 5, 36, 12, 33 };
		System.out.println("tong cac phan tu le: " + sum(a));
		System.out.println(getMinMax(a));
		System.out.println("add: " + Arrays.toString(add(a, 17, 2)));
		System.out.println("xoa phan tu " +Arrays.toString(remove(a, 3)));
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		System.out.println("nhập vị trí");
		int pos = sc.nextInt();
		// ThemPhanTu(a, val, pos);

	}

	public static int sum(int[] a) {
		int result = 0;
		for (int value : a) {
			if (value % 2 != 0) {
				result += value;
			}
		}
		return result;
	}

	// 2.min max
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

		public int getMin() {
			return min;
		}
		@Override
		public String toString() {
			return "min: " +min + ", max:" + max;
		}

	}

	private static MinMax getMinMax(int[] a) {
		// min -2^32 -1.max 2^32
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int k = 0; k < a.length; k++) {
			if (a[k] < min) {
				min = a[k];
			}
			if (a[k] > max) {
				max = a[k];
			}
		}
		return new MinMax(min, max);

	}

	// 3. add element at index k
	// C1. tao 1 vong for
	// C2. coppy tung phan
	// C3. copy all then shirt right
	// C3: for(int i=0;i < a.length ; i++) {
	// result[i] = a[i];
	// }
	// for(int i=a.lenth -1;i > pos ; i--) {
	// result[i] = result[i-1];
	// }
	// result[pos] = new Value;
	//
	private static int[] add(int[] a, int newValue, int pos) {
		int[] result = new int[a.length + 1];
		if (pos < 0 || pos >= a.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for (int i = 0; i < pos; i++) {
			result[i] = a[i];
		}
		result[pos] = newValue;
		// shirt right 1 unit
		for (int i = pos + 1; i < result.length; i++) {
			result[i] = a[i - 1];
		}
		return result;
	}

	private static int[] remove(int[] a, int pos) {
		int[] tmp = new int[a.length];
		tmp = Arrays.copyOfRange(a, 0, a.length);
		// shirt left 1 unit
		for (int i = pos; i < a.length - 1; i++) {
			tmp[i] = tmp[i + 1];
		}
		return Arrays.copyOfRange(tmp, 0, a.length - 1);
	}

	// 6. sort
	private static void sort(int[] a) {
		
	}
}
