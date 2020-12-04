package exercises;

import java.time.LocalDateTime;

public class ShopDemo {
	public static void main(String[] args) {
		// initial data for shop
		// array: stores set of element with index based
		Item[] items = {
				new Item("S10+", "Adroid", "Black", 420), 
				new Item("S20+", "Adroid", "White", 800),
				new Item("Nokia1200", "WindowPhone", "Brown", 100),
				new Item("Iphone8", "IOS", "Red", 400) };
	

	Customer[] customers = {
			new Customer("102125", "Le Teo", "0931265366 ", "12 Le Thanh Ton - Da Nang"),
			new Customer("365698", "Le Na", "0905029541 ", "88 Dang Dung - Da Nang") 
	};
	
	ItemInfo[] firstInfo = { new ItemInfo(items[2], 2) };
	Order first = new Order(customers[0], firstInfo, LocalDateTime.now());
	Orders.exportBill(first);
	
	System.out.println();
	System.out.println();
	
	ItemInfo[] secondInfo = { 
			new ItemInfo(items[3], 3),
			new ItemInfo(items[1],1)};
	Order second = new Order(customers[1], secondInfo, LocalDateTime.now()); 
	Orders.exportBill(second);
	// ItemInfor : item,quantity
	// ItemDetail: customer, ItemIf[], time
	// 102125 - Nokia1200 -2 time
	// 102125 - S10+ - 1
	// 365698 Iphone
	}
}
