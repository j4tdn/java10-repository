package view;

import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;

public class App {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupService();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> itgroupAll = itemGroupService.getAll();
		itgroupAll.forEach(System.out::println);
		
		System.out.println("===================================");
		
		ItemGroup itgById = itemGroupService.getItemGroups(3);
		System.out.println(itgById);
		
		System.out.println("===================================");
		List<ItemGroup> itgsByName = itemGroupService.getItemGroups("Áo");
		itgsByName.forEach(System.out::println);
		System.out.println("===================================");
		itemGroupService.save(new ItemGroup(19, "Item Group 19"));
		
	}
}
