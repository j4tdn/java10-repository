package exercise04;

public class LeastCommonMultiple {
	public static void main(String[] args) {
		int a[] = {1,3,9};
		System.out.println("Least common multiple: " );
		leastCommonMultiple_Arr(a);
	}

	public static int greatestCommonMultiple(int a, int b) {
		if (b == 0)
			return a;
		return greatestCommonMultiple(b, a % b);

	}

	public static int leastCommonMultiple(int a, int b) {
		return (a * b) / greatestCommonMultiple(a, b);
	}

	public static void leastCommonMultiple_Arr(int a[]) {
		int temp = leastCommonMultiple(a[0], a[1]);
		for (int i = 2; i < a.length; i++) {
			temp = leastCommonMultiple(temp, a[i]);
		}
		System.out.println(temp);
	}
}
