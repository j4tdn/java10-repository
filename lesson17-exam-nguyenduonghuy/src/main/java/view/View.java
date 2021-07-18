package view;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto;
import persistence.ItemDtoFullInfo;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemService;

public class View {
	private static ItemService itemService;
	private static ItemGroupService itemGroupService;
	
	static {
		itemService = new ItemService();
		itemGroupService = new ItemGroupService();
	}
	
	public static void main(String[] args) {
		// Ex01
		List<ItemDto> ex01 = itemService.get(LocalDate.parse("2020-12-18"));
		ex01.forEach(System.out::println);
		System.out.println("----------------------------");
		
		// Ex02
		List<ItemGroupDto> ex02 = itemGroupService.getAllItemGroupDto();
		ex02.forEach(System.out::println);
		System.out.println("----------------------------");
		
		// Ex03
		List<String> ex03 = itemService.getTop3Item(2020);
		ex03.forEach(System.out::println);
		System.out.println("----------------------------");
		
		// Ex04
		List<ItemDtoFullInfo> ex04 = itemService.getFullInfo();
		ex04.forEach(System.out::println);
	}
}
