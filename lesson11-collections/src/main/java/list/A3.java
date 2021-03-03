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
		
		//current modification exception
		/*for(String color : colors) {
			colors.clear();
			System.out.print(color + " ");
		}*/
		
		/*Iterator<String> iterator = colors.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			if("red".equals(element)) {
				iterator.remove();
			}
		}*/
		
		//removeIf => contains "e"
		colors.removeIf(color -> color != null && color.contains("e"));

		for (int i = 0; i < colors.size(); i++) {
			System.out.print(colors.get(i) + " ");
		}
		System.out.println("\n=====================");
		
		//for each
		for(String color : colors) {
			System.out.print(color + " ");
		}
	}
}
