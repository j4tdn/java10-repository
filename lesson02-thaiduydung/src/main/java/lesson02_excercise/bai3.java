package lesson02_excercise;

public class bai3 {
	public static void main(String[] args) {
		long num = 121487, a = 0, b, c;
		c = num;
		while (num != 0) {
			b = num % 10;
			a = a * 10 + b;
			num /= 10;
		}
		if (c == a)
			System.out.println(c + " La so doi xung");
		else
			System.out.println(c + " Khong phai la so doi xung");
	}
}
