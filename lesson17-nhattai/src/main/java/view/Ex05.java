package view;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.Items;
import service.ItemsService;

public class Ex05 {
	private static ItemsService itemsService;
	static {
		itemsService = new ItemsService();
	}

	public static void main(String[] args) {
		System.out.println("5. Liệt kê các mặt hàng được bán trong ngày bất kì");
		LocalDate localdate = LocalDate.of(2020, 12, 17);
		Date date = Date.valueOf(localdate);
		List<Items> list = itemsService.getItems(date);
		list.forEach(System.out::println);
	}
}
