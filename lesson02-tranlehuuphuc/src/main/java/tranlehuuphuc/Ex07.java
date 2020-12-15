package tranlehuuphuc;

import java.util.Random;

public class Ex07 {
	public static void main(String[] agrs) {

		int[] a = new int[5];

		Random random = new Random();

		int value = random.nextInt((30 - 20) + 1) + 20;
		int valu = random.nextInt((30 - 20) + 1) + 20;
		a[0] = value;
		for (int i = 1; i < 5; i++) {
			if ((check(a, (valu = random.nextInt((30 - 20) + 1) + 20)))) {
				a[i] = valu;
			} else {

				a[i] = random.nextInt((30 - 20) + 1) + 20;
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}

	public static boolean check(int[] x, int y) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == y) {
				return false;
			}

		}
		return true;
	}

}
