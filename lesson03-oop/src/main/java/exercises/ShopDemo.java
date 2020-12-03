package exercises;

import java.time.LocalDateTime;

public class ShopDemo {
	public static void main(String[] args) {
		// Initial data for shop
		// Array: stores set of elements with index based
		Item[] items = {
				new Item("S10+", "Android", "Black", 420),
				new Item("S20+", "Android", "Red", 800),
				new Item("Nokia", "WindowPhone", "Gold", 100),
				new Item("Iphone16", "IOS", "Blue", 400),
				
		};
		
		Customer[] customers = {
				new Customer("01763", "TNT Tran", "0123456789", "25 Ngo Thi Nham - DN"),
				new Customer("01682", "Ryze Tran", "015020252", "30 Ngo Van So - DN"),
		};
		
		ItemInfo[] firstInfo = { 
				new ItemInfo(items[2], 2 )
		};
		Order first = new Order(customers[0], firstInfo, LocalDateTime.now());
		Orders.exportBill(first);
		System.out.println();
		System.out.println();
		
		ItemInfo[] secondInfo = {
				new ItemInfo(items[3], 3 ),
				new ItemInfo(items[1], 2 )
		};
		Order second = new Order(customers[1], secondInfo, LocalDateTime.now());
		Orders.exportBill(second);
		
		// ItemInfo : item, quantity
		// ItemDetail: customer, ItemIfo[], time
	}
}
