package generic;

public class GMethod {
	public static void main(String[] args) {
		Integer[] ints = {1,2,3,4,5};
Double[] dous = {1d,2d,3d,4d,5d};
Float[] flos = {1f,2f,3f,4f,5f};
String[] strs = {"a","b","c","d","e"};
printObject(ints);
//printObject(dous);
//printObject(flos);
//printObject(strs);
printGeneric(ints);
printGeneric(flos);
printGeneric(dous);
printGeneric(strs);


}
	// E can be Comparable or sub Comparable
	private static <E extends Comparable> void printGeneric(E[] elements) {
		for ( E element: elements) {
			System.out.println(element + " ");
			
		}
		System.out.println();
		
	}
	private static void printObject(Object[] elements) {
		for(Object element: elements) {
			System.out.println((Integer)element +" ");
		}
		System.out.println();
	}
}
