package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Account Dteail.....!");
		
		Configuration cfg = new Configuration();
		cfg.configure("mapping.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		PersonDetail P1 = new PersonDetail();
		P1.setAadharCardNo(7685432);
		P1.setName("Jaya Gupta");
		
		AccountDetail account1 = new AccountDetail();
		account1.setAccountNo(345687654);
		account1.setBankName("HDFC");
		account1.setBranchName("Indore");
		account1.setPerson_detail(P1);
	   
	    
	    AccountDetail account2 = new AccountDetail();
		account2.setAccountNo(895687654);
		account2.setBankName("SBI");
		account2.setBranchName("Indore");
		account2.setPerson_detail(P1);
	   
	    
	    AccountDetail account3 = new AccountDetail();
		account3.setAccountNo(955687654);
		account3.setBankName("SBI");
		account3.setBranchName("Indore");
		account3.setPerson_detail(P1);

	    
	    List<AccountDetail> list = new ArrayList<AccountDetail>();
	    list.add(account1);
	    list.add(account2);
	    list.add(account3);
	    
	    Session s = factory.openSession();
	    
	    s.save(P1);
	    s.save(account1);
	    s.save(account2);
	    s.save(account3);
	
	    Transaction ts = s.beginTransaction();
	    ts.commit();
	    s.close();
	    System.out.println("DONE....");
	

	}

}
