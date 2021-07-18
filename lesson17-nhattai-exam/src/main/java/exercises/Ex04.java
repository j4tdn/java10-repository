package exercises;

import java.util.List;

import persistence.ListItems;
import service.ListItemsService;

public class Ex04 {
	private static ListItemsService listItemsService;
	static {
		listItemsService = new ListItemsService();
	}

	public static void main(String[] args) {
		System.out.println("4. Liệt kê danh sách các mặt hàng của mỗi loại hàng.");
		List<ListItems> list = listItemsService.getListItems();
		list.forEach(System.out::println);
	}
}
