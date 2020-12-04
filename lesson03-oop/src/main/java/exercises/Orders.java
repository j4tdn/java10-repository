package exercises;

import java.time.LocalDate;
import java.time.Month;

/**
 * Helper class for Order
 */
public class Orders {
	private Orders() {
	}

	public static void exportBill(Order order) {
		System.out.println("Full name: " + order.getCustomer().getFullName());
		System.out.println("Phone Number: " + order.getCustomer().getPhoneNumber());
		ItemInfo[] itemInfos = order.getItemInfos();
		double totalOfMoney = 0;
		for (ItemInfo itemInfo : itemInfos) {
			Item item = itemInfo.getItems();

			double cost = item.getPrice();
			int quantity = itemInfo.getQuantity();

			// dateTime == 05/12/2020 & cost > 590
			// minus 10%
			if (order.getDateTime().toLocalDate().isEqual(LocalDate.of(2020, Month.DECEMBER, 4)) && cost >= 15000) {
				totalOfMoney += cost * quantity * 0.9;
			} else {
				totalOfMoney += cost * quantity;
			}
			System.out.println("Item name: " + item.getId() + " - Quantity: " + quantity + " - Unit price: " + cost); 
		}
		order.setTotalOfMoney(totalOfMoney);
		System.out.println("Total bill: " + order.getTotalOfMoney());
		System.out.println(order.getDateTime());
		System.out.println("===================================");
	}
}