package exercise;

import java.util.List;

import persistence.Items2;
import service.ItemService;

public class Ex03 {
	private static ItemService itemService;
	static {
		itemService = new ItemService();
	}

	public static void main(String[] args) {
		List<Items2> itemAll = itemService.getItems2();
		itemAll.forEach(System.out::println);

	}
}
