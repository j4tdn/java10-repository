package exercise;

import java.util.List;
import java.util.stream.Collectors;

import persistence.InventoryDtoTop3;
import service.InventoryService;
import service.InventoryServiceImpl;

public class Ex03 {
	private static InventoryService inventoryService;

	static {
		inventoryService = new InventoryServiceImpl();
	}
	public static void main(String[] args) {
		List<InventoryDtoTop3> itgrtop3= inventoryService.getDtoTop3s();
		List<String> it = itgrtop3.stream().map(InventoryDtoTop3::getName).collect(Collectors.toList());
		show(it);
	}
	private static <E> void show(List<E> elements) {
		elements.forEach(System.out::println);
	}
}
