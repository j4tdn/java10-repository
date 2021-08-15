package demo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import persistence.Item;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {

	private static ItemService itemService;
	private static ItemGroupService itemGroupService;

	static {
		itemService = new ItemServiceImpl();
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
//		// Ex01
//		List<Item> itemsByDate = itemService.getItem(LocalDate.parse("2020-12-18"));
//		itemsByDate.forEach(System.out::println);

//		// Ex02
//		List<ItemGroupDto> itemsDto = itemGroupService.getItemDtos();
//		itemsDto.forEach(System.out::println);
//		System.out.println("=========================");		
		
		// Ex03
		List<Item> topItems = itemService.getTopItems(2020, 3);
		topItems.forEach(System.out::println);
		
//		// Ex04
//		List<Item> items = itemService.getAll();
//		items.forEach(System.out::println);

	}
}
