package view;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.ItemGroup;
import persistence.Items;
import persistence.ListItem;
import service.ItemGroupService;

public class App {
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupService();
	}

	public static void main(String[] args) {
		System.out.println("1. Liệt kê mặt hàng được bán trong ngày");
		LocalDate localdate = LocalDate.of(2020, 12, 18);
		Date date = Date.valueOf(localdate);
		List<ItemGroup> list = itemGroupService.itemGroups(date);
		list.forEach(System.out::println);

		System.out.println("\n==============================\n");
		
		System.out.println("2. Thống kê số lượng mặt hàng tồn kho của mỗi loại hàng");
		List<Items> itemGroup = itemGroupService.getItems();
		itemGroup.forEach(System.out::println);
		
		System.out.println("\n==============================\n");
		
		System.out.println("4. Liệt kê danh sách các mặt hàng của mỗi loại hàng");
		List<ListItem> listItems = itemGroupService.getListItem();
		listItems.forEach(System.out::println);
		
		System.out.println("\n==============================\n");
		
		System.out.println("3. Top 3 mặt hàng được bán nhiều nhất 2020");
		List<String> item = itemGroupService.getItem();
		item.forEach(System.out::println);
		
		
	}

}
