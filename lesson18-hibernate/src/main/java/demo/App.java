package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
//		List<ItemGroup> elements = itemGroupService.getAll();
//		elements.forEach(System.out::println);
		
//		ItemGroup igr = itemGroupService.get(2);
//		System.out.println(igr);
		
		List<Item> items = itemService.getAll();
		items.forEach(System.out::println);
	}
	
//	private static <E> void show(List<E> elements) {
//		elements.forEach(System.out::println);
//	}
	

}
