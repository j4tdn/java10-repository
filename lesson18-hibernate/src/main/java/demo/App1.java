package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App1 {
	private static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
//		List<Item> elements = itemService.getAll();
//		elements.forEach(System.out::println);

//	    ItemGroup igr = itemGroupService.get(1);
//		System.out.println(igr);

		List<ItemGroup> igs = itemGroupService.getAll();
		igs.forEach(ig -> {
			System.out.println("size: " + ig.getItems().size());
		});

	}

}
