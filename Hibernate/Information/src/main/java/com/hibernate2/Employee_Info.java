package com.hibernate2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name= "Employee_Information")
public class Employee_Info {
	

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="Employee_Id")
	private int id;
	private String company_name;
	
	private String name;
	private String DoB;
	
	private String BloodGroup;
	private String Contact_no;
	
	@Lob
	private byte[] image;
	
	public Employee_Info() {
		super();
	}

	public Employee_Info(int id, String company_name, String name, String doB, String bloodGroup, String contact_no,
			byte[] image) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.name = name;
		DoB = doB;
		BloodGroup = bloodGroup;
		Contact_no = contact_no;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return this.id + ": "+ this.company_name  +": "+ this. name + " :"+ this.DoB
				+ " :" + this. BloodGroup + " :" +this.Contact_no + ":" +this.image ;
		
	}
	
	
	

}