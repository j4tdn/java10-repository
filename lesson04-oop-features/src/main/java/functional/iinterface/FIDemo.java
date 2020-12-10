package functional.iinterface;

public class FIDemo {
	public static void main(String[] args) {
		int[] a = { 1, 6, 8, 5, 45, 29, 49  };
		Condition con = new Condition() {
			@Override
			public boolean test(int input) {
				return false;
			}
		};
		
		Condition con1 =  input -> input %  7 == 0;
		
		printf(a, element -> element %  7 == 0);
		printf(a, element -> element %  5 == 0);
	}
	// input: int[]
	// output:
	public static void printf(int[] a, Condition con) {
		for (int i = 0; i < a.length; i++) {
			if (con.test(a[i])) {
				System.out.println(a[i] + " ");
			}
		}
		System.out.println("\n===============");

	}



}
