package Ex03;

public class PowerOf {
	public static void main(String[] args) {
		isPowerOf(2, 4);
	}

	public static void isPowerOf(int a, int b) {
		for (int i = 0; i < 100; i++) {
			if ((Math.pow(a, i) == b) || (Math.pow(b, i) == a)) {
				System.out.println("la luy thua");
				break;
			}
			if (i == 99) {
				System.out.println("khong phai la luy thua");
			}
		}

	}
}
