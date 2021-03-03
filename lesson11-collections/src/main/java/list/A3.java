package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class A3 {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add(null);
		colors.add("red");
		colors.add("black");
		colors.add("yellow");

		// concurrent modification exception
		// for (String color : colors) {
		// if("black".equals(color)) {
		// colors.remove(color);
		// }
		// System.out.println(color + " ");
		// }
		Iterator<String> iterator = colors.iterator();
		while (iterator.hasNext()) {
			String elment = iterator.next();
			if ("red".equals(elment)) {
				iterator.remove();
			}
		}

		// removeIf => contains "e"
		colors.removeIf(color -> color != null && color.contains("e"));

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i) + " ");
		}
		System.out.println("\n=====================");

		for (String color : colors) {
			System.out.println(color + " ");
		}
	}
}
