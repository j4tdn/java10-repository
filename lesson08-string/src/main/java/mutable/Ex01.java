package mutable;

public class Ex01 {
	public static void main(String[] args) {
		// Mutable versus Immutable
		String s1 = "literal";
		hash("s1 hash", s1);
		value("s1 value", s1);
		s1 = s1+" plus";
		hash("s1 hash", s1);
		value("s1 value", s1);
		
		System.out.println("==============");
		
		StringBuilder s2 = new StringBuilder("builder");
		hash("s2 hash", s2);
		value("s2 value", s2);
		s2.append(" plus");
		s2.reverse();
		s2.deleteCharAt(0);
		hash("s2 hash", s2);
		value("s2 value", s2);
		
		System.out.println("==============");
		
		StringBuffer s3 = new StringBuffer("buffer");
		hash("s3 hash", s3);
		value("s3 value", s3);
		s3.append(" plus");
		hash("s3 hash", s3);
		value("s3 value", s3);
		

	}

	private static void hash(String name, CharSequence s) {
		System.out.println(name + ": " + System.identityHashCode(s));
	}

	private static void value(String name, CharSequence s) {
		System.out.println(name + ": " + s);
	}

}
