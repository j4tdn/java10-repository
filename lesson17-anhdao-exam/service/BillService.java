package service;

import java.util.List;

import dao.BillDao;

public class BillService {
	
		private BillDao billDao;
		public BillService() {
			billDao = new BillDao();
		}
		
		public Double getToTalOfMoney( int id) {
			return billDao.getToTalOfMoney(id);
		}
		
		public boolean insertBill(int idBill, int codeOrder, Double TotalOfMoney) {
			return billDao.insertBill(idBill, codeOrder, TotalOfMoney);
		}
		
}

