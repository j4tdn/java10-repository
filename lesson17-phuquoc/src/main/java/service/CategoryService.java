package service;

import dao.CategoryDao;
import persistence.MatHang;

public class CategoryService {
	private CategoryDao categoryDao = new CategoryDao();

	public boolean insertData() {
		return categoryDao.insertData();
	}
	
	public MatHang getId(int itemId) {
		return categoryDao.getId(itemId);
	}
}
