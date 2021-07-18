package exercise;

import java.util.List;

import persistence.Items;
import persistence.ListItems;
import service.ItemService;
import service.ListItemService;

public class Ex04 {
	private static ListItemService listItemService;
	static {
		listItemService = new ListItemService();
	}
	public static void main(String[] args) {
		System.out.println("4.Liệt kê danh sách các mặt hàng của mỗi loại hàng.\n");
		System.out.println("-------------------------------");
		List<ListItems> ListItem = listItemService.getListItems();
		ListItem.forEach(System.out::println);
}
}
