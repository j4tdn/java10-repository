package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
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
		
//		List<ItemGroup> igs = itemGroupService.getAll();
//		igs.forEach(ig -> System.out.println(ig));
//		
//		System.out.println("=====================");
//		
//		List<Item> items = itemService.getAll();
//		items.forEach(System.out::println);
//		
//		Item it1 = itemService.getItem(5);
//		System.out.println(it1);
//		
//		Item it2 = itemService.getItem(5);
//		System.out.println(it2);
//		Item item1 = itemService.get(1);
//		System.out.println(item1);
//		System.out.println("==============");
//		Item item2 = itemService.get(1);
//		System.out.println(item2);
//		
		List<ItemGroupDto> result = itemGroupService.getDtos();
		result.forEach(System.out::println);
	}
	
//	private static <E> void show(List<E> elements) {
//		elements.forEach(System.out::println);
//	}
	

}
