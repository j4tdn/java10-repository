package demo;

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
		List<ItemGroup> igrps = itemGroupService.getAll();
		show(igrps);
	}

	private static <E> void show(List<E> elements) {
		elements.forEach(System.out::println);
	}
}
