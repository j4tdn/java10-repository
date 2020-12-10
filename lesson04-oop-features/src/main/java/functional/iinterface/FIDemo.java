package functional.iinterface;

public class FIDemo {
	public static void main(String[] args) {
		int[] a = { 1, 7, 5, 20, 45, 79 };
		Condition con = new Condition() {
			@Override
			public boolean test(int input) {
				return input % 7 == 0;
			}
		};

		printf(a, element -> element % 5 == 0);
		printf(a, element -> element % 7 == 0);

	}

	public static void printf(int[] a, Condition con) {
		for (int i = 0; i < a.length; i++) {
			if (con.test(a[i])) {
				System.out.println(a[i] + " ");
			}
		}
		System.out.println("==================");
	}

	// JAVA08
	// create instance of interface ==>>lambda ==> anonymous funcition
	// pass function in function
	public static void printfEven(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " ");
			}
		}
		System.out.println("==================");
	}

	public static void printfOdd(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i] + " ");
			}
		}
		System.out.println("==================");
	}

	public static void printfCode1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 3) {
				System.out.println(a[i] + " ");
			}
		}
		System.out.println("==================");
	}

	public static void printfCode2(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 5) {
				System.out.println(a[i] + " ");
			}
		}
		System.out.println("==================");
	}
}
