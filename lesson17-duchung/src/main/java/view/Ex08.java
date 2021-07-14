package view;

import persistence.Staff;
import service.StaffService;

public class Ex08 {
	private static StaffService staffService;
	static {
		staffService = new StaffService();
	}

	public static void main(String[] args) {
		boolean save;
		save = staffService.save(new Staff(6, "Tran Hung", "tdhung239@gmail.com", "Sen Thuy - Le Thuy - Quang Binh",
				"0889195753", "hung239"));
		System.out.println(save);

	}
}
