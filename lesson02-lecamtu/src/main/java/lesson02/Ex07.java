package lesson02;

import java.util.Random;

public class Ex07 {                 //bai7

	public static Random rd = new Random();

	public static void main(String[] args) {
		int[] A = new int[5];
		int index = 0;

		do {
			int rand = 20 + rd.nextInt(11);
			if (contains(rand, A)) {
				continue;
			}
			A[index] = rand;
			index++;
		} while (index < 5);
		for (int i = 0; i < 5; i++) {
			System.out.println("" + A[i]);

		}
	}

	// contains
	public static boolean contains(int random, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (random == a[i]) {
				return true;
			}

		}
		return false;
	}
}
