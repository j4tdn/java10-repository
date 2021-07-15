package service;

import dao.OrderDao;

public class OrderService {
	private OrderDao OrderDao = new OrderDao();

	public boolean update(int idOder) {
		return OrderDao.updateTotalPrice(idOder);
	}
}