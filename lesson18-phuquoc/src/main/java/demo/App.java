package demo;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemGroupDto2;
import persistence.ItemGroupDto4;
import persistence.ItemSaleGroup;
import persistence.ItemTop;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class App {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
		
	}
	
	public static void main(String[] args) {	
		
		//cau1
		System.out.println("====================cau1=====================");
		LocalDate localdate = LocalDate.of(2020, 12, 18);
		List<ItemSaleGroup> result1 = itemGroupService.getSaleGroups(localdate);
		result1.forEach(System.out::println);
		
		System.out.println("====================cau2=====================");
		
		//cau2
		List<ItemGroupDto2> result2 = itemGroupService.getDtos();
		result2.forEach(System.out::println);
		
		System.out.println("====================cau3=====================");
		//cau3
		List<ItemTop> result3 = itemGroupService.getItemTop(2020);
		result3.forEach(System.out::println);
		
		System.out.println("======================cau4===================");
		
		//cau3
		List<ItemGroupDto4> result4 = itemGroupService.getDto4s();
		result4.forEach(System.out::println);
	}

}
