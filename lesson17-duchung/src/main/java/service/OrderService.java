package service;

import dao.OrderDao;

public class OrderService {
	private OrderDao donHangDao;

	public OrderService() {
		donHangDao = new OrderDao();
	}

	public boolean update(int idOder) {
		return donHangDao.update(idOder);
	}
}
