package home;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		
		printf(strings);
		
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1 == null) {
					return 1;
				}
				if(o2 == null) {
					return -1;
				}
				if(o1.equals("Special")) {
					return -1;
				}
				if(o2.equals("Special")) {
					return 1;
				}
				if(o1.matches("-?[0-9]+")) {
					Integer i1 = Integer.parseInt(o1);
					if(o1.matches("-?[0-9]+")) {
						Integer i2 = Integer.parseInt(o2);
						return i1.compareTo(i2);
					}
				}
				
				return o1.compareTo(o2);
			}
		});;
		
		
		printf(strings);
	}
	private static void printf(String[] strings) {
		System.out.println();
		for(String str: strings) {
			System.out.print(str + " ");
			
		}
	}
}
