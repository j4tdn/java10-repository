package view;

import java.time.LocalDate;

import service.ItemGroupService;

public class Ex01 {
	
	public static void main(String[] args) {
		ItemGroupService itemGroupService = new ItemGroupService();
		itemGroupService.getItemInDay(LocalDate.of(2020, 12, 18)).forEach(System.out::println);
	}
	
}
