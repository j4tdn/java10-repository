package generic;

import java.util.Arrays;
import java.util.List;

public class WildCard {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 3, 4);
		List<Double> doubles = Arrays.asList(1d, 2d, 3d, 4d);
		List<String> strings = Arrays.asList("a", "b", "c", "d");
		prinftf(strings);

		// support extents
		// reduce declaration
	}
	private static void prinftf(List<? super String> elements) {
		for (Object t : elements) {
			System.out.println(t + " ");
		}
	}
	
	private static void addAll(List<?> first, List<?> second) {
//		first.addAll(second);
	}
}
