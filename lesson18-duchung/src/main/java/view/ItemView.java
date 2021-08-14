package view;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto;
import persistence.ItemTop3;
import persistence.ListItemByGroudIdDto;
import service.ItemService;
import service.ItemServiceIml;

public class ItemView {
	private static ItemService itemService;
	static {
		itemService = new ItemServiceIml(); 
	}

	public static void main(String[] args) {
		System.out.println("1. Liệt kê các mặt hàng được bán trong ngày 23-11-2019 kiểu LocalDate.");
		LocalDate salesDate = LocalDate.of(2020, 12, 18);
		List<ItemDto> getALL = itemService.getItemBySalesDate(salesDate);
		getALL.forEach(System.out::println);
		System.out.println("3. Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2020.");
		List<ItemTop3> getItemTop3 = itemService.getItemTop3ByYear(2020);
		getItemTop3.forEach(System.out::println);
		System.out.println("4. Liệt kê danh sách các mặt hàng của mỗi loại hàng");
		List<ListItemByGroudIdDto> ItemByGroudIdDto = itemService.getListItemByGroudIdDto();
		ItemByGroudIdDto.forEach(System.out::println);

	}
}
