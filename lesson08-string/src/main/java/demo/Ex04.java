package demo;

public class Ex04 {
	public static void main(String[] args) {
		// String literal
		String s1 = "ab";
		String s2 = "ab";
		String s3 = "AB";

		System.out.println("==: " + (s1 == s2));
		System.out.println("s1 equals s2: " + (s1.equals(s2)));
		System.out.println("s1 equals s3: " + (s1.equals(s3)));

		System.out.println("s1 equalsIgnoreCase: " + (s1.equalsIgnoreCase(s2)));

		System.out.println("S1 compareTo (s2): " + s1.compareTo(s2));
		System.out.println("S1 compareTo (s2): " + s1.compareTo(s3));

	}
}