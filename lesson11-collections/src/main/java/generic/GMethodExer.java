package generic;

import java.util.Arrays;
import java.util.List;

public class GMethodExer {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,2,3);
		List<Double> dous = Arrays.asList(1d,2d,3d);
		List<String> strs = Arrays.asList("a", "b", "C");
		
		printf(ints);
		printf(dous);
		printf(strs);
	}
	
	private static <E> void printf(List<E> elements) {
		for (E e: elements) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
