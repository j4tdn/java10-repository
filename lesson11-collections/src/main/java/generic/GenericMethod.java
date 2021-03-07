package generic;

public class GenericMethod {
	public static void main(String[] args) {
		Integer[] integers = {1, 2, 3, 4, 5};
		Double[] doubles = {1.2, 2.3, 3.4, 4.5, 5.6};
		String[] strings = {"a", "b", "c", "d", "e"};
		
		printObject(integers);
		printObject(doubles);
		printObject(strings);
		System.out.println("-------------");
		printGeneric(integers);
		printGeneric(doubles);
		printGeneric(strings);
	}
	
	private static <E extends Comparable<E>> void printGeneric(E[] elements) {
		for (E e : elements) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	private static void printObject(Object[] obj) {
		for (Object o : obj) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}
