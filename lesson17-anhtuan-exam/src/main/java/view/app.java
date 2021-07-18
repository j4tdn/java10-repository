package view;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroup2;
import persistence.ItemGroup3;
import service.ItemGroupService;

public class app {
	
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupService();
	}
	
	public static void main(String[] args) {
		System.out.println("Câu 1");
		LocalDate localDate = LocalDate.of(2020, 12, 18);
		Date date = Date.valueOf(localDate);
		List<ItemGroup> itgsByDay = itemGroupService.itemGroups(date);
		itgsByDay.forEach(System.out::println);
		System.out.println("==================================================================");
		System.out.println("Câu 2");
		List<ItemGroup2> inventory = itemGroupService.itemGroup2s();
		inventory.forEach(System.out::println);
		System.out.println("==================================================================");
		System.out.println("Câu 3");
		List<String> top = itemGroupService.strings(2020);
		top.forEach(System.out::println);
		System.out.println("==================================================================");
		System.out.println("Câu 4");
		List<ItemGroup3> all = itemGroupService.itemGroup3s();
		all.forEach(System.out::println);
	}

}
