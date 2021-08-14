package dao;

import java.util.concurrent.TimeUnit;

import org.hibernate.Session;

import persistence.Department;

public class HibernateDepartmentDao extends AbstractHibernateDao implements DepartmentDao {

	public void firstLevelCache() {
		Session session1 = openSession();
		Session session2 = openSession();

		Department d1 = session1.get(Department.class, "mgm-dn"); // YES LOAD DATA
		System.out.println("d1: " + d1);
		// d1 >> persistent object >> 1st cache >> of sesson 1

		System.out.println("d1s1 contains :" + session1.contains(d1));
		System.out.println("d2s2 contains :" + session2.contains(d1));

		System.out.println("===== clear/evict =======");
		session1.clear();

		System.out.println("d1s1 contains :" + session1.contains(d1));
		System.out.println("d2s2 contains :" + session2.contains(d1));

		// another session
		Department d2 = session1.get(Department.class, "mgm-dn");// NO LOAD DATA // after clear s1 then d2 YES Load data
		System.out.println("d2: " + d2);

		Department d3 = session1.get(Department.class, "mgm-mu");// YES LOAD DATA
		System.out.println("d3: " + d3);

		Department d4 = session2.get(Department.class, "mgm-mu");// YES LOAD DATA
		System.out.println("d4: " + d4);

	}

	public void secondLevelCache() {
		Session session1 = openSession();
		Session session2 = openSession();
		//db
		Department d1 = session1.get(Department.class, "mgm-dn");
		System.out.println("d1: " + d1);
		//1st
		Department d2 = session1.get(Department.class, "mgm-dn");
		System.out.println("d2: " + d2);
		//db
		Department d3 = session1.get(Department.class, "mgm-mu");
		System.out.println("d3: " + d3);
		// 2nd
		sleep(4);

		Department d4 = session2.get(Department.class, "mgm-mu");
		System.out.println("d4: " + d4);

	}
	
	private static void sleep(int time) {
		 try {
			TimeUnit.SECONDS.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
