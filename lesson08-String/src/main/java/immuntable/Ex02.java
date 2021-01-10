package immuntable;

public class Ex02 {
	public static void main(String[] args) {
		// string literal ==> CONSTANT POOL
		String l1 = " hello";
		String l2 = " hello";
		String l3 = " student";
		hash("l1", l1);
		hash("l2", l2);
		hash("l3", l3);

		l1 = " welcome";
		hash("l1", l1);
		value("l1", l1);
	}

	private static void hash(String name, String s) {
		System.out.println(name + " :" + System.identityHashCode(s));
	}

	private static void value(String name, String s) {
		System.out.println(name + ": " + s);
	}

}
