package service;


import dao.OrderDao;

public class OrderService {
	private OrderDao orderDao;

	public OrderService() {
		orderDao = new OrderDao();
	}
		
	public boolean UpDateMoney(double totalOfMoney, int idOrder) { 
		return orderDao.UpDateMoney( totalOfMoney,  idOrder) ;
	}
}
