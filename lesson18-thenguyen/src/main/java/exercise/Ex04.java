package exercise;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import persistence.ItemDto;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex04 {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		List<ItemDto> item =itemService.get();
		show(item);
	}
	private static <E> void show(List<E> elements) {
		elements.forEach(System.out::println);
	}
}
