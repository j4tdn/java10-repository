package exercises;

import java.util.Scanner;

public class Ex04 {
	/*
	 * Bài 4: Viết chương trình nhập vào một dãy các số nguyên từ bàn phím. Tìm số
	 * lẻ lớn nhất thứ hai trong dãy số và in ra.
	 */
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int n;

		int count = 0;
		int d = 0;
		do {
			System.out.print("Enter the numbers of elements:");
			n = ip.nextInt();
		} while (n <= 0);
		int[] A = new int[n];
		System.out.println("Enter the elements:");

		for (int i = 0; i < n; i++) {
			A[i] = ip.nextInt();

		}
// count odd 
		int odd[] = new int[n];
		int even[] = new int[n];

		for (int i = 0; i < n; i++) {
			if (A[i] % 2 == 0) {
				even[d] = A[i];
				d++;
			} else {
				odd[count] = A[i];
				count++;
			}

		}

		for (int i = 0; i < d; i++) {
			A[i] = even[i];
		}
		for (int j = 0; j < count; j++) {
			A[d] = odd[j];
			d++;

		}
		sortArray(A, n - count);
		for (int k = 0; k < n; k++) {
			System.out.print(A[k] + " ");
		}
		System.out.println("The second largest odd: " + A[A.length - 2]);

	}

	public static void sortArray(int[] arr, int pos) {
		int a = arr[0];
		for (int i = pos; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					a = arr[j];
					arr[j] = arr[i];
					arr[i] = a;

				}
			}
		}
	}

}
