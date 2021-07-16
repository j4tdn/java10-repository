package view;

import java.util.List;

import persistence.Items;
import service.ItemsService;

public class Ex02 {
	private static ItemsService itemsService;
	static {
		itemsService = new ItemsService();
	}

	public static void main(String[] args) {
		System.out.println("2. Liệt kê các mặt hàng theo mã loại và giá bán trung bình từ 100 đến 500 trong hệ thống");
		List<Items> item = itemsService.getAll(2, 100, 500);
		item.forEach(System.out::println);
	}

}
