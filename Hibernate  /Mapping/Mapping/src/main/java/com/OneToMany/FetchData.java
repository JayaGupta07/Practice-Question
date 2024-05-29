package com.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		
		System.out.println("Fetched data....");
		
		Configuration cfg = new Configuration();
		cfg.configure("mapping.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();

		Transaction ts = s.beginTransaction();
		
		PersonDetail P1= (PersonDetail)s.get(PersonDetail.class, 7685432);
	    System.out.println(P1.getAadharCardNo());
	    for(AccountDetail accounts : P1.getAccount_detail()) {
	    	System.out.println(accounts.getAccountNo());
	    }
	    
		ts.commit();
		s.close();
	}

}
