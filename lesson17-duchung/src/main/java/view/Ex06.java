package view;

import service.OrderService;

public class Ex06 {
	private static OrderService donHangService;

	static {
		donHangService = new OrderService();
	}

	public static void main(String[] args) {
		System.out.println("6. Cập nhật tổng tiền cho đơn hàng bất kì thành 999");
		boolean save = donHangService.update(2);
		System.out.println(save);
	}
}
