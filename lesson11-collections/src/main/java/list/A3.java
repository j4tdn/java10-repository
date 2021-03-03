package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A3 {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add(null);
		colors.add("red");
		colors.add("black");		
		colors.add("yellow");
		
		// concurent modification exception
		// for(String color: colors) {
		//	colors.clear();
		//		System.out.println(color);
		// }	
		
		Iterator<String> iterator = colors.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			if("red".equals(element)) {
				iterator.remove();
			}
		}
		
		//removeif => contains "e"
		colors.removeIf(color -> color != null && color.contains("e"));
		
		//for index
		for(int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i) + " ");
		}
		
		System.out.println("\n======================");
		
		// for each
		for(String color: colors) {
			System.out.println(color + " ");
		}
	}
}
