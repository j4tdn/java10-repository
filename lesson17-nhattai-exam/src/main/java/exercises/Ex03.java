package exercises;

import java.util.List;

import service.ItemsService;

public class Ex03 {
	private static ItemsService itemsService;
	static {
		itemsService = new ItemsService();
	}

	public static void main(String[] args) {
		System.out.println("3. Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2020.");
		List<String> list = itemsService.getTop3Item(2020);
		list.forEach(System.out::println);
	}
}
