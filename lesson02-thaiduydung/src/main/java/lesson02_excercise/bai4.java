package lesson02_excercise;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		int a[] = new int[10];
		int max1 = 0;
		Scanner ip = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			a[i] = ip.nextInt();
			if (i == 0) {
				max1 = a[0];

			} else if (a[i] > max1) {
				max1 = a[i];
			}
		}
		int max2 = a[0];
		for (int i = 0; i < 10; i++) {
			if (a[i] > max2 && a[i] < max1) {
				max2 = a[i];
			}
		}
		System.out.println("phan tu lon thu 2 trong mang la :" + max2);
	}

}