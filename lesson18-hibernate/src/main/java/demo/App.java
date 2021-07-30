package demo;

import java.util.List;

import persistence.Item;
import service.ItemService;
import service.ItemServiceImpl;

public class App {

	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		List<Item> elements = itemService.getAll();
		elements.forEach(System.out::println);
	}

	private static <E> void show(List<E> elements) {
		elements.forEach(System.out::println);
	}

}
