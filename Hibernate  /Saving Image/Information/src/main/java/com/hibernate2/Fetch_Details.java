package com.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch_Details {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("Info.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee_Info Employee1 = (Employee_Info)session.get(Employee_Info.class, 3);
		
		System.out.println(Employee1);
		
	}

}