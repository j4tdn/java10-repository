package sorting;

import static utils.ArrayUtils.*;
import static java.util.Comparator.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequencces = { "a", "c",null, "B", "A",null };
		// bubbleSort(sequencces);
		/*Arrays.sort(sequencces, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1 == null) {
					return 1;
				}
				if(o2==null) {
					return -1;
				}
				return o1.compareTo(o2);
			}
		});*/
		
		Arrays.sort(sequencces, nullsFirst(comparing(Function.identity())));

		System.out.println(Arrays.toString(sequencces));

	}
}
