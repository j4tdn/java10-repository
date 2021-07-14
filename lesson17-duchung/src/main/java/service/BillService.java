package service;

import dao.BillDao;

public class BillService {
	private BillDao billDao;

	public BillService() {
		billDao = new BillDao();
	}

	public double getTotalOfMoney(int orderId) {
		return billDao.getTotalOfMoney(orderId);
	}

	public boolean creatBill(int orderId, double TotalOfMoney) {
		return billDao.creatBill(orderId, TotalOfMoney);
	}

}
