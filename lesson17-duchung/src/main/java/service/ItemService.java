package service;

import java.sql.Date;
import java.util.List;

import dao.ItemDao;
import persistence.Items;

public class ItemService {
	private ItemDao itemDao;

	public ItemService() {
		itemDao = new ItemDao();
	}

	public List<Items> getAll(int itemGroupId, int saleIn, int saleOut) {
		return itemDao.getAll(itemGroupId, saleIn, saleOut);
	}

	public List<Items> getItems(Date salesDate) {
		return itemDao.getItems(salesDate);
	}
	
	public List<Items> getItemsByIdUsingProcedure (int itemGroupId) {
		return itemDao.getItemsByIdUsingProcedure(itemGroupId);
	}


}
