package exercise;

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
		List<InventoryDto> itgr= inventoryService.getDtos();
		show(itgr);
	}
	private static <E> void show(List<E> elements) {
		elements.forEach(System.out::println);
	}
}
