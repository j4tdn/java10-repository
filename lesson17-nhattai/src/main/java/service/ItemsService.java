package service;

import java.sql.Date;
import java.util.List;

import dao.ItemsDao;
import persistence.Items;

public class ItemsService {
	private ItemsDao itemsDao;

	public ItemsService() {
		itemsDao = new ItemsDao();
	}

	public List<Items> getAll(int itemGroupId, int saleIn, int saleOut) {
		return itemsDao.getAll(itemGroupId, saleIn, saleOut);
	}

	public List<Items> getItems(Date doSale) {
		return itemsDao.getItems(doSale);
	}

	public List<Items> getItemsByIdUsingProcedure(int itemGroupId) {
		return itemsDao.getItemsByIdUsingProcedure(itemGroupId);
	}
}
