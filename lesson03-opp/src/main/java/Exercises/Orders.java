package Exercises;

import java.time.LocalDate;
import java.time.Month;

/**
 * 
 * Helper class for order
 *
 */

public class Orders {

	private Orders() {

	}

	public static void exprortBill(Order order) {
		System.out.println("Ho ten: " + order.getCustomer().getFullname());
		System.out.println("Sdt : " + order.getCustomer().getPhone());
		System.out.println("============================");
		ItemInfo[] itemInfos = order.getItemInfos();
		double totalOfMoney = 0;
		for (int i = 0; i < itemInfos.length; i++) {
			Exercises.ItemInfo itemInfo = itemInfos[i];
			Item item = itemInfo.getItem();

			double cost = item.getCost();
			int quantity = itemInfo.getQuantity();

			// datetime => 05.12.2020 & cost > 590
			// minus 10%

			if (order.getDateTime().toLocalDate().isEqual(LocalDate.of(2020, Month.DECEMBER, 4)) && cost > 590) {
				totalOfMoney += cost * 0.9 * quantity;
			} else {
				totalOfMoney += cost * quantity;
			}

			// UI
			// LOG
			System.out.println(item.getId() + "     " + cost + "     " + quantity);

		}
		order.setTotalOfMoney(totalOfMoney);
		System.out.println("============================");
		System.out.println("Tong tien: " + order.getTotalOfMoney());
		System.out.println("Thoi gian: " + order.getDateTime());
	}
}
