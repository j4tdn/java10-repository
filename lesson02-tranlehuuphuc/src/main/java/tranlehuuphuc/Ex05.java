package tranlehuuphuc;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so can chuyen doi");
		int m = sc.nextInt();

		System.out.print("so sau khi chuyen doi bang  ham tu viet la =");
		convertBase2(m);

	}

	public static void convertBase2(int a) {

		int douba[] = new int[40];

		int index = 0;

		while (a > 0) {

			douba[index++] = a % 2;

			a = a / 2;
		}

		for (int i = index - 1; i >= 0; i--) {

			System.out.print(douba[i]);

		}
	}

}
