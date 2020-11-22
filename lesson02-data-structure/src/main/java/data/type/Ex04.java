package data.type;

public class Ex04 {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		hash("origin A Hash ", a);
		hash("origin B Hash ", b);

		swap(a, b);
		hash("After swap  A Hash ", a);
		hash("After swap  B Hash ", b);

		System.out.println("main a :" + a);
		System.out.println("main b :" + b);

		// Integer , String, Float : Immutable Object
		// Immutable:cannot change origin value in HEAP

		Integer origin = new Integer(55);
		Integer assign = new Integer(55);

		hash("origin 1 : ", origin);
		hash("assign   : ", assign);

		origin = 66;
		hash("origin 2 : ", origin);

		System.out.println("origin : " + origin);

		String s1 = "hello";
		hash("origin s1 : ", s1);

		s1 = "xin chao";
		hash("change s1 : ", s1);

	}

	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap a :" + a);
		System.out.println("swap b :" + b);
	}

	private static void hash(String text, Integer input) {
		// origin allocated address from JVM (dia chi goc duoc cap phat trong may ao
		// java)
		System.out.println(text + ":  " + System.identityHashCode(input));

	}

	private static void hash(String text, String input) {
		// origin allocated address from JVM (dia chi goc duoc cap phat trong may ao
		// java)
		System.out.println(text + ":  " + System.identityHashCode(input));

	}

}
