package java10.lesson05_danghoang;

public class no3 {
	public static void main(String[] args) {

		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(4, 64));
		System.out.println(isPowerOf(1, 8));
		System.out.println(isPowerOf(54, 7));
	}

	public static boolean isPowerOf(int a, int b) {
		int c;
		if (a < b) {
			c = a;
			a = b;
			b = c;
		}
		while ((a % b == 0)) {
			a = a / b;
		}
		if (a != 1)
			return false;
		else
			return true;
	}
}
