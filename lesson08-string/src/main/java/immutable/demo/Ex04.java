package immutable.demo;

public class Ex04 {
	public static void main(String[] args) {
		// String literal
		String s1 = "abCdEfghjk"; // a: 97
		String s2 = "ab";
		String s3 = "b"; // A: 65
		
		System.out.println("==: " + (s1==s2)); // T
		
		System.out.println("s1.equals(s2): " + (s1.equals(s2)));  // T
		System.out.println("s1.equals(s3): " + (s1.equals(s3)));  // F
		
		System.out.println("s1.equalsIgnoreCase(s3): " + (s1.equalsIgnoreCase(s3))); // T 
		
		System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); // 0
		System.out.println("s1.compareTo(s3): " + s1.compareTo(s3)); // -1
		
		byte unicodea = 'a';
		byte unicodeA = 'A';
		System.out.println("unicodea: " + unicodea);
		System.out.println("unicodeA: " + unicodeA);
	}
}
