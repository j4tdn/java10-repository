package lesson02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		int a = ip.nextInt();
		System.out.println(SoSanh(a));

	}

	private static int daoSo(int n) {
		int soDao = 0;
		while (n != 0) {
			soDao = soDao * 10 + (n % 10);
			n = n / 10;
		}
		return soDao;
	}

	private static String SoSanh(int a) {
		if (a == daoSo(a)) {
			return a + ": la so doi xung";
		} else
			return a + ": khong phai so doi xung";
	}

}
