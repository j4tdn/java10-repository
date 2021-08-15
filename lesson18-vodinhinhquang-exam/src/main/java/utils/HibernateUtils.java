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

	// read from hibernate.cfg.xml file ~ use <property>
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}

	public static SessionFactory getSessionFactoryJava() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			Properties props = new Properties();
			props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			props.put(Environment.URL, "jdbc:mysql://localhost:3306/java10_shopping");
			props.put(Environment.USER, "springstudent");
			props.put(Environment.PASS, "springstudent");
			props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			props.put(Environment.SHOW_SQL, "true");
			props.put(Environment.FORMAT_SQL, "true");
			props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

			// scan entities
			cfg.addAnnotatedClass(ItemGroup.class);

			sessionFactory = cfg.setProperties(props).buildSessionFactory();
		}
		return sessionFactory;
	}

}
