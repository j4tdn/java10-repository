package view;

import dao.StaffDAO;
import entities.Staff;

public class Ex08 {
	public static void main(String[] args) {
		Staff staff = new Staff(6, "Anh Quyen", "quyendeptrai@gmail.com", "Hoa Khanh - Da Nang", "0123456789", "alo123@");
		if (StaffDAO.save(staff)) {
			StaffDAO.getAll().forEach(System.out::println);
		}
	}
}
