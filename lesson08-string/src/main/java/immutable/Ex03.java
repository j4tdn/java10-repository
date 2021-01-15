package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "welcome";
		String s3 = new String("bye");
		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		modified(s1, s2);
		modified(s1, "bye");
		modified(s1, s3);

		System.out.println("s1==s2" + (s1 == s2));
		System.out.println("s1==s3" + (s1 == s3));
		System.out.println("s2==s3" + (s2 == s3));
	}

	private static void modified(String s1, String s2) {
		s1 = s2;
	}

	private static void hash(String name, String s) {
		System.out.println(name + ": " + System.identityHashCode(s));

	}

	@SuppressWarnings("unused")
	private static void value(String name, String s) {
		System.out.println(name + ": " + s);
	}
}
