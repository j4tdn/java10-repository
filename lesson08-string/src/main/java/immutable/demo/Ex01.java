package immutable.demo;

public class Ex01 {
	public static void main(String[] args) {
		String s = "Welcome";
		System.out.println(s.length());

		String s1 = s.concat(" to Java10");
		System.out.println(s1);

		System.out.println(s.charAt(3));

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + " ");
		}

		System.out.println(s.indexOf('e'));
		System.out.println(s.lastIndexOf('e'));

	}
}
