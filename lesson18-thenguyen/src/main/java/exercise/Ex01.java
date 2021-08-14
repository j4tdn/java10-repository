package exercise;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.ItemmDto;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex01 {
    private static ItemService itemService;

    static {
        itemService = new ItemServiceImpl();
    }

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2020, 12, 18);
        Date date = Date.valueOf(localDate);
        List<ItemmDto> itgsByDay = itemService.getDayDtos(date);
        show(itgsByDay);

    }
    private static <E> void show(List<E> elements) {
		elements.forEach(System.out::println);
	}
}
