package service;

import dao.StaffDao;
import persistence.Staff;

public class StaffService {
	private StaffDao staffDao;

	public StaffService() {
		staffDao = new StaffDao();
	}

	public boolean save(Staff staff) {
		return staffDao.save(staff);
	}
}
