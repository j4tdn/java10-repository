package exercise;

import java.util.List;

import persistence.Items;
import service.ItemService;

public class Ex02 {
	private static ItemService itemService;
	static {
		itemService=new ItemService();
	}
	public static void main(String[] args) {
		System.out.println("2. Thống kê số lượng mặt hàng tồn kho của mỗi loại hàng\n");
		System.out.println("-------------------------------");
		List<Items> itemGroup = itemService.getItems();
		itemGroup.forEach(System.out::println);
}
}
