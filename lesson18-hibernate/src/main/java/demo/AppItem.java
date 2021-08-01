package demo;

import persistence.Item;
import service.ItemService;
import service.ItemServiceIml;

public class AppItem {
	private static ItemService itemService;
	static {
		itemService = new ItemServiceIml();
	}

	public static void main(String[] args) {
		//List<Item> igrps = itemService.getAll();
		//igrps.forEach(System.out::println);
		
		Item item = itemService.get(3);
		System.out.println(item);
		System.out.println("=====");
		Item item2 = itemService.get(3);
		System.out.println(item2);
	}
}
