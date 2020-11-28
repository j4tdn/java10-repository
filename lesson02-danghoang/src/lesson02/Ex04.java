package lesson02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int n, c, d;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Nhập vào số phần tử của mảng: ");
			n = scanner.nextInt();
		} while (n <= 0);

		int A[] = new int[n];
		int ch[] = new int[n]; // mảng chứa các phần tử là số chẵn
		int le[] = new int[n]; // mảng chứa các phần tử là số lẻ

		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			A[i] = scanner.nextInt();
		}

		// c: số phần tử của mảng ch
		// d: số phần tử của mảng le.
		c = d = 0;

		for (int i = 0; i < n; i++) {
			// nếu phần tử tại vị trí i chia hết cho 2
			// thì gán phần tử đó cho phần tử tại vị trí c của mảng ch
			// ngược lại thì gán phần tử đó
			// cho phần tử tại vị trí d của mảng le
			if (A[i] % 2 == 0) {
				ch[c] = A[i];
				c++;
			} else {
				le[d] = A[i];
				d++;
			}
		}

		System.out.println("Các phần tử của mảng ch là: ");
		for (int i = 0; i < c; i++) {
			System.out.print(ch[i] + "\t");
		}

		System.out.println("\nCác phần tử của mảng le là: ");
		for (int i = 0; i < d; i++) {
			System.out.print(le[i] + "\t");
		}
		System.out.println("Số lẻ thứ 2 là: " + le[d - 2]);
	}
}