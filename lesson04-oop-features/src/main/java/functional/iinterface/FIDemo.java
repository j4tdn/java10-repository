package functional.iinterface;

public class FIDemo {
	public static void main(String[] args) {
		// input: int[]
		// output
		int[] a = { 1, 7, 8, 5, 20, 45, 29 };
		Condition con = new Condition() {
			
			@Override
			public boolean test(int input) {
				return input % 7 == 0;
			}
		};
		
		// anonymous class
		// create instance of interface
		// =>>> anonymous function
		// =>>> lambda fucntion
		// lambda: (parameter[1], parameter[i]) -> {
		//  return ... ;
		// }
		printf(a, element -> element % 5 == 0);
		printf(a, element -> element % 7 == 0);

	}

	// behavior
	// design patter --> strategy pattern
	// pass a empty strategy ~ a method has input & output
	public static void printf(int[] a, Condition con) {
		for (int i = 0; i < a.length; i++) {
			if (con.test(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println("\n=====================");
	}

}
