package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import javax.sound.midi.Sequence;

import utils.ArrayUtils;

public class Ex02 {
	public static void main(String[] args) {
		String[] chars = {"a", "c", null, "B", "A", null};
	
		//ArrayUtils.bubbleSort(chars);
		/*Arrays.sort(chars, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1 == null) {
					return 1;
				}
				if(o2 == null) {
					return -1;
				}
				return o1.compareTo(o2);
			}
		});*/
		
		Arrays.sort(chars, Comparator.nullsFirst(Comparator.comparing(Function.identity())));
		
		System.out.println(Arrays.toString(chars));
	}

}
