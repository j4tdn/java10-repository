package immutable;

public class Ex01 {
	public static void main(String[] args) {
		//string object
		String o1 = new String("Hello");
		String o2 = new String("Hello");
		String o3 = new String("Student");
		hash("o1", o1);
		hash("o2:", o2);
		hash("o3:", o2);
		// immutable(cannot change the value)
		o1 = "wellcome";
		value("o1",o1);
		hash("o1",o1);
	}

	private static void hash(String name, String s) {
		System.out.println(name + ": " + System.identityHashCode(s));

	}
	private static void value(String name, String s) {
		System.out.println(name + ": " + s);

}
}
