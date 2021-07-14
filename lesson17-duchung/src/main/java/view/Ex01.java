package view;

import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;

public class Ex01 {
	private static ItemGroupService itemGroupService;
	// khoi tao
	static {
		itemGroupService = new ItemGroupService();
	}

	public static void main(String[] args) {
		List<ItemGroup> itemGroupAll = itemGroupService.getAll();
		itemGroupAll.forEach(System.out::println);
		System.out.println("==============");
		List<ItemGroup> itgsById = itemGroupService.getItemGroups(3);
		itgsById.forEach(System.out::println);
		System.out.println("==============");
		List<ItemGroup> itgsByName = itemGroupService.getItemGroups("Áo");
		itgsByName.forEach(System.out::println);
		System.out.println("==============");
		boolean save = itemGroupService.save(new ItemGroup(9, "h"));
		System.out.println(save);
	}

}
