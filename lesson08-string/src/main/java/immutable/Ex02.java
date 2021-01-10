package immutable;

public class Ex02 {
	public static void main(String[] args) {
		//string literal --> Heap => CONSTANT POOL
		String l1 = "Hello";
		String l2 = "Hello";
		String l3 = "Student";
		
		hash("l1", l1);
		hash("l2", l2);
		hash("l3", l3);
		
		l1 = "welcome";
		value("l1", l1);
		hash("l1", l1);
	}	
		private static void hash(String name, String s) {
			System.out.println( name + ": " + System.identityHashCode(s));
		}
		private static void value(String name, String s) {
			System.out.println(name + ": " + s);
		}
}
