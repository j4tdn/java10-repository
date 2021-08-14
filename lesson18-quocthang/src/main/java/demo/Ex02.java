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
		List<InventoryDto> itgsByDay = inventoryService.getInventory();
		itgsByDay.forEach(System.out::println);
	}
}
