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
		colors.add("yellow");
		colors.add(null);

		
		Iterator<String> iterator= colors.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			if("red".equals(element)) {
				iterator.remove();
			}
		}
	
		colors.removeIf(color -> color != null && color.contains("e"));
		// for index
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i) + " ");
		}
		System.out.println("\n===========");
		// for each
		for (String color : colors) {
			System.out.println(color + " ");
		}

	}
}
