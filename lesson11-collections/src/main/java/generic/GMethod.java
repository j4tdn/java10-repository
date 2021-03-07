package generic;

public class GMethod {
	public static void main(String[] args) {
		Integer[] ints = {1, 2, 3, 4, 5};
		Double[]  dous = {1d, 2d, 3d, 4d};
		Float[]   flos = {1f, 2f, 3f, 4f};
		String[]  strs = {"a", "b", "c", "d", "e"};
		printObject(ints);
//		printObject(dous);
//		printObject(flos);
//		printObject(strs);
		System.out.println("=======================");
		printGeneric(ints);
		printGeneric(dous);
		printGeneric(flos);
		printGeneric(strs);
	}
	// E extends Number -> kieu tra ve la Number va con cua Number
	// Ecan be Comparable or sub Comparable
	private static <E extends Comparable<E>> void printGeneric(E[] elements) {
		for(E element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	private static void printObject(Object[] elements) {
		for(Object element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
