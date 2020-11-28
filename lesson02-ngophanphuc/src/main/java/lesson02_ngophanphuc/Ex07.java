package lesson02_ngophanphuc;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		String number = null ;
		int breakLine = 0;
		String arr[] = new String[10];

		while (true) { // 20 - 30
			number =" "+ (20 + rd.nextInt(30 - 20 + 1));
			if (Test(arr, number)) {
				arr[breakLine] = number;
				System.out.println(arr[breakLine]);
				breakLine++;

				if (breakLine == 5) {
					break;
				}
			} else {
				continue;
			}

		}
	}

	public static boolean Test(String arr[], String n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return false;
			}
		}
		return true;
	}
}