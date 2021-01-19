package ex06;

import java.util.Scanner;

public class Ex06 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter K: ");
		int K = ip.nextInt();
		int i = 1;
		String s = "";
		while (i <= K) {
			s = s + i;
			i++;
		}
		System.out.println(s);
		System.out.println(s.charAt(K - 1));
		ip.close();
	}
}
