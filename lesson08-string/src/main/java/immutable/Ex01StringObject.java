package immutable;

public class Ex01StringObject {
	public static void main(String[] args) {
		// string object => HEAP
		String object1 = new String("Hello");
		String object2 = new String("Hello");
		String object3 = new String("Student");

		hash("o1", object1);
		hash("o2", object2);
		hash("o3", object3);

		// Immutable
		object1 = "Welcome";
		value("o1", object1);
		hash("o1", object1);

		object1 = "Hello";
		value("o1", object1);
		hash("o1", object1);
	}

	private static void hash(String name, String s) {
		System.out.println(name + ": " + System.identityHashCode(s));
	}

	private static void value(String name, String s) {
		System.out.println(name + ": " + s);
	}
}
