package nguyenduonghuy.lesson02_nguyenduonghuy;

import java.util.Arrays;
import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			while (!flag) {
				flag = true;
				a[i] = rd.nextInt(11) +  20;
				for (int j = 0; j < i ; j++) {
					if (a[j] == a[i]) {
						flag = false;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}