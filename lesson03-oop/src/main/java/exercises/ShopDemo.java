package exercises;

import java.time.LocalDateTime;

public class ShopDemo {
	public static void main(String[] args) {
		// Initialize data for shop
		// Array: stores set of elements with index based
		
		Item[] items = {
				new Item("S10+", "Android", "Black", 420),
				new Item("S20+", "Android", "White", 800),
				new Item("Nokia1200", "WindownPhone", "Brown", 100),
				new Item("Iphone8", "IOS", "Red", 400),
		};
	
		Customer[] customers = {
				new Customer("102125", "Le Teo", "0905 123 456", "12 Le Thanh Ton - Da Nang"),
				new Customer("365698", "Le Na", "0905 482 410", "12 Ngo Quyen - Da Nang")
		};
		
		ItemInfo[] firstInfo = {
				new ItemInfo(items[2], 2)
		};
		Order first = new Order(customers[0], firstInfo, LocalDateTime.now());
		Orders.exportBill(first);
		
		System.out.println();
		System.out.println();
		
		ItemInfo[] secondInfo = {
				new ItemInfo(items[3], 3),
				new ItemInfo(items[1], 1)
		};
		Order second = new Order(customers[1], secondInfo, LocalDateTime.now());
		Orders.exportBill(second);
		//ItemInfo: item, quantity
		
		//ItemDetail: customer, ItemInfo[], time
		//102125 Nokia1200 - 2 time
		//102125 S10+ - 1
		//365698 Iphone8 - 3, S20+ - 1
	}
}
