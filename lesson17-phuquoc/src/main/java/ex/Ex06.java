package ex;

import service.OrderService;

public class Ex06 {
	private static OrderService orderService = new OrderService();

	public static void main(String[] args) {
		
		System.out.println("6. Cập nhật tổng tiền cho đơn hàng bất kì thành 999");
		boolean save = orderService.update(3);
		System.out.println("Update success: " +save);
	}

}