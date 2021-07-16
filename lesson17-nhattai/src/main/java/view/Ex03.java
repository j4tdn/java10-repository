package view;

import java.util.List;

import persistence.Inventory;
import service.InventoryService;

public class Ex03 {
	private static InventoryService inventoryService;
	static {
		inventoryService = new InventoryService();
	}

	public static void main(String[] args) {
		System.out.println("3. Thống kê số lượng hàng tồn kho của mỗi loại hàng \n "
				+ "Fomart: MaLoai, TenLoai, DS[MH:SoLuong], TongSoLuong");
		List<Inventory> e = inventoryService.getAllInventory();
		e.forEach(System.out::println);
	}

}
