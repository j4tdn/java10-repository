package Ex03;

public class Ex03 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;

		System.out.println(isPowerOf(a, b));

	}

	public static boolean isPowerOf(int a, int b) {
		int cout = 1;
		if (a < b) {
			return false;
		}
		if (a == b) {
			return true;
		} 
		else {
			while (cout <= a) {
				cout = b * b;
				if (cout == a) {
					return true;
				}
				else return false;

			}
		}
		return false;

	}
}
