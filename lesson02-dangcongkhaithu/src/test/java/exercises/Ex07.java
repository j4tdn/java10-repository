package exercises;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[5];
		int rand = 0;
		int count = 0;
		while (true) {
			rand = 20 + rd.nextInt(11);

			if (isExisted(arr, rand)) {
				continue;
			}

			arr[count] = rand;
			System.out.println(arr[count]);
			if (count == 4) {
				break;
			}
			count++;
		}

	}

	private static boolean isExisted(int[] intput, int k) {
		for (int i = 0; i < intput.length; i++) {
			if (intput[i] == k) {
				return true;
			}
		}
		return false;
	}
}
