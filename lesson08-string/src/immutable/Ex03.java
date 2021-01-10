package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "welcome";
		String s3 = new String("bye");
		modified(s1,  s2);
		modified(s1, "bye");
		modified(s1, s3);
		
		System.out.println("s1==s2: " + (s1==s2));
		System.out.println("s1==s2: " + (s1==s3));
		System.out.println("s1==s2: " + (s2==s3));
	}
	
	private static void modified(String s1, String s2) {
		s1=s2;
	}
}
