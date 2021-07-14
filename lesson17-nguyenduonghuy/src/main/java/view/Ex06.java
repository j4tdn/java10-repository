package view;

import dao.OrderDAO;

public class Ex06 {
	public static void main(String[] args) {
		if (OrderDAO.updateTotalMoney(3)) {
			System.out.println(OrderDAO.getById(3));
		}
	}
}
