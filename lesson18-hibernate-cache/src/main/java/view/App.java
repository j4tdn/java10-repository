package view;

import service.DepartmentIml;
import service.DepartmentService;

public class App {
	private static DepartmentService departmentService;
	static {
		departmentService = new DepartmentIml();
	}

	public static void main(String[] args) {
		//departmentService.firstLevelCache();
		departmentService.secondLevelCache();
	}
	
}

