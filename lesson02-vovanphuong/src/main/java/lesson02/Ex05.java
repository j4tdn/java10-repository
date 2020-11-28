package lesson02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap so can chuyen doi : ");
		int a = ip.nextInt();
		System.out.println("Co so hai cua: " + a + " la: " + ChiaCoSo(a));

	}

	private static long ChiaCoSo(int n) {
		long Cso = 0;
		int i = 1;
		while (n > 0) {
			Cso = Cso + (n % 2) * i;
			n = n / 2;
			i = i * 10;
		}
		return Cso;
	}
}