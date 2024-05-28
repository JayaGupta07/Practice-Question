package com.HibernateBank;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Bank Details......!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("Bank.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        BankDetail Bank = new BankDetail();
        Bank.setBankName("HDFC");
        Bank.setIFSC_Code("HDFC1234");
        Bank.setBranchName("Indore");
      
        EmployeeDetail E1 = new EmployeeDetail();
        E1.setCompany_Name("Railworld India Pvt.Ltd.");
        E1.setEmployee_Name("Jaya Gupta");
        E1.setEmployee_Id("RWI01");
        E1.setDesignation("Software Developer");
        E1.setSalary(30000);
        
       Bank.setEmployeeDetail(E1);
        
        Session session = factory.openSession();
        session.save(Bank);
        
        System.out.println(Bank);
        
        Transaction ts = session.beginTransaction();
        ts.commit();
        session.close();
        }
}
