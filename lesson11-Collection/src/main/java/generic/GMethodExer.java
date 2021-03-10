package generic;

import java.util.Arrays;
import java.util.List;

public class GMethodExer {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 3);
		List<Double> dous = Arrays.asList(1d, 2d, 3d);
		List<String> strs = Arrays.asList("a", "b", "c");

		prinf(strs);
	}

	private static <E> void prinf(List<E> elements) {
		for (E element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
