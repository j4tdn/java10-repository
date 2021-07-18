package view;

import service.ItemGroupService;

public class Ex04 {

	public static void main(String[] args) {
		ItemGroupService itemGroupService = new ItemGroupService();
		itemGroupService.getAll().forEach(System.out::println);
	}

}
