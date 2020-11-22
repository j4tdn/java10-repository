package data.type;

public class Ex04 {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		hash("Origin A Hash", a);
		hash("Origin B Hash", b);
		swap(a, b);
		hash("After swap A Hash", a);
		hash("After swap B Hash", b);
		System.out.println("a1: " + a);
		System.out.println("b1: " + b);
		
		// Integer, String, Float: Immutable Object
		// Immutable: Cannot change origin value in HEAP
		Integer origin = 55;
		Integer assign = 55;
		hash("origin 1", origin);
		hash("assign: ", assign);
		origin = 66;
		hash("origin 2: ", origin);
		System.out.println("origin: " + origin);
	}
	
	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
		System.out.println("a2: " + a);
		System.out.println("b2: " + b);
	}
	
	private static void hash(String text, Integer input) {
		// origin allocated address from JVM
		System.out.println(text + ": " + System.identityHashCode(input));
	}
}
