package immutable;

public class Ex02 {

	public static void main(String[] args) {

		// string literal ==> HEAP ==> CONSTANT POOL
		String l1 = "hello";
		String l2 = "hello";
		String l3 = "student";

		hash("l1", l1);
		hash("l2", l2);
		hash("l3", l3);
		l1 = "welcome";
		l1 = "student";
		value("l1", l1);
		hash("l1", l1);
	}

	private static void hash(String name, String s) {
		System.out.println(name + ":" + System.identityHashCode(s));
	}

	private static void value(String name, String s) {
		System.out.println(name + ":" + s);
	}

}
