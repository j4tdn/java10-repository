package view;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.Items;
import service.ItemService;

public class Ex05 {
	private static ItemService itemService;
	// khoi tao
	static {
		itemService = new ItemService();
	}

	public static void main(String[] args) {
		System.out.println("5. Liệt kê các mặt hàng được bán trong ngày bất kì");
		LocalDate localdate = LocalDate.of(2020, 12, 18);
		Date date = java.sql.Date.valueOf(localdate);
		List<Items> e = itemService.getItems(date);
		e.forEach(System.out::println);

	}
}
