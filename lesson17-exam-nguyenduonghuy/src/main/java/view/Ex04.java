package view;

import java.util.List;

import persistence.ItemDtoFullInfo;
import service.ItemService;

public class Ex04 {
	private static ItemService itemService;
	
	static {
		itemService = new ItemService();
	}
	
	public static void main(String[] args) {
		List<ItemDtoFullInfo> list = itemService.getFullInfo();
		list.forEach(System.out::println);
	}
}
