package exercises;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.Items;
import service.ItemsService;

public class Ex01 {
	private static ItemsService itemsService;
	static {
		itemsService = new ItemsService();
	}
	public static void main(String[] args) {
		System.out.println("1. Liệt kê các mặt hàng được bán trong ngày bất kì");
		// GOOD. Hoặc em có thể tạo 1 hàm trong DateUtils để convert từ LocalDate sang java.sql.Date
		// để check thêm NULL này kia
		LocalDate localdate = LocalDate.of(2020, 12, 18);
		Date date = Date.valueOf(localdate);
		List<Items> list = itemsService.getItems(date);
		list.forEach(System.out::println);
	}
}
