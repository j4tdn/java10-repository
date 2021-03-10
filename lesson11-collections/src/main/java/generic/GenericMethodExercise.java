package generic;

import java.util.Arrays;
import java.util.List;

public class GenericMethodExercise {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 3);
		List<Double> doubles = Arrays.asList(1d, 2d, 3d);
		List<String> strings = Arrays.asList("a", "b", "c");
		
		printf(ints);
	}
	
	private static <E> void printf( List<E> elements) {
		for (E e : elements) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
