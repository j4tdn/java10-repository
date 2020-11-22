package data.type;

public class test {
	public static void main (String[] args) {
		String s1 = "hello";
		System.out.println(System.identityHashCode(s1));
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));

		String s2 = s1.toUpperCase();
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		
	}
}
