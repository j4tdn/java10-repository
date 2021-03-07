package generic;

import java.util.Objects;

public class GMethod {
	public static void main(String[] args) {
		Integer[] ints = {1, 2, 3, 4, 5};
		Double[] dous = { 1d, 2d, 4d, 5d};
		Float[] flos = { 1f, 2f, 3f, 4f, 5f};
		String[] strs = {"a","b","c","d","e"};
		
		//printfObject(ints);
		//printfObject(dous);
		//printfObject(flos);
		//printfObject(strs);
		
		System.out.println("===============");
		printGeneric(ints);
		printGeneric(dous);
		printGeneric(flos);
		printGeneric(strs);
	}
	
	//E can be Comparable or sub Comparable
	private static <E extends Comparable<E> > void printGeneric(E[] elements) {
		for (E element: elements) {
			System.out.println(element + " ");
		}
		System.out.println();
	}

	private static void printfObject(Objects[] elements) {
		for (Object element: elements) {
			System.out.println((Integer)element + " ");
		}
		System.out.println();
	}
}