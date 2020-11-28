package lesson02_ngophanphuc;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int n, mod, tmp;
		int reverse = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra doi xung: ");
		n = ip.nextInt();
		tmp = n; //989

		while (tmp != 0) {  
			mod = tmp % 10; //9  8 9
			reverse = reverse * 10 + mod; //9 98 989
			tmp /= 10;  //98  9 0
		}

		if (reverse == n)
			System.out.println(n + " la so doi xung");
		else
			System.out.println(n + " khong phai so doi xung");
	}
}