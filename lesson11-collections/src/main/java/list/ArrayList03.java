package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class ArrayList03 {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<>();
		
		colors.add(null);
		colors.add("red");
		colors.add("green");
		colors.add("black");
		
		
		
		for (int i = 0; i < colors.size(); i++) {
			System.out.print(colors.get(i) + " ");
		}
		System.out.println("\n================");
		
		colors.remove("red");
		
		
		for (String color : colors) {
			System.out.print(color + " ");
		}
		System.out.println("\n================");
		
//		ConcurrentModificationException
//		for (String color : colors) {
//			if ("black".equals(color)) {
//				colors.remove(color);
//			}
//		}
		
		Iterator<String> iterator = colors.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			if ("red".equals(element)) {
				iterator.remove();
			}
		}
		
		
//		colors.removeIf(new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				return t != null && t.contains("e");
//			}
//		});
		
		colors.removeIf(c -> c != null && c.contains("e"));
		
		for (String color : colors) {
			System.out.print(color + " ");
		}
	}
}
