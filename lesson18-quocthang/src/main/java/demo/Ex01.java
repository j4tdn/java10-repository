package demo;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex01 {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2020, 10, 30);
		Date date = Date.valueOf(localDate);
		List<ItemDto> itgsByDay = itemService.getDay(date);
		itgsByDay.forEach(System.out::println);

	}

}
