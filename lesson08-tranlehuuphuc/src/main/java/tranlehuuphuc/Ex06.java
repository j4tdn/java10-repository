package tranlehuuphuc;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int i = 1;
		String d = " ";
		System.out.print("Nhap n: ");
		int n = ip.nextInt();
		while (i <= n) {
			d += i++;
		}
		System.out.println(d);
		System.out.print("Nhap so thu 100: ");
		int result = ip.nextInt();
		System.out.println("ket qua : " + d.charAt(result));
	}
}