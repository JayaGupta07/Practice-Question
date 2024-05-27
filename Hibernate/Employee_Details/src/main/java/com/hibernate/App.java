package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Employee Information Portal" );
        
        Configuration cfg = new Configuration();
        cfg.configure("Info.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        Employee_Detail E1 = new  Employee_Detail();
        E1.setId("RWI01"); 
        E1.setCompany_name("Railwolrd");
        E1.setName("Jaya Gupta");
        E1.setDoB("01");
        E1.setBloodGroup("O-");
        E1.setContact_no("96599869w");
        
    	Session session = factory.openSession();
		
		
		Transaction ts = session.beginTransaction();
		ts.commit();
		session.save(E1);
		session.close();
		factory.close();
        
 
        
 }
}

