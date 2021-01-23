package immutable.demo;

public class Ex04 {
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "ab";
		String s3 = "AB";
		
		System.out.println("== " + (s1 == s2));
		
		System.out.println("equals: " + s1.equals(s2));
		System.out.println("equals: " + s1.equals(s3));
		
		System.out.println("equalIgnoreCase: " + s1.equalsIgnoreCase(s3));
		
		System.out.println("s1.compareTo(2): " + s1.compareTo(s2));
		System.out.println("s1.compareTo(3): " + s1.compareTo(s3));
	}
}