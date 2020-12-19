package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int h;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào chiều cao của tam giác: ");
		h = scanner.nextInt();
		int n, output;

		for (int i = 1; i <= h; i++) {
			for (int j = 0; j <= 2 * h; j++) {
				n = j - h;
				if (n < 0) {
					n *= -1;
				}
				output = i - n;

				if (output > 0) {
					System.out.printf("%3d", output);
				} else {
					// System.out.printf(" ");
				}
			}
			System.out.println();

		}

	}

}
