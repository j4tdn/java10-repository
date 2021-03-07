package generic;

public class GMethod {
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3, 4, 5 };
		Double[] dous = { 1d, 2d, 3d, 4d, 5d };
		Float[] flos = { 1f, 2f, 3f, 4f, 5f };
		String[] strs = { "a", "b", "c", "d", "e" };

		printfObjects(ints);
		printfObjects(strs);
		printfObjects(dous);
		printfObjects(flos);
		System.out.println("=================");
		printGeneric(ints);
		printGeneric(strs);
		printGeneric(dous);
		printGeneric(flos);
	}

	private static <E> void printGeneric(E[] elements) {
		for (E element : elements) {
			System.out.println(element + " ");
		}
		System.out.println();
	}

	private static void printfObjects(Object[] elements) {
		for (Object element : elements) {
			System.out.println(element + " ");
		}
		System.out.println();
	}
}
