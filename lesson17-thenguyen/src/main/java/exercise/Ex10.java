package exercise;

import java.util.List;

import persistence.Items;
import service.ItemService;

public class Ex10 {
	private static ItemService itemService;
	static {
		itemService = new ItemService();
	}

	public static void main(String[] args) {
		System.out.println("10. Liệt kê các mặt hàng theo mã loại. Sử dụng procedure đã tạo trong Lesson16");
		List<Items> item = itemService.getItemsByIdUsingProcedure(3);
		item.forEach(System.out::println);

	}

}
