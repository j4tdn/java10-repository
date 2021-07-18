package view;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemsDto;
import service.ItemService;

public class Ex01 {
	private static ItemService itemService;
	static {
		itemService = new ItemService();
	}

	public static void main(String[] args) {
		//2019, 11, 23
		LocalDate salesDate = LocalDate.of(2020, 12, 18);
		List<ItemsDto> getItemsOfGroupId = itemService.getItems(salesDate);
		getItemsOfGroupId.forEach(System.out::println);

	}

}
