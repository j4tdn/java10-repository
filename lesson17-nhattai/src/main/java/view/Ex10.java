package view;

import java.util.List;

import persistence.Items;
import service.ItemsService;

public class Ex10 {
	private static ItemsService itemsService;
	static {
		itemsService = new ItemsService();
	}

	public static void main(String[] args) {
		System.out.println("10. Liệt kê các mặt hàng theo mã loại. Sử dụng procedure đã tạo trong Lesson16");
		List<Items> items = itemsService.getItemsByIdUsingProcedure(3);
		items.forEach(System.out::println);
	}
}
