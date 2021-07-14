package view;

import service.BillService;

public class Ex04 {
	private static BillService billService;

	static {
		billService = new BillService();
	}

	public static void main(String[] args) {
		System.out.println("4. Tạo hóa đơn cho đơn hàng bất kì.");
		Integer orderId = 2;
		double TotalOfMoney = billService.getTotalOfMoney(orderId);
		boolean save = billService.creatBill(orderId, TotalOfMoney);
		System.out.println(save);
	}

}
