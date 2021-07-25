package view;

import java.util.Arrays;
import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;

public class App {

	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupService();
	}

	public static void main(String[] args) {
		List<ItemGroup> itemGroupAll = itemGroupService.getAll();
		itemGroupAll.forEach(System.out::println);

		System.out.println("==============================");

		ItemGroup itgById = itemGroupService.getItemGroups(2);
		System.out.println(itgById);

		System.out.println("==============================");

		List<ItemGroup> itgByName = itemGroupService.getItemGroups("Áo");
		itgByName.forEach(System.out::println);
		
		System.out.println("==============================");
		List<ItemGroupDto> igrsById = itemGroupService.getItemGroups();
		igrsById.forEach(System.out::println);
		
		
		System.out.println("==============================");
		// itemGroupService.save(new ItemGroup(30, "Item Group 30"));
		
		System.out.println("==============================");
		itemGroupService.addBatch(Arrays.asList(new ItemGroup(100, "Item Group 100"), new ItemGroup(101, "Item Group 101")));
		
	
	}
	
	
}
