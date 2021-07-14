package view;

import java.util.List;

import persistence.Items;
import service.ItemService;

public class Ex02 {
	private static ItemService itemService;
	// khoi tao
	static {
		itemService = new ItemService();
	}

	public static void main(String[] args) {
		System.out.println("2. Liệt kê các mặt hàng theo mã loại và giá bán trung bình từ 100 đến 500 trong hệ thống");
		List<Items> item = itemService.getAll(1, 100, 500);
		item.forEach(System.out::println);
	}

}
