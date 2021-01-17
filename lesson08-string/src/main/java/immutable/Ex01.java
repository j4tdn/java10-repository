package immutable;

public class Ex01 {
	public static void main(String[] args) {
		// String Object
		String o1 = new String("Hello");
		String o2 = new String("Hello");
		String o3 = new String("Student");
		hash("o1", o1);
		hash("o2", o2);
		hash("o3", o3);
		
		// Immutable
		o1 = "welcome";
		value("quoc", o1);
		hash("01", o1);
	}
	private static void hash(String name, String s) {
		System.out.println(name + ":" + System.identityHashCode(s));
	}
	
	private static void value(String name, String s) {
		System.out.println(name + ":" + s);
	}
}
