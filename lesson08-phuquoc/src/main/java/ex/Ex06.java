package ex;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int i = 1;
		String result1 ="";
		int result2;
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap n:");
		int n = ip.nextInt();
		while (i<=n){
			result1+=i++;
		}
		System.out.println(result1);
		System.out.print("Số ở vị trí thứ ");
		result2 = ip.nextInt();
		System.out.println("Kết quả=" +result1.charAt(result2));
	}
}
