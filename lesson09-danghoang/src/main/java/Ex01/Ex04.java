package Ex01;

public class Ex04 {
	public static void main(String[] args) {
		String s = " Welcome to JAVA10 class ";
		System.out.println(s);
		System.out.println("=======================");
		System.out.println(revert(s));
	}

	public static String revert(String s) {
		String[] string1 = s.trim().split("\\s+");
		for (int i = 0; i < string1.length; i++) {
			StringBuilder a = new StringBuilder(string1[i]);
			string1[i] = a.reverse().toString();
		}
		return String.join(" ", string1);
	}

}
