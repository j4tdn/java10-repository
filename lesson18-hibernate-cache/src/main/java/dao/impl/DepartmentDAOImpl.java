package dao.impl;

import org.hibernate.Session;

import dao.AbstractHibernateDAO;
import dao.DepartmentDAO;
import persistence.Department;

public class DepartmentDAOImpl extends AbstractHibernateDAO implements DepartmentDAO {

	public void firstLevelCache(String id) {
		// sesion 1
		Session s1 = openSession();
		System.out.println("session1: " + s1);
		Department d1 = s1.get(Department.class, id);
		System.out.println("D1: " + d1);
		
		// session 2
		Session s2 = openSession();
		System.out.println("session2:" + s2);
		Department d2 = s2.get(Department.class, id);
		System.out.println("D2: " + d2);
	}

	public void secondLevelCache(String id) {
		Session s1 = openSession();
		System.out.println("session1: " + s1);
		Department d1 = s1.get(Department.class, id);
		System.out.println("D1: " + d1);
		
		// session 2
		Session s2 = openSession();
		System.out.println("session2:" + s2);
		Department d2 = s2.get(Department.class, id);
		System.out.println("D2: " + d2);
	}

}
