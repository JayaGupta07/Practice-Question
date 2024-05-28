package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started....!");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Student s1 = new Student();
		s1.setName("Jaya");

		Info email = new Info();

		email.setEmail("jaya@gmail.com");

		Session session = factory.openSession();
		session.save(s1);
		session.save(email);
		Transaction ts = session.beginTransaction();

		ts.commit();
		session.close();
		factory.close();

	}
}
