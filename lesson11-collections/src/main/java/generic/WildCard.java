package generic;

import java.util.Arrays;
import java.util.List;

public class WildCard {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 3);
		List<Double> dous = Arrays.asList(1d, 2d, 3d);
		List<String> strs = Arrays.asList("a", "b", "c");
		//printf(strs);
		
		// support extends, super
		// reduce declaration
	}

	private static void printf(List<? super CharSequence> elements) {
		for (Object cs : elements) {
			System.out.println(cs.toString());
		}
	}
	private static void addAll(List<?> first, List<?> second) {
		//first.addAll(second)
	}
}
