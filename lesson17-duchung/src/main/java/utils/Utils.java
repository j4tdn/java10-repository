package utils;

import java.util.List;

public class Utils {
	public Utils() {
	}

	public static <T> void print(List<T> lists) {
		for (T list : lists) {
			System.out.println(list);
		}
	}
}
