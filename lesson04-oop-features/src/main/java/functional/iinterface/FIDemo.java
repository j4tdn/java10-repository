package functional.iinterface;

public class FIDemo {
	public static void main(String[] args) {
		int[] a = { 1, 7, 5, 20, 45, 29, 40, 28 };

		Condition con = new Condition() {

			@Override
			public boolean test(int input) {
				return input % 7 == 0;
			}
		};
		prinf(a, con);

		// JAVA08
		// create instance of interface =>>> lambda >>> anonymous function
		// lambda: (parameters) -> {
		// body
		// }
		Condition con1 = input -> input % 2 == 0;
		prinf(a, con1);
	}

	// behavior
	// design pattern => strategy pattern
	// pass a empty strategy (method input, output)
	public static void prinf(int[] a, Condition con) {
		for (int i : a) {
			if (con.test(i)) {
				System.out.print(i + "   ");
			}
		}
		System.out.println("\n===============");
	}

	public static void prinfEven(int[] a) {
		for (int i : a) {
			if (i % 2 == 0) {
				System.out.print(i + "   ");
			}
		}
		System.out.println("\n===============");
	}

	public static void prinfOdd(int[] a) {
		for (int i : a) {
			if (i % 2 != 0) {
				System.out.print(i + "   ");
			}
		}
		System.out.println("\n===============");
	}
}
