package demo;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex01 {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("1. Liệt kê các mặt hàng được bán trong ngày bất kì");
		LocalDate localdate = LocalDate.of(2020, 12, 18);
		Date date = Date.valueOf(localdate);
		List<ItemDto> list = itemService.getItemDtos(date);
		list.forEach(System.out::println);
	}
}
