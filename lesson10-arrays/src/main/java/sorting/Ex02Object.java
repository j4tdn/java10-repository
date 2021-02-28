package sorting;

import static utils.ArraysUtils.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import static java.util.function.Function.*;
import java.util.Comparator;
import static java.util.Comparator.*;

public class Ex02Object {
	public static void main(String[] args) {
		String[] sequense = {"a", "D", "b", null, "C", "A", null};
//		bubblesort(sequense);
		
/*
		Arrays.sort(sequense, new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// null first 
				if (o1 == null) {
					return -1;
				}
				if (o2 == null) {
					return 1;
				}
				return o1.compareTo(o2);
			}
		});
*/
		Arrays.sort(sequense, nullsFirst(comparing(Function.identity())));
		System.out.println(Arrays.toString(sequense));
	}
}
