package data.type;

public class Ex04 {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		hash("origin A hash :", a);
		hash(" origin b hash ", b);

		swap(a, b);
		hash("after A hash :", a);
		hash(" after b hash ", b);
		System.out.println(" main a :" + a);
		System.out.println(" main b :" + b);
		Integer origin = 55;
		Integer assign = 55;
		hash("assign :", assign);
		hash(" origin 1:", origin);
		origin = 66;
		hash("origin 2 :", origin);
		System.out.println(" origin : " + origin);
		String s1 = "hello";
		hash("origin s1:", s1);
		s1 = " xin chao";
		hash("changed", s1);
	}

	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
		System.out.println(" swap a:" + a);
		System.out.println(" swap b:" + b);

	}

	private static void hash(String text, Integer input) {
		System.out.println(text + ":" + System.identityHashCode(input));

	}
	
	private static void hash(String text, String input) {
		System.out.println(text + ":" + System.identityHashCode(input));

	}

}
