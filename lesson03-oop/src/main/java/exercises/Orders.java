package exercises;

import java.time.LocalDate;
import java.time.Month;

/**
 * 
 * Helper class for Order 
 *
 */

public class Orders {
	private Orders() {
	}
	public static void exportBill(Order order) {
		System.out.println("Họ tên: " + order.getCustomer().getFullname());
		System.out.println("SDT: " + order.getCustomer().getPhone());
		System.out.println("====================");// itemInfor
		ItemInfo[] itemInfos = order.getItemInfos();
		double totalOfMoney=0;
		for (int i = 0; i < itemInfos.length; i++) {
			ItemInfo itemInfo = itemInfos[i];
			Item item = itemInfo.getItem();

			double cost = item.getCost();
			int quantity = itemInfo.getQuantity();

			// date time => 05.12.2020 & cost > 590
			// minus 10%
			
			if (order.getDatetime().toLocalDate().isEqual(LocalDate.of(2020, Month.DECEMBER, 4)) && cost > 590) {
				totalOfMoney += cost * quantity * 0.9;
			} else {
				totalOfMoney += cost * quantity;
			}
			// UI
			// LOG
			System.out.println(item.getId() + " , " + cost + " , " + quantity);
		}
		order.setTotalOfMoney(totalOfMoney);
		System.out.println("====================");
		System.out.println("Tổng tiền: " + order.getTotalOfMoney());
		System.out.println("Thời gian: " + order.getDatetime());
	}

}
