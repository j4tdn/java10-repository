package view;

import java.util.List;

import service.ItemService;

public class Ex03 {
	private static ItemService itemService;
	
	static {
		itemService = new ItemService();
	}
	
	public static void main(String[] args) {
		List<String> list = itemService.getTop3Item(2020);
		list.forEach(System.out::println);
	}
}
