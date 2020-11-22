package data.type;

public class Ex04 {
	public static void main(String[] args) {
		Integer a =  new Integer(10);
		Integer b = 20;
		hash("Before A Hash:", a);
		hash("Before B Hash:", b);
		swap(a, b);
		hash("After A Hash:", a);
		hash("After B Hash:", b);
		System.out.println("Main a:" + a);
		System.out.println("Main b:" + b);

		// Integer, String, Float: Immutable Object (giá trị bất biến ở heap)
		// immutable : cannot change origin value in HEAP
		Integer origin = 55;
		Integer assign = 55;
		hash("origin 1: ", origin);
		hash("assign : ", assign);
		origin = 66;
		hash("origin 2: ", origin);

		System.out.println("origin:" + origin);
		String s1 = "hello";
		hash("s1", s1);

		s1 = "xin chao";
		hash("change", s1);
	
		
	}

	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
		System.out.println("Swap a:" + a);
		System.out.println("Swap b:" + b);
	}

	private static void hash(String text, Integer input) {
		// origin allocated address from JVM : địa chỉ gốc được cấp phát từ máy ảo jv
		System.out.println(text + ":" + System.identityHashCode(input));
	}
	
	private static void hash(String text, String input) {
		// origin allocated address from JVM : địa chỉ gốc được cấp phát từ máy ảo jv
		System.out.println(text + ":" + System.identityHashCode(input));
	}
}
