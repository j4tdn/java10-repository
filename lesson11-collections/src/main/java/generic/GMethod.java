package generic;

import beans.Item;

public class GMethod {
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3, 4, 5 };
		Double[] dous = {1d, 2d, 3d, 4d, 5d};
		Float[] flos = {1f, 2f, 3f, 4f, 5f};
		String[] strs = {"a", "b", "c", "d", "e"};
		
		printfObject(ints);
		printfObject(dous);
		printfObject(flos);
		printfObject(strs);
		
		System.out.println("==============================");
		
		printGeneric(ints);
		printGeneric(dous);
		printGeneric(flos);
		printGeneric(strs);
		printGeneric(new Item[] {});
	}
	
	private static <E extends Comparable> void printGeneric(E[] elements) {
		for(E element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	private static void printfObject(Object[] elements) {
		for(Object element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
