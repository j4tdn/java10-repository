package lesson02_excercise;

public class bai1 {
	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		int c = 5;

		ascending(a, b, c);
	}

	public static void ascending(int a, int b, int c) {
		int tmp;
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		} else if (a > c) {
			tmp = a;
			a = c;
			c = tmp;
		} else if (b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}

		System.out.println("thu tu: " + a + " " + b + " " + " " + c);

	}

}
