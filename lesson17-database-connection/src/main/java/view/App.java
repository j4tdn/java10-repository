package view;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroup2;
import persistence.ItemGroupDto;
import service.ItemGroupService;

public class App {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupService();
	}
	
	public static void main(String[] args) {
//		List<ItemGroup> itemGroupAll = itemGroupService.getAll();
//		itemGroupAll.forEach(System.out::println);
//		
//		System.out.println("===================");
//		
//		ItemGroup itgsById = itemGroupService.getItemGroups(3);
//		System.out.println(itgsById);;
//		
//		System.out.println("===================");
//		
//		List<ItemGroup> itgsByName = itemGroupService.getItemGroups("Áo");
//		itgsByName.forEach(System.out::println);
//		
//		System.out.println("===================");
//		//itemGroupService.save(new ItemGroup(9,"item group 9"));
//		
//		System.out.println("===================");
//		List<ItemGroup2> itgsByIdPrice = itemGroupService.getItemGroup2s(1, 100, 500);
//		itgsByIdPrice.forEach(System.out::println);
//		
//		System.out.println("**===================");
//		List<ItemGroupDto> inventory = itemGroupService.getItemGroups();
//		inventory.forEach(System.out::println);
//		
//		System.out.println("===================");
//		List<ItemGroup2> itgsByDay = itemGroupService.getItemGroup2ss(LocalDate.of(2020,12,18));
//		itgsByDay.forEach(System.out::println);
//		
//		System.out.println("===================");
//		itemGroupService.addBatch(Arrays.asList(new ItemGroup(101,"Item Group 101"), new ItemGroup(102,"Item Group 102")));
		
		List<String> top = itemGroupService.strings(2020, 3);
		top.forEach(System.out::println);
	}
}
