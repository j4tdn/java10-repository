package view;

import java.util.List;

import persistence.ItemGroupDto;
import service.ItemGroupService;

public class Ex02 {
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupService();
	}
	
	public static void main(String[] args) {
		List<ItemGroupDto> list = itemGroupService.getAllItemGroupDto();
		list.forEach(System.out::println);
	}
}
