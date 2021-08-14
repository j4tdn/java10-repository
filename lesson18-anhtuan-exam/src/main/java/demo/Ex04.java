package demo;

import java.util.List;

import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex04 {
	
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		List<ItemGroupDto> inventory = itemGroupService.Items();
		inventory.forEach(System.out::println);
	}

}
