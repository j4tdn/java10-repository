package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class A3 {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("black");
		colors.add("yellow");

		// concurrent modification exception
		// for (String color : colors) {
		// if ("red".equals(color)) {
		// colors.remove(color);
		// }
		// }
		Iterator<String> iterator = colors.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			if ("red".equals(element)) {
				iterator.remove();
			}
		}

		// removeIf => contains "e"
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t != null && t.contains("e") ;
			}
		};

		colors.removeIf(predicate);
		
		// rut gon lamda
		//colors.removeIf(color -> color != null && color.contains("e"));

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i) + "");
		}
		System.out.println("\n=======================");

		for (String color : colors) {
			System.out.println(color + " ");
		}
	}
}
