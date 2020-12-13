package view;

public class Ex04 {
	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		System.out.println("getLeastCommonMultiple : "+((a*b)/UCLN(a, b)));
		
	}

	public static int getLeastCommonMultiple(int a, int b) {
		for (int i = 1; i < 10; i++) {
			return (a * b / UCLN(a, b));
		}
		return b;

	}

	private static int UCLN(int a, int b) {
		if (a == b)
			return a;
		if (a > b)
			UCLN(a - b, b);
		else
			UCLN(b - a, a);
		return b;

	}

}
