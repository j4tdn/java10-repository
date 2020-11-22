package data.type;

public class Ex03 {
	public static void main(String[] args) {

//swap 2 values: int 
		int a = 10;
		int b = 8;
		swap(a, b);
		System.out.println("a2: " + a);
		System.out.println("b2: " + b);
	}

	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a1: " + a);
		System.out.println("b1: " + b);
	}
}
