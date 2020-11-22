package data.type;

public class Ex03 {
	public static void main(String[] args) {
		int a = 10;
		int b = 8;
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	private static void swap(int a, int b) {
		int tmp = a; // tmp =10
		a = b; // a =8; b=8
		b = tmp; // b = 10
		System.out.println("Swap: " + a);
	}
}