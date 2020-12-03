package exercises;

import java.time.LocalDateTime;

public class ShopDemo {
	public static void main(String[] args) {
		// Initial data for shop
		// Array: stores set of elements with index based
		Item[] items = { 
				new Item("S10+", "Androi", "Black", 420), 
				new Item("S20+", "Androi", "White", 800),
				new Item("Nokia1200", "WindowPhone", "Brown", 100), 
				new Item("Iphone8", "IOS", "Red", 400), };

		Customer[] customers = { 
				new Customer("102125", "Le Teo", "0931265366", "12 le thanh ton - da nang"),
				new Customer("365698", "Le Na", "098125364", "88 le thanh ton - da nang"), };

		ItemInfo[] firstInfo = { new ItemInfo(items[2], 2)	};
		Order first = new Order(customers[0], firstInfo, LocalDateTime.now());
		Orders.exportBill(first);
		
		System.out.println();
		System.out.println();
		
		ItemInfo[] secondInfo = {
				new ItemInfo(items[3], 3),
				new ItemInfo(items[1], 1),
				
				};
		Order second = new Order(customers[1], secondInfo, LocalDateTime.now());
		Orders.exportBill(second);
		
		// ItemInfo: item, quantity
		// ItemDetail: customer, ItemInfo[ư, time
		
		// 102125 Nokia1200 - 2
		// 102125 S10+ - 1
		// 365698 Iphone8 - 3, S20+ - 1
	}

}
