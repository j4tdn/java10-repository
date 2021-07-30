package demo;

import java.util.List;

import persistence.Item;
import service.ItemService;
import service.ItemServiceIml;

public class AppItem {
	private static ItemService itemService;
	static {
		itemService = new ItemServiceIml();
	}

	public static void main(String[] args) {
		List<Item> igrps = itemService.getAll();
		igrps.forEach(System.out::println);
	}
}
