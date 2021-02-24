package ex02;

public class Ex02 {
	public static void main(String[] args) {
		NumberOdd();
		NumberEven();

	}

	public static void NumberOdd() {
		int[] a = { 1, 6, 5, 8, 11, 12  };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				System.out.println(a[i]);
			}
		}
		System.out.println("==========================");

	}

	public static void NumberEven() {
		int[] b = { 1, 6, 5, 8, 11, 12  };
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				System.out.println(b[i]);
			}
		}
	}

}
