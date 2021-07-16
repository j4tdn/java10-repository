package view;

import service.OrdersService;

public class Ex06 {
	private static OrdersService ordersService;
	static {
		ordersService = new OrdersService();
	}

	public static void main(String[] args) {
		System.out.println("6. Cập nhật tổng tiền cho đơn hàng bất kì thành 999");
		boolean isUpdated = ordersService.updateOrder(2);
		System.out.println(isUpdated);
	}
}
