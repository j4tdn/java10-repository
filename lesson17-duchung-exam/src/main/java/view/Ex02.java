package view;

import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;

public class Ex02 {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupService();
	}

	public static void main(String[] args) {
		List<ItemGroup> itemGroupAll = itemGroupService.getAll();
		itemGroupAll.forEach(System.out::println);

	}

}
