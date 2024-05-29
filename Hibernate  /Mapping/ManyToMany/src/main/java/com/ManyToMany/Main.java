package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		System.out.println("Project Details");

		Configuration cfg = new Configuration();
		cfg.configure("ManyToMany.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		EmployeeRecord E1 = new EmployeeRecord();
		E1.setEmployee_id(101);
		E1.setEmployee_Name("Jaya Gupta");

		EmployeeRecord E2 = new EmployeeRecord();
		E2.setEmployee_id(102);
		E2.setEmployee_Name("Nidhi Gupta");

		Project P1 = new Project();
		P1.setProject_Id(1);
		P1.setProjectName("E-Commerce Website");

		Project P2 = new Project();
		P2.setProject_Id(2);
		P2.setProjectName("ChatBot");

		List<EmployeeRecord> Emp_List = new ArrayList<>();
		Emp_List.add(E1);
		Emp_List.add(E2);

		List<Project> Pro_List = new ArrayList<>();
		Pro_List.add(P1);
		Pro_List.add(P2);

		E1.setProjects(Pro_List);
		E2.setProjects(Pro_List);
		P1.setEmployees(Emp_List);
		P2.setEmployees(Emp_List);

		Session s = factory.openSession();
		Transaction ts = s.beginTransaction();

		s.save(E1);
		s.save(E2);
		s.save(P1);
		s.save(P2);

		ts.commit();
		s.close();

		factory.close();
	}
}
