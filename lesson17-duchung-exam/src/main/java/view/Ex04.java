package view;

import java.util.List;

import persistence.ItemsDto;
import service.ItemService;

public class Ex04 {
	private static ItemService itemService;
	static {
		itemService = new ItemService();
	}

	public static void main(String[] args) {
		List<ItemsDto> getItemsOfGroupId = itemService.getItemsOfGroupId();
		getItemsOfGroupId.forEach(System.out::println);

	}

}
