package lesson02_ngophanphuc;

public class Ex01 {
	public static void main(String[] args) {
		int a = 9;
		int b = 4;
		int c = 5;
		int tmp;

		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		if (a > c) {
			tmp = a;
			a = c;
			c = tmp;
		}
		if (b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		System.out.println(a + " " + b + " " + c);
	}
}