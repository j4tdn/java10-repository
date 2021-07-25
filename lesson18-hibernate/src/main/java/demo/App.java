package demo;

import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceIml;

public class App {

	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceIml();
	}

	public static void main(String[] args) {
		List<ItemGroup> igrps = itemGroupService.getAll();
		show(igrps);
	}

	private static <E> void show(List<E> element) {
		element.forEach(System.out::println);
	}

}
