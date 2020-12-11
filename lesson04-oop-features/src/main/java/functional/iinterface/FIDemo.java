package functional.iinterface;

public class FIDemo {
	public static void main(String[] args) {
		// input: int[]
		// output:
		int[] a = { 1, 7, 8, 5, 21, 45, 49 };
		// create instance of interface =>>> anonymous class
		Condition con = new Condition() {
			@Override
			public boolean test(int input) {
				return input % 7 == 0;
			}
		};
		
		// Condition con1 = input -> input % 7 == 0;
		
		// JAVA08
		// create instance of interface =>>> lambda >>> anonymous function
		// lambda: (parameters) -> {
		//   body   
		// }
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
		System.out.println("\n==================");
	}
	
}
