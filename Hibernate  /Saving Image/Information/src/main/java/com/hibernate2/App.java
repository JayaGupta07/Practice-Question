package com.hibernate2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Employee Information Portal" );
        
        Configuration cfg = new Configuration();
        cfg.configure("Info.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        Employee_Info E1 = new  Employee_Info();
        //E1.setId(1); 
        E1.setCompany_name("Railworld");
        E1.setName("Shubham Tiwari");
        E1.setDoB("21-05-1999");
        E1.setBloodGroup("B+");
        E1.setContact_no("9123456789");
        
        FileInputStream file = new FileInputStream("src/main/java/Image.png");
    	byte[] image =new byte[file.available()];
    	file.read(image);
    	E1.setImage(image);
    	
    	System.out.println(E1);
        
    	Session session = factory.openSession();
    	session.save(E1);
		
    	Transaction ts = session.beginTransaction();
		ts.commit();
		session.close();
		factory.close();
        
 
        
 }
}
