package demo;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int [] a = {1, 9, 5, 36, 12, 33};
		System.out.println("Sum odd element:" +sum(a));
		System.out.println("=========================");
		System.out.println(getMinMax(a));
		System.out.println("add:"+Arrays.toString(add(a,17,2)));
		System.out.println("remove: "+Arrays.toString(remove(a,3)));
		
	}
	// 1. Calculate sum of odd numbers
	private static int sum(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] %2 !=0) {
				result += a[i];
			}
		}
		return result;
	}
	
	// 2. Find max, min in one loop
	private static MinMax getMinMax(int[] a) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		return new MinMax(min,max);
		
	}
	
	// 3. add element at index k
	// c1: 1 for
	// c2: copy each part
	// c3: copy all then shift right
	private static int[] add(int[] a,int newValue, int pos ) {
		if(pos < 0 || pos >= a.length) {
			throw new ArrayIndexOutOfBoundsException(pos);
		}
		int[] result = new int[a.length + 1];
		 for(int i = 0; i < pos; i++) {
			 result[i] = a[i]; 
		 }
		 result[pos] = newValue;
		 
		 for(int i = pos+1; i < result.length; i++) {
			 result[i] = a[i-1];
		 }
		 
		 
		return result;
	}
// C3
//	//private static int[] add(int[] a,int newValue, int pos ) {
//	if(pos < 0 || pos >= a.length) {
//		throw new ArrayIndexOutOfBoundsException(pos);
//	}
//	int[] result = new int[a.length + 1];
//	 for(int i = 0; i < a.length; i++) {
//		 result[i] = a[i]; 
//	 }
//	 for (int i = a.length-1; i > pos; i--){
//	 	result[i] = result [i - 1];
//	 }
//	 result[pos] = newValue;
//	return result;
//}
	// 4. remove element at index k
	private static int[] remove(int[] a, int pos ) {
//		int[] tmp = new int[a.length];
//		
//		for(int i = 0; i < a.length; i++) {
//			tmp[i] = a[i];
//		}
		
		int[] tmp = Arrays.copyOfRange(a, 0, a.length);
		
		// shift left
		for (int i = pos; i< a.length - 1; i++) {
			tmp[i] = tmp[i+1];
		}
		
		return Arrays.copyOfRange(tmp, 0, a.length-1);
	}
	
	// 6. sort
	private static void sort(int[] a) {
		
	}
	
	
	
	private static class MinMax{
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
			return "min:"+min +", max:"+max;
		}
	}
}
