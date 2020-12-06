package Exercises;

import java.time.LocalDateTime;

public class ShopDemo {
	public static void main(String[] args) {
		// Initial data for shop
		// Array: stores set of elements with index based
		Item[] items = { new Item("S10+", "Android", "Black", 420), new Item("S20+", "Android", "White", 800),
				new Item("Nokia1200", "Windowphone", "Brown", 120), new Item("IphoneX+", "Apple", "Red", 400), };

		Customer[] customers = { new Customer("1234565", "Phu Quoc", "0912345678", "1 Le Duan - Da Nang"),
				new Customer("09867", "Teo Le", "98674211", "1 Nguyen Luong Bang - Da Nang"), };

		ItemInfo[] firstInfo = { new ItemInfo(items[2], 2) };
		Order first = new Order(customers[0], firstInfo, LocalDateTime.now());
		Orders.exprortBill(first);
		System.out.println();
		System.out.println();
		ItemInfo[] secondInfo = { new ItemInfo(items[3], 3), new ItemInfo(items[1], 1) };
		Order second = new Order(customers[1], secondInfo, LocalDateTime.now());
		Orders.exprortBill(second);

		// ItemInfo: item, quantity
		// ItemDetail: customer, Item[], time

		// 1234565 Nokia1200 - 2 time
		// 1234565 S10+ - 1
		// 09867 IphoneX - 3, S20 -1
	}
}