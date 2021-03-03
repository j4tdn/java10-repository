package list;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03 {
	public static void main(String[] args) {
		List<String> colers = new ArrayList<>();

		colers.add(null);
		colers.add("red");
		colers.add("black");
		colers.add("yellow");

		// concurrent modification exception
//		for(String color: colers) {
//			if("black".equals(color)) {
//				colers.remove(color);
//			}
//		}

		Iterator<String> iterator = colers.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			if ("yellow".equals(element)) {
				iterator.remove();
			}

		}
		

		// removeIf => contain "e"
		colers.removeIf(color -> color != null && color.contains("e"));
		
		

		// for index
		for (int i = 0; i < colers.size(); i++) {
			System.out.print(colers.get(i) + " ");
		}
		System.out.println("\n====================");
		
			

		// for each
	}

}
