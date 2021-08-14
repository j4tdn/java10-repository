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

		// Câu 1
		LocalDate localDate = LocalDate.of(2020, 12, 18);
		Date date = Date.valueOf(localDate);
		List<ItemDto> itgsByDay = itemService.getDayDtos(date);
		itgsByDay.forEach(System.out::println);

		// Câu 3
		List<String> getTop = itemService.getTop(2020, 3);
		show(getTop);

	}

	private static <E> void show(List<E> elements) {
		elements.forEach(System.out::println);
	}

}
