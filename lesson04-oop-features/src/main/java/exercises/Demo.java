package exercises;

import functional.iinterface.Condition;

public class Demo {
public static void main(String[] args) {
	int[] a = { 1, 7, 5,2, 20, 45, 79 };
	Condition con = new Condition() {
		@Override
		public boolean test(int input) {
			return input % 2 == 0;
		}
	};
	int odd=printf(a, element -> element % 2 != 0);
	System.out.println("sum odd le: "+odd);
	System.out.println("sum even: "+printf(a, con));
}

public static int printf(int[] a, Condition con) {
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		if (con.test(a[i])) {
			sum+=a[i];
		}
	}
	return sum;
}
}

