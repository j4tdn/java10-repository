package demo;

import service.DepartmentService;
import service.impl.DepartmentServiceImpl;

public class SecondLevelCacheDemo {
	private static DepartmentService departmentService;
	
	static {
		departmentService = new DepartmentServiceImpl();
	}
	
	public static void main(String[] args) {
		departmentService.secondLevelCache("mgm-dn");
	}
}
