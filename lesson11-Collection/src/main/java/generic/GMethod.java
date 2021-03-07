package generic;

public class GMethod {
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3, 4, 5 };
		Double[] dous = { 1d, 2d, 3d, 4d, 5d };
		Float[] flos = { 1f, 2f, 3f, 4f, 5f };
		String[] strs = { "a", "b", "c", "d", "e" };

		printf(ints);
		//printf(dous);
		//printf(flos);
		//printf(strs);
		System.out.println();
		System.out.println("===================================");
		printGeneric(ints);
		printGeneric(dous);
		printGeneric(flos);
		printGeneric(strs);
	}
    //generic can be Comparable or sub Comparable 
	private static <E extends Comparable<E>> void printGeneric(E[] elements) {
		for (E element : elements) {
			System.out.print( element + " ");
		}
		System.out.println();
	}

	private static void printf(Object[] elements) {
		for (Object element : elements) {
			System.out.print((Integer) element + " ");
		}

	}
}
