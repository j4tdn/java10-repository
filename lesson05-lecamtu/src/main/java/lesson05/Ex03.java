package lesson05;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));

	}

	private static boolean isPowerOf(int a, int b) {
		int i = 1;
		if (a == 1 || b == 1) {
			return true;
		}
		if (a < b) {
			while (true) {
				if (Math.pow(a, i++) == b) {
					return true;
				} else if (Math.pow(a, i++) > b) {
					return false;
				}
			}
		} else {
			while (true) {
				if (Math.pow(b, i++) == a) {
					return true;
				} else if (Math.pow(b, i++) > a) {
					return false;
				}
			}
		}

	}

}
