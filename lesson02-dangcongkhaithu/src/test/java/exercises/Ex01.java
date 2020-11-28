package exercises;

public class Ex01 {
	public static void main(String[] args) {
		MyInteger a = new MyInteger(15);
		MyInteger b = new MyInteger(9);
		MyInteger c = new MyInteger(8);
		sort(a, b, c);

		System.out.println(a + "  " + b + "  " + c);

	}

	private static void sort(MyInteger a, MyInteger b, MyInteger c) {
		if (a.value > b.value) {
			swap(a, b);
		}
		if (a.value > c.value) {
			swap(a, c);
		}
		if (b.value > c.value) {
			swap(b, c);
		}
	}

	private static void swap(MyInteger a, MyInteger b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}
}