package exercises;

import java.time.LocalDateTime;

public class ShopDemo {
	public static void main(String[] args) {
		Item[] items = { new Item("S10+", "Android", Color.BLACK, 15000), new Item("Ip11", "IOS", Color.GOLD, 25000),
				new Item("Nokia1200", "WindownPhone", Color.PINK, 500), new Item("Note10", "Android", Color.RED, 20000),
				new Item("S20+", "Android", Color.BLUE, 23000) };

		Customer[] customers = {
				new Customer("16091999", "Dang Cong Khai Thu", "0388476069", "136 - Nguyen Luong Bang"),
				new Customer("24051999", "Nguyen Thi Anh Thu", "0987993270", "54 - Ha Van Tinh"), };

		// 201801 - Ip11 - 2times
		// 201812 - Nokia1200 - 1
		// 201813 - S20+ - 1 + Ip11 - 2

		// 1
		ItemInfo[] firstInfo = { new ItemInfo(items[1], 2) };
		Order first = new Order(customers[0], firstInfo, LocalDateTime.now());
		Orders.exportBill(first);

		// 2
		ItemInfo[] secondInfo = { new ItemInfo(items[2], 1) };
		Order second = new Order(customers[1], secondInfo, LocalDateTime.now());
		Orders.exportBill(second);

		// 3
		ItemInfo[] thirdInfo = { new ItemInfo(items[4], 3), new ItemInfo(items[1], 1) };
		Order third = new Order(customers[2], thirdInfo, LocalDateTime.now());
		Orders.exportBill(third);
	}
}
