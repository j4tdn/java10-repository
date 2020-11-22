package dataType;

public class Ex04 {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		
		hash("Origin A hash", a);
		hash("Origin B hash", b);
		
		swap(a, b);
 		
		hash("After swap A hash", a);
		hash("After swap B hash", b);
		
		System.out.println("Main a: " + a);
		System.out.println("Main b: " + b);
		
		// Integer, String, Double,... : Immutable Object
		// Immutable: Cannot change origin value in HEAP
		Integer origin = 55;
		Integer assign = 55;
		hash("Origin 1", origin);
		hash("Assign", assign);
		origin = 66;
		hash("Origin 2", origin);
		System.out.println("origin: " + origin);
		
	}
	
	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("Swap a: " + a);
		System.out.println("Swap b: " + b);
	}
	
	private static void hash(String text, Integer input) {
		// Dia chi goc duoc cap phat boi JVM
		System.out.println(text + ": " + System.identityHashCode(input));
		
	}
}
