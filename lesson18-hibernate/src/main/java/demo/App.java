package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import utils.HibernateUtils;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		System.out.println(sessionFactory);
		
		Session session1 = sessionFactory.openSession();
		System.out.println("s1: " + session1);
		
		Session session2 = sessionFactory.openSession();
		System.out.println("s2: " + session2);
	}
}
