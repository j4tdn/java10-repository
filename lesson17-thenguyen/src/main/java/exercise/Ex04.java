package exercise;

import service.BillService;

public class Ex04 {
	private static BillService billService;

	static {
		billService = new BillService();
	}

	public static void main(String[] args) {
		System.out.println("4. Tạo hóa đơn cho đơn hàng bất kì.");
		double TotalOfMoney = billService.getTotalOfMoney(3);
		boolean save = billService.creatBill(3, TotalOfMoney);
		System.out.println(save);
	}

}