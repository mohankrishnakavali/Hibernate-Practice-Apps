package com.dev.user;

/**
 * Hello world!
 *
 */
import java.util.Date;
import org.hibernate.Session;
import com.dev.util.HibernateUtil;
import com.dev.user.DBUser;
 
public class App {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();
		DBUser user = new DBUser();
 
		user.setUserId(102);
		user.setUsername("muni1");
		user.setCreatedBy("mohan1");
		user.setCreatedDate(new Date());
 
		session.save(user);
		session.getTransaction().commit();
		System.out.println("Successfully inserted records...");
	}
}