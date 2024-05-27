package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "Employee_Information")
public class Employee_Detail {
	

	private String id;
	private String company_name;
	private String name;
	private String DoB;
	private String BloodGroup;
	private String Contact_no;
	
	public Employee_Detail(String company_name, String id, String name, String doB, String bloodGroup,
			String contact_no) {
		super();
		this.company_name = company_name;
		this.id = id;
		this.name = name;
	this.	DoB = doB;
		this.BloodGroup = bloodGroup;
		this.Contact_no = contact_no;
	}

	public Employee_Detail() {
		// TODO Auto-generated constructor stub
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoB() {
		return DoB;
	}

	public void setDoB(String doB) {
		DoB = doB;
	}

	public String getBloodGroup() {
		return BloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}

	public String getContact_no() {
		return Contact_no;
	}

	public void setContact_no(String contact_no) {
		Contact_no = contact_no;
	}

	@Override
	public String toString() {
		return "Employee_Info [company_name=" + company_name + ", id=" + id + ", name=" + name + ", DoB=" + DoB
				+ ", BloodGroup=" + BloodGroup + ", Contact_no=" + Contact_no + "]";
	}
	
	

}