package immutable.demo;

public class Ex04 {
	public static void main(String[] args) {
		// String literal
		String s1 = "ab";
		String s2 = "ab";
		String s3 = "AB";
		
		System.out.println("==: " + (s1 == s2)); // T
		
		System.out.println("equals: " + s1.equals(s2)); // T
		System.out.println("equals: " + s1.equals(s3)); // F
		
		System.out.println("equalIgnoreCase: " + s1.equalsIgnoreCase(s3)); // T
		
		System.out.println("s1.compareTo(2): " + s1.compareTo(s2)); // 0
		System.out.println("s1.compareTo(3): " + s1.compareTo(s3)); // 32
		
		byte unicodea = 'a';
		byte unicodeA = 'A';
		System.out.println("unicodea: " + unicodea);
		System.out.println("unicodeA: " + unicodeA);
	}
}
