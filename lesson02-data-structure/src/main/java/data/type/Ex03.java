package data.type;

public class Ex03 {
	public static void main (String[] args) {
		//swap two values: int
		int a = 10;
		int b = 20;
		//Ctrl + Alt: copy
		swap(a,b);
		System.out.println("==========");
		System.out.println("Main A: " + a);
		System.out.println("Main B: " + b);
	}
	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("Swap A: " + a);
		System.out.println("Swap B: " + b);
	}
}
