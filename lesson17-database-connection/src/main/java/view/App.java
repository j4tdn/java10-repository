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
		List<ItemGroup> list = itemGroupService.getAll();
		list.forEach(System.out::println);
		
		System.out.println("-----------------");
		
		List<ItemGroupDto> data = itemGroupService.getItemGroups();
		data.forEach(System.out::println);
		
		System.out.println("-----------------");
		
		
		List<ItemGroup> itemGroups =  Arrays.asList(new ItemGroup(9, "Đồng hồ"),
						new ItemGroup(10, "Nhẫn"));
		itemGroupService.addBatch(itemGroups);
	}
}	
