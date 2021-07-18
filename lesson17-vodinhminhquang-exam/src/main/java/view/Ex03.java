package view;

import service.ItemGroupService;

public class Ex03 {

	public static void main(String[] args) {

		ItemGroupService itemGroupService = new ItemGroupService();
		itemGroupService.getTopItems().forEach(System.out::println);

	}

}
