package exercises;

import java.time.LocalDate;
import java.time.Month;

/**
 * 
 * Helper class for order
 *
 */

public class Orders {
	public Orders() {
	}
	

	public static void exportBill(Order order) {
		System.out.println("Họ tên: " + order.getCustomer().getFullname());
		System.out.println("SĐT: " + order.getCustomer().getPhone());
		System.out.println("================================");
		ItemInfo[] itemInfos = order.getIteminfos();
		double totalOfMoney = 0;
		for (int i = 0; i < itemInfos.length; i++) {
			exercises.ItemInfo itemInfo = itemInfos[i];
			Item item = itemInfo.getItem();

			double cost = item.getCost();
			int quantity = itemInfo.getQuantity();

			// datetime => 05.12.2020 & cost > 590
			// minus 10%

			if (order.getDateTime().toLocalDate().isEqual(LocalDate.of(2020, Month.DECEMBER, 4)) && cost > 590) {
				totalOfMoney += cost * quantity * 0.9;
			} else {
				totalOfMoney += cost * quantity;
			}

			System.out.println(item.getId() + "   " + item.getCost() + "   " + itemInfo.getQuantity());

		}
		order.setTotalOfMoney(totalOfMoney);

		System.out.println("================================");
		System.out.println("Tổng tiền: " + order.getTotalOfMoney());
		System.out.println("Thời gian: " + order.getDateTime());
	}
}
