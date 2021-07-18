package exercises;

import java.util.List;

import persistence.Inventory;
import service.InventoryService;

public class Ex02 {
	private static InventoryService inventoryService;
	static {
		inventoryService = new InventoryService();
	}

	public static void main(String[] args) {
		System.out.println("2. Thống kê số lượng mặt hàng tồn kho của mỗi loại hàng.");
		List<Inventory> list = inventoryService.getItems();
		list.forEach(System.out::println);
	}
}
