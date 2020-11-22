package data.type;

public class Ex03 {
	public static void main(String[] args) {
		// swap 2 values: int
		int a = 10;
		int b = 20;
		swap(a, b);
		System.out.println("Main A: " + a);
		System.out.println("Main B: " + b);
	}
	
	private static void swap(int a, int b) {
		int tmp = a; // tmp = 10
		a = b; // a = 20; b = 20
		b = tmp; // b = 10
		System.out.println("Swap: " + a);
		System.out.println("Swap: " + b);
	}
	
}
