package exercises;

import java.time.LocalDate;
import java.time.Month;

public class Orders {
	private Orders() {
		
	}
	public static void exportBill(Order order) {
		System.out.println("Họ tên:" + order.getCustomer().getFullname());
		System.out.println("SĐT:" + order.getCustomer().getPhone());
		System.out.println("================================");//itemInfos
		ItemInfo[] itemInfos = order.getItemInfos();
		double totalOfMoney=0;
		for(int i =0; i<itemInfos.length;i++) {
			ItemInfo itemInfo = itemInfos[i];
			Item item = itemInfo.getItem();
			double cost=item.getCost();
			int quanlity =itemInfo.getQuanlity();
			
			if(order.getDateTime().toLocalDate().isEqual(LocalDate.of(2020,Month.DECEMBER,4))&&cost>590) {
				totalOfMoney+=cost*0.9*quanlity;
			}
			else {
				totalOfMoney+=cost*quanlity;
			}
			System.out.println(item.getId()+"	"+cost+"	"+quanlity);
		}
		order.setTotalOfMoney(totalOfMoney);
		System.out.println("================================");
		System.out.println("Tổng tiền: "+order.getTotalOfMoney());
		System.out.println("Thời gian: "+order.getDateTime());
	}

}
