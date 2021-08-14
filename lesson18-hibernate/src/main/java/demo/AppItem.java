package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemSize;
import service.ItemService;
import service.ItemServiceIml;

public class AppItem {
	private static ItemService itemService;
	static {
		itemService = new ItemServiceIml();
	}

	public static void main(String[] args) {
		// List<Item> igrps = itemService.getAll();
		// igrps.forEach(System.out::println);

//		Item item = itemService.get(3);
//		System.out.println(item);
//		System.out.println("=====");
		Item item2 = itemService.get(10);
		List<ItemSize> sizes = item2.getItemSizes();
		System.out.println(sizes);
//		ItemGroup itemGroup = new ItemGroup();
		
//		ItemGroup itemGroup = new ItemGroup();
//		itemGroup.setIgrId(100);
//		itemGroup.setName("ab");
//		boolean isValid = itemService.save(new Item(20, "Áo khoác 5", "Trắng", "Vải", 100d, 200d, "ud.pn", itemGroup));
//		System.out.println(isValid);
	}
}
