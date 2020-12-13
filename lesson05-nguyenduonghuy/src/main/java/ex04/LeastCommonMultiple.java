package ex04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LeastCommonMultiple {
	public static void main(String[] args) {
		System.out.println("Enter size: ");
		int n = new Scanner(System.in).nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			while (!flag) {
				flag = true;
				a[i] = new Random().nextInt(10) + 1;
				for (int j = 0; j < i; j++) {
					if (a[j] ==a[i]) {
						flag = false;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	private static int getLeastCommonMultiple() {
		
	}
}
