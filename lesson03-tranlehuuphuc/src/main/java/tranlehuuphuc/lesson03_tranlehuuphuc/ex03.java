package tranlehuuphuc.lesson03_tranlehuuphuc;

import java.util.Random;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] agrs) {
		Random random = new Random();
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so hang cua mang: ");
		int n = sc.nextInt();
		System.out.println("Nhap so cot cua mang: ");
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		System.out.println("Chuong trinh se tien hanh kiem tra ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = random.nextInt((100 - 1) + 1) + 1;
			}
		}

		System.out.println("Cac phan tu cua mang vua tao la: ");
		show(arr);

		System.out.println(
				"He thong se tien hanh kiem tra mang vua duoc tao ra, neu nhu mang co phan tu yen ngua thi se tra ve, neu ko thi se ko co tra ve");
		System.out.println("------------Kiem tra-----------------");
		// vong lap duyet tung phan tu cua mang, kiem tra neu no dong thoi la phan tu
		// lon nhat trong cot va nho nhat trong hang thi tra ve
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if ((arr[i][j] == minInRow(arr, i)) && (maxInCollum(arr, j) == arr[i][j])) {

					System.out.println("Mang vua tao co phan tu yen ngua, phan tu do la " + arr[i][j]);

				}

			}
		}
		System.out.println("-------------");
		System.out.println("ket thuc");
	}

//ham hien thi mang
	public static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

//ham kiem tra phan tu o co nho nhat trong hang ko
	public static int minInRow(int a[][], int k) {
		int min;
		min = a[k][0];
		for (int j = 1; j < a.length; j++)
			if (a[k][j] < min) {
				min = a[k][j];
			}

		return min;

	}

	// ham kiem tra phan tu o co lon nhat trong cot ko
	public static int maxInCollum(int a[][], int k) {
		int max;
		max = a[0][k];
		for (int i = 0; i < a.length; i++) {
			if (a[i][k] > max) {
				max = a[i][k];
			}

		}

		return max;
	}
}