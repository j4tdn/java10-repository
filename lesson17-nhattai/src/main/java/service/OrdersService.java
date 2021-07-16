package service;

import dao.OrdersDao;

public class OrdersService {
	private OrdersDao ordersDao;

	public OrdersService() {
		ordersDao = new OrdersDao();
	}

	public boolean updateOrder(int orderId) {
		return ordersDao.updateOrder(orderId);
	}
}
