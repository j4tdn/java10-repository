package view;

import persistence.Staff;
import service.StaffService;

public class Ex08 {
	private static StaffService staffService;
	static {
		staffService = new StaffService();
	}

	public static void main(String[] args) {
		System.out.println("8. Thực hiện thêm mới nhân viên bất kì. Với mật khẩu được mã hóa MD5, SHA-256");
		boolean isInserted = staffService.insertStaff(new Staff(7, "Thiện Nhân", "thienNhan@gmail.com",
				"Hoà Khánh Bắc - Liên Chiểu - Đà Nẵng", "0123 456 789", "nhan123"));
		System.out.println(isInserted);
	}
}
