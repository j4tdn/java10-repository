package data.type;

public class Ex04 {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		hash("Origin A Hash: ", a);
		hash("Origin B Hash: ", b);
		swap(a,b);
		hash("After swap A Hash: ", a);
		hash("After swap B Hash: ", b);
		System.out.println("Main A: " + a);
		System.out.println("Main B: " + b);
		
//		Integer, String, Float: Immutable Object : Bất biến
//		Immutable :Cannot change origin value in HEAP
		Integer origin = 55;
		hash("Origin 1: ", origin);
		origin = 66;
		hash("Origin 2: ", origin);
		System.out.println("Origin: " + origin);
		Integer c = 55;
		hash("Origin 2: ", c);
		
		
		String s1 = "Hello";
		hash("S1 :" , s1);
		s1 = "Xin chao";
		hash("S1 :" , s1);
	}
	private static void swap(Integer a, Integer b) {
//		kieuer doi tuong
		Integer tmp = a;
		a = b;
		b = tmp;
		System.out.println("Swap A: " + a);
		System.out.println("Swap B: " + b);
		
	}
//	origin allocated address from JVM
	private static void hash(String text, Integer input) {
		System.out.println(text + ":" + System.identityHashCode(input));
	}
	private static void hash(String text, String input) {
		System.out.println(text + ":" + System.identityHashCode(input));
	}


}
