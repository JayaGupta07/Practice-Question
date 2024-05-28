package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started....!" );
         
        
       Configuration cfg = new Configuration(); 
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
        
       
       Student s1 = new Student();
       s1.setName("Jaya");
       
       Address Add = new Address();
       Add.setAddress("Indore");
       
       Session session = factory.openSession();
       Transaction ts = session.beginTransaction();
        
       ts.commit();
       session.close();
       factory.close();
    		   
    		   
}

}
 