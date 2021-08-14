package demo;

import java.util.List;

import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.impl.ItemGroupServiceImpl;

public class ItemGroupDemo {
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		// 2
		List<ItemGroupDto> itemGroupDtos = itemGroupService.getItemGroupDtos();
		itemGroupDtos.forEach(System.out::println);
		
	}
}
