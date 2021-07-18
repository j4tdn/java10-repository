package view;

import java.time.LocalDate;
import java.util.List;

import persistence.CategoryGroup;
import persistence.ItemGroup;
import persistence.ItemSaleGroup;
import persistence.ItemTop;
import service.ItemGroupService;

public class App {

	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupService();
	}

	public static void main(String[] args) {
		// 1
//		LocalTime localTime = LocalTime.of(2020, 12, 18);
		LocalDate date = LocalDate.of(2020, 12, 18);
		List<ItemSaleGroup> getItemSale = itemGroupService.getItemSale((date));
		getItemSale.forEach(System.out::println);
		
		System.out.println("==============================");
		
		
		// 2
		List<CategoryGroup> getToTalCategorys = itemGroupService.getToTalCategorys();
		getToTalCategorys.forEach(System.out::println);

		System.out.println("==============================");
		
		
		//3
		List<ItemTop> getTopItemInYear = itemGroupService.getTopItemInYear();
		getTopItemInYear.forEach(System.out::println);	
		

		System.out.println("==============================");
		
		
		//4
		List<ItemGroup> getAllItems = itemGroupService.getAllItems();
		getAllItems.forEach(System.out::println);	
		
	}

}
