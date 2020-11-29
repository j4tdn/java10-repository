package view;

import java.util.Random;

public class Ex07 {
	private static Random rd = new Random();
	public static void main(String[] args) {
		int[] a = new int[5];
		Random rd = new Random();
		a[0] = rd.nextInt(30 - 20) + 20;
		System.out.println("Random 5 :\n" + a[0] + " ");
		int result = 0;
		for (int i = 1; i < a.length; i++) {
			 result = rd.nextInt(30 - 20) + 20;
			a[i] = result;
			System.out.println(a[i] + " ");
		}
	}

}
