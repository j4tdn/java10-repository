package exercises;

import java.time.LocalDateTime;

public class ShopDemo {
	public static void main(String[] args) {
		// initial data for shop
		// Array: stores set of elements with index based
		Item[] items = {
				new Item("s10+", "Android", "Black", 420),
				new Item("s20+", "Android", "White", 800),
				new Item("Nokia1200", "Android", "Brown", 100),
				new Item("Iphone8", "Ios", "Red", 400), };
		Customer[] customers = { 
				new Customer("102125", "Le Teo", "018028397", "12 Le Thanh Ton - Da Nang"),
				new Customer("365698", "Le Na", "089237927", "88 Dang Dung - Da Nang"), };
		ItemInfo[] firstInfo = { new ItemInfo(items[2], 2) };
		Order first = new Order(customers[0], firstInfo, LocalDateTime.now());
		Orders.exportBill(first);
		ItemInfo[] secondInfo = { new ItemInfo(items[3], 3), new ItemInfo(items[1], 1)};
		Order second = new Order(customers[1], secondInfo, LocalDateTime.now());
		Orders.exportBill(second);
	}
}
