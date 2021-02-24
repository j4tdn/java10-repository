package demo;

public class Ex01 {
	public static void main(String[] args) {
		int[] array = { 1, 9, 5, 36, 12, 33 };

		System.out.println(getMinMax(array));
		
		System.out.println("========================");
		
		int[] adds = add(array, 2, 0);
		
		for(int i : adds) {
			System.out.println(i);
		}
		
		System.out.println("=======================");
		
		int[] removes = remove(array, 2);
		
		for(int i : removes) {
			System.out.println(i);
		}
		
		System.out.println("=======================");
		sort(array);
		for(int i : array) {
			System.out.println(i);
		}
		

	}

	// + Calculate sum of odd numbers
	private static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				sum += array[i];
			}
		}

		return sum;
	}

	private static MinMax getMinMax(int[] array) {
		MinMax minMax = new MinMax(Integer.MAX_VALUE, Integer.MIN_VALUE);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > minMax.getMax()) {
				minMax.setMax(array[i]);
			}
			if (array[i] < minMax.getMin()) {
				minMax.setMin(array[i]);
			}
		}
		return minMax;
	}

	// Or use shift right
	private static int[] add(int[] array, int value, int pos) {
		int[] results = new int[array.length + 1];
		for(int i = 0; i < pos; i++) {
			results[i] = array[i];
		}
		results[pos] = value;
		for(int i = pos + 1; i < results.length; i++) {
			results[i] = array[i - 1];
		}
		
		return results;
	}
	
	private static int[] remove(int[] array, int pos) {
		int[] results = new int[array.length - 1];
		for(int i = 0; i < pos; i ++) {
			results[i] = array[i];
		}
		for(int i = pos + 1; i < array.length; i++) {
			results[i - 1] = array[i];
		}
		
		return results;
	}

	private static void sort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i+1;j < array.length;j++) {
				if(array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
	
	private static class MinMax {
		private int min;
		private int max;

		public MinMax() {
			super();
		}

		public MinMax(int min, int max) {
			super();
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
			return "MinMax [min=" + min + ", max=" + max + "]";
		}

	}

}
