package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhap N va M :");
		System.out.println(" n = ");
		int n = ip.nextInt();
		System.out.println("m :");
		int m = ip.nextInt();
		System.out.println("nhap phan tu :");
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
			arr[i][j] = ip.nextInt();
			System.out.println("arr["+ i +"][" + j + "]");
		}
	}
		System.out.println("Mang vua nhap");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println(arr[i][j]+ "\t");
			}
			System.out.println("");
		}
	}
}
