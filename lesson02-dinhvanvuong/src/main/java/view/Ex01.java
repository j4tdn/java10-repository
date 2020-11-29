package view;

public class Ex01 {
	public static void main(String[] args) {
		int a = 15;
		int b = 30;
		int c = 20;
		up(a, b, c);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}

	private static void up(int a, int b, int c) {
		int tpm;
		if (a > b) {
			 tpm = a;
			a = b;
			b = tpm;
		}
		if (a > c) {
			tpm = a;
			a = c;
			c = tpm;
		}
		if (b > c) {
			tpm = b;
			b = c;
			c = tpm;
		}
		System.out.println("a1:" + a);
		System.out.println("b1:" + b);
		System.out.println("c1:" + c);

	}

}
