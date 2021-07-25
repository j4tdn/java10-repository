package demo;

import java.util.ArrayList;
import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class App {

	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
		List<ItemGroup> result = new ArrayList<>();
		result = itemGroupService.getAll();
		show(result);
	}

	private static <E> void show(List<E> elements) {
		elements.forEach(System.out::println);
	}
}
