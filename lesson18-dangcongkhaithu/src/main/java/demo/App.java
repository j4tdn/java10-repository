package demo;

import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemDtoAmount;
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
		
//		  List<Item> items = itemService.getAll();
//		  items.forEach(a -> System.out.println(a));
//		
//		List<ItemDtoAmount> items = itemService.getTopThree(2020);
//		items.forEach(item -> System.out.println(item));
		 

//		List<ItemGroupDto> dtos = itemGroupService.getItemGroupDtos();
//		 dtos.forEach(dto -> System.out.println(dto));

	}

}
