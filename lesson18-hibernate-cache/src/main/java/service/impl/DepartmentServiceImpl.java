package service.impl;

import dao.DepartmentDAO;
import dao.impl.DepartmentDAOImpl;
import service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService{
	
	private DepartmentDAO departmentDAO;
	
	public DepartmentServiceImpl() {
		departmentDAO = new DepartmentDAOImpl();
	}

	public void firstLevelCache(String id) {
		departmentDAO.firstLevelCache(id);
	}

	public void secondLevelCache(String id) {
		departmentDAO.secondLevelCache(id);
	}

}
