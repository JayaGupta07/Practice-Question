package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Certification Student Details.......!" );
        
        
        Configuration cfg= new Configuration();
        cfg.configure("Detail.cfg.xml");
        
        SessionFactory factory= cfg.buildSessionFactory();
         
        StudentDetail s1 = new StudentDetail();
        s1.setName("Jaya Gupta");
        
        Certification certificate= new Certification();
        certificate.setCourse("HTML5");
        certificate.setDuration("2-Months");
       
        s1.setCertificate(certificate); 
        
        Session session = factory.openSession();
        session.save(s1);
        
        System.out.println(s1);
        
        Transaction ts = session.beginTransaction();
        ts.commit();
        session.close();
        
    }
}
