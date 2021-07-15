package view;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroup2;
import persistence.ItemGroup3;
import service.ItemGroupService;

public class App {
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupService();
	}

	public static void main(String[] args) {
		System.out.println("1===========================");
		List<ItemGroup> itemGroupAll = itemGroupService.getAll();
		itemGroupAll.forEach(System.out::println);
		
		System.out.println("1===========================");
		ItemGroup itgsById = itemGroupService.getItemGroups(3);
		System.out.println(itgsById);;
		
		System.out.println("1===========================");
		
		List<ItemGroup> itgsByName = itemGroupService.getItemGroups("Áo");
		itgsByName.forEach(System.out::println);
		
		System.out.println("1===========================");
		//itemGroupService.save(new ItemGroup(9,"item group 9"));
		
		System.out.println("2===========================");
		List<ItemGroup2> itgsByIdPrice = itemGroupService.getItemGroup2s(1, 100, 500);
		itgsByIdPrice.forEach(System.out::println);
		
		System.out.println("3===========================");
		List<ItemGroup3> inventory = itemGroupService.getItemGroup3s();
		inventory.forEach(System.out::println);
		
		System.out.println("5===========================");
		List<ItemGroup2> itgsByDay = itemGroupService.getItemGroup2ss(LocalDate.of(2020,12,18));
		itgsByDay.forEach(System.out::println);
		
		System.out.println("6===========================");
		itemGroupService.update(1);
		
		System.out.println("7===========================");
		itemGroupService.saveFile();
		
		System.out.println("10===========================");
		List<ItemGroup2> itgsByIdProcedure = itemGroupService.getItemGroup2sss(3);
		itgsByIdProcedure.forEach(System.out::println);

	}

}
