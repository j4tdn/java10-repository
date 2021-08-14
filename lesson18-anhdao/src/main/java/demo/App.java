package demo;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDate;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import persistence.ItemSizeDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	private static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
//        //Câu 1:
		List<ItemDate> itdates = itemService.getItemDate(LocalDate.of(2019, 11, 23));
		itdates.forEach(System.out::println);
		// Câu 2:
		List<ItemGroupDto> itemGrp = itemGroupService.getAll();
		itemGrp.forEach(System.out::println);
	
		//Câu 3:
		List<String> itsBestSeller = itemService.getItemBestSeller(2020, 3);
		itsBestSeller.forEach(System.out::println);
		
		//Câu 4:
		List<ItemSizeDto> itsbysize = itemService.getItemByGroup();
		itsbysize.forEach(System.out::println);

	}

}
