package utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import persistence.ItemGroup;

public class HibernateUtils {
	private static SessionFactory sessionFactory;

	private HibernateUtils() {

	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}
	public static SessionFactory getSessionFactoryJava() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			Properties props = new Properties();
			props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			props.put(Environment.URL, "jdbc:mysql://localhost:33066/java10_shopping");
			props.put(Environment.USER, "root");
			props.put(Environment.PASS, "1234");
			props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			props.put(Environment.SHOW_SQL, "true");
			props.put(Environment.FORMAT_SQL, "true");
			
			configuration.setProperties(props);
			
			//scan Enities
			configuration.addAnnotatedClass(ItemGroup.class);
			sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}
}
