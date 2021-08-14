package demo;

import service.DepartmentService;
import service.impl.DepartmentServiceImpl;

public class FirstLevelCacheDemo {
	private static DepartmentService departmentService;
	
	static {
		departmentService = new DepartmentServiceImpl();
	}
	
	public static void main(String[] args) {
		departmentService.firstLevelCache("mgm-dn");
	}
}
