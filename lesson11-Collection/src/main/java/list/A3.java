package list;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class A3 {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<>();

		colors.add("red");
		colors.add("black");
		colors.add(null);
		colors.add("yellow");

		// colors.clear(); ==> remove ALL
		// concurrent Modification Exception
		// for (String color : colors) {
		// if("black".equals(color)) {
		// colors.remove(color);
		// }
		// System.out.println(color + " ");
		// }

		Iterator<String> iterator = colors.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			if("yellow".equals(element)) {
				iterator.remove();
			}
		}
		
		//removeIf ==> contains "e"
		colors.removeIf(color -> color!= null && color.contains("e"));
		

		// for index
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i) + " ");
		}

		System.out.println("\n=========================");
		for (String color : colors) {
			System.out.println(color + " ");
		}
	}
}
