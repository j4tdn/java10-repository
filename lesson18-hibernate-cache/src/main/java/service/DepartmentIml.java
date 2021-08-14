package service;

import dao.DepartmentDao;
import dao.HibernateDepartmentDao;

public class DepartmentIml implements DepartmentService {
	private DepartmentDao departmentDao;

	public DepartmentIml() {
		departmentDao = new HibernateDepartmentDao();
	}

	public void firstLevelCache() {
		departmentDao.firstLevelCache();
	}

	public void secondLevelCache() {
		departmentDao.secondLevelCache();
	}
}