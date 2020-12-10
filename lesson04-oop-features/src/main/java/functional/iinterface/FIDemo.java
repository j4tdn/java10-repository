package functional.iinterface;

public class FIDemo {
	public static void main(String[] args) {
		// input : input[]
		// out
		int[] a = { 1, 7, 8, 5, 20, 21, 49, 45, 29 };
		//
		// create instance of interface ===> anonymous class
		Condition con = new Condition() {
			public boolean test(int input) {
				return input % 7 == 0;
			}
		};
		Condition con1 = input -> input % 7 == 0;

		// Java08
		// create instance of interface ===> anonymous class
		// lambda: (parameters) -> {
		// body };
		printf(a, element -> element % 5 == 0);
		printf(a, element -> element % 7 == 0);

	}

	// behavior
	// design pattern => strategy pattern
	// pass a empty strategy (method input, output)
	public static void printf(int[] a, Condition con) {
		for (int i = 0; i < a.length; i++) {
			if (con.test(a[i])) {
				System.out.print(a[i] + "   ");
			}
		}
		System.out.println("\n==============");
	}

}
