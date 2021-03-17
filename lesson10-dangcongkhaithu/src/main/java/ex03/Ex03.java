package ex03;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1 == null) {
					return 1;
				}
				if (s2 == null) {
					return -1;
				}

				if (s1.equalsIgnoreCase("Special")) {
					return 1;
				}

				if (s2.equalsIgnoreCase("Special")) {
					return 2;
				}

				if (s1.matches("-?[0-9]+")) {
					Integer i1 = Integer.parseInt(s1);
					if (s2.matches("-?[0-9]+")) {
						Integer i2 = Integer.parseInt(s2);
						return i1.compareTo(i2);
					}
				}

				return s1.compareTo(s2);
			}
		});
	}
}
