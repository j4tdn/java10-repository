package ex02;

import java.util.Scanner;

public class Sort {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print(" Enter number of elements: ");
		int n = ip.nextInt();
		int[] Arr = new int[n];
		for (int i = 0; i < Arr.length; i++) {
			System.out.print("Enter Arr : " );
			Arr[i] = ip.nextInt();
		}
		System.out.print("After sort : ");
		fil(Arr, a -> {return (a % 7 == 0 && a % 5 != 0);});
		fil(Arr, a -> {return (a % 7 == 0 && a % 5 == 0 || a % 7 != 0 && a % 5 != 0);});
		fil(Arr, a -> {return (a % 7 != 0 && a % 5 == 0);});
	}

	private static void fil(int[] A, Condition con) {
		for (int i = 0; i < A.length; i++) {
			if (con.filter(A[i])) {
				System.out.print(A[i] + "  ");

			}
		}
	}
}
