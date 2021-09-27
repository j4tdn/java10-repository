package view;

import java.util.Arrays;
import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;

public class App {
	private static ItemGroupService itemService;
	// khoi tao
	static {
		itemService = new ItemGroupService();
	}

	public static void main(String[] args) {
		List<ItemGroup> itemGroupAll = itemService.getAll();
		itemGroupAll.forEach(System.out::println);
//		System.out.println("==============");
//		List<ItemGroup> itgsById = itemService.getItemGroups(3);
//		itgsById.forEach(System.out::println);
//		System.out.println("==============");
//		// vidu nhap name bang x' or '1=1 => no se show ra het cho minh, day goi la Sql Injection
//		// => using prepareStatement
//		List<ItemGroup> itgsByName = itemService.getItemGroups("Áo");
//		itgsByName.forEach(System.out::println);
//		System.out.println("==============");
//		boolean save = itemService.save(new ItemGroup(9, "h"));
//		System.out.println(save);

		System.out.println("==============");
		List<ItemGroupDto> igById = itemService.getItemGroups();
		igById.forEach(System.out::println);
		System.out.println("==============");
		boolean save = itemService.addBatch(Arrays.asList(new ItemGroup(101, "a"), new ItemGroup(102, "b")));
     	System.out.println(save);

	}

}
