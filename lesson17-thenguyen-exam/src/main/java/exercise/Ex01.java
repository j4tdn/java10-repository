package exercise;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemService;

public class Ex01 {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupService();
	
	}
	public static void main(String[] args) {
		System.out.println("1.Liệt kê mặt hàng được bán trong ngày:");
		LocalDate localdate=LocalDate.of(2020,12,18);
		Date date=Date.valueOf(localdate);
		List<ItemGroup> list=itemGroupService.itemGroups(date);
		list.forEach(System.out::println);
	}
}
