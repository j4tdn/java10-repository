package functional.iinterface;

public class FIDemo {
	public static void main(String[] args) {
		// input: int[]
		// output:
		int[] a = { 1, 7, 5, 20, 45, 29 };
		// anonymous class
		// create instance of interface =>> anonymous class
		Condition con = new Condition() {

			@Override
			public boolean test(int input) {
				return input % 2 == 0;
			}
		};

		Condition con1 = input -> input % 3 == 0;

		// Java08
		// create instance of interface =>>lambda >>> anonymous function
		printf(a, con);
		printf(a, con1);
	}

	// design pattern => strategy pattern
	// pass a empty strategy (method input, output)
	public static void printf(int[] a, Condition con) {
		for (int i = 0; i < a.length; i++) {
			if (con.test(a[i])) {
				System.out.print(a[i] + "  ");
			}
		}
		System.out.println("\n===================");
	}
}
