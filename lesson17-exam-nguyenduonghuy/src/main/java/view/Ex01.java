package view;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto;
import service.ItemService;

public class Ex01 {
	private static ItemService itemService;
	
	static {
		itemService = new ItemService();
	}
	
	public static void main(String[] args) {
		List<ItemDto> list = itemService.get(LocalDate.parse("2020-12-18"));
		list.forEach(System.out::println);
	}
}
