 package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "One to One Mapping.....!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("mapping.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        Railworld railworld = new Railworld();
        railworld.setEmployee_id(101);
        railworld.setCompany_name("Railworld india pvt. ltd.");
        railworld.setBranch("Indore");
        
        Employee E1 = new Employee();
        E1.setName("Jaya Gupta");
        E1.setDesignation("Software Developer");
        
        railworld.setEmployee(E1);
        
        Session S = factory.openSession();
        S.save(railworld);
        S.save(E1);
        
        Transaction ts = S.beginTransaction();
        
        ts.commit();
        
        S.close();
    }
}
