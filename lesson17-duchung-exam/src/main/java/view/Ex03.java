package view;

import java.util.List;

import persistence.Items;
import service.ItemService;

public class Ex03 {
	private static ItemService itemService;
	static {
		itemService = new ItemService();
	}

	public static void main(String[] args) {
		List<Items> itemAll = itemService.getItems();
		itemAll.forEach(System.out::println);

	}

}
