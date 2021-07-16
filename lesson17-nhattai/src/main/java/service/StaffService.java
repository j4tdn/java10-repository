package service;

import dao.StaffDao;
import persistence.Staff;

public class StaffService {
	private StaffDao staffDao;

	public StaffService() {
		staffDao = new StaffDao();
	}

	public boolean insertStaff(Staff staff) {
		return staffDao.insertStaff(staff);
	}
}
