package view;

import dao.OrderDAO;

public class Ex04 {
	public static void main(String[] args) {
		Integer totalMoney = OrderDAO.getTotalMoney(2);
		System.out.println(totalMoney);
		if (OrderDAO.saveTotalMoney(2, totalMoney)) {
			System.out.println(OrderDAO.getById(2));
		}
	}
}
