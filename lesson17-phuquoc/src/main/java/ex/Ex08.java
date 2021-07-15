package ex;

import dao.StaffDao;
import persistence.Staff;

public class Ex08 {
	private static StaffDao staffDao = new StaffDao();

	public static void main(String[] args) {
		
		System.out.println("8. thêm mới nhân viên bất kì. Với mật khẩu được mã hóa MD5, SHA-256");
		boolean save = staffDao.save(new Staff(7, "Phu Quoc1", "Quocduongphu1@gmail.com", "DuyXuyen - Quang-Nam", "0916904140", "Quocvippro1231"));
		System.out.println("Insert success: " +save);
	}

}