package demo;

import java.util.List;

import persistence.InventoryDto;
import service.InventoryService;
import service.InventoryServiceImpl;

public class Ex02 {
	private static InventoryService inventoryService;
	static {
		inventoryService = new InventoryServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("2. Thống kê số lượng mặt hàng tồn kho của mỗi loại hàng.");
		List<InventoryDto> list = inventoryService.getItems();
		list.forEach(System.out::println);
	}
}
