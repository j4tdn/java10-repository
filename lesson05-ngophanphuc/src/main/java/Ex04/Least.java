package Ex04;

public class Least {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 2, 4, 5 };
		System.err.println(getLeastCommonMultiple(a));
	}

	public static int UCLN(int a, int b) {
		if (b == 0)
			return a;
		return UCLN(b, a % b);
	}

	public static int BCNN(int a, int b) {
		return (a * b) / UCLN(a, b);
	}

	public static int getLeastCommonMultiple(int[] Arr) {
		int a = Arr[0];
		for (int i = 1; i < Arr.length; i++) {
			a = BCNN(a, Arr[i]);
		}
		return a;
	}
}